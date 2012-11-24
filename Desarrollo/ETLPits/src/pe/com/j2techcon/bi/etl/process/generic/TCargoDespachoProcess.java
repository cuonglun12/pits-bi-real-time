package pe.com.j2techcon.bi.etl.process.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.domain.generic.TCargo;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoDespacho;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoDespachoExample;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoExample;
import pe.com.j2techcon.bi.etl.domain.generic.TDespacho;
import pe.com.j2techcon.bi.etl.domain.generic.TDespachoExample;
import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;
import pe.com.j2techcon.bi.etl.domain.generic.TZona;
import pe.com.j2techcon.bi.etl.domain.generic.TZonaExample;
import pe.com.j2techcon.bi.etl.domain.origen.Detdespacho;
import pe.com.j2techcon.bi.etl.domain.origen.DetdespachoExample;
import pe.com.j2techcon.bi.etl.logic.generic.TCargoDespachoManager;
import pe.com.j2techcon.bi.etl.logic.generic.TCargoManager;
import pe.com.j2techcon.bi.etl.logic.generic.TDespachoManager;
import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;
import pe.com.j2techcon.bi.etl.logic.generic.TZonaManager;
import pe.com.j2techcon.bi.etl.logic.origen.DetdespachoManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.util.Util;

public class TCargoDespachoProcess {

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
	
	private TDespacho tDespacho;
	private TDespachoExample tDespachoExample;
	
	private Detdespacho detdespacho;
	private DetdespachoExample detdespachoExample;

	private TCargo tCargo;
	private TCargoExample tCargoExample;
	
	private TCargoDespacho tCargoDespacho;
	private TCargoDespachoExample tCargoDespachoExample;

	private TZona tZona;
	private TZonaExample tZonaExample;
	
	private TParametroManager tParametroManager;
	private TDespachoManager tDespachoManager;
	private DetdespachoManager detdespachoManager;
	private TCargoManager tCargoManager;
	private TCargoDespachoManager tCargoDespachoManager;
	private TZonaManager tZonaManager;
	
	private Map<String,Integer> mpZona;
	private Map<String,Integer> mpCargo;
	private Map<String,Integer> mpDespacho;
	private Map<String,Integer> mpEstadoCargoDespacho;

	private List<TParametro> lstParametro;
	private List<TZona> lstZona;
	private List<TCargo> lstCargo;
	private List<TDespacho> lstDespacho;
	private List<String> lstDespachos;
	private List<String> lstCargos;

	private Constantes constantes;

	static Logger log = Logger.getLogger(TCargoDespachoProcess.class);

	public TCargoDespachoProcess(BeanFactory factory, int sizePage,
			long dateTimeFrom, long dateTimeUntil, String typeProcess,
			int process) throws Exception{
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
		
		tDespachoManager = factory.getBean("tDespachoManager", TDespachoManager.class);
		detdespachoManager = factory.getBean("detdespachoManager", DetdespachoManager.class);
		tCargoManager = factory.getBean("tCargoManager", TCargoManager.class);
		tCargoDespachoManager = factory.getBean("tCargoDespachoManager", TCargoDespachoManager.class);
		tZonaManager = factory.getBean("tZonaManager", TZonaManager.class);
		tParametroManager = factory.getBean("tParametroManager", TParametroManager.class);
		
		tParametro = new TParametro();
		tParametroExample = new TParametroExample();
		
		tDespacho = new TDespacho();
		tDespachoExample = new TDespachoExample();
		
		detdespacho = new Detdespacho();
		detdespachoExample = new DetdespachoExample();

		tCargo = new TCargo();
		tCargoExample = new TCargoExample();
		
		tCargoDespacho = new TCargoDespacho();
		tCargoDespachoExample = new TCargoDespachoExample();

		tZona = new TZona();
		tZonaExample = new TZonaExample();
		
		lstParametro = new ArrayList<TParametro>();
		lstZona = new ArrayList<TZona>();
		lstCargo = new ArrayList<TCargo>();
		lstDespacho = new ArrayList<TDespacho>();
		lstDespachos = new ArrayList<String>();
		lstCargos = new ArrayList<String>();
		
		mpZona = new HashMap<String, Integer>();
		lstZona = tZonaManager.selectByExample(null);
		for (Iterator<TZona> iterator = lstZona.iterator(); iterator.hasNext();) {
			tZona = iterator.next();
			mpZona.put(tZona.getZonCod(), tZona.getZonId());
		}
		
		mpEstadoCargoDespacho = new HashMap<String, Integer>();
		tParametroExample.clear();
		tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeEstadoDespacho());
		lstParametro = tParametroManager.selectByExample(tParametroExample);
		for (Iterator<TParametro> iterator = lstParametro.iterator(); iterator.hasNext();) {
			tParametro = iterator.next();
			mpEstadoCargoDespacho.put(tParametro.getParamCod(),tParametro.getParamId());
		}
		
		mpDespacho = new HashMap<String, Integer>();
		mpCargo = new HashMap<String, Integer>();
		
		List<String> lstStateRecord = new ArrayList<String>();
		lstStateRecord.add(constantes.getStateRecordNew());
		lstStateRecord.add(constantes.getStateRecordUpdated());
		
		//int offset = 0;
		
		List<Detdespacho> lstDetDespacho = new ArrayList<Detdespacho>();
		
		while (true) {

			detdespachoExample.clear();
			detdespachoExample.createCriteria().andBiFecNumCamGreaterThanOrEqualTo(Util.getDateTimeLongAsDate(dateTimeFrom)).andBiFecNumCamLessThan(Util.getDateTimeLongAsDate(dateTimeUntil)).andBiCodIndCamIn(lstStateRecord);
			//detdespachoExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			detdespachoExample.setPaginationByClause(" limit " + constantes.getSizePage());
			
			lstDetDespacho = detdespachoManager.selectByExample(detdespachoExample);

			if (lstDetDespacho.size() > 0) {
				
				mpDespacho.clear();
				lstDespachos = Util.getStringListFromObjectList(lstDetDespacho,"serieguia-nroguia","-");
				
				if(lstDespachos.size()>0){
					tDespacho.clear();
					tDespachoExample.createCriteria().andDespCodCompIn(lstDespachos);
					lstDespacho = tDespachoManager.selectByExample(tDespachoExample);
					for (Iterator<TDespacho> iterator = lstDespacho.iterator(); iterator.hasNext();) {
						tDespacho = iterator.next();
						mpDespacho.put(tDespacho.getDespCodComp(),tDespacho.getDespId());
					}
				}
				
				mpCargo.clear();
				lstCargos = Util.getStringListFromObjectList(lstDetDespacho,"serieguia-nroguia-correlativo","-");
				
				if(lstCargos.size()>0){
					tCargo.clear();
					tCargoExample.createCriteria().andCargCodCompIn(lstCargos);
					lstCargo = tCargoManager.selectByExample(tCargoExample);
					for (Iterator<TCargo> iterator = lstCargo.iterator(); iterator.hasNext();) {
						tCargo = iterator.next();
						mpCargo.put(tCargo.getCargCodComp(),tCargo.getCargId());
					}
				}
				
				for (Iterator<Detdespacho> iterator = lstDetDespacho.iterator(); iterator.hasNext();) {
					detdespacho = iterator.next();
					tCargoDespacho.clear();
					processRecordCargoDespacho();
				}
				lstDetDespacho.clear();
				//offset = offset + constantes.getSizePage();
			} else {

				lstStateRecord.clear();
				lstDetDespacho.clear();
				
				tDespacho.clear();
				tDespachoExample.clear();
				
				detdespacho.clear();
				detdespachoExample.clear();
				
				tCargo.clear();
				tCargoExample.clear();
				
				tCargoDespacho.clear();
				tCargoDespachoExample.clear();
				
				tZona.clear();
				tZonaExample.clear();
				
				mpCargo.clear();
				mpDespacho.clear();
				mpEstadoCargoDespacho.clear();
				mpZona.clear();

				lstZona.clear();
				lstCargo.clear();
				lstDespacho.clear();
				lstCargos.clear();
				lstDespachos.clear();
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
		
		
		return getResultProcess();
	}

	public void processRecordCargoDespacho() throws Exception{
		
		completeFieldCargoDespacho();
		
		if(tCargoDespacho.getDespId() != null && tCargoDespacho.getCargId() != null){
			if(typeProcess.equals(constantes.getTypeProcessSimple())){
				if(tCargoDespacho.getCodIndCam().equals(constantes.getStateRecordNew())){
					if(insertRecordGenericCargoDespacho()> constantes.getResultTransactionNoResult()){
						stateRecordOrigen = constantes.getStateRecordProcessed();
						recordProcessed = recordProcessed + 1; 
					} else{
						stateRecordOrigen = constantes.getStateRecordInconsistent();
						recordRejected = recordRejected + 1;
					}
				}else{
					if(updateRecordGenericCargoDespacho() > constantes.getResultTransactionNoResult()){
						stateRecordOrigen = constantes.getStateRecordProcessed();
						recordProcessed = recordProcessed + 1; 
					} else{
						stateRecordOrigen = constantes.getStateRecordInconsistent();
						recordRejected = recordRejected + 1;
					}
				}
			}else{
				if(updateRecordGenericCargoDespacho() > constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				}else{
					if(insertRecordGenericCargoDespacho() > constantes.getResultTransactionNoResult()){
						stateRecordOrigen = constantes.getStateRecordProcessed();
						recordProcessed = recordProcessed + 1;
					}else{
						stateRecordOrigen = constantes.getStateRecordInconsistent();
						recordRejected = recordRejected + 1;
					}
				}
			}
			
			updateRecordOrigenCargoDespacho(stateRecordOrigen);
		}else{
			stateRecordOrigen = constantes.getStateRecordInconsistent();
			recordRejected = recordRejected + 1;
			updateRecordOrigenCargoDespacho(stateRecordOrigen);
		}
	}

	public void completeFieldCargoDespacho() throws Exception{

		tCargoDespacho.setDespId(getDespId(detdespacho.getSerieguia() + "-" + detdespacho.getNroguia()));
		
		tCargoDespacho.setCargId(getCargId(detdespacho.getSerieguia() + "-" + detdespacho.getNroguia() + "-" + Integer.parseInt(detdespacho.getCorrelativo())));

		if(tCargoDespacho.getDespId() != null && tCargoDespacho.getCargId() != null){

			tCargoDespacho.setDespCodTipDoc(constantes.getParamSerialTipoDocumentoTrabajoGuia());
			
			tCargoDespacho.setDespSerieDoc(detdespacho.getSerieguia());
			
			tCargoDespacho.setDespNumeroDoc(detdespacho.getNroguia());
			
			tCargoDespacho.setOrdCodTipDoc(constantes.getParamSerialTipoDocumentoTrabajoNoDefinido());
			
			tCargoDespacho.setOrdSerieDoc(detdespacho.getSerie());
			
			tCargoDespacho.setOrdNumDoc(detdespacho.getOrden());
			
			tCargoDespacho.setCargCorr(Integer.parseInt(detdespacho.getCorrelativo()));
			
			tCargoDespacho.setZonId(mpZona.get(detdespacho.getCodzona()));

			tCargoDespacho.setCarDespCodMov(constantes.getParamSerialMotivoCargoDespachoNoDefinido());

			tCargoDespacho.setCarDespCodVer(constantes.getParamSerialEstadoCargoDespachoVerificacionNoDefinido());

			tCargoDespacho.setCarDespDir(constantes.getValueStringDefault());
			
			tCargoDespacho.setCarDespRef(constantes.getValueStringDefault());

			tCargoDespacho.setCarDespFecSal(detdespacho.getFecasignado());
			//tCargoDespacho.setCarDespFecRetPro(detdespacho.getFecRecep());
			tCargoDespacho.setCarDespFecRetRea(detdespacho.getFecRecep());
			//tCargoDespacho.setCarDespFecVer();

			tCargoDespacho.setCarDespCodEst(mpEstadoCargoDespacho.get(detdespacho.getCodestado()));
			if(tCargoDespacho.getCarDespCodEst() == null){
				tCargoDespacho.setCarDespCodEst(constantes.getParamSerialEstadoCargoOrdenNoDefinido());
			}

			tCargoDespacho.setFecNumCam(Util.getCurrentDateTimeAsLong());
			
			if(constantes.getStateRecordNew().equals(detdespacho.getBiCodIndCam())){
				tCargoDespacho.setCodIndCam(constantes.getStateRecordNew());
			}else{
				tCargoDespacho.setCodIndCam(constantes.getStateRecordUpdated());
			}
			
			tCargoDespacho.setProcId(process);
		}
	}

	public int insertRecordGenericCargoDespacho() throws Exception{
		try {
			resultTransaction = tCargoDespachoManager.insertSelective(tCargoDespacho);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int updateRecordGenericCargoDespacho() throws Exception{
		try {
			tCargoDespachoExample.clear();
			tCargoDespachoExample.createCriteria().andDespCodTipDocEqualTo(constantes.getParamSerialTipoDocumentoTrabajoGuia()).andDespSerieDocEqualTo(tCargoDespacho.getDespSerieDoc()).andDespNumeroDocEqualTo(tCargoDespacho.getDespNumeroDoc()).andOrdCodTipDocEqualTo(constantes.getParamSerialTipoDocumentoTrabajoNoDefinido()).andOrdSerieDocEqualTo(tCargoDespacho.getOrdSerieDoc()).andOrdNumDocEqualTo(tCargoDespacho.getOrdNumDoc()).andCargCorrEqualTo(tCargoDespacho.getCargCorr());
						
			tCargoDespacho.setDespCodTipDoc(null);
			tCargoDespacho.setDespSerieDoc(null);
			tCargoDespacho.setDespNumeroDoc(null);
			tCargoDespacho.setOrdCodTipDoc(null);
			tCargoDespacho.setOrdSerieDoc(null);
			tCargoDespacho.setOrdNumDoc(null);
			tCargoDespacho.setCargCorr(null);

			
			resultTransaction = tCargoDespachoManager.updateByExampleSelective(tCargoDespacho, tCargoDespachoExample);	
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int deleteRecordGenericCargoDespacho() throws Exception{
		try {
			tCargoDespachoExample.clear();
			tCargoDespachoExample.createCriteria().andDespCodTipDocEqualTo(constantes.getParamSerialTipoDocumentoTrabajoGuia()).andDespSerieDocEqualTo(tCargoDespacho.getDespSerieDoc()).andDespNumeroDocEqualTo(tCargoDespacho.getDespNumeroDoc()).andOrdCodTipDocEqualTo(constantes.getParamSerialTipoDocumentoTrabajoNoDefinido()).andOrdSerieDocEqualTo(tCargoDespacho.getOrdSerieDoc()).andOrdNumDocEqualTo(tCargoDespacho.getOrdNumDoc()).andCargCorrEqualTo(tCargoDespacho.getCargCorr());
			resultTransaction = tCargoDespachoManager.deleteByExample(tCargoDespachoExample);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public void updateRecordOrigenCargoDespacho(String statusRecord) throws Exception{
		String serieGuia = detdespacho.getSerieguia();
		String numeroGuia = detdespacho.getNroguia();
		String serie = detdespacho.getSerie();
		String orden = detdespacho.getOrden();
		String correlativo = detdespacho.getCorrelativo();
		
		detdespacho.clear();
		detdespacho.setSerieguia(serieGuia);
		detdespacho.setNroguia(numeroGuia);
		detdespacho.setSerie(serie);
		detdespacho.setOrden(orden);
		detdespacho.setCorrelativo(correlativo);
		detdespacho.setBiCodIndCam(statusRecord);
		//detdespacho.setBiFecNumCam(Util.getCurrentDateTime());
		detdespachoManager.updateByPrimaryKeySelective(detdespacho);
	}
	
	public Integer getDespId(String key)throws Exception{
		return mpDespacho.get(key);
	}
	
	public Integer getCargId(String key)throws Exception{
		return mpCargo.get(key);
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

	
	public Detdespacho getDetdespacho() {
		return detdespacho;
	}

	
	public void setDetdespacho(Detdespacho detdespacho) {
		this.detdespacho = detdespacho;
	}

	
	public DetdespachoExample getDetdespachoExample() {
		return detdespachoExample;
	}

	
	public void setDetdespachoExample(DetdespachoExample detdespachoExample) {
		this.detdespachoExample = detdespachoExample;
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

	
	public TZona gettZona() {
		return tZona;
	}

	
	public void settZona(TZona tZona) {
		this.tZona = tZona;
	}

	
	public TZonaExample gettZonaExample() {
		return tZonaExample;
	}

	
	public void settZonaExample(TZonaExample tZonaExample) {
		this.tZonaExample = tZonaExample;
	}

	
	public TParametroManager gettParametroManager() {
		return tParametroManager;
	}

	
	public void settParametroManager(TParametroManager tParametroManager) {
		this.tParametroManager = tParametroManager;
	}

	
	public TDespachoManager gettDespachoManager() {
		return tDespachoManager;
	}

	
	public void settDespachoManager(TDespachoManager tDespachoManager) {
		this.tDespachoManager = tDespachoManager;
	}

	
	public DetdespachoManager getDetdespachoManager() {
		return detdespachoManager;
	}

	
	public void setDetdespachoManager(DetdespachoManager detdespachoManager) {
		this.detdespachoManager = detdespachoManager;
	}

	
	public TCargoManager gettCargoManager() {
		return tCargoManager;
	}

	
	public void settCargoManager(TCargoManager tCargoManager) {
		this.tCargoManager = tCargoManager;
	}

	
	public TCargoDespachoManager gettCargoDespachoManager() {
		return tCargoDespachoManager;
	}

	
	public void settCargoDespachoManager(TCargoDespachoManager tCargoDespachoManager) {
		this.tCargoDespachoManager = tCargoDespachoManager;
	}

	
	public TZonaManager gettZonaManager() {
		return tZonaManager;
	}

	
	public void settZonaManager(TZonaManager tZonaManager) {
		this.tZonaManager = tZonaManager;
	}

	
	public Map<String, Integer> getMpZona() {
		return mpZona;
	}

	
	public void setMpZona(Map<String, Integer> mpZona) {
		this.mpZona = mpZona;
	}

	
	public Map<String, Integer> getMpCargo() {
		return mpCargo;
	}

	
	public void setMpCargo(Map<String, Integer> mpCargo) {
		this.mpCargo = mpCargo;
	}

	
	public Map<String, Integer> getMpDespacho() {
		return mpDespacho;
	}

	
	public void setMpDespacho(Map<String, Integer> mpDespacho) {
		this.mpDespacho = mpDespacho;
	}

	
	public Map<String, Integer> getMpEstadoCargoDespacho() {
		return mpEstadoCargoDespacho;
	}

	
	public void setMpEstadoCargoDespacho(Map<String, Integer> mpEstadoCargoDespacho) {
		this.mpEstadoCargoDespacho = mpEstadoCargoDespacho;
	}

	
	public List<TParametro> getLstParametro() {
		return lstParametro;
	}

	
	public void setLstParametro(List<TParametro> lstParametro) {
		this.lstParametro = lstParametro;
	}

	
	public List<TZona> getLstZona() {
		return lstZona;
	}

	
	public void setLstZona(List<TZona> lstZona) {
		this.lstZona = lstZona;
	}

	
	public List<TCargo> getLstCargo() {
		return lstCargo;
	}

	
	public void setLstCargo(List<TCargo> lstCargo) {
		this.lstCargo = lstCargo;
	}

	
	public List<TDespacho> getLstDespacho() {
		return lstDespacho;
	}

	
	public void setLstDespacho(List<TDespacho> lstDespacho) {
		this.lstDespacho = lstDespacho;
	}

	
	public List<String> getLstDespachos() {
		return lstDespachos;
	}

	
	public void setLstDespachos(List<String> lstDespachos) {
		this.lstDespachos = lstDespachos;
	}

	
	public List<String> getLstCargos() {
		return lstCargos;
	}

	
	public void setLstCargos(List<String> lstCargos) {
		this.lstCargos = lstCargos;
	}

	
	public Constantes getConstantes() {
		return constantes;
	}

	
	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}
}
