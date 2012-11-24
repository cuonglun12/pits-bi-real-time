package pe.com.j2techcon.bi.etl.process.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.domain.generic.TAreaCliente;
import pe.com.j2techcon.bi.etl.domain.generic.TAreaClienteExample;
import pe.com.j2techcon.bi.etl.domain.generic.TCliente;
import pe.com.j2techcon.bi.etl.domain.generic.TClienteExample;
import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;
import pe.com.j2techcon.bi.etl.domain.origen.Areacliente;
import pe.com.j2techcon.bi.etl.domain.origen.AreaclienteExample;
import pe.com.j2techcon.bi.etl.logic.generic.TAreaClienteManager;
import pe.com.j2techcon.bi.etl.logic.generic.TClienteManager;
import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;
import pe.com.j2techcon.bi.etl.logic.origen.AreaclienteManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.util.Util;

public class TAreaClienteProcess {

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
	
	private String stateRecordOrigen;
	private String stateRecordGeneric;
	
	private TParametro tParametro;
	private TParametroExample tParametroExample;
	
	private TCliente tCliente;
	private TClienteExample tClienteExample;
	
	private Areacliente areaCliente;
	private AreaclienteExample areaClienteExample;
	
	private TAreaCliente tAreaCliente;
	private TAreaClienteExample tAreaClienteExample;
	
	private TParametroManager tParametroManager;
	private TClienteManager tClienteManager;
	private TAreaClienteManager tAreaClienteManager;
	private AreaclienteManager areaClienteManager;
	
	private Map<String,Integer> mpUbigeo;
	
	private Constantes constantes;
	
	private Map<String, Integer> mpCliente;
	
	private List<TParametro> lstParametro;
	private List<TCliente> lstCliente;
	private List<TAreaCliente> lstAreaCliente;
	
	private List<String> lstClientes;

	static Logger log = Logger.getLogger(TAreaClienteProcess.class);

	public TAreaClienteProcess(BeanFactory factory, int sizePage,
			long dateTimeFrom, long dateTimeUntil, String typeProcess,
			int process) throws Exception{
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
		stateRecordOrigen = constantes.getStateRecordNew();
		stateRecordGeneric = constantes.getStateRecordNew();

	}

	public int startProcess() throws Exception{
		
		tParametroManager = factory.getBean("tParametroManager",TParametroManager.class);
		tClienteManager = factory.getBean("tClienteManager",TClienteManager.class);
		tAreaClienteManager = factory.getBean("tAreaClienteManager",TAreaClienteManager.class);
		areaClienteManager = factory.getBean("areaclienteManager",AreaclienteManager.class);
		
		tParametro = new TParametro();
		tParametroExample = new TParametroExample();
		
		tCliente = new TCliente();
		tClienteExample = new TClienteExample();
		
		areaCliente = new Areacliente();
		areaClienteExample = new AreaclienteExample();
		
		tAreaCliente = new TAreaCliente();
		tAreaClienteExample = new TAreaClienteExample();
		
		lstParametro = new ArrayList<TParametro>();
		lstCliente = new ArrayList<TCliente>();
		lstAreaCliente = new ArrayList<TAreaCliente>();
		
		mpUbigeo = new HashMap<String, Integer>();
		tParametroExample.clear();
		tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeUbigeoDistrito());
		lstParametro = tParametroManager.selectByExample(tParametroExample);
		for (Iterator<TParametro> iterator = lstParametro.iterator(); iterator.hasNext();) {
			tParametro = iterator.next();
			mpUbigeo.put(tParametro.getParamCod(),tParametro.getParamId());
		}
		
		mpCliente = new HashMap<String, Integer>();
		lstCliente = tClienteManager.selectByExample(null);
		for (Iterator<TCliente> iterator = lstCliente.iterator(); iterator.hasNext();) {
			tCliente = iterator.next();
			mpCliente.put(tCliente.getCliCod(), tCliente.getCliId());
			
		}

		List<String> lstStateRecord = new ArrayList<String>();
		lstStateRecord.add(constantes.getStateRecordNew());
		lstStateRecord.add(constantes.getStateRecordUpdated());
		
		//int offset = 0;
		
		List<Areacliente> lstAreaClienteOrigen = new ArrayList<Areacliente>();

		while (true) {

			areaClienteExample.clear();
			areaClienteExample.createCriteria().andBiFecNumCamGreaterThanOrEqualTo(Util.getDateTimeLongAsDate(dateTimeFrom)).andBiFecNumCamLessThan(Util.getDateTimeLongAsDate(dateTimeUntil)).andBiCodIndCamIn(lstStateRecord);
			//areaClienteExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			areaClienteExample.setPaginationByClause(" limit " + constantes.getSizePage());
			
			lstAreaClienteOrigen = areaClienteManager.selectByExample(areaClienteExample);

			if (lstAreaClienteOrigen.size() > 0) {
				for (Iterator<Areacliente> iterator = lstAreaClienteOrigen.iterator(); iterator.hasNext();) {
					areaCliente = iterator.next();
					tAreaCliente.clear();
					processRecordAreaCliente();
				}
				lstAreaClienteOrigen.clear();
				//offset = offset + constantes.getSizePage();
			} else {
				
				lstStateRecord.clear();
				
				mpCliente.clear();
				mpUbigeo.clear();
				
				tParametro.clear();
				tParametroExample.clear();
				
				tCliente.clear();
				tClienteExample.clear();
				
				areaCliente.clear();
				areaClienteExample.clear();
				
				tAreaCliente.clear();
				tAreaClienteExample.clear();
				
				lstParametro.clear();
				lstCliente.clear();
				lstAreaClienteOrigen.clear();

				break;
			}
		}

		if (recordRejected > 0) {
			resultProcess = constantes.getResultProcessCompletedErrors();
		} else {
			resultProcess = constantes.getResultProcessCompletedCorrectly();
		}

		recordTotal = recordProcessed + recordRejected;
		
		//Creacion de las areas por defecto de los clientes que no tienen
		
		lstCliente.clear();
		lstAreaCliente.clear();
		tCliente.clear();
		tAreaCliente.clear();
		boolean isTheSameCliente = false;
		
		lstCliente = tClienteManager.selectByExample(null);
		lstAreaCliente = tAreaClienteManager.selectByExample(null);
		
		if(lstCliente.size()>0){
			for (Iterator<TCliente> iteratorCliente = lstCliente.iterator(); iteratorCliente.hasNext();) {
				tCliente = iteratorCliente.next();
				for (Iterator<TAreaCliente> iteratorAreaCliente = lstAreaCliente.iterator(); iteratorAreaCliente.hasNext();) {
					tAreaCliente = iteratorAreaCliente.next();
					if(tCliente.getCliCod().equals(tAreaCliente.getCliCod())){
						isTheSameCliente = true;
					}
				}
				
				if(!isTheSameCliente){
					
					tAreaCliente.clear();
					
					tAreaCliente.setCliId(tCliente.getCliId());
					tAreaCliente.setAreCliCodTip(constantes.getParamSerialTipoAreaClienteNoDefinido());
					tAreaCliente.setUbiId(tCliente.getUbiId());
					tAreaCliente.setAreCliDes(tCliente.getCliDesRazSoc());
					tAreaCliente.setAreCliDesDir(tCliente.getCliDesDir());
					tAreaCliente.setCliCod(tCliente.getCliCod());
					tAreaCliente.setAreCliCod(constantes.getValueStringDefault());
					tAreaCliente.setFecNumCam(Util.getCurrentDateTimeAsLong());
					tAreaCliente.setCodIndCam(constantes.getStateRecordNew());
					tAreaCliente.setProcId(process);
					
					insertRecordGenericAreaCliente();
					
					isTheSameCliente = false;
				}
			}
		}
		
		lstCliente.clear();
		lstAreaCliente.clear();
		tCliente.clear();
		tAreaCliente.clear();

		return resultProcess;
	}

	public void processRecordAreaCliente() throws Exception{
		
		completeFieldAreaCliente();
		
		//Verificamos la existencia del Cliente
		if(tAreaCliente.getCliId() != null){
			if(typeProcess.equals(constantes.getTypeProcessSimple())){
				if(tAreaCliente.getCodIndCam().equals(constantes.getStateRecordNew())){
					if(insertRecordGenericAreaCliente()> constantes.getResultTransactionNoResult()){
						stateRecordOrigen = constantes.getStateRecordProcessed();
						recordProcessed = recordProcessed + 1; 
					} else{
						stateRecordOrigen = constantes.getStateRecordInconsistent();
						recordRejected = recordRejected + 1;
					}
				}else{
					if(updateRecordGenericAreaCliente() > constantes.getResultTransactionNoResult()){
						stateRecordOrigen = constantes.getStateRecordProcessed();
						recordProcessed = recordProcessed + 1; 
					} else{
						stateRecordOrigen = constantes.getStateRecordInconsistent();
						recordRejected = recordRejected + 1;
					}
				}
			}else{
				if(updateRecordGenericAreaCliente() > constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				}else{
					if(insertRecordGenericAreaCliente() > constantes.getResultTransactionNoResult()){
						stateRecordOrigen = constantes.getStateRecordProcessed();
						recordProcessed = recordProcessed + 1;
					}else{
						stateRecordOrigen = constantes.getStateRecordInconsistent();
						recordRejected = recordRejected + 1;
					}
				}
			}
			
			updateRecordOrigenAreaCliente(stateRecordOrigen);
		}else{
			stateRecordOrigen = constantes.getStateRecordInconsistent();
			recordRejected = recordRejected + 1;
			updateRecordOrigenAreaCliente(stateRecordOrigen);
		}
	}

	public void completeFieldAreaCliente() throws Exception{

		//Id de cliente
		tAreaCliente.setCliId(getCliId(areaCliente.getCodcliente()));
		
		if(tAreaCliente.getCliId() != null){
			//Tipo de area del cliente: Se le asigna a todos el tipo CENTRAL
			tAreaCliente.setAreCliCodTip(constantes.getParamSerialTipoAreaClienteCentral());
			
			//Ubicacion
			if(areaCliente.getUbigeo() != null && areaCliente.getUbigeo().length()>0){
				tAreaCliente.setUbiId(mpUbigeo.get(areaCliente.getUbigeo()));
				if(tAreaCliente.getUbiId() == null){
					tAreaCliente.setUbiId(constantes.getParamSerialUbigeoDistritoNoDefinido());
				}
			}else{
				tAreaCliente.setUbiId(constantes.getParamSerialUbigeoDistritoNoDefinido());
			}
			
			//Descripcion del area del cliente
			tAreaCliente.setAreCliDes(areaCliente.getAreacliente());
			
			//Direccion del area del cliente
			tAreaCliente.setAreCliDesDir(areaCliente.getDireccion());
			
			//Codigo del cliente
			tAreaCliente.setCliCod(areaCliente.getCodcliente());
			
			//Codigo del area del cliente
			tAreaCliente.setAreCliCod(areaCliente.getCodareacliente());
			
			//Campos de control
			tAreaCliente.setFecNumCam(Util.getCurrentDateTimeAsLong());
			if(constantes.getStateRecordNew().equals(areaCliente.getBiCodIndCam())){
				tAreaCliente.setCodIndCam(constantes.getStateRecordNew());
			}else{
				tAreaCliente.setCodIndCam(constantes.getStateRecordUpdated());
			}
			tAreaCliente.setProcId(process);
		}
		
	}

	public int insertRecordGenericAreaCliente() throws Exception{
		try {
			resultTransaction = tAreaClienteManager.insertSelective(tAreaCliente);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int updateRecordGenericAreaCliente() throws Exception{
		try {
			tAreaClienteExample.clear();
			tAreaClienteExample.createCriteria().andCliCodEqualTo(tAreaCliente.getCliCod()).andAreCliCodEqualTo(tAreaCliente.getAreCliCod());
			tAreaCliente.setCliCod(null);
			tAreaCliente.setAreCliCod(null);
			resultTransaction = tAreaClienteManager.updateByExampleSelective(tAreaCliente, tAreaClienteExample);	
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int deleteRecordGenericAreaCliente() throws Exception{
		try {
			tAreaClienteExample.clear();
			tAreaClienteExample.createCriteria().andCliCodEqualTo(tAreaCliente.getCliCod()).andAreCliCodEqualTo(tAreaCliente.getAreCliCod());
			resultTransaction = tAreaClienteManager.deleteByExample(tAreaClienteExample);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public void updateRecordOrigenAreaCliente(String statusRecord) throws Exception{
		String idCliente = areaCliente.getCodcliente();
		String idAreaCliente = areaCliente.getCodareacliente();
		areaCliente.clear();
		areaCliente.setCodcliente(idCliente);
		areaCliente.setCodareacliente(idAreaCliente);
		areaCliente.setBiCodIndCam(statusRecord);
		//areaCliente.setBiFecNumCam(Util.getCurrentDateTime());
		areaClienteManager.updateByPrimaryKeySelective(areaCliente);
	}
	
	public Integer getCliId(String codCliente)throws Exception{
		return mpCliente.get(codCliente);
	}

	
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

	
	public String getStateRecordOrigen() {
		return stateRecordOrigen;
	}

	
	public void setStateRecordOrigen(String stateRecordOrigen) {
		this.stateRecordOrigen = stateRecordOrigen;
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

	
	public Areacliente getAreaCliente() {
		return areaCliente;
	}

	
	public void setAreaCliente(Areacliente areaCliente) {
		this.areaCliente = areaCliente;
	}

	
	public AreaclienteExample getAreaClienteExample() {
		return areaClienteExample;
	}

	
	public void setAreaClienteExample(AreaclienteExample areaClienteExample) {
		this.areaClienteExample = areaClienteExample;
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

	
	public TParametroManager gettParametroManager() {
		return tParametroManager;
	}

	
	public void settParametroManager(TParametroManager tParametroManager) {
		this.tParametroManager = tParametroManager;
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

	
	public AreaclienteManager getAreaClienteManager() {
		return areaClienteManager;
	}

	
	public void setAreaClienteManager(AreaclienteManager areaClienteManager) {
		this.areaClienteManager = areaClienteManager;
	}

	
	public Map<String, Integer> getMpUbigeo() {
		return mpUbigeo;
	}

	
	public void setMpUbigeo(Map<String, Integer> mpUbigeo) {
		this.mpUbigeo = mpUbigeo;
	}

	
	public Constantes getConstantes() {
		return constantes;
	}

	
	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	
	public Map<String, Integer> getMpCliente() {
		return mpCliente;
	}

	
	public void setMpCliente(Map<String, Integer> mpCliente) {
		this.mpCliente = mpCliente;
	}

	
	public List<TParametro> getLstParametro() {
		return lstParametro;
	}

	
	public void setLstParametro(List<TParametro> lstParametro) {
		this.lstParametro = lstParametro;
	}

	
	public List<TCliente> getLstCliente() {
		return lstCliente;
	}

	
	public void setLstCliente(List<TCliente> lstCliente) {
		this.lstCliente = lstCliente;
	}

	
	public List<TAreaCliente> getLstAreaCliente() {
		return lstAreaCliente;
	}

	
	public void setLstAreaCliente(List<TAreaCliente> lstAreaCliente) {
		this.lstAreaCliente = lstAreaCliente;
	}

	
	public List<String> getLstClientes() {
		return lstClientes;
	}

	
	public void setLstClientes(List<String> lstClientes) {
		this.lstClientes = lstClientes;
	}
}
