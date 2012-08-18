package pe.com.j2techcon.bi.etl.process.generic;

import java.util.Iterator;
import java.util.List;

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
	
	private Constantes constantes;
	
	private List<TParametro> lstParametro;
	private List<TCliente> lstCliente;
	private List<TAreaCliente> lstAreaCliente;

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

	public TAreaClienteProcess(BeanFactory factory, int sizePage,
			long dateTimeFrom, long dateTimeUntil, String typeProcess,
			int process) {
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
		tAreaClienteManager = factory.getBean("tAreaClienteManager",TAreaClienteManager.class);
		areaClienteManager = factory.getBean("areaClienteManager",AreaclienteManager.class);

		constantes = factory.getBean("constantes", Constantes.class);

		int offset = 0;

		while (true) {

			areaClienteExample.clear();
			areaClienteExample.createCriteria().andBiFecNumCamGreaterThanOrEqualTo(Util.getDateTimeLongAsDate(dateTimeFrom));
			areaClienteExample.createCriteria().andBiFecNumCamLessThan(Util.getDateTimeLongAsDate(dateTimeUntil));
			areaClienteExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			
			List<Areacliente> lstAreaCliente = areaClienteManager.selectByExample(areaClienteExample);

			if (lstAreaCliente.size() > 0) {
				for (Iterator<Areacliente> iterator = lstAreaCliente.iterator(); iterator.hasNext();) {
					areaCliente = iterator.next();
					tAreaCliente.clear();
					processRecordAreaCliente();
				}
				offset = offset + constantes.getSizePage();
			} else {
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
				lstAreaCliente.clear();

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

	public void processRecordAreaCliente() {
		
		completeFieldAreaCliente();
		
		//Verificamos la existencia del Cliente
		if(tAreaCliente.getCliId() != constantes.getValueNumberCero()){
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

	public void completeFieldAreaCliente() {

		//Id de cliente
		tAreaCliente.setCliId(getCliId(areaCliente.getCodcliente()));
		
		if(tAreaCliente.getCliId() != constantes.getValueNumberCero()){
			//Tipo de area del cliente: Se le asigna a todos el tipo CENTRAL
			tAreaCliente.setAreCliCodTip(constantes.getParamSerialTipoAreaClienteCentral());
			
			//Ubicacion
			tParametroExample.clear();
			tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeUbigeoDistrito());
			tParametroExample.createCriteria().andParamCodEqualTo(areaCliente.getUbigeo());
			
			lstParametro = tParametroManager.selectByExample(tParametroExample);
			if(lstParametro.size()>0){
				tAreaCliente.setUbiId(lstParametro.get(0).getParamId());
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
				tAreaCliente.setCodIndCam(constantes.getStateRecordProcessed());
			}
			tAreaCliente.setProcId(process);
		}
		
	}

	public int insertRecordGenericAreaCliente() {
		try {
			resultTransaction = tAreaClienteManager.insertSelective(tAreaCliente);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int updateRecordGenericAreaCliente() {
		try {
			tAreaClienteExample.clear();
			tAreaClienteExample.createCriteria().andCliCodEqualTo(tAreaCliente.getCliCod());
			tAreaClienteExample.createCriteria().andAreCliCodEqualTo(tAreaCliente.getAreCliCod());	
			resultTransaction = tAreaClienteManager.updateByExampleSelective(tAreaCliente, tAreaClienteExample);	
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int deleteRecordGenericAreaCliente() {
		try {
			tAreaClienteExample.clear();
			tAreaClienteExample.createCriteria().andCliCodEqualTo(tAreaCliente.getCliCod());
			tAreaClienteExample.createCriteria().andAreCliCodEqualTo(tAreaCliente.getAreCliCod());
			resultTransaction = tAreaClienteManager.deleteByExample(tAreaClienteExample);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public void updateRecordOrigenAreaCliente(String statusRecord) {
		try {
			String idCliente = areaCliente.getCodcliente();
			String idAreaCliente = areaCliente.getCodareacliente();
			areaCliente.clear();
			areaCliente.setCodcliente(idCliente);
			areaCliente.setCodareacliente(idAreaCliente);
			areaCliente.setBiCodIndCam(statusRecord);
			areaClienteManager.updateByPrimaryKeySelective(areaCliente);
		} catch (Exception e) {

		}
	}
	
	public int getCliId(String codCliente){
		int cliId = constantes.getValueNumberCero();
		if(codCliente.equals(tCliente.getCliCod())){
			cliId = tCliente.getCliId();
		}else{
			tClienteExample.clear();
			tClienteExample.createCriteria().andCliCodEqualTo(codCliente);
			lstCliente = tClienteManager.selectByExample(tClienteExample);
			if(lstCliente.size()>0){
				tCliente = lstCliente.get(0);
				cliId = tCliente.getCliId();
			}
		}
		
		return cliId;
	}
}
