package pe.com.j2techcon.bi.etl.process.generic;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;
import pe.com.j2techcon.bi.etl.domain.generic.TZona;
import pe.com.j2techcon.bi.etl.domain.generic.TZonaExample;
import pe.com.j2techcon.bi.etl.domain.origen.Zonas;
import pe.com.j2techcon.bi.etl.domain.origen.ZonasExample;
import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;
import pe.com.j2techcon.bi.etl.logic.generic.TZonaManager;
import pe.com.j2techcon.bi.etl.logic.origen.ZonasManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.util.Util;

public class TZonaProcess {

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
	
	private Zonas zonas;
	private ZonasExample zonasExample;
	
	private TZona tZona;
	private TZonaExample tZonaExample;
	
	private TParametroManager tParametroManager;
	private ZonasManager zonasManager;
	private TZonaManager tZonaManager;
	
	private List<TParametro> lstParametro;
	
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

	public Zonas getZonas() {
		return zonas;
	}

	public void setZonas(Zonas zonas) {
		this.zonas = zonas;
	}

	public ZonasExample getZonasExample() {
		return zonasExample;
	}

	public void setZonasExample(ZonasExample zonasExample) {
		this.zonasExample = zonasExample;
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

	public ZonasManager getZonasManager() {
		return zonasManager;
	}

	public void setZonasManager(ZonasManager zonasManager) {
		this.zonasManager = zonasManager;
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

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public TZonaProcess(BeanFactory factory, int sizePage, long dateTimeFrom,
			long dateTimeUntil, String typeProcess, int process) {
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
		
		tParametroManager = factory.getBean("tParametroManager",TParametroManager.class);
		zonasManager = factory.getBean("zonasManager",ZonasManager.class);
		tZonaManager = factory.getBean("tZonaManager", TZonaManager.class);

		constantes = factory.getBean("constantes", Constantes.class);

		int offset = 0;

		while (true) {

			zonasExample.clear();
			zonasExample.createCriteria().andBiFecNumCamGreaterThanOrEqualTo(Util.getDateTimeLongAsDate(dateTimeFrom));
			zonasExample.createCriteria().andBiFecNumCamLessThan(Util.getDateTimeLongAsDate(dateTimeUntil));
			zonasExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			
			List<Zonas> lstZonas = zonasManager.selectByExample(zonasExample);

			if (lstZonas.size() > 0) {
				for (Iterator<Zonas> iterator = lstZonas.iterator(); iterator.hasNext();) {
					zonas = iterator.next();
					tZona.clear();
					processRecordZona();
				}
				offset = offset + constantes.getSizePage();
			} else {

				lstZonas.clear();

				zonas.clear();
				zonasExample.clear();
				
				tZona.clear();
				tZonaExample.clear();
				
				tParametro.clear();
				tParametroExample.clear();

				lstParametro.clear();

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

	public void processRecordZona() {
		
		completeFieldZona();
		
		if(typeProcess.equals(constantes.getTypeProcessSimple())){
			if(tZona.getCodIndCam().equals(constantes.getStateRecordNew())){
				if(insertRecordGenericZona()> constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordOrigen = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}else{
				if(updateRecordGenericZona() > constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordOrigen = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}else{
			if(updateRecordGenericZona() > constantes.getResultTransactionNoResult()){
				stateRecordOrigen = constantes.getStateRecordProcessed();
				recordProcessed = recordProcessed + 1; 
			}else{
				if(insertRecordGenericZona() > constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1;
				}else{
					stateRecordOrigen = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}
		
		updateRecordOrigenZona(stateRecordOrigen);
		
	}

	public void completeFieldZona() {

		//Codigo de la zona
		tZona.setZonCod(zonas.getCodzona());
		
		//Ubigeo
		tParametroExample.clear();
		tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeUbigeoDistrito());
		tParametroExample.createCriteria().andParamCodEqualTo(zonas.getUbigeo());
		
		lstParametro = tParametroManager.selectByExample(tParametroExample);
		if(lstParametro.size()>0){
			tZona.setUbiId(lstParametro.get(0).getParamId());
		}else{
			tZona.setUbiId(constantes.getParamSerialUbigeoDistritoNoDefinido());
		}
		
		//Descripcion de la zona
		tZona.setZonDes(zonas.getDescripcion());
		
		//Codigo postal
		tZona.setZonCodPostal(zonas.getCodpostal());

		
		//Campos de control
		tZona.setFecNumCam(Util.getCurrentDateTimeAsLong());
		if(constantes.getStateRecordNew().equals(zonas.getBiCodIndCam())){
			tZona.setCodIndCam(constantes.getStateRecordNew());
		}else{
			tZona.setCodIndCam(constantes.getStateRecordProcessed());
		}
		tZona.setProcId(process);

	}

	public int insertRecordGenericZona() {
		try {
			resultTransaction = tZonaManager.insertSelective(tZona);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int updateRecordGenericZona() {
		try {
			tZonaExample.clear();
			tZonaExample.createCriteria().andZonCodEqualTo(tZona.getZonCod());	
			resultTransaction = tZonaManager.updateByExampleSelective(tZona, tZonaExample);	
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int deleteRecordGenericZona() {
		try {
			tZonaExample.clear();
			tZonaExample.createCriteria().andZonCodEqualTo(tZona.getZonCod());
			resultTransaction = tZonaManager.deleteByExample(tZonaExample);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public void updateRecordOrigenZona(String statusRecord) {
		try {
			String codZona = zonas.getCodzona();
			zonas.clear();
			zonas.setCodzona(codZona);
			zonas.setBiCodIndCam(statusRecord);
			zonasManager.updateByPrimaryKeySelective(zonas);
		} catch (Exception e) {

		}
	}

}
