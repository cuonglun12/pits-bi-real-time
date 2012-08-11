package pe.com.j2techcon.bi.etl.process.generic;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.domain.generic.TEmpleado;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleadoCategoria;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleadoCategoriaExample;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleadoExample;
import pe.com.j2techcon.bi.etl.domain.origen.Personal;
import pe.com.j2techcon.bi.etl.domain.origen.PersonalExample;
import pe.com.j2techcon.bi.etl.logic.generic.TEmpleadoCategoriaManager;
import pe.com.j2techcon.bi.etl.logic.generic.TEmpleadoManager;
import pe.com.j2techcon.bi.etl.logic.origen.PersonalManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.util.Util;

public class TEmpleadoProcess {

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
	
	private Personal personal;
	private PersonalExample personalExample;
	
	private TEmpleado tEmpleado;
	private TEmpleadoExample tEmpleadoExample;
	
	private TEmpleadoCategoria tEmpleadoCategoria;
	private TEmpleadoCategoriaExample tEmpleadoCategoriaExample;
	
	private PersonalManager personalManager;
	private TEmpleadoManager tEmpleadoManager;
	private TEmpleadoCategoriaManager tEmpleadoCategoriaManager;
	
	private List<TEmpleado> lstEmpleado;
	private List<TEmpleadoCategoria> lstEmpleadoCategoria;
	
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

	public Personal getPersonal() {
		return personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

	public PersonalExample getPersonalExample() {
		return personalExample;
	}

	public void setPersonalExample(PersonalExample personalExample) {
		this.personalExample = personalExample;
	}

	public TEmpleado gettEmpleado() {
		return tEmpleado;
	}

	public void settEmpleado(TEmpleado tEmpleado) {
		this.tEmpleado = tEmpleado;
	}

	public TEmpleadoExample gettEmpleadoExample() {
		return tEmpleadoExample;
	}

	public void settEmpleadoExample(TEmpleadoExample tEmpleadoExample) {
		this.tEmpleadoExample = tEmpleadoExample;
	}

	public TEmpleadoCategoria gettEmpleadoCategoria() {
		return tEmpleadoCategoria;
	}

	public void settEmpleadoCategoria(TEmpleadoCategoria tEmpleadoCategoria) {
		this.tEmpleadoCategoria = tEmpleadoCategoria;
	}

	public TEmpleadoCategoriaExample gettEmpleadoCategoriaExample() {
		return tEmpleadoCategoriaExample;
	}

	public void settEmpleadoCategoriaExample(
			TEmpleadoCategoriaExample tEmpleadoCategoriaExample) {
		this.tEmpleadoCategoriaExample = tEmpleadoCategoriaExample;
	}

	public PersonalManager getPersonalManager() {
		return personalManager;
	}

	public void setPersonalManager(PersonalManager personalManager) {
		this.personalManager = personalManager;
	}

	public TEmpleadoManager gettEmpleadoManager() {
		return tEmpleadoManager;
	}

	public void settEmpleadoManager(TEmpleadoManager tEmpleadoManager) {
		this.tEmpleadoManager = tEmpleadoManager;
	}

	public TEmpleadoCategoriaManager gettEmpleadoCategoriaManager() {
		return tEmpleadoCategoriaManager;
	}

	public void settEmpleadoCategoriaManager(
			TEmpleadoCategoriaManager tEmpleadoCategoriaManager) {
		this.tEmpleadoCategoriaManager = tEmpleadoCategoriaManager;
	}

	public List<TEmpleado> getLstEmpleado() {
		return lstEmpleado;
	}

	public void setLstEmpleado(List<TEmpleado> lstEmpleado) {
		this.lstEmpleado = lstEmpleado;
	}

	public List<TEmpleadoCategoria> getLstEmpleadoCategoria() {
		return lstEmpleadoCategoria;
	}

	public void setLstEmpleadoCategoria(
			List<TEmpleadoCategoria> lstEmpleadoCategoria) {
		this.lstEmpleadoCategoria = lstEmpleadoCategoria;
	}

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public TEmpleadoProcess(BeanFactory factory, int sizePage,
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
		
		personalManager = factory.getBean("personalManager",PersonalManager.class);
		tEmpleadoManager = factory.getBean("tEmpleadoManager",TEmpleadoManager.class);
		tEmpleadoCategoriaManager = factory.getBean("tEmpleadoCategoriaManager",TEmpleadoCategoriaManager.class);
		
		constantes = factory.getBean("constantes", Constantes.class);
		
		int offset = 0;
		
		while (true) {

			personalExample.clear();

			personalExample.createCriteria().andCodtipoEqualTo(constantes.getParamCodeCategoriaEmpleadoMensajero());
			personalExample.createCriteria().andBiFecNumCamGreaterThanOrEqualTo(Util.getDateTimeLongAsDate(dateTimeFrom));
			personalExample.createCriteria().andBiFecNumCamLessThan(Util.getDateTimeLongAsDate(dateTimeUntil));
			
			personalExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			
			List<Personal> lstPersonal = personalManager.selectByExample(personalExample);

			if (lstPersonal.size() > 0) {
				for (Iterator<Personal> iterator = lstPersonal.iterator(); iterator.hasNext();) {
					personal = iterator.next();
					tEmpleado.clear();
					tEmpleadoCategoria.clear();
					
					processRecordEmpleado();
				}
				offset = offset + constantes.getSizePage();
			} else {

				lstPersonal.clear();

				personal.clear();
				personalExample.clear();

				tEmpleado.clear();
				tEmpleadoExample.clear();
				
				tEmpleadoCategoria.clear();
				tEmpleadoCategoriaExample.clear();

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
		lstEmpleado.clear();
		lstEmpleadoCategoria.clear();
		tEmpleado.clear();
		tEmpleadoCategoria.clear();
		boolean existEmpleadoCategoria = false;
		
		lstEmpleado = tEmpleadoManager.selectByExample(null);
		lstEmpleadoCategoria = tEmpleadoCategoriaManager.selectByExample(null);
		
		if(lstEmpleado.size()>0){
			for (Iterator<TEmpleado> iteratorEmpleado = lstEmpleado.iterator(); iteratorEmpleado.hasNext();) {
				tEmpleado = iteratorEmpleado.next();
				for (Iterator<TEmpleadoCategoria> iteratorEmpleadoCategoria = lstEmpleadoCategoria.iterator(); iteratorEmpleadoCategoria.hasNext();) {
					tEmpleadoCategoria = iteratorEmpleadoCategoria.next();
					if(tEmpleado.getEmpCod().equals(tEmpleadoCategoria.getEmpCod())){
						existEmpleadoCategoria = true;
					}
				}
				
				if(!existEmpleadoCategoria){
					
					tEmpleadoCategoria.clear();
					
					tEmpleadoCategoria.setEmpId(tEmpleado.getEmpId());
					tEmpleadoCategoria.setEmpCod(tEmpleado.getEmpCod());
					tEmpleadoCategoria.setEmpCatCodTip(constantes.getParamSerialCategoriaEmpleadoMensajero());
					tEmpleadoCategoria.setEmpCatCod(constantes.getValueStringDefault());
					tEmpleadoCategoria.setFecNumCam(Util.getCurrentDateTimeAsLong());
					tEmpleadoCategoria.setCodIndCam(constantes.getStateRecordNew());
					tEmpleadoCategoria.setProcId(process);
					
					tEmpleadoCategoriaManager.insertSelective(tEmpleadoCategoria);
					
					existEmpleadoCategoria = false;
				}
				
			}
		}
		
		lstEmpleado.clear();
		lstEmpleadoCategoria.clear();
		tEmpleado.clear();
		tEmpleadoCategoria.clear();

		return resultProcess;
	}

	public void processRecordEmpleado() {
		
		completeFieldEmpleado();
		
		if(typeProcess.equals(constantes.getTypeProcessSimple())){
			if(tEmpleado.getCodIndCam().equals(constantes.getStateRecordNew())){
				if(insertRecordGenericEmpleado()> constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordOrigen = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}else{
				if(updateRecordGenericEmpleado() > constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordOrigen = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}else{
			if(updateRecordGenericEmpleado() > constantes.getResultTransactionNoResult()){
				stateRecordOrigen = constantes.getStateRecordProcessed();
				recordProcessed = recordProcessed + 1; 
			}else{
				if(insertRecordGenericEmpleado() > constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1;
				}else{
					stateRecordOrigen = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}
		
		updateRecordOrigenEmpleado(stateRecordOrigen);
		
	}

	public void completeFieldEmpleado() {

		//Codigo de cliente
		tEmpleado.setEmpCod(personal.getCodigopersonal());
		
		//Tipo de documento de identificacion: Por defecto se colocara el tipo DNI
		tEmpleado.setEmpCodTipDoc(constantes.getParamSerialTipoDocumentoDni());
		
		//Numero de documento: Por defecto se colocara "-"
		tEmpleado.setEmpNumTipDoc(personal.getDni());
		
		//Apellidos y nombres
		tEmpleado.setEmpDesApePat(personal.getAppaterno());
		tEmpleado.setEmpDesApeMat(personal.getApmaterno());
		tEmpleado.setEmpDesNom(personal.getNombres());
		
		//Fecha de nacimiento
		tEmpleado.setEmpFecNac(personal.getFechanac());
		
		//Sexo
		tEmpleado.setEmpSex(personal.getSexo());
		
		//Campos de control
		tEmpleado.setFecNumCam(Util.getCurrentDateTimeAsLong());
		if(constantes.getStateRecordNew().equals(personal.getBiCodIndCam())){
			tEmpleado.setCodIndCam(constantes.getStateRecordNew());
		}else{
			tEmpleado.setCodIndCam(constantes.getStateRecordProcessed());
		}
		tEmpleado.setProcId(process);

	}

	public int insertRecordGenericEmpleado() {
		try {
			resultTransaction = tEmpleadoManager.insertSelective(tEmpleado);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int updateRecordGenericEmpleado() {
		try {
			tEmpleadoExample.clear();
			tEmpleadoExample.createCriteria().andEmpCodEqualTo(tEmpleado.getEmpCod());
			resultTransaction = tEmpleadoManager.updateByExampleSelective(tEmpleado, tEmpleadoExample);	
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int deleteRecordGenericEmpleado() {
		try {
			tEmpleadoExample.clear();
			tEmpleadoExample.createCriteria().andEmpCodEqualTo(tEmpleado.getEmpCod());
			resultTransaction = tEmpleadoManager.deleteByExample(tEmpleadoExample);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public void updateRecordOrigenEmpleado(String statusRecord) {
		try {
			String codPersonal = personal.getCodigopersonal();
			personal.clear();
			personal.setCodigopersonal(codPersonal);
			personal.setBiCodIndCam(statusRecord);
			personalManager.updateByPrimaryKeySelective(personal);
		} catch (Exception e) {

		}
	}
}
