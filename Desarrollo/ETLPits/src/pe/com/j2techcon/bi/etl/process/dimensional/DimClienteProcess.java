package pe.com.j2techcon.bi.etl.process.dimensional;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.logic.dimensional.DimClienteManager;
import pe.com.j2techcon.bi.etl.logic.generic.TAreaClienteManager;
import pe.com.j2techcon.bi.etl.logic.generic.TClienteManager;
import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;
import pe.com.j2techcon.bi.etl.logic.generic.TUbigeoManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimCliente;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimClienteExample;
import pe.com.j2techcon.bi.etl.domain.generic.TCliente;
import pe.com.j2techcon.bi.etl.domain.generic.TClienteExample;
import pe.com.j2techcon.bi.etl.domain.generic.TAreaCliente;
import pe.com.j2techcon.bi.etl.domain.generic.TAreaClienteExample;
import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;
import pe.com.j2techcon.bi.etl.domain.generic.TUbigeo;
import pe.com.j2techcon.bi.etl.domain.generic.TUbigeoExample;

public class DimClienteProcess {
	
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
	
	private TCliente tCliente;
	private TClienteExample tClienteExample;
	
	private TAreaCliente tAreaCliente;
	private TAreaClienteExample tAreaClienteExample;
	
	private TUbigeo tUbigeo;
	private TUbigeoExample tUbigeoExample;
	
	private TParametro tParametro;
	private TParametroExample tParametroExample;
	
	private DimCliente dimCliente;
	private DimClienteExample dimClienteExample;
	
	private TClienteManager tClienteManager;
	private TAreaClienteManager tAreaClienteManager;
	private TUbigeoManager tUbigeoManager; 
	private TParametroManager tParametroManager; 
	private DimClienteManager dimClienteManager;
	
	private Constantes constantes;

	static Logger log = Logger.getLogger(DimClienteProcess.class);
	
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

	public TCliente gettCliente() {
		return tCliente;
	}

	public void settCliente(TCliente tCliente) {
		this.tCliente = tCliente;
	}

	public TClienteExample gettClienteExample() {
		return tClienteExample;
	}

	public void settClienteExample(TClienteExample tClienteExample) {
		this.tClienteExample = tClienteExample;
	}

	public TAreaCliente gettAreaCliente() {
		return tAreaCliente;
	}

	public void settAreaCliente(TAreaCliente tAreaCliente) {
		this.tAreaCliente = tAreaCliente;
	}

	public TAreaClienteExample gettAreaClienteExample() {
		return tAreaClienteExample;
	}

	public void settAreaClienteExample(TAreaClienteExample tAreaClienteExample) {
		this.tAreaClienteExample = tAreaClienteExample;
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

	public DimCliente getDimCliente() {
		return dimCliente;
	}

	public void setDimCliente(DimCliente dimCliente) {
		this.dimCliente = dimCliente;
	}

	public DimClienteExample getDimClienteExample() {
		return dimClienteExample;
	}

	public void setDimClienteExample(DimClienteExample dimClienteExample) {
		this.dimClienteExample = dimClienteExample;
	}

	public TClienteManager gettClienteManager() {
		return tClienteManager;
	}

	public void settClienteManager(TClienteManager tClienteManager) {
		this.tClienteManager = tClienteManager;
	}

	public TAreaClienteManager gettAreaClienteManager() {
		return tAreaClienteManager;
	}

	public void settAreaClienteManager(TAreaClienteManager tAreaClienteManager) {
		this.tAreaClienteManager = tAreaClienteManager;
	}

	public TUbigeoManager gettUbigeoManager() {
		return tUbigeoManager;
	}

	public void settUbigeoManager(TUbigeoManager tUbigeoManager) {
		this.tUbigeoManager = tUbigeoManager;
	}

	public TParametroManager gettParametroManager() {
		return tParametroManager;
	}

	public void settParametroManager(TParametroManager tParametroManager) {
		this.tParametroManager = tParametroManager;
	}

	public DimClienteManager getDimClienteManager() {
		return dimClienteManager;
	}

	public void setDimClienteManager(DimClienteManager dimClienteManager) {
		this.dimClienteManager = dimClienteManager;
	}

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public DimClienteProcess(BeanFactory factory, int sizePage,
			long dateTimeFrom, long dateTimeUntil, String typeProcess, int process) throws Exception {
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

	public int startProcess() throws Exception{

		tClienteManager = factory.getBean("tClienteManager", TClienteManager.class);
		tAreaClienteManager = factory.getBean("tAreaClienteManager", TAreaClienteManager.class);
		tParametroManager = factory.getBean("tParametroManager", TParametroManager.class);
		tUbigeoManager = factory.getBean("tUbigeoManager", TUbigeoManager.class);
		dimClienteManager = factory.getBean("dimClienteManager", DimClienteManager.class);
		
		tCliente = new TCliente();
		tClienteExample = new TClienteExample();
		
		tAreaCliente = new TAreaCliente();
		tAreaClienteExample = new TAreaClienteExample();
		
		tUbigeo = new TUbigeo();
		tUbigeoExample = new TUbigeoExample();
		
		tParametro = new TParametro();
		tParametroExample = new TParametroExample();
		
		dimCliente = new DimCliente();
		dimClienteExample = new DimClienteExample();
		
		int offset = 0;
		
		while(true) {
			
			tAreaClienteExample.clear();
			
			tAreaClienteExample.createCriteria().andFecNumCamGreaterThanOrEqualTo(dateTimeFrom);
			tAreaClienteExample.createCriteria().andFecNumCamLessThan(dateTimeUntil);
			
			tAreaClienteExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			List<TAreaCliente> lstAreaCliente = tAreaClienteManager.selectByExample(tAreaClienteExample);
			if(lstAreaCliente.size()>0){
				for (Iterator<TAreaCliente> iterator = lstAreaCliente.iterator(); iterator.hasNext();) {
					tAreaCliente = iterator.next();
					dimCliente.clear();
					processRecordAreaCliente();
				}
				offset = offset + constantes.getSizePage();
			}else{
				lstAreaCliente.clear();
				
				tCliente.clear();
				tClienteExample.clear();
				
				tAreaCliente.clear();
				tAreaClienteExample.clear();
				
				tUbigeo.clear();
				tUbigeoExample.clear();
				
				tParametro.clear();
				tParametroExample.clear();
				
				dimCliente.clear();
				dimClienteExample.clear();
				
				offset = 0;
				break;
			}
		}
		
		while(true) {
			
			tClienteExample.clear();
			
			tClienteExample.createCriteria().andFecNumCamGreaterThanOrEqualTo(dateTimeFrom);
			tClienteExample.createCriteria().andFecNumCamLessThan(dateTimeUntil);
			
			
			tClienteExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			List<TCliente> lstCliente = tClienteManager.selectByExample(tClienteExample);
			if(lstCliente.size()>0){
				for (Iterator<TCliente> iterator = lstCliente.iterator(); iterator.hasNext();) {
					tCliente = iterator.next();
					dimCliente.clear();
					dimClienteExample.clear();
					processRecordCliente();
				}
				offset = offset + constantes.getSizePage();
			}else{
				lstCliente.clear();
				
				tCliente.clear();
				tClienteExample.clear();
				
				tAreaCliente.clear();
				tAreaClienteExample.clear();
				
				tUbigeo.clear();
				tUbigeoExample.clear();
				
				tParametro.clear();
				tParametroExample.clear();
				
				dimCliente.clear();
				dimClienteExample.clear();
				
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
	
	public void processRecordAreaCliente()throws Exception{
		
		completeFieldAreaCliente();
		
		if(typeProcess.equals(constantes.getTypeProcessSimple())){
			if(tAreaCliente.getCodIndCam().equals(constantes.getStateRecordNew())){
				if(insertRecordDimensionalAreaCliente()> constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}else{
				if(updateRecordDimensionalAreaCliente() > constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}else{
			if(updateRecordDimensionalAreaCliente() > constantes.getResultTransactionNoResult()){
				stateRecordGeneric = constantes.getStateRecordProcessed();
				recordProcessed = recordProcessed + 1; 
			}else{
				if(insertRecordDimensionalAreaCliente() > constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1;
				}else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}
		
		updateRecordGenericAreaCliente(stateRecordGeneric);
		if(
			tCliente.getFecNumCam()>=dateTimeFrom
			&& tCliente.getFecNumCam()<=dateTimeUntil
			&& tCliente.getProcId() != process
		){
			updateRecordGenericCliente(stateRecordGeneric);
		}
	}
	
	public void processRecordCliente()throws Exception{
		completeFildCliente();
		
		if(updateRecordDimensionalCliente() > constantes.getResultTransactionNoResult()){
			stateRecordGeneric = constantes.getStateRecordProcessed();
			recordProcessed = recordProcessed + 1; 
		} 

		if(tCliente.getProcId() != process){
			updateRecordGenericCliente(stateRecordGeneric);
		}
	}
	
	public void completeFieldAreaCliente()throws Exception{
		dimCliente.setClienteAreaKey(tAreaCliente.getAreCliId());
		
		tCliente = tClienteManager.selectByPrimaryKey(tAreaCliente.getCliId());
		dimCliente.setClienteKey(tCliente.getCliId());
		
		if(tCliente.getFecNumCam() >= dateTimeFrom && tCliente.getFecNumCam() <= dateTimeUntil){
			dimCliente.setClienteCodTip(tCliente.getCliCodTip());
			if(tCliente.getCliCodTip() != constantes.getValueNumberDefault()){
				tParametro = tParametroManager.selectByPrimaryKey(tCliente.getCliCodTip());
				dimCliente.setClienteDescTip(tParametro.getParamDes());
			}else{
				dimCliente.setClienteDescTip(constantes.getValueStringDefault());
			}
			
			dimCliente.setClienteCodCategoria(tCliente.getCliCodCat());
			if(tCliente.getCliCodCat() != constantes.getValueNumberDefault()){
				tParametro = tParametroManager.selectByPrimaryKey(tCliente.getCliCodCat());
				dimCliente.setClienteDescCategoria(tParametro.getParamDes());
			}else{
				dimCliente.setClienteDescCategoria(constantes.getValueStringDefault());
			}
			
			dimCliente.setClienteCodFacturacion(tCliente.getCliCodTipFac());
			if(tCliente.getCliCodTipFac() != constantes.getValueNumberDefault()){
				tParametro = tParametroManager.selectByPrimaryKey(tCliente.getCliCodTipFac());
				dimCliente.setClienteDescFacturacion(tParametro.getParamDes());
			}else{
				dimCliente.setClienteDescFacturacion(constantes.getValueStringDefault());
			}
			
			dimCliente.setClienteCodCredito(tCliente.getCliCodTipCre());
			if(tCliente.getCliCodTipCre() != constantes.getValueNumberDefault()){
				tParametro = tParametroManager.selectByPrimaryKey(tCliente.getCliCodTipCre());
				dimCliente.setClienteDescCredito(tParametro.getParamDes());
			}else{
				dimCliente.setClienteDescCredito(constantes.getValueStringDefault());
			}
			
			dimCliente.setClienteCodTipDoc(tCliente.getCliCodTipDoc());
			if(tCliente.getCliCodTipDoc() != constantes.getValueNumberDefault()){
				tParametro = tParametroManager.selectByPrimaryKey(tCliente.getCliCodTipDoc());
				dimCliente.setClienteDescTipDoc(tParametro.getParamDes());
			}else{
				dimCliente.setClienteDescTipDoc(constantes.getValueStringDefault());
			}
			
			dimCliente.setClienteNumTipDoc(tCliente.getCliNumTipDoc());
			
			//			if(!tCliente.getCliDesRazSoc().equals(constantes.getValueStringDefault())){
			//				dimCliente.setClienteDesc(tCliente.getCliDesRazSoc());
			//			}else{
			//				dimCliente.setClienteDesc(tCliente.getCliDesApePat() + " " + tCliente.getCliDesApeMat() + " " + tCliente.getCliDesNom());
			//			}
			dimCliente.setClienteDesc(tCliente.getCliDesRazSoc());
			
		}
		
		dimCliente.setClienteAreaCod(tAreaCliente.getAreCliCod());
		dimCliente.setClienteAreaDesc(tAreaCliente.getAreCliDes());

		dimCliente.setProcId(process);
	}
	
	public void completeFildCliente()throws Exception{
		
		dimClienteExample.createCriteria().andClienteKeyEqualTo(tCliente.getCliId());
		dimClienteExample.createCriteria().andProcIdNotEqualTo(process);
		
		dimCliente.setClienteKey(tCliente.getCliId());

		dimCliente.setClienteCodTip(tCliente.getCliCodTip());
		if(tCliente.getCliCodTip() != constantes.getValueNumberDefault()){
			tParametro = tParametroManager.selectByPrimaryKey(tCliente.getCliCodTip());
			dimCliente.setClienteDescTip(tParametro.getParamDes());
		}else{
			dimCliente.setClienteDescTip(constantes.getValueStringDefault());
		}
		
		dimCliente.setClienteCodCategoria(tCliente.getCliCodCat());
		if(tCliente.getCliCodCat() != constantes.getValueNumberDefault()){
			tParametro = tParametroManager.selectByPrimaryKey(tCliente.getCliCodCat());
			dimCliente.setClienteDescCategoria(tParametro.getParamDes());
		}else{
			dimCliente.setClienteDescCategoria(constantes.getValueStringDefault());
		}
		
		dimCliente.setClienteCodFacturacion(tCliente.getCliCodTipFac());
		if(tCliente.getCliCodTipFac() != constantes.getValueNumberDefault()){
			tParametro = tParametroManager.selectByPrimaryKey(tCliente.getCliCodTipFac());
			dimCliente.setClienteDescFacturacion(tParametro.getParamDes());
		}else{
			dimCliente.setClienteDescFacturacion(constantes.getValueStringDefault());
		}
		
		dimCliente.setClienteCodCredito(tCliente.getCliCodTipCre());
		if(tCliente.getCliCodTipCre() != constantes.getValueNumberDefault()){
			tParametro = tParametroManager.selectByPrimaryKey(tCliente.getCliCodTipCre());
			dimCliente.setClienteDescCredito(tParametro.getParamDes());
		}else{
			dimCliente.setClienteDescCredito(constantes.getValueStringDefault());
		}
		
		dimCliente.setClienteCodTipDoc(tCliente.getCliCodTipDoc());
		if(tCliente.getCliCodTipDoc() != constantes.getValueNumberDefault()){
			tParametro = tParametroManager.selectByPrimaryKey(tCliente.getCliCodTipDoc());
			dimCliente.setClienteDescTipDoc(tParametro.getParamDes());
		}else{
			dimCliente.setClienteDescTipDoc(constantes.getValueStringDefault());
		}
		
		dimCliente.setClienteNumTipDoc(tCliente.getCliNumTipDoc());
		if(!tCliente.getCliDesRazSoc().equals(constantes.getValueStringDefault())){
			dimCliente.setClienteDesc(tCliente.getCliDesRazSoc());
		}else{
			dimCliente.setClienteDesc(tCliente.getCliDesApePat() + " " + tCliente.getCliDesApeMat() + " " + tCliente.getCliDesNom());
		}
		dimCliente.setProcId(process);
	}
	
	public int insertRecordDimensionalAreaCliente()throws Exception{
		try{
			resultTransaction = dimClienteManager.insertSelective(dimCliente);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int updateRecordDimensionalAreaCliente()throws Exception{
		try{
			resultTransaction = dimClienteManager.updateByPrimaryKeySelective(dimCliente);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int updateRecordDimensionalCliente()throws Exception{
		try{
			resultTransaction = dimClienteManager.updateByExampleSelective(dimCliente, dimClienteExample);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int deleteRecordDimensionalAreaCliente()throws Exception{
		try{
			resultTransaction = dimClienteManager.deleteByPrimaryKey(dimCliente.getClienteKey());
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction; 
	}
	
	public int deleteRecordDimensionalCliente()throws Exception{
		try{
			resultTransaction = dimClienteManager.deleteByExample(dimClienteExample);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction; 
	}
	
	public void updateRecordGenericAreaCliente(String statusRecord)throws Exception{
		int idAreaCliente = tAreaCliente.getAreCliId();
		tAreaCliente.clear();
		tAreaCliente.setAreCliId(idAreaCliente);
		tAreaCliente.setCodIndCam(statusRecord);
		tAreaCliente.setProcId(process);
		tAreaClienteManager.updateByPrimaryKeySelective(tAreaCliente);
	}
	
	public void updateRecordGenericCliente(String statusRecord)throws Exception{
		int idCliente = tCliente.getCliId();
		tCliente.clear();
		tCliente.setCliId(idCliente);
		tCliente.setCodIndCam(statusRecord);
		tCliente.setProcId(process);
		tClienteManager.updateByPrimaryKeySelective(tCliente);
	}
}
