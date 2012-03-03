package pe.com.j2techcon.bi.etl.process.dimensional;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import pe.com.j2techcon.bi.etl.logic.dimensional.DimMonedaManager;
import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimMoneda;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimMonedaExample;
import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;


public class DimMonedaProcess {
	
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
	
	private DimMoneda dimMoneda;
	private DimMonedaExample dimMonedaExample;
	
	private TParametroManager tParametroManager; 
	private DimMonedaManager dimMonedaManager;
	
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

	public DimMoneda getDimMoneda() {
		return dimMoneda;
	}

	public void setDimMoneda(DimMoneda dimMoneda) {
		this.dimMoneda = dimMoneda;
	}

	public DimMonedaExample getDimMonedaExample() {
		return dimMonedaExample;
	}

	public void setDimMonedaExample(DimMonedaExample dimMonedaExample) {
		this.dimMonedaExample = dimMonedaExample;
	}

	public TParametroManager gettParametroManager() {
		return tParametroManager;
	}

	public void settParametroManager(TParametroManager tParametroManager) {
		this.tParametroManager = tParametroManager;
	}

	public DimMonedaManager getDimMonedaManager() {
		return dimMonedaManager;
	}

	public void setDimMonedaManager(DimMonedaManager dimMonedaManager) {
		this.dimMonedaManager = dimMonedaManager;
	}

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public DimMonedaProcess(BeanFactory factory, int sizePage,
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
		dimMonedaManager = factory.getBean("dimMonedaManager", DimMonedaManager.class);
		
		constantes = factory.getBean("constantes", Constantes.class);

		int offset = 0;
		
		while(true) {
			
			tParametroExample.clear();
			tParametroExample.createCriteria().andFecNumCamBetween(dateTimeFrom, dateTimeUntil);
			tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeTipoMoneda());
			tParametroExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			List<TParametro> lstParametro = tParametroManager.selectByExample(tParametroExample);
			if(lstParametro.size()>0){
				for (Iterator<TParametro> iterator = lstParametro.iterator(); iterator.hasNext();) {
					tParametro = iterator.next();
					dimMoneda.clear();
					processRecordParametro();
				}
				offset = offset + constantes.getSizePage();
			}else{
				
				tParametroExample.clear();
				tParametroExample.createCriteria().andFecNumCamBetween(dateTimeFrom, dateTimeUntil);
				tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeTipoMoneda());
				tParametroExample.createCriteria().andProcIdNotEqualTo(process);
				lstParametro = tParametroManager.selectByExample(tParametroExample);
				if(lstParametro.size()>0){
					for (Iterator<TParametro> iterator = lstParametro.iterator(); iterator.hasNext();) {
						tParametro = iterator.next();
						dimMoneda.clear();
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
		
		completeFildMoneda();
		
		if(typeProcess.equals(constantes.getTypeProcessSimple())){
			if(tParametro.getCodIndCam().equals(constantes.getStateRecordNew())){
				if(insertRecordDimensionalMoneda()> constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}else{
				if(updateRecordDimensionalMoneda() > constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}else{
			if(updateRecordDimensionalMoneda() > constantes.getResultTransactionNoResult()){
				stateRecordGeneric = constantes.getStateRecordProcessed();
				recordProcessed = recordProcessed + 1; 
			}else{
				if(insertRecordDimensionalMoneda() > constantes.getResultTransactionNoResult()){
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
	
	public void completeFildMoneda(){
		dimMoneda.setMonedaKey(tParametro.getParamId());
		dimMoneda.setMonedaCod(tParametro.getParamCod());
		dimMoneda.setMonedaDesc(tParametro.getParamDes());
		dimMoneda.setProcId(process);
	}
	
	public int insertRecordDimensionalMoneda(){
		try{
			resultTransaction = dimMonedaManager.insertSelective(dimMoneda);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int updateRecordDimensionalMoneda(){
		try{
			resultTransaction = dimMonedaManager.updateByPrimaryKeySelective(dimMoneda);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int deleteRecordDimensionalMoneda(){
		try{
			resultTransaction = dimMonedaManager.deleteByPrimaryKey(dimMoneda.getMonedaKey());
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
