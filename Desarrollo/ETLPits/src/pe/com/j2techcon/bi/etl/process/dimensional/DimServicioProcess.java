package pe.com.j2techcon.bi.etl.process.dimensional;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.logic.dimensional.DimServicioManager;
import pe.com.j2techcon.bi.etl.logic.generic.TServicioManager;
import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimServicio;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimServicioExample;
import pe.com.j2techcon.bi.etl.domain.generic.TServicio;
import pe.com.j2techcon.bi.etl.domain.generic.TServicioExample;
import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;


public class DimServicioProcess {
	
	private BeanFactory factory;
	private int sizePage;
	private int dateTimeFrom;
	private int dateTimeUntil;
	private String typeProcess;
	private int process;
	
	private int recordTotal;
	private int recordProcessed;
	private int recordRejected;
	private int resultProcess;
	private int resultTransaction;
	
	private String stateRecordDimensional;
	private String stateRecordGeneric;
	
	private TServicio tServicio;
	private TServicioExample tServicioExample;
	
	private TParametro tParametro;
	private TParametroExample tParametroExample;
	
	private DimServicio dimServicio;
	private DimServicioExample dimServicioExample;
	
	private TServicioManager tServicioManager;
	private TParametroManager tParametroManager; 
	private DimServicioManager dimServicioManager;
	
	private Constantes constantes;

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

	public int getDateTimeFrom() {
		return dateTimeFrom;
	}

	public void setDateTimeFrom(int dateTimeFrom) {
		this.dateTimeFrom = dateTimeFrom;
	}

	public int getDateTimeUntil() {
		return dateTimeUntil;
	}

	public void setDateTimeUntil(int dateTimeUntil) {
		this.dateTimeUntil = dateTimeUntil;
	}

	public String getTypeProcess() {
		return typeProcess;
	}

	public void setTypeProcess(String typeProcess) {
		this.typeProcess = typeProcess;
	}

	public int getProcess() {
		return process;
	}

	public void setProcess(int process) {
		this.process = process;
	}

	public int getRecordTotal() {
		return recordTotal;
	}

	public void setRecordTotal(int recordTotal) {
		this.recordTotal = recordTotal;
	}

	public int getRecordProcessed() {
		return recordProcessed;
	}

	public void setRecordProcessed(int recordProcessed) {
		this.recordProcessed = recordProcessed;
	}

	public int getRecordRejected() {
		return recordRejected;
	}

	public void setRecordRejected(int recordRejected) {
		this.recordRejected = recordRejected;
	}

	public int getResultProcess() {
		return resultProcess;
	}

	public void setResultProcess(int resultProcess) {
		this.resultProcess = resultProcess;
	}

	public int getResultTransaction() {
		return resultTransaction;
	}

	public void setResultTransaction(int resultTransaction) {
		this.resultTransaction = resultTransaction;
	}

	public String getStateRecordDimensional() {
		return stateRecordDimensional;
	}

	public void setStateRecordDimensional(String stateRecordDimensional) {
		this.stateRecordDimensional = stateRecordDimensional;
	}

	public String getStateRecordGeneric() {
		return stateRecordGeneric;
	}

	public void setStateRecordGeneric(String stateRecordGeneric) {
		this.stateRecordGeneric = stateRecordGeneric;
	}

	public TServicio gettServicio() {
		return tServicio;
	}

	public void settServicio(TServicio tServicio) {
		this.tServicio = tServicio;
	}

	public TServicioExample gettServicioExample() {
		return tServicioExample;
	}

	public void settServicioExample(TServicioExample tServicioExample) {
		this.tServicioExample = tServicioExample;
	}

	public TParametro gettParametro() {
		return tParametro;
	}

	public void settParametro(TParametro tParametro) {
		this.tParametro = tParametro;
	}

	public TParametroExample gettParametroExample() {
		return tParametroExample;
	}

	public void settParametroExample(TParametroExample tParametroExample) {
		this.tParametroExample = tParametroExample;
	}

	public DimServicio getDimServicio() {
		return dimServicio;
	}

	public void setDimServicio(DimServicio dimServicio) {
		this.dimServicio = dimServicio;
	}

	public DimServicioExample getDimServicioExample() {
		return dimServicioExample;
	}

	public void setDimServicioExample(DimServicioExample dimServicioExample) {
		this.dimServicioExample = dimServicioExample;
	}

	public TServicioManager gettServicioManager() {
		return tServicioManager;
	}

	public void settServicioManager(TServicioManager tServicioManager) {
		this.tServicioManager = tServicioManager;
	}

	public TParametroManager gettParametroManager() {
		return tParametroManager;
	}

	public void settParametroManager(TParametroManager tParametroManager) {
		this.tParametroManager = tParametroManager;
	}

	public DimServicioManager getDimServicioManager() {
		return dimServicioManager;
	}

	public void setDimServicioManager(DimServicioManager dimServicioManager) {
		this.dimServicioManager = dimServicioManager;
	}

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public DimServicioProcess(BeanFactory factory, int sizePage,
			int dateTimeFrom, int dateTimeUntil, String typeProcess, int process) {
		this.factory = factory;
		this.sizePage = sizePage;
		this.dateTimeFrom = dateTimeFrom;
		this.dateTimeUntil = dateTimeUntil;
		this.typeProcess = typeProcess;
		this.process = process;
		
		recordTotal = constantes.getValueNumberDefault();
		recordProcessed = constantes.getValueNumberDefault();
		recordRejected = constantes.getValueNumberDefault();
		resultProcess = constantes.getResultProcessStarted();
		resultTransaction = constantes.getResultTransactionNoResult();
		stateRecordDimensional = constantes.getStateRecordNew();
		stateRecordGeneric = constantes.getStateRecordNew();
		
	}

	public int startProcess(){

		tServicioManager = factory.getBean("tServicioManager", TServicioManager.class);
		tParametroManager = factory.getBean("tParametroManager", TParametroManager.class);
		dimServicioManager = factory.getBean("dimServicioManager", DimServicioManager.class);
		
		constantes = factory.getBean("constantes", Constantes.class);

		int offset = 0;
		
		while(true) {
			
			tServicioExample.clear();
			tServicioExample.createCriteria().andFecNumCamBetween(dateTimeFrom, dateTimeUntil);
			tServicioExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			List<TServicio> lstServicio = tServicioManager.selectByExample(tServicioExample);
			if(lstServicio.size()>0){
				for (Iterator<TServicio> iterator = lstServicio.iterator(); iterator.hasNext();) {
					tServicio = iterator.next();
					dimServicio.clear();
					processRecordServicio();
				}
				offset = offset + constantes.getSizePage();
			}
			
			if(lstServicio.size()<constantes.getSizePage()){
				
				tServicioExample.clear();
				tServicioExample.createCriteria().andFecNumCamBetween(dateTimeFrom, dateTimeUntil);
				tServicioExample.createCriteria().andProcIdNotEqualTo(process);
				lstServicio = tServicioManager.selectByExample(tServicioExample);
				if(lstServicio.size()>0){
					for (Iterator<TServicio> iterator = lstServicio.iterator(); iterator.hasNext();) {
						tServicio = iterator.next();
						dimServicio.clear();
						processRecordServicio();
					}
				}
				
				lstServicio.clear();
				tServicioExample.clear();
				offset = 0;
				break;
			}
		}
		
		if(recordRejected > 0) {
			resultProcess = constantes.getResultProcessCompletedCorrectly();
		}
		else{
			resultProcess = constantes.getResultProcessCompletedErrors();
		}

		return resultProcess;
	}
	
	public void processRecordServicio(){
		
		completeFildServicio();
		
		if(typeProcess.equals(constantes.getTypeProcessSimple())){
			if(tServicio.getCodIndCam().equals(constantes.getStateRecordNew())){
				if(insertRecordDimensionalServicio()> constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}else{
				if(updateRecordDimensionalServicio() > constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}else{
			if(updateRecordDimensionalServicio() > constantes.getResultTransactionNoResult()){
				stateRecordGeneric = constantes.getStateRecordProcessed();
				recordProcessed = recordProcessed + 1; 
			}else{
				if(insertRecordDimensionalServicio() > constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1;
				}else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}
		
		updateRecordGenericServicio(stateRecordGeneric);
	}
	
	public void completeFildServicio(){
		dimServicio.setServicioKey(tServicio.getProcId());
		dimServicio.setServicioCod(tServicio.getSevCod());
		
		dimServicio.setServicioCodAmbito(tServicio.getServCodAmb());
		if(tServicio.getServCodAmb() != constantes.getValueNumberDefault()){
			tParametro = tParametroManager.selectByPrimaryKey(tServicio.getServCodAmb());
			dimServicio.setServicioDescAmbito(tParametro.getParamDes());
		}else{
			dimServicio.setServicioDescAmbito(constantes.getValueStringDefault());
		}
		
		dimServicio.setServicioCodNegocio(tServicio.getServCodNeg());
		if(tServicio.getServCodNeg() != constantes.getValueNumberDefault()){
			tParametro = tParametroManager.selectByPrimaryKey(tServicio.getServCodNeg());
			dimServicio.setServicioDescNegocio(tParametro.getParamDes());
		}else{
			dimServicio.setServicioDescNegocio(constantes.getValueStringDefault());
		}
		
		dimServicio.setServicioDesc(tServicio.getServDes());
		dimServicio.setProcId(process);
	}
	
	public int insertRecordDimensionalServicio(){
		try{
			resultTransaction = dimServicioManager.insertSelective(dimServicio);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int updateRecordDimensionalServicio(){
		try{
			resultTransaction = dimServicioManager.updateByPrimaryKeySelective(dimServicio);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int deleteRecordDimensionalServicio(){
		try{
			resultTransaction = dimServicioManager.deleteByPrimaryKey(dimServicio.getServicioKey());
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction; 
	}
	
	public void updateRecordGenericServicio(String statusRecord){
		try{
			int idServicio = tServicio.getServId();
			tServicio.clear();
			tServicio.setServId(idServicio);
			tServicio.setCodIndCam(statusRecord);
			tServicio.setProcId(process);
			tServicioManager.updateByPrimaryKeySelective(tServicio);
		}catch(Exception e){
			
		}
	}
}
