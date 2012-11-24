package pe.com.j2techcon.bi.etl.process.dimensional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.logic.dimensional.DimTiempoManager;
import pe.com.j2techcon.bi.etl.logic.dimensional.FactOrdenManager;
import pe.com.j2techcon.bi.etl.logic.generic.TAreaClienteManager;
import pe.com.j2techcon.bi.etl.logic.generic.TOrdenManager;
import pe.com.j2techcon.bi.etl.logic.generic.TCargoManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.util.Util;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactOrden;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactOrdenExample;
import pe.com.j2techcon.bi.etl.domain.generic.TAreaCliente;
import pe.com.j2techcon.bi.etl.domain.generic.TAreaClienteExample;
import pe.com.j2techcon.bi.etl.domain.generic.TCargo;
import pe.com.j2techcon.bi.etl.domain.generic.TOrden;
import pe.com.j2techcon.bi.etl.domain.generic.TOrdenExample;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoExample;

public class FactOrdenProcess {
	
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
	
	private TCargo tCargo;
	private TCargoExample tCargoExample;
	
	private TOrden tOrden;
	private TOrdenExample tOrdenExample;
	
	private FactOrden factOrden;
	private FactOrdenExample factOrdenExample;
	
	private TAreaClienteManager tAreaClienteManager;
	private TCargoManager tCargoManager;
	private TOrdenManager tOrdenManager;
	private DimTiempoManager dimTiempoManager;
	private FactOrdenManager factOrdenManager;
	
	private List<TCargo> lstCargo;
	private List<TAreaCliente> lstAreaCliente;
	
	private Map<Integer, Integer> mpUbigeoAreaCliente;
	
	private Constantes constantes;

	static Logger log = Logger.getLogger(FactOrdenProcess.class);

	public FactOrdenProcess(BeanFactory factory, int sizePage,
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
		tCargoManager = factory.getBean("tCargoManager", TCargoManager.class);
		tOrdenManager = factory.getBean("tOrdenManager", TOrdenManager.class);
		dimTiempoManager = factory.getBean("dimTiempoManager", DimTiempoManager.class);
		factOrdenManager = factory.getBean("factOrdenManager", FactOrdenManager.class);
		
		tAreaCliente = new TAreaCliente();
		tAreaClienteExample = new TAreaClienteExample();
		
		tCargo = new TCargo();
		tCargoExample = new TCargoExample();
		
		tOrden = new TOrden();
		tOrdenExample = new TOrdenExample();
		
		factOrden = new FactOrden();
		factOrdenExample = new FactOrdenExample();
		
		lstCargo = new ArrayList<TCargo>();
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
		
		List<TCargo> lstCargo = new ArrayList<TCargo>();
		
		while(true) {
			tCargoExample.clear();

			tCargoExample.createCriteria().andFecNumCamGreaterThanOrEqualTo(dateTimeFrom).andFecNumCamLessThan(dateTimeUntil).andCodIndCamIn(lstStateRecord);
			//tCargoExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			tCargoExample.setPaginationByClause(" limit " + constantes.getSizePage());
			
			lstCargo = tCargoManager.selectByExample(tCargoExample);
			if(lstCargo.size()>0){
				for (Iterator<TCargo> iterator = lstCargo.iterator(); iterator.hasNext();) {
					tCargo = iterator.next();
					tOrden = tOrdenManager.selectByPrimaryKey(tCargo.getOrdId());
					factOrden.clear();
					processRecordOrden();
				}
				lstCargo.clear();
				//offset = offset + constantes.getSizePage();
			}else{
				lstCargo.clear();
				this.lstCargo.clear();
				
				tCargo.clear();
				tCargoExample.clear();
				
				tOrden.clear();
				tOrdenExample.clear();
				
				factOrden.clear();
				factOrdenExample.clear();
				
				break;
			}
			
		}
		
		List<TOrden> lstOrden = new ArrayList<TOrden>();
		
		while(true){
			tOrdenExample.clear();

			tOrdenExample.createCriteria().andFecNumCamGreaterThanOrEqualTo(dateTimeFrom).andFecNumCamLessThan(dateTimeUntil).andCodIndCamIn(lstStateRecord).andProcIdNotEqualTo(process);
			//tOrdenExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			tOrdenExample.setPaginationByClause(" limit " + constantes.getSizePage());
			
			lstOrden = tOrdenManager.selectByExample(tOrdenExample);
			if(lstOrden.size()>0){
				for (Iterator<TOrden> iterator = lstOrden.iterator(); iterator.hasNext();) {
					tOrden = iterator.next();
					factOrden.clear();
					processRecordOrden();
				}
				lstOrden.clear();
				//offset = offset + constantes.getSizePage();
			}else{
				lstStateRecord.clear();
				lstOrden.clear();
				lstCargo.clear();
				lstAreaCliente.clear();
				
				mpUbigeoAreaCliente.clear();
				
				tCargo.clear();
				tCargoExample.clear();
				
				tOrden.clear();
				tOrdenExample.clear();
				
				factOrden.clear();
				factOrdenExample.clear();
				
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
	
	public void processRecordOrden()throws Exception{
		
		if(!tOrden.getProcId().equals(process)){
		
			completeFieldOrden();
			
			if(typeProcess.equals(constantes.getTypeProcessSimple())){
				if(tOrden.getCodIndCam().equals(constantes.getStateRecordNew())){
					if(insertRecordDimensionalOrden()> constantes.getResultTransactionNoResult()){
						stateRecordGeneric = constantes.getStateRecordProcessed();
						recordProcessed = recordProcessed + 1; 
					} else{
						stateRecordGeneric = constantes.getStateRecordInconsistent();
						recordRejected = recordRejected + 1;
					}
				}else{
					if(updateRecordDimensionalOrden() > constantes.getResultTransactionNoResult()){
						stateRecordGeneric = constantes.getStateRecordProcessed();
						recordProcessed = recordProcessed + 1; 
					} else{
						stateRecordGeneric = constantes.getStateRecordInconsistent();
						recordRejected = recordRejected + 1;
					}
				}
			}else{
				if(updateRecordDimensionalOrden() > constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				}else{
					if(insertRecordDimensionalOrden() > constantes.getResultTransactionNoResult()){
						stateRecordGeneric = constantes.getStateRecordProcessed();
						recordProcessed = recordProcessed + 1;
					}else{
						stateRecordGeneric = constantes.getStateRecordInconsistent();
						recordRejected = recordRejected + 1;
					}
				}
			}
			
			updateRecordGenericOrden(stateRecordGeneric);
			
		}else{
			recordProcessed = recordProcessed + 1;
		}
	}
	
	public void completeFieldOrden()throws Exception{
		factOrden.setOrdenKey(tOrden.getOrdId());
		factOrden.setOrdenKeyClienteArea(tOrden.getCodAreCli());
		factOrden.setOrdenKeyUbigeoCliente(mpUbigeoAreaCliente.get(tOrden.getCodAreCli()));
		factOrden.setOrdenKeyServicio(tOrden.getServId());
		factOrden.setOrdenKeyProducto(tOrden.getProdId());
		factOrden.setOrdenKeyTipoReparto(tOrden.getOrdCodTipRep());
		factOrden.setOrdenKeyTipoDocumento(tOrden.getOrdCodTipDoc());
		factOrden.setOrdenKeyTipoPago(tOrden.getOrdCodTipPag());
		factOrden.setOrdenKeyMoneda(tOrden.getOrdCodTipMon());
		factOrden.setOrdenKeyFecIni(Util.getDateAsInteger(tOrden.getOrdFecIni()));
		factOrden.setOrdenKeyFecVen(Util.getDateAsInteger(tOrden.getOrdFecVen()));
		factOrden.setOrdenKeyFecDev(Util.getDateAsInteger(tOrden.getOrdFecDev()));
		factOrden.setOrdenKeyFecFac(Util.getDateAsInteger(tOrden.getOrdFecFac()));
		
		factOrden.setOrdenKeyEstado(tOrden.getOrdCodEst());
		factOrden.setOrdenKeyFacturado(tOrden.getOrdIndFac());
		
		if(tOrden.getOrdCodEst() != constantes.getParamSerialEstadoOrdenAnulado()){
			if(Util.isEqualsWithDefaultDate(tOrden.getOrdFecCie())){
				if(Util.isGreaterThanCurrentDate(tOrden.getOrdFecVen())){
					factOrden.setOrdenCntDiasExc(Util.getDaysAfterDate(tOrden.getOrdFecVen()));
					factOrden.setOrdenAtenEnFec((short) 0);
					factOrden.setOrdenAtenFueraFec((short) 1);
				}else{
					factOrden.setOrdenCntDiasExc(0);
					factOrden.setOrdenAtenEnFec((short) 1);
					factOrden.setOrdenAtenFueraFec((short) 0);
				}
			}else{
				if(Util.isGreaterThanAnotherDate(tOrden.getOrdFecCie(), tOrden.getOrdFecVen())){
					factOrden.setOrdenCntDiasExc(Util.getDaysBetweenDates(tOrden.getOrdFecCie(), tOrden.getOrdFecVen()));
					factOrden.setOrdenAtenEnFec((short) 0);
					factOrden.setOrdenAtenFueraFec((short) 1);
				}else{
					factOrden.setOrdenCntDiasExc(0);
					factOrden.setOrdenAtenEnFec((short) 1);
					factOrden.setOrdenAtenFueraFec((short) 0);
				}
			}
		}else{
			factOrden.setOrdenCntDiasExc(0);
			factOrden.setOrdenAtenEnFec((short) 0);
			factOrden.setOrdenAtenFueraFec((short) 0);
		}

		lstCargo.clear();
		tCargoExample.clear();
		tCargoExample.createCriteria().andOrdIdEqualTo(factOrden.getOrdenKey());
		//tCargoExample.createCriteria().andFecNumCamBetween(dateTimeFrom, dateTimeUntil);
		lstCargo = tCargoManager.selectByExample(tCargoExample);
		
		factOrden.setOrdenCntCargos(0);
		factOrden.setOrdenCntCargosEnt(0);
		factOrden.setOrdenCntCargosAnu(0);
		factOrden.setOrdenCntCargosFueZon(0);
		factOrden.setOrdenCntCargosMot(0);
		factOrden.setOrdenCntCargosPerd(0);
		factOrden.setOrdenCntCargosRee(0);
		factOrden.setOrdenCntCargosDig(0);
		factOrden.setOrdenCntCargosRut(0);
		factOrden.setOrdenCntCargosPro(0);
		factOrden.setOrdenCntCargosRob(0);
		
		for (Iterator<TCargo> iterator = lstCargo.iterator(); iterator.hasNext();) {
			tCargo = iterator.next();
			
			factOrden.setOrdenCntCargos(factOrden.getOrdenCntCargos() + 1);
			
			if(constantes.getParamSerialEstadoCargoOrdenEntregado() == tCargo.getCargCodEst()){
				factOrden.setOrdenCntCargosEnt(factOrden.getOrdenCntCargosEnt() + 1);
			}else if(constantes.getParamSerialEstadoCargoOrdenAnulado() == tCargo.getCargCodEst()){
				factOrden.setOrdenCntCargosAnu(factOrden.getOrdenCntCargosAnu() + 1);
			}else if(constantes.getParamSerialEstadoCargoOrdenFueraZona() == tCargo.getCargCodEst()){
				factOrden.setOrdenCntCargosFueZon(factOrden.getOrdenCntCargosFueZon() + 1);
			}else if(constantes.getParamSerialEstadoCargoOrdenMotivado() == tCargo.getCargCodEst()){
				factOrden.setOrdenCntCargosMot(factOrden.getOrdenCntCargosMot() + 1);
			}else if(constantes.getParamSerialEstadoCargoOrdenPerdido() == tCargo.getCargCodEst()){
				factOrden.setOrdenCntCargosPerd(factOrden.getOrdenCntCargosPerd() + 1);
			}else if(constantes.getParamSerialEstadoCargoOrdenReenviado() == tCargo.getCargCodEst()){
				factOrden.setOrdenCntCargosRee(factOrden.getOrdenCntCargosRee() + 1);
			}else if(constantes.getParamSerialEstadoCargoOrdenDigitado() == tCargo.getCargCodEst()){
				factOrden.setOrdenCntCargosDig(factOrden.getOrdenCntCargosDig() + 1);
			}else if(constantes.getParamSerialEstadoCargoOrdenRuta() == tCargo.getCargCodEst()){
				factOrden.setOrdenCntCargosRut(factOrden.getOrdenCntCargosRut() + 1);
			}else if(constantes.getParamSerialEstadoCargoOrdenProvincia() == tCargo.getCargCodEst()){
				factOrden.setOrdenCntCargosPro(factOrden.getOrdenCntCargosPro() + 1);
			}else if(constantes.getParamSerialEstadoCargoOrdenRobo() == tCargo.getCargCodEst()){
				factOrden.setOrdenCntCargosRob(factOrden.getOrdenCntCargosRob() + 1);
			}else{
				//
			}
			
		}
		
		factOrden.setOrdenMonImporte(tOrden.getOrdImporte().multiply(tOrden.getOrdTipCambio()));
		factOrden.setOrdenMonIgv(tOrden.getOrdIgv().multiply(tOrden.getOrdTipCambio()));
		factOrden.setOrdenMonDescuento(tOrden.getOrdDescuento().multiply(tOrden.getOrdTipCambio()));
		factOrden.setOrdenMonTotal(tOrden.getOrdTotal().multiply(tOrden.getOrdTipCambio()));
		
		factOrden.setProcId(process);
	}
	
	public int insertRecordDimensionalOrden()throws Exception{
		try{
			resultTransaction = factOrdenManager.insertSelective(factOrden);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int updateRecordDimensionalOrden()throws Exception{
		try{
			resultTransaction = factOrdenManager.updateByPrimaryKeySelective(factOrden);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int deleteRecordDimensionalOrden()throws Exception{
		try{
			resultTransaction = factOrdenManager.deleteByPrimaryKey(factOrden.getOrdenKey());
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction; 
	}
	
	public void updateRecordGenericOrden(String statusRecord)throws Exception{
		int idOrden = tOrden.getOrdId();
		tOrden.clear();
		tOrden.setOrdId(idOrden);
		tOrden.setCodIndCam(statusRecord);
		//tOrden.setFecNumCam(Util.getCurrentDateTimeAsLong());
		tOrden.setProcId(process);
		tOrdenManager.updateByPrimaryKeySelective(tOrden);
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

	
	public TCargo gettCargo() {
		return tCargo;
	}

	
	public void settCargo(TCargo tCargo) {
		this.tCargo = tCargo;
	}

	
	public TCargoExample gettCargoExample() {
		return tCargoExample;
	}

	
	public void settCargoExample(TCargoExample tCargoExample) {
		this.tCargoExample = tCargoExample;
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

	
	public FactOrden getFactOrden() {
		return factOrden;
	}

	
	public void setFactOrden(FactOrden factOrden) {
		this.factOrden = factOrden;
	}

	
	public FactOrdenExample getFactOrdenExample() {
		return factOrdenExample;
	}

	
	public void setFactOrdenExample(FactOrdenExample factOrdenExample) {
		this.factOrdenExample = factOrdenExample;
	}

	
	public TAreaClienteManager gettAreaClienteManager() {
		return tAreaClienteManager;
	}

	
	public void settAreaClienteManager(TAreaClienteManager tAreaClienteManager) {
		this.tAreaClienteManager = tAreaClienteManager;
	}

	
	public TCargoManager gettCargoManager() {
		return tCargoManager;
	}

	
	public void settCargoManager(TCargoManager tCargoManager) {
		this.tCargoManager = tCargoManager;
	}

	
	public TOrdenManager gettOrdenManager() {
		return tOrdenManager;
	}

	
	public void settOrdenManager(TOrdenManager tOrdenManager) {
		this.tOrdenManager = tOrdenManager;
	}

	
	public DimTiempoManager getDimTiempoManager() {
		return dimTiempoManager;
	}

	
	public void setDimTiempoManager(DimTiempoManager dimTiempoManager) {
		this.dimTiempoManager = dimTiempoManager;
	}

	
	public FactOrdenManager getFactOrdenManager() {
		return factOrdenManager;
	}

	
	public void setFactOrdenManager(FactOrdenManager factOrdenManager) {
		this.factOrdenManager = factOrdenManager;
	}

	
	public List<TCargo> getLstCargo() {
		return lstCargo;
	}

	
	public void setLstCargo(List<TCargo> lstCargo) {
		this.lstCargo = lstCargo;
	}

	
	public List<TAreaCliente> getLstAreaCliente() {
		return lstAreaCliente;
	}

	
	public void setLstAreaCliente(List<TAreaCliente> lstAreaCliente) {
		this.lstAreaCliente = lstAreaCliente;
	}

	
	public Map<Integer, Integer> getMpUbigeoAreaCliente() {
		return mpUbigeoAreaCliente;
	}

	
	public void setMpUbigeoAreaCliente(Map<Integer, Integer> mpUbigeoAreaCliente) {
		this.mpUbigeoAreaCliente = mpUbigeoAreaCliente;
	}

	
	public Constantes getConstantes() {
		return constantes;
	}

	
	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}
}
