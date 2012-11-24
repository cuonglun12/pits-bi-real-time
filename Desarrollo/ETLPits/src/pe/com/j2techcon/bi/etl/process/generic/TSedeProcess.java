package pe.com.j2techcon.bi.etl.process.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;
import pe.com.j2techcon.bi.etl.domain.generic.TSede;
import pe.com.j2techcon.bi.etl.domain.generic.TSedeExample;
import pe.com.j2techcon.bi.etl.domain.origen.Sedesprov;
import pe.com.j2techcon.bi.etl.domain.origen.SedesprovExample;
import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;
import pe.com.j2techcon.bi.etl.logic.generic.TSedeManager;
import pe.com.j2techcon.bi.etl.logic.origen.SedesprovManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.util.Util;

public class TSedeProcess {

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
	
	private Sedesprov sedesprov;
	private SedesprovExample sedesprovExample;
	
	private TSede tSede;
	private TSedeExample tSedeExample;
	
	private TParametro tParametro;
	private TParametroExample tParametroExample;
	
	private SedesprovManager sedesprovManager;
	private TSedeManager tSedeManager;
	private TParametroManager tParametroManager;
	
	private List<TParametro> lstParametro;
	
	private Map<String,Integer> mpUbigeo;
	
	private Constantes constantes;
	
	static Logger log = Logger.getLogger(TSedeProcess.class);
	
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

	public Sedesprov getSedesprov() {
		return sedesprov;
	}

	public void setSedesprov(Sedesprov sedesprov) {
		this.sedesprov = sedesprov;
	}

	public SedesprovExample getSedesprovExample() {
		return sedesprovExample;
	}

	public void setSedesprovExample(SedesprovExample sedesprovExample) {
		this.sedesprovExample = sedesprovExample;
	}

	public TSede gettSede() {
		return tSede;
	}

	public void settSede(TSede tSede) {
		this.tSede = tSede;
	}

	public TSedeExample gettSedeExample() {
		return tSedeExample;
	}

	public void settSedeExample(TSedeExample tSedeExample) {
		this.tSedeExample = tSedeExample;
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

	public SedesprovManager getSedesprovManager() {
		return sedesprovManager;
	}

	public void setSedesprovManager(SedesprovManager sedesprovManager) {
		this.sedesprovManager = sedesprovManager;
	}

	public TSedeManager gettSedeManager() {
		return tSedeManager;
	}

	public void settSedeManager(TSedeManager tSedeManager) {
		this.tSedeManager = tSedeManager;
	}

	public TParametroManager gettParametroManager() {
		return tParametroManager;
	}

	public void settParametroManager(TParametroManager tParametroManager) {
		this.tParametroManager = tParametroManager;
	}

	public List<TParametro> getLstParametro() {
		return lstParametro;
	}

	public void setLstParametro(List<TParametro> lstParametro) {
		this.lstParametro = lstParametro;
	}

	public Map<String, Integer> getMpUbigeo() {
		return mpUbigeo;
	}

	public void setMpUbigeo(Map<String, Integer> mpUbigeo) {
		this.mpUbigeo = mpUbigeo;
	}

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public TSedeProcess(BeanFactory factory, int sizePage, long dateTimeFrom,
			long dateTimeUntil, String typeProcess, int process) throws Exception{
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
		
		sedesprovManager = factory.getBean("sedesprovManager",SedesprovManager.class);
		tSedeManager = factory.getBean("tSedeManager",TSedeManager.class);
		tParametroManager = factory.getBean("tParametroManager",TParametroManager.class);
		
		sedesprov = new Sedesprov();
		sedesprovExample = new SedesprovExample();
		
		tSede = new TSede();
		tSedeExample = new TSedeExample();
		
		tParametro = new TParametro();
		tParametroExample = new TParametroExample();
		
		lstParametro = new ArrayList<TParametro>();
		
		mpUbigeo = new HashMap<String, Integer>();
		tParametroExample.clear();
		tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeUbigeoDistrito());
		lstParametro = tParametroManager.selectByExample(tParametroExample);
		for (Iterator<TParametro> iterator = lstParametro.iterator(); iterator.hasNext();) {
			tParametro = iterator.next();
			mpUbigeo.put(tParametro.getParamCod(),tParametro.getParamId());
		}
		
		List<String> lstStateRecord = new ArrayList<String>();
		lstStateRecord.add(constantes.getStateRecordNew());
		lstStateRecord.add(constantes.getStateRecordUpdated());
		
		//int offset = 0;
		
		List<Sedesprov> lstSedes = new ArrayList<Sedesprov>();
		
		while (true) {

			sedesprovExample.clear();

			sedesprovExample.createCriteria().andBiFecNumCamGreaterThanOrEqualTo(Util.getDateTimeLongAsDate(dateTimeFrom)).andBiFecNumCamLessThan(Util.getDateTimeLongAsDate(dateTimeUntil)).andBiCodIndCamIn(lstStateRecord);
			//sedesprovExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			sedesprovExample.setPaginationByClause(" limit " + constantes.getSizePage());
			
			lstSedes = sedesprovManager.selectByExample(sedesprovExample);

			if (lstSedes.size() > 0) {
				for (Iterator<Sedesprov> iterator = lstSedes.iterator(); iterator.hasNext();) {
					sedesprov = iterator.next();
					tSede.clear();
					processRecordSede();
				}
				lstSedes.clear();
				//offset = offset + constantes.getSizePage();
			} else {

				lstStateRecord.clear();
				
				lstSedes.clear();

				sedesprov.clear();
				sedesprovExample.clear();

				tSede.clear();
				tSedeExample.clear();
				
				tParametro.clear();
				tParametroExample.clear();
				
				mpUbigeo.clear();
				
				lstParametro.clear();

				break;
			}
		}

		if (recordRejected > 0) {
			resultProcess = constantes.getResultProcessCompletedErrors();
		} else {
			resultProcess = constantes.getResultProcessCompletedCorrectly();
		}

		recordTotal = recordProcessed + recordRejected;

		return resultProcess;
	}

	public void processRecordSede() throws Exception{
		
		completeFieldSede();
		
		if(typeProcess.equals(constantes.getTypeProcessSimple())){
			if(tSede.getCodIndCam().equals(constantes.getStateRecordNew())){
				if(insertRecordGenericSede()> constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordOrigen = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}else{
				if(updateRecordGenericSede() > constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordOrigen = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}else{
			if(updateRecordGenericSede() > constantes.getResultTransactionNoResult()){
				stateRecordOrigen = constantes.getStateRecordProcessed();
				recordProcessed = recordProcessed + 1; 
			}else{
				if(insertRecordGenericSede() > constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1;
				}else{
					stateRecordOrigen = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}
		
		updateRecordOrigenSede(stateRecordOrigen);
		
	}

	public void completeFieldSede() throws Exception{

		tSede.setSedCod(sedesprov.getCodsede());
		
		if(sedesprov.getUbigeo() != null && sedesprov.getUbigeo().length()>0){
			tSede.setUbiId(mpUbigeo.get(sedesprov.getUbigeo()));
			if(tSede.getUbiId() == null){
				tSede.setUbiId(constantes.getParamSerialUbigeoDistritoNoDefinido());
			}
		}else{
			tSede.setUbiId(constantes.getParamSerialUbigeoDistritoNoDefinido());
		}
		
		tSede.setSedCodTip(constantes.getParamSerialTipoSedeNoDefinido());
		
		tSede.setSedDes(sedesprov.getNomsede());
		
		tSede.setFecNumCam(Util.getCurrentDateTimeAsLong());
		if(constantes.getStateRecordNew().equals(sedesprov.getBiCodIndCam())){
			tSede.setCodIndCam(constantes.getStateRecordNew());
		}else{
			tSede.setCodIndCam(constantes.getStateRecordUpdated());
		}
		tSede.setProcId(process);

	}

	public int insertRecordGenericSede() throws Exception{
		try {
			resultTransaction = tSedeManager.insertSelective(tSede);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int updateRecordGenericSede() throws Exception{
		try {
			tSedeExample.clear();
			tSedeExample.createCriteria().andSedCodEqualTo(tSede.getSedCod());
			tSede.setSedCod(null);
			resultTransaction = tSedeManager.updateByExampleSelective(tSede, tSedeExample);	
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int deleteRecordGenericSede() throws Exception{
		try {
			tSedeExample.clear();
			tSedeExample.createCriteria().andSedCodEqualTo(tSede.getSedCod());	
			resultTransaction = tSedeManager.deleteByExample(tSedeExample);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public void updateRecordOrigenSede(String statusRecord) throws Exception{
		String codSede = sedesprov.getCodsede();
		sedesprov.clear();
		sedesprov.setCodsede(codSede);
		sedesprov.setBiCodIndCam(statusRecord);
		//sedesprov.setBiFecNumCam(Util.getCurrentDateTime());
		sedesprovManager.updateByPrimaryKeySelective(sedesprov);
	}

}
