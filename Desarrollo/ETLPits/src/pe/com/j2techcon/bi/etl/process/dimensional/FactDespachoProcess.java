package pe.com.j2techcon.bi.etl.process.dimensional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.logic.dimensional.FactDespachoManager;
import pe.com.j2techcon.bi.etl.logic.generic.TDespachoManager;
import pe.com.j2techcon.bi.etl.logic.generic.TCargoDespachoManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.util.Util;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactDespacho;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactDespachoExample;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoDespacho;
import pe.com.j2techcon.bi.etl.domain.generic.TDespacho;
import pe.com.j2techcon.bi.etl.domain.generic.TDespachoExample;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoDespachoExample;

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
	
	private FactDespacho factDespacho;
	private FactDespachoExample factDespachoExample;
	
	private TCargoDespachoManager tCargoDespachoManager;
	private TDespachoManager tDespachoManager;
	private FactDespachoManager factDespachoManager;
	
	private List<TCargoDespacho> lstCargoDespacho;
	
	private Constantes constantes;

	static Logger log = Logger.getLogger(FactDespachoProcess.class);

	public FactDespachoProcess(BeanFactory factory, int sizePage,
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

		tCargoDespachoManager = factory.getBean("tCargoDespachoManager", TCargoDespachoManager.class);
		tDespachoManager = factory.getBean("tDespachoManager", TDespachoManager.class);
		factDespachoManager = factory.getBean("factDespachoManager", FactDespachoManager.class);
		
		tCargoDespacho = new TCargoDespacho();
		tCargoDespachoExample = new TCargoDespachoExample();
		
		tDespacho = new TDespacho();
		tDespachoExample = new TDespachoExample();
		
		factDespacho = new FactDespacho();
		factDespachoExample = new FactDespachoExample();

		List<String> lstStateRecord = new ArrayList<String>();
		lstStateRecord.add(constantes.getStateRecordNew());
		lstStateRecord.add(constantes.getStateRecordUpdated());
		
		//int offset = 0;
		
		List<TCargoDespacho> lstCargoDespacho = new ArrayList<TCargoDespacho>();
		
		while(true) {
			tCargoDespachoExample.clear();

			tCargoDespachoExample.createCriteria().andFecNumCamGreaterThanOrEqualTo(dateTimeFrom).andFecNumCamLessThan(dateTimeUntil).andCodIndCamIn(lstStateRecord);
			//tCargoDespachoExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			tCargoDespachoExample.setPaginationByClause(" limit " + constantes.getSizePage());
			
			lstCargoDespacho = tCargoDespachoManager.selectByExample(tCargoDespachoExample);
			if(lstCargoDespacho.size()>0){
				for (Iterator<TCargoDespacho> iterator = lstCargoDespacho.iterator(); iterator.hasNext();) {
					tCargoDespacho = iterator.next();
					tDespacho = tDespachoManager.selectByPrimaryKey(tCargoDespacho.getCarDespId());
					factDespacho.clear();
					processRecordDespacho();
				}
				lstCargoDespacho.clear();
				//offset = offset + constantes.getSizePage();
			}else{
				lstCargoDespacho.clear();
				this.lstCargoDespacho.clear();
				
				tCargoDespacho.clear();
				tCargoDespachoExample.clear();
				
				tDespacho.clear();
				tDespachoExample.clear();
				
				factDespacho.clear();
				factDespachoExample.clear();

				break;
			}
			
		}
		
		List<TDespacho> lstDespacho = new ArrayList<TDespacho>();
		
		while(true){
			tDespachoExample.clear();

			tDespachoExample.createCriteria().andFecNumCamGreaterThanOrEqualTo(dateTimeFrom).andFecNumCamLessThan(dateTimeUntil).andProcIdNotEqualTo(process).andCodIndCamIn(lstStateRecord);
			//tDespachoExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			tDespachoExample.setPaginationByClause(" limit " + constantes.getSizePage());
			
			lstDespacho = tDespachoManager.selectByExample(tDespachoExample);
			if(lstDespacho.size()>0){
				for (Iterator<TDespacho> iterator = lstDespacho.iterator(); iterator.hasNext();) {
					tDespacho = iterator.next();
					factDespacho.clear();
					processRecordDespacho();
				}
				lstDespacho.clear();
				//offset = offset + constantes.getSizePage();
			}else{
				lstStateRecord.clear();
				lstDespacho.clear();
				lstCargoDespacho.clear();
				
				tCargoDespacho.clear();
				tCargoDespachoExample.clear();
				
				tDespacho.clear();
				tDespachoExample.clear();
				
				factDespacho.clear();
				factDespachoExample.clear();
				
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
	
	public void processRecordDespacho()throws Exception{
		
		if(!tDespacho.getProcId().equals(process)){
		
			completeFieldDespacho();
			
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
	
	public void completeFieldDespacho()throws Exception{
		factDespacho.setDespachoKey(tDespacho.getDespId());
		factDespacho.setDespachoKeySede(tDespacho.getSedId());
		factDespacho.setDespachoKeyZona(tDespacho.getZonId());
		factDespacho.setDespachoKeyPersonal(tDespacho.getEmpCatId());
		factDespacho.setDespachoKeyTipoRuta(tDespacho.getDespCodTipRut());
		factDespacho.setDespachoKeyFecSal(Util.getDateAsInteger(tDespacho.getDespFecSal()));
		factDespacho.setDespachoKeyFecRetp(Util.getDateAsInteger(tDespacho.getDespFecRetPro()));
		factDespacho.setDespachoKeyFecRetr(Util.getDateAsInteger(tDespacho.getDespFecRetRea()));
		factDespacho.setDespachoKeyEstado(tDespacho.getDespCodEst());
		factDespacho.setDespachoMonPasaje(tDespacho.getDespMonPasaje());

		if(tDespacho.getDespCodEst() != constantes.getParamSerialEstadoDespachoAnulado()){
			if(Util.isEqualsWithDefaultDate(tDespacho.getDespFecRetRea())){
				if(Util.isGreaterThanCurrentDate(tDespacho.getDespFecRetPro())){
					factDespacho.setDespachoCntDiasExc(Util.getDaysAfterDate(tDespacho.getDespFecRetPro()));
					factDespacho.setDespachoTrabEnFec((short) 0);
					factDespacho.setDespachoTrabFueraFec((short) 1);
				}else{
					factDespacho.setDespachoCntDiasExc(0);
					factDespacho.setDespachoTrabEnFec((short) 1);
					factDespacho.setDespachoTrabFueraFec((short) 0);
				}
			}else{
				if(Util.isGreaterThanAnotherDate(tDespacho.getDespFecRetRea(), tDespacho.getDespFecRetPro())){
					factDespacho.setDespachoCntDiasExc(Util.getDaysBetweenDates(tDespacho.getDespFecRetRea(), tDespacho.getDespFecRetPro()));
					factDespacho.setDespachoTrabEnFec((short) 0);
					factDespacho.setDespachoTrabFueraFec((short) 1);
				}else{
					factDespacho.setDespachoCntDiasExc(0);
					factDespacho.setDespachoTrabEnFec((short) 1);
					factDespacho.setDespachoTrabFueraFec((short) 0);
				}
			}
		}else{
			factDespacho.setDespachoCntDiasExc(0);
			factDespacho.setDespachoTrabEnFec((short) 0);
			factDespacho.setDespachoTrabFueraFec((short) 0);
		}

		tCargoDespachoExample.clear();
		tCargoDespachoExample.createCriteria().andDespIdEqualTo(factDespacho.getDespachoKey());
		//tCargoDespachoExample.createCriteria().andFecNumCamBetween(dateTimeFrom, dateTimeUntil);
		lstCargoDespacho = tCargoDespachoManager.selectByExample(tCargoDespachoExample);
		
		factDespacho.setDespachoCntCargos(0);
		factDespacho.setDespachoCntEnt(0);
		factDespacho.setDespachoCntMot(0);
		factDespacho.setDespachoCntRee(0);
		factDespacho.setDespachoCntAnu(0);
		factDespacho.setDespachoCntFueZon(0);
		factDespacho.setDespachoCntPerd(0);
		factDespacho.setDespachoCntDig(0);
		factDespacho.setDespachoCntRut(0);
		factDespacho.setDespachoCntPro(0);
		factDespacho.setDespachoCntRob(0);
		
		for (Iterator <TCargoDespacho> iterator = lstCargoDespacho.iterator(); iterator.hasNext();) {
			tCargoDespacho = iterator.next();
			
			factDespacho.setDespachoCntCargos(factDespacho.getDespachoCntCargos() + 1);
			
			if(constantes.getParamSerialEstadoCargoDespachoEntregado() == tCargoDespacho.getCarDespCodEst()){
				factDespacho.setDespachoCntEnt(factDespacho.getDespachoCntEnt() + 1);
			}else if(constantes.getParamSerialEstadoCargoDespachoMotivado() == tCargoDespacho.getCarDespCodEst()){
				factDespacho.setDespachoCntMot(factDespacho.getDespachoCntMot() + 1);
			}else if(constantes.getParamSerialEstadoCargoDespachoReenviado() == tCargoDespacho.getCarDespCodEst()){
				factDespacho.setDespachoCntRee(factDespacho.getDespachoCntRee() + 1);
			}else if(constantes.getParamSerialEstadoCargoDespachoAnulado() == tCargoDespacho.getCarDespCodEst()){
				factDespacho.setDespachoCntAnu(factDespacho.getDespachoCntAnu() + 1);
			}else if(constantes.getParamSerialEstadoCargoDespachoFueraZona() == tCargoDespacho.getCarDespCodEst()){
				factDespacho.setDespachoCntFueZon(factDespacho.getDespachoCntFueZon() + 1);
			}else if(constantes.getParamSerialEstadoCargoDespachoPerdido() == tCargoDespacho.getCarDespCodEst()){
				factDespacho.setDespachoCntPerd(factDespacho.getDespachoCntPerd() + 1);
			}else if(constantes.getParamSerialEstadoCargoDespachoDigitado() == tCargoDespacho.getCarDespCodEst()){
				factDespacho.setDespachoCntDig(factDespacho.getDespachoCntDig() + 1);
			}else if(constantes.getParamSerialEstadoCargoDespachoRuta() == tCargoDespacho.getCarDespCodEst()){
				factDespacho.setDespachoCntRut(factDespacho.getDespachoCntRut() + 1);
			}else if(constantes.getParamSerialEstadoCargoDespachoProvincia() == tCargoDespacho.getCarDespCodEst()){
				factDespacho.setDespachoCntPro(factDespacho.getDespachoCntPro() + 1);
			}else if(constantes.getParamSerialEstadoCargoDespachoRobo() == tCargoDespacho.getCarDespCodEst()){
				factDespacho.setDespachoCntRob(factDespacho.getDespachoCntRob() + 1);
			}else{
				//
			}	
		}
		
		factDespacho.setProcId(process);
	}
	
	public int insertRecordDimensionalDespacho()throws Exception{
		try{
			resultTransaction = factDespachoManager.insertSelective(factDespacho);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int updateRecordDimensionalDespacho()throws Exception{
		try{
			resultTransaction = factDespachoManager.updateByPrimaryKeySelective(factDespacho);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int deleteRecordDimensionalDespacho()throws Exception{
		try{
			resultTransaction = factDespachoManager.deleteByPrimaryKey(factDespacho.getDespachoKey());
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction; 
	}
	
	public void updateRecordGenericDespacho(String statusRecord)throws Exception{
		int idDespacho = tDespacho.getDespId();
		tDespacho.clear();
		tDespacho.setDespId(idDespacho);
		tDespacho.setCodIndCam(statusRecord);
		//tDespacho.setFecNumCam(Util.getCurrentDateTimeAsLong());
		tDespacho.setProcId(process);
		tDespachoManager.updateByPrimaryKeySelective(tDespacho);
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

	
	public FactDespachoManager getFactDespachoManager() {
		return factDespachoManager;
	}

	
	public void setFactDespachoManager(FactDespachoManager factDespachoManager) {
		this.factDespachoManager = factDespachoManager;
	}

	
	public List<TCargoDespacho> getLstCargoDespacho() {
		return lstCargoDespacho;
	}

	
	public void setLstCargoDespacho(List<TCargoDespacho> lstCargoDespacho) {
		this.lstCargoDespacho = lstCargoDespacho;
	}

	
	public Constantes getConstantes() {
		return constantes;
	}

	
	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}
}
