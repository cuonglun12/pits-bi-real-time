package pe.com.j2techcon.bi.etl.process.dimensional;

import java.util.Iterator;
import java.util.List;

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

		tClienteManager = factory.getBean("tClienteManager", TClienteManager.class);
		tAreaClienteManager = factory.getBean("tAreaClienteManager", TAreaClienteManager.class);
		tParametroManager = factory.getBean("tParametroManager", TParametroManager.class);
		tUbigeoManager = factory.getBean("tUbigeoManager", TUbigeoManager.class);
		dimClienteManager = factory.getBean("dimClienteManager", DimClienteManager.class);
		
		constantes = factory.getBean("constantes", Constantes.class);

		int offset = 0;
		
		while(true) {
			
			tAreaClienteExample.clear();
			tAreaClienteExample.createCriteria().andFecNumCamBetween(dateTimeFrom, dateTimeUntil);
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
				tAreaClienteExample.clear();
				tAreaClienteExample.createCriteria().andFecNumCamBetween(dateTimeFrom, dateTimeUntil);
				tAreaClienteExample.createCriteria().andProcIdNotEqualTo(process);
				lstAreaCliente = tAreaClienteManager.selectByExample(tAreaClienteExample);
				if(lstAreaCliente.size()>0){
					for (Iterator<TAreaCliente> iterator = lstAreaCliente.iterator(); iterator.hasNext();) {
						tAreaCliente = iterator.next();
						dimCliente.clear();
						processRecordAreaCliente();
					}
				}
				
				lstAreaCliente.clear();
				tAreaClienteExample.clear();
				offset = 0;
				break;
			}
		}
		
		while(true) {
			
			tClienteExample.clear();
			tClienteExample.createCriteria().andFecNumCamBetween(dateTimeFrom, dateTimeUntil);
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
				tClienteExample.clear();
				tClienteExample.createCriteria().andFecNumCamBetween(dateTimeFrom, dateTimeUntil);
				tClienteExample.createCriteria().andProcIdNotEqualTo(process);
				lstCliente = tClienteManager.selectByExample(tClienteExample);
				if(lstCliente.size()>0){
					for (Iterator<TCliente> iterator = lstCliente.iterator(); iterator.hasNext();) {
						tCliente = iterator.next();
						dimCliente.clear();
						dimClienteExample.clear();
						processRecordCliente();
					}
				}
				
				lstCliente.clear();
				tClienteExample.clear();
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
	
	public void processRecordAreaCliente(){
		
		completeFildAreaCliente();
		
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
	
	public void processRecordCliente(){
		completeFildCliente();
		
		if(updateRecordDimensionalCliente() > constantes.getResultTransactionNoResult()){
			stateRecordGeneric = constantes.getStateRecordProcessed();
			recordProcessed = recordProcessed + 1; 
		} 

		if(tCliente.getProcId() != process){
			updateRecordGenericCliente(stateRecordGeneric);
		}
	}
	
	public void completeFildAreaCliente(){
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
			if(!tCliente.getCliDesRazSoc().equals(constantes.getValueStringDefault())){
				dimCliente.setClienteDesc(tCliente.getCliDesRazSoc());
			}else{
				dimCliente.setClienteDesc(tCliente.getCliDesApePat() + " " + tCliente.getCliDesApeMat() + " " + tCliente.getCliDesNom());
			}
		}
		
		dimCliente.setClienteAreaCod(tAreaCliente.getAreCliCod());
		dimCliente.setClienteAreaDesc(tAreaCliente.getAreCliDes());
		
		if(tAreaCliente.getUbiId() != constantes.getValueNumberDefault()){
			tUbigeo = tUbigeoManager.selectByPrimaryKey(tAreaCliente.getUbiId());
			
			dimCliente.setClienteAreaCodPais(tUbigeo.getUbiCodPais());
			if(tUbigeo.getUbiCodPais() != constantes.getValueNumberDefault()){
				tParametro = tParametroManager.selectByPrimaryKey(tUbigeo.getUbiCodPais());
				dimCliente.setClienteAreaDesPais(tParametro.getParamDes());
			}else{
				dimCliente.setClienteAreaDesPais(constantes.getValueStringDefault());
			}
			
			dimCliente.setClienteAreaCodDepartamento(tUbigeo.getUbiCodDepartamento());
			if(tUbigeo.getUbiCodDepartamento() != constantes.getValueNumberDefault()){
				tParametro = tParametroManager.selectByPrimaryKey(tUbigeo.getUbiCodDepartamento());
				dimCliente.setClienteAreaDescDepartamento(tParametro.getParamDes());
			}else{
				dimCliente.setClienteAreaDescDepartamento(constantes.getValueStringDefault());
			}
			
			dimCliente.setClienteAreaCodProvincia(tUbigeo.getUbiCodProvincia());
			if(tUbigeo.getUbiCodProvincia() != constantes.getValueNumberDefault()){
				tParametro = tParametroManager.selectByPrimaryKey(tUbigeo.getUbiCodProvincia());
				dimCliente.setClienteAreaDescProvincia(tParametro.getParamDes());
			}else{
				dimCliente.setClienteAreaDescProvincia(constantes.getValueStringDefault());
			}
			
			dimCliente.setClienteAreaCodDistrito(tUbigeo.getUbiCodDistrito());
			if(tUbigeo.getUbiCodDistrito() != constantes.getValueNumberDefault()){
				tParametro = tParametroManager.selectByPrimaryKey(tUbigeo.getUbiCodDistrito());
				dimCliente.setClienteAreaDescDistrito(tParametro.getParamDes());
			}else{
				dimCliente.setClienteAreaDescDistrito(constantes.getValueStringDefault());
			}
			
		}else{
			dimCliente.setClienteAreaCodPais(constantes.getValueNumberDefault());
			dimCliente.setClienteAreaDesPais(constantes.getValueStringDefault());
			
			dimCliente.setClienteAreaCodDepartamento(constantes.getValueNumberDefault());
			dimCliente.setClienteAreaDescDepartamento(constantes.getValueStringDefault());
			
			dimCliente.setClienteAreaCodProvincia(constantes.getValueNumberDefault());
			dimCliente.setClienteAreaDescProvincia(constantes.getValueStringDefault());
			
			dimCliente.setClienteAreaCodDistrito(constantes.getValueNumberDefault());
			dimCliente.setClienteAreaDescDistrito(constantes.getValueStringDefault());
		}
		dimCliente.setProcId(process);
	}
	
	public void completeFildCliente(){
		
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
	
	public int insertRecordDimensionalAreaCliente(){
		try{
			resultTransaction = dimClienteManager.insertSelective(dimCliente);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int updateRecordDimensionalAreaCliente(){
		try{
			resultTransaction = dimClienteManager.updateByPrimaryKeySelective(dimCliente);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int updateRecordDimensionalCliente(){
		try{
			resultTransaction = dimClienteManager.updateByExampleSelective(dimCliente, dimClienteExample);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int deleteRecordDimensionalAreaCliente(){
		try{
			resultTransaction = dimClienteManager.deleteByPrimaryKey(dimCliente.getClienteKey());
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction; 
	}
	
	public int deleteRecordDimensionalCliente(){
		try{
			resultTransaction = dimClienteManager.deleteByExample(dimClienteExample);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction; 
	}
	
	public void updateRecordGenericAreaCliente(String statusRecord){
		try{
			int idAreaCliente = tAreaCliente.getAreCliId();
			tAreaCliente.clear();
			tAreaCliente.setAreCliId(idAreaCliente);
			tAreaCliente.setCodIndCam(statusRecord);
			tAreaCliente.setProcId(process);
			tAreaClienteManager.updateByPrimaryKeySelective(tAreaCliente);
		}catch(Exception e){
			
		}
	}
	
	public void updateRecordGenericCliente(String statusRecord){
		try{
			int idCliente = tCliente.getCliId();
			tCliente.clear();
			tCliente.setCliId(idCliente);
			tCliente.setCodIndCam(statusRecord);
			tCliente.setProcId(process);
			tClienteManager.updateByPrimaryKeySelective(tCliente);
		}catch(Exception e){
			
		}
	}
}
