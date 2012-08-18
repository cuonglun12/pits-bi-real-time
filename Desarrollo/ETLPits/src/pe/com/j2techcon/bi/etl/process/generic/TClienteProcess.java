package pe.com.j2techcon.bi.etl.process.generic;

import java.util.Iterator;
import java.util.List;

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

	private Constantes constantes;
	
	private List<TParametro> lstParametro;

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
		stateRecordOrigen = constantes.getStateRecordNew();
		stateRecordGeneric = constantes.getStateRecordNew();

	}

	public int startProcess() {
		
		tParametroManager = factory.getBean("tParametroManager",TParametroManager.class);
		tClienteManager = factory.getBean("tClienteManager",TClienteManager.class);
		clienteManager = factory.getBean("clienteManager", ClienteManager.class);

		constantes = factory.getBean("constantes", Constantes.class);

		int offset = 0;

		while (true) {
			
			clienteExample.clear();
			clienteExample.createCriteria().andBiFecNumCamGreaterThanOrEqualTo(Util.getDateTimeLongAsDate(dateTimeFrom));
			clienteExample.createCriteria().andBiFecNumCamLessThan(Util.getDateTimeLongAsDate(dateTimeUntil));
			clienteExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			
			List<Cliente> lstCliente = clienteManager.selectByExample(clienteExample);

			if (lstCliente.size() > 0) {
				for (Iterator<Cliente> iterator = lstCliente.iterator(); iterator.hasNext();) {
					cliente = iterator.next();
					tCliente.clear();
					processRecordCliente();
				}
				offset = offset + constantes.getSizePage();
			} else {
				tParametro.clear();
				tParametroExample.clear();

				cliente.clear();
				clienteExample.clear();
				
				tCliente.clear();
				tClienteExample.clear();
				
				lstParametro.clear();

				offset = 0;
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

	public void processRecordCliente() {
		
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

	public void completeFieldCliente() {

		//Tipo de cliente
		if (constantes.getParamCodeTipoClienteJuridica().equals(cliente.getTipocliente())) {
			tCliente.setCliCodTip(constantes.getParamSerialTipoClienteJuridica());
		} else if (constantes.getParamCodeTipoClienteNatural().equals(cliente.getTipocliente())) {
			tCliente.setCliCodTip(constantes.getParamSerialTipoClienteNatural());
		} else if (constantes.getParamCodeTipoClienteEstatal().equals(cliente.getTipocliente())) {
			tCliente.setCliCodTip(constantes.getParamSerialTipoClienteEstatal());
		} else {
			tCliente.setCliCodTip(constantes.getParamSerialTipoClienteNoDefinido());
		}

		//Categoria del cliente (valor por defecto)
		tCliente.setCliCodCat(constantes.getParamSerialCategoriaClienteNoDefinido());

		//Tipo de documento (si longitud es 11=RUC, 8=DNI, Otro)
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

		//Numero de documento
		tCliente.setCliNumTipDoc(cliente.getRuc());

		//Razon Social (+ nombre, paterno, materno)
		tCliente.setCliDesRazSoc(cliente.getCliente());
		tCliente.setCliDesNom(constantes.getValueStringDefault());
		tCliente.setCliDesApePat(constantes.getValueStringDefault());
		tCliente.setCliDesApeMat(constantes.getValueStringDefault());

		//Tipo de facturacion
		if (constantes.getParamCodeTipoFacturacionFacturacion().equals(cliente.getTipoFacturacion())) {
			tCliente.setCliCodTipFac(constantes.getParamSerialTipoFacturacionFacturacion());
		} else {
			tCliente.setCliCodTipFac(constantes.getParamSerialTipoFacturacionNoDefinido());
		}

		// Tipo de credito
		if (constantes.getParamCodeTipoCreditoCredito().equals(cliente.getTipoCredito())) {
			tCliente.setCliCodTipCre(constantes.getParamSerialTipoCreditoCredito());
		} else {
			tCliente.setCliCodTipCre(constantes.getParamSerialTipoCreditoNoDefinido());
		}
		
		//Ubicacion
		tParametroExample.clear();
		tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeUbigeoDistrito());
		tParametroExample.createCriteria().andParamCodEqualTo(cliente.getUbigeo());
		
		lstParametro = tParametroManager.selectByExample(tParametroExample);
		if(lstParametro.size()>0){
			tCliente.setUbiId(lstParametro.get(0).getParamId());
		}else{
			tCliente.setUbiId(constantes.getParamSerialUbigeoDistritoNoDefinido());
		}
		
		//Codigo del cliente
		tCliente.setCliCod(cliente.getCodcliente());
		
		//Numero de telefono
		tCliente.setCliNumTel(cliente.getTelefono());
		
		//Correo electronico
		tCliente.setCliDesCor(cliente.getEmail());
		
		//Direccion
		tCliente.setCliDesDir(cliente.getDireccion());
		
		//Campos de control
		tCliente.setFecNumCam(Util.getCurrentDateTimeAsLong());
		if(constantes.getStateRecordNew().equals(cliente.getBiCodIndCam())){
			tCliente.setCodIndCam(constantes.getStateRecordNew());
		}else{
			tCliente.setCodIndCam(constantes.getStateRecordProcessed());
		}
		tCliente.setProcId(process);

	}

	public int insertRecordGenericCliente() {
		try {
			resultTransaction = tClienteManager.insertSelective(tCliente);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int updateRecordGenericCliente() {
		try {
			tClienteExample.clear();
			tClienteExample.createCriteria().andCliCodEqualTo(tCliente.getCliCod());	
			resultTransaction = tClienteManager.updateByExampleSelective(tCliente, tClienteExample);	
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int deleteRecordGenericCliente() {
		try {
			tClienteExample.clear();
			tClienteExample.createCriteria().andCliCodEqualTo(tCliente.getCliCod());
			resultTransaction = tClienteManager.deleteByExample(tClienteExample);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public void updateRecordOrigenCliente(String statusRecord) {
		try {
			String idCliente = cliente.getCodcliente();
			cliente.clear();
			cliente.setCodcliente(idCliente);
			cliente.setBiCodIndCam(statusRecord);
			clienteManager.updateByPrimaryKeySelective(cliente);
		} catch (Exception e) {

		}
	}

}
