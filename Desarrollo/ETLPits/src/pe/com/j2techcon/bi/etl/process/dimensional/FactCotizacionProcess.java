package pe.com.j2techcon.bi.etl.process.dimensional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.logic.dimensional.DimTiempoManager;
import pe.com.j2techcon.bi.etl.logic.dimensional.FactCotizacionManager;
import pe.com.j2techcon.bi.etl.logic.generic.TAreaClienteManager;
import pe.com.j2techcon.bi.etl.logic.generic.TCotizacionManager;
import pe.com.j2techcon.bi.etl.logic.generic.TOrdenManager;
//import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.util.Util;
//import pe.com.j2techcon.bi.etl.domain.dimensional.DimTiempo;
//import pe.com.j2techcon.bi.etl.domain.dimensional.DimTiempoExample;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactCotizacion;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactCotizacionExample;
import pe.com.j2techcon.bi.etl.domain.generic.TAreaCliente;
import pe.com.j2techcon.bi.etl.domain.generic.TAreaClienteExample;
import pe.com.j2techcon.bi.etl.domain.generic.TCotizacion;
import pe.com.j2techcon.bi.etl.domain.generic.TCotizacionExample;
import pe.com.j2techcon.bi.etl.domain.generic.TOrden;
import pe.com.j2techcon.bi.etl.domain.generic.TOrdenExample;
//import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
//import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;

public class FactCotizacionProcess {
	
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
	private int recordTotalOrden;
	
	private String stateRecordDimensional;
	private String stateRecordGeneric;
	
	private TAreaCliente tAreaCliente;
	private TAreaClienteExample tAreaClienteExample;
	
	private TOrden tOrden;
	private TOrdenExample tOrdenExample;
	
	private TCotizacion tCotizacion;
	private TCotizacionExample tCotizacionExample;
	
	//private TParametro tParametro;
	//private TParametroExample tParametroExample;
	
	private FactCotizacion factCotizacion;
	private FactCotizacionExample factCotizacionExample;
	
	//private DimTiempo dimTiempo;
	//private DimTiempoExample dimTiempoExample;
	
	private TAreaClienteManager tAreaClienteManager;
	private TOrdenManager tOrdenManager;
	private TCotizacionManager tCotizacionManager;
	//private TParametroManager tParametroManager;
	private DimTiempoManager dimTiempoManager;
	private FactCotizacionManager factCotizacionManager;
	
	private Constantes constantes;
	
	List<Integer> statesOrden;

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

	public int getRecordTotalOrden() {
		return recordTotalOrden;
	}

	public void setRecordTotalOrden(int recordTotalOrden) {
		this.recordTotalOrden = recordTotalOrden;
	}

	public String getStateRecordDimensional() {
		return stateRecordDimensional;
	}

	public void setStateRecordDimensional(String stateRecordDimensional) {
		this.stateRecordDimensional = stateRecordDimensional;
	}

	public String getStateRecordGeneric() {
		return stateRecordGeneric;
	}

	public void setStateRecordGeneric(String stateRecordGeneric) {
		this.stateRecordGeneric = stateRecordGeneric;
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

	//	public TParametro gettParametro() {
	//		return tParametro;
	//	}
	//
	//	public void settParametro(TParametro tParametro) {
	//		this.tParametro = tParametro;
	//	}
	//
	//	public TParametroExample gettParametroExample() {
	//		return tParametroExample;
	//	}
	//
	//	public void settParametroExample(TParametroExample tParametroExample) {
	//		this.tParametroExample = tParametroExample;
	//	}

	public FactCotizacion getFactCotizacion() {
		return factCotizacion;
	}

	public void setFactCotizacion(FactCotizacion factCotizacion) {
		this.factCotizacion = factCotizacion;
	}

	public FactCotizacionExample getFactCotizacionExample() {
		return factCotizacionExample;
	}

	public void setFactCotizacionExample(FactCotizacionExample factCotizacionExample) {
		this.factCotizacionExample = factCotizacionExample;
	}

	//	public DimTiempo getDimTiempo() {
	//		return dimTiempo;
	//	}
	//
	//	public void setDimTiempo(DimTiempo dimTiempo) {
	//		this.dimTiempo = dimTiempo;
	//	}
	//
	//	public DimTiempoExample getDimTiempoExample() {
	//		return dimTiempoExample;
	//	}
	//
	//	public void setDimTiempoExample(DimTiempoExample dimTiempoExample) {
	//		this.dimTiempoExample = dimTiempoExample;
	//	}

	public TAreaClienteManager gettAreaClienteManager() {
		return tAreaClienteManager;
	}

	public void settAreaClienteManager(TAreaClienteManager tAreaClienteManager) {
		this.tAreaClienteManager = tAreaClienteManager;
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

	//	public TParametroManager gettParametroManager() {
	//		return tParametroManager;
	//	}
	//
	//	public void settParametroManager(TParametroManager tParametroManager) {
	//		this.tParametroManager = tParametroManager;
	//	}

	public DimTiempoManager getDimTiempoManager() {
		return dimTiempoManager;
	}

	public void setDimTiempoManager(DimTiempoManager dimTiempoManager) {
		this.dimTiempoManager = dimTiempoManager;
	}

	public FactCotizacionManager getFactCotizacionManager() {
		return factCotizacionManager;
	}

	public void setFactCotizacionManager(FactCotizacionManager factCotizacionManager) {
		this.factCotizacionManager = factCotizacionManager;
	}

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public List<Integer> getStatesOrden() {
		return statesOrden;
	}

	public void setStatesOrden(List<Integer> statesOrden) {
		this.statesOrden = statesOrden;
	}

	public FactCotizacionProcess(BeanFactory factory, int sizePage,
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
		stateRecordDimensional = constantes.getStateRecordNew();
		stateRecordGeneric = constantes.getStateRecordNew();
		
	}

	public int startProcess(){

		tAreaClienteManager = factory.getBean("tAreaClienteManager", TAreaClienteManager.class);
		tOrdenManager = factory.getBean("tOrdenManager", TOrdenManager.class);
		tCotizacionManager = factory.getBean("tCotizacionManager", TCotizacionManager.class);
		//tParametroManager = factory.getBean("tParametroManager", TParametroManager.class);
		//dimTiempoManager = factory.getBean("dimTiempoManager", DimTiempoManager.class);
		factCotizacionManager = factory.getBean("factCotizacionManager", FactCotizacionManager.class);
		
		tAreaCliente = new TAreaCliente();
		tAreaClienteExample = new TAreaClienteExample();
		
		tOrden = new TOrden();
		tOrdenExample = new TOrdenExample();
		
		tCotizacion = new TCotizacion();
		tCotizacionExample = new TCotizacionExample();
		
		//tParametro = new TParametro();
		//tParametroExample = new TParametroExample();
		
		factCotizacion = new FactCotizacion();
		factCotizacionExample = new FactCotizacionExample();
		
		//dimTiempo = new DimTiempo();
		//dimTiempoExample = new DimTiempoExample();
		
		statesOrden = new ArrayList<Integer>();

		int offset = 0;
		
		while(true) {
			tOrdenExample.clear();

			tOrdenExample.createCriteria().andFecNumCamGreaterThanOrEqualTo(dateTimeFrom);
			tOrdenExample.createCriteria().andFecNumCamLessThan(dateTimeUntil);	
			
			tOrdenExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			List<TOrden> lstOrden = tOrdenManager.selectByExample(tOrdenExample);
			if(lstOrden.size()>0){
				for (Iterator<TOrden> iterator = lstOrden.iterator(); iterator.hasNext();) {
					tOrden = iterator.next();
					tCotizacion = tCotizacionManager.selectByPrimaryKey(tOrden.getCotiId());
					factCotizacion.clear();
					processRecordCotizacion();
				}
				offset = offset + constantes.getSizePage();
			}else{
				lstOrden.clear();
				
				tAreaCliente.clear();
				tAreaClienteExample.clear();
				
				tOrden.clear();
				tOrdenExample.clear();
				
				tCotizacion.clear();
				tCotizacionExample.clear();
				
				//tParametro.clear();
				//tParametroExample.clear();
				
				factCotizacion.clear();
				factCotizacionExample.clear();
				
				//dimTiempo.clear();
				//dimTiempoExample.clear();
				
				offset = 0;
				break;
			}
			
		}
		
		while(true){
			tCotizacionExample.clear();
			
			tCotizacionExample.createCriteria().andFecNumCamGreaterThanOrEqualTo(dateTimeFrom);
			tCotizacionExample.createCriteria().andFecNumCamLessThan(dateTimeUntil);	
			
			tCotizacionExample.createCriteria().andProcIdNotEqualTo(process);
			tCotizacionExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			List<TCotizacion> lstCotizacion = tCotizacionManager.selectByExample(tCotizacionExample);
			if(lstCotizacion.size()>0){
				for (Iterator<TCotizacion> iterator = lstCotizacion.iterator(); iterator.hasNext();) {
					tCotizacion = iterator.next();
					factCotizacion.clear();
					processRecordCotizacion();
				}
				offset = offset + constantes.getSizePage();
			}else{
				
				lstCotizacion.clear();
				
				tOrden.clear();
				tOrdenExample.clear();
				
				tCotizacion.clear();
				tCotizacionExample.clear();
				
				//tParametro.clear();
				//tParametroExample.clear();
				
				factCotizacion.clear();
				factCotizacionExample.clear();
				
				//dimTiempo.clear();
				//dimTiempoExample.clear();
				
				offset = 0;
				break;
			}
		}
		
		if(recordRejected > 0) {
			resultProcess = constantes.getResultProcessCompletedErrors();
		}
		else{
			resultProcess = constantes.getResultProcessCompletedCorrectly();
		}
		
		recordTotal = recordProcessed + recordRejected;

		return resultProcess;
	}
	
	public void processRecordCotizacion(){
		
		if(!tCotizacion.getProcId().equals(process)){
		
			completeFieldCotizacion();
			
			if(typeProcess.equals(constantes.getTypeProcessSimple())){
				if(tCotizacion.getCodIndCam().equals(constantes.getStateRecordNew())){
					if(insertRecordDimensionalCotizacion()> constantes.getResultTransactionNoResult()){
						stateRecordGeneric = constantes.getStateRecordProcessed();
						recordProcessed = recordProcessed + 1; 
					} else{
						stateRecordGeneric = constantes.getStateRecordInconsistent();
						recordRejected = recordRejected + 1;
					}
				}else{
					if(updateRecordDimensionalCotizacion() > constantes.getResultTransactionNoResult()){
						stateRecordGeneric = constantes.getStateRecordProcessed();
						recordProcessed = recordProcessed + 1; 
					} else{
						stateRecordGeneric = constantes.getStateRecordInconsistent();
						recordRejected = recordRejected + 1;
					}
				}
			}else{
				if(updateRecordDimensionalCotizacion() > constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				}else{
					if(insertRecordDimensionalCotizacion() > constantes.getResultTransactionNoResult()){
						stateRecordGeneric = constantes.getStateRecordProcessed();
						recordProcessed = recordProcessed + 1;
					}else{
						stateRecordGeneric = constantes.getStateRecordInconsistent();
						recordRejected = recordRejected + 1;
					}
				}
			}
			
			updateRecordGenericCotizacion(stateRecordGeneric);
			
		}else{
			recordProcessed = recordProcessed + 1;
		}
	}
	
	public void completeFieldCotizacion(){
		factCotizacion.setCotizacionKey(tCotizacion.getCotiId());
		factCotizacion.setCotizacionKeyClienteArea(tCotizacion.getAreCliId());
		factCotizacion.setCotizacionKeyUbigeoCliente(tAreaClienteManager.selectByPrimaryKey(tCotizacion.getAreCliId()).getUbiId());
		factCotizacion.setCotizacionKeyServicio(tCotizacion.getCotiCodServ());
		factCotizacion.setCotizacionKeyProducto(tCotizacion.getProdId());
		
		//dimTiempoExample.clear();
		//dimTiempoExample.createCriteria().andTiempoFechaEqualTo();
		//dimTiempo = (dimTiempoManager.selectByExample(dimTiempoExample)).get(0);
		//factCotizacion.setCotizacionKeyFecApro(dimTiempo.getTiempoKey());
		factCotizacion.setCotizacionKeyFecApro(Util.getDateAsInteger(tCotizacion.getCotiFecApro()));
		
		//dimTiempoExample.clear();
		//dimTiempoExample.createCriteria().andTiempoFechaEqualTo(tCotizacion.getCotiFecIni());
		//dimTiempo = (dimTiempoManager.selectByExample(dimTiempoExample)).get(0);
		//factCotizacion.setCotizacionKeyFecIni(dimTiempo.getTiempoKey());
		factCotizacion.setCotizacionKeyFecIni(Util.getDateAsInteger(tCotizacion.getCotiFecIni()));
		
		//dimTiempoExample.clear();
		//dimTiempoExample.createCriteria().andTiempoFechaEqualTo(tCotizacion.getCotiFecFin());
		//dimTiempo = (dimTiempoManager.selectByExample(dimTiempoExample)).get(0);
		//factCotizacion.setCotizacionKeyFecFin(dimTiempo.getTiempoKey());
		factCotizacion.setCotizacionKeyFecFin(Util.getDateAsInteger(tCotizacion.getCotiFecFin()));

		factCotizacion.setCotizacionKeyEstado(tCotizacion.getCotiCodEst());
		
		tOrdenExample.clear();
		tOrdenExample.createCriteria().andCotiIdEqualTo(factCotizacion.getCotizacionKey());
		tOrdenExample.createCriteria().andFecNumCamBetween(dateTimeFrom, dateTimeUntil);
		recordTotal = tOrdenManager.countByExample(tOrdenExample);
		
		if(recordTotal>0){
			
			//int indEstOrdCan = 0;
			//int indEstOrdFac = 0;
			
			tOrdenExample.clear();
			tOrdenExample.createCriteria().andCotiIdEqualTo(factCotizacion.getCotizacionKey());
			factCotizacion.setCotizacionCntOrdTotal(tOrdenManager.countByExample(tOrdenExample));
			
			tOrdenExample.clear();
			tOrdenExample.createCriteria().andCotiIdEqualTo(factCotizacion.getCotizacionKey());
			//tParametroExample.clear();
			//tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoOrden());
			//tParametroExample.createCriteria().andParamCodEqualTo(constantes.getParamCodeEstadoOrdenGenerado());
			//tParametro = tParametroManager.selectByExample(tParametroExample).get(0);
			//tOrdenExample.createCriteria().andOrdCodEstEqualTo(tParametro.getParamId());
			//tParametroExample.clear();
			//tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoOrden());
			//tParametroExample.createCriteria().andParamCodEqualTo(constantes.getParamCodeEstadoOrdenPendiente());
			//tParametro = tParametroManager.selectByExample(tParametroExample).get(0);
			//tOrdenExample.createCriteria().andOrdCodEstEqualTo(tParametro.getParamId());
			
			statesOrden.clear();
			statesOrden.add(constantes.getParamSerialEstadoOrdenGenerado());
			statesOrden.add(constantes.getParamSerialEstadoOrdenPendiente());
			
			tOrdenExample.createCriteria().andOrdCodEstIn(statesOrden);
			
			factCotizacion.setCotizacionCntOrdEnTrab(tOrdenManager.countByExample(tOrdenExample));
			
			tOrdenExample.clear();
			tOrdenExample.createCriteria().andCotiIdEqualTo(factCotizacion.getCotizacionKey());
			//tParametroExample.clear();
			//tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoOrden());
			//tParametroExample.createCriteria().andParamCodEqualTo(constantes.getParamCodeEstadoOrdenCerrado());
			//tParametro = tParametroManager.selectByExample(tParametroExample).get(0);
			//tOrdenExample.createCriteria().andOrdCodEstEqualTo(tParametro.getParamId());
			tOrdenExample.createCriteria().andOrdCodEstEqualTo(constantes.getParamSerialEstadoOrdenCerrado());
			factCotizacion.setCotizacionCntOrdCer(tOrdenManager.countByExample(tOrdenExample));
			
			tOrdenExample.clear();
			tOrdenExample.createCriteria().andCotiIdEqualTo(factCotizacion.getCotizacionKey());
			//tOrdenExample.createCriteria().andOrdCodEstEqualTo(tParametro.getParamId());
			tOrdenExample.createCriteria().andOrdCodEstEqualTo(constantes.getParamSerialEstadoOrdenCerrado());
			tOrdenExample.setWhereBetweenFields(" and ordfeccie > ordfecven");
			factCotizacion.setCotizacionCntOrdCftiempo(tOrdenManager.countByExample(tOrdenExample));
			
			factCotizacion.setCotizacionCntOrdCatiempo(factCotizacion.getCotizacionCntOrdCer()-factCotizacion.getCotizacionCntOrdCftiempo());
			
			tOrdenExample.clear();
			tOrdenExample.createCriteria().andCotiIdEqualTo(factCotizacion.getCotizacionKey());
			//tParametroExample.clear();
			//tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoOrden());
			//tParametroExample.createCriteria().andParamCodEqualTo(constantes.getParamCodeEstadoOrdenAnulado());
			//tParametro = tParametroManager.selectByExample(tParametroExample).get(0);
			//indEstOrdCan = tParametroManager.selectByExample(tParametroExample).get(0).getParamId();
			//indEstOrdCan = constantes.getParamSerialEstadoOrdenAnulado();
			tOrdenExample.createCriteria().andOrdCodEstEqualTo(constantes.getParamSerialEstadoOrdenAnulado());
			factCotizacion.setCotizacionCntOrdCan(tOrdenManager.countByExample(tOrdenExample));
			
			tOrdenExample.clear();
			tOrdenExample.createCriteria().andCotiIdEqualTo(factCotizacion.getCotizacionKey());
			//tParametroExample.clear();
			//tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoFacturado());
			//tParametroExample.createCriteria().andParamCodEqualTo(constantes.getParamCodeEstadoFacturadoSi());
			//tParametro = tParametroManager.selectByExample(tParametroExample).get(0);
			//indEstOrdFac = tParametroManager.selectByExample(tParametroExample).get(0).getParamId(); 
			//indEstOrdFac = constantes.getParamSerialEstadoFacturadoSi();
			tOrdenExample.createCriteria().andOrdIndFacEqualTo(constantes.getParamSerialEstadoFacturadoSi());
			factCotizacion.setCotizacionCntOrdFac(tOrdenManager.countByExample(tOrdenExample));
			
			tOrdenExample.clear();
			tOrdenExample.createCriteria().andCotiIdEqualTo(factCotizacion.getCotizacionKey());
			
			factCotizacion.setCotizacionMonOrdTot(new BigDecimal(0));
			factCotizacion.setCotizacionMonOrdCan(new BigDecimal(0));
			factCotizacion.setCotizacionMonOrdFac(new BigDecimal(0));
			
			List<TOrden> lstOrdenes = tOrdenManager.selectByExample(tOrdenExample);
			for (Iterator<TOrden> iterator = lstOrdenes.iterator(); iterator.hasNext();) {
				
				tOrden = iterator.next();
				
				factCotizacion.setCotizacionMonOrdTot(factCotizacion.getCotizacionMonOrdTot().add(tOrden.getOrdTotal()));
				
				if(constantes.getParamSerialEstadoFacturadoSi() == tOrden.getOrdCodEst()){
					factCotizacion.setCotizacionMonOrdFac(factCotizacion.getCotizacionMonOrdFac().add(tOrden.getOrdTotal()));
				}
				if(constantes.getParamSerialEstadoOrdenAnulado() == tOrden.getOrdCodEst()){
					factCotizacion.setCotizacionMonOrdCan(factCotizacion.getCotizacionMonOrdCan().add(tOrden.getOrdTotal()));
				}
			}
			lstOrdenes.clear();
		}
		
		factCotizacion.setProcId(process);
	}
	
	public int insertRecordDimensionalCotizacion(){
		try{
			resultTransaction = factCotizacionManager.insertSelective(factCotizacion);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int updateRecordDimensionalCotizacion(){
		try{
			resultTransaction = factCotizacionManager.updateByPrimaryKeySelective(factCotizacion);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int deleteRecordDimensionalCotizacion(){
		try{
			resultTransaction = factCotizacionManager.deleteByPrimaryKey(factCotizacion.getCotizacionKey());
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction; 
	}
	
	public void updateRecordGenericCotizacion(String statusRecord){
		try{
			int idCotizacion = tCotizacion.getCotiId();
			tCotizacion.clear();
			tCotizacion.setCotiId(idCotizacion);
			tCotizacion.setCodIndCam(statusRecord);
			tCotizacion.setProcId(process);
			tCotizacionManager.updateByPrimaryKeySelective(tCotizacion);
		}catch(Exception e){
			
		}
	}
}
