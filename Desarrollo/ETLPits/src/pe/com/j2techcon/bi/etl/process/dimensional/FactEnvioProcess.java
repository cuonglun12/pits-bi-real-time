package pe.com.j2techcon.bi.etl.process.dimensional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.logic.dimensional.DimTiempoManager;
import pe.com.j2techcon.bi.etl.logic.dimensional.FactEnvioManager;
import pe.com.j2techcon.bi.etl.logic.generic.TAreaClienteManager;
import pe.com.j2techcon.bi.etl.logic.generic.TCargoDespachoManager;
import pe.com.j2techcon.bi.etl.logic.generic.TCargoManager;
import pe.com.j2techcon.bi.etl.logic.generic.TDespachoManager;
import pe.com.j2techcon.bi.etl.logic.generic.TOrdenManager;
import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.util.Util;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactEnvio;
import pe.com.j2techcon.bi.etl.domain.dimensional.FactEnvioExample;
import pe.com.j2techcon.bi.etl.domain.generic.TAreaCliente;
import pe.com.j2techcon.bi.etl.domain.generic.TAreaClienteExample;
import pe.com.j2techcon.bi.etl.domain.generic.TCargo;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoDespacho;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoDespachoExample;
import pe.com.j2techcon.bi.etl.domain.generic.TCargoExample;
import pe.com.j2techcon.bi.etl.domain.generic.TDespacho;
import pe.com.j2techcon.bi.etl.domain.generic.TDespachoExample;
import pe.com.j2techcon.bi.etl.domain.generic.TOrden;
import pe.com.j2techcon.bi.etl.domain.generic.TOrdenExample;
import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;

public class FactEnvioProcess {
	
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
	
	private TCargoDespacho tCargoDespacho;
	private TCargoDespachoExample tCargoDespachoExample;
	
	private TDespacho tDespacho;
	private TDespachoExample tDespachoExample;
	
	private TCargo tCargo;
	private TCargoExample tCargoExample;
	
	private TOrden tOrden;
	private TOrdenExample tOrdenExample;
	
	private TParametro tParametro;
	private TParametroExample tParametroExample;
	
	private FactEnvio factEnvio;
	private FactEnvioExample factEnvioExample;
	
	private TAreaClienteManager tAreaClienteManager;
	private TDespachoManager tDespachoManager;
	private TCargoDespachoManager tCargoDespachoManager;
	private TCargoManager tCargoManager;
	private TOrdenManager tOrdenManager;
	private TParametroManager tParametroManager;
	private DimTiempoManager dimTiempoManager;
	private FactEnvioManager factEnvioManager;
	
	private List<TCargo> lstCargo;
	private List<TOrden> lstOrden;
	private List<TDespacho> lstDespacho;
	
	private List<Integer> lstCargos;
	private List<Integer> lstOrdenes;
	private List<Integer> lstDespachos;
	
	private Map<Integer, TCargo> mpCargo;
	private Map<Integer, TOrden> mpOrden;
	private Map<Integer, TDespacho> mpDespacho;
	
	private Constantes constantes;

	static Logger log = Logger.getLogger(FactEnvioProcess.class);

	public FactEnvioProcess(BeanFactory factory, int sizePage,
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

		tAreaClienteManager = factory.getBean("tAreaClienteManager", TAreaClienteManager.class);
		tDespachoManager = factory.getBean("tDespachoManager", TDespachoManager.class);
		tCargoDespachoManager = factory.getBean("tCargoDespachoManager", TCargoDespachoManager.class);
		tCargoManager = factory.getBean("tCargoManager", TCargoManager.class);
		tOrdenManager = factory.getBean("tOrdenManager", TOrdenManager.class);
		tParametroManager = factory.getBean("tParametroManager", TParametroManager.class);
		dimTiempoManager = factory.getBean("dimTiempoManager", DimTiempoManager.class);
		factEnvioManager = factory.getBean("factEnvioManager", FactEnvioManager.class);
		
		tAreaCliente = new TAreaCliente();
		tAreaClienteExample = new TAreaClienteExample();
		
		tCargoDespacho = new TCargoDespacho();
		tCargoDespachoExample = new TCargoDespachoExample();
		
		tDespacho = new TDespacho();
		tDespachoExample = new TDespachoExample();
		
		tCargo = new TCargo();
		tCargoExample = new TCargoExample();
		
		tOrden = new TOrden();
		tOrdenExample = new TOrdenExample();
		
		tParametro = new TParametro();
		tParametroExample = new TParametroExample();
		
		factEnvio = new FactEnvio();
		factEnvioExample = new FactEnvioExample();
		
		lstCargo = new ArrayList<TCargo>();
		lstOrden = new ArrayList<TOrden>();
		lstDespacho = new ArrayList<TDespacho>();
		
		lstCargos = new ArrayList<Integer>();
		lstOrdenes = new ArrayList<Integer>();
		lstDespachos = new ArrayList<Integer>();
		
		mpCargo = new HashMap<Integer, TCargo>();
		mpOrden = new HashMap<Integer, TOrden>();
		mpDespacho = new HashMap<Integer, TDespacho>();

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
				
				mpCargo.clear();
				mpOrden.clear();
				mpDespacho.clear();
				
				lstCargos = Util.getIntegerListFromObjectList(lstCargoDespacho, "cargId");
				
				if (lstCargos.size() > 0) {
					
					tCargoExample.clear();
					tCargoExample.createCriteria().andCargIdIn(lstCargos);
					lstCargo = tCargoManager.selectByExample(tCargoExample);
					
					for (Iterator<TCargo> iterator = lstCargo.iterator(); iterator.hasNext();) {
						tCargo = iterator.next();
						mpCargo.put(tCargo.getCargId(), tCargo); 
					}
					
					lstOrdenes = Util.getIntegerListFromObjectList(lstCargo, "ordId");
					
					if(lstOrdenes.size()>0){
						tOrdenExample.clear();
						tOrdenExample.createCriteria().andOrdIdIn(lstOrdenes);
						lstOrden = tOrdenManager.selectByExample(tOrdenExample);
						
						for (Iterator<TOrden> iterator = lstOrden.iterator(); iterator.hasNext();) {
							tOrden = iterator.next();
							mpOrden.put(tOrden.getOrdId(), tOrden);
						}
					}
				}
				
				lstDespachos = Util.getIntegerListFromObjectList(lstCargoDespacho, "despId");
				
				if(lstDespachos.size()>0){
					
					tDespachoExample.clear();
					tDespachoExample.createCriteria().andDespIdIn(lstDespachos);
					lstDespacho = tDespachoManager.selectByExample(tDespachoExample);
					
					for (Iterator<TDespacho> iterator = lstDespacho.iterator(); iterator.hasNext();) {
						tDespacho = iterator.next();
						mpDespacho.put(tDespacho.getDespId(), tDespacho);
						
					}
					
				}
				
				for (Iterator<TCargoDespacho> iterator = lstCargoDespacho.iterator(); iterator.hasNext();) {
					tCargoDespacho = iterator.next();
					factEnvio.clear();
					processRecordEnvio();
				}
				lstCargoDespacho.clear();
				//offset = offset + constantes.getSizePage();
				
			}else{
				lstStateRecord.clear();
				lstCargoDespacho.clear();
				lstCargo.clear();
				lstCargos.clear();
				lstDespacho.clear();
				lstDespachos.clear();
				lstOrden.clear();
				lstOrdenes.clear();
				
				mpCargo.clear();
				mpDespacho.clear();
				mpOrden.clear();
				
				tAreaCliente.clear();
				tAreaClienteExample.clear();
				
				tCargo.clear();
				tCargoExample.clear();
				
				tCargoDespacho.clear();
				tCargoDespachoExample.clear();
				
				tOrden.clear();
				tOrdenExample.clear();
				
				tParametro.clear();
				tParametroExample.clear();
				
				factEnvio.clear();
				factEnvioExample.clear();
				
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
	
	public void processRecordEnvio()throws Exception{
		
		if(!tCargoDespacho.getProcId().equals(process)){
			
			completeFieldEnvio();
			
			if(tCargo != null && tOrden != null && tDespacho != null){
				
				if(typeProcess.equals(constantes.getTypeProcessSimple())){
					if(tCargoDespacho.getCodIndCam().equals(constantes.getStateRecordNew())){
						if(insertRecordDimensionalEnvio()> constantes.getResultTransactionNoResult()){
							stateRecordGeneric = constantes.getStateRecordProcessed();
							recordProcessed = recordProcessed + 1; 
						} else{
							stateRecordGeneric = constantes.getStateRecordInconsistent();
							recordRejected = recordRejected + 1;
						}
					}else{
						if(updateRecordDimensionalEnvio() > constantes.getResultTransactionNoResult()){
							stateRecordGeneric = constantes.getStateRecordProcessed();
							recordProcessed = recordProcessed + 1; 
						} else{
							stateRecordGeneric = constantes.getStateRecordInconsistent();
							recordRejected = recordRejected + 1;
						}
					}
				}else{
					if(updateRecordDimensionalEnvio() > constantes.getResultTransactionNoResult()){
						stateRecordGeneric = constantes.getStateRecordProcessed();
						recordProcessed = recordProcessed + 1; 
					}else{
						if(insertRecordDimensionalEnvio() > constantes.getResultTransactionNoResult()){
							stateRecordGeneric = constantes.getStateRecordProcessed();
							recordProcessed = recordProcessed + 1;
						}else{
							stateRecordGeneric = constantes.getStateRecordInconsistent();
							recordRejected = recordRejected + 1;
						}
					}
				}
				
				updateRecordGenericEnvio(stateRecordGeneric);
				
			}else{
				stateRecordGeneric = constantes.getStateRecordInconsistent();
				recordRejected = recordRejected + 1;
				updateRecordGenericEnvio(stateRecordGeneric);
			}
			
		}else{
			recordProcessed = recordProcessed + 1;
		}
	}
	
	public void completeFieldEnvio()throws Exception{

		tCargo = mpCargo.get(tCargoDespacho.getCargId());
		tOrden = mpOrden.get(tCargo.getOrdId());
		tDespacho = mpDespacho.get(tCargoDespacho.getDespId());
		
		if(tCargo != null && tOrden != null && tDespacho != null){
			
			factEnvio.setEnvioKeyClienteArea(tOrden.getCodAreCli());
			factEnvio.setEnvioKeyUbigeoCliente(tAreaClienteManager.selectByPrimaryKey(tOrden.getCodAreCli()).getUbiId());
			factEnvio.setEnvioKeyServicio(tOrden.getServId());
			factEnvio.setEnvioKeyProducto(tOrden.getProdId());
			factEnvio.setEnvioKeyZona(tCargoDespacho.getZonId());
			factEnvio.setEnvioKeyPersonal(tDespacho.getEmpCatId());
			factEnvio.setEnvioKeyFecSal(Util.getDateAsInteger(tCargoDespacho.getCarDespFecSal()));
			factEnvio.setEnvioKeyFecRetp(Util.getDateAsInteger(tCargoDespacho.getCarDespFecRetPro()));
			factEnvio.setEnvioKeyFecRetr(Util.getDateAsInteger(tCargoDespacho.getCarDespFecRetRea()));
			
			factEnvio.setEnvioKeyEstado(tCargoDespacho.getCarDespCodEst());
			
			tParametro = tParametroManager.selectByPrimaryKey(tCargoDespacho.getCarDespCodEst());
			
			if(constantes.getParamCodeEstadoCargoDespachoEntregado().equals(tParametro.getParamCod())){
				
				factEnvio.setEnvioIndEnt((short) 1);
				factEnvio.setEnvioIndMot((short) 0);
				factEnvio.setEnvioIndRee((short) 0);
				factEnvio.setEnvioIndAnu((short) 0);
				factEnvio.setEnvioIndFueZon((short) 0);
				factEnvio.setEnvioIndPerd((short) 0);
				factEnvio.setEnvioIndDig((short) 0);
				factEnvio.setEnvioIndRut((short) 0);
				factEnvio.setEnvioIndPro((short) 0);
				factEnvio.setEnvioIndRob((short) 0);
				
				
			}else if (constantes.getParamCodeEstadoCargoDespachoMotivado().equals(tParametro.getParamCod())){
				factEnvio.setEnvioIndEnt((short) 0);
				factEnvio.setEnvioIndMot((short) 1);
				factEnvio.setEnvioIndRee((short) 0);
				factEnvio.setEnvioIndAnu((short) 0);
				factEnvio.setEnvioIndFueZon((short) 0);
				factEnvio.setEnvioIndPerd((short) 0);
				factEnvio.setEnvioIndDig((short) 0);
				factEnvio.setEnvioIndRut((short) 0);
				factEnvio.setEnvioIndPro((short) 0);
				factEnvio.setEnvioIndRob((short) 0);
				
			}else if (constantes.getParamCodeEstadoCargoDespachoReenviado().equals(tParametro.getParamCod())){
				factEnvio.setEnvioIndEnt((short) 0);
				factEnvio.setEnvioIndMot((short) 0);
				factEnvio.setEnvioIndRee((short) 1);
				factEnvio.setEnvioIndAnu((short) 0);
				factEnvio.setEnvioIndFueZon((short) 0);
				factEnvio.setEnvioIndPerd((short) 0);
				factEnvio.setEnvioIndDig((short) 0);
				factEnvio.setEnvioIndRut((short) 0);
				factEnvio.setEnvioIndPro((short) 0);
				factEnvio.setEnvioIndRob((short) 0);
				
			}else if (constantes.getParamCodeEstadoCargoDespachoAnulado().equals(tParametro.getParamCod())){
				factEnvio.setEnvioIndEnt((short) 0);
				factEnvio.setEnvioIndMot((short) 0);
				factEnvio.setEnvioIndRee((short) 0);
				factEnvio.setEnvioIndAnu((short) 1);
				factEnvio.setEnvioIndFueZon((short) 0);
				factEnvio.setEnvioIndPerd((short) 0);
				factEnvio.setEnvioIndDig((short) 0);
				factEnvio.setEnvioIndRut((short) 0);
				factEnvio.setEnvioIndPro((short) 0);
				factEnvio.setEnvioIndRob((short) 0);
				
			}else if (constantes.getParamCodeEstadoCargoDespachoFueraZona().equals(tParametro.getParamCod())){
				factEnvio.setEnvioIndEnt((short) 0);
				factEnvio.setEnvioIndMot((short) 0);
				factEnvio.setEnvioIndRee((short) 0);
				factEnvio.setEnvioIndAnu((short) 0);
				factEnvio.setEnvioIndFueZon((short) 1);
				factEnvio.setEnvioIndPerd((short) 0);
				factEnvio.setEnvioIndDig((short) 0);
				factEnvio.setEnvioIndRut((short) 0);
				factEnvio.setEnvioIndPro((short) 0);
				factEnvio.setEnvioIndRob((short) 0);
				
			}else if (constantes.getParamCodeEstadoCargoDespachoPerdido().equals(tParametro.getParamCod())){
				factEnvio.setEnvioIndEnt((short) 0);
				factEnvio.setEnvioIndMot((short) 0);
				factEnvio.setEnvioIndRee((short) 0);
				factEnvio.setEnvioIndAnu((short) 0);
				factEnvio.setEnvioIndFueZon((short) 0);
				factEnvio.setEnvioIndPerd((short) 1);
				factEnvio.setEnvioIndDig((short) 0);
				factEnvio.setEnvioIndRut((short) 0);
				factEnvio.setEnvioIndPro((short) 0);
				factEnvio.setEnvioIndRob((short) 0);
				
			}else if (constantes.getParamCodeEstadoCargoDespachoDigitado().equals(tParametro.getParamCod())){
				factEnvio.setEnvioIndEnt((short) 0);
				factEnvio.setEnvioIndMot((short) 0);
				factEnvio.setEnvioIndRee((short) 0);
				factEnvio.setEnvioIndAnu((short) 0);
				factEnvio.setEnvioIndFueZon((short) 0);
				factEnvio.setEnvioIndPerd((short) 0);
				factEnvio.setEnvioIndDig((short) 1);
				factEnvio.setEnvioIndRut((short) 0);
				factEnvio.setEnvioIndPro((short) 0);
				factEnvio.setEnvioIndRob((short) 0);
			}else if (constantes.getParamCodeEstadoCargoDespachoRuta().equals(tParametro.getParamCod())){
				factEnvio.setEnvioIndEnt((short) 0);
				factEnvio.setEnvioIndMot((short) 0);
				factEnvio.setEnvioIndRee((short) 0);
				factEnvio.setEnvioIndAnu((short) 0);
				factEnvio.setEnvioIndFueZon((short) 0);
				factEnvio.setEnvioIndPerd((short) 0);
				factEnvio.setEnvioIndDig((short) 0);
				factEnvio.setEnvioIndRut((short) 1);
				factEnvio.setEnvioIndPro((short) 0);
				factEnvio.setEnvioIndRob((short) 0);
				
			}else if (constantes.getParamCodeEstadoCargoDespachoProvincia().equals(tParametro.getParamCod())){
				factEnvio.setEnvioIndEnt((short) 0);
				factEnvio.setEnvioIndMot((short) 0);
				factEnvio.setEnvioIndRee((short) 0);
				factEnvio.setEnvioIndAnu((short) 0);
				factEnvio.setEnvioIndFueZon((short) 0);
				factEnvio.setEnvioIndPerd((short) 0);
				factEnvio.setEnvioIndDig((short) 0);
				factEnvio.setEnvioIndRut((short) 0);
				factEnvio.setEnvioIndPro((short) 1);
				factEnvio.setEnvioIndRob((short) 0);
			}else if (constantes.getParamCodeEstadoCargoDespachoRobo().equals(tParametro.getParamCod())){
				factEnvio.setEnvioIndEnt((short) 0);
				factEnvio.setEnvioIndMot((short) 0);
				factEnvio.setEnvioIndRee((short) 0);
				factEnvio.setEnvioIndAnu((short) 0);
				factEnvio.setEnvioIndFueZon((short) 0);
				factEnvio.setEnvioIndPerd((short) 0);
				factEnvio.setEnvioIndDig((short) 0);
				factEnvio.setEnvioIndRut((short) 0);
				factEnvio.setEnvioIndPro((short) 0);
				factEnvio.setEnvioIndRob((short) 1);
			}else{
				factEnvio.setEnvioIndEnt((short) 0);
				factEnvio.setEnvioIndMot((short) 0);
				factEnvio.setEnvioIndRee((short) 0);
				factEnvio.setEnvioIndAnu((short) 0);
				factEnvio.setEnvioIndFueZon((short) 0);
				factEnvio.setEnvioIndPerd((short) 0);
				factEnvio.setEnvioIndDig((short) 0);
				factEnvio.setEnvioIndRut((short) 0);
				factEnvio.setEnvioIndPro((short) 0);
				factEnvio.setEnvioIndRob((short) 0);
			}
			factEnvio.setProcId(process);
		}
	}
	
	public int insertRecordDimensionalEnvio()throws Exception{
		try{
			resultTransaction = factEnvioManager.insertSelective(factEnvio);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int updateRecordDimensionalEnvio()throws Exception{
		try{
			resultTransaction = factEnvioManager.updateByPrimaryKeySelective(factEnvio);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int deleteRecordDimensionalEnvio()throws Exception{
		try{
			resultTransaction = factEnvioManager.deleteByPrimaryKey(factEnvio.getEnvioKey());
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction; 
	}
	
	public void updateRecordGenericEnvio(String statusRecord)throws Exception{
		int idEnvio = tCargoDespacho.getCarDespId();
		tCargoDespacho.clear();
		tCargoDespacho.setCarDespId(idEnvio);
		tCargoDespacho.setCodIndCam(statusRecord);
		//tCargoDespacho.setFecNumCam(Util.getCurrentDateTimeAsLong());
		tCargoDespacho.setProcId(process);
		tCargoDespachoManager.updateByPrimaryKeySelective(tCargoDespacho);
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

	
	public FactEnvio getFactEnvio() {
		return factEnvio;
	}

	
	public void setFactEnvio(FactEnvio factEnvio) {
		this.factEnvio = factEnvio;
	}

	
	public FactEnvioExample getFactEnvioExample() {
		return factEnvioExample;
	}

	
	public void setFactEnvioExample(FactEnvioExample factEnvioExample) {
		this.factEnvioExample = factEnvioExample;
	}

	
	public TAreaClienteManager gettAreaClienteManager() {
		return tAreaClienteManager;
	}

	
	public void settAreaClienteManager(TAreaClienteManager tAreaClienteManager) {
		this.tAreaClienteManager = tAreaClienteManager;
	}

	
	public TDespachoManager gettDespachoManager() {
		return tDespachoManager;
	}

	
	public void settDespachoManager(TDespachoManager tDespachoManager) {
		this.tDespachoManager = tDespachoManager;
	}

	
	public TCargoDespachoManager gettCargoDespachoManager() {
		return tCargoDespachoManager;
	}

	
	public void settCargoDespachoManager(TCargoDespachoManager tCargoDespachoManager) {
		this.tCargoDespachoManager = tCargoDespachoManager;
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

	
	public FactEnvioManager getFactEnvioManager() {
		return factEnvioManager;
	}

	
	public void setFactEnvioManager(FactEnvioManager factEnvioManager) {
		this.factEnvioManager = factEnvioManager;
	}

	
	public List<TCargo> getLstCargo() {
		return lstCargo;
	}

	
	public void setLstCargo(List<TCargo> lstCargo) {
		this.lstCargo = lstCargo;
	}

	
	public List<TOrden> getLstOrden() {
		return lstOrden;
	}

	
	public void setLstOrden(List<TOrden> lstOrden) {
		this.lstOrden = lstOrden;
	}

	
	public List<TDespacho> getLstDespacho() {
		return lstDespacho;
	}

	
	public void setLstDespacho(List<TDespacho> lstDespacho) {
		this.lstDespacho = lstDespacho;
	}

	
	public List<Integer> getLstCargos() {
		return lstCargos;
	}

	
	public void setLstCargos(List<Integer> lstCargos) {
		this.lstCargos = lstCargos;
	}

	
	public List<Integer> getLstOrdenes() {
		return lstOrdenes;
	}

	
	public void setLstOrdenes(List<Integer> lstOrdenes) {
		this.lstOrdenes = lstOrdenes;
	}

	
	public List<Integer> getLstDespachos() {
		return lstDespachos;
	}

	
	public void setLstDespachos(List<Integer> lstDespachos) {
		this.lstDespachos = lstDespachos;
	}

	
	public Map<Integer, TCargo> getMpCargo() {
		return mpCargo;
	}

	
	public void setMpCargo(Map<Integer, TCargo> mpCargo) {
		this.mpCargo = mpCargo;
	}

	
	public Map<Integer, TOrden> getMpOrden() {
		return mpOrden;
	}

	
	public void setMpOrden(Map<Integer, TOrden> mpOrden) {
		this.mpOrden = mpOrden;
	}

	
	public Map<Integer, TDespacho> getMpDespacho() {
		return mpDespacho;
	}

	
	public void setMpDespacho(Map<Integer, TDespacho> mpDespacho) {
		this.mpDespacho = mpDespacho;
	}

	
	public Constantes getConstantes() {
		return constantes;
	}

	
	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}
}
