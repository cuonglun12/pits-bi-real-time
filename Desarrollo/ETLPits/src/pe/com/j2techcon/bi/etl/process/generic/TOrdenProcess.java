package pe.com.j2techcon.bi.etl.process.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
	
	private List<TParametro> lstParametro;
	private List<TAreaCliente> lstAreaCliente;
	private List<TProducto> lstProducto;
	private List<TEmpleadoCategoria> lstEmpleadoCategoria;
	private List<TCotizacion> lstCotizacion;
	private List<TServicio> lstServicio;
	
	private List<String> lstLista;
	
	private Constantes constantes;
	
	static Logger log = Logger.getLogger(TOrdenProcess.class);
	
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

	public void setLstEmpleadoCategoria(
			List<TEmpleadoCategoria> lstEmpleadoCategoria) {
		this.lstEmpleadoCategoria = lstEmpleadoCategoria;
	}

	public List<TCotizacion> getLstCotizacion() {
		return lstCotizacion;
	}

	public void setLstCotizacion(List<TCotizacion> lstCotizacion) {
		this.lstCotizacion = lstCotizacion;
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

	public TOrdenProcess(BeanFactory factory, int sizePage,
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
		
		int offset = 0;
		
		while (true) {

			ordenesExample.clear();
			//Se trabajara solo con las ordenes del negocio de mensajeria local
			ordenesExample.createCriteria().andCodambitoEqualTo(constantes.getParamCodeTipoAmbitoLocal());
			ordenesExample.createCriteria().andCodnegocioEqualTo(constantes.getParamCodeTipoNegocioMensajeria());
			ordenesExample.createCriteria().andBiFecNumCamGreaterThanOrEqualTo(Util.getDateTimeLongAsDate(dateTimeFrom));
			ordenesExample.createCriteria().andBiFecNumCamLessThan(Util.getDateTimeLongAsDate(dateTimeUntil));
			ordenesExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			
			List<Ordenes> lstOrden = ordenesManager.selectByExample(ordenesExample);

			if (lstOrden.size() > 0) {
				for (Iterator<Ordenes> iterator = lstOrden.iterator(); iterator.hasNext();) {
					ordenes = iterator.next();
					tOrden.clear();
					processRecordOrden();
				}
				offset = offset + constantes.getSizePage();
			} else {

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

				lstParametro.clear();
				lstAreaCliente.clear();
				lstProducto.clear();
				lstEmpleadoCategoria.clear();
				lstServicio.clear();
				lstCotizacion.clear();
				lstLista.clear();

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

	public void processRecordOrden() throws Exception{
		
		completeFieldOrden();
		
		//Verificamos la existencia de la cotizacion de la orden correspondiente
		if(tOrden.getCotiId() != 0){
			if(typeProcess.equals(constantes.getTypeProcessSimple())){
				if(tOrden.getCodIndCam().equals(constantes.getStateRecordNew())){
					if(insertRecordGenericOrden()> constantes.getResultTransactionNoResult()){
						stateRecordOrigen = constantes.getStateRecordProcessed();
						recordProcessed = recordProcessed + 1; 
					} else{
						stateRecordOrigen = constantes.getStateRecordInconsistent();
						recordRejected = recordRejected + 1;
					}
				}else{
					if(updateRecordGenericOrden() > constantes.getResultTransactionNoResult()){
						stateRecordOrigen = constantes.getStateRecordProcessed();
						recordProcessed = recordProcessed + 1; 
					} else{
						stateRecordOrigen = constantes.getStateRecordInconsistent();
						recordRejected = recordRejected + 1;
					}
				}
			}else{
				if(updateRecordGenericOrden() > constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				}else{
					if(insertRecordGenericOrden() > constantes.getResultTransactionNoResult()){
						stateRecordOrigen = constantes.getStateRecordProcessed();
						recordProcessed = recordProcessed + 1;
					}else{
						stateRecordOrigen = constantes.getStateRecordInconsistent();
						recordRejected = recordRejected + 1;
					}
				}
			}
			
			updateRecordOrigenOrden(stateRecordOrigen);
		}else{
			stateRecordOrigen = constantes.getStateRecordInconsistent();
			recordRejected = recordRejected + 1;
			updateRecordOrigenOrden(stateRecordOrigen);
		}		
	}

	public void completeFieldOrden() throws Exception{

		//Id de la cotizacion
		tOrden.setCotiId(getCotiId(ordenes.getCoserie(), Integer.toString(ordenes.getConumero())));
		
		//Verificamos la existencia de la cotizacion de la orden correspondiente
		if(tOrden.getCotiId() != 0){

			//Codigo del area del cliente
			lstLista.clear();
			lstLista.add(ordenes.getCodareacliente());
			lstLista.add(constantes.getValueStringDefault());
			
			tAreaClienteExample.clear();
			tAreaClienteExample.createCriteria().andCliCodEqualTo(ordenes.getCodcliente());
			tAreaClienteExample.createCriteria().andAreCliCodIn(lstLista);
			lstAreaCliente = tAreaClienteManager.selectByExample(tAreaClienteExample);
			if(lstAreaCliente.size()>0){
				if(lstAreaCliente.size()>1){
					if(!constantes.getValueStringDefault().equals(lstAreaCliente.get(0).getAreCliCod())){
						tOrden.setCodAreCli(lstAreaCliente.get(0).getAreCliId());
					}else{
						tOrden.setCodAreCli(lstAreaCliente.get(1).getAreCliId());
					}
				}else{
					tOrden.setCodAreCli(lstAreaCliente.get(0).getAreCliId());
				}
			}
			
			//Codido de la categoria del empleado: Por defecto se ingresa el valor 0
			tOrden.setEmpCatId(0);
			
			//Tipo de reparto			
			if(constantes.getParamCodeTipoRepartoNoBajoPuerta().equals(ordenes.getCodtiporeparto())){
				tOrden.setOrdCodTipRep(constantes.getParamSerialTipoRepartoNoBajoPuerta());
			}else if(constantes.getParamCodeTipoRepartoBajoPuerta().equals(ordenes.getCodtiporeparto())){
				tOrden.setOrdCodTipRep(constantes.getParamSerialTipoRepartoBajoPuerta());
			}else if(constantes.getParamCodeTipoRepartoPorcentajeDeBajoPuerta().equals(ordenes.getCodtiporeparto())){
				tOrden.setOrdCodTipRep(constantes.getParamSerialTipoRepartoPorcentajeDeBajoPuerta());
			}else if(constantes.getParamCodeTipoRepartoVolanteSinCargo().equals(ordenes.getCodtiporeparto())){
				tOrden.setOrdCodTipRep(constantes.getParamSerialTipoRepartoVolanteSinCargo());
			}else if(constantes.getParamCodeTipoRepartoSinValor().equals(ordenes.getCodtiporeparto())){
				tOrden.setOrdCodTipRep(constantes.getParamSerialTipoRepartoSinValor());
			}else if(constantes.getParamCodeTipoReparto3DiasBajoPuerta().equals(ordenes.getCodtiporeparto())){
				tOrden.setOrdCodTipRep(constantes.getParamSerialTipoReparto3DiasBajoPuerta());
			}else if(constantes.getParamCodeTipoReparto4DiasBajoPuerta().equals(ordenes.getCodtiporeparto())){
				tOrden.setOrdCodTipRep(constantes.getParamSerialTipoReparto4DiasBajoPuerta());
			}else{
				tOrden.setOrdCodTipRep(constantes.getParamSerialTipoRepartoNoDefinido());
			}
			
			//Codigo de servicio
			//			tServicioExample.clear();
			//			tServicioExample.createCriteria().andServCodEqualTo(ordenes.getCodservicio());
			//			lstServicio = tServicioManager.selectByExample(tServicioExample);
			//			if(lstServicio.size()>0){
			//				tOrden.setServId(lstServicio.get(0).getServId());
			//			}
			
			if(constantes.getParamCodeTipoServicioCorreo1Dia().equals(ordenes.getCodservicio())){
				tOrden.setServId(constantes.getParamSerialTipoServicioCorreo1Dia());
			}else if(constantes.getParamCodeTipoServicioCorreo2Dias().equals(ordenes.getCodservicio())){
				tOrden.setServId(constantes.getParamSerialTipoServicioCorreo2Dias());
			}else if(constantes.getParamCodeTipoServicioCorreo3Dias().equals(ordenes.getCodservicio())){
				tOrden.setServId(constantes.getParamSerialTipoServicioCorreo3Dias());
			}else if(constantes.getParamCodeTipoServicioCorreo4Dias().equals(ordenes.getCodservicio())){
				tOrden.setServId(constantes.getParamSerialTipoServicioCorreo4Dias());
			}else if(constantes.getParamCodeTipoServicioCorreo5Dias().equals(ordenes.getCodservicio())){
				tOrden.setServId(constantes.getParamSerialTipoServicioCorreo5Dias());
			}else if(constantes.getParamCodeTipoServicioExpress25Dias().equals(ordenes.getCodservicio())){
				tOrden.setServId(constantes.getParamSerialTipoServicioExpress25Dias());
			}else if(constantes.getParamCodeTipoServicioEconExp1530Dias().equals(ordenes.getCodservicio())){
				tOrden.setServId(constantes.getParamSerialTipoServicioEconExp1530Dias());
			}else if(constantes.getParamCodeTipoServicioCorreo1530Dias().equals(ordenes.getCodservicio())){
				tOrden.setServId(constantes.getParamSerialTipoServicioCorreo1530Dias());
			}else if(constantes.getParamCodeTipoServicioCorreo4DiasAMas().equals(ordenes.getCodservicio())){
				tOrden.setServId(constantes.getParamSerialTipoServicioCorreo4DiasAMas());
			}else if(constantes.getParamCodeTipoServicioVolanteoPersonalizado().equals(ordenes.getCodservicio())){
				tOrden.setServId(constantes.getParamSerialTipoServicioVolanteoPersonalizado());
			}else if(constantes.getParamCodeTipoServicioVolanteoSimple().equals(ordenes.getCodservicio())){
				tOrden.setServId(constantes.getParamSerialTipoServicioVolanteoSimple());
			}else {
				tOrden.setServId(constantes.getParamSerialTipoServicioNoDefinido());
			}
			
			//Codigo del producto
			tProductoExample.clear();
			tProductoExample.createCriteria().andProdCodEqualTo(ordenes.getCodproducto());
			lstProducto = tProductoManager.selectByExample(tProductoExample);
			if(lstProducto.size()>0){
				tOrden.setProdId(lstProducto.get(0).getProdId());
			}
			
			//Tipo de pago
			if(constantes.getParamCodeTipoPagoCredito().equals(ordenes.getTipoPagoOrden())){
				tOrden.setOrdCodTipPag(constantes.getParamSerialTipoPagoCredito());
			}
			else if (constantes.getParamCodeTipoPagoContado().equals(ordenes.getTipoPagoOrden())){
				tOrden.setOrdCodTipPag(constantes.getParamSerialTipoPagoContado());
			}
			else if (constantes.getParamCodeTipoPagoCuotas().equals(ordenes.getTipoPagoOrden())){
				tOrden.setOrdCodTipPag(constantes.getParamSerialTipoPagoCuotas());
			}
			else if (constantes.getParamCodeTipoPagoPrepaid().equals(ordenes.getTipoPagoOrden())){
				tOrden.setOrdCodTipPag(constantes.getParamSerialTipoPagoPrepaid());
			}
			else if (constantes.getParamCodeTipoPagoCollect().equals(ordenes.getTipoPagoOrden())){
				tOrden.setOrdCodTipPag(constantes.getParamSerialTipoPagoCollect());
			}
			else {
				tOrden.setOrdCodTipPag(constantes.getParamSerialTipoPagoNoDefinido());
			}
			
			//Tipo de moneda
			if(constantes.getParamCodeTipoMonedaNuevoSol().equals(ordenes.getMoneda())){
				tOrden.setOrdCodTipMon(constantes.getParamSerialTipoMonedaNuevoSol());
			}
			else if(constantes.getParamCodeTipoMonedaDolar().equals(ordenes.getMoneda())){
				tOrden.setOrdCodTipMon(constantes.getParamSerialTipoMonedaDolar());
			}
			else{
				tOrden.setOrdCodTipMon(constantes.getParamSerialTipoMonedaNoDefinido());
			}
			
			//Tipo de documento de trabajo: Por defecto se colocara no definido
			tOrden.setOrdCodTipDoc(constantes.getParamSerialTipoDocumentoTrabajoNoDefinido());
			
			//Cantidad de cargos
			if(ordenes.getCntDigitado() == 0){
				tOrden.setOrdCntCargos(ordenes.getCntAdmision().intValue());
			}else{
				tOrden.setOrdCntCargos(ordenes.getCntDigitado().intValue());
			}
			
			//Indicador de facturacion
			if(constantes.getParamCodeEstadoFacturadoSi().equals(ordenes.getFacturado())){
				tOrden.setOrdIndFac(constantes.getParamSerialEstadoFacturadoSi());
			}else{
				tOrden.setOrdIndFac(constantes.getParamSerialEstadoFacturadoNo());
			}
			
			//Fechas
			tOrden.setOrdFecIni(ordenes.getFechainicio());
			tOrden.setOrdFecVen(ordenes.getFechavencimiento());
			//tOrden.setOrdFecCie();
			tOrden.setOrdFecDev(ordenes.getFechadevolucion());
			//tOrden.setOrdFecLiq();
			//tOrden.setOrdFecFac();
			
			//Montos
			tOrden.setOrdImporte(ordenes.getImporte());
			tOrden.setOrdDescuento(ordenes.getDescuento());
			tOrden.setOrdVenta(ordenes.getVenta());
			tOrden.setOrdIgv(ordenes.getIgv());
			tOrden.setOrdTotal(ordenes.getTotal());
			
			//Estado de la orden
			if(constantes.getParamCodeEstadoOrdenGenerado().equals(ordenes.getEstadoorden())){
				tOrden.setOrdCodEst(constantes.getParamSerialEstadoOrdenGenerado());
			}
			else if(constantes.getParamCodeEstadoOrdenPendiente().equals(ordenes.getEstadoorden())){
				tOrden.setOrdCodEst(constantes.getParamSerialEstadoOrdenPendiente());
			}
			else if(constantes.getParamCodeEstadoOrdenAnulado().equals(ordenes.getEstadoorden())){
				tOrden.setOrdCodEst(constantes.getParamSerialEstadoOrdenAnulado());
			}
			else if(constantes.getParamCodeEstadoOrdenCerrado().equals(ordenes.getEstadoorden())){
				tOrden.setOrdCodEst(constantes.getParamSerialEstadoOrdenCerrado());
			}
			else{
				tOrden.setOrdCodEst(constantes.getParamSerialEstadoOrdenNoDefinido());
			}
			
			//Campos de control
			tOrden.setFecNumCam(Util.getCurrentDateTimeAsLong());
			if(constantes.getStateRecordNew().equals(ordenes.getBiCodIndCam())){
				tOrden.setCodIndCam(constantes.getStateRecordNew());
			}else{
				tOrden.setCodIndCam(constantes.getStateRecordProcessed());
			}
			tOrden.setProcId(process);
		}
	}

	public int insertRecordGenericOrden() throws Exception{
		try {
			resultTransaction = tOrdenManager.insertSelective(tOrden);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int updateRecordGenericOrden() throws Exception{
		try {
			tOrdenExample.clear();
			tOrdenExample.createCriteria().andOrdCodTipDocEqualTo(constantes.getParamSerialTipoDocumentoTrabajoNoDefinido());
			tOrdenExample.createCriteria().andOrdSerieDocEqualTo(tOrden.getOrdSerieDoc());
			tOrdenExample.createCriteria().andOrdNumDocEqualTo(tOrden.getOrdNumDoc());
			resultTransaction = tOrdenManager.updateByExampleSelective(tOrden, tOrdenExample);	
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int deleteRecordGenericOrden() throws Exception{
		try {
			tOrdenExample.clear();
			tOrdenExample.createCriteria().andOrdCodTipDocEqualTo(constantes.getParamSerialTipoDocumentoTrabajoNoDefinido());
			tOrdenExample.createCriteria().andOrdSerieDocEqualTo(tOrden.getOrdSerieDoc());
			tOrdenExample.createCriteria().andOrdNumDocEqualTo(tOrden.getOrdNumDoc());
			resultTransaction = tOrdenManager.deleteByExample(tOrdenExample);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public void updateRecordOrigenOrden(String statusRecord) throws Exception{
		String serie = ordenes.getSerie();
		String orden = ordenes.getOrden();
		ordenes.clear();
		ordenes.setSerie(serie);
		ordenes.setOrden(orden);
		ordenes.setBiCodIndCam(statusRecord);
		ordenesManager.updateByPrimaryKeySelective(ordenes);
	}
	
	public int getCotiId(String serie, String numero)throws Exception{
		int cotiId = 0;
		if(serie.equals(tCotizacion.getCotiSerieDoc()) && numero.equals(tCotizacion.getCotiNumDoc())){
			cotiId = tCotizacion.getCotiId();
		}else{
			tCotizacionExample.clear();
			tCotizacionExample.createCriteria().andCotiCodTipDocEqualTo(constantes.getParamSerialTipoDocumentoTrabajoNoDefinido());
			tCotizacionExample.createCriteria().andCotiSerieDocEqualTo(ordenes.getCoserie());
			tCotizacionExample.createCriteria().andCotiNumDocEqualTo(Integer.toString(ordenes.getConumero()));
			lstCotizacion = tCotizacionManager.selectByExample(tCotizacionExample);
			if(lstCotizacion.size()>0){
				tCotizacion = lstCotizacion.get(0);
				cotiId = tCotizacion.getCotiId();
			}
		}		
		return cotiId;
	}
}
