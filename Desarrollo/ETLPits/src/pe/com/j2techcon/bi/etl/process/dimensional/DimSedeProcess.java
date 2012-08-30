package pe.com.j2techcon.bi.etl.process.dimensional;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.logic.dimensional.DimSedeManager;
import pe.com.j2techcon.bi.etl.logic.generic.TSedeManager;
import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;
import pe.com.j2techcon.bi.etl.logic.generic.TUbigeoManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimSede;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimSedeExample;
import pe.com.j2techcon.bi.etl.domain.generic.TSede;
import pe.com.j2techcon.bi.etl.domain.generic.TSedeExample;
import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;
import pe.com.j2techcon.bi.etl.domain.generic.TUbigeo;
import pe.com.j2techcon.bi.etl.domain.generic.TUbigeoExample;


public class DimSedeProcess {
	
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
	
	private TSede tSede;
	private TSedeExample tSedeExample;
	
	private TParametro tParametro;
	private TParametroExample tParametroExample;
	
	private DimSede dimSede;
	private DimSedeExample dimSedeExample;
	
	private TUbigeo tUbigeo;
	private TUbigeoExample tUbigeoExample;
	
	private TSedeManager tSedeManager;
	private TParametroManager tParametroManager; 
	private TUbigeoManager tUbigeoManager;
	private DimSedeManager dimSedeManager;
	
	private Constantes constantes;

	static Logger log = Logger.getLogger(DimSedeProcess.class);
	
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

	public TSede gettSede() {
		return tSede;
	}

	public void settSede(TSede tSede) {
		this.tSede = tSede;
	}

	public TSedeExample gettSedeExample() {
		return tSedeExample;
	}

	public void settSedeExample(TSedeExample tSedeExample) {
		this.tSedeExample = tSedeExample;
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

	public DimSede getDimSede() {
		return dimSede;
	}

	public void setDimSede(DimSede dimSede) {
		this.dimSede = dimSede;
	}

	public DimSedeExample getDimSedeExample() {
		return dimSedeExample;
	}

	public void setDimSedeExample(DimSedeExample dimSedeExample) {
		this.dimSedeExample = dimSedeExample;
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

	public TSedeManager gettSedeManager() {
		return tSedeManager;
	}

	public void settSedeManager(TSedeManager tSedeManager) {
		this.tSedeManager = tSedeManager;
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

	public DimSedeManager getDimSedeManager() {
		return dimSedeManager;
	}

	public void setDimSedeManager(DimSedeManager dimSedeManager) {
		this.dimSedeManager = dimSedeManager;
	}

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public DimSedeProcess(BeanFactory factory, int sizePage,
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

		tSedeManager = factory.getBean("tSedeManager", TSedeManager.class);
		tParametroManager = factory.getBean("tParametroManager", TParametroManager.class);
		tUbigeoManager = factory.getBean("tUbigeoManager", TUbigeoManager.class);
		dimSedeManager = factory.getBean("dimSedeManager", DimSedeManager.class);
		
		tSede = new TSede();
		tSedeExample = new TSedeExample();
		
		tParametro = new TParametro();
		tParametroExample = new TParametroExample();
		
		dimSede = new DimSede();
		dimSedeExample = new DimSedeExample();
		
		tUbigeo = new TUbigeo();
		tUbigeoExample = new TUbigeoExample();

		int offset = 0;
		
		while(true) {
			
			tSedeExample.clear();

			tSedeExample.createCriteria().andFecNumCamGreaterThanOrEqualTo(dateTimeFrom);
			tSedeExample.createCriteria().andFecNumCamLessThan(dateTimeUntil);	
			
			tSedeExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			List<TSede> lstSede = tSedeManager.selectByExample(tSedeExample);
			if(lstSede.size()>0){
				for (Iterator<TSede> iterator = lstSede.iterator(); iterator.hasNext();) {
					tSede = iterator.next();
					dimSede.clear();
					processRecordSede();
				}
				offset = offset + constantes.getSizePage();
			}else{
				
				lstSede.clear();
				
				tSede.clear();
				tSedeExample.clear();
				
				tParametro.clear();
				tParametroExample.clear();
				
				dimSede.clear();
				dimSedeExample.clear();
				
				tUbigeo.clear();
				tUbigeoExample.clear();
				
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
	
	public void processRecordSede()throws Exception{
		
		completeFieldSede();
		
		if(typeProcess.equals(constantes.getTypeProcessSimple())){
			if(tSede.getCodIndCam().equals(constantes.getStateRecordNew())){
				if(insertRecordDimensionalSede()> constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}else{
				if(updateRecordDimensionalSede() > constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}else{
			if(updateRecordDimensionalSede() > constantes.getResultTransactionNoResult()){
				stateRecordGeneric = constantes.getStateRecordProcessed();
				recordProcessed = recordProcessed + 1; 
			}else{
				if(insertRecordDimensionalSede() > constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1;
				}else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}
		
		updateRecordGenericSede(stateRecordGeneric);
	}
	
	public void completeFieldSede()throws Exception{
		dimSede.setSedeKey(tSede.getProcId());
		dimSede.setSedeCod(tSede.getSedCod());
		
		dimSede.setSedeCodTipo(tSede.getSedCodTip());
		if(tSede.getSedCodTip() != constantes.getValueNumberDefault()){
			tParametro = tParametroManager.selectByPrimaryKey(tSede.getSedCodTip());
			dimSede.setSedeDescTipo(tParametro.getParamDes());
		}else{
			dimSede.setSedeDescTipo(constantes.getValueStringDefault());
		}
		
		tUbigeo = tUbigeoManager.selectByPrimaryKey(tSede.getUbiId());
		
		dimSede.setSedeCodPais(tUbigeo.getUbiCodPais());
		if(tUbigeo.getUbiCodPais() != constantes.getValueNumberDefault()){
			tParametro = tParametroManager.selectByPrimaryKey(tUbigeo.getUbiCodPais());
			dimSede.setSedeDescPais(tParametro.getParamDes());
		}else{
			dimSede.setSedeDescPais(constantes.getValueStringDefault());
		}
		
		dimSede.setSedeCodDepartamento(tUbigeo.getUbiCodDepartamento());
		if(tUbigeo.getUbiCodDepartamento() != constantes.getValueNumberDefault()){
			tParametro = tParametroManager.selectByPrimaryKey(tUbigeo.getUbiCodDepartamento());
			dimSede.setSedeDescDepartamento(tParametro.getParamDes());
		}else{
			dimSede.setSedeDescDepartamento(constantes.getValueStringDefault());
		}
		
		dimSede.setSedeCodProvincia(tUbigeo.getUbiCodProvincia());
		if(tUbigeo.getUbiCodProvincia() != constantes.getValueNumberDefault()){
			tParametro = tParametroManager.selectByPrimaryKey(tUbigeo.getUbiCodProvincia());
			dimSede.setSedeDescProvincia(tParametro.getParamDes());
		}else{
			dimSede.setSedeDescProvincia(constantes.getValueStringDefault());
		}
		
		dimSede.setSedeCodDistrito(tUbigeo.getUbiCodDistrito());
		if(tUbigeo.getUbiCodDistrito() != constantes.getValueNumberDefault()){
			tParametro = tParametroManager.selectByPrimaryKey(tUbigeo.getUbiCodDistrito());
			dimSede.setSedeDescDistrito(tParametro.getParamDes());
		}else{
			dimSede.setSedeDescDistrito(constantes.getValueStringDefault());
		}
		
		dimSede.setSedeDesc(tSede.getSedDes());
		dimSede.setProcId(process);
	}
	
	public int insertRecordDimensionalSede()throws Exception{
		try{
			resultTransaction = dimSedeManager.insertSelective(dimSede);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int updateRecordDimensionalSede()throws Exception{
		try{
			resultTransaction = dimSedeManager.updateByPrimaryKeySelective(dimSede);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int deleteRecordDimensionalSede()throws Exception{
		try{
			resultTransaction = dimSedeManager.deleteByPrimaryKey(dimSede.getSedeKey());
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction; 
	}
	
	public void updateRecordGenericSede(String statusRecord)throws Exception{
		int idSede = tSede.getSedId();
		tSede.clear();
		tSede.setSedId(idSede);
		tSede.setCodIndCam(statusRecord);
		tSede.setProcId(process);
		tSedeManager.updateByPrimaryKeySelective(tSede);
	}
}
