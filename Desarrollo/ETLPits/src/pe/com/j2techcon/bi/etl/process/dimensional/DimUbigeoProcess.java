package pe.com.j2techcon.bi.etl.process.dimensional;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import pe.com.j2techcon.bi.etl.logic.dimensional.DimUbigeoManager;
import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;
import pe.com.j2techcon.bi.etl.logic.generic.TUbigeoManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimUbigeo;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimUbigeoExample;
import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;
import pe.com.j2techcon.bi.etl.domain.generic.TUbigeo;
import pe.com.j2techcon.bi.etl.domain.generic.TUbigeoExample;


public class DimUbigeoProcess {
	
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
	
	private TUbigeo tUbigeo;
	private TUbigeoExample tUbigeoExample;
	
	private DimUbigeo dimUbigeo;
	private DimUbigeoExample dimUbigeoExample;
	
	private TParametroManager tParametroManager;
	private TUbigeoManager tUbigeoManager;
	private DimUbigeoManager dimUbigeoManager;
	
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

	public TUbigeo gettUbigeo() {
		return tUbigeo;
	}

	public void settUbigeo(TUbigeo tUbigeo) {
		this.tUbigeo = tUbigeo;
	}

	public TUbigeoExample gettUbigeoExample() {
		return tUbigeoExample;
	}

	public void settUbigeoExample(TUbigeoExample tUbigeoExample) {
		this.tUbigeoExample = tUbigeoExample;
	}

	public DimUbigeo getDimUbigeo() {
		return dimUbigeo;
	}

	public void setDimUbigeo(DimUbigeo dimUbigeo) {
		this.dimUbigeo = dimUbigeo;
	}

	public DimUbigeoExample getDimUbigeoExample() {
		return dimUbigeoExample;
	}

	public void setDimUbigeoExample(DimUbigeoExample dimUbigeoExample) {
		this.dimUbigeoExample = dimUbigeoExample;
	}

	public TParametroManager gettParametroManager() {
		return tParametroManager;
	}

	public void settParametroManager(TParametroManager tParametroManager) {
		this.tParametroManager = tParametroManager;
	}

	public TUbigeoManager gettUbigeoManager() {
		return tUbigeoManager;
	}

	public void settUbigeoManager(TUbigeoManager tUbigeoManager) {
		this.tUbigeoManager = tUbigeoManager;
	}

	public DimUbigeoManager getDimUbigeoManager() {
		return dimUbigeoManager;
	}

	public void setDimUbigeoManager(DimUbigeoManager dimUbigeoManager) {
		this.dimUbigeoManager = dimUbigeoManager;
	}

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public DimUbigeoProcess(BeanFactory factory, int sizePage,
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
		tUbigeoManager = factory.getBean("tUbigeoManager", TUbigeoManager.class);
		dimUbigeoManager = factory.getBean("dimUbigeoManager", DimUbigeoManager.class);
		
		constantes = factory.getBean("constantes", Constantes.class);

		int offset = 0;
		
		while(true) {
			
			tUbigeoExample.clear();

			tUbigeoExample.createCriteria().andFecNumCamGreaterThanOrEqualTo(dateTimeFrom);
			tUbigeoExample.createCriteria().andFecNumCamLessThan(dateTimeUntil);	
			
			tUbigeoExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			List<TUbigeo> lstUbigeo = tUbigeoManager.selectByExample(tUbigeoExample);
			if(lstUbigeo.size()>0){
				for (Iterator<TUbigeo> iterator = lstUbigeo.iterator(); iterator.hasNext();) {
					tUbigeo = iterator.next();
					dimUbigeo.clear();
					processRecordUbigeo();
				}
				offset = offset + constantes.getSizePage();
			}else{
				
				lstUbigeo.clear();
				
				tParametro.clear();
				tParametroExample.clear();
				
				tUbigeo.clear();
				tUbigeoExample.clear();
				
				dimUbigeo.clear();
				dimUbigeoExample.clear();
				
				offset = 0;
				break;
			}
		}
		
		if(recordRejected > 0) {
			resultProcess = constantes.getResultProcessCompletedErrors();
		}
		else{
			resultProcess = constantes.getResultProcessCompletedCorrectly();
		}
		
		recordTotal = recordProcessed + recordRejected;

		return resultProcess;
	}
	
	public void processRecordUbigeo(){
		
		completeFildUbigeo();
		
		if(typeProcess.equals(constantes.getTypeProcessSimple())){
			if(tUbigeo.getCodIndCam().equals(constantes.getStateRecordNew())){
				if(insertRecordDimensionalUbigeo()> constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}else{
				if(updateRecordDimensionalUbigeo() > constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}else{
			if(updateRecordDimensionalUbigeo() > constantes.getResultTransactionNoResult()){
				stateRecordGeneric = constantes.getStateRecordProcessed();
				recordProcessed = recordProcessed + 1; 
			}else{
				if(insertRecordDimensionalUbigeo() > constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1;
				}else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}
		
		updateRecordGenericUbigeo(stateRecordGeneric);
	}
	
	public void completeFildUbigeo(){
		dimUbigeo.setUbigeoKey(tUbigeo.getProcId());
		dimUbigeo.setUbigeoCodPais(tUbigeo.getUbiCodPais());
		
		tParametro = tParametroManager.selectByPrimaryKey(tUbigeo.getUbiCodPais());
		dimUbigeo.setUbigeoDesPais(tParametro.getParamDes());
		
		dimUbigeo.setUbigeoCodDepartamento(tUbigeo.getUbiCodDepartamento());
		
		tParametro = tParametroManager.selectByPrimaryKey(tUbigeo.getUbiCodDepartamento());
		dimUbigeo.setUbigeoDescDepartamento(tParametro.getParamDes());
		
		dimUbigeo.setUbigeoCodProvincia(tUbigeo.getUbiCodProvincia());
		
		tParametro = tParametroManager.selectByPrimaryKey(tUbigeo.getUbiCodProvincia());
		dimUbigeo.setUbigeoDescProvincia(tParametro.getParamDes());
		
		dimUbigeo.setUbigeoCodDistrito(tUbigeo.getUbiCodDistrito());
		
		tParametro = tParametroManager.selectByPrimaryKey(tUbigeo.getUbiCodDistrito());
		dimUbigeo.setUbigeoDescDistrito(tParametro.getParamDes());
	}
	
	public int insertRecordDimensionalUbigeo(){
		try{
			resultTransaction = dimUbigeoManager.insertSelective(dimUbigeo);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int updateRecordDimensionalUbigeo(){
		try{
			resultTransaction = dimUbigeoManager.updateByPrimaryKeySelective(dimUbigeo);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int deleteRecordDimensionalUbigeo(){
		try{
			resultTransaction = dimUbigeoManager.deleteByPrimaryKey(dimUbigeo.getUbigeoKey());
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction; 
	}
	
	public void updateRecordGenericUbigeo(String statusRecord){
		try{
			int idUbigeo = tUbigeo.getUbiId();
			tUbigeo.clear();
			tUbigeo.setUbiId(idUbigeo);
			tUbigeo.setCodIndCam(statusRecord);
			tUbigeo.setProcId(process);
			tUbigeoManager.updateByPrimaryKeySelective(tUbigeo);
		}catch(Exception e){
			
		}
	}
}
