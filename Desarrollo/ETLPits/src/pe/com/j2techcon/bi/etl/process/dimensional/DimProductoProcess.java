package pe.com.j2techcon.bi.etl.process.dimensional;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.logic.dimensional.DimProductoManager;
import pe.com.j2techcon.bi.etl.logic.generic.TProductoManager;
import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimProducto;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimProductoExample;
import pe.com.j2techcon.bi.etl.domain.generic.TProducto;
import pe.com.j2techcon.bi.etl.domain.generic.TProductoExample;
import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;


public class DimProductoProcess {
	
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
	
	private TProducto tProducto;
	private TProductoExample tProductoExample;
	
	private TParametro tParametro;
	private TParametroExample tParametroExample;
	
	private DimProducto dimProducto;
	private DimProductoExample dimProductoExample;
	
	private TProductoManager tProductoManager;
	private TParametroManager tParametroManager; 
	private DimProductoManager dimProductoManager;
	
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

	public DimProducto getDimProducto() {
		return dimProducto;
	}

	public void setDimProducto(DimProducto dimProducto) {
		this.dimProducto = dimProducto;
	}

	public DimProductoExample getDimProductoExample() {
		return dimProductoExample;
	}

	public void setDimProductoExample(DimProductoExample dimProductoExample) {
		this.dimProductoExample = dimProductoExample;
	}

	public TProductoManager gettProductoManager() {
		return tProductoManager;
	}

	public void settProductoManager(TProductoManager tProductoManager) {
		this.tProductoManager = tProductoManager;
	}

	public TParametroManager gettParametroManager() {
		return tParametroManager;
	}

	public void settParametroManager(TParametroManager tParametroManager) {
		this.tParametroManager = tParametroManager;
	}

	public DimProductoManager getDimProductoManager() {
		return dimProductoManager;
	}

	public void setDimProductoManager(DimProductoManager dimProductoManager) {
		this.dimProductoManager = dimProductoManager;
	}

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public DimProductoProcess(BeanFactory factory, int sizePage,
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

		tProductoManager = factory.getBean("tProductoManager", TProductoManager.class);
		tParametroManager = factory.getBean("tParametroManager", TParametroManager.class);
		dimProductoManager = factory.getBean("dimProductoManager", DimProductoManager.class);
		
		constantes = factory.getBean("constantes", Constantes.class);

		int offset = 0;
		
		while(true) {
			
			tProductoExample.clear();

			tProductoExample.createCriteria().andFecNumCamGreaterThanOrEqualTo(dateTimeFrom);
			tProductoExample.createCriteria().andFecNumCamLessThan(dateTimeUntil);			
			
			tProductoExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			List<TProducto> lstProducto = tProductoManager.selectByExample(tProductoExample);
			if(lstProducto.size()>0){
				for (Iterator<TProducto> iterator = lstProducto.iterator(); iterator.hasNext();) {
					tProducto = iterator.next();
					dimProducto.clear();
					processRecordProducto();
				}
				offset = offset + constantes.getSizePage();
			}else{
				
				lstProducto.clear();
				
				tProducto.clear();
				tProductoExample.clear();
				
				tParametro.clear();
				tParametroExample.clear();
				
				dimProducto.clear();
				dimProductoExample.clear();
				
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
	
	public void processRecordProducto(){
		
		completeFieldProducto();
		
		if(typeProcess.equals(constantes.getTypeProcessSimple())){
			if(tProducto.getCodIndCam().equals(constantes.getStateRecordNew())){
				if(insertRecordDimensionalProducto()> constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}else{
				if(updateRecordDimensionalProducto() > constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}else{
			if(updateRecordDimensionalProducto() > constantes.getResultTransactionNoResult()){
				stateRecordGeneric = constantes.getStateRecordProcessed();
				recordProcessed = recordProcessed + 1; 
			}else{
				if(insertRecordDimensionalProducto() > constantes.getResultTransactionNoResult()){
					stateRecordGeneric = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1;
				}else{
					stateRecordGeneric = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}
		
		updateRecordGenericProducto(stateRecordGeneric);
	}
	
	public void completeFieldProducto(){
		dimProducto.setProductoKey(tProducto.getProcId());
		dimProducto.setProductoCod(tProducto.getProdCod());
		
		dimProducto.setProductoCodTip(tProducto.getProdCodTip());
		if(tProducto.getProdCodTip() != constantes.getValueNumberDefault()){
			tParametro = tParametroManager.selectByPrimaryKey(tProducto.getProdCodTip());
			dimProducto.setProductoDescTip(tParametro.getParamDes());
		}else{
			dimProducto.setProductoDescTip(constantes.getValueStringDefault());
		}
		
		dimProducto.setProductoDesc(tProducto.getProdDes());
		dimProducto.setProcId(process);
	}
	
	public int insertRecordDimensionalProducto(){
		try{
			resultTransaction = dimProductoManager.insertSelective(dimProducto);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int updateRecordDimensionalProducto(){
		try{
			resultTransaction = dimProductoManager.updateByPrimaryKeySelective(dimProducto);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int deleteRecordDimensionalProducto(){
		try{
			resultTransaction = dimProductoManager.deleteByPrimaryKey(dimProducto.getProductoKey());
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction; 
	}
	
	public void updateRecordGenericProducto(String statusRecord){
		try{
			int idProducto = tProducto.getProcId();
			tProducto.clear();
			tProducto.setProcId(idProducto);
			tProducto.setCodIndCam(statusRecord);
			tProducto.setProcId(process);
			tProductoManager.updateByPrimaryKeySelective(tProducto);
		}catch(Exception e){
			
		}
	}
}
