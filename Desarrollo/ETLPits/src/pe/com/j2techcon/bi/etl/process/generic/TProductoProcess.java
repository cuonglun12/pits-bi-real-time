package pe.com.j2techcon.bi.etl.process.generic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;
import pe.com.j2techcon.bi.etl.domain.generic.TProducto;
import pe.com.j2techcon.bi.etl.domain.generic.TProductoExample;
import pe.com.j2techcon.bi.etl.domain.origen.TProductos;
import pe.com.j2techcon.bi.etl.domain.origen.TProductosExample;
import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;
import pe.com.j2techcon.bi.etl.logic.generic.TProductoManager;
import pe.com.j2techcon.bi.etl.logic.origen.TProductosManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.util.Util;

public class TProductoProcess {

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
	
	private TProducto tProducto;
	private TProductoExample tProductoExample;
	
	private TProductos tProductos;
	private TProductosExample tProductosExample;
	
	private TParametro tParametro;
	private TParametroExample tParametroExample;
	
	private TProductoManager tProductoManager;
	private TProductosManager tProductosManager;
	private TParametroManager tParametroManager;
	
	private List<TParametro> lstParametro;
	
	private Map<String,Integer> mpTipoProducto;
	private Map<String,Integer> mpTipoAmbito;
	private Map<String,Integer> mpTipoNegocio;
	
	private Constantes constantes;
	
	static Logger log = Logger.getLogger(TProductoProcess.class);

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

	public TProductos gettProductos() {
		return tProductos;
	}

	public void settProductos(TProductos tProductos) {
		this.tProductos = tProductos;
	}

	public TProductosExample gettProductosExample() {
		return tProductosExample;
	}

	public void settProductosExample(TProductosExample tProductosExample) {
		this.tProductosExample = tProductosExample;
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

	public TProductoManager gettProductoManager() {
		return tProductoManager;
	}

	public void settProductoManager(TProductoManager tProductoManager) {
		this.tProductoManager = tProductoManager;
	}

	public TProductosManager gettProductosManager() {
		return tProductosManager;
	}

	public void settProductosManager(TProductosManager tProductosManager) {
		this.tProductosManager = tProductosManager;
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

	public Map<String, Integer> getMpTipoProducto() {
		return mpTipoProducto;
	}

	public void setMpTipoProducto(Map<String, Integer> mpTipoProducto) {
		this.mpTipoProducto = mpTipoProducto;
	}

	public Map<String, Integer> getMpTipoAmbito() {
		return mpTipoAmbito;
	}

	public void setMpTipoAmbito(Map<String, Integer> mpTipoAmbito) {
		this.mpTipoAmbito = mpTipoAmbito;
	}

	public Map<String, Integer> getMpTipoNegocio() {
		return mpTipoNegocio;
	}

	public void setMpTipoNegocio(Map<String, Integer> mpTipoNegocio) {
		this.mpTipoNegocio = mpTipoNegocio;
	}

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public TProductoProcess(BeanFactory factory, int sizePage,
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
		stateRecordOrigen = constantes.getStateRecordNew();
		stateRecordGeneric = constantes.getStateRecordNew();

	}

	public int startProcess() throws Exception{
		
		tProductoManager = factory.getBean("tProductoManager",TProductoManager.class);
		tProductosManager = factory.getBean("tProductosManager",TProductosManager.class);
		tParametroManager = factory.getBean("tParametroManager",TParametroManager.class);
		
		tProducto = new TProducto();
		tProductoExample = new TProductoExample();
		
		tProductos = new TProductos();
		tProductosExample = new TProductosExample();
		
		tParametro = new TParametro();
		tParametroExample = new TParametroExample();
		
		lstParametro = new ArrayList<TParametro>();
		
		mpTipoProducto = new HashMap<String, Integer>();
		tParametroExample.clear();
		tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeTipoProducto());
		lstParametro = tParametroManager.selectByExample(tParametroExample);
		for (Iterator<TParametro> iterator = lstParametro.iterator(); iterator.hasNext();) {
			tParametro = iterator.next();
			mpTipoProducto.put(tParametro.getParamCod(),tParametro.getParamId());
		}
		
		mpTipoAmbito = new HashMap<String, Integer>();
		tParametroExample.clear();
		tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeTipoAmbito());
		lstParametro = tParametroManager.selectByExample(tParametroExample);
		for (Iterator<TParametro> iterator = lstParametro.iterator(); iterator.hasNext();) {
			tParametro = iterator.next();
			mpTipoAmbito.put(tParametro.getParamCod(),tParametro.getParamId());
		}
		
		mpTipoNegocio = new HashMap<String, Integer>();
		tParametroExample.clear();
		tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeTipoNegocio());
		lstParametro = tParametroManager.selectByExample(tParametroExample);
		for (Iterator<TParametro> iterator = lstParametro.iterator(); iterator.hasNext();) {
			tParametro = iterator.next();
			mpTipoNegocio.put(tParametro.getParamCod(),tParametro.getParamId());
		}
		
		List<String> lstStateRecord = new ArrayList<String>();
		lstStateRecord.add(constantes.getStateRecordNew());
		lstStateRecord.add(constantes.getStateRecordUpdated());

		//int offset = 0;
		
		List<TProductos> lstProductos = new ArrayList<TProductos>();
		
		while (true) {

			tProductosExample.clear();
			
			tProductosExample.createCriteria().andBiFecNumCamGreaterThanOrEqualTo(Util.getDateTimeLongAsDate(dateTimeFrom)).andBiFecNumCamLessThan(Util.getDateTimeLongAsDate(dateTimeUntil)).andBiCodIndCamIn(lstStateRecord);
			//tProductosExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			tProductosExample.setPaginationByClause(" limit " + constantes.getSizePage());
			
			lstProductos = tProductosManager.selectByExample(tProductosExample);

			if (lstProductos.size() > 0) {
				for (Iterator<TProductos> iterator = lstProductos.iterator(); iterator.hasNext();) {
					tProductos = iterator.next();
					tProducto.clear();
					processRecordProducto();
				}
				lstProductos.clear();
				//offset = offset + constantes.getSizePage();
			} else {
				
				lstStateRecord.clear();
				
				tProductos.clear();
				tProductosExample.clear();

				tProducto.clear();
				tProductoExample.clear();
				
				tParametro.clear();
				tParametroExample.clear();
				
				lstProductos.clear();
				lstParametro.clear();
				
				mpTipoAmbito.clear();
				mpTipoNegocio.clear();
				mpTipoProducto.clear();
				
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

	public void processRecordProducto() throws Exception{
		
		completeFieldProducto();
		
		if(typeProcess.equals(constantes.getTypeProcessSimple())){
			if(tProducto.getCodIndCam().equals(constantes.getStateRecordNew())){
				if(insertRecordGenericProducto()> constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordOrigen = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}else{
				if(updateRecordGenericProducto() > constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordOrigen = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}else{
			if(updateRecordGenericProducto() > constantes.getResultTransactionNoResult()){
				stateRecordOrigen = constantes.getStateRecordProcessed();
				recordProcessed = recordProcessed + 1; 
			}else{
				if(insertRecordGenericProducto() > constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1;
				}else{
					stateRecordOrigen = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}
		
		updateRecordOrigenProducto(stateRecordOrigen);
		
	}

	public void completeFieldProducto() throws Exception{

		tProducto.setProdCodTip(mpTipoProducto.get(tProductos.getTipoproducto()));
		if(tProducto.getProdCodTip() == null){
			tProducto.setProdCodTip(constantes.getParamSerialTipoProductoNoDefinido());
		}
		
		tProducto.setProdCodAmb(mpTipoAmbito.get(tProductos.getCodambito()));
		if(tProducto.getProdCodAmb() == null){
			tProducto.setProdCodAmb(constantes.getParamSerialTipoAmbitoNoDefinido());
		}
		
		tProducto.setProdCodNeg(mpTipoNegocio.get(tProductos.getCodnegocio()));
		if(tProducto.getProdCodNeg() == null){
			tProducto.setProdCodNeg(constantes.getParamSerialTipoNegocioNoDefinido());
		}

		tProducto.setProdCod(tProductos.getCodproducto());
		tProducto.setProdDes(tProductos.getProducto());
		tProducto.setProdPre(new BigDecimal(0));
		
		tProducto.setFecNumCam(Util.getCurrentDateTimeAsLong());
		if(constantes.getStateRecordNew().equals(tProductos.getBiCodIndCam())){
			tProducto.setCodIndCam(constantes.getStateRecordNew());
		}else{
			tProducto.setCodIndCam(constantes.getStateRecordUpdated());
		}
		tProducto.setProcId(process);

	}

	public int insertRecordGenericProducto() throws Exception{
		try {
			resultTransaction = tProductoManager.insertSelective(tProducto);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int updateRecordGenericProducto() throws Exception{
		try {
			tProductoExample.clear();
			tProductoExample.createCriteria().andProdCodEqualTo(tProducto.getProdCod());
			tProducto.setProdCod(null);
			resultTransaction = tProductoManager.updateByExampleSelective(tProducto, tProductoExample);	
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int deleteRecordGenericProducto() throws Exception{
		try {
			tProductoExample.clear();
			tProductoExample.createCriteria().andProdCodEqualTo(tProducto.getProdCod());	
			resultTransaction = tProductoManager.deleteByExample(tProductoExample);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public void updateRecordOrigenProducto(String statusRecord) throws Exception{
		String idProducto = tProductos.getCodproducto();
		tProductos.clear();
		tProductos.setCodproducto(idProducto);
		tProductos.setBiCodIndCam(statusRecord);
		//tProductos.setBiFecNumCam(Util.getCurrentDateTime());
		tProductosManager.updateByPrimaryKeySelective(tProductos);
	}

}
