package pe.com.j2techcon.bi.etl.process.dimensional;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.logic.dimensional.FactCotizacionManager;
import pe.com.j2techcon.bi.etl.logic.generic.TCotizacionManager;
import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;
import pe.com.j2techcon.bi.etl.logic.generic.TUbigeoManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactCotizacion;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactCotizacionExample;
import pe.com.j2techcon.bi.etl.domain.generic.TCotizacion;
import pe.com.j2techcon.bi.etl.domain.generic.TCotizacionExample;
import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;
import pe.com.j2techcon.bi.etl.domain.generic.TUbigeo;
import pe.com.j2techcon.bi.etl.domain.generic.TUbigeoExample;


public class FactCotizacionProcess {
	
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
	
	private TCotizacion tCotizacion;
	private TCotizacionExample tCotizacionExample;
	
	private TParametro tParametro;
	private TParametroExample tParametroExample;
	
	private FactCotizacion dimCotizacion;
	private FactCotizacionExample dimCotizacionExample;
	
	private TCotizacionManager tCotizacionManager;
	private TParametroManager tParametroManager; 
	private FactCotizacionManager dimCotizacionManager;
	
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

	public TCotizacion gettCotizacion() {
		return tCotizacion;
	}

	public void settCotizacion(TCotizacion tCotizacion) {
		this.tCotizacion = tCotizacion;
	}

	public TCotizacionExample gettCotizacionExample() {
		return tCotizacionExample;
	}

	public void settCotizacionExample(TCotizacionExample tCotizacionExample) {
		this.tCotizacionExample = tCotizacionExample;
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

	public FactCotizacion getFactCotizacion() {
		return dimCotizacion;
	}

	public void setFactCotizacion(FactCotizacion dimCotizacion) {
		this.dimCotizacion = dimCotizacion;
	}

	public FactCotizacionExample getFactCotizacionExample() {
		return dimCotizacionExample;
	}

	public void setFactCotizacionExample(FactCotizacionExample dimCotizacionExample) {
		this.dimCotizacionExample = dimCotizacionExample;
	}

	public TCotizacionManager gettCotizacionManager() {
		return tCotizacionManager;
	}

	public void settCotizacionManager(TCotizacionManager tCotizacionManager) {
		this.tCotizacionManager = tCotizacionManager;
	}

	public TParametroManager gettParametroManager() {
		return tParametroManager;
	}

	public void settParametroManager(TParametroManager tParametroManager) {
		this.tParametroManager = tParametroManager;
	}

	public FactCotizacionManager getFactCotizacionManager() {
		return dimCotizacionManager;
	}

	public void setFactCotizacionManager(FactCotizacionManager dimCotizacionManager) {
		this.dimCotizacionManager = dimCotizacionManager;
	}

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public FactCotizacionProcess(BeanFactory factory, int sizePage,
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

		tCotizacionManager = factory.getBean("tCotizacionManager", TCotizacionManager.class);
		tParametroManager = factory.getBean("tParametroManager", TParametroManager.class);
		dimCotizacionManager = factory.getBean("dimCotizacionManager", FactCotizacionManager.class);
		
		constantes = factory.getBean("constantes", Constantes.class);

		int offset = 0;
		
		while(true) {
			
			tCotizacionExample.clear();
			tCotizacionExample.createCriteria().andFecNumCamBetween(dateTimeFrom, dateTimeUntil);
			tCotizacionExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			List<TCotizacion> lstCotizacion = tCotizacionManager.selectByExample(tCotizacionExample);
			if(lstCotizacion.size()>0){
				for (Iterator<TCotizacion> iterator = lstCotizacion.iterator(); iterator.hasNext();) {
					tCotizacion = iterator.next();
					dimCotizacion.clear();
					processRecordCotizacion();
				}
				offset = offset + constantes.getSizePage();
			}
			
			if(lstCotizacion.size()<constantes.getSizePage()){
				
				tCotizacionExample.clear();
				tCotizacionExample.createCriteria().andFecNumCamBetween(dateTimeFrom, dateTimeUntil);
				tCotizacionExample.createCriteria().andProcIdNotEqualTo(process);
				lstCotizacion = tCotizacionManager.selectByExample(tCotizacionExample);
				if(lstCotizacion.size()>0){
					for (Iterator<TCotizacion> iterator = lstCotizacion.iterator(); iterator.hasNext();) {
						tCotizacion = iterator.next();
						dimCotizacion.clear();
						processRecordCotizacion();
					}
				}
				
				lstCotizacion.clear();
				tCotizacionExample.clear();
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
	
	public void processRecordCotizacion(){
		
		completeFildCotizacion();
		
		if(typeProcess.equals(constantes.getTypeProcessSimple())){
			if(tCotizacion.getCodIndCam().equals(constantes.getStateRecordNew())){
				if(insertRecordDimensionalCotizacion()> constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}else{
				if(updateRecordDimensionalCotizacion() > constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}else{
			if(updateRecordDimensionalCotizacion() > constantes.getResultTransactionNoResult()){
				stateRecordGeneric = constantes.getStateRecordProcessed();
				recordProcessed = recordProcessed + 1; 
			}else{
				if(insertRecordDimensionalCotizacion() > constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1;
				}else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}
		
		updateRecordGenericCotizacion(stateRecordGeneric);
	}
	
	public void completeFildCotizacion(){
		dimCotizacion.setCotizacionKey(tCotizacion.getCotiId());
		dimCotizacion.setCotizacionKeyClienteArea(tCotizacion.getAreCliId());
		dimCotizacion.setCotizacionKeyServicio(tCotizacion.getCotiCodServ());
		dimCotizacion.setCotizacionKeyProducto(tCotizacion.get);
		
		dimCotizacion.setCotizacionCodPais(tUbigeo.getUbiCodPais());
		if(tUbigeo.getUbiCodPais() != constantes.getValueNumberDefault()){
			tParametro = tParametroManager.selectByPrimaryKey(tUbigeo.getUbiCodPais());
			dimCotizacion.setCotizacionDescPais(tParametro.getParamDes());
		}else{
			dimCotizacion.setCotizacionDescPais(constantes.getValueStringDefault());
		}
		
		dimCotizacion.setCotizacionCodDepartamento(tUbigeo.getUbiCodDepartamento());
		if(tUbigeo.getUbiCodDepartamento() != constantes.getValueNumberDefault()){
			tParametro = tParametroManager.selectByPrimaryKey(tUbigeo.getUbiCodDepartamento());
			dimCotizacion.setCotizacionDescDepartamento(tParametro.getParamDes());
		}else{
			dimCotizacion.setCotizacionDescDepartamento(constantes.getValueStringDefault());
		}
		
		dimCotizacion.setCotizacionCodProvincia(tUbigeo.getUbiCodProvincia());
		if(tUbigeo.getUbiCodProvincia() != constantes.getValueNumberDefault()){
			tParametro = tParametroManager.selectByPrimaryKey(tUbigeo.getUbiCodProvincia());
			dimCotizacion.setCotizacionDescProvincia(tParametro.getParamDes());
		}else{
			dimCotizacion.setCotizacionDescProvincia(constantes.getValueStringDefault());
		}
		
		dimCotizacion.setCotizacionCodDistrito(tUbigeo.getUbiCodDistrito());
		if(tUbigeo.getUbiCodDistrito() != constantes.getValueNumberDefault()){
			tParametro = tParametroManager.selectByPrimaryKey(tUbigeo.getUbiCodDistrito());
			dimCotizacion.setCotizacionDescDistrito(tParametro.getParamDes());
		}else{
			dimCotizacion.setCotizacionDescDistrito(constantes.getValueStringDefault());
		}
		
		dimCotizacion.setCotizacionCod(tCotizacion.getZonCod());
		dimCotizacion.setCotizacionCodPostal(tCotizacion.getZonCodPostal());
		dimCotizacion.setCotizacionDesc(tCotizacion.getZonDes());
		dimCotizacion.setProcId(process);
	}
	
	public int insertRecordDimensionalCotizacion(){
		try{
			resultTransaction = dimCotizacionManager.insertSelective(dimCotizacion);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int updateRecordDimensionalCotizacion(){
		try{
			resultTransaction = dimCotizacionManager.updateByPrimaryKeySelective(dimCotizacion);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int deleteRecordDimensionalCotizacion(){
		try{
			resultTransaction = dimCotizacionManager.deleteByPrimaryKey(dimCotizacion.getCotizacionKey());
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction; 
	}
	
	public void updateRecordGenericCotizacion(String statusRecord){
		try{
			int idCotizacion = tCotizacion.getZonId();
			tCotizacion.clear();
			tCotizacion.setZonId(idCotizacion);
			tCotizacion.setCodIndCam(statusRecord);
			tCotizacion.setProcId(process);
			tCotizacionManager.updateByPrimaryKeySelective(tCotizacion);
		}catch(Exception e){
			
		}
	}
}
