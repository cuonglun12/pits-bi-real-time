package pe.com.j2techcon.bi.etl.process.generic;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.domain.generic.TProducto;
import pe.com.j2techcon.bi.etl.domain.generic.TProductoExample;
import pe.com.j2techcon.bi.etl.domain.origen.TProductos;
import pe.com.j2techcon.bi.etl.domain.origen.TProductosExample;
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
	
	private TProductoManager tProductoManager;
	private TProductosManager tProductosManager;
	
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

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public TProductoProcess(BeanFactory factory, int sizePage,
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
		stateRecordOrigen = constantes.getStateRecordNew();
		stateRecordGeneric = constantes.getStateRecordNew();

	}

	public int startProcess() {
		
		tProductoManager = factory.getBean("tProductoManager",TProductoManager.class);
		tProductosManager = factory.getBean("tProductosManager",TProductosManager.class);

		constantes = factory.getBean("constantes", Constantes.class);

		int offset = 0;

		while (true) {

			tProductosExample.clear();
			tProductosExample.createCriteria().andBiFecNumCamGreaterThanOrEqualTo(Util.getDateTimeLongAsDate(dateTimeFrom));
			tProductosExample.createCriteria().andBiFecNumCamLessThan(Util.getDateTimeLongAsDate(dateTimeUntil));
			tProductosExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			
			List<TProductos> lstProductos = tProductosManager.selectByExample(tProductosExample);

			if (lstProductos.size() > 0) {
				for (Iterator<TProductos> iterator = lstProductos.iterator(); iterator.hasNext();) {
					tProductos = iterator.next();
					tProducto.clear();
					processRecordProducto();
				}
				offset = offset + constantes.getSizePage();
			} else {
				tProductos.clear();
				tProductosExample.clear();

				tProducto.clear();
				tProductoExample.clear();

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

		return resultProcess;
	}

	public void processRecordProducto() {
		
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

	public void completeFieldProducto() {

		// Tipo de producto
		if(constantes.getParamCodeTipoProductoDocumento().equals(tProductos.getTipoproducto())){
			tProducto.setProdCodTip(constantes.getParamSerialTipoProductoDocumento());
		}
		else if (constantes.getParamCodeTipoProductoMuestra().equals(tProductos.getTipoproducto())){
			tProducto.setProdCodTip(constantes.getParamSerialTipoProductoMuestra());
		}
		else{
			tProducto.setProdCodTip(constantes.getParamSerialTipoProductoNoDefinido());
		}
		
		//Tipo de ambito
		if(constantes.getParamCodeTipoAmbitoLocal().equals(tProductos.getCodambito())){
			tProducto.setProdCodAmb(constantes.getParamSerialTipoAmbitoLocal());
		}else{
			tProducto.setProdCodAmb(constantes.getParamSerialTipoAmbitoNoDefinido());
		}
		
		//Tipo de negocio
		if(constantes.getParamCodeTipoNegocioMensajeria().equals(tProductos.getCodnegocio())){
			tProducto.setProdCodNeg(constantes.getParamSerialTipoNegocioMensajeria());
		}else{
			tProducto.setProdCodNeg(constantes.getParamSerialTipoNegocioNoDefinido());
		}
		
		//Datos generales del producto
		tProducto.setProdCod(tProductos.getCodproducto());
		tProducto.setProdDes(tProductos.getProducto());
		tProducto.setProdPre(new BigDecimal(constantes.getValueNumberCero()));
		
		//Campos de control
		tProducto.setFecNumCam(Util.getCurrentDateTimeAsLong());
		if(constantes.getStateRecordNew().equals(tProductos.getBiCodIndCam())){
			tProducto.setCodIndCam(constantes.getStateRecordNew());
		}else{
			tProducto.setCodIndCam(constantes.getStateRecordProcessed());
		}
		tProducto.setProcId(process);

	}

	public int insertRecordGenericProducto() {
		try {
			resultTransaction = tProductoManager.insertSelective(tProducto);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int updateRecordGenericProducto() {
		try {
			tProductoExample.clear();
			tProductoExample.createCriteria().andProdCodEqualTo(tProducto.getProdCod());	
			resultTransaction = tProductoManager.updateByExampleSelective(tProducto, tProductoExample);	
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int deleteRecordGenericProducto() {
		try {
			tProductoExample.clear();
			tProductoExample.createCriteria().andProdCodEqualTo(tProducto.getProdCod());	
			resultTransaction = tProductoManager.deleteByExample(tProductoExample);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public void updateRecordOrigenProducto(String statusRecord) {
		try {
			String idProducto = tProductos.getCodproducto();
			tProductos.clear();
			tProductos.setCodproducto(idProducto);
			tProductos.setBiCodIndCam(statusRecord);
			tProductosManager.updateByPrimaryKeySelective(tProductos);
		} catch (Exception e) {

		}
	}

}
