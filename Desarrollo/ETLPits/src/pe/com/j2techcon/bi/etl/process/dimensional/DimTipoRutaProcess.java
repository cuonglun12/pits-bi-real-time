package pe.com.j2techcon.bi.etl.process.dimensional;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import pe.com.j2techcon.bi.etl.logic.dimensional.DimTipoRutaManager;
import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoRuta;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTipoRutaExample;
import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;


public class DimTipoRutaProcess {
	
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
	
	private String stateRecordDimensional;
	private String stateRecordGeneric;
	
	private TParametro tParametro;
	private TParametroExample tParametroExample;
	
	private DimTipoRuta dimTipoRuta;
	private DimTipoRutaExample dimTipoRutaExample;
	
	private TParametroManager tParametroManager; 
	private DimTipoRutaManager dimTipoRutaManager;
	
	private Constantes constantes;

	static Logger log = Logger.getLogger(DimTipoRutaProcess.class);
	
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

	public DimTipoRuta getDimTipoRuta() {
		return dimTipoRuta;
	}

	public void setDimTipoRuta(DimTipoRuta dimTipoRuta) {
		this.dimTipoRuta = dimTipoRuta;
	}

	public DimTipoRutaExample getDimTipoRutaExample() {
		return dimTipoRutaExample;
	}

	public void setDimTipoRutaExample(DimTipoRutaExample dimTipoRutaExample) {
		this.dimTipoRutaExample = dimTipoRutaExample;
	}

	public TParametroManager gettParametroManager() {
		return tParametroManager;
	}

	public void settParametroManager(TParametroManager tParametroManager) {
		this.tParametroManager = tParametroManager;
	}

	public DimTipoRutaManager getDimTipoRutaManager() {
		return dimTipoRutaManager;
	}

	public void setDimTipoRutaManager(DimTipoRutaManager dimTipoRutaManager) {
		this.dimTipoRutaManager = dimTipoRutaManager;
	}

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public DimTipoRutaProcess(BeanFactory factory, int sizePage,
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

		tParametroManager = factory.getBean("tParametroManager", TParametroManager.class);
		dimTipoRutaManager = factory.getBean("dimTipoRutaManager", DimTipoRutaManager.class);
		
		tParametro = new TParametro();
		tParametroExample = new TParametroExample();
		
		dimTipoRuta = new DimTipoRuta();
		dimTipoRutaExample = new DimTipoRutaExample();

		int offset = 0;
		
		while(true) {
			
			tParametroExample.clear();

			tParametroExample.createCriteria().andFecNumCamGreaterThanOrEqualTo(dateTimeFrom);
			tParametroExample.createCriteria().andFecNumCamLessThan(dateTimeUntil);	
			
			tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeTipoRuta());
			tParametroExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			List<TParametro> lstParametro = tParametroManager.selectByExample(tParametroExample);
			if(lstParametro.size()>0){
				for (Iterator<TParametro> iterator = lstParametro.iterator(); iterator.hasNext();) {
					tParametro = iterator.next();
					dimTipoRuta.clear();
					processRecordParametro();
				}
				offset = offset + constantes.getSizePage();
			}else{
				
				lstParametro.clear();
				
				tParametro.clear();
				tParametroExample.clear();
				
				dimTipoRuta.clear();
				dimTipoRutaExample.clear();
				
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
	
	public void processRecordParametro()throws Exception{
		
		completeFieldTipoRuta();
		
		if(typeProcess.equals(constantes.getTypeProcessSimple())){
			if(tParametro.getCodIndCam().equals(constantes.getStateRecordNew())){
				if(insertRecordDimensionalTipoRuta()> constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}else{
				if(updateRecordDimensionalTipoRuta() > constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}else{
			if(updateRecordDimensionalTipoRuta() > constantes.getResultTransactionNoResult()){
				stateRecordGeneric = constantes.getStateRecordProcessed();
				recordProcessed = recordProcessed + 1; 
			}else{
				if(insertRecordDimensionalTipoRuta() > constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1;
				}else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}
		
		updateRecordGenericParametro(stateRecordGeneric);
	}
	
	public void completeFieldTipoRuta()throws Exception{
		dimTipoRuta.setTipoRutaKey(tParametro.getParamId());
		dimTipoRuta.setTipoRutaCod(tParametro.getParamCod());
		dimTipoRuta.setTipoRutaDesc(tParametro.getParamDes());
		dimTipoRuta.setProcId(process);
	}
	
	public int insertRecordDimensionalTipoRuta()throws Exception{
		try{
			resultTransaction = dimTipoRutaManager.insertSelective(dimTipoRuta);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int updateRecordDimensionalTipoRuta()throws Exception{
		try{
			resultTransaction = dimTipoRutaManager.updateByPrimaryKeySelective(dimTipoRuta);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int deleteRecordDimensionalTipoRuta()throws Exception{
		try{
			resultTransaction = dimTipoRutaManager.deleteByPrimaryKey(dimTipoRuta.getTipoRutaKey());
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction; 
	}
	
	public void updateRecordGenericParametro(String statusRecord)throws Exception{
		int idParametro = tParametro.getParamId();
		tParametro.clear();
		tParametro.setParamId(idParametro);
		tParametro.setCodIndCam(statusRecord);
		tParametro.setProcId(process);
		tParametroManager.updateByPrimaryKeySelective(tParametro);
	}
}
