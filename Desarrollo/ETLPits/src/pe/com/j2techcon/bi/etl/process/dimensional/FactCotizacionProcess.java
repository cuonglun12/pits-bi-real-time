package pe.com.j2techcon.bi.etl.process.dimensional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.logic.dimensional.DimTiempoManager;
import pe.com.j2techcon.bi.etl.logic.dimensional.FactCotizacionManager;
import pe.com.j2techcon.bi.etl.logic.generic.TAreaClienteManager;
import pe.com.j2techcon.bi.etl.logic.generic.TCotizacionManager;
import pe.com.j2techcon.bi.etl.logic.generic.TOrdenManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.util.Util;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactCotizacion;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactCotizacionExample;
import pe.com.j2techcon.bi.etl.domain.generic.TAreaCliente;
import pe.com.j2techcon.bi.etl.domain.generic.TAreaClienteExample;
import pe.com.j2techcon.bi.etl.domain.generic.TCotizacion;
import pe.com.j2techcon.bi.etl.domain.generic.TCotizacionExample;
import pe.com.j2techcon.bi.etl.domain.generic.TOrden;
import pe.com.j2techcon.bi.etl.domain.generic.TOrdenExample;

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
	
	private FactCotizacion factCotizacion;
	private FactCotizacionExample factCotizacionExample;
	
	private TAreaClienteManager tAreaClienteManager;
	private TOrdenManager tOrdenManager;
	private TCotizacionManager tCotizacionManager;
	private DimTiempoManager dimTiempoManager;
	private FactCotizacionManager factCotizacionManager;
	
	private List<TOrden> lstOrden;
	private List<TAreaCliente> lstAreaCliente;
	
	private Map<Integer, Integer> mpUbigeoAreaCliente;
	
	private Constantes constantes;

	static Logger log = Logger.getLogger(FactCotizacionProcess.class);

	public FactCotizacionProcess(BeanFactory factory, int sizePage,
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
		stateRecordDimensional = constantes.getStateRecordNew();
		stateRecordGeneric = constantes.getStateRecordNew();
		
	}

	public int startProcess()throws Exception{

		tAreaClienteManager = factory.getBean("tAreaClienteManager", TAreaClienteManager.class);
		tOrdenManager = factory.getBean("tOrdenManager", TOrdenManager.class);
		tCotizacionManager = factory.getBean("tCotizacionManager", TCotizacionManager.class);
		factCotizacionManager = factory.getBean("factCotizacionManager", FactCotizacionManager.class);
		
		tAreaCliente = new TAreaCliente();
		tAreaClienteExample = new TAreaClienteExample();
		
		tOrden = new TOrden();
		tOrdenExample = new TOrdenExample();
		
		tCotizacion = new TCotizacion();
		tCotizacionExample = new TCotizacionExample();
		
		factCotizacion = new FactCotizacion();
		factCotizacionExample = new FactCotizacionExample();
		
		lstOrden = new ArrayList<TOrden>();
		lstAreaCliente = new ArrayList<TAreaCliente>();
		
		mpUbigeoAreaCliente = new HashMap<Integer, Integer>();
		lstAreaCliente = tAreaClienteManager.selectByExample(null);
		for (Iterator<TAreaCliente> iterator = lstAreaCliente.iterator(); iterator.hasNext();) {
			tAreaCliente = iterator.next();
			mpUbigeoAreaCliente.put(tAreaCliente.getAreCliId(), tAreaCliente.getUbiId());
			
		}

		List<String> lstStateRecord = new ArrayList<String>();
		lstStateRecord.add(constantes.getStateRecordNew());
		lstStateRecord.add(constantes.getStateRecordUpdated());
		
		//int offset = 0;
		
		List<TOrden> lstOrden = new ArrayList<TOrden>();
		
		while(true) {
			tOrdenExample.clear();

			tOrdenExample.createCriteria().andFecNumCamGreaterThanOrEqualTo(dateTimeFrom).andFecNumCamLessThan(dateTimeUntil).andCodIndCamIn(lstStateRecord);
			//tOrdenExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			tOrdenExample.setPaginationByClause(" limit " + constantes.getSizePage());
			
			lstOrden = tOrdenManager.selectByExample(tOrdenExample);
			if(lstOrden.size()>0){
				for (Iterator<TOrden> iterator = lstOrden.iterator(); iterator.hasNext();) {
					tOrden = iterator.next();
					tCotizacion = tCotizacionManager.selectByPrimaryKey(tOrden.getCotiId());
					factCotizacion.clear();
					processRecordCotizacion();
				}
				lstOrden.clear();
				//offset = offset + constantes.getSizePage();
			}else{
				lstOrden.clear();
				this.lstOrden.clear();
				
				tAreaCliente.clear();
				tAreaClienteExample.clear();
				
				tOrden.clear();
				tOrdenExample.clear();
				
				tCotizacion.clear();
				tCotizacionExample.clear();
				
				factCotizacion.clear();
				factCotizacionExample.clear();
				
				break;
			}
			
		}
		
		List<TCotizacion> lstCotizacion = new ArrayList<TCotizacion>();
		
		while(true){
			tCotizacionExample.clear();
			
			tCotizacionExample.createCriteria().andFecNumCamGreaterThanOrEqualTo(dateTimeFrom).andFecNumCamLessThan(dateTimeUntil).andProcIdNotEqualTo(process).andCodIndCamIn(lstStateRecord);
			//tCotizacionExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			tCotizacionExample.setPaginationByClause(" limit " + constantes.getSizePage());
			lstCotizacion = tCotizacionManager.selectByExample(tCotizacionExample);
			if(lstCotizacion.size()>0){
				for (Iterator<TCotizacion> iterator = lstCotizacion.iterator(); iterator.hasNext();) {
					tCotizacion = iterator.next();
					factCotizacion.clear();
					processRecordCotizacion();
				}
				lstCotizacion.clear();
				//offset = offset + constantes.getSizePage();
			}else{
				lstStateRecord.clear();
				lstCotizacion.clear();
				lstOrden.clear();
				lstAreaCliente.clear();
				
				mpUbigeoAreaCliente.clear();
				
				tOrden.clear();
				tOrdenExample.clear();
				
				tCotizacion.clear();
				tCotizacionExample.clear();
	
				factCotizacion.clear();
				factCotizacionExample.clear();
				
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
	
	public void processRecordCotizacion()throws Exception{
		
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
	
	public void completeFieldCotizacion()throws Exception{
		factCotizacion.setCotizacionKey(tCotizacion.getCotiId());
		factCotizacion.setCotizacionKeyClienteArea(tCotizacion.getAreCliId());
		factCotizacion.setCotizacionKeyUbigeoCliente(mpUbigeoAreaCliente.get(tCotizacion.getAreCliId()));
		factCotizacion.setCotizacionKeyServicio(tCotizacion.getCotiCodServ());
		factCotizacion.setCotizacionKeyProducto(tCotizacion.getProdId());
		factCotizacion.setCotizacionKeyFecApro(Util.getDateAsInteger(tCotizacion.getCotiFecApro()));
		factCotizacion.setCotizacionKeyFecIni(Util.getDateAsInteger(tCotizacion.getCotiFecIni()));
		factCotizacion.setCotizacionKeyFecFin(Util.getDateAsInteger(tCotizacion.getCotiFecFin()));
		factCotizacion.setCotizacionKeyEstado(tCotizacion.getCotiCodEst());
		
		lstOrden.clear();
		tOrdenExample.clear();
		tOrdenExample.createCriteria().andCotiIdEqualTo(factCotizacion.getCotizacionKey());
		//tOrdenExample.createCriteria().andFecNumCamBetween(dateTimeFrom, dateTimeUntil);
		lstOrden = tOrdenManager.selectByExample(tOrdenExample);
		
		factCotizacion.setCotizacionCntOrdTotal(0);
		factCotizacion.setCotizacionCntOrdEnTrab(0);
		factCotizacion.setCotizacionCntOrdCer(0);
		factCotizacion.setCotizacionCntOrdCftiempo(0);
		factCotizacion.setCotizacionCntOrdCatiempo(0);
		factCotizacion.setCotizacionCntOrdCan(0);
		factCotizacion.setCotizacionCntOrdFac(0);
		
		factCotizacion.setCotizacionMonOrdTot(new BigDecimal(0));
		factCotizacion.setCotizacionMonOrdCan(new BigDecimal(0));
		factCotizacion.setCotizacionMonOrdFac(new BigDecimal(0));
		
		for (Iterator<TOrden> iterator = lstOrden.iterator(); iterator.hasNext();) {
			tOrden = iterator.next();
			
			factCotizacion.setCotizacionCntOrdTotal(factCotizacion.getCotizacionCntOrdTotal() + 1);
			
			if(constantes.getParamSerialEstadoOrdenGenerado() == tOrden.getOrdCodEst() || constantes.getParamSerialEstadoOrdenPendiente() == tOrden.getOrdCodEst()){
				factCotizacion.setCotizacionCntOrdEnTrab(factCotizacion.getCotizacionCntOrdEnTrab() + 1);
			}
			
			if(constantes.getParamSerialEstadoOrdenCerrado() == tOrden.getOrdCodEst()){
				factCotizacion.setCotizacionCntOrdCer(factCotizacion.getCotizacionCntOrdCer() + 1);
			}
			
			if(constantes.getParamSerialEstadoOrdenCerrado() == tOrden.getOrdCodEst() && Util.isGreaterThanAnotherDate(tOrden.getOrdFecCie(),tOrden.getOrdFecVen())){
				factCotizacion.setCotizacionCntOrdCftiempo(factCotizacion.getCotizacionCntOrdCftiempo() + 1);
			}else{
				factCotizacion.setCotizacionCntOrdCatiempo(factCotizacion.getCotizacionCntOrdCatiempo() + 1);
			}
			
			if(constantes.getParamSerialEstadoOrdenAnulado() == tOrden.getOrdCodEst()){
				factCotizacion.setCotizacionCntOrdCan(factCotizacion.getCotizacionCntOrdCan() + 1);
				factCotizacion.setCotizacionMonOrdCan(factCotizacion.getCotizacionMonOrdCan().add(tOrden.getOrdTotal()));
			}
			
			if(constantes.getParamSerialEstadoFacturadoSi() == tOrden.getOrdIndFac()){
				factCotizacion.setCotizacionCntOrdFac(factCotizacion.getCotizacionCntOrdFac() + 1);
				factCotizacion.setCotizacionMonOrdFac(factCotizacion.getCotizacionMonOrdFac().add(tOrden.getOrdTotal()));
			}
			
			factCotizacion.setCotizacionMonOrdTot(factCotizacion.getCotizacionMonOrdTot().add(tOrden.getOrdTotal()));
			
		}
		
		factCotizacion.setProcId(process);
	}
	
	public int insertRecordDimensionalCotizacion()throws Exception{
		try{
			resultTransaction = factCotizacionManager.insertSelective(factCotizacion);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int updateRecordDimensionalCotizacion()throws Exception{
		try{
			resultTransaction = factCotizacionManager.updateByPrimaryKeySelective(factCotizacion);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int deleteRecordDimensionalCotizacion()throws Exception{
		try{
			resultTransaction = factCotizacionManager.deleteByPrimaryKey(factCotizacion.getCotizacionKey());
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction; 
	}
	
	public void updateRecordGenericCotizacion(String statusRecord)throws Exception{
		int idCotizacion = tCotizacion.getCotiId();
		tCotizacion.clear();
		tCotizacion.setCotiId(idCotizacion);
		tCotizacion.setCodIndCam(statusRecord);
		//tCotizacion.setFecNumCam(Util.getCurrentDateTimeAsLong());
		tCotizacion.setProcId(process);
		tCotizacionManager.updateByPrimaryKeySelective(tCotizacion);
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

	
	public List<TOrden> getLstOrden() {
		return lstOrden;
	}

	
	public void setLstOrden(List<TOrden> lstOrden) {
		this.lstOrden = lstOrden;
	}

	
	public Constantes getConstantes() {
		return constantes;
	}

	
	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}
}
