package pe.com.j2techcon.bi.etl.process.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.domain.generic.TDespacho;
import pe.com.j2techcon.bi.etl.domain.generic.TDespachoExample;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleadoCategoria;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleadoCategoriaExample;
import pe.com.j2techcon.bi.etl.domain.generic.TSede;
import pe.com.j2techcon.bi.etl.domain.generic.TSedeExample;
import pe.com.j2techcon.bi.etl.domain.generic.TZona;
import pe.com.j2techcon.bi.etl.domain.generic.TZonaExample;
import pe.com.j2techcon.bi.etl.domain.origen.Despacho;
import pe.com.j2techcon.bi.etl.domain.origen.DespachoExample;
import pe.com.j2techcon.bi.etl.logic.generic.TDespachoManager;
import pe.com.j2techcon.bi.etl.logic.generic.TEmpleadoCategoriaManager;
import pe.com.j2techcon.bi.etl.logic.generic.TSedeManager;
import pe.com.j2techcon.bi.etl.logic.generic.TZonaManager;
import pe.com.j2techcon.bi.etl.logic.origen.DespachoManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.util.Util;

public class TDespachoProcess {

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
	
	private TSede tSede;
	private TSedeExample tSedeExample;
	
	private TZona tZona;
	private TZonaExample tZonaExample;
	
	private TEmpleadoCategoria tEmpleadoCategoria;
	private TEmpleadoCategoriaExample tEmpleadoCategoriaExample;
	
	private Despacho despacho;
	private DespachoExample despachoExample;
	
	private TDespacho tDespacho;
	private TDespachoExample tDespachoExample;
	
	private TSedeManager tSedeManager;
	private TZonaManager tZonaManager;
	private TEmpleadoCategoriaManager tEmpleadoCategoriaManager;
	private DespachoManager despachoManager;
	private TDespachoManager tDespachoManager;
	
	private List<TSede> lstSede;
	private List<TZona> lstZona;
	private List<TEmpleadoCategoria> lstEmpleadoCategoria;
	
	private Constantes constantes;

	static Logger log = Logger.getLogger(TDespachoProcess.class);
	
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

	public TZona gettZona() {
		return tZona;
	}

	public void settZona(TZona tZona) {
		this.tZona = tZona;
	}

	public TZonaExample gettZonaExample() {
		return tZonaExample;
	}

	public void settZonaExample(TZonaExample tZonaExample) {
		this.tZonaExample = tZonaExample;
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

	public Despacho getDespacho() {
		return despacho;
	}

	public void setDespacho(Despacho despacho) {
		this.despacho = despacho;
	}

	public DespachoExample getDespachoExample() {
		return despachoExample;
	}

	public void setDespachoExample(DespachoExample despachoExample) {
		this.despachoExample = despachoExample;
	}

	public TDespacho gettDespacho() {
		return tDespacho;
	}

	public void settDespacho(TDespacho tDespacho) {
		this.tDespacho = tDespacho;
	}

	public TDespachoExample gettDespachoExample() {
		return tDespachoExample;
	}

	public void settDespachoExample(TDespachoExample tDespachoExample) {
		this.tDespachoExample = tDespachoExample;
	}

	public TSedeManager gettSedeManager() {
		return tSedeManager;
	}

	public void settSedeManager(TSedeManager tSedeManager) {
		this.tSedeManager = tSedeManager;
	}

	public TZonaManager gettZonaManager() {
		return tZonaManager;
	}

	public void settZonaManager(TZonaManager tZonaManager) {
		this.tZonaManager = tZonaManager;
	}

	public TEmpleadoCategoriaManager gettEmpleadoCategoriaManager() {
		return tEmpleadoCategoriaManager;
	}

	public void settEmpleadoCategoriaManager(
			TEmpleadoCategoriaManager tEmpleadoCategoriaManager) {
		this.tEmpleadoCategoriaManager = tEmpleadoCategoriaManager;
	}

	public DespachoManager getDespachoManager() {
		return despachoManager;
	}

	public void setDespachoManager(DespachoManager despachoManager) {
		this.despachoManager = despachoManager;
	}

	public TDespachoManager gettDespachoManager() {
		return tDespachoManager;
	}

	public void settDespachoManager(TDespachoManager tDespachoManager) {
		this.tDespachoManager = tDespachoManager;
	}

	public List<TSede> getLstSede() {
		return lstSede;
	}

	public void setLstSede(List<TSede> lstSede) {
		this.lstSede = lstSede;
	}

	public List<TZona> getLstZona() {
		return lstZona;
	}

	public void setLstZona(List<TZona> lstZona) {
		this.lstZona = lstZona;
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

	public TDespachoProcess(BeanFactory factory, int sizePage,
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
		
		tEmpleadoCategoriaManager = factory.getBean("tEmpleadoCategoriaManager", TEmpleadoCategoriaManager.class);
		tSedeManager = factory.getBean("tSedeManager", TSedeManager.class);
		tZonaManager = factory.getBean("tZonaManager", TZonaManager.class);
		despachoManager = factory.getBean("despachoManager", DespachoManager.class);
		tDespachoManager = factory.getBean("tDespachoManager", TDespachoManager.class);
		
		tSede = new TSede();
		tSedeExample = new TSedeExample();
		
		tZona = new TZona();
		tZonaExample = new TZonaExample();
		
		tEmpleadoCategoria = new TEmpleadoCategoria();
		tEmpleadoCategoriaExample = new TEmpleadoCategoriaExample();
		
		despacho = new Despacho();
		despachoExample = new DespachoExample();
		
		tDespacho = new TDespacho();
		tDespachoExample = new TDespachoExample();
		
		lstSede = new ArrayList<TSede>();
		lstZona = new ArrayList<TZona>();
		lstEmpleadoCategoria = new ArrayList<TEmpleadoCategoria>();
		
		int offset = 0;
		
		while (true) {

			despachoExample.clear();			
			despachoExample.createCriteria().andBiFecNumCamGreaterThanOrEqualTo(Util.getDateTimeLongAsDate(dateTimeFrom));
			despachoExample.createCriteria().andBiFecNumCamLessThan(Util.getDateTimeLongAsDate(dateTimeUntil));
			despachoExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			
			List<Despacho> lstDespacho = despachoManager.selectByExample(despachoExample);

			if (lstDespacho.size() > 0) {
				for (Iterator<Despacho> iterator = lstDespacho.iterator(); iterator.hasNext();) {
					despacho = iterator.next();
					tDespacho.clear();
					processRecordDespacho();
				}
				offset = offset + constantes.getSizePage();
			} else {

				tSede.clear();
				tSedeExample.clear();
				
				tZona.clear();
				tZonaExample.clear();
				
				tEmpleadoCategoria.clear();
				tEmpleadoCategoriaExample.clear();
				
				despacho.clear();
				despachoExample.clear();
				
				tDespacho.clear();
				tDespachoExample.clear();
				
				lstSede.clear();
				lstZona.clear();
				lstEmpleadoCategoria.clear();

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
		
		
		return getResultProcess();
	}

	public void processRecordDespacho() throws Exception{
		
		completeFieldDespacho();

		if(typeProcess.equals(constantes.getTypeProcessSimple())){
			if(tDespacho.getCodIndCam().equals(constantes.getStateRecordNew())){
				if(insertRecordGenericDespacho()> constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordOrigen = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}else{
				if(updateRecordGenericDespacho() > constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordOrigen = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}else{
			if(updateRecordGenericDespacho() > constantes.getResultTransactionNoResult()){
				stateRecordOrigen = constantes.getStateRecordProcessed();
				recordProcessed = recordProcessed + 1; 
			}else{
				if(insertRecordGenericDespacho() > constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1;
				}else{
					stateRecordOrigen = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}
		
		updateRecordOrigenDespacho(stateRecordOrigen);	
	}

	public void completeFieldDespacho() throws Exception{

		//Tipo de documento de trabajo
		tDespacho.setDespCodTipDoc(constantes.getParamSerialTipoDocumentoTrabajoGuia());
		
		//Serie de la guia
		tDespacho.setDespSerieDoc(despacho.getSerieguia());
		
		//Numero de la guia
		tDespacho.setDespSerieDoc(despacho.getNroguia());
		
		//Sede
		tSedeExample.clear();
		tSedeExample.createCriteria().andSedCodEqualTo(despacho.getCodsede());
		lstSede = tSedeManager.selectByExample(tSedeExample);
		if(lstSede.size()>0){
			tDespacho.setSedId(lstSede.get(0).getSedId());
		}
		
		//Zona
		tZonaExample.clear();
		tZonaExample.createCriteria().andZonCodEqualTo(despacho.getCodzona());
		lstZona = tZonaManager.selectByExample(tZonaExample);
		if(lstZona.size()>0){
			tDespacho.setZonId(lstZona.get(0).getZonId());
		}
		
		//Mensajero
		tEmpleadoCategoriaExample.clear();
		tEmpleadoCategoriaExample.createCriteria().andEmpCodEqualTo(despacho.getCodmensajero());
		tEmpleadoCategoriaExample.createCriteria().andEmpCatCodEqualTo(constantes.getValueStringDefault());
		lstEmpleadoCategoria = tEmpleadoCategoriaManager.selectByExample(tEmpleadoCategoriaExample);
		if(lstEmpleadoCategoria.size()>0){
			tDespacho.setEmpCatId(lstEmpleadoCategoria.get(0).getEmpCatId());
		}
		
		//Tipo de despacho
		tDespacho.setDespCodTip(constantes.getParamSerialTipoDespachoNoDefinido());
		
		//Tipo de ruta
		if(despacho.getTiporuta() != null && despacho.getTiporuta().length()>0){
			if(constantes.getParamCodeTipoRutaMensajeria().equals(despacho.getTiporuta())){
				tDespacho.setDespCodTipRut(constantes.getParamSerialTipoRutaMensajeria());
			}else if(constantes.getParamCodeTipoRutaCourier().equals(despacho.getTiporuta())){
				tDespacho.setDespCodTipRut(constantes.getParamSerialTipoRutaCourier());
			}else if(constantes.getParamCodeTipoRutaRecojo().equals(despacho.getTiporuta())){
				tDespacho.setDespCodTipRut(constantes.getParamSerialTipoRutaRecojo());
			}else{
				tDespacho.setDespCodTipRut(constantes.getParamSerialTipoRutaNoDefinido());
			}
		}else{
			tDespacho.setDespCodTipRut(constantes.getParamSerialTipoRutaNoDefinido());
		}
		
		//Estado de verificacion
		tDespacho.setDespCodVer(constantes.getParamSerialEstadoDespachoVerificacionNoDefinido());
		
		//Pasaje
		tDespacho.setDespMonPasaje(despacho.getPasaje());
		
		//Cantidad de cargos
		tDespacho.setDespCntCargos(despacho.getTotal());
		
		//Fechas
		tDespacho.setDespFecSal(despacho.getFecsalida());
		//tDespacho.setDespFecRetPro(despacho.getFecretorno());
		tDespacho.setDespFecRetRea(despacho.getFecretorno());
		
		//Estado del despacho
		if(constantes.getParamCodeEstadoDespachoDespacho().equals(despacho.getCodestadoguia())){
			tDespacho.setDespCodEst(constantes.getParamSerialEstadoDespachoDespacho());
		}else if(constantes.getParamCodeEstadoDespachoRuta().equals(despacho.getCodestadoguia())){
			tDespacho.setDespCodEst(constantes.getParamSerialEstadoDespachoRuta());
		}else if(constantes.getParamCodeEstadoDespachoCerrado().equals(despacho.getCodestadoguia())){
			tDespacho.setDespCodEst(constantes.getParamSerialEstadoDespachoCerrado());
		}else if(constantes.getParamCodeEstadoDespachoGenerado().equals(despacho.getCodestadoguia())){
			tDespacho.setDespCodEst(constantes.getParamSerialEstadoDespachoGenerado());
		}else if(constantes.getParamCodeEstadoDespachoPagado().equals(despacho.getCodestadoguia())){
			tDespacho.setDespCodEst(constantes.getParamSerialEstadoDespachoPagado());
		}else if(constantes.getParamCodeEstadoDespachoAnulado().equals(despacho.getCodestadoguia())){
			tDespacho.setDespCodEst(constantes.getParamSerialEstadoDespachoAnulado());
		}else{
			tDespacho.setDespCodEst(constantes.getParamSerialEstadoDespachoNoDefinido());
		}
			
		//Campos de control
		tDespacho.setFecNumCam(Util.getCurrentDateTimeAsLong());
		if(constantes.getStateRecordNew().equals(despacho.getBiCodIndCam())){
			tDespacho.setCodIndCam(constantes.getStateRecordNew());
		}else{
			tDespacho.setCodIndCam(constantes.getStateRecordProcessed());
		}
		tDespacho.setProcId(process);
	}

	public int insertRecordGenericDespacho() throws Exception{
		try {
			resultTransaction = tDespachoManager.insertSelective(tDespacho);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int updateRecordGenericDespacho() throws Exception{
		try {
			tDespachoExample.clear();
			tDespachoExample.createCriteria().andDespCodTipDocEqualTo(constantes.getParamSerialTipoDocumentoTrabajoGuia());
			tDespachoExample.createCriteria().andDespSerieDocEqualTo(tDespacho.getDespSerieDoc());
			tDespachoExample.createCriteria().andDespNumeroDocEqualTo(tDespacho.getDespNumeroDoc());
			resultTransaction = tDespachoManager.updateByExampleSelective(tDespacho, tDespachoExample);	
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int deleteRecordGenericDespacho() throws Exception{
		try {
			tDespachoExample.clear();
			tDespachoExample.createCriteria().andDespCodTipDocEqualTo(constantes.getParamSerialTipoDocumentoTrabajoGuia());
			tDespachoExample.createCriteria().andDespSerieDocEqualTo(tDespacho.getDespSerieDoc());
			tDespachoExample.createCriteria().andDespNumeroDocEqualTo(tDespacho.getDespNumeroDoc());
			resultTransaction = tDespachoManager.deleteByExample(tDespachoExample);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public void updateRecordOrigenDespacho(String statusRecord) throws Exception{
		String serieGuia = despacho.getSerieguia();
		String numeroGuia = despacho.getNroguia();
		despacho.clear();
		despacho.setSerieguia(serieGuia);
		despacho.setNroguia(numeroGuia);
		despacho.setBiCodIndCam(statusRecord);
		despachoManager.updateByPrimaryKeySelective(despacho);
	}
}
