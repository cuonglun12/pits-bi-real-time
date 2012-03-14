package pe.com.j2techcon.bi.etl.process.dimensional;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.logic.dimensional.DimTiempoManager;
import pe.com.j2techcon.bi.etl.logic.dimensional.FactDespachoManager;
import pe.com.j2techcon.bi.etl.logic.generic.TDespachoManager;
import pe.com.j2techcon.bi.etl.logic.generic.TCargoDespachoManager;
import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.util.Util;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTiempo;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTiempoExample;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactDespacho;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactDespachoExample;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoDespacho;
import pe.com.j2techcon.bi.etl.domain.generic.TDespacho;
import pe.com.j2techcon.bi.etl.domain.generic.TDespachoExample;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoDespachoExample;
import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;



public class FactDespachoProcess {
	
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
	
	private TCargoDespacho tCargoDespacho;
	private TCargoDespachoExample tCargoDespachoExample;
	
	private TDespacho tDespacho;
	private TDespachoExample tDespachoExample;
	
	private TParametro tParametro;
	private TParametroExample tParametroExample;
	
	private FactDespacho factDespacho;
	private FactDespachoExample factDespachoExample;
	
	private DimTiempo dimTiempo;
	private DimTiempoExample dimTiempoExample;
	
	private TCargoDespachoManager tCargoDespachoManager;
	private TDespachoManager tDespachoManager;
	private TParametroManager tParametroManager;
	private DimTiempoManager dimTiempoManager;
	private FactDespachoManager factDespachoManager;
	
	private Constantes constantes;

	public BeanFactory getFactory() {
		return factory;
	}

	public TCargoDespacho gettCargoDespacho() {
		return tCargoDespacho;
	}

	public void settCargoDespacho(TCargoDespacho tCargoDespacho) {
		this.tCargoDespacho = tCargoDespacho;
	}

	public TCargoDespachoExample gettCargoDespachoExample() {
		return tCargoDespachoExample;
	}

	public void settCargoDespachoExample(TCargoDespachoExample tCargoDespachoExample) {
		this.tCargoDespachoExample = tCargoDespachoExample;
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

	public FactDespacho getFactDespacho() {
		return factDespacho;
	}

	public void setFactDespacho(FactDespacho factDespacho) {
		this.factDespacho = factDespacho;
	}

	public FactDespachoExample getFactDespachoExample() {
		return factDespachoExample;
	}

	public void setFactDespachoExample(FactDespachoExample factDespachoExample) {
		this.factDespachoExample = factDespachoExample;
	}

	public DimTiempo getDimTiempo() {
		return dimTiempo;
	}

	public void setDimTiempo(DimTiempo dimTiempo) {
		this.dimTiempo = dimTiempo;
	}

	public DimTiempoExample getDimTiempoExample() {
		return dimTiempoExample;
	}

	public void setDimTiempoExample(DimTiempoExample dimTiempoExample) {
		this.dimTiempoExample = dimTiempoExample;
	}

	public TCargoDespachoManager gettCargoDespachoManager() {
		return tCargoDespachoManager;
	}

	public void settCargoDespachoManager(TCargoDespachoManager tCargoDespachoManager) {
		this.tCargoDespachoManager = tCargoDespachoManager;
	}

	public TDespachoManager gettDespachoManager() {
		return tDespachoManager;
	}

	public void settDespachoManager(TDespachoManager tDespachoManager) {
		this.tDespachoManager = tDespachoManager;
	}

	public TParametroManager gettParametroManager() {
		return tParametroManager;
	}

	public void settParametroManager(TParametroManager tParametroManager) {
		this.tParametroManager = tParametroManager;
	}

	public DimTiempoManager getDimTiempoManager() {
		return dimTiempoManager;
	}

	public void setDimTiempoManager(DimTiempoManager dimTiempoManager) {
		this.dimTiempoManager = dimTiempoManager;
	}

	public FactDespachoManager getFactDespachoManager() {
		return factDespachoManager;
	}

	public void setFactDespachoManager(FactDespachoManager factDespachoManager) {
		this.factDespachoManager = factDespachoManager;
	}

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public FactDespachoProcess(BeanFactory factory, int sizePage,
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

		tCargoDespachoManager = factory.getBean("tCargoDespachoManager", TCargoDespachoManager.class);
		tDespachoManager = factory.getBean("tDespachoManager", TDespachoManager.class);
		tParametroManager = factory.getBean("tParametroManager", TParametroManager.class);
		dimTiempoManager = factory.getBean("dimTiempoManager", DimTiempoManager.class);
		factDespachoManager = factory.getBean("factDespachoManager", FactDespachoManager.class);
		
		constantes = factory.getBean("constantes", Constantes.class);

		int offset = 0;
		
		while(true) {
			tCargoDespachoExample.clear();
			tCargoDespachoExample.createCriteria().andFecNumCamBetween(dateTimeFrom, dateTimeUntil);
			tCargoDespachoExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			List<TCargoDespacho> lstCargoDespacho = tCargoDespachoManager.selectByExample(tCargoDespachoExample);
			if(lstCargoDespacho.size()>0){
				for (Iterator<TCargoDespacho> iterator = lstCargoDespacho.iterator(); iterator.hasNext();) {
					tCargoDespacho = iterator.next();
					tDespacho = tDespachoManager.selectByPrimaryKey(tCargoDespacho.getCarDespId());
					factDespacho.clear();
					processRecordDespacho();
				}
				offset = offset + constantes.getSizePage();
			}else{
				lstCargoDespacho.clear();
				
				tCargoDespacho.clear();
				tCargoDespachoExample.clear();
				
				tDespacho.clear();
				tDespachoExample.clear();
				
				tParametro.clear();
				tParametroExample.clear();
				
				factDespacho.clear();
				factDespachoExample.clear();
				
				dimTiempo.clear();
				dimTiempoExample.clear();
				
				offset = 0;
				break;
			}
			
		}
		
		while(true){
			tDespachoExample.clear();
			tDespachoExample.createCriteria().andFecNumCamBetween(dateTimeFrom, dateTimeUntil);
			tDespachoExample.createCriteria().andProcIdNotEqualTo(process);
			tDespachoExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			List<TDespacho> lstDespacho = tDespachoManager.selectByExample(tDespachoExample);
			if(lstDespacho.size()>0){
				for (Iterator<TDespacho> iterator = lstDespacho.iterator(); iterator.hasNext();) {
					tDespacho = iterator.next();
					factDespacho.clear();
					processRecordDespacho();
				}
				offset = offset + constantes.getSizePage();
			}else{
				
				lstDespacho.clear();
				
				tCargoDespacho.clear();
				tCargoDespachoExample.clear();
				
				tDespacho.clear();
				tDespachoExample.clear();
				
				tParametro.clear();
				tParametroExample.clear();
				
				factDespacho.clear();
				factDespachoExample.clear();
				
				dimTiempo.clear();
				dimTiempoExample.clear();
				
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
	
	public void processRecordDespacho(){
		
		if(!tDespacho.getProcId().equals(process)){
		
			completeFildDespacho();
			
			if(typeProcess.equals(constantes.getTypeProcessSimple())){
				if(tDespacho.getCodIndCam().equals(constantes.getStateRecordNew())){
					if(insertRecordDimensionalDespacho()> constantes.getResultTransactionNoResult()){
						stateRecordGeneric = constantes.getStateRecordProcessed();
						recordProcessed = recordProcessed + 1; 
					} else{
						stateRecordGeneric = constantes.getStateRecordInconsistent();
						recordRejected = recordRejected + 1;
					}
				}else{
					if(updateRecordDimensionalDespacho() > constantes.getResultTransactionNoResult()){
						stateRecordGeneric = constantes.getStateRecordProcessed();
						recordProcessed = recordProcessed + 1; 
					} else{
						stateRecordGeneric = constantes.getStateRecordInconsistent();
						recordRejected = recordRejected + 1;
					}
				}
			}else{
				if(updateRecordDimensionalDespacho() > constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				}else{
					if(insertRecordDimensionalDespacho() > constantes.getResultTransactionNoResult()){
						stateRecordGeneric = constantes.getStateRecordProcessed();
						recordProcessed = recordProcessed + 1;
					}else{
						stateRecordGeneric = constantes.getStateRecordInconsistent();
						recordRejected = recordRejected + 1;
					}
				}
			}
			
			updateRecordGenericDespacho(stateRecordGeneric);
			
		}else{
			recordProcessed = recordProcessed + 1;
		}
	}
	
	public void completeFildDespacho(){
		factDespacho.setDespachoKey(tDespacho.getDespId());
		factDespacho.setDespachoKeySede(tDespacho.getSedId());
		factDespacho.setDespachoKeyZona(tDespacho.getZonId());
		factDespacho.setDespachoKeyPersonal(tDespacho.getEmpCatId());
		factDespacho.setDespachoKeyTipoRuta(tDespacho.getDespCodTipRut());
		
		dimTiempoExample.clear();
		dimTiempoExample.createCriteria().andTiempoFechaEqualTo(tDespacho.getDespFecSal());
		dimTiempo = (dimTiempoManager.selectByExample(dimTiempoExample)).get(0);
		factDespacho.setDespachoKeyFecSal(dimTiempo.getTiempoKey());
		
		dimTiempoExample.clear();
		dimTiempoExample.createCriteria().andTiempoFechaEqualTo(tDespacho.getDespFecRetPro());
		dimTiempo = (dimTiempoManager.selectByExample(dimTiempoExample)).get(0);
		factDespacho.setDespachoKeyFecRetp(dimTiempo.getTiempoKey());
		
		dimTiempoExample.clear();
		dimTiempoExample.createCriteria().andTiempoFechaEqualTo(tDespacho.getDespFecRetRea());
		dimTiempo = (dimTiempoManager.selectByExample(dimTiempoExample)).get(0);
		factDespacho.setDespachoKeyFecRetr(dimTiempo.getTiempoKey());
		
		factDespacho.setDespachoKeyEstado(tDespacho.getDespCodEst());
		factDespacho.setDespachoMonPasaje(tDespacho.getDespMonPasaje());
		
		tParametroExample.clear();
		tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoDespacho());
		tParametroExample.createCriteria().andParamCodEqualTo(constantes.getParamCodeEstadoDespachoAnulado());
		tParametro = tParametroManager.selectByExample(tParametroExample).get(0);
		
		if(tDespacho.getDespCodEst() != tParametro.getParamId()){
			if(Util.isEqualsWithDefaultDate(tDespacho.getDespFecRetRea())){
				if(Util.isGreaterThanCurrentDate(tDespacho.getDespFecRetPro())){
					factDespacho.setDespachoCntDiasExc(Util.getDaysAfterDate(tDespacho.getDespFecRetPro()));
					factDespacho.setDespachoTrabEnFec((short)constantes.getValueNumberCero());
					factDespacho.setDespachoTrabFueraFec((short)constantes.getValueNumberUnit());
				}else{
					factDespacho.setDespachoCntDiasExc(constantes.getValueNumberCero());
					factDespacho.setDespachoTrabEnFec((short)constantes.getValueNumberUnit());
					factDespacho.setDespachoTrabFueraFec((short)constantes.getValueNumberCero());
				}
			}else{
				if(Util.isGreaterThanAnotherDate(tDespacho.getDespFecRetRea(), tDespacho.getDespFecRetPro())){
					factDespacho.setDespachoCntDiasExc(Util.getDaysBetweenDates(tDespacho.getDespFecRetRea(), tDespacho.getDespFecRetPro()));
					factDespacho.setDespachoTrabEnFec((short)constantes.getValueNumberCero());
					factDespacho.setDespachoTrabFueraFec((short)constantes.getValueNumberUnit());
				}else{
					factDespacho.setDespachoCntDiasExc(constantes.getValueNumberCero());
					factDespacho.setDespachoTrabEnFec((short)constantes.getValueNumberUnit());
					factDespacho.setDespachoTrabFueraFec((short)constantes.getValueNumberCero());
				}
			}
		}

		tCargoDespachoExample.clear();
		tCargoDespachoExample.createCriteria().andDespIdEqualTo(factDespacho.getDespachoKey());
		tCargoDespachoExample.createCriteria().andFecNumCamBetween(dateTimeFrom, dateTimeUntil);
		recordTotal = tCargoDespachoManager.countByExample(tCargoDespachoExample);
		
		if(recordTotal>0){
			
			tCargoDespachoExample.clear();
			tCargoDespachoExample.createCriteria().andDespIdEqualTo(factDespacho.getDespachoKey());
			factDespacho.setDespachoCntCargos(tCargoDespachoManager.countByExample(tCargoDespachoExample));
			
			tCargoDespachoExample.clear();
			tCargoDespachoExample.createCriteria().andDespIdEqualTo(factDespacho.getDespachoKey());
			tParametroExample.clear();
			tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoCargoDespacho());
			tParametroExample.createCriteria().andParamCodEqualTo(constantes.getParamCodeEstadoCargoDespachoEntregado());
			tParametro = tParametroManager.selectByExample(tParametroExample).get(0);
			tCargoDespachoExample.createCriteria().andCarDespCodEstEqualTo(tParametro.getParamId());
			factDespacho.setDespachoCntEnt(tCargoDespachoManager.countByExample(tCargoDespachoExample));
			
			tCargoDespachoExample.clear();
			tCargoDespachoExample.createCriteria().andDespIdEqualTo(factDespacho.getDespachoKey());
			tParametroExample.clear();
			tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoCargoDespacho());
			tParametroExample.createCriteria().andParamCodEqualTo(constantes.getParamCodeEstadoCargoDespachoMotivado());
			tParametro = tParametroManager.selectByExample(tParametroExample).get(0);
			tCargoDespachoExample.createCriteria().andCarDespCodEstEqualTo(tParametro.getParamId());
			factDespacho.setDespachoCntMot(tCargoDespachoManager.countByExample(tCargoDespachoExample));
			
			tCargoDespachoExample.clear();
			tCargoDespachoExample.createCriteria().andDespIdEqualTo(factDespacho.getDespachoKey());
			tParametroExample.clear();
			tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoCargoDespacho());
			tParametroExample.createCriteria().andParamCodEqualTo(constantes.getParamCodeEstadoCargoDespachoReenviado());
			tParametro = tParametroManager.selectByExample(tParametroExample).get(0);
			tCargoDespachoExample.createCriteria().andCarDespCodEstEqualTo(tParametro.getParamId());
			factDespacho.setDespachoCntRee(tCargoDespachoManager.countByExample(tCargoDespachoExample));
			
			tCargoDespachoExample.clear();
			tCargoDespachoExample.createCriteria().andDespIdEqualTo(factDespacho.getDespachoKey());
			tParametroExample.clear();
			tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoCargoDespacho());
			tParametroExample.createCriteria().andParamCodEqualTo(constantes.getParamCodeEstadoCargoDespachoAnulado());
			tParametro = tParametroManager.selectByExample(tParametroExample).get(0);
			tCargoDespachoExample.createCriteria().andCarDespCodEstEqualTo(tParametro.getParamId());
			factDespacho.setDespachoCntAnu(tCargoDespachoManager.countByExample(tCargoDespachoExample));
			
			tCargoDespachoExample.clear();
			tCargoDespachoExample.createCriteria().andDespIdEqualTo(factDespacho.getDespachoKey());
			tParametroExample.clear();
			tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoCargoDespacho());
			tParametroExample.createCriteria().andParamCodEqualTo(constantes.getParamCodeEstadoCargoDespachoFueraZona());
			tParametro = tParametroManager.selectByExample(tParametroExample).get(0);
			tCargoDespachoExample.createCriteria().andCarDespCodEstEqualTo(tParametro.getParamId());
			factDespacho.setDespachoCntFueZon(tCargoDespachoManager.countByExample(tCargoDespachoExample));
			
			tCargoDespachoExample.clear();
			tCargoDespachoExample.createCriteria().andDespIdEqualTo(factDespacho.getDespachoKey());
			tParametroExample.clear();
			tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoCargoDespacho());
			tParametroExample.createCriteria().andParamCodEqualTo(constantes.getParamCodeEstadoCargoDespachoPerdido());
			tParametro = tParametroManager.selectByExample(tParametroExample).get(0);
			tCargoDespachoExample.createCriteria().andCarDespCodEstEqualTo(tParametro.getParamId());
			factDespacho.setDespachoCntPerd(tCargoDespachoManager.countByExample(tCargoDespachoExample));
			
			tCargoDespachoExample.clear();
			tCargoDespachoExample.createCriteria().andDespIdEqualTo(factDespacho.getDespachoKey());
			tParametroExample.clear();
			tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoCargoDespacho());
			tParametroExample.createCriteria().andParamCodEqualTo(constantes.getParamCodeEstadoCargoDespachoDigitado());
			tParametro = tParametroManager.selectByExample(tParametroExample).get(0);
			tCargoDespachoExample.createCriteria().andCarDespCodEstEqualTo(tParametro.getParamId());
			factDespacho.setDespachoCntDig(tCargoDespachoManager.countByExample(tCargoDespachoExample));
			
			tCargoDespachoExample.clear();
			tCargoDespachoExample.createCriteria().andDespIdEqualTo(factDespacho.getDespachoKey());
			tParametroExample.clear();
			tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoCargoDespacho());
			tParametroExample.createCriteria().andParamCodEqualTo(constantes.getParamCodeEstadoCargoDespachoRuta());
			tParametro = tParametroManager.selectByExample(tParametroExample).get(0);
			tCargoDespachoExample.createCriteria().andCarDespCodEstEqualTo(tParametro.getParamId());
			factDespacho.setDespachoCntRut(tCargoDespachoManager.countByExample(tCargoDespachoExample));
			
			tCargoDespachoExample.clear();
			tCargoDespachoExample.createCriteria().andDespIdEqualTo(factDespacho.getDespachoKey());
			tParametroExample.clear();
			tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoCargoDespacho());
			tParametroExample.createCriteria().andParamCodEqualTo(constantes.getParamCodeEstadoCargoDespachoProvincia());
			tParametro = tParametroManager.selectByExample(tParametroExample).get(0);
			tCargoDespachoExample.createCriteria().andCarDespCodEstEqualTo(tParametro.getParamId());
			factDespacho.setDespachoCntPro(tCargoDespachoManager.countByExample(tCargoDespachoExample));
			
			tCargoDespachoExample.clear();
			tCargoDespachoExample.createCriteria().andDespIdEqualTo(factDespacho.getDespachoKey());
			tParametroExample.clear();
			tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoCargoDespacho());
			tParametroExample.createCriteria().andParamCodEqualTo(constantes.getParamCodeEstadoCargoDespachoRobo());
			tParametro = tParametroManager.selectByExample(tParametroExample).get(0);
			tCargoDespachoExample.createCriteria().andCarDespCodEstEqualTo(tParametro.getParamId());
			factDespacho.setDespachoCntRob(tCargoDespachoManager.countByExample(tCargoDespachoExample));
			
		}
		
		factDespacho.setProcId(process);
	}
	
	public int insertRecordDimensionalDespacho(){
		try{
			resultTransaction = factDespachoManager.insertSelective(factDespacho);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int updateRecordDimensionalDespacho(){
		try{
			resultTransaction = factDespachoManager.updateByPrimaryKeySelective(factDespacho);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int deleteRecordDimensionalDespacho(){
		try{
			resultTransaction = factDespachoManager.deleteByPrimaryKey(factDespacho.getDespachoKey());
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction; 
	}
	
	public void updateRecordGenericDespacho(String statusRecord){
		try{
			int idDespacho = tDespacho.getDespId();
			tDespacho.clear();
			tDespacho.setDespId(idDespacho);
			tDespacho.setCodIndCam(statusRecord);
			tDespacho.setProcId(process);
			tDespachoManager.updateByPrimaryKeySelective(tDespacho);
		}catch(Exception e){
			
		}
	}
}
