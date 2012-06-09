package pe.com.j2techcon.bi.etl.process.control;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.com.j2techcon.bi.etl.domain.control.TProceso;
import pe.com.j2techcon.bi.etl.domain.control.TProcesoDetalle;
import pe.com.j2techcon.bi.etl.domain.control.TProcesoDetalleExample;
import pe.com.j2techcon.bi.etl.domain.control.TProcesoExample;
import pe.com.j2techcon.bi.etl.logic.control.TProcesoDetalleManager;
import pe.com.j2techcon.bi.etl.logic.control.TProcesoManager;
import pe.com.j2techcon.bi.etl.process.dimensional.DimClienteProcess;
import pe.com.j2techcon.bi.etl.process.dimensional.DimEstadoProcess;
import pe.com.j2techcon.bi.etl.process.dimensional.DimFacturadoProcess;
import pe.com.j2techcon.bi.etl.process.dimensional.DimMonedaProcess;
import pe.com.j2techcon.bi.etl.process.dimensional.DimPersonalProcess;
import pe.com.j2techcon.bi.etl.process.dimensional.DimProductoProcess;
import pe.com.j2techcon.bi.etl.process.dimensional.DimSedeProcess;
import pe.com.j2techcon.bi.etl.process.dimensional.DimServicioProcess;
import pe.com.j2techcon.bi.etl.process.dimensional.DimTipoDocumentoProcess;
import pe.com.j2techcon.bi.etl.process.dimensional.DimTipoPagoProcess;
import pe.com.j2techcon.bi.etl.process.dimensional.DimTipoRepartoProcess;
import pe.com.j2techcon.bi.etl.process.dimensional.DimTipoRutaProcess;
import pe.com.j2techcon.bi.etl.process.dimensional.DimUbigeoProcess;
import pe.com.j2techcon.bi.etl.process.dimensional.DimZonaProcess;
import pe.com.j2techcon.bi.etl.process.dimensional.FactCotizacionProcess;
import pe.com.j2techcon.bi.etl.process.dimensional.FactDespachoProcess;
import pe.com.j2techcon.bi.etl.process.dimensional.FactEnvioProcess;
import pe.com.j2techcon.bi.etl.process.dimensional.FactOrdenProcess;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.util.Util;

public class TProcesoProcess {
	
	private BeanFactory factory;
	private int sizePage;
	private long dateTimeFrom;
	private long dateTimeUntil;
	private int process;	
	private String typeProcess;
	private String typeLoadProcess;
	private int recordTotal;
	private int recordProcessed;
	private int recordRejected;
	private int resultProcess;
	
	private TProceso tProceso;
	private TProcesoDetalle tProcesoDetalle;
	
	private TProcesoExample tProcesoExample;
	private TProcesoDetalleExample tProcesoDetalleExample;
	
	
	private TProcesoManager tProcesoManager;
	private TProcesoDetalleManager tProcesoDetalleManager;
	
	private Constantes constantes;
	
	List<String> statesProceso;

	public void start(){
		
		factory = new ClassPathXmlApplicationContext("application-context.xml");
		sizePage = constantes.getSizePage();
		typeProcess = constantes.getTypeProcessSimple();
		recordTotal = constantes.getValueNumberDefault();
		recordProcessed = constantes.getValueNumberDefault();
		recordRejected = constantes.getValueNumberDefault();
		
		tProcesoManager = factory.getBean("tProcesoManager", TProcesoManager.class);
		tProcesoDetalleManager = factory.getBean("tProcesoDetalleManager", TProcesoDetalleManager.class);
		
		if(getLastProcess().getProcId()!=null){
			if(tProceso.getProcEst().equals(constantes.getStateProcessStarted())){
				if(isTheFirstProcess(tProceso.getProcId(), constantes.getLoadProcessToGeneric()) || isTheFirstProcess(tProceso.getProcId(), constantes.getLoadProcessToDimensional())){
					if(getHoursAfterStartProcess(tProceso)>constantes.getMaxHoursFirstProcess()){
						cancelProcess(tProceso.getProcId());
					}else{
						System.exit(0);
					}
				} else{
					if(getHoursAfterStartProcess(tProceso)>constantes.getMaxHoursProcess()){
						cancelProcess(tProceso.getProcId());
					}else{
						System.exit(0);
					}
				}
			}
			if(tProceso.getProcEst().equals(constantes.getStateProcessCompletedCorrectly()) || tProceso.getProcEst().equals(constantes.getStateProcessCompletedErrors())){
				if(tProceso.getProcTip().equals(constantes.getLoadProcessToGeneric())){
					
					dateTimeFrom = Util.getDateTimeAsLong(tProceso.getProcFecIni());
					dateTimeUntil = Util.getDateTimeAsLong(tProceso.getProcFecFin());
					typeLoadProcess = constantes.getLoadProcessToDimensional(); 
					
					startProcess();
				}
				if(tProceso.getProcTip().equals(constantes.getLoadProcessToDimensional())){
					typeLoadProcess = constantes.getLoadProcessToGeneric();
					getLastCompletedProcess();
					
					dateTimeFrom = Util.getDateTimeAsLong(tProceso.getProcFecHasta());
					dateTimeUntil = Util.getDateTimeAsLong(Util.addToDateTime(Util.getCurrentDateTime(), Calendar.SECOND, -1));
					typeLoadProcess = constantes.getLoadProcessToGeneric();
					
					startProcess();
				}
			}
			if(tProceso.getProcEst().equals(constantes.getStateProcessCanceled())){
				if(tProceso.getProcTip().equals(constantes.getLoadProcessToGeneric())){
					typeLoadProcess = constantes.getLoadProcessToGeneric();
					getLastCompletedProcess();
					
					if(tProceso.getProcId() == null){
						dateTimeFrom = Util.getDateTimeAsLong(Util.getDateTimeDefault());
						dateTimeUntil = Util.getDateTimeAsLong(Util.addToDateTime(Util.getDateTimeDefault(), Calendar.SECOND, 1));
					}else{
						dateTimeFrom = Util.getDateTimeAsLong(tProceso.getProcFecHasta());
						dateTimeUntil = Util.getDateTimeAsLong(Util.addToDateTime(Util.getCurrentDateTime(), Calendar.SECOND, -1));
					}
					
					typeLoadProcess = constantes.getLoadProcessToGeneric();
					
					startProcess();
					
				}
				if(tProceso.getProcTip().equals(constantes.getLoadProcessToDimensional())){
					
					typeLoadProcess = constantes.getLoadProcessToGeneric();
					getLastCompletedProcess();
					
					dateTimeFrom = Util.getDateTimeAsLong(tProceso.getProcFecIni());
					dateTimeUntil = Util.getDateTimeAsLong(tProceso.getProcFecFin());
					
					typeLoadProcess = constantes.getLoadProcessToDimensional();
					
					startProcess();
				}
				typeProcess = constantes.getTypeProcessReProcess();
			}
		}else{
			dateTimeFrom = Util.getDateTimeAsLong(Util.getDateTimeDefault());
			dateTimeUntil = Util.getDateTimeAsLong(Util.addToDateTime(Util.getDateTimeDefault(), Calendar.SECOND, 1));
			
			typeLoadProcess = constantes.getLoadProcessToGeneric();

			startProcess();
		}
		
	}
	
	public TProceso getLastStartedProcess(){
		
		statesProceso.clear(); 
		statesProceso.add(constantes.getStateProcessStarted());
		
		tProcesoExample.clear();
		tProcesoExample.createCriteria().andProcEstIn(statesProceso);
		tProcesoExample.setOrderByClause("proc_id desc");
		tProcesoExample.setPaginationByClause(" limit " + constantes.getValueNumberUnit() + " offset " + constantes.getValueNumberUnit());
		
		
		try{
		tProceso = tProcesoManager.selectByExample(tProcesoExample).get(0);
		}catch(IndexOutOfBoundsException e){
			tProceso.clear();
		}
		return tProceso;
	}
	
	public TProceso getLastCompletedProcess(){
		
		statesProceso.clear(); 
		statesProceso.add(constantes.getStateProcessCompletedCorrectly());
		statesProceso.add(constantes.getStateProcessCompletedErrors());
		
		tProcesoExample.clear();
		tProcesoExample.createCriteria().andProcEstIn(statesProceso);
		
		if(!typeLoadProcess.equals(constantes.getValueStringDefault())){
			tProcesoExample.createCriteria().andProcTipEqualTo(typeLoadProcess);
		}
		
		tProcesoExample.setOrderByClause("proc_id desc");
		tProcesoExample.setPaginationByClause(" limit " + constantes.getValueNumberUnit() + " offset " + constantes.getValueNumberUnit());

		
		try{
		tProceso = tProcesoManager.selectByExample(tProcesoExample).get(0);
		}catch(IndexOutOfBoundsException e){
			tProceso.clear();
		}
		return tProceso;
	}
	
	public TProceso getLastProcess(){

		tProcesoExample.clear();
		tProcesoExample.setOrderByClause("proc_id desc");
		tProcesoExample.setPaginationByClause(" limit " + constantes.getValueNumberUnit() + " offset " + constantes.getValueNumberUnit());

		
		try{
		tProceso = tProcesoManager.selectByExample(tProcesoExample).get(0);
		}catch(IndexOutOfBoundsException e){
			tProceso.clear();
		}
		return tProceso;
	}
	
	public TProcesoDetalle getLastDetProcess(){

		tProcesoDetalleExample.clear();
		tProcesoDetalleExample.setOrderByClause("proc_det_id desc");
		tProcesoDetalleExample.setPaginationByClause(" limit " + constantes.getValueNumberUnit() + " offset " + constantes.getValueNumberUnit());

		
		try{
		tProcesoDetalle = tProcesoDetalleManager.selectByExample(tProcesoDetalleExample).get(0);
		}catch(IndexOutOfBoundsException e){
			tProcesoDetalle.clear();
		}
		return tProcesoDetalle;
	}
	
	public boolean isTheFirstProcess(int idProcess, String typeLoadProcess){

		statesProceso.clear(); 
		statesProceso.add(constantes.getStateProcessCompletedCorrectly());
		statesProceso.add(constantes.getStateProcessCompletedErrors());
		
		tProcesoExample.clear();
		tProcesoExample.createCriteria().andProcIdLessThan(idProcess);
		tProcesoExample.createCriteria().andProcTipEqualTo(typeLoadProcess);
		tProcesoExample.createCriteria().andProcEstIn(statesProceso);
		
		return tProcesoManager.countByExample(tProcesoExample)>0;
	}
	
	public int getHoursAfterStartProcess(TProceso proceso){
		return Util.getHoursAfterDate(proceso.getProcFecIni());
	}
	
	public void startProcess(){
		
		insertProcess();
		
		tProceso = getLastProcess();
		
		if(typeLoadProcess.equals(constantes.getLoadProcessToGeneric())){
			//insertDetProcess(constantes.getIdTableGene());
			
			
			
			
		}
		if(typeLoadProcess.equals(constantes.getLoadProcessToDimensional())){
			
			
			insertDetProcess(constantes.getIdTableDimensionalDimEstado());
			tProcesoDetalle = getLastDetProcess();
			DimEstadoProcess dimEstadoProcess = new DimEstadoProcess(factory, sizePage, dateTimeFrom, dateTimeUntil, typeProcess, tProceso.getProcId());
			dimEstadoProcess.startProcess();
			tProcesoDetalle.setProcDetNumRegTot(dimEstadoProcess.getRecordTotal());
			tProcesoDetalle.setProcDetNumRegPro(dimEstadoProcess.getRecordProcessed());
			tProcesoDetalle.setProcDetNumRegRec(dimEstadoProcess.getRecordRejected());
			tProcesoDetalle.setProcDetFecFin(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetFecAct(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetEst(Integer.toString(dimEstadoProcess.getResultProcess()));
			updateDetProcess();
			updateCountRegProcess();
			
			insertDetProcess(constantes.getIdTableDimensionalDimFacturado());
			tProcesoDetalle = getLastDetProcess();
			DimFacturadoProcess dimFacturadoProcess = new DimFacturadoProcess(factory, sizePage, dateTimeFrom, dateTimeUntil, typeProcess, tProceso.getProcId());
			dimFacturadoProcess.startProcess();
			tProcesoDetalle.setProcDetNumRegTot(dimFacturadoProcess.getRecordTotal());
			tProcesoDetalle.setProcDetNumRegPro(dimFacturadoProcess.getRecordProcessed());
			tProcesoDetalle.setProcDetNumRegRec(dimFacturadoProcess.getRecordRejected());
			tProcesoDetalle.setProcDetFecFin(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetFecAct(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetEst(Integer.toString(dimFacturadoProcess.getResultProcess()));
			updateDetProcess();
			updateCountRegProcess();
			
			insertDetProcess(constantes.getIdTableDimensionalDimMoneda());
			tProcesoDetalle = getLastDetProcess();
			DimMonedaProcess dimMonedaProcess = new DimMonedaProcess(factory, sizePage, dateTimeFrom, dateTimeUntil, typeProcess, tProceso.getProcId());
			dimMonedaProcess.startProcess();
			tProcesoDetalle.setProcDetNumRegTot(dimMonedaProcess.getRecordTotal());
			tProcesoDetalle.setProcDetNumRegPro(dimMonedaProcess.getRecordProcessed());
			tProcesoDetalle.setProcDetNumRegRec(dimMonedaProcess.getRecordRejected());
			tProcesoDetalle.setProcDetFecFin(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetFecAct(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetEst(Integer.toString(dimMonedaProcess.getResultProcess()));
			updateDetProcess();
			updateCountRegProcess();
			
			insertDetProcess(constantes.getIdTableDimensionalDimTipoDocumento());
			tProcesoDetalle = getLastDetProcess();
			DimTipoDocumentoProcess dimTipoDocumentoProcess = new DimTipoDocumentoProcess(factory, sizePage, dateTimeFrom, dateTimeUntil, typeProcess, tProceso.getProcId());
			dimTipoDocumentoProcess.startProcess();
			tProcesoDetalle.setProcDetNumRegTot(dimTipoDocumentoProcess.getRecordTotal());
			tProcesoDetalle.setProcDetNumRegPro(dimTipoDocumentoProcess.getRecordProcessed());
			tProcesoDetalle.setProcDetNumRegRec(dimTipoDocumentoProcess.getRecordRejected());
			tProcesoDetalle.setProcDetFecFin(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetFecAct(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetEst(Integer.toString(dimTipoDocumentoProcess.getResultProcess()));
			updateDetProcess();
			updateCountRegProcess();
			
			insertDetProcess(constantes.getIdTableDimensionalDimTipoPago());
			tProcesoDetalle = getLastDetProcess();
			DimTipoPagoProcess dimTipoPagoProcess = new DimTipoPagoProcess(factory, sizePage, dateTimeFrom, dateTimeUntil, typeProcess, tProceso.getProcId());
			dimTipoPagoProcess.startProcess();
			tProcesoDetalle.setProcDetNumRegTot(dimTipoPagoProcess.getRecordTotal());
			tProcesoDetalle.setProcDetNumRegPro(dimTipoPagoProcess.getRecordProcessed());
			tProcesoDetalle.setProcDetNumRegRec(dimTipoPagoProcess.getRecordRejected());
			tProcesoDetalle.setProcDetFecFin(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetFecAct(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetEst(Integer.toString(dimTipoPagoProcess.getResultProcess()));
			updateDetProcess();
			updateCountRegProcess();
			
			insertDetProcess(constantes.getIdTableDimensionalDimTipoReparto());
			tProcesoDetalle = getLastDetProcess();
			DimTipoRepartoProcess dimTipoRepartoProcess = new DimTipoRepartoProcess(factory, sizePage, dateTimeFrom, dateTimeUntil, typeProcess, tProceso.getProcId());
			dimTipoRepartoProcess.startProcess();
			tProcesoDetalle.setProcDetNumRegTot(dimTipoRepartoProcess.getRecordTotal());
			tProcesoDetalle.setProcDetNumRegPro(dimTipoRepartoProcess.getRecordProcessed());
			tProcesoDetalle.setProcDetNumRegRec(dimTipoRepartoProcess.getRecordRejected());
			tProcesoDetalle.setProcDetFecFin(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetFecAct(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetEst(Integer.toString(dimTipoRepartoProcess.getResultProcess()));
			updateDetProcess();
			updateCountRegProcess();
			
			insertDetProcess(constantes.getIdTableDimensionalDimTipoRuta());
			tProcesoDetalle = getLastDetProcess();
			DimTipoRutaProcess dimTipoRutaProcess = new DimTipoRutaProcess(factory, sizePage, dateTimeFrom, dateTimeUntil, typeProcess, tProceso.getProcId());
			dimTipoRutaProcess.startProcess();
			tProcesoDetalle.setProcDetNumRegTot(dimTipoRutaProcess.getRecordTotal());
			tProcesoDetalle.setProcDetNumRegPro(dimTipoRutaProcess.getRecordProcessed());
			tProcesoDetalle.setProcDetNumRegRec(dimTipoRutaProcess.getRecordRejected());
			tProcesoDetalle.setProcDetFecFin(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetFecAct(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetEst(Integer.toString(dimTipoRutaProcess.getResultProcess()));
			updateDetProcess();
			updateCountRegProcess();
			
			insertDetProcess(constantes.getIdTableDimensionalDimUbigeo());
			tProcesoDetalle = getLastDetProcess();
			DimUbigeoProcess dimUbigeoProcess = new DimUbigeoProcess(factory, sizePage, dateTimeFrom, dateTimeUntil, typeProcess, tProceso.getProcId());
			dimUbigeoProcess.startProcess();
			tProcesoDetalle.setProcDetNumRegTot(dimUbigeoProcess.getRecordTotal());
			tProcesoDetalle.setProcDetNumRegPro(dimUbigeoProcess.getRecordProcessed());
			tProcesoDetalle.setProcDetNumRegRec(dimUbigeoProcess.getRecordRejected());
			tProcesoDetalle.setProcDetFecFin(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetFecAct(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetEst(Integer.toString(dimUbigeoProcess.getResultProcess()));
			updateDetProcess();
			updateCountRegProcess();

			insertDetProcess(constantes.getIdTableDimensionalDimZona());
			tProcesoDetalle = getLastDetProcess();
			DimZonaProcess dimZonaProcess = new DimZonaProcess(factory, sizePage, dateTimeFrom, dateTimeUntil, typeProcess, tProceso.getProcId());
			dimZonaProcess.startProcess();
			tProcesoDetalle.setProcDetNumRegTot(dimZonaProcess.getRecordTotal());
			tProcesoDetalle.setProcDetNumRegPro(dimZonaProcess.getRecordProcessed());
			tProcesoDetalle.setProcDetNumRegRec(dimZonaProcess.getRecordRejected());
			tProcesoDetalle.setProcDetFecFin(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetFecAct(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetEst(Integer.toString(dimZonaProcess.getResultProcess()));
			updateDetProcess();
			updateCountRegProcess();
			
			insertDetProcess(constantes.getIdTableDimensionalDimServicio());
			tProcesoDetalle = getLastDetProcess();
			DimServicioProcess dimServicioProcess = new DimServicioProcess(factory, sizePage, dateTimeFrom, dateTimeUntil, typeProcess, tProceso.getProcId());
			dimServicioProcess.startProcess();
			tProcesoDetalle.setProcDetNumRegTot(dimServicioProcess.getRecordTotal());
			tProcesoDetalle.setProcDetNumRegPro(dimServicioProcess.getRecordProcessed());
			tProcesoDetalle.setProcDetNumRegRec(dimServicioProcess.getRecordRejected());
			tProcesoDetalle.setProcDetFecFin(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetFecAct(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetEst(Integer.toString(dimServicioProcess.getResultProcess()));
			updateDetProcess();
			updateCountRegProcess();
			
			insertDetProcess(constantes.getIdTableDimensionalDimSede());
			tProcesoDetalle = getLastDetProcess();
			DimSedeProcess dimSedeProcess = new DimSedeProcess(factory, sizePage, dateTimeFrom, dateTimeUntil, typeProcess, tProceso.getProcId());
			dimSedeProcess.startProcess();
			tProcesoDetalle.setProcDetNumRegTot(dimSedeProcess.getRecordTotal());
			tProcesoDetalle.setProcDetNumRegPro(dimSedeProcess.getRecordProcessed());
			tProcesoDetalle.setProcDetNumRegRec(dimSedeProcess.getRecordRejected());
			tProcesoDetalle.setProcDetFecFin(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetFecAct(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetEst(Integer.toString(dimSedeProcess.getResultProcess()));
			updateDetProcess();
			updateCountRegProcess();
			
			insertDetProcess(constantes.getIdTableDimensionalDimProducto());
			tProcesoDetalle = getLastDetProcess();
			DimProductoProcess dimProductoProcess = new DimProductoProcess(factory, sizePage, dateTimeFrom, dateTimeUntil, typeProcess, tProceso.getProcId());
			dimProductoProcess.startProcess();
			tProcesoDetalle.setProcDetNumRegTot(dimProductoProcess.getRecordTotal());
			tProcesoDetalle.setProcDetNumRegPro(dimProductoProcess.getRecordProcessed());
			tProcesoDetalle.setProcDetNumRegRec(dimProductoProcess.getRecordRejected());
			tProcesoDetalle.setProcDetFecFin(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetFecAct(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetEst(Integer.toString(dimProductoProcess.getResultProcess()));
			updateDetProcess();
			updateCountRegProcess();
			
			insertDetProcess(constantes.getIdTableDimensionalDimPersonal());
			tProcesoDetalle = getLastDetProcess();
			DimPersonalProcess dimPersonalProcess = new DimPersonalProcess(factory, sizePage, dateTimeFrom, dateTimeUntil, typeProcess, tProceso.getProcId());
			dimPersonalProcess.startProcess();
			tProcesoDetalle.setProcDetNumRegTot(dimPersonalProcess.getRecordTotal());
			tProcesoDetalle.setProcDetNumRegPro(dimPersonalProcess.getRecordProcessed());
			tProcesoDetalle.setProcDetNumRegRec(dimPersonalProcess.getRecordRejected());
			tProcesoDetalle.setProcDetFecFin(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetFecAct(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetEst(Integer.toString(dimPersonalProcess.getResultProcess()));
			updateDetProcess();
			updateCountRegProcess();
			
			insertDetProcess(constantes.getIdTableDimensionalDimCliente());
			tProcesoDetalle = getLastDetProcess();
			DimClienteProcess dimClienteProcess = new DimClienteProcess(factory, sizePage, dateTimeFrom, dateTimeUntil, typeProcess, tProceso.getProcId());
			dimClienteProcess.startProcess();
			tProcesoDetalle.setProcDetNumRegTot(dimClienteProcess.getRecordTotal());
			tProcesoDetalle.setProcDetNumRegPro(dimClienteProcess.getRecordProcessed());
			tProcesoDetalle.setProcDetNumRegRec(dimClienteProcess.getRecordRejected());
			tProcesoDetalle.setProcDetFecFin(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetFecAct(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetEst(Integer.toString(dimClienteProcess.getResultProcess()));
			updateDetProcess();
			updateCountRegProcess();
			
			insertDetProcess(constantes.getIdTableDimensionalFactCotizacion());
			tProcesoDetalle = getLastDetProcess();
			FactCotizacionProcess FactCotizacionProcess = new FactCotizacionProcess(factory, sizePage, dateTimeFrom, dateTimeUntil, typeProcess, tProceso.getProcId());
			FactCotizacionProcess.startProcess();
			tProcesoDetalle.setProcDetNumRegTot(FactCotizacionProcess.getRecordTotal());
			tProcesoDetalle.setProcDetNumRegPro(FactCotizacionProcess.getRecordProcessed());
			tProcesoDetalle.setProcDetNumRegRec(FactCotizacionProcess.getRecordRejected());
			tProcesoDetalle.setProcDetFecFin(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetFecAct(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetEst(Integer.toString(FactCotizacionProcess.getResultProcess()));
			updateDetProcess();
			updateCountRegProcess();
			
			insertDetProcess(constantes.getIdTableDimensionalFactOrden());
			tProcesoDetalle = getLastDetProcess();
			FactOrdenProcess factOrdenProcess = new FactOrdenProcess(factory, sizePage, dateTimeFrom, dateTimeUntil, typeProcess, tProceso.getProcId());
			factOrdenProcess.startProcess();
			tProcesoDetalle.setProcDetNumRegTot(factOrdenProcess.getRecordTotal());
			tProcesoDetalle.setProcDetNumRegPro(factOrdenProcess.getRecordProcessed());
			tProcesoDetalle.setProcDetNumRegRec(factOrdenProcess.getRecordRejected());
			tProcesoDetalle.setProcDetFecFin(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetFecAct(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetEst(Integer.toString(factOrdenProcess.getResultProcess()));
			updateDetProcess();
			updateCountRegProcess();
			
			insertDetProcess(constantes.getIdTableDimensionalFactDespacho());
			tProcesoDetalle = getLastDetProcess();
			FactDespachoProcess factDespachoProcess = new FactDespachoProcess(factory, sizePage, dateTimeFrom, dateTimeUntil, typeProcess, tProceso.getProcId());
			factDespachoProcess.startProcess();
			tProcesoDetalle.setProcDetNumRegTot(factDespachoProcess.getRecordTotal());
			tProcesoDetalle.setProcDetNumRegPro(factDespachoProcess.getRecordProcessed());
			tProcesoDetalle.setProcDetNumRegRec(factDespachoProcess.getRecordRejected());
			tProcesoDetalle.setProcDetFecFin(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetFecAct(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetEst(Integer.toString(factDespachoProcess.getResultProcess()));
			updateDetProcess();
			updateCountRegProcess();
			
			insertDetProcess(constantes.getIdTableDimensionalFactEnvio());
			tProcesoDetalle = getLastDetProcess();
			FactEnvioProcess FactEnvioProcess = new FactEnvioProcess(factory, sizePage, dateTimeFrom, dateTimeUntil, typeProcess, tProceso.getProcId());
			FactEnvioProcess.startProcess();
			tProcesoDetalle.setProcDetNumRegTot(FactEnvioProcess.getRecordTotal());
			tProcesoDetalle.setProcDetNumRegPro(FactEnvioProcess.getRecordProcessed());
			tProcesoDetalle.setProcDetNumRegRec(FactEnvioProcess.getRecordRejected());
			tProcesoDetalle.setProcDetFecFin(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetFecAct(Util.getCurrentDateTime());
			tProcesoDetalle.setProcDetEst(Integer.toString(FactEnvioProcess.getResultProcess()));
			updateDetProcess();
			updateCountRegProcess();
			
			updateProcess();
		}
	}
	
	public void cancelProcess(int idProcess){
		
		tProceso.clear();
		
		tProceso.setProcId(idProcess);
		tProceso.setProcFecFin(Util.getCurrentDateTime());
		tProceso.setProcFecAct(Util.getCurrentDateTime());
		tProceso.setProcEst(constantes.getStateProcessCanceled());
		
		tProcesoManager.updateByPrimaryKeySelective(tProceso);
		
		tProcesoDetalle.clear();
		tProcesoDetalleExample.clear();
		
		tProcesoDetalle.setProcDetFecFin(Util.getCurrentDateTime());
		tProcesoDetalle.setProcDetFecAct(Util.getCurrentDateTime());
		tProcesoDetalle.setProcDetEst(constantes.getStateProcessCanceled());
		
		statesProceso.clear(); 
		statesProceso.add(constantes.getStateProcessCompletedCorrectly());
		statesProceso.add(constantes.getStateProcessCompletedErrors());
		tProcesoDetalleExample.createCriteria().andProcDetEstNotIn(statesProceso);
		tProcesoDetalleExample.createCriteria().andProcIdEqualTo(idProcess);
		
		tProcesoDetalleManager.updateByExampleSelective(tProcesoDetalle, tProcesoDetalleExample);
	}
	
	public void insertProcess(){
		
		tProceso.clear();
		tProceso.setProcTip(typeLoadProcess);
		tProceso.setProcFecDesde(Util.getDateTimeLongAsDate(dateTimeFrom));
		tProceso.setProcFecHasta(Util.getDateTimeLongAsDate(dateTimeUntil));
		tProceso.setProcCntRegXBloque(constantes.getSizePage());
		tProceso.setProcNumRegTot(constantes.getValueNumberCero());
		tProceso.setProcNumRegPro(constantes.getValueNumberCero());
		tProceso.setProcNumRegRec(constantes.getValueNumberCero());
		tProceso.setProcFecIni(Util.getCurrentDateTime());
		tProceso.setProcFecAct(Util.getCurrentDateTime());
		tProceso.setProcEst(constantes.getStateProcessStarted());
		tProcesoManager.insert(tProceso);
	}
	
	public void updateProcess(){
		tProceso.setProcNumRegTot(recordTotal);
		tProceso.setProcNumRegPro(recordProcessed);
		tProceso.setProcNumRegRec(recordRejected);
		tProceso.setProcFecFin(Util.getCurrentDateTime());
		tProceso.setProcFecAct(Util.getCurrentDateTime());
		tProceso.setProcEst(Integer.toString(resultProcess));
		tProcesoManager.updateByPrimaryKeySelective(tProceso);
	}
	
	public void insertDetProcess(int idTable){
		tProcesoDetalle.clear();
		tProcesoDetalle.setProcId(tProceso.getProcId());
		tProcesoDetalle.setProcTip(typeLoadProcess);
		tProcesoDetalle.setProcDetIdTable(idTable);
		tProcesoDetalle.setProcDetFecDesde(tProceso.getProcFecDesde());
		tProcesoDetalle.setProcDetFecHasta(tProceso.getProcFecHasta());
		tProcesoDetalle.setProcDetFecIni(Util.getCurrentDateTime());
		tProcesoDetalle.setProcDetFecAct(Util.getCurrentDateTime());
		tProcesoDetalle.setProcDetEst(constantes.getStateProcessStarted());
		tProcesoDetalleManager.insertSelective(tProcesoDetalle);
	}
	
	public void updateDetProcess(){
		resultProcess = Integer.parseInt(tProcesoDetalle.getProcDetEst());
		tProcesoDetalleManager.updateByPrimaryKeySelective(tProcesoDetalle);
	}
	
	public void updateCountRegProcess(){
		recordTotal = recordTotal + tProcesoDetalle.getProcDetNumRegTot();
		recordProcessed = recordProcessed + tProcesoDetalle.getProcDetNumRegPro();
		recordRejected = recordRejected + tProcesoDetalle.getProcDetNumRegRec();
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

	public int getProcess() {
		return process;
	}

	public void setProcess(int process) {
		this.process = process;
	}

	public String getTypeProcess() {
		return typeProcess;
	}

	public void setTypeProcess(String typeProcess) {
		this.typeProcess = typeProcess;
	}

	public TProceso gettProceso() {
		return tProceso;
	}

	public void settProceso(TProceso tProceso) {
		this.tProceso = tProceso;
	}

	public TProcesoDetalle gettProcesoDetalle() {
		return tProcesoDetalle;
	}

	public void settProcesoDetalle(TProcesoDetalle tProcesoDetalle) {
		this.tProcesoDetalle = tProcesoDetalle;
	}

	public TProcesoExample gettProcesoExample() {
		return tProcesoExample;
	}

	public void settProcesoExample(TProcesoExample tProcesoExample) {
		this.tProcesoExample = tProcesoExample;
	}

	public TProcesoDetalleExample gettProcesoDetalleExample() {
		return tProcesoDetalleExample;
	}

	public void settProcesoDetalleExample(
			TProcesoDetalleExample tProcesoDetalleExample) {
		this.tProcesoDetalleExample = tProcesoDetalleExample;
	}

	public TProcesoManager gettProcesoManager() {
		return tProcesoManager;
	}

	public void settProcesoManager(TProcesoManager tProcesoManager) {
		this.tProcesoManager = tProcesoManager;
	}

	public TProcesoDetalleManager gettProcesoDetalleManager() {
		return tProcesoDetalleManager;
	}

	public void settProcesoDetalleManager(
			TProcesoDetalleManager tProcesoDetalleManager) {
		this.tProcesoDetalleManager = tProcesoDetalleManager;
	}

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public List<String> getStatesProceso() {
		return statesProceso;
	}

	public void setStatesProceso(List<String> statesProceso) {
		this.statesProceso = statesProceso;
	}

	public String getTypeLoadProcess() {
		return typeLoadProcess;
	}

	public void setTypeLoadProcess(String typeLoadProcess) {
		this.typeLoadProcess = typeLoadProcess;
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
	
	
	
}
