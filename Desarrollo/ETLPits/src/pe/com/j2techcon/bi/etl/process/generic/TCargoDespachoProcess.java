package pe.com.j2techcon.bi.etl.process.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.domain.generic.TCargo;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoDespacho;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoDespachoExample;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoExample;
import pe.com.j2techcon.bi.etl.domain.generic.TDespacho;
import pe.com.j2techcon.bi.etl.domain.generic.TDespachoExample;
import pe.com.j2techcon.bi.etl.domain.generic.TZona;
import pe.com.j2techcon.bi.etl.domain.generic.TZonaExample;
import pe.com.j2techcon.bi.etl.domain.origen.Detdespacho;
import pe.com.j2techcon.bi.etl.domain.origen.DetdespachoExample;
import pe.com.j2techcon.bi.etl.logic.generic.TCargoDespachoManager;
import pe.com.j2techcon.bi.etl.logic.generic.TCargoManager;
import pe.com.j2techcon.bi.etl.logic.generic.TDespachoManager;
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
	
	private TDespachoManager tDespachoManager;
	private DetdespachoManager detdespachoManager;
	private TCargoManager tCargoManager;
	private TCargoDespachoManager tCargoDespachoManager;
	private TZonaManager tZonaManager;

	private List<TZona> lstZona;
	private List<TCargo> lstCargo;
	private List<TDespacho> lstDespacho;

	private Constantes constantes;

	static Logger log = Logger.getLogger(TCargoDespachoProcess.class);
	
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

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public List<TDespacho> getLstDespacho() {
		return lstDespacho;
	}

	public void setLstDespacho(List<TDespacho> lstDespacho) {
		this.lstDespacho = lstDespacho;
	}

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
		
		lstZona = new ArrayList<TZona>();
		lstCargo = new ArrayList<TCargo>();
		lstDespacho = new ArrayList<TDespacho>();
		
		int offset = 0;
		
		while (true) {

			detdespachoExample.clear();
			detdespachoExample.createCriteria().andBiFecNumCamGreaterThanOrEqualTo(Util.getDateTimeLongAsDate(dateTimeFrom));
			detdespachoExample.createCriteria().andBiFecNumCamLessThan(Util.getDateTimeLongAsDate(dateTimeUntil));
			detdespachoExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			
			List<Detdespacho> lstDetDespacho = detdespachoManager.selectByExample(detdespachoExample);

			if (lstDetDespacho.size() > 0) {
				for (Iterator<Detdespacho> iterator = lstDetDespacho.iterator(); iterator.hasNext();) {
					detdespacho = iterator.next();
					tCargoDespacho.clear();
					processRecordCargoDespacho();
				}
				offset = offset + constantes.getSizePage();
			} else {

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

				lstZona.clear();
				lstCargo.clear();
				lstDespacho.clear();

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

	public void processRecordCargoDespacho() throws Exception{
		
		completeFieldCargoDespacho();
		//Identificamos si el detalle corresponde a una orden del negocio de mensajeria local
		if(tCargoDespacho.getDespId() != 0){
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

		//Id del Despacho
		tCargoDespacho.setDespId(getDespId(detdespacho.getSerieguia(), detdespacho.getNroguia()));
		
		//Identificamos si el detalle corresponde a un despacho
		if(tCargoDespacho.getDespId() != 0){
			
			//Id del Cargo
			tCargoExample.clear();
			tCargoExample.createCriteria().andOrdCodTipDocEqualTo(constantes.getParamSerialTipoDocumentoTrabajoNoDefinido());
			tCargoExample.createCriteria().andOrdSerieDocEqualTo(detdespacho.getSerie());
			tCargoExample.createCriteria().andOrdNumDocEqualTo(detdespacho.getOrden());
			tCargoExample.createCriteria().andCargCorrEqualTo(Integer.parseInt(detdespacho.getCorrelativo()));
			lstCargo = tCargoManager.selectByExample(tCargoExample);
			if(lstCargo.size()>0){
				tCargoDespacho.setCargId(lstCargo.get(0).getCargId());
			}
			
			//Identificacion funcional
			tCargoDespacho.setDespCodTipDoc(constantes.getParamSerialTipoDocumentoTrabajoGuia());
			tCargoDespacho.setDespSerieDoc(detdespacho.getSerieguia());
			tCargoDespacho.setDespNumeroDoc(detdespacho.getNroguia());
			tCargoDespacho.setOrdCodTipDoc(constantes.getParamSerialTipoDocumentoTrabajoNoDefinido());
			tCargoDespacho.setOrdSerieDoc(detdespacho.getSerie());
			tCargoDespacho.setOrdNumDoc(detdespacho.getOrden());
			tCargoDespacho.setCargCorr(Integer.parseInt(detdespacho.getCorrelativo()));
			
			//Zona
			if(detdespacho.getCodzona() != null && detdespacho.getCodzona().length()>0){
				tZonaExample.clear();
				tZonaExample.createCriteria().andZonCodEqualTo(detdespacho.getCodzona());
				lstZona = tZonaManager.selectByExample(tZonaExample);
				if(lstZona.size()>0){
					tCargoDespacho.setZonId(lstZona.get(0).getZonId());
				}
			}
			
			//Motivo: Valor por defecto
			tCargoDespacho.setCarDespCodMov(constantes.getParamSerialMotivoCargoDespachoNoDefinido());
			
			//Verificacion: Valor por defecto
			tCargoDespacho.setCarDespCodVer(constantes.getParamSerialEstadoCargoDespachoVerificacionNoDefinido());
			
			//Datos del destinatario
			tCargoDespacho.setCarDespDir(constantes.getValueStringDefault());
			tCargoDespacho.setCarDespRef(constantes.getValueStringDefault());
			
			//Fechas
			tCargoDespacho.setCarDespFecSal(detdespacho.getFecasignado());
			//tCargoDespacho.setCarDespFecRetPro(detdespacho.getFecRecep());
			tCargoDespacho.setCarDespFecRetRea(detdespacho.getFecRecep());
			//tCargoDespacho.setCarDespFecVer();
			
			//Estado
			if(constantes.getParamCodeEstadoCargoDespachoDigitado().equals(detdespacho.getCodestado())){
				tCargoDespacho.setCarDespCodEst(constantes.getParamSerialEstadoCargoDespachoDigitado());
			}else if(constantes.getParamCodeEstadoCargoDespachoRuta().equals(detdespacho.getCodestado())){
				tCargoDespacho.setCarDespCodEst(constantes.getParamSerialEstadoCargoDespachoRuta());
			}else if(constantes.getParamCodeEstadoCargoDespachoEntregado().equals(detdespacho.getCodestado())){
				tCargoDespacho.setCarDespCodEst(constantes.getParamSerialEstadoCargoDespachoEntregado());
			}else if(constantes.getParamCodeEstadoCargoDespachoMotivado().equals(detdespacho.getCodestado())){
				tCargoDespacho.setCarDespCodEst(constantes.getParamSerialEstadoCargoDespachoMotivado());
			}else if(constantes.getParamCodeEstadoCargoDespachoReenviado().equals(detdespacho.getCodestado())){
				tCargoDespacho.setCarDespCodEst(constantes.getParamSerialEstadoCargoDespachoReenviado());
			}else if(constantes.getParamCodeEstadoCargoDespachoFueraZona().equals(detdespacho.getCodestado())){
				tCargoDespacho.setCarDespCodEst(constantes.getParamSerialEstadoCargoDespachoFueraZona());
			}else if(constantes.getParamCodeEstadoCargoDespachoPerdido().equals(detdespacho.getCodestado())){
				tCargoDespacho.setCarDespCodEst(constantes.getParamSerialEstadoCargoDespachoPerdido());
			}else if(constantes.getParamCodeEstadoCargoDespachoAnulado().equals(detdespacho.getCodestado())){
				tCargoDespacho.setCarDespCodEst(constantes.getParamSerialEstadoCargoDespachoAnulado());
			}else if(constantes.getParamCodeEstadoCargoDespachoNoDistribuido().equals(detdespacho.getCodestado())){
				tCargoDespacho.setCarDespCodEst(constantes.getParamSerialEstadoCargoDespachoNoDistribuido());
			}else if(constantes.getParamCodeEstadoCargoDespachoRetenido().equals(detdespacho.getCodestado())){
				tCargoDespacho.setCarDespCodEst(constantes.getParamSerialEstadoCargoDespachoRetenido());
			}else if(constantes.getParamCodeEstadoCargoDespachoSinFisico().equals(detdespacho.getCodestado())){
				tCargoDespacho.setCarDespCodEst(constantes.getParamSerialEstadoCargoDespachoSinFisico());
			}else if(constantes.getParamCodeEstadoCargoDespachoProvincia().equals(detdespacho.getCodestado())){
				tCargoDespacho.setCarDespCodEst(constantes.getParamSerialEstadoCargoDespachoProvincia());
			}else if(constantes.getParamCodeEstadoCargoDespachoSupervision().equals(detdespacho.getCodestado())){
				tCargoDespacho.setCarDespCodEst(constantes.getParamSerialEstadoCargoDespachoSupervision());
			}else if(constantes.getParamCodeEstadoCargoDespachoRobo().equals(detdespacho.getCodestado())){
				tCargoDespacho.setCarDespCodEst(constantes.getParamSerialEstadoCargoDespachoRobo());
			}else{
				tCargoDespacho.setCarDespCodEst(constantes.getParamSerialEstadoCargoDespachoNoDefinido());
			}
			
			//Campos de control
			tCargoDespacho.setFecNumCam(Util.getCurrentDateTimeAsLong());
			if(constantes.getStateRecordNew().equals(detdespacho.getBiCodIndCam())){
				tCargoDespacho.setCodIndCam(constantes.getStateRecordNew());
			}else{
				tCargoDespacho.setCodIndCam(constantes.getStateRecordProcessed());
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
			tCargoDespachoExample.createCriteria().andDespCodTipDocEqualTo(constantes.getParamSerialTipoDocumentoTrabajoGuia());
			tCargoDespachoExample.createCriteria().andDespSerieDocEqualTo(tCargoDespacho.getDespSerieDoc());
			tCargoDespachoExample.createCriteria().andDespNumeroDocEqualTo(tCargoDespacho.getDespNumeroDoc());
			tCargoDespachoExample.createCriteria().andOrdCodTipDocEqualTo(constantes.getParamSerialTipoDocumentoTrabajoNoDefinido());
			tCargoDespachoExample.createCriteria().andOrdSerieDocEqualTo(tCargoDespacho.getOrdSerieDoc());
			tCargoDespachoExample.createCriteria().andOrdNumDocEqualTo(tCargoDespacho.getOrdNumDoc());
			tCargoDespachoExample.createCriteria().andCargCorrEqualTo(tCargoDespacho.getCargCorr());
			resultTransaction = tCargoDespachoManager.updateByExampleSelective(tCargoDespacho, tCargoDespachoExample);	
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int deleteRecordGenericCargoDespacho() throws Exception{
		try {
			tCargoDespachoExample.clear();
			tCargoDespachoExample.createCriteria().andDespCodTipDocEqualTo(constantes.getParamSerialTipoDocumentoTrabajoGuia());
			tCargoDespachoExample.createCriteria().andDespSerieDocEqualTo(tCargoDespacho.getDespSerieDoc());
			tCargoDespachoExample.createCriteria().andDespNumeroDocEqualTo(tCargoDespacho.getDespNumeroDoc());
			tCargoDespachoExample.createCriteria().andOrdCodTipDocEqualTo(constantes.getParamSerialTipoDocumentoTrabajoNoDefinido());
			tCargoDespachoExample.createCriteria().andOrdSerieDocEqualTo(tCargoDespacho.getOrdSerieDoc());
			tCargoDespachoExample.createCriteria().andOrdNumDocEqualTo(tCargoDespacho.getOrdNumDoc());
			tCargoDespachoExample.createCriteria().andCargCorrEqualTo(tCargoDespacho.getCargCorr());
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
		detdespachoManager.updateByPrimaryKeySelective(detdespacho);
	}
	
	public int getDespId(String serieGuia, String numeroGuia)throws Exception{
		int despId = 0;
		if(serieGuia.equals(tDespacho.getDespSerieDoc()) && numeroGuia.equals(tDespacho.getDespNumeroDoc())){
			despId = tDespacho.getDespId();
		}else{
			tDespachoExample.clear();
			tDespachoExample.createCriteria().andDespCodTipDocEqualTo(constantes.getParamSerialTipoDocumentoTrabajoGuia());
			tDespachoExample.createCriteria().andDespSerieDocEqualTo(serieGuia);
			tDespachoExample.createCriteria().andDespNumeroDocEqualTo(numeroGuia);
			lstDespacho = tDespachoManager.selectByExample(tDespachoExample);
			if(lstDespacho.size()>0){
				tDespacho = lstDespacho.get(0);
				despId = tDespacho.getDespId();
			}
		}
		
		return despId;
	}

}
