package pe.com.j2techcon.bi.etl.process.generic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
	
	private List<TParametro> lstParametro;
	private List<TAreaCliente> lstAreaCliente;
	private List<TProducto> lstProducto;
	private List<String> lstLista;
	
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
			long dateTimeFrom, long dateTimeUntil, String typeProcess, int process) {
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

	public int startProcess() {
		
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
		
		int offset = 0;
		
		while (true) {

			tCotizacionesExample.clear();

			//Se trabajara solo con las cotizaciones del negocio de mensajeria local
			tCotizacionesExample.createCriteria().andCodambitoEqualTo(constantes.getParamCodeTipoAmbitoLocal());
			tCotizacionesExample.createCriteria().andCodnegocioEqualTo(constantes.getParamCodeTipoNegocioMensajeria());
			tCotizacionesExample.createCriteria().andBiFecNumCamGreaterThanOrEqualTo(Util.getDateTimeLongAsDate(dateTimeFrom));
			tCotizacionesExample.createCriteria().andBiFecNumCamLessThan(Util.getDateTimeLongAsDate(dateTimeUntil));
			
			tCotizacionesExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			
			List<TCotizaciones> lstCotizacion = tCotizacionesManager.selectByExample(tCotizacionesExample);

			if (lstCotizacion.size() > 0) {
				for (Iterator<TCotizaciones> iterator = lstCotizacion.iterator(); iterator.hasNext();) {
					tCotizaciones = iterator.next();
					tCotizacion.clear();
					processRecordCotizacion();
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

				tCotizaciones.clear();
				tCotizacionesExample.clear();

				tCotizacion.clear();
				tCotizacionExample.clear();

				lstParametro.clear();
				lstAreaCliente.clear();
				lstProducto.clear();
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

	public void processRecordCotizacion() {
		
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

	public void completeFieldCotizacion() {

		//Codido de la categoria del empleado: Por defecto se ingresa el valor 0
		tCotizacion.setEmpCatId(0);
		
		//Codigo del area del cliente
		lstLista.clear();
		lstLista.add(tCotizaciones.getCodareacliente());
		lstLista.add(constantes.getValueStringDefault());
		
		tAreaClienteExample.clear();
		tAreaClienteExample.createCriteria().andCliCodEqualTo(tCotizaciones.getCodcliente());
		tAreaClienteExample.createCriteria().andAreCliCodIn(lstLista);
		lstAreaCliente = tAreaClienteManager.selectByExample(tAreaClienteExample);
		if(lstAreaCliente.size()>0){
			if(lstAreaCliente.size()>1){
				if(!constantes.getValueStringDefault().equals(lstAreaCliente.get(0).getAreCliCod())){
					tCotizacion.setAreCliId(lstAreaCliente.get(0).getAreCliId());
				}else{
					tCotizacion.setAreCliId(lstAreaCliente.get(1).getAreCliId());
				}
			}else{
				tCotizacion.setAreCliId(lstAreaCliente.get(0).getAreCliId());
			}
		}
		
		//Codigo del producto
		tProductoExample.clear();
		tProductoExample.createCriteria().andProdCodEqualTo(tCotizaciones.getCodproducto());
		lstProducto = tProductoManager.selectByExample(tProductoExample);
		if(lstProducto.size()>0){
			tCotizacion.setProdId(lstProducto.get(0).getProdId());
		}
		
		//Tipo de ambito
		if(constantes.getParamCodeTipoAmbitoLocal().equals(tCotizaciones.getCodambito())){
			tCotizacion.setCotiCodAmb(constantes.getParamSerialTipoAmbitoLocal());
		}else{
			tCotizacion.setCotiCodAmb(constantes.getParamSerialTipoAmbitoNoDefinido());
		}
		
		//Tipo de servicio
		tParametroExample.clear();
		tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeTipoServicio());
		tParametroExample.createCriteria().andParamCodEqualTo(tCotizaciones.getCodservicio());
		lstParametro = tParametroManager.selectByExample(tParametroExample);
		if(lstParametro.size()>0){
			tCotizacion.setCotiCodServ(lstParametro.get(0).getParamId());
		}

		//Tipo de negocio
		if(constantes.getParamCodeTipoNegocioMensajeria().equals(tCotizaciones.getCodnegocio())){
			tCotizacion.setCotiCodNeg(constantes.getParamSerialTipoNegocioMensajeria());
		}else{
			tCotizacion.setCotiCodNeg(constantes.getParamSerialTipoNegocioNoDefinido());
		}
		
		//Tipo de documento de trabajo: Por defecto se colocara no definido
		tCotizacion.setCotiCodTipDoc(constantes.getParamSerialTipoDocumentoTrabajoNoDefinido());
		
		//Datos generales
		tCotizacion.setCotiSerieDoc(tCotizaciones.getCoserie());
		tCotizacion.setCotiNumDoc(tCotizaciones.getConumero().toString());
		
		//Estado de la cotizacion
		if(constantes.getParamCodeEstadoCotizacionNormal().equals(tCotizaciones.getEstado().toString())){
			tCotizacion.setCotiCodEst(constantes.getParamSerialEstadoCotizacionNormal());
		}
		else if(constantes.getParamCodeEstadoCotizacionPlana().equals(tCotizaciones.getEstado().toString())){
			tCotizacion.setCotiCodEst(constantes.getParamSerialEstadoCotizacionPlana());
		}
		else if(constantes.getParamCodeEstadoCotizacionValijas().equals(tCotizaciones.getEstado().toString())){
			tCotizacion.setCotiCodEst(constantes.getParamSerialEstadoCotizacionValijas());
		}
		else if(constantes.getParamCodeEstadoCotizacionUbigeos().equals(tCotizaciones.getEstado().toString())){
			tCotizacion.setCotiCodEst(constantes.getParamSerialEstadoCotizacionUbigeos());
		}
		else if(constantes.getParamCodeEstadoCotizacionRangos().equals(tCotizaciones.getEstado().toString())){
			tCotizacion.setCotiCodEst(constantes.getParamSerialEstadoCotizacionRangos());
		}
		else if(constantes.getParamCodeEstadoCotizacionGiroRecojo().equals(tCotizaciones.getEstado().toString())){
			tCotizacion.setCotiCodEst(constantes.getParamSerialEstadoCotizacionGiroRecojo());
		}
		else{
			tCotizacion.setCotiCodEst(constantes.getParamSerialEstadoCotizacionNoDefinido());
		}
		
		//Fechas
		tCotizacion.setCotiFecApro(tCotizaciones.getFechaaprueba());
		tCotizacion.setCotiFecIni(tCotizaciones.getFecha());
		tCotizacion.setCotiFecFin(tCotizaciones.getFechaanula());
		
		//Campos de control
		tCotizacion.setFecNumCam(Util.getCurrentDateTimeAsLong());
		if(constantes.getStateRecordNew().equals(tCotizaciones.getBiCodIndCam())){
			tCotizacion.setCodIndCam(constantes.getStateRecordNew());
		}else{
			tCotizacion.setCodIndCam(constantes.getStateRecordProcessed());
		}
		tCotizacion.setProcId(process);

	}

	public int insertRecordGenericCotizacion() {
		try {
			resultTransaction = tCotizacionManager.insertSelective(tCotizacion);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int updateRecordGenericCotizacion() {
		try {
			tCotizacionExample.clear();
			tCotizacionExample.createCriteria().andCotiCodTipDocEqualTo(constantes.getParamSerialTipoDocumentoTrabajoNoDefinido());
			tCotizacionExample.createCriteria().andCotiSerieDocEqualTo(tCotizacion.getCotiSerieDoc());
			tCotizacionExample.createCriteria().andCotiNumDocEqualTo(tCotizacion.getCotiNumDoc());
			resultTransaction = tCotizacionManager.updateByExampleSelective(tCotizacion, tCotizacionExample);	
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int deleteRecordGenericCotizacion() {
		try {
			tCotizacionExample.clear();
			tCotizacionExample.createCriteria().andCotiCodTipDocEqualTo(constantes.getParamSerialTipoDocumentoTrabajoNoDefinido());
			tCotizacionExample.createCriteria().andCotiSerieDocEqualTo(tCotizacion.getCotiSerieDoc());
			tCotizacionExample.createCriteria().andCotiNumDocEqualTo(tCotizacion.getCotiNumDoc());
			resultTransaction = tCotizacionManager.deleteByExample(tCotizacionExample);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public void updateRecordOrigenCotizacion(String statusRecord) {
		try {
			String coSerie = tCotizaciones.getCoserie();
			BigDecimal coNumero = tCotizaciones.getConumero();
			tCotizaciones.clear();
			tCotizaciones.setCoserie(coSerie);
			tCotizaciones.setConumero(coNumero);
			tCotizaciones.setBiCodIndCam(statusRecord);
			tCotizacionesManager.updateByPrimaryKeySelective(tCotizaciones);
		} catch (Exception e) {

		}
	}

}
