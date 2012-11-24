package pe.com.j2techcon.bi.etl.process.dimensional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.logic.dimensional.DimZonaManager;
import pe.com.j2techcon.bi.etl.logic.generic.TZonaManager;
import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;
import pe.com.j2techcon.bi.etl.logic.generic.TUbigeoManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.util.Util;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimZona;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimZonaExample;
import pe.com.j2techcon.bi.etl.domain.generic.TZona;
import pe.com.j2techcon.bi.etl.domain.generic.TZonaExample;
import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;
import pe.com.j2techcon.bi.etl.domain.generic.TUbigeo;
import pe.com.j2techcon.bi.etl.domain.generic.TUbigeoExample;


public class DimZonaProcess {
	
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
	
	private TZona tZona;
	private TZonaExample tZonaExample;
	
	private TParametro tParametro;
	private TParametroExample tParametroExample;
	
	private DimZona dimZona;
	private DimZonaExample dimZonaExample;
	
	private TUbigeo tUbigeo;
	private TUbigeoExample tUbigeoExample;
	
	private TZonaManager tZonaManager;
	private TParametroManager tParametroManager; 
	private TUbigeoManager tUbigeoManager;
	private DimZonaManager dimZonaManager;
	
	private Constantes constantes;

	static Logger log = Logger.getLogger(DimZonaProcess.class);
	
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

	public TZona gettZona() {
		return tZona;
	}

	public void settZona(TZona tZona) {
		this.tZona = tZona;
	}

	public TZonaExample gettZonaExample() {
		return tZonaExample;
	}

	public void settZonaExample(TZonaExample tZonaExample) {
		this.tZonaExample = tZonaExample;
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

	public DimZona getDimZona() {
		return dimZona;
	}

	public void setDimZona(DimZona dimZona) {
		this.dimZona = dimZona;
	}

	public DimZonaExample getDimZonaExample() {
		return dimZonaExample;
	}

	public void setDimZonaExample(DimZonaExample dimZonaExample) {
		this.dimZonaExample = dimZonaExample;
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

	public TZonaManager gettZonaManager() {
		return tZonaManager;
	}

	public void settZonaManager(TZonaManager tZonaManager) {
		this.tZonaManager = tZonaManager;
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

	public DimZonaManager getDimZonaManager() {
		return dimZonaManager;
	}

	public void setDimZonaManager(DimZonaManager dimZonaManager) {
		this.dimZonaManager = dimZonaManager;
	}

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public DimZonaProcess(BeanFactory factory, int sizePage,
			long dateTimeFrom, long dateTimeUntil, String typeProcess, int process) throws Exception{
		this.factory = factory;
		this.sizePage = sizePage;
		this.dateTimeFrom = dateTimeFrom;
		this.dateTimeUntil = dateTimeUntil;
		this.typeProcess = typeProcess;
		this.process = process;
		
		constantes = factory.getBean("constantes", Constantes.class);
		
		recordTotal = constantes.getValueNumberDefault();
		recordProcessed = constantes.getValueNumberDefault();
		recordRejected = constantes.getValueNumberDefault();
		resultProcess = constantes.getResultProcessStarted();
		resultTransaction = constantes.getResultTransactionNoResult();
		stateRecordDimensional = constantes.getStateRecordNew();
		stateRecordGeneric = constantes.getStateRecordNew();
		
	}

	public int startProcess()throws Exception{

		tZonaManager = factory.getBean("tZonaManager", TZonaManager.class);
		tParametroManager = factory.getBean("tParametroManager", TParametroManager.class);
		tUbigeoManager = factory.getBean("tUbigeoManager", TUbigeoManager.class);
		dimZonaManager = factory.getBean("dimZonaManager", DimZonaManager.class);

		tZona = new TZona();
		tZonaExample = new TZonaExample();
		
		tParametro = new TParametro();
		tParametroExample = new TParametroExample();
		
		dimZona = new DimZona();
		dimZonaExample = new DimZonaExample();
		
		tUbigeo = new TUbigeo();
		tUbigeoExample = new TUbigeoExample();
		
		List<String> lstStateRecord = new ArrayList<String>();
		lstStateRecord.add(constantes.getStateRecordNew());
		lstStateRecord.add(constantes.getStateRecordUpdated());

		//int offset = 0;
		
		List<TZona> lstZona = new ArrayList<TZona>();
		
		while(true) {
			
			tZonaExample.clear();

			tZonaExample.createCriteria().andFecNumCamGreaterThanOrEqualTo(dateTimeFrom).andFecNumCamLessThan(dateTimeUntil).andCodIndCamIn(lstStateRecord);
			//tZonaExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			tZonaExample.setPaginationByClause(" limit " + constantes.getSizePage());
			
			lstZona = tZonaManager.selectByExample(tZonaExample);
			if(lstZona.size()>0){
				for (Iterator<TZona> iterator = lstZona.iterator(); iterator.hasNext();) {
					tZona = iterator.next();
					dimZona.clear();
					processRecordZona();
				}
				lstZona.clear();
				//offset = offset + constantes.getSizePage();
			}else{
				
				lstStateRecord.clear();
				lstZona.clear();
				
				tZona.clear();
				tZonaExample.clear();
				
				tParametro.clear();
				tParametroExample.clear();
				
				dimZona.clear();
				dimZonaExample.clear();
				
				tUbigeo.clear();
				tUbigeoExample.clear();

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
	
	public void processRecordZona()throws Exception{
		
		completeFieldZona();
		
		if(typeProcess.equals(constantes.getTypeProcessSimple())){
			if(tZona.getCodIndCam().equals(constantes.getStateRecordNew())){
				if(insertRecordDimensionalZona()> constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}else{
				if(updateRecordDimensionalZona() > constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}else{
			if(updateRecordDimensionalZona() > constantes.getResultTransactionNoResult()){
				stateRecordGeneric = constantes.getStateRecordProcessed();
				recordProcessed = recordProcessed + 1; 
			}else{
				if(insertRecordDimensionalZona() > constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1;
				}else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}
		
		updateRecordGenericZona(stateRecordGeneric);
	}
	
	public void completeFieldZona()throws Exception{
		dimZona.setZonaKey(tZona.getZonId());
		
		tUbigeo = tUbigeoManager.selectByPrimaryKey(tZona.getUbiId());
		
		dimZona.setZonaCodPais(tUbigeo.getUbiCodPais());
		if(tUbigeo.getUbiCodPais() != constantes.getValueNumberDefault()){
			tParametro = tParametroManager.selectByPrimaryKey(tUbigeo.getUbiCodPais());
			dimZona.setZonaDescPais(tParametro.getParamDes());
		}else{
			dimZona.setZonaDescPais(constantes.getValueStringDefault());
		}
		
		dimZona.setZonaCodDepartamento(tUbigeo.getUbiCodDepartamento());
		if(tUbigeo.getUbiCodDepartamento() != constantes.getValueNumberDefault()){
			tParametro = tParametroManager.selectByPrimaryKey(tUbigeo.getUbiCodDepartamento());
			dimZona.setZonaDescDepartamento(tParametro.getParamDes());
		}else{
			dimZona.setZonaDescDepartamento(constantes.getValueStringDefault());
		}
		
		dimZona.setZonaCodProvincia(tUbigeo.getUbiCodProvincia());
		if(tUbigeo.getUbiCodProvincia() != constantes.getValueNumberDefault()){
			tParametro = tParametroManager.selectByPrimaryKey(tUbigeo.getUbiCodProvincia());
			dimZona.setZonaDescProvincia(tParametro.getParamDes());
		}else{
			dimZona.setZonaDescProvincia(constantes.getValueStringDefault());
		}
		
		dimZona.setZonaCodDistrito(tUbigeo.getUbiCodDistrito());
		if(tUbigeo.getUbiCodDistrito() != constantes.getValueNumberDefault()){
			tParametro = tParametroManager.selectByPrimaryKey(tUbigeo.getUbiCodDistrito());
			dimZona.setZonaDescDistrito(tParametro.getParamDes());
		}else{
			dimZona.setZonaDescDistrito(constantes.getValueStringDefault());
		}
		
		dimZona.setZonaCod(tZona.getZonCod());
		dimZona.setZonaCodPostal(tZona.getZonCodPostal());
		dimZona.setZonaDesc(tZona.getZonDes());
		dimZona.setProcId(process);
	}
	
	public int insertRecordDimensionalZona()throws Exception{
		try{
			resultTransaction = dimZonaManager.insertSelective(dimZona);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int updateRecordDimensionalZona()throws Exception{
		try{
			resultTransaction = dimZonaManager.updateByPrimaryKeySelective(dimZona);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int deleteRecordDimensionalZona()throws Exception{
		try{
			resultTransaction = dimZonaManager.deleteByPrimaryKey(dimZona.getZonaKey());
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction; 
	}
	
	public void updateRecordGenericZona(String statusRecord)throws Exception{
		int idZona = tZona.getZonId();
		tZona.clear();
		tZona.setZonId(idZona);
		tZona.setCodIndCam(statusRecord);
		tZona.setFecNumCam(Util.getCurrentDateTimeAsLong());
		tZona.setProcId(process);
		tZonaManager.updateByPrimaryKeySelective(tZona);
	}
}
