package pe.com.j2techcon.bi.etl.process.dimensional;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import pe.com.j2techcon.bi.etl.logic.dimensional.DimTipoRepartoManager;
import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoReparto;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoRepartoExample;
import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;


public class DimTipoRepartoProcess {
	
	private BeanFactory factory;
	private int sizePage;
	private long dateTimeFrom;
	private long dateTimeUntil;
	private String typeProcess;
	private int process;
	
	private int recordTotal;
	private int recordProcessed;
	private int recordRejected;
	private int resultProcess;
	private int resultTransaction;
	
	private String stateRecordDimensional;
	private String stateRecordGeneric;
	
	private TParametro tParametro;
	private TParametroExample tParametroExample;
	
	private DimTipoReparto dimTipoReparto;
	private DimTipoRepartoExample dimTipoRepartoExample;
	
	private TParametroManager tParametroManager; 
	private DimTipoRepartoManager dimTipoRepartoManager;
	
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

	public long getDateTimeFrom() {
		return dateTimeFrom;
	}

	public void setDateTimeFrom(long dateTimeFrom) {
		this.dateTimeFrom = dateTimeFrom;
	}

	public long getDateTimeUntil() {
		return dateTimeUntil;
	}

	public void setDateTimeUntil(long dateTimeUntil) {
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

	public DimTipoReparto getDimTipoReparto() {
		return dimTipoReparto;
	}

	public void setDimTipoReparto(DimTipoReparto dimTipoReparto) {
		this.dimTipoReparto = dimTipoReparto;
	}

	public DimTipoRepartoExample getDimTipoRepartoExample() {
		return dimTipoRepartoExample;
	}

	public void setDimTipoRepartoExample(DimTipoRepartoExample dimTipoRepartoExample) {
		this.dimTipoRepartoExample = dimTipoRepartoExample;
	}

	public TParametroManager gettParametroManager() {
		return tParametroManager;
	}

	public void settParametroManager(TParametroManager tParametroManager) {
		this.tParametroManager = tParametroManager;
	}

	public DimTipoRepartoManager getDimTipoRepartoManager() {
		return dimTipoRepartoManager;
	}

	public void setDimTipoRepartoManager(DimTipoRepartoManager dimTipoRepartoManager) {
		this.dimTipoRepartoManager = dimTipoRepartoManager;
	}

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public DimTipoRepartoProcess(BeanFactory factory, int sizePage,
			long dateTimeFrom, long dateTimeUntil, String typeProcess, int process) {
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

		tParametroManager = factory.getBean("tParametroManager", TParametroManager.class);
		dimTipoRepartoManager = factory.getBean("dimTipoRepartoManager", DimTipoRepartoManager.class);
		
		constantes = factory.getBean("constantes", Constantes.class);

		int offset = 0;
		
		while(true) {
			
			tParametroExample.clear();
			tParametroExample.createCriteria().andFecNumCamBetween(dateTimeFrom, dateTimeUntil);
			tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeTipoReparto());
			tParametroExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			List<TParametro> lstParametro = tParametroManager.selectByExample(tParametroExample);
			if(lstParametro.size()>0){
				for (Iterator<TParametro> iterator = lstParametro.iterator(); iterator.hasNext();) {
					tParametro = iterator.next();
					dimTipoReparto.clear();
					processRecordParametro();
				}
				offset = offset + constantes.getSizePage();
			}else{
				
				tParametroExample.clear();
				tParametroExample.createCriteria().andFecNumCamBetween(dateTimeFrom, dateTimeUntil);
				tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeTipoReparto());
				tParametroExample.createCriteria().andProcIdNotEqualTo(process);
				lstParametro = tParametroManager.selectByExample(tParametroExample);
				if(lstParametro.size()>0){
					for (Iterator<TParametro> iterator = lstParametro.iterator(); iterator.hasNext();) {
						tParametro = iterator.next();
						dimTipoReparto.clear();
						processRecordParametro();
					}
				}
				
				lstParametro.clear();
				tParametroExample.clear();
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
	
	public void processRecordParametro(){
		
		completeFildTipoReparto();
		
		if(typeProcess.equals(constantes.getTypeProcessSimple())){
			if(tParametro.getCodIndCam().equals(constantes.getStateRecordNew())){
				if(insertRecordDimensionalTipoReparto()> constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}else{
				if(updateRecordDimensionalTipoReparto() > constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}else{
			if(updateRecordDimensionalTipoReparto() > constantes.getResultTransactionNoResult()){
				stateRecordGeneric = constantes.getStateRecordProcessed();
				recordProcessed = recordProcessed + 1; 
			}else{
				if(insertRecordDimensionalTipoReparto() > constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1;
				}else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}
		
		updateRecordGenericParametro(stateRecordGeneric);
	}
	
	public void completeFildTipoReparto(){
		dimTipoReparto.setTipoRepartoKey(tParametro.getParamId());
		dimTipoReparto.setTipoRepartoCod(tParametro.getParamCod());
		dimTipoReparto.setTipoRepartoDesc(tParametro.getParamDes());
		dimTipoReparto.setProcId(process);
	}
	
	public int insertRecordDimensionalTipoReparto(){
		try{
			resultTransaction = dimTipoRepartoManager.insertSelective(dimTipoReparto);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int updateRecordDimensionalTipoReparto(){
		try{
			resultTransaction = dimTipoRepartoManager.updateByPrimaryKeySelective(dimTipoReparto);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int deleteRecordDimensionalTipoReparto(){
		try{
			resultTransaction = dimTipoRepartoManager.deleteByPrimaryKey(dimTipoReparto.getTipoRepartoKey());
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction; 
	}
	
	public void updateRecordGenericParametro(String statusRecord){
		try{
			int idParametro = tParametro.getParamId();
			tParametro.clear();
			tParametro.setParamId(idParametro);
			tParametro.setCodIndCam(statusRecord);
			tParametro.setProcId(process);
			tParametroManager.updateByPrimaryKeySelective(tParametro);
		}catch(Exception e){
			
		}
	}
}
