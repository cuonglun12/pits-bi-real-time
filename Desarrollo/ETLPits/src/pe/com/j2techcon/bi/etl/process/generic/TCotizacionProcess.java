package pe.com.j2techcon.bi.etl.process.generic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.domain.generic.TAreaCliente;
import pe.com.j2techcon.bi.etl.domain.generic.TAreaClienteExample;
import pe.com.j2techcon.bi.etl.domain.generic.TCotizacion;
import pe.com.j2techcon.bi.etl.domain.generic.TCotizacionExample;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleadoCategoria;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleadoCategoriaExample;
import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;
import pe.com.j2techcon.bi.etl.domain.generic.TProducto;
import pe.com.j2techcon.bi.etl.domain.generic.TProductoExample;
import pe.com.j2techcon.bi.etl.domain.origen.TCotizaciones;
import pe.com.j2techcon.bi.etl.domain.origen.TCotizacionesExample;
import pe.com.j2techcon.bi.etl.logic.generic.TAreaClienteManager;
import pe.com.j2techcon.bi.etl.logic.generic.TCotizacionManager;
import pe.com.j2techcon.bi.etl.logic.generic.TEmpleadoCategoriaManager;
import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;
import pe.com.j2techcon.bi.etl.logic.generic.TProductoManager;
import pe.com.j2techcon.bi.etl.logic.origen.TCotizacionesManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.util.Util;

public class TCotizacionProcess {

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
	
	private TEmpleadoCategoria tEmpleadoCategoria;
	private TEmpleadoCategoriaExample tEmpleadoCategoriaExample;
	
	private TAreaCliente tAreaCliente;
	private TAreaClienteExample tAreaClienteExample;
	
	private TProducto tProducto;
	private TProductoExample tProductoExample;
	
	private TCotizaciones tCotizaciones;
	private TCotizacionesExample tCotizacionesExample;
	
	private TCotizacion tCotizacion;
	private TCotizacionExample tCotizacionExample;
	
	private TParametroManager tParametroManager;
	private TEmpleadoCategoriaManager tEmpleadoCategoriaManager;
	private TAreaClienteManager tAreaClienteManager;
	private TProductoManager tProductoManager;
	private TCotizacionesManager tCotizacionesManager;
	private TCotizacionManager tCotizacionManager;
	
	private Map<String,Integer> mpAreaCliente;
	private Map<String,Integer> mpProducto;
	private Map<String,Integer> mpTipoAmbito;
	private Map<String,Integer> mpTipoServicio;
	private Map<String,Integer> mpTipoNegocio;
	private Map<String,Integer> mpEstadoCotizacion;
	
	private List<TParametro> lstParametro;
	private List<TAreaCliente> lstAreaCliente;
	private List<TProducto> lstProducto;
	private List<String> lstLista;
	
	private Constantes constantes;

	static Logger log = Logger.getLogger(TCotizacionProcess.class);
	
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

	public TProducto gettProducto() {
		return tProducto;
	}

	public void settProducto(TProducto tProducto) {
		this.tProducto = tProducto;
	}

	public TProductoExample gettProductoExample() {
		return tProductoExample;
	}

	public void settProductoExample(TProductoExample tProductoExample) {
		this.tProductoExample = tProductoExample;
	}

	public TCotizaciones gettCotizaciones() {
		return tCotizaciones;
	}

	public void settCotizaciones(TCotizaciones tCotizaciones) {
		this.tCotizaciones = tCotizaciones;
	}

	public TCotizacionesExample gettCotizacionesExample() {
		return tCotizacionesExample;
	}

	public void settCotizacionesExample(TCotizacionesExample tCotizacionesExample) {
		this.tCotizacionesExample = tCotizacionesExample;
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

	public TParametroManager gettParametroManager() {
		return tParametroManager;
	}

	public void settParametroManager(TParametroManager tParametroManager) {
		this.tParametroManager = tParametroManager;
	}

	public TEmpleadoCategoriaManager gettEmpleadoCategoriaManager() {
		return tEmpleadoCategoriaManager;
	}

	public void settEmpleadoCategoriaManager(
			TEmpleadoCategoriaManager tEmpleadoCategoriaManager) {
		this.tEmpleadoCategoriaManager = tEmpleadoCategoriaManager;
	}

	public TAreaClienteManager gettAreaClienteManager() {
		return tAreaClienteManager;
	}

	public void settAreaClienteManager(TAreaClienteManager tAreaClienteManager) {
		this.tAreaClienteManager = tAreaClienteManager;
	}

	public TProductoManager gettProductoManager() {
		return tProductoManager;
	}

	public void settProductoManager(TProductoManager tProductoManager) {
		this.tProductoManager = tProductoManager;
	}

	public TCotizacionesManager gettCotizacionesManager() {
		return tCotizacionesManager;
	}

	public void settCotizacionesManager(TCotizacionesManager tCotizacionesManager) {
		this.tCotizacionesManager = tCotizacionesManager;
	}

	public TCotizacionManager gettCotizacionManager() {
		return tCotizacionManager;
	}

	public void settCotizacionManager(TCotizacionManager tCotizacionManager) {
		this.tCotizacionManager = tCotizacionManager;
	}

	public Map<String, Integer> getMpAreaCliente() {
		return mpAreaCliente;
	}

	public void setMpAreaCliente(Map<String, Integer> mpAreaCliente) {
		this.mpAreaCliente = mpAreaCliente;
	}

	public Map<String, Integer> getMpProducto() {
		return mpProducto;
	}

	public void setMpProducto(Map<String, Integer> mpProducto) {
		this.mpProducto = mpProducto;
	}

	public Map<String, Integer> getMpTipoAmbito() {
		return mpTipoAmbito;
	}

	public void setMpTipoAmbito(Map<String, Integer> mpTipoAmbito) {
		this.mpTipoAmbito = mpTipoAmbito;
	}

	public Map<String, Integer> getMpTipoServicio() {
		return mpTipoServicio;
	}

	public void setMpTipoServicio(Map<String, Integer> mpTipoServicio) {
		this.mpTipoServicio = mpTipoServicio;
	}

	public Map<String, Integer> getMpTipoNegocio() {
		return mpTipoNegocio;
	}

	public void setMpTipoNegocio(Map<String, Integer> mpTipoNegocio) {
		this.mpTipoNegocio = mpTipoNegocio;
	}

	public Map<String, Integer> getMpEstadoCotizacion() {
		return mpEstadoCotizacion;
	}

	public void setMpEstadoCotizacion(Map<String, Integer> mpEstadoCotizacion) {
		this.mpEstadoCotizacion = mpEstadoCotizacion;
	}

	public List<TParametro> getLstParametro() {
		return lstParametro;
	}

	public void setLstParametro(List<TParametro> lstParametro) {
		this.lstParametro = lstParametro;
	}

	public List<TAreaCliente> getLstAreaCliente() {
		return lstAreaCliente;
	}

	public void setLstAreaCliente(List<TAreaCliente> lstAreaCliente) {
		this.lstAreaCliente = lstAreaCliente;
	}

	public List<TProducto> getLstProducto() {
		return lstProducto;
	}

	public void setLstProducto(List<TProducto> lstProducto) {
		this.lstProducto = lstProducto;
	}

	public List<String> getLstLista() {
		return lstLista;
	}

	public void setLstLista(List<String> lstLista) {
		this.lstLista = lstLista;
	}

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public TCotizacionProcess(BeanFactory factory, int sizePage,
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
		tAreaClienteManager = factory.getBean("tAreaClienteManager", TAreaClienteManager.class);
		tProductoManager = factory.getBean("tProductoManager", TProductoManager.class);
		tCotizacionesManager = factory.getBean("tCotizacionesManager", TCotizacionesManager.class);
		tCotizacionManager = factory.getBean("tCotizacionManager", TCotizacionManager.class);
		tParametroManager = factory.getBean("tParametroManager", TParametroManager.class);
		
		tParametro = new TParametro();
		tParametroExample = new TParametroExample();
		
		tEmpleadoCategoria = new TEmpleadoCategoria();
		tEmpleadoCategoriaExample = new TEmpleadoCategoriaExample();
		
		tAreaCliente = new TAreaCliente();
		tAreaClienteExample = new TAreaClienteExample();
		
		tProducto = new TProducto();
		tProductoExample = new TProductoExample();
		
		tCotizaciones = new TCotizaciones();
		tCotizacionesExample = new TCotizacionesExample();
		
		tCotizacion = new TCotizacion();
		tCotizacionExample = new TCotizacionExample();
		
		lstParametro = new ArrayList<TParametro>();
		lstAreaCliente = new ArrayList<TAreaCliente>();
		lstProducto = new ArrayList<TProducto>();
		lstLista = new ArrayList<String>();
		
		mpAreaCliente = new HashMap<String, Integer>();
		lstAreaCliente = tAreaClienteManager.selectByExample(null);
		for (Iterator<TAreaCliente> iterator = lstAreaCliente.iterator(); iterator.hasNext();) {
			tAreaCliente = iterator.next();
			mpAreaCliente.put(tAreaCliente.getCliCod() + "-" + tAreaCliente.getAreCliCod(), tAreaCliente.getAreCliId());
			
		}
		
		mpEstadoCotizacion = new HashMap<String, Integer>();
		tParametroExample.clear();
		tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoCotizacion());
		lstParametro = tParametroManager.selectByExample(tParametroExample);
		for (Iterator<TParametro> iterator = lstParametro.iterator(); iterator.hasNext();) {
			tParametro = iterator.next();
			mpEstadoCotizacion.put(tParametro.getParamCod(),tParametro.getParamId());
		}
		
		mpProducto = new HashMap<String, Integer>();
		lstProducto = tProductoManager.selectByExample(null);
		for (Iterator<TProducto> iterator = lstProducto.iterator(); iterator.hasNext();) {
			tProducto = iterator.next();
			mpProducto.put(tProducto.getProdCod(), tProducto.getProcId());
		}
		
		mpTipoAmbito = new HashMap<String, Integer>();
		tParametroExample.clear();
		tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeTipoAmbito());
		lstParametro = tParametroManager.selectByExample(tParametroExample);
		for (Iterator<TParametro> iterator = lstParametro.iterator(); iterator.hasNext();) {
			tParametro = iterator.next();
			mpTipoAmbito.put(tParametro.getParamCod(),tParametro.getParamId());
		}
		
		mpTipoNegocio = new HashMap<String, Integer>();
		tParametroExample.clear();
		tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeTipoNegocio());
		lstParametro = tParametroManager.selectByExample(tParametroExample);
		for (Iterator<TParametro> iterator = lstParametro.iterator(); iterator.hasNext();) {
			tParametro = iterator.next();
			mpTipoNegocio.put(tParametro.getParamCod(),tParametro.getParamId());
		}
		
		mpTipoServicio = new HashMap<String, Integer>();
		tParametroExample.clear();
		tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeTipoServicio());
		lstParametro = tParametroManager.selectByExample(tParametroExample);
		for (Iterator<TParametro> iterator = lstParametro.iterator(); iterator.hasNext();) {
			tParametro = iterator.next();
			mpTipoServicio.put(tParametro.getParamCod(),tParametro.getParamId());
		}
		
		List<String> lstStateRecord = new ArrayList<String>();
		lstStateRecord.add(constantes.getStateRecordNew());
		lstStateRecord.add(constantes.getStateRecordUpdated());
		
		//int offset = 0;
		
		List<TCotizaciones> lstCotizacion = new ArrayList<TCotizaciones>();
		
		while (true) {

			tCotizacionesExample.clear();

			tCotizacionesExample.createCriteria().andCodambitoEqualTo(constantes.getParamCodeTipoAmbitoLocal()).andCodnegocioEqualTo(constantes.getParamCodeTipoNegocioMensajeria()).andBiFecNumCamGreaterThanOrEqualTo(Util.getDateTimeLongAsDate(dateTimeFrom)).andBiFecNumCamLessThan(Util.getDateTimeLongAsDate(dateTimeUntil)).andBiCodIndCamIn(lstStateRecord);
			//tCotizacionesExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			tCotizacionesExample.setPaginationByClause(" limit " + constantes.getSizePage());
			
			lstCotizacion = tCotizacionesManager.selectByExample(tCotizacionesExample);

			if (lstCotizacion.size() > 0) {
				for (Iterator<TCotizaciones> iterator = lstCotizacion.iterator(); iterator.hasNext();) {
					tCotizaciones = iterator.next();
					tCotizacion.clear();
					processRecordCotizacion();
				}
				lstCotizacion.clear();
				//offset = offset + constantes.getSizePage();
			} else {
				
				lstStateRecord.clear();
				lstCotizacion.clear();
				
				tParametro.clear();
				tParametroExample.clear();

				tEmpleadoCategoria.clear();
				tEmpleadoCategoriaExample.clear();

				tAreaCliente.clear();
				tAreaClienteExample.clear();

				tProducto.clear();
				tProductoExample.clear();

				tCotizaciones.clear();
				tCotizacionesExample.clear();

				tCotizacion.clear();
				tCotizacionExample.clear();
				
				mpAreaCliente.clear();
				mpEstadoCotizacion.clear();
				mpProducto.clear();
				mpTipoAmbito.clear();
				mpTipoNegocio.clear();
				mpTipoServicio.clear();

				lstParametro.clear();
				lstAreaCliente.clear();
				lstProducto.clear();
				lstLista.clear();

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

	public void processRecordCotizacion() throws Exception{
		
		completeFieldCotizacion();
		
		if(typeProcess.equals(constantes.getTypeProcessSimple())){
			if(tCotizacion.getCodIndCam().equals(constantes.getStateRecordNew())){
				if(insertRecordGenericCotizacion()> constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordOrigen = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}else{
				if(updateRecordGenericCotizacion() > constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordOrigen = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}else{
			if(updateRecordGenericCotizacion() > constantes.getResultTransactionNoResult()){
				stateRecordOrigen = constantes.getStateRecordProcessed();
				recordProcessed = recordProcessed + 1; 
			}else{
				if(insertRecordGenericCotizacion() > constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1;
				}else{
					stateRecordOrigen = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}
		
		updateRecordOrigenCotizacion(stateRecordOrigen);
		
	}

	public void completeFieldCotizacion() throws Exception{

		tCotizacion.setEmpCatId(0);
		
		tCotizacion.setAreCliId(mpAreaCliente.get(tCotizaciones.getCodcliente() + "-" + tCotizaciones.getCodareacliente()));
		if(tCotizacion.getAreCliId() == null){
			tCotizacion.setAreCliId(mpAreaCliente.get(tCotizaciones.getCodcliente() + "-" + constantes.getValueStringDefault()));
		}

		tCotizacion.setProdId(mpProducto.get(tCotizaciones.getCodproducto()));
		
		tCotizacion.setCotiCodAmb(mpTipoAmbito.get(tCotizaciones.getCodambito()));
		if(tCotizacion.getCotiCodAmb() == null){
			tCotizacion.setCotiCodAmb(constantes.getParamSerialTipoAmbitoNoDefinido());
		}
		
		tCotizacion.setCotiCodServ(mpTipoServicio.get(tCotizaciones.getCodservicio()));
		if(tCotizacion.getCotiCodServ() == null){
			tCotizacion.setCotiCodServ(constantes.getParamSerialTipoServicioNoDefinido());
		}
			
		tCotizacion.setCotiCodNeg(mpTipoNegocio.get(tCotizaciones.getCodnegocio()));
		if(tCotizacion.getCotiCodNeg() == null){
			tCotizacion.setCotiCodNeg(constantes.getParamSerialTipoNegocioNoDefinido());
		}

		tCotizacion.setCotiCodTipDoc(constantes.getParamSerialTipoDocumentoTrabajoNoDefinido());

		tCotizacion.setCotiSerieDoc(tCotizaciones.getCoserie());
		tCotizacion.setCotiNumDoc(tCotizaciones.getConumero().toString());
		tCotizacion.setCotiCodComp(tCotizaciones.getCoserie() + "-" + tCotizaciones.getConumero().toString());

		tCotizacion.setCotiCodEst(mpEstadoCotizacion.get(tCotizaciones.getEstado().toString()));
		if(tCotizacion.getCotiCodEst() == null){
			tCotizacion.setCotiCodEst(constantes.getParamSerialEstadoCotizacionNoDefinido());
		}

		tCotizacion.setCotiFecApro(tCotizaciones.getFechaaprueba());
		tCotizacion.setCotiFecIni(tCotizaciones.getFecha());
		tCotizacion.setCotiFecFin(tCotizaciones.getFechaanula());

		tCotizacion.setFecNumCam(Util.getCurrentDateTimeAsLong());
		if(constantes.getStateRecordNew().equals(tCotizaciones.getBiCodIndCam())){
			tCotizacion.setCodIndCam(constantes.getStateRecordNew());
		}else{
			tCotizacion.setCodIndCam(constantes.getStateRecordUpdated());
		}
		tCotizacion.setProcId(process);

	}

	public int insertRecordGenericCotizacion() throws Exception{
		try {
			resultTransaction = tCotizacionManager.insertSelective(tCotizacion);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int updateRecordGenericCotizacion() throws Exception{
		try {
			tCotizacionExample.clear();
			tCotizacionExample.createCriteria().andCotiCodTipDocEqualTo(constantes.getParamSerialTipoDocumentoTrabajoNoDefinido()).andCotiSerieDocEqualTo(tCotizacion.getCotiSerieDoc()).andCotiNumDocEqualTo(tCotizacion.getCotiNumDoc());
			
			tCotizacion.setCotiCodTipDoc(null);
			tCotizacion.setCotiSerieDoc(null);
			tCotizacion.setCotiNumDoc(null);
			
			resultTransaction = tCotizacionManager.updateByExampleSelective(tCotizacion, tCotizacionExample);	
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
			e.printStackTrace();
		}
		return resultTransaction;
	}

	public int deleteRecordGenericCotizacion() throws Exception{
		try {
			tCotizacionExample.clear();
			tCotizacionExample.createCriteria().andCotiCodTipDocEqualTo(constantes.getParamSerialTipoDocumentoTrabajoNoDefinido()).andCotiSerieDocEqualTo(tCotizacion.getCotiSerieDoc()).andCotiNumDocEqualTo(tCotizacion.getCotiNumDoc());
			resultTransaction = tCotizacionManager.deleteByExample(tCotizacionExample);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public void updateRecordOrigenCotizacion(String statusRecord) throws Exception{
		String coSerie = tCotizaciones.getCoserie();
		BigDecimal coNumero = tCotizaciones.getConumero();
		tCotizaciones.clear();
		tCotizaciones.setCoserie(coSerie);
		tCotizaciones.setConumero(coNumero);
		tCotizaciones.setBiCodIndCam(statusRecord);
		//tCotizaciones.setBiFecNumCam(Util.getCurrentDateTime());
		tCotizacionesManager.updateByPrimaryKeySelective(tCotizaciones);
	}

}
