package pe.com.j2techcon.bi.etl.process.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.domain.generic.TCliente;
import pe.com.j2techcon.bi.etl.domain.generic.TClienteExample;
import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;
import pe.com.j2techcon.bi.etl.domain.origen.Cliente;
import pe.com.j2techcon.bi.etl.domain.origen.ClienteExample;
import pe.com.j2techcon.bi.etl.logic.generic.TClienteManager;
import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;
import pe.com.j2techcon.bi.etl.logic.origen.ClienteManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.util.Util;

public class TClienteProcess {

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

	private Cliente cliente;
	private ClienteExample clienteExample;

	private TParametroManager tParametroManager;
	private TClienteManager tClienteManager;
	private ClienteManager clienteManager;
	
	private Map<String,Integer> mpTipoCliente;
	private Map<String,Integer> mpTipoDocumento;
	private Map<String,Integer> mpTipoFacturacion;
	private Map<String,Integer> mpTipoCredito;
	private Map<String,Integer> mpUbigeo;

	private Constantes constantes;
	
	private List<TParametro> lstParametro;

	static Logger log = Logger.getLogger(TClienteProcess.class);
	
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ClienteExample getClienteExample() {
		return clienteExample;
	}

	public void setClienteExample(ClienteExample clienteExample) {
		this.clienteExample = clienteExample;
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

	public ClienteManager getClienteManager() {
		return clienteManager;
	}

	public void setClienteManager(ClienteManager clienteManager) {
		this.clienteManager = clienteManager;
	}

	public Map<String, Integer> getMpTipoCliente() {
		return mpTipoCliente;
	}

	public void setMpTipoCliente(Map<String, Integer> mpTipoCliente) {
		this.mpTipoCliente = mpTipoCliente;
	}

	public Map<String, Integer> getMpTipoDocumento() {
		return mpTipoDocumento;
	}

	public void setMpTipoDocumento(Map<String, Integer> mpTipoDocumento) {
		this.mpTipoDocumento = mpTipoDocumento;
	}

	public Map<String, Integer> getMpTipoFacturacion() {
		return mpTipoFacturacion;
	}

	public void setMpTipoFacturacion(Map<String, Integer> mpTipoFacturacion) {
		this.mpTipoFacturacion = mpTipoFacturacion;
	}

	public Map<String, Integer> getMpTipoCredito() {
		return mpTipoCredito;
	}

	public void setMpTipoCredito(Map<String, Integer> mpTipoCredito) {
		this.mpTipoCredito = mpTipoCredito;
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

	public List<TParametro> getLstParametro() {
		return lstParametro;
	}

	public void setLstParametro(List<TParametro> lstParametro) {
		this.lstParametro = lstParametro;
	}

	public TClienteProcess(BeanFactory factory, int sizePage,
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
		stateRecordOrigen = constantes.getStateRecordNew();
		stateRecordGeneric = constantes.getStateRecordNew();

	}

	public int startProcess() throws Exception{
		
		tParametroManager = factory.getBean("tParametroManager",TParametroManager.class);
		tClienteManager = factory.getBean("tClienteManager",TClienteManager.class);
		clienteManager = factory.getBean("clienteManager", ClienteManager.class);
		
		tParametro = new TParametro();
		tParametroExample = new TParametroExample();

		tCliente = new TCliente();
		tClienteExample = new TClienteExample();

		cliente = new Cliente();
		clienteExample = new ClienteExample();
		
		lstParametro = new ArrayList<TParametro>();

		mpTipoCliente = new HashMap<String, Integer>();
		tParametroExample.clear();
		tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeTipoCliente());
		lstParametro = tParametroManager.selectByExample(tParametroExample);
		for (Iterator<TParametro> iterator = lstParametro.iterator(); iterator.hasNext();) {
			tParametro = iterator.next();
			mpTipoCliente.put(tParametro.getParamCod(),tParametro.getParamId());
		}
		
		mpTipoDocumento = new HashMap<String, Integer>();
		tParametroExample.clear();
		tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeTipoDocumento());
		lstParametro = tParametroManager.selectByExample(tParametroExample);
		for (Iterator<TParametro> iterator = lstParametro.iterator(); iterator.hasNext();) {
			tParametro = iterator.next();
			mpTipoDocumento.put(tParametro.getParamCod(),tParametro.getParamId());
		}
		
		mpTipoFacturacion = new HashMap<String, Integer>();
		tParametroExample.clear();
		tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeTipoFacturacion());
		lstParametro = tParametroManager.selectByExample(tParametroExample);
		for (Iterator<TParametro> iterator = lstParametro.iterator(); iterator.hasNext();) {
			tParametro = iterator.next();
			mpTipoFacturacion.put(tParametro.getParamCod(),tParametro.getParamId());
		}
		
		mpTipoCredito = new HashMap<String, Integer>();
		tParametroExample.clear();
		tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeTipoCredito());
		lstParametro = tParametroManager.selectByExample(tParametroExample);
		for (Iterator<TParametro> iterator = lstParametro.iterator(); iterator.hasNext();) {
			tParametro = iterator.next();
			mpTipoCredito.put(tParametro.getParamCod(),tParametro.getParamId());
		}
		
		mpUbigeo = new HashMap<String, Integer>();
		tParametroExample.clear();
		tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeUbigeoDistrito());
		lstParametro = tParametroManager.selectByExample(tParametroExample);
		for (Iterator<TParametro> iterator = lstParametro.iterator(); iterator.hasNext();) {
			tParametro = iterator.next();
			mpUbigeo.put(tParametro.getParamCod(),tParametro.getParamId());
		}

		List<String> lstStateRecord = new ArrayList<String>();
		lstStateRecord.add(constantes.getStateRecordNew());
		lstStateRecord.add(constantes.getStateRecordUpdated());
		
		//int offset = 0;
		
		List<Cliente> lstCliente = new ArrayList<Cliente>();

		while (true) {
			
			clienteExample.clear();
			clienteExample.createCriteria().andBiFecNumCamGreaterThanOrEqualTo(Util.getDateTimeLongAsDate(dateTimeFrom)).andBiFecNumCamLessThan(Util.getDateTimeLongAsDate(dateTimeUntil)).andBiCodIndCamIn(lstStateRecord);
			//clienteExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			clienteExample.setPaginationByClause(" limit " + constantes.getSizePage());
			
			lstCliente = clienteManager.selectByExample(clienteExample);

			if (lstCliente.size() > 0) {
				for (Iterator<Cliente> iterator = lstCliente.iterator(); iterator.hasNext();) {
					cliente = iterator.next();
					tCliente.clear();
					processRecordCliente();
				}
				lstCliente.clear();
				//offset = offset + constantes.getSizePage();
			} else {
				
				lstStateRecord.clear();
				lstCliente.clear();
				
				tParametro.clear();
				tParametroExample.clear();

				cliente.clear();
				clienteExample.clear();
				
				tCliente.clear();
				tClienteExample.clear();
				
				mpTipoCliente.clear();
				mpTipoCredito.clear();
				mpTipoDocumento.clear();
				mpTipoFacturacion.clear();
				mpUbigeo.clear();
				
				lstParametro.clear();
				
				break;
			}
		}

		if (recordRejected > 0) {
			resultProcess = constantes.getResultProcessCompletedErrors();
		} else {
			resultProcess = constantes.getResultProcessCompletedCorrectly();
		}

		recordTotal = recordProcessed + recordRejected;

		return resultProcess;
	}

	public void processRecordCliente() throws Exception{
		
		completeFieldCliente();
		
		if(typeProcess.equals(constantes.getTypeProcessSimple())){
			if(tCliente.getCodIndCam().equals(constantes.getStateRecordNew())){
				if(insertRecordGenericCliente()> constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordOrigen = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}else{
				if(updateRecordGenericCliente() > constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordOrigen = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}else{
			if(updateRecordGenericCliente() > constantes.getResultTransactionNoResult()){
				stateRecordOrigen = constantes.getStateRecordProcessed();
				recordProcessed = recordProcessed + 1; 
			}else{
				if(insertRecordGenericCliente() > constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1;
				}else{
					stateRecordOrigen = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}
		
		updateRecordOrigenCliente(stateRecordOrigen);
		
	}

	public void completeFieldCliente() throws Exception{

		tCliente.setCliCodTip(mpTipoCliente.get(cliente.getTipocliente()));
		if(tCliente.getCliCodTip() == null){
			tCliente.setCliCodTip(constantes.getParamSerialTipoClienteNoDefinido());
		}

		tCliente.setCliCodCat(constantes.getParamSerialCategoriaClienteNoDefinido());

		if (cliente.getRuc() != null) {
			if (cliente.getRuc().trim().length() == 11) {
				tCliente.setCliCodTipDoc(constantes.getParamSerialTipoDocumentoRuc());
			} else if (cliente.getRuc().trim().length() == 8) {
				tCliente.setCliCodTipDoc(constantes.getParamSerialTipoDocumentoDni());
			} else {
				tCliente.setCliCodTipDoc(constantes.getParamSerialTipoDocumentoNoDefinido());
			}
		} else {
			tCliente.setCliCodTipDoc(constantes.getParamSerialTipoDocumentoNoDefinido());
		}

		tCliente.setCliNumTipDoc(cliente.getRuc());

		tCliente.setCliDesRazSoc(cliente.getCliente());
		tCliente.setCliDesNom(constantes.getValueStringDefault());
		tCliente.setCliDesApePat(constantes.getValueStringDefault());
		tCliente.setCliDesApeMat(constantes.getValueStringDefault());

		tCliente.setCliCodTipFac(mpTipoFacturacion.get(cliente.getTipoFacturacion()));
		if(tCliente.getCliCodTipFac() == null){
			tCliente.setCliCodTipFac(constantes.getParamSerialTipoFacturacionNoDefinido());
		}

		tCliente.setCliCodTipCre(mpTipoCredito.get(cliente.getTipoCredito()));
		if(tCliente.getCliCodTipCre() == null){
			tCliente.setCliCodTipCre(constantes.getParamSerialTipoCreditoNoDefinido());
		}
		
		if(cliente.getUbigeo() != null && cliente.getUbigeo().length()>0){
			tCliente.setUbiId(mpUbigeo.get(cliente.getUbigeo()));
			if(tCliente.getUbiId() == null){
				tCliente.setUbiId(constantes.getParamSerialUbigeoDistritoNoDefinido());
			}
		}else{
			tCliente.setUbiId(constantes.getParamSerialUbigeoDistritoNoDefinido());
		}

		tCliente.setCliCod(cliente.getCodcliente());
		
		tCliente.setCliNumTel(cliente.getTelefono());
		
		tCliente.setCliDesCor(cliente.getEmail());
		
		tCliente.setCliDesDir(cliente.getDireccion());
		
		tCliente.setFecNumCam(Util.getCurrentDateTimeAsLong());
		if(constantes.getStateRecordNew().equals(cliente.getBiCodIndCam())){
			tCliente.setCodIndCam(constantes.getStateRecordNew());
		}else{
			tCliente.setCodIndCam(constantes.getStateRecordUpdated());
		}
		tCliente.setProcId(process);

	}

	public int insertRecordGenericCliente() throws Exception{
		try {
			resultTransaction = tClienteManager.insertSelective(tCliente);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int updateRecordGenericCliente() throws Exception{
		try {
			tClienteExample.clear();
			tClienteExample.createCriteria().andCliCodEqualTo(tCliente.getCliCod());	
			tCliente.setCliCod(null);
			resultTransaction = tClienteManager.updateByExampleSelective(tCliente, tClienteExample);	
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int deleteRecordGenericCliente() throws Exception{
		try {
			tClienteExample.clear();
			tClienteExample.createCriteria().andCliCodEqualTo(tCliente.getCliCod());
			resultTransaction = tClienteManager.deleteByExample(tClienteExample);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public void updateRecordOrigenCliente(String statusRecord) throws Exception{
		String idCliente = cliente.getCodcliente();
		cliente.clear();
		cliente.setCodcliente(idCliente);
		cliente.setBiCodIndCam(statusRecord);
		//cliente.setBiFecNumCam(Util.getCurrentDateTime());
		clienteManager.updateByPrimaryKeySelective(cliente);
	}

}
