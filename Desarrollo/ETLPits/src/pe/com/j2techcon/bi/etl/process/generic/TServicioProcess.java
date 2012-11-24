package pe.com.j2techcon.bi.etl.process.generic;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.domain.generic.TServicio;
import pe.com.j2techcon.bi.etl.domain.generic.TServicioExample;
import pe.com.j2techcon.bi.etl.domain.origen.TServicios;
import pe.com.j2techcon.bi.etl.domain.origen.TServiciosExample;
import pe.com.j2techcon.bi.etl.logic.generic.TServicioManager;
import pe.com.j2techcon.bi.etl.logic.origen.TServiciosManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.util.Util;

public class TServicioProcess {

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
	
	private TServicios tServicios;
	private TServiciosExample tServiciosExample;
	
	private TServicio tServicio;
	private TServicioExample tServicioExample;
	
	private TServiciosManager tServiciosManager;
	private TServicioManager tServicioManager;
	
	private Constantes constantes;

	static Logger log = Logger.getLogger(TServicioProcess.class);
	
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

	public TServicios gettServicios() {
		return tServicios;
	}

	public void settServicios(TServicios tServicios) {
		this.tServicios = tServicios;
	}

	public TServiciosExample gettServiciosExample() {
		return tServiciosExample;
	}

	public void settServiciosExample(TServiciosExample tServiciosExample) {
		this.tServiciosExample = tServiciosExample;
	}

	public TServicio gettServicio() {
		return tServicio;
	}

	public void settServicio(TServicio tServicio) {
		this.tServicio = tServicio;
	}

	public TServicioExample gettServicioExample() {
		return tServicioExample;
	}

	public void settServicioExample(TServicioExample tServicioExample) {
		this.tServicioExample = tServicioExample;
	}

	public TServiciosManager gettServiciosManager() {
		return tServiciosManager;
	}

	public void settServiciosManager(TServiciosManager tServiciosManager) {
		this.tServiciosManager = tServiciosManager;
	}

	public TServicioManager gettServicioManager() {
		return tServicioManager;
	}

	public void settServicioManager(TServicioManager tServicioManager) {
		this.tServicioManager = tServicioManager;
	}

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public TServicioProcess(BeanFactory factory, int sizePage,
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
		
		tServicioManager = factory.getBean("tServicioManager",TServicioManager.class);
		tServiciosManager = factory.getBean("tServiciosManager",TServiciosManager.class);
		
		tServicios = new TServicios();
		tServiciosExample = new TServiciosExample();
		
		tServicio = new TServicio();
		tServicioExample = new TServicioExample();

		int offset = 0;

		while (true) {

			tServiciosExample.clear();
			
			//Se trabajara solo con las ordenes del negocio de mensajeria local
			tServiciosExample.createCriteria().andCodambitoEqualTo(constantes.getParamCodeTipoAmbitoLocal()).andCodnegocioEqualTo(constantes.getParamCodeTipoNegocioMensajeria()).andBiFecNumCamGreaterThanOrEqualTo(Util.getDateTimeLongAsDate(dateTimeFrom)).andBiFecNumCamLessThan(Util.getDateTimeLongAsDate(dateTimeUntil));
			tServiciosExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);

			List<TServicios> lstServicios = tServiciosManager.selectByExample(tServiciosExample);

			if (lstServicios.size() > 0) {
				for (Iterator<TServicios> iterator = lstServicios.iterator(); iterator.hasNext();) {
					tServicios = iterator.next();
					tServicio.clear();
					processRecordServicio();
				}
				offset = offset + constantes.getSizePage();
			} else {
				tServicios.clear();
				tServiciosExample.clear();

				tServicio.clear();
				tServicioExample.clear();

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

	public void processRecordServicio() throws Exception{
		
		completeFieldServicio();
		
		if(typeProcess.equals(constantes.getTypeProcessSimple())){
			if(tServicio.getCodIndCam().equals(constantes.getStateRecordNew())){
				if(insertRecordGenericServicio()> constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordOrigen = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}else{
				if(updateRecordGenericServicio() > constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordOrigen = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}else{
			if(updateRecordGenericServicio() > constantes.getResultTransactionNoResult()){
				stateRecordOrigen = constantes.getStateRecordProcessed();
				recordProcessed = recordProcessed + 1; 
			}else{
				if(insertRecordGenericServicio() > constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1;
				}else{
					stateRecordOrigen = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}
		updateRecordOrigenServicio(stateRecordOrigen);
	}

	public void completeFieldServicio() throws Exception{

		//Codigo del servicio
		tServicio.setServCod(tServicios.getCodservicio());
		
		//Codigo del negocio
		if(constantes.getParamCodeTipoNegocioMensajeria().equals(tServicios.getCodnegocio())){
			tServicio.setServCodNeg(constantes.getParamSerialTipoNegocioMensajeria());
		}else{
			tServicio.setServCodNeg(constantes.getParamSerialTipoNegocioNoDefinido());
		}
		
		//Codigo del ambito
		if(constantes.getParamCodeTipoAmbitoLocal().equals(tServicios.getCodambito())){
			tServicio.setServCodAmb(constantes.getParamSerialTipoAmbitoLocal());
		}else{
			tServicio.setServCodAmb(constantes.getParamSerialTipoAmbitoNoDefinido());
		}
		
		//Descripion
		tServicio.setServDes(tServicios.getServicio());
		
		//Campos de control
		tServicio.setFecNumCam(Util.getCurrentDateTimeAsLong());
		if(constantes.getStateRecordNew().equals(tServicios.getBiCodIndCam())){
			tServicio.setCodIndCam(constantes.getStateRecordNew());
		}else{
			tServicio.setCodIndCam(constantes.getStateRecordProcessed());
		}
		tServicio.setProcId(process);

	}

	public int insertRecordGenericServicio() throws Exception{
		try {
			resultTransaction = tServicioManager.insertSelective(tServicio);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int updateRecordGenericServicio() throws Exception{
		try {
			tServicioExample.clear();
			tServicioExample.createCriteria().andServCodEqualTo(tServicio.getServCod());	
			resultTransaction = tServicioManager.updateByExampleSelective(tServicio, tServicioExample);	
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int deleteRecordGenericServicio() throws Exception{
		try {
			tServicioExample.clear();
			tServicioExample.createCriteria().andServCodEqualTo(tServicio.getServCod());	
			resultTransaction = tServicioManager.deleteByExample(tServicioExample);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public void updateRecordOrigenServicio(String statusRecord) throws Exception{
		String codServicio = tServicios.getCodservicio();
		tServicios.clear();
		tServicios.setCodservicio(codServicio);
		tServicios.setBiCodIndCam(statusRecord);
		tServiciosManager.updateByPrimaryKeySelective(tServicios);
	}

}
