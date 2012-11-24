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
import pe.com.j2techcon.bi.etl.domain.generic.TCotizacion;
import pe.com.j2techcon.bi.etl.domain.generic.TCotizacionExample;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleadoCategoria;
import pe.com.j2techcon.bi.etl.domain.generic.TEmpleadoCategoriaExample;
import pe.com.j2techcon.bi.etl.domain.generic.TOrden;
import pe.com.j2techcon.bi.etl.domain.generic.TOrdenExample;
import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;
import pe.com.j2techcon.bi.etl.domain.generic.TProducto;
import pe.com.j2techcon.bi.etl.domain.generic.TProductoExample;
import pe.com.j2techcon.bi.etl.domain.generic.TServicio;
import pe.com.j2techcon.bi.etl.domain.generic.TServicioExample;
import pe.com.j2techcon.bi.etl.domain.origen.Ordenes;
import pe.com.j2techcon.bi.etl.domain.origen.OrdenesExample;
import pe.com.j2techcon.bi.etl.logic.generic.TAreaClienteManager;
import pe.com.j2techcon.bi.etl.logic.generic.TCotizacionManager;
import pe.com.j2techcon.bi.etl.logic.generic.TEmpleadoCategoriaManager;
import pe.com.j2techcon.bi.etl.logic.generic.TOrdenManager;
import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;
import pe.com.j2techcon.bi.etl.logic.generic.TProductoManager;
import pe.com.j2techcon.bi.etl.logic.generic.TServicioManager;
import pe.com.j2techcon.bi.etl.logic.origen.OrdenesManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.util.Util;

public class TOrdenProcess {
	
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
	
	private Ordenes ordenes;
	private OrdenesExample ordenesExample;
	
	private TCotizacion tCotizacion;
	private TCotizacionExample tCotizacionExample;
	
	private TOrden tOrden;
	private TOrdenExample tOrdenExample;
	
	private TServicio tServicio;
	private TServicioExample tServicioExample;
	
	private TParametroManager tParametroManager;
	private TEmpleadoCategoriaManager tEmpleadoCategoriaManager;
	private TAreaClienteManager tAreaClienteManager;
	private TProductoManager tProductoManager;
	private OrdenesManager ordenesManager;
	private TOrdenManager tOrdenManager;
	private TCotizacionManager tCotizacionManager;
	private TServicioManager tServicioManager;
	
	private Map<String, Integer> mpAreaCliente;
	private Map<String, Integer> mpProducto;
	private Map<String, Integer> mpTipoReparto;
	private Map<String, Integer> mpTipoServicio;
	private Map<String, Integer> mpTipoPago;
	private Map<String, Integer> mpTipoMoneda;
	private Map<String, Integer> mpEstadoOrden;
	private Map<String, Integer> mpCotizacion;
	
	private List<TParametro> lstParametro;
	private List<TAreaCliente> lstAreaCliente;
	private List<TProducto> lstProducto;
	private List<TEmpleadoCategoria> lstEmpleadoCategoria;
	private List<TCotizacion> lstCotizacion;
	private List<String> lstCotizaciones;
	private List<TServicio> lstServicio;
	
	private List<String> lstLista;
	
	private Constantes constantes;
	
	static Logger log = Logger.getLogger(TOrdenProcess.class);
	
	public TOrdenProcess(BeanFactory factory, int sizePage, long dateTimeFrom,
			long dateTimeUntil, String typeProcess, int process)
			throws Exception
	{
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
	
	public int startProcess() throws Exception {
		
		tEmpleadoCategoriaManager = factory.getBean("tEmpleadoCategoriaManager", TEmpleadoCategoriaManager.class);
		tAreaClienteManager = factory.getBean("tAreaClienteManager", TAreaClienteManager.class);
		tProductoManager = factory.getBean("tProductoManager", TProductoManager.class);
		ordenesManager = factory.getBean("ordenesManager", OrdenesManager.class);
		tOrdenManager = factory.getBean("tOrdenManager", TOrdenManager.class);
		tParametroManager = factory.getBean("tParametroManager", TParametroManager.class);
		tCotizacionManager = factory.getBean("tCotizacionManager", TCotizacionManager.class);
		tServicioManager = factory.getBean("tServicioManager", TServicioManager.class);
		
		tParametro = new TParametro();
		tParametroExample = new TParametroExample();
		
		tEmpleadoCategoria = new TEmpleadoCategoria();
		tEmpleadoCategoriaExample = new TEmpleadoCategoriaExample();
		
		tAreaCliente = new TAreaCliente();
		tAreaClienteExample = new TAreaClienteExample();
		
		tProducto = new TProducto();
		tProductoExample = new TProductoExample();
		
		ordenes = new Ordenes();
		ordenesExample = new OrdenesExample();
		
		tCotizacion = new TCotizacion();
		tCotizacionExample = new TCotizacionExample();
		
		tOrden = new TOrden();
		tOrdenExample = new TOrdenExample();
		
		tServicio = new TServicio();
		tServicioExample = new TServicioExample();
		
		lstParametro = new ArrayList<TParametro>();
		lstAreaCliente = new ArrayList<TAreaCliente>();
		lstProducto = new ArrayList<TProducto>();
		lstEmpleadoCategoria = new ArrayList<TEmpleadoCategoria>();
		lstCotizacion = new ArrayList<TCotizacion>();
		lstServicio = new ArrayList<TServicio>();
		lstLista = new ArrayList<String>();
		
		mpAreaCliente = new HashMap<String, Integer>();
		lstAreaCliente = tAreaClienteManager.selectByExample(null);
		for (Iterator<TAreaCliente> iterator = lstAreaCliente.iterator(); iterator.hasNext();) {
			tAreaCliente = iterator.next();
			mpAreaCliente.put(tAreaCliente.getCliCod() + "-" + tAreaCliente.getAreCliCod(), tAreaCliente.getAreCliId());
			
		}
		
		mpProducto = new HashMap<String, Integer>();
		lstProducto = tProductoManager.selectByExample(null);
		for (Iterator<TProducto> iterator = lstProducto.iterator(); iterator.hasNext();) {
			tProducto = iterator.next();
			mpProducto.put(tProducto.getProdCod(), tProducto.getProcId());
		}
		
		mpTipoServicio = new HashMap<String, Integer>();
		tParametroExample.clear();
		tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeTipoServicio());
		lstParametro = tParametroManager.selectByExample(tParametroExample);
		for (Iterator<TParametro> iterator = lstParametro.iterator(); iterator.hasNext();) {
			tParametro = iterator.next();
			mpTipoServicio.put(tParametro.getParamCod(), tParametro.getParamId());
		}
		
		mpTipoReparto = new HashMap<String, Integer>();
		tParametroExample.clear();
		tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeTipoReparto());
		lstParametro = tParametroManager.selectByExample(tParametroExample);
		for (Iterator<TParametro> iterator = lstParametro.iterator(); iterator.hasNext();) {
			tParametro = iterator.next();
			mpTipoReparto.put(tParametro.getParamCod(), tParametro.getParamId());
		}
		
		mpTipoPago = new HashMap<String, Integer>();
		tParametroExample.clear();
		tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeTipoPago());
		lstParametro = tParametroManager.selectByExample(tParametroExample);
		for (Iterator<TParametro> iterator = lstParametro.iterator(); iterator.hasNext();) {
			tParametro = iterator.next();
			mpTipoPago.put(tParametro.getParamCod(), tParametro.getParamId());
		}
		
		mpTipoMoneda = new HashMap<String, Integer>();
		tParametroExample.clear();
		tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeTipoMoneda());
		lstParametro = tParametroManager.selectByExample(tParametroExample);
		for (Iterator<TParametro> iterator = lstParametro.iterator(); iterator.hasNext();) {
			tParametro = iterator.next();
			mpTipoMoneda.put(tParametro.getParamCod(), tParametro.getParamId());
		}
		
		mpEstadoOrden = new HashMap<String, Integer>();
		tParametroExample.clear();
		tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoOrden());
		lstParametro = tParametroManager.selectByExample(tParametroExample);
		for (Iterator<TParametro> iterator = lstParametro.iterator(); iterator.hasNext();) {
			tParametro = iterator.next();
			mpEstadoOrden.put(tParametro.getParamCod(), tParametro.getParamId());
		}
		
		mpCotizacion = new HashMap<String, Integer>();
		
		List<String> lstStateRecord = new ArrayList<String>();
		lstStateRecord.add(constantes.getStateRecordNew());
		lstStateRecord.add(constantes.getStateRecordUpdated());
		
		//int offset = 0;
		
		List<Ordenes> lstOrden = new ArrayList<Ordenes>();
		
		while (true) {
			
			ordenesExample.clear();
			ordenesExample.createCriteria().andCodambitoEqualTo(constantes.getParamCodeTipoAmbitoLocal()).andCodnegocioEqualTo(constantes.getParamCodeTipoNegocioMensajeria()).andBiFecNumCamGreaterThanOrEqualTo(Util.getDateTimeLongAsDate(dateTimeFrom)).andBiFecNumCamLessThan(Util.getDateTimeLongAsDate(dateTimeUntil)).andBiCodIndCamIn(lstStateRecord);
			//ordenesExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			ordenesExample.setPaginationByClause(" limit " + constantes.getSizePage());
			
			lstOrden = ordenesManager.selectByExample(ordenesExample);
			
			if (lstOrden.size() > 0) {
				mpCotizacion.clear();
				lstCotizaciones = Util.getStringListFromObjectList(lstOrden, "coserie-conumero", "-");
				if (lstCotizaciones.size() > 0) {
					tCotizacionExample.clear();
					tCotizacionExample.createCriteria().andCotiCodCompIn(lstCotizaciones);
					lstCotizacion = tCotizacionManager.selectByExample(tCotizacionExample);
					for (Iterator<TCotizacion> iterator = lstCotizacion.iterator(); iterator.hasNext();) {
						tCotizacion = iterator.next();
						mpCotizacion.put(tCotizacion.getCotiCodComp(), tCotizacion.getCotiId());
					}
				}
				for (Iterator<Ordenes> iterator = lstOrden.iterator(); iterator.hasNext();) {
					ordenes = iterator.next();
					tOrden.clear();
					processRecordOrden();
				}
				lstOrden.clear();
				//offset = offset + constantes.getSizePage();
			} else {
				
				lstStateRecord.clear();
				lstOrden.clear();
				
				tParametro.clear();
				tParametroExample.clear();
				
				tEmpleadoCategoria.clear();
				tEmpleadoCategoriaExample.clear();
				
				tAreaCliente.clear();
				tAreaClienteExample.clear();
				
				tProducto.clear();
				tProductoExample.clear();
				
				ordenes.clear();
				ordenesExample.clear();
				
				tOrden.clear();
				tOrdenExample.clear();
				
				tCotizacion.clear();
				tCotizacionExample.clear();
				
				tServicio.clear();
				tServicioExample.clear();
				
				mpAreaCliente.clear();
				mpEstadoOrden.clear();
				mpProducto.clear();
				mpTipoMoneda.clear();
				mpTipoPago.clear();
				mpTipoReparto.clear();
				mpTipoServicio.clear();
				mpCotizacion.clear();
				
				lstParametro.clear();
				lstAreaCliente.clear();
				lstProducto.clear();
				lstEmpleadoCategoria.clear();
				lstServicio.clear();
				lstCotizacion.clear();
				lstCotizaciones.clear();
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
	
	public void processRecordOrden() throws Exception {
		
		completeFieldOrden();
		
		if (tOrden.getCotiId() != null) {
			if (typeProcess.equals(constantes.getTypeProcessSimple())) {
				if (tOrden.getCodIndCam().equals(constantes.getStateRecordNew())) {
					if (insertRecordGenericOrden() > constantes.getResultTransactionNoResult()) {
						stateRecordOrigen = constantes.getStateRecordProcessed();
						recordProcessed = recordProcessed + 1;
					} else {
						stateRecordOrigen = constantes.getStateRecordInconsistent();
						recordRejected = recordRejected + 1;
					}
				} else {
					if (updateRecordGenericOrden() > constantes.getResultTransactionNoResult()) {
						stateRecordOrigen = constantes.getStateRecordProcessed();
						recordProcessed = recordProcessed + 1;
					} else {
						stateRecordOrigen = constantes.getStateRecordInconsistent();
						recordRejected = recordRejected + 1;
					}
				}
			} else {
				if (updateRecordGenericOrden() > constantes.getResultTransactionNoResult()) {
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1;
				} else {
					if (insertRecordGenericOrden() > constantes.getResultTransactionNoResult()) {
						stateRecordOrigen = constantes.getStateRecordProcessed();
						recordProcessed = recordProcessed + 1;
					} else {
						stateRecordOrigen = constantes.getStateRecordInconsistent();
						recordRejected = recordRejected + 1;
					}
				}
			}
			
			updateRecordOrigenOrden(stateRecordOrigen);
		} else {
			stateRecordOrigen = constantes.getStateRecordInconsistent();
			recordRejected = recordRejected + 1;
			updateRecordOrigenOrden(stateRecordOrigen);
		}
	}
	
	public void completeFieldOrden() throws Exception {
		
		tOrden.setCotiId(getCotiId(ordenes.getCoserie() + "-" + Integer.toString(ordenes.getConumero())));
		
		if (tOrden.getCotiId() != null) {
			
			tOrden.setCodAreCli(mpAreaCliente.get(ordenes.getCodcliente() + "-" + ordenes.getCodareacliente()));
			if (tOrden.getCodAreCli() == null) {
				tOrden.setCodAreCli(mpAreaCliente.get(ordenes.getCodcliente() + "-" + constantes.getValueStringDefault()));
			}
			
			tOrden.setEmpCatId(0);
			
			tOrden.setOrdCodTipRep(mpTipoReparto.get(ordenes.getCodtiporeparto()));
			if (tOrden.getOrdCodTipRep() == null) {
				tOrden.setOrdCodTipRep(constantes.getParamSerialTipoRepartoNoDefinido());
			}
			
			tOrden.setServId(mpTipoServicio.get(ordenes.getCodservicio()));
			if (tOrden.getServId() == null) {
				tOrden.setServId(constantes.getParamSerialTipoServicioNoDefinido());
			}
			
			tOrden.setProdId(mpProducto.get(ordenes.getCodproducto()));
			
			tOrden.setOrdCodTipPag(mpTipoPago.get(ordenes.getTipoPagoOrden()));
			if (tOrden.getOrdCodTipPag() == null) {
				tOrden.setOrdCodTipPag(constantes.getParamSerialTipoPagoNoDefinido());
			}
			
			tOrden.setOrdCodTipMon(mpTipoMoneda.get(ordenes.getMoneda()));
			if (tOrden.getOrdCodTipMon() == null) {
				tOrden.setOrdCodTipMon(constantes.getParamSerialTipoMonedaNoDefinido());
			}
			
			tOrden.setOrdCodTipDoc(constantes.getParamSerialTipoDocumentoTrabajoNoDefinido());
			tOrden.setOrdSerieDoc(ordenes.getSerie());
			tOrden.setOrdNumDoc(ordenes.getOrden());
			tOrden.setOrdCodComp(ordenes.getSerie() + "-" + ordenes.getOrden());
			
			if (ordenes.getCntDigitado() == 0) {
				tOrden.setOrdCntCargos(ordenes.getCntAdmision().intValue());
			} else {
				tOrden.setOrdCntCargos(ordenes.getCntDigitado().intValue());
			}
			
			if (constantes.getParamCodeEstadoFacturadoSi().equals(ordenes.getFacturado())) {
				tOrden.setOrdIndFac(constantes.getParamSerialEstadoFacturadoSi());
			} else {
				tOrden.setOrdIndFac(constantes.getParamSerialEstadoFacturadoNo());
			}
			
			tOrden.setOrdFecIni(ordenes.getFechainicio());
			tOrden.setOrdFecVen(ordenes.getFechavencimiento());
			// tOrden.setOrdFecCie();
			tOrden.setOrdFecDev(ordenes.getFechadevolucion());
			// tOrden.setOrdFecLiq();
			// tOrden.setOrdFecFac();
			
			tOrden.setOrdImporte(ordenes.getImporte());
			tOrden.setOrdDescuento(ordenes.getDescuento());
			tOrden.setOrdVenta(ordenes.getVenta());
			tOrden.setOrdIgv(ordenes.getIgv());
			tOrden.setOrdTotal(ordenes.getTotal());
			
			tOrden.setOrdCodEst(mpEstadoOrden.get(ordenes.getEstadoorden()));
			if (tOrden.getOrdCodEst() == null) {
				tOrden.setOrdCodEst(constantes.getParamSerialEstadoOrdenNoDefinido());
			}
			
			tOrden.setFecNumCam(Util.getCurrentDateTimeAsLong());
			if (constantes.getStateRecordNew().equals(ordenes.getBiCodIndCam())) {
				tOrden.setCodIndCam(constantes.getStateRecordNew());
			} else {
				tOrden.setCodIndCam(constantes.getStateRecordUpdated());
			}
			tOrden.setProcId(process);
		}
	}
	
	public int insertRecordGenericOrden() throws Exception {
		try {
			resultTransaction = tOrdenManager.insertSelective(tOrden);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int updateRecordGenericOrden() throws Exception {
		try {
			tOrdenExample.clear();
			tOrdenExample.createCriteria().andOrdCodTipDocEqualTo(constantes.getParamSerialTipoDocumentoTrabajoNoDefinido()).andOrdSerieDocEqualTo(tOrden.getOrdSerieDoc()).andOrdNumDocEqualTo(tOrden.getOrdNumDoc());
			
			tOrden.setOrdCodTipDoc(null);
			tOrden.setOrdSerieDoc(null);
			tOrden.setOrdNumDoc(null);
			
			resultTransaction = tOrdenManager.updateByExampleSelective(tOrden, tOrdenExample);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
			e.printStackTrace();
		}
		return resultTransaction;
	}
	
	public int deleteRecordGenericOrden() throws Exception {
		try {
			tOrdenExample.clear();
			tOrdenExample.createCriteria().andOrdCodTipDocEqualTo(constantes.getParamSerialTipoDocumentoTrabajoNoDefinido()).andOrdSerieDocEqualTo(tOrden.getOrdSerieDoc()).andOrdNumDocEqualTo(tOrden.getOrdNumDoc());
			resultTransaction = tOrdenManager.deleteByExample(tOrdenExample);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public void updateRecordOrigenOrden(String statusRecord) throws Exception {
		String serie = ordenes.getSerie();
		String orden = ordenes.getOrden();
		ordenes.clear();
		ordenes.setSerie(serie);
		ordenes.setOrden(orden);
		ordenes.setBiCodIndCam(statusRecord);
		// ordenes.setBiFecNumCam(Util.getCurrentDateTime());
		ordenesManager.updateByPrimaryKeySelective(ordenes);
	}
	
	public Integer getCotiId(String key) throws Exception {
		return mpCotizacion.get(key);
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

	
	public TEmpleadoCategoria gettEmpleadoCategoria() {
		return tEmpleadoCategoria;
	}

	
	public void settEmpleadoCategoria(TEmpleadoCategoria tEmpleadoCategoria) {
		this.tEmpleadoCategoria = tEmpleadoCategoria;
	}

	
	public TEmpleadoCategoriaExample gettEmpleadoCategoriaExample() {
		return tEmpleadoCategoriaExample;
	}

	
	public void settEmpleadoCategoriaExample(TEmpleadoCategoriaExample tEmpleadoCategoriaExample) {
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

	
	public Ordenes getOrdenes() {
		return ordenes;
	}

	
	public void setOrdenes(Ordenes ordenes) {
		this.ordenes = ordenes;
	}

	
	public OrdenesExample getOrdenesExample() {
		return ordenesExample;
	}

	
	public void setOrdenesExample(OrdenesExample ordenesExample) {
		this.ordenesExample = ordenesExample;
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

	
	public TOrden gettOrden() {
		return tOrden;
	}

	
	public void settOrden(TOrden tOrden) {
		this.tOrden = tOrden;
	}

	
	public TOrdenExample gettOrdenExample() {
		return tOrdenExample;
	}

	
	public void settOrdenExample(TOrdenExample tOrdenExample) {
		this.tOrdenExample = tOrdenExample;
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

	
	public TParametroManager gettParametroManager() {
		return tParametroManager;
	}

	
	public void settParametroManager(TParametroManager tParametroManager) {
		this.tParametroManager = tParametroManager;
	}

	
	public TEmpleadoCategoriaManager gettEmpleadoCategoriaManager() {
		return tEmpleadoCategoriaManager;
	}

	
	public void settEmpleadoCategoriaManager(TEmpleadoCategoriaManager tEmpleadoCategoriaManager) {
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

	
	public OrdenesManager getOrdenesManager() {
		return ordenesManager;
	}

	
	public void setOrdenesManager(OrdenesManager ordenesManager) {
		this.ordenesManager = ordenesManager;
	}

	
	public TOrdenManager gettOrdenManager() {
		return tOrdenManager;
	}

	
	public void settOrdenManager(TOrdenManager tOrdenManager) {
		this.tOrdenManager = tOrdenManager;
	}

	
	public TCotizacionManager gettCotizacionManager() {
		return tCotizacionManager;
	}

	
	public void settCotizacionManager(TCotizacionManager tCotizacionManager) {
		this.tCotizacionManager = tCotizacionManager;
	}

	
	public TServicioManager gettServicioManager() {
		return tServicioManager;
	}

	
	public void settServicioManager(TServicioManager tServicioManager) {
		this.tServicioManager = tServicioManager;
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

	
	public Map<String, Integer> getMpTipoReparto() {
		return mpTipoReparto;
	}

	
	public void setMpTipoReparto(Map<String, Integer> mpTipoReparto) {
		this.mpTipoReparto = mpTipoReparto;
	}

	
	public Map<String, Integer> getMpTipoServicio() {
		return mpTipoServicio;
	}

	
	public void setMpTipoServicio(Map<String, Integer> mpTipoServicio) {
		this.mpTipoServicio = mpTipoServicio;
	}

	
	public Map<String, Integer> getMpTipoPago() {
		return mpTipoPago;
	}

	
	public void setMpTipoPago(Map<String, Integer> mpTipoPago) {
		this.mpTipoPago = mpTipoPago;
	}

	
	public Map<String, Integer> getMpTipoMoneda() {
		return mpTipoMoneda;
	}

	
	public void setMpTipoMoneda(Map<String, Integer> mpTipoMoneda) {
		this.mpTipoMoneda = mpTipoMoneda;
	}

	
	public Map<String, Integer> getMpEstadoOrden() {
		return mpEstadoOrden;
	}

	
	public void setMpEstadoOrden(Map<String, Integer> mpEstadoOrden) {
		this.mpEstadoOrden = mpEstadoOrden;
	}

	
	public Map<String, Integer> getMpCotizacion() {
		return mpCotizacion;
	}

	
	public void setMpCotizacion(Map<String, Integer> mpCotizacion) {
		this.mpCotizacion = mpCotizacion;
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

	
	public List<TEmpleadoCategoria> getLstEmpleadoCategoria() {
		return lstEmpleadoCategoria;
	}

	
	public void setLstEmpleadoCategoria(List<TEmpleadoCategoria> lstEmpleadoCategoria) {
		this.lstEmpleadoCategoria = lstEmpleadoCategoria;
	}

	
	public List<TCotizacion> getLstCotizacion() {
		return lstCotizacion;
	}

	
	public void setLstCotizacion(List<TCotizacion> lstCotizacion) {
		this.lstCotizacion = lstCotizacion;
	}

	
	public List<String> getLstCotizaciones() {
		return lstCotizaciones;
	}

	
	public void setLstCotizaciones(List<String> lstCotizaciones) {
		this.lstCotizaciones = lstCotizaciones;
	}

	
	public List<TServicio> getLstServicio() {
		return lstServicio;
	}

	
	public void setLstServicio(List<TServicio> lstServicio) {
		this.lstServicio = lstServicio;
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
}
