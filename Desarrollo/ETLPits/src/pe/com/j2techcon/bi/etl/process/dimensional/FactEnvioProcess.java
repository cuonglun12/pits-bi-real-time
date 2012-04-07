package pe.com.j2techcon.bi.etl.process.dimensional;

import java.util.Iterator;
import java.util.List;

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
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTiempo;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimTiempoExample;
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
	
	private DimTiempo dimTiempo;
	private DimTiempoExample dimTiempoExample;
	
	private TAreaClienteManager tAreaClienteManager;
	private TDespachoManager tDespachoManager;
	private TCargoDespachoManager tCargoDespachoManager;
	private TCargoManager tCargoManager;
	private TOrdenManager tOrdenManager;
	private TParametroManager tParametroManager;
	private DimTiempoManager dimTiempoManager;
	private FactEnvioManager factEnvioManager;
	
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

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public FactEnvioProcess(BeanFactory factory, int sizePage,
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

		tAreaClienteManager = factory.getBean("tAreaClienteManager", TAreaClienteManager.class);
		tDespachoManager = factory.getBean("tDespachoManager", TDespachoManager.class);
		tCargoDespachoManager = factory.getBean("tCargoDespachoManager", TCargoDespachoManager.class);
		tCargoManager = factory.getBean("tCargoManager", TCargoManager.class);
		tOrdenManager = factory.getBean("tOrdenManager", TOrdenManager.class);
		tParametroManager = factory.getBean("tParametroManager", TParametroManager.class);
		dimTiempoManager = factory.getBean("dimTiempoManager", DimTiempoManager.class);
		factEnvioManager = factory.getBean("factEnvioManager", FactEnvioManager.class);
		
		constantes = factory.getBean("constantes", Constantes.class);

		int offset = 0;
		
		while(true) {
			tCargoDespachoExample.clear();

			tCargoDespachoExample.createCriteria().andFecNumCamGreaterThanOrEqualTo(dateTimeFrom);
			tCargoDespachoExample.createCriteria().andFecNumCamLessThan(dateTimeUntil);	
			
			tCargoDespachoExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			List<TCargoDespacho> lstCargoDespacho = tCargoDespachoManager.selectByExample(tCargoDespachoExample);
			if(lstCargoDespacho.size()>0){
				for (Iterator<TCargoDespacho> iterator = lstCargoDespacho.iterator(); iterator.hasNext();) {
					tCargoDespacho = iterator.next();
					factEnvio.clear();
					processRecordEnvio();
				}
				offset = offset + constantes.getSizePage();
			}else{
				lstCargoDespacho.clear();
				
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
	
	public void processRecordEnvio(){
		
		if(!tCargoDespacho.getProcId().equals(process)){
		
			completeFildEnvio();
			
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
			recordProcessed = recordProcessed + 1;
		}
	}
	
	public void completeFildEnvio(){
		
		tCargo = tCargoManager.selectByPrimaryKey(tCargoDespacho.getCargId());
		tOrden = tOrdenManager.selectByPrimaryKey(tCargo.getOrdId());
		tDespacho = tDespachoManager.selectByPrimaryKey(tCargoDespacho.getCarDespId());
		
		
		factEnvio.setEnvioKeyClienteArea(tOrden.getCodAreCli());
		factEnvio.setEnvioKeyUbigeoCliente(tAreaClienteManager.selectByPrimaryKey(tOrden.getCodAreCli()).getUbiId());
		factEnvio.setEnvioKeyServicio(tOrden.getServId());
		factEnvio.setEnvioKeyProducto(tOrden.getProdId());
		factEnvio.setEnvioKeyZona(tCargoDespacho.getZonId());
		factEnvio.setEnvioKeyPersonal(tDespacho.getEmpCatId());
		
		dimTiempoExample.clear();
		dimTiempoExample.createCriteria().andTiempoFechaEqualTo(tCargoDespacho.getCarDespFecSal());
		dimTiempo = (dimTiempoManager.selectByExample(dimTiempoExample)).get(0);
		factEnvio.setEnvioKeyFecSal(dimTiempo.getTiempoKey());
		
		dimTiempoExample.clear();
		dimTiempoExample.createCriteria().andTiempoFechaEqualTo(tCargoDespacho.getCarDespFecRetPro());
		dimTiempo = (dimTiempoManager.selectByExample(dimTiempoExample)).get(0);
		factEnvio.setEnvioKeyFecRetp(dimTiempo.getTiempoKey());
		
		dimTiempoExample.clear();
		dimTiempoExample.createCriteria().andTiempoFechaEqualTo(tCargoDespacho.getCarDespFecRetRea());
		dimTiempo = (dimTiempoManager.selectByExample(dimTiempoExample)).get(0);
		factEnvio.setEnvioKeyFecRetr(dimTiempo.getTiempoKey());
		
		factEnvio.setEnvioKeyEstado(tCargoDespacho.getCarDespCodEst());
		
		tParametro = tParametroManager.selectByPrimaryKey(tCargoDespacho.getCarDespCodEst());
		
		if(constantes.getParamCodeEstadoCargoDespachoEntregado().equals(tParametro.getParamCod())){
			
			factEnvio.setEnvioIndEnt((short)constantes.getValueNumberUnit());
			factEnvio.setEnvioIndMot((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRee((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndAnu((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndFueZon((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndPerd((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndDig((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRut((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndPro((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRob((short)constantes.getValueNumberCero());
			
			
		}else if (constantes.getParamCodeEstadoCargoDespachoMotivado().equals(tParametro.getParamCod())){
			factEnvio.setEnvioIndEnt((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndMot((short)constantes.getValueNumberUnit());
			factEnvio.setEnvioIndRee((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndAnu((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndFueZon((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndPerd((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndDig((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRut((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndPro((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRob((short)constantes.getValueNumberCero());
			
		}else if (constantes.getParamCodeEstadoCargoDespachoReenviado().equals(tParametro.getParamCod())){
			factEnvio.setEnvioIndEnt((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndMot((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRee((short)constantes.getValueNumberUnit());
			factEnvio.setEnvioIndAnu((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndFueZon((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndPerd((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndDig((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRut((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndPro((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRob((short)constantes.getValueNumberCero());
			
		}else if (constantes.getParamCodeEstadoCargoDespachoAnulado().equals(tParametro.getParamCod())){
			factEnvio.setEnvioIndEnt((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndMot((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRee((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndAnu((short)constantes.getValueNumberUnit());
			factEnvio.setEnvioIndFueZon((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndPerd((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndDig((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRut((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndPro((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRob((short)constantes.getValueNumberCero());
			
		}else if (constantes.getParamCodeEstadoCargoDespachoFueraZona().equals(tParametro.getParamCod())){
			factEnvio.setEnvioIndEnt((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndMot((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRee((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndAnu((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndFueZon((short)constantes.getValueNumberUnit());
			factEnvio.setEnvioIndPerd((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndDig((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRut((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndPro((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRob((short)constantes.getValueNumberCero());
			
		}else if (constantes.getParamCodeEstadoCargoDespachoPerdido().equals(tParametro.getParamCod())){
			factEnvio.setEnvioIndEnt((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndMot((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRee((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndAnu((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndFueZon((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndPerd((short)constantes.getValueNumberUnit());
			factEnvio.setEnvioIndDig((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRut((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndPro((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRob((short)constantes.getValueNumberCero());
			
		}else if (constantes.getParamCodeEstadoCargoDespachoDigitado().equals(tParametro.getParamCod())){
			factEnvio.setEnvioIndEnt((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndMot((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRee((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndAnu((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndFueZon((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndPerd((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndDig((short)constantes.getValueNumberUnit());
			factEnvio.setEnvioIndRut((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndPro((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRob((short)constantes.getValueNumberCero());
		}else if (constantes.getParamCodeEstadoCargoDespachoRuta().equals(tParametro.getParamCod())){
			factEnvio.setEnvioIndEnt((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndMot((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRee((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndAnu((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndFueZon((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndPerd((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndDig((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRut((short)constantes.getValueNumberUnit());
			factEnvio.setEnvioIndPro((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRob((short)constantes.getValueNumberCero());
			
		}else if (constantes.getParamCodeEstadoCargoDespachoProvincia().equals(tParametro.getParamCod())){
			factEnvio.setEnvioIndEnt((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndMot((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRee((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndAnu((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndFueZon((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndPerd((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndDig((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRut((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndPro((short)constantes.getValueNumberUnit());
			factEnvio.setEnvioIndRob((short)constantes.getValueNumberCero());
		}else if (constantes.getParamCodeEstadoCargoDespachoRobo().equals(tParametro.getParamCod())){
			factEnvio.setEnvioIndEnt((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndMot((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRee((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndAnu((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndFueZon((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndPerd((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndDig((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRut((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndPro((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRob((short)constantes.getValueNumberUnit());
		}else{
			factEnvio.setEnvioIndEnt((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndMot((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRee((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndAnu((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndFueZon((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndPerd((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndDig((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRut((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndPro((short)constantes.getValueNumberCero());
			factEnvio.setEnvioIndRob((short)constantes.getValueNumberCero());
		}
		factEnvio.setProcId(process);
	}
	
	public int insertRecordDimensionalEnvio(){
		try{
			resultTransaction = factEnvioManager.insertSelective(factEnvio);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int updateRecordDimensionalEnvio(){
		try{
			resultTransaction = factEnvioManager.updateByPrimaryKeySelective(factEnvio);
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}
	
	public int deleteRecordDimensionalEnvio(){
		try{
			resultTransaction = factEnvioManager.deleteByPrimaryKey(factEnvio.getEnvioKey());
		}catch(Exception e){
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction; 
	}
	
	public void updateRecordGenericEnvio(String statusRecord){
		try{
			int idEnvio = tCargoDespacho.getCarDespId();
			tCargoDespacho.clear();
			tCargoDespacho.setCarDespId(idEnvio);
			tCargoDespacho.setCodIndCam(statusRecord);
			tCargoDespacho.setProcId(process);
			tCargoDespachoManager.updateByPrimaryKeySelective(tCargoDespacho);
		}catch(Exception e){
			
		}
	}
}
