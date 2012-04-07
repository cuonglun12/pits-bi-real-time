package pe.com.j2techcon.bi.etl.process.control;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.com.j2techcon.bi.etl.domain.control.TProceso;
import pe.com.j2techcon.bi.etl.domain.control.TProcesoDetalle;
import pe.com.j2techcon.bi.etl.domain.control.TProcesoDetalleExample;
import pe.com.j2techcon.bi.etl.domain.control.TProcesoExample;
import pe.com.j2techcon.bi.etl.logic.control.TProcesoDetalleManager;
import pe.com.j2techcon.bi.etl.logic.control.TProcesoManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.util.Util;

public class TProcesoProcess {
	
	private BeanFactory factory;
	
	private int sizePage;
	
	private String typeProcess;
	
	private TProceso tProceso;
	private TProcesoDetalle tProcesoDetalle;
	
	private TProcesoExample tProcesoExample;
	private TProcesoDetalleExample tProcesoDetalleExample;
	
	
	private TProcesoManager tProcesoManager;
	private TProcesoDetalleManager tProcesoDetalleManager;
	
	private Constantes constantes;
	
	List<String> statesProceso;

	public BeanFactory getFactory() {
		return factory;
	}

	public void setFactory(BeanFactory factory) {
		this.factory = factory;
	}

	public int getSizePage() {
		return sizePage;
	}

	public void setSizePage(int sizePage) {
		this.sizePage = sizePage;
	}

	public String getTypeProcess() {
		return typeProcess;
	}

	public void setTypeProcess(String typeProcess) {
		this.typeProcess = typeProcess;
	}

	public TProceso gettProceso() {
		return tProceso;
	}

	public void settProceso(TProceso tProceso) {
		this.tProceso = tProceso;
	}

	public TProcesoDetalle gettProcesoDetalle() {
		return tProcesoDetalle;
	}

	public void settProcesoDetalle(TProcesoDetalle tProcesoDetalle) {
		this.tProcesoDetalle = tProcesoDetalle;
	}

	public TProcesoExample gettProcesoExample() {
		return tProcesoExample;
	}

	public void settProcesoExample(TProcesoExample tProcesoExample) {
		this.tProcesoExample = tProcesoExample;
	}

	public TProcesoDetalleExample gettProcesoDetalleExample() {
		return tProcesoDetalleExample;
	}

	public void settProcesoDetalleExample(
			TProcesoDetalleExample tProcesoDetalleExample) {
		this.tProcesoDetalleExample = tProcesoDetalleExample;
	}

	public TProcesoManager gettProcesoManager() {
		return tProcesoManager;
	}

	public void settProcesoManager(TProcesoManager tProcesoManager) {
		this.tProcesoManager = tProcesoManager;
	}

	public TProcesoDetalleManager gettProcesoDetalleManager() {
		return tProcesoDetalleManager;
	}

	public void settProcesoDetalleManager(
			TProcesoDetalleManager tProcesoDetalleManager) {
		this.tProcesoDetalleManager = tProcesoDetalleManager;
	}

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public List<String> getStatesProceso() {
		return statesProceso;
	}

	public void setStatesProceso(List<String> statesProceso) {
		this.statesProceso = statesProceso;
	}

	public void start(){
		
		factory = new ClassPathXmlApplicationContext("application-context.xml");
		sizePage = constantes.getSizePage();
		typeProcess = constantes.getTypeProcessSimple();
		
		tProcesoManager = factory.getBean("tProcesoManager", TProcesoManager.class);
		tProcesoDetalleManager = factory.getBean("tProcesoDetalleManager", TProcesoDetalleManager.class);
		
		if(getLastProcess().getProcId()!=null){
			if(tProceso.getProcEst().equals(constantes.getStateProcessStarted())){
				if(isTheFirstProcess(tProceso.getProcId(), constantes.getLoadProcessToGeneric()) || isTheFirstProcess(tProceso.getProcId(), constantes.getLoadProcessToDimensional())){
					if(getHoursAfterStartProcess(tProceso)>constantes.getMaxHoursFirstProcess()){
						cancelProcess(tProceso.getProcId());
					}else{
						System.exit(0);
					}
				} else{
					if(getHoursAfterStartProcess(tProceso)>constantes.getMaxHoursProcess()){
						cancelProcess(tProceso.getProcId());
					}else{
						System.exit(0);
					}
				}
			}
			if(tProceso.getProcEst().equals(constantes.getStateProcessCompletedCorrectly()) || tProceso.getProcEst().equals(constantes.getStateProcessCompletedErrors())){
				if(tProceso.getProcTip().equals(constantes.getLoadProcessToGeneric())){
					startProcess(constantes.getLoadProcessToDimensional());
				}
				if(tProceso.getProcTip().equals(constantes.getLoadProcessToDimensional())){
					startProcess(constantes.getLoadProcessToGeneric());
				}
			}
			if(tProceso.getProcEst().equals(constantes.getStateProcessCanceled())){
				if(tProceso.getProcTip().equals(constantes.getLoadProcessToGeneric())){
					startProcess(constantes.getLoadProcessToGeneric());
				}
				if(tProceso.getProcTip().equals(constantes.getLoadProcessToDimensional())){
					startProcess(constantes.getLoadProcessToDimensional());
				}
				typeProcess = constantes.getTypeProcessReProcess();
			}
		}else{
			startProcess(constantes.getLoadProcessToGeneric());
		}
		
	}
	
	public TProceso getLastStartedProcess(){
		
		statesProceso.clear(); 
		statesProceso.add(constantes.getStateProcessStarted());
		
		tProcesoExample.clear();
		tProcesoExample.createCriteria().andProcEstIn(statesProceso);
		tProcesoExample.setOrderByClause("proc_id desc");
		
		try{
		tProceso = tProcesoManager.selectByExample(tProcesoExample).get(0);
		}catch(IndexOutOfBoundsException e){
			tProceso.clear();
		}
		return tProceso;
	}
	
	public TProceso getLastCompletedProcess(){
		
		statesProceso.clear(); 
		statesProceso.add(constantes.getStateProcessCompletedCorrectly());
		statesProceso.add(constantes.getStateProcessCompletedErrors());
		
		tProcesoExample.clear();
		tProcesoExample.createCriteria().andProcEstIn(statesProceso);
		tProcesoExample.setOrderByClause("proc_id desc");
		
		try{
		tProceso = tProcesoManager.selectByExample(tProcesoExample).get(0);
		}catch(IndexOutOfBoundsException e){
			tProceso.clear();
		}
		return tProceso;
	}
	
	public TProceso getLastProcess(){

		tProcesoExample.clear();
		tProcesoExample.setOrderByClause("proc_id desc");
		
		try{
		tProceso = tProcesoManager.selectByExample(tProcesoExample).get(0);
		}catch(IndexOutOfBoundsException e){
			tProceso.clear();
		}
		return tProceso;
	}
	
	public boolean isTheFirstProcess(int idProcess, String typeLoadProcess){

		statesProceso.clear(); 
		statesProceso.add(constantes.getStateProcessCompletedCorrectly());
		statesProceso.add(constantes.getStateProcessCompletedErrors());
		
		tProcesoExample.clear();
		tProcesoExample.createCriteria().andProcIdLessThan(idProcess);
		tProcesoExample.createCriteria().andProcTipEqualTo(typeLoadProcess);
		tProcesoExample.createCriteria().andProcEstIn(statesProceso);
		
		return tProcesoManager.countByExample(tProcesoExample)>0;
	}
	
	public int getHoursAfterStartProcess(TProceso proceso){
		return Util.getHoursAfterDate(proceso.getProcFecIni());
	}
	
	public void startProcess(String typeLoadProcess){
		
	}
	
	public void cancelProcess(int idProcess){
		
	}
}
