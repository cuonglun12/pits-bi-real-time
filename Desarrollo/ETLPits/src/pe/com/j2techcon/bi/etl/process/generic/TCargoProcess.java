package pe.com.j2techcon.bi.etl.process.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.domain.generic.TCargo;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoExample;
import pe.com.j2techcon.bi.etl.domain.generic.TOrden;
import pe.com.j2techcon.bi.etl.domain.generic.TOrdenExample;
import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;
import pe.com.j2techcon.bi.etl.domain.generic.TProducto;
import pe.com.j2techcon.bi.etl.domain.generic.TProductoExample;
import pe.com.j2techcon.bi.etl.domain.generic.TZona;
import pe.com.j2techcon.bi.etl.domain.generic.TZonaExample;
import pe.com.j2techcon.bi.etl.domain.origen.Detordenes;
import pe.com.j2techcon.bi.etl.domain.origen.DetordenesExample;
import pe.com.j2techcon.bi.etl.logic.generic.TCargoManager;
import pe.com.j2techcon.bi.etl.logic.generic.TOrdenManager;
import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;
import pe.com.j2techcon.bi.etl.logic.generic.TProductoManager;
import pe.com.j2techcon.bi.etl.logic.generic.TZonaManager;
import pe.com.j2techcon.bi.etl.logic.origen.DetordenesManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.util.Util;

public class TCargoProcess {

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
	
	private TProducto tProducto;
	private TProductoExample tProductoExample;
	
	private TOrden tOrden;
	private TOrdenExample tOrdenExample;
	
	private TZona tZona;
	private TZonaExample tZonaExample;
	
	private Detordenes detordenes;
	private DetordenesExample detordenesExample;
	
	private TCargo tCargo;
	private TCargoExample tCargoExample;
	
	private TParametroManager tParametroManager;
	private TProductoManager tProductoManager;
	private TOrdenManager tOrdenManager;
	private DetordenesManager detordenesManager;
	private TCargoManager tCargoManager;
	private TZonaManager tZonaManager;
	
	private List<TParametro> lstParametro;
	private List<TProducto> lstProducto;
	private List<String> lstLista;
	private List<TOrden> lstOrden;
	private List<TZona> lstZona;
	
	private Constantes constantes;

	static Logger log = Logger.getLogger(TCargoProcess.class);
	
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

	public Detordenes getDetordenes() {
		return detordenes;
	}

	public void setDetordenes(Detordenes detordenes) {
		this.detordenes = detordenes;
	}

	public DetordenesExample getDetordenesExample() {
		return detordenesExample;
	}

	public void setDetordenesExample(DetordenesExample detordenesExample) {
		this.detordenesExample = detordenesExample;
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

	public TParametroManager gettParametroManager() {
		return tParametroManager;
	}

	public void settParametroManager(TParametroManager tParametroManager) {
		this.tParametroManager = tParametroManager;
	}

	public TProductoManager gettProductoManager() {
		return tProductoManager;
	}

	public void settProductoManager(TProductoManager tProductoManager) {
		this.tProductoManager = tProductoManager;
	}

	public TOrdenManager gettOrdenManager() {
		return tOrdenManager;
	}

	public void settOrdenManager(TOrdenManager tOrdenManager) {
		this.tOrdenManager = tOrdenManager;
	}

	public DetordenesManager getDetordenesManager() {
		return detordenesManager;
	}

	public void setDetordenesManager(DetordenesManager detordenesManager) {
		this.detordenesManager = detordenesManager;
	}

	public TCargoManager gettCargoManager() {
		return tCargoManager;
	}

	public void settCargoManager(TCargoManager tCargoManager) {
		this.tCargoManager = tCargoManager;
	}

	public TZonaManager gettZonaManager() {
		return tZonaManager;
	}

	public void settZonaManager(TZonaManager tZonaManager) {
		this.tZonaManager = tZonaManager;
	}

	public List<TParametro> getLstParametro() {
		return lstParametro;
	}

	public void setLstParametro(List<TParametro> lstParametro) {
		this.lstParametro = lstParametro;
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

	public List<TOrden> getLstOrden() {
		return lstOrden;
	}

	public void setLstOrden(List<TOrden> lstOrden) {
		this.lstOrden = lstOrden;
	}

	public List<TZona> getLstZona() {
		return lstZona;
	}

	public void setLstZona(List<TZona> lstZona) {
		this.lstZona = lstZona;
	}

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public TCargoProcess(BeanFactory factory, int sizePage, long dateTimeFrom,
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
		
		tProductoManager = factory.getBean("tProductoManager", TProductoManager.class);
		tOrdenManager = factory.getBean("tOrdenManager", TOrdenManager.class);
		tParametroManager = factory.getBean("tParametroManager", TParametroManager.class);
		detordenesManager = factory.getBean("detordenesManager", DetordenesManager.class);
		tCargoManager = factory.getBean("tCargoManager", TCargoManager.class);
		tZonaManager = factory.getBean("tZonaManager", TZonaManager.class);
		
		tParametro = new TParametro();
		tParametroExample = new TParametroExample();
		
		tProducto = new TProducto();
		tProductoExample = new TProductoExample();
		
		tOrden = new TOrden();
		tOrdenExample = new TOrdenExample();
		
		tZona = new TZona();
		tZonaExample = new TZonaExample();
		
		detordenes = new Detordenes();
		detordenesExample = new DetordenesExample();
		
		tCargo = new TCargo();
		tCargoExample = new TCargoExample();
		
		lstParametro = new ArrayList<TParametro>();
		lstProducto = new ArrayList<TProducto>();
		lstLista = new ArrayList<String>();
		lstOrden = new ArrayList<TOrden>();
		lstZona = new ArrayList<TZona>();
		
		int offset = 0;
		
		while (true) {

			detordenesExample.clear();
			detordenesExample.createCriteria().andBiFecNumCamGreaterThanOrEqualTo(Util.getDateTimeLongAsDate(dateTimeFrom));
			detordenesExample.createCriteria().andBiFecNumCamLessThan(Util.getDateTimeLongAsDate(dateTimeUntil));
			detordenesExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			
			List<Detordenes> lstCargo = detordenesManager.selectByExample(detordenesExample);

			if (lstCargo.size() > 0) {
				for (Iterator<Detordenes> iterator = lstCargo.iterator(); iterator.hasNext();) {
					detordenes = iterator.next();
					tCargo.clear();
					processRecordCargo();
				}
				offset = offset + constantes.getSizePage();
			} else {
				tParametro.clear();
				tParametroExample.clear();

				tProducto.clear();
				tProductoExample.clear();

				tOrden.clear();
				tOrdenExample.clear();

				tZona.clear();
				tZonaExample.clear();

				detordenes.clear();
				detordenesExample.clear();

				tCargo.clear();
				tCargoExample.clear();

				lstParametro.clear();
				lstProducto.clear();
				lstLista.clear();
				lstOrden.clear();
				lstZona.clear();

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

	public void processRecordCargo() throws Exception{
		
		completeFieldCargo();
		//Identificamos si el detalle corresponde a una orden del negocio de mensajeria local
		if(tOrden.getOrdId() != 0){
			if(typeProcess.equals(constantes.getTypeProcessSimple())){
				if(tCargo.getCodIndCam().equals(constantes.getStateRecordNew())){
					if(insertRecordGenericCargo()> constantes.getResultTransactionNoResult()){
						stateRecordOrigen = constantes.getStateRecordProcessed();
						recordProcessed = recordProcessed + 1; 
					} else{
						stateRecordOrigen = constantes.getStateRecordInconsistent();
						recordRejected = recordRejected + 1;
					}
				}else{
					if(updateRecordGenericCargo() > constantes.getResultTransactionNoResult()){
						stateRecordOrigen = constantes.getStateRecordProcessed();
						recordProcessed = recordProcessed + 1; 
					} else{
						stateRecordOrigen = constantes.getStateRecordInconsistent();
						recordRejected = recordRejected + 1;
					}
				}
			}else{
				if(updateRecordGenericCargo() > constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				}else{
					if(insertRecordGenericCargo() > constantes.getResultTransactionNoResult()){
						stateRecordOrigen = constantes.getStateRecordProcessed();
						recordProcessed = recordProcessed + 1;
					}else{
						stateRecordOrigen = constantes.getStateRecordInconsistent();
						recordRejected = recordRejected + 1;
					}
				}
			}
			updateRecordOrigenCargo(stateRecordOrigen);
		}else{
			stateRecordOrigen = constantes.getStateRecordInconsistent();
			recordRejected = recordRejected + 1;
			updateRecordOrigenCargo(stateRecordOrigen);
		}
	}

	public void completeFieldCargo() throws Exception{

		//Identificamos si el detalle corresponde a una orden del negocio de mensajeria local
		//Id de la orden
		tCargo.setOrdId(getOrdId(detordenes.getSerie(), detordenes.getOrden()));
		
		if(tCargo.getOrdId() != 0){
			//Id de la orden
			tCargo.setOrdCodTipDoc(constantes.getParamSerialTipoDocumentoTrabajoNoDefinido());
			tCargo.setOrdSerieDoc(detordenes.getSerie());
			tCargo.setOrdNumDoc(detordenes.getOrden());
			
			//Correlativo
			tCargo.setCargCorr(Integer.parseInt(detordenes.getCorrelativo()));
			
			//Zona
			if(detordenes.getCodzona() != null && detordenes.getCodzona().length()>0){
				tZonaExample.clear();
				tZonaExample.createCriteria().andZonCodEqualTo(detordenes.getCodzona());
				lstZona = tZonaManager.selectByExample(tZonaExample);
				if(lstZona.size()>0){
					tCargo.setZonId(lstZona.get(0).getZonId());
				}
			}
			
			//Zona (new): Por defecto 0
			tCargo.setZonIdNew(0);
			
			//Motivo: Valor por defecto
			tCargo.setCargCodMov(constantes.getParamSerialMotivoCargoNoDefinido());
			
			//Tipo de ingreso
			if(constantes.getParamCodeTipoIngresoCargoDigitado().equals(detordenes.getTipoingreso())){
				tCargo.setCargCodTipIng(constantes.getParamSerialTipoIngresoCargoDigitado());
			}else if(constantes.getParamCodeTipoIngresoCargoDigitado().equals(detordenes.getTipoingreso())){
				tCargo.setCargCodTipIng(constantes.getParamSerialTipoIngresoCargoTransferido());
			}else{
				tCargo.setCargCodTipIng(constantes.getParamSerialTipoIngresoCargoNoDefinido());
			}
			
			//Fechas
			tCargo.setCargFecDes(detordenes.getFecDescargo());
			tCargo.setCargFecRec(detordenes.getFecrecepcion());
			
			//Destinatario
			tCargo.setCargDestinatario(detordenes.getDestinatario());
			
			//Direccion
			tCargo.setCargDir(detordenes.getDireccion());
			
			//Referencia
			tCargo.setCargRef(detordenes.getReferencia());
			
			//Nueva direccion
			tCargo.setCargNewDir(detordenes.getNuevadireccion());
			
			//Nueva referencia
			tCargo.setCargNewRef(detordenes.getNuevareferencia());
			
			//Estado
			if(constantes.getParamCodeEstadoCargoOrdenDigitado().equals(detordenes.getCodestado())){
				tCargo.setCargCodEst(constantes.getParamSerialEstadoCargoOrdenDigitado());
			} else if(constantes.getParamCodeEstadoCargoOrdenClasificado().equals(detordenes.getCodestado())){
				tCargo.setCargCodEst(constantes.getParamSerialEstadoCargoOrdenClasificado());
			} else if(constantes.getParamCodeEstadoCargoOrdenRuta().equals(detordenes.getCodestado())){
				tCargo.setCargCodEst(constantes.getParamSerialEstadoCargoOrdenRuta());
			} else if(constantes.getParamCodeEstadoCargoOrdenEntregado().equals(detordenes.getCodestado())){
				tCargo.setCargCodEst(constantes.getParamSerialEstadoCargoOrdenEntregado());
			} else if(constantes.getParamCodeEstadoCargoOrdenMotivado().equals(detordenes.getCodestado())){
				tCargo.setCargCodEst(constantes.getParamSerialEstadoCargoOrdenMotivado());
			} else if(constantes.getParamCodeEstadoCargoOrdenReenviado().equals(detordenes.getCodestado())){
				tCargo.setCargCodEst(constantes.getParamSerialEstadoCargoOrdenReenviado());
			} else if(constantes.getParamCodeEstadoCargoOrdenFueraZona().equals(detordenes.getCodestado())){
				tCargo.setCargCodEst(constantes.getParamSerialEstadoCargoOrdenFueraZona());
			} else if(constantes.getParamCodeEstadoCargoOrdenPerdido().equals(detordenes.getCodestado())){
				tCargo.setCargCodEst(constantes.getParamSerialEstadoCargoOrdenPerdido());
			} else if(constantes.getParamCodeEstadoCargoOrdenAnulado().equals(detordenes.getCodestado())){
				tCargo.setCargCodEst(constantes.getParamSerialEstadoCargoOrdenAnulado());
			} else if(constantes.getParamCodeEstadoCargoOrdenNoDistribuido().equals(detordenes.getCodestado())){
				tCargo.setCargCodEst(constantes.getParamSerialEstadoCargoOrdenNoDistribuido());
			} else if(constantes.getParamCodeEstadoCargoOrdenRetenido().equals(detordenes.getCodestado())){
				tCargo.setCargCodEst(constantes.getParamSerialEstadoCargoOrdenRetenido());
			} else if(constantes.getParamCodeEstadoCargoOrdenSinFisico().equals(detordenes.getCodestado())){
				tCargo.setCargCodEst(constantes.getParamSerialEstadoCargoOrdenSinFisico());
			} else if(constantes.getParamCodeEstadoCargoOrdenProvincia().equals(detordenes.getCodestado())){
				tCargo.setCargCodEst(constantes.getParamSerialEstadoCargoOrdenProvincia());
			} else if(constantes.getParamCodeEstadoCargoOrdenSupervision().equals(detordenes.getCodestado())){
				tCargo.setCargCodEst(constantes.getParamSerialEstadoCargoOrdenSupervision());
			} else if(constantes.getParamCodeEstadoCargoOrdenRobo().equals(detordenes.getCodestado())){
				tCargo.setCargCodEst(constantes.getParamSerialEstadoCargoOrdenRobo());
			} else if(constantes.getParamCodeEstadoCargoOrdenSiLlego().equals(detordenes.getCodestado())){
				tCargo.setCargCodEst(constantes.getParamSerialEstadoCargoOrdenSiLlego());
			} else if(constantes.getParamCodeEstadoCargoOrdenRecepcionado().equals(detordenes.getCodestado())){
				tCargo.setCargCodEst(constantes.getParamSerialEstadoCargoOrdenRecepcionado());
			} else {
				tCargo.setCargCodEst(constantes.getParamSerialEstadoCargoOrdenNoDefinido());
			}
			
			//Campos de control
			tCargo.setFecNumCam(Util.getCurrentDateTimeAsLong());
			if(constantes.getStateRecordNew().equals(detordenes.getBiCodIndCam())){
				tCargo.setCodIndCam(constantes.getStateRecordNew());
			}else{
				tCargo.setCodIndCam(constantes.getStateRecordProcessed());
			}
			tCargo.setProcId(process);
		}
	}

	public int insertRecordGenericCargo() throws Exception{
		try {
			resultTransaction = tCargoManager.insertSelective(tCargo);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int updateRecordGenericCargo() throws Exception{
		try {
			tCargoExample.clear();
			tCargoExample.createCriteria().andOrdCodTipDocEqualTo(constantes.getParamSerialTipoDocumentoTrabajoNoDefinido());
			tCargoExample.createCriteria().andOrdSerieDocEqualTo(tCargo.getOrdSerieDoc());
			tCargoExample.createCriteria().andOrdNumDocEqualTo(tCargo.getOrdNumDoc());
			tCargoExample.createCriteria().andCargCorrEqualTo(tCargo.getCargCorr());
			resultTransaction = tCargoManager.updateByExampleSelective(tCargo, tCargoExample);	
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int deleteRecordGenericCargo() throws Exception{
		try {
			tCargoExample.clear();
			tCargoExample.createCriteria().andOrdCodTipDocEqualTo(constantes.getParamSerialTipoDocumentoTrabajoNoDefinido());
			tCargoExample.createCriteria().andOrdSerieDocEqualTo(tCargo.getOrdSerieDoc());
			tCargoExample.createCriteria().andOrdNumDocEqualTo(tCargo.getOrdNumDoc());
			tCargoExample.createCriteria().andCargCorrEqualTo(tCargo.getCargCorr());
			resultTransaction = tCargoManager.deleteByExample(tCargoExample);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public void updateRecordOrigenCargo(String statusRecord) throws Exception{
		String serie = detordenes.getSerie();
		String orden = detordenes.getOrden();
		String correlativo = detordenes.getCorrelativo();
		detordenes.clear();
		detordenes.setSerie(serie);
		detordenes.setOrden(orden);
		detordenes.setCorrelativo(correlativo);
		detordenes.setBiCodIndCam(statusRecord);
		detordenesManager.updateByPrimaryKeySelective(detordenes);
	}
	
	public int getOrdId(String serie, String numero)throws Exception{
		int ordId = 0;
		if(serie.equals(tOrden.getOrdSerieDoc()) && numero.equals(tOrden.getOrdNumDoc())){
			ordId = tOrden.getOrdId();
		}else{
			tOrdenExample.clear();
			tOrdenExample.createCriteria().andOrdSerieDocEqualTo(serie);
			tOrdenExample.createCriteria().andOrdNumDocEqualTo(numero);
			lstOrden = tOrdenManager.selectByExample(tOrdenExample);
			if(lstOrden.size()>0){
				tOrden = lstOrden.get(0);
				ordId = tOrden.getOrdId();
			}
		}
		
		return ordId;
	}

}
