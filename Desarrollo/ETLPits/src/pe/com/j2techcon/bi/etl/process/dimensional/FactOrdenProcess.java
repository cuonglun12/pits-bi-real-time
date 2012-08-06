package pe.com.j2techcon.bi.etl.process.dimensional;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.logic.dimensional.DimTiempoManager;
import pe.com.j2techcon.bi.etl.logic.dimensional.FactOrdenManager;
import pe.com.j2techcon.bi.etl.logic.generic.TAreaClienteManager;
import pe.com.j2techcon.bi.etl.logic.generic.TOrdenManager;
import pe.com.j2techcon.bi.etl.logic.generic.TCargoManager;
//import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.util.Util;
//import pe.com.j2techcon.bi.etl.domain.dimensional.DimTiempo;
//import pe.com.j2techcon.bi.etl.domain.dimensional.DimTiempoExample;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactOrden;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactOrdenExample;
import pe.com.j2techcon.bi.etl.domain.generic.TAreaCliente;
import pe.com.j2techcon.bi.etl.domain.generic.TAreaClienteExample;
import pe.com.j2techcon.bi.etl.domain.generic.TCargo;
import pe.com.j2techcon.bi.etl.domain.generic.TOrden;
import pe.com.j2techcon.bi.etl.domain.generic.TOrdenExample;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoExample;
//import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
//import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;

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
	
	//private TParametro tParametro;
	//private TParametroExample tParametroExample;
	
	private FactOrden factOrden;
	private FactOrdenExample factOrdenExample;
	
	//private DimTiempo dimTiempo;
	//private DimTiempoExample dimTiempoExample;
	
	private TAreaClienteManager tAreaClienteManager;
	private TCargoManager tCargoManager;
	private TOrdenManager tOrdenManager;
	//private TParametroManager tParametroManager;
	private DimTiempoManager dimTiempoManager;
	private FactOrdenManager factOrdenManager;
	
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

	public FactOrdenManager getFactOrdenManager() {
		return factOrdenManager;
	}

	public void setFactOrdenManager(FactOrdenManager factOrdenManager) {
		this.factOrdenManager = factOrdenManager;
	}

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public FactOrdenProcess(BeanFactory factory, int sizePage,
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
		stateRecordDimensional = constantes.getStateRecordNew();
		stateRecordGeneric = constantes.getStateRecordNew();
		
	}

	public int startProcess(){

		tAreaClienteManager = factory.getBean("tAreaClienteManager", TAreaClienteManager.class);
		tCargoManager = factory.getBean("tCargoManager", TCargoManager.class);
		tOrdenManager = factory.getBean("tOrdenManager", TOrdenManager.class);
		//tParametroManager = factory.getBean("tParametroManager", TParametroManager.class);
		dimTiempoManager = factory.getBean("dimTiempoManager", DimTiempoManager.class);
		factOrdenManager = factory.getBean("factOrdenManager", FactOrdenManager.class);
		
		constantes = factory.getBean("constantes", Constantes.class);

		int offset = 0;
		
		while(true) {
			tCargoExample.clear();

			tCargoExample.createCriteria().andFecNumCamGreaterThanOrEqualTo(dateTimeFrom);
			tCargoExample.createCriteria().andFecNumCamLessThan(dateTimeUntil);
			
			tCargoExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			List<TCargo> lstCargo = tCargoManager.selectByExample(tCargoExample);
			if(lstCargo.size()>0){
				for (Iterator<TCargo> iterator = lstCargo.iterator(); iterator.hasNext();) {
					tCargo = iterator.next();
					tOrden = tOrdenManager.selectByPrimaryKey(tCargo.getOrdId());
					factOrden.clear();
					processRecordOrden();
				}
				offset = offset + constantes.getSizePage();
			}else{
				lstCargo.clear();
				
				tCargo.clear();
				tCargoExample.clear();
				
				tOrden.clear();
				tOrdenExample.clear();
				
				//tParametro.clear();
				//tParametroExample.clear();
				
				factOrden.clear();
				factOrdenExample.clear();
				
				//dimTiempo.clear();
				//dimTiempoExample.clear();
				
				offset = 0;
				break;
			}
			
		}
		
		while(true){
			tOrdenExample.clear();

			tOrdenExample.createCriteria().andFecNumCamGreaterThanOrEqualTo(dateTimeFrom);
			tOrdenExample.createCriteria().andFecNumCamLessThan(dateTimeUntil);
			
			tOrdenExample.createCriteria().andProcIdNotEqualTo(process);
			tOrdenExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			List<TOrden> lstOrden = tOrdenManager.selectByExample(tOrdenExample);
			if(lstOrden.size()>0){
				for (Iterator<TOrden> iterator = lstOrden.iterator(); iterator.hasNext();) {
					tOrden = iterator.next();
					factOrden.clear();
					processRecordOrden();
				}
				offset = offset + constantes.getSizePage();
			}else{
				
				lstOrden.clear();
				
				tCargo.clear();
				tCargoExample.clear();
				
				tOrden.clear();
				tOrdenExample.clear();
				
				//tParametro.clear();
				//tParametroExample.clear();
				
				factOrden.clear();
				factOrdenExample.clear();
				
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
	
	public void processRecordOrden(){
		
		if(!tOrden.getProcId().equals(process)){
		
			completeFildOrden();
			
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
	
	public void completeFildOrden(){
		factOrden.setOrdenKey(tOrden.getOrdId());
		factOrden.setOrdenKeyClienteArea(tOrden.getCodAreCli());
		factOrden.setOrdenKeyUbigeoCliente(tAreaClienteManager.selectByPrimaryKey(tOrden.getCodAreCli()).getUbiId());
		factOrden.setOrdenKeyServicio(tOrden.getServId());
		factOrden.setOrdenKeyProducto(tOrden.getProdId());
		factOrden.setOrdenKeyTipoReparto(tOrden.getOrdCodTipRep());
		factOrden.setOrdenKeyTipoDocumento(tOrden.getOrdCodTipDoc());
		factOrden.setOrdenKeyTipoPago(tOrden.getOrdCodTipPag());
		factOrden.setOrdenKeyMoneda(tOrden.getOrdCodTipMon());
		
		//dimTiempoExample.clear();
		//dimTiempoExample.createCriteria().andTiempoFechaEqualTo(tOrden.getOrdFecIni());
		//dimTiempo = (dimTiempoManager.selectByExample(dimTiempoExample)).get(0);
		//factOrden.setOrdenKeyFecIni(dimTiempo.getTiempoKey());
		factOrden.setOrdenKeyFecIni(Util.getDateAsInteger(tOrden.getOrdFecIni()));
		
		//dimTiempoExample.clear();
		//dimTiempoExample.createCriteria().andTiempoFechaEqualTo(tOrden.getOrdFecVen());
		//dimTiempo = (dimTiempoManager.selectByExample(dimTiempoExample)).get(0);
		//factOrden.setOrdenKeyFecVen(dimTiempo.getTiempoKey());
		factOrden.setOrdenKeyFecVen(Util.getDateAsInteger(tOrden.getOrdFecVen()));
		
		//dimTiempoExample.clear();
		//dimTiempoExample.createCriteria().andTiempoFechaEqualTo(tOrden.getOrdFecDev());
		//dimTiempo = (dimTiempoManager.selectByExample(dimTiempoExample)).get(0);
		//factOrden.setOrdenKeyFecDev(dimTiempo.getTiempoKey());
		factOrden.setOrdenKeyFecDev(Util.getDateAsInteger(tOrden.getOrdFecDev()));
		
		//dimTiempoExample.clear();
		//dimTiempoExample.createCriteria().andTiempoFechaEqualTo(tOrden.getOrdFecFac());
		//dimTiempo = (dimTiempoManager.selectByExample(dimTiempoExample)).get(0);
		//factOrden.setOrdenKeyFecFac(dimTiempo.getTiempoKey());
		factOrden.setOrdenKeyFecFac(Util.getDateAsInteger(tOrden.getOrdFecFac()));
		
		factOrden.setOrdenKeyEstado(tOrden.getOrdCodEst());
		factOrden.setOrdenKeyFacturado(tOrden.getOrdIndFac());
		
		//tParametroExample.clear();
		//tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoOrden());
		//tParametroExample.createCriteria().andParamCodEqualTo(constantes.getParamCodeEstadoOrdenAnulado());
		//tParametro = tParametroManager.selectByExample(tParametroExample).get(0);
		
		//if(tOrden.getOrdCodEst() != tParametro.getParamId()){
		if(tOrden.getOrdCodEst() != constantes.getParamSerialEstadoOrdenAnulado()){
			if(Util.isEqualsWithDefaultDate(tOrden.getOrdFecCie())){
				if(Util.isGreaterThanCurrentDate(tOrden.getOrdFecVen())){
					factOrden.setOrdenCntDiasExc(Util.getDaysAfterDate(tOrden.getOrdFecVen()));
					factOrden.setOrdenAtenEnFec((short)constantes.getValueNumberCero());
					factOrden.setOrdenAtenFueraFec((short)constantes.getValueNumberUnit());
				}else{
					factOrden.setOrdenCntDiasExc(constantes.getValueNumberCero());
					factOrden.setOrdenAtenEnFec((short)constantes.getValueNumberUnit());
					factOrden.setOrdenAtenFueraFec((short)constantes.getValueNumberCero());
				}
			}else{
				if(Util.isGreaterThanAnotherDate(tOrden.getOrdFecCie(), tOrden.getOrdFecVen())){
					factOrden.setOrdenCntDiasExc(Util.getDaysBetweenDates(tOrden.getOrdFecCie(), tOrden.getOrdFecVen()));
					factOrden.setOrdenAtenEnFec((short)constantes.getValueNumberCero());
					factOrden.setOrdenAtenFueraFec((short)constantes.getValueNumberUnit());
				}else{
					factOrden.setOrdenCntDiasExc(constantes.getValueNumberCero());
					factOrden.setOrdenAtenEnFec((short)constantes.getValueNumberUnit());
					factOrden.setOrdenAtenFueraFec((short)constantes.getValueNumberCero());
				}
			}
		}else{
			factOrden.setOrdenCntDiasExc(constantes.getValueNumberCero());
			factOrden.setOrdenAtenEnFec((short)constantes.getValueNumberCero());
			factOrden.setOrdenAtenFueraFec((short)constantes.getValueNumberCero());
		}

		tCargoExample.clear();
		tCargoExample.createCriteria().andOrdIdEqualTo(factOrden.getOrdenKey());
		tCargoExample.createCriteria().andFecNumCamBetween(dateTimeFrom, dateTimeUntil);
		recordTotal = tCargoManager.countByExample(tCargoExample);
		
		if(recordTotal>0){
			
			tCargoExample.clear();
			tCargoExample.createCriteria().andOrdIdEqualTo(factOrden.getOrdenKey());
			factOrden.setOrdenCntCargos(tCargoManager.countByExample(tCargoExample));
			
			tCargoExample.clear();
			tCargoExample.createCriteria().andOrdIdEqualTo(factOrden.getOrdenKey());
			//tParametroExample.clear();
			//tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoCargo());
			//tParametroExample.createCriteria().andParamCodEqualTo(constantes.getParamCodeEstadoCargoOrdenEntregado());
			//tParametro = tParametroManager.selectByExample(tParametroExample).get(0);
			//tCargoExample.createCriteria().andCargCodEstEqualTo(tParametro.getParamId());
			tCargoExample.createCriteria().andCargCodEstEqualTo(constantes.getParamSerialEstadoCargoOrdenEntregado());
			factOrden.setOrdenCntCargosEnt(tCargoManager.countByExample(tCargoExample));
			
			tCargoExample.clear();
			tCargoExample.createCriteria().andOrdIdEqualTo(factOrden.getOrdenKey());
			//tParametroExample.clear();
			//tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoCargo());
			//tParametroExample.createCriteria().andParamCodEqualTo(constantes.getParamCodeEstadoCargoOrdenAnulado());
			//tParametro = tParametroManager.selectByExample(tParametroExample).get(0);
			//tCargoExample.createCriteria().andCargCodEstEqualTo(tParametro.getParamId());
			tCargoExample.createCriteria().andCargCodEstEqualTo(constantes.getParamSerialEstadoCargoOrdenAnulado());
			factOrden.setOrdenCntCargosAnu(tCargoManager.countByExample(tCargoExample));
			
			tCargoExample.clear();
			tCargoExample.createCriteria().andOrdIdEqualTo(factOrden.getOrdenKey());
			//tParametroExample.clear();
			//tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoCargo());
			//tParametroExample.createCriteria().andParamCodEqualTo(constantes.getParamCodeEstadoCargoOrdenFueraZona());
			//tParametro = tParametroManager.selectByExample(tParametroExample).get(0);
			//tCargoExample.createCriteria().andCargCodEstEqualTo(tParametro.getParamId());
			tCargoExample.createCriteria().andCargCodEstEqualTo(constantes.getParamSerialEstadoCargoOrdenFueraZona());
			factOrden.setOrdenCntCargosFueZon(tCargoManager.countByExample(tCargoExample));
			
			tCargoExample.clear();
			tCargoExample.createCriteria().andOrdIdEqualTo(factOrden.getOrdenKey());
			//tParametroExample.clear();
			//tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoCargo());
			//tParametroExample.createCriteria().andParamCodEqualTo(constantes.getParamCodeEstadoCargoOrdenMotivado());
			//tParametro = tParametroManager.selectByExample(tParametroExample).get(0);
			//tCargoExample.createCriteria().andCargCodEstEqualTo(tParametro.getParamId());
			tCargoExample.createCriteria().andCargCodEstEqualTo(constantes.getParamSerialEstadoCargoOrdenMotivado());
			factOrden.setOrdenCntCargosMot(tCargoManager.countByExample(tCargoExample));
			
			tCargoExample.clear();
			tCargoExample.createCriteria().andOrdIdEqualTo(factOrden.getOrdenKey());
			//tParametroExample.clear();
			//tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoCargo());
			//tParametroExample.createCriteria().andParamCodEqualTo(constantes.getParamCodeEstadoCargoOrdenPerdido());
			//tParametro = tParametroManager.selectByExample(tParametroExample).get(0);
			//tCargoExample.createCriteria().andCargCodEstEqualTo(tParametro.getParamId());
			tCargoExample.createCriteria().andCargCodEstEqualTo(constantes.getParamSerialEstadoCargoOrdenPerdido());
			factOrden.setOrdenCntCargosPerd(tCargoManager.countByExample(tCargoExample));
			
			tCargoExample.clear();
			tCargoExample.createCriteria().andOrdIdEqualTo(factOrden.getOrdenKey());
			//tParametroExample.clear();
			//tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoCargo());
			//tParametroExample.createCriteria().andParamCodEqualTo(constantes.getParamCodeEstadoCargoOrdenReenviado());
			//tParametro = tParametroManager.selectByExample(tParametroExample).get(0);
			//tCargoExample.createCriteria().andCargCodEstEqualTo(tParametro.getParamId());
			tCargoExample.createCriteria().andCargCodEstEqualTo(constantes.getParamSerialEstadoCargoOrdenReenviado());
			factOrden.setOrdenCntCargosRee(tCargoManager.countByExample(tCargoExample));
			
			tCargoExample.clear();
			tCargoExample.createCriteria().andOrdIdEqualTo(factOrden.getOrdenKey());
			//tParametroExample.clear();
			//tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoCargo());
			//tParametroExample.createCriteria().andParamCodEqualTo(constantes.getParamCodeEstadoCargoOrdenDigitado());
			//tParametro = tParametroManager.selectByExample(tParametroExample).get(0);
			//tCargoExample.createCriteria().andCargCodEstEqualTo(tParametro.getParamId());
			tCargoExample.createCriteria().andCargCodEstEqualTo(constantes.getParamSerialEstadoCargoOrdenDigitado());
			factOrden.setOrdenCntCargosDig(tCargoManager.countByExample(tCargoExample));
			
			tCargoExample.clear();
			tCargoExample.createCriteria().andOrdIdEqualTo(factOrden.getOrdenKey());
			//tParametroExample.clear();
			//tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoCargo());
			//tParametroExample.createCriteria().andParamCodEqualTo(constantes.getParamCodeEstadoCargoOrdenRuta());
			//tParametro = tParametroManager.selectByExample(tParametroExample).get(0);
			//tCargoExample.createCriteria().andCargCodEstEqualTo(tParametro.getParamId());
			tCargoExample.createCriteria().andCargCodEstEqualTo(constantes.getParamSerialEstadoCargoOrdenRuta());
			factOrden.setOrdenCntCargosRut(tCargoManager.countByExample(tCargoExample));
			
			tCargoExample.clear();
			tCargoExample.createCriteria().andOrdIdEqualTo(factOrden.getOrdenKey());
			//tParametroExample.clear();
			//tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoCargo());
			//tParametroExample.createCriteria().andParamCodEqualTo(constantes.getParamCodeEstadoCargoOrdenProvincia());
			//tParametro = tParametroManager.selectByExample(tParametroExample).get(0);
			//tCargoExample.createCriteria().andCargCodEstEqualTo(tParametro.getParamId());
			tCargoExample.createCriteria().andCargCodEstEqualTo(constantes.getParamSerialEstadoCargoOrdenProvincia());
			factOrden.setOrdenCntCargosPro(tCargoManager.countByExample(tCargoExample));
			
			tCargoExample.clear();
			tCargoExample.createCriteria().andOrdIdEqualTo(factOrden.getOrdenKey());
			//tParametroExample.clear();
			//tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoCargo());
			//tParametroExample.createCriteria().andParamCodEqualTo(constantes.getParamCodeEstadoCargoOrdenRobo());
			//tParametro = tParametroManager.selectByExample(tParametroExample).get(0);
			//tCargoExample.createCriteria().andCargCodEstEqualTo(tParametro.getParamId());
			tCargoExample.createCriteria().andCargCodEstEqualTo(constantes.getParamSerialEstadoCargoOrdenRobo());
			factOrden.setOrdenCntCargosRob(tCargoManager.countByExample(tCargoExample));
			
		}
		
		factOrden.setOrdenMonImporte(tOrden.getOrdImporte().multiply(tOrden.getOrdTipCambio()));
		factOrden.setOrdenMonIgv(tOrden.getOrdIgv().multiply(tOrden.getOrdTipCambio()));
		factOrden.setOrdenMonDescuento(tOrden.getOrdDescuento().multiply(tOrden.getOrdTipCambio()));
		factOrden.setOrdenMonTotal(tOrden.getOrdTotal().multiply(tOrden.getOrdTipCambio()));
		
		factOrden.setProcId(process);
	}
	
	public int insertRecordDimensionalOrden(){
		try{
			resultTransaction = factOrdenManager.insertSelective(factOrden);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int updateRecordDimensionalOrden(){
		try{
			resultTransaction = factOrdenManager.updateByPrimaryKeySelective(factOrden);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int deleteRecordDimensionalOrden(){
		try{
			resultTransaction = factOrdenManager.deleteByPrimaryKey(factOrden.getOrdenKey());
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction; 
	}
	
	public void updateRecordGenericOrden(String statusRecord){
		try{
			int idOrden = tOrden.getOrdId();
			tOrden.clear();
			tOrden.setOrdId(idOrden);
			tOrden.setCodIndCam(statusRecord);
			tOrden.setProcId(process);
			tOrdenManager.updateByPrimaryKeySelective(tOrden);
		}catch(Exception e){
			
		}
	}
}
