package pe.com.j2techcon.bi.etl.process.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;
import pe.com.j2techcon.bi.etl.domain.generic.TSede;
import pe.com.j2techcon.bi.etl.domain.generic.TSedeExample;
import pe.com.j2techcon.bi.etl.domain.origen.Sedesprov;
import pe.com.j2techcon.bi.etl.domain.origen.SedesprovExample;
import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;
import pe.com.j2techcon.bi.etl.logic.generic.TSedeManager;
import pe.com.j2techcon.bi.etl.logic.origen.SedesprovManager;
import pe.com.j2techcon.bi.etl.util.Constantes;
import pe.com.j2techcon.bi.etl.util.Util;

public class TSedeProcess {

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
	
	private Sedesprov sedesprov;
	private SedesprovExample sedesprovExample;
	
	private TSede tSede;
	private TSedeExample tSedeExample;
	
	private TParametro tParametro;
	private TParametroExample tParametroExample;
	
	private SedesprovManager sedesprovManager;
	private TSedeManager tSedeManager;
	private TParametroManager tParametroManager;
	
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

	public Sedesprov getSedesprov() {
		return sedesprov;
	}

	public void setSedesprov(Sedesprov sedesprov) {
		this.sedesprov = sedesprov;
	}

	public SedesprovExample getSedesprovExample() {
		return sedesprovExample;
	}

	public void setSedesprovExample(SedesprovExample sedesprovExample) {
		this.sedesprovExample = sedesprovExample;
	}

	public TSede gettSede() {
		return tSede;
	}

	public void settSede(TSede tSede) {
		this.tSede = tSede;
	}

	public TSedeExample gettSedeExample() {
		return tSedeExample;
	}

	public void settSedeExample(TSedeExample tSedeExample) {
		this.tSedeExample = tSedeExample;
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

	public SedesprovManager getSedesprovManager() {
		return sedesprovManager;
	}

	public void setSedesprovManager(SedesprovManager sedesprovManager) {
		this.sedesprovManager = sedesprovManager;
	}

	public TSedeManager gettSedeManager() {
		return tSedeManager;
	}

	public void settSedeManager(TSedeManager tSedeManager) {
		this.tSedeManager = tSedeManager;
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

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	public TSedeProcess(BeanFactory factory, int sizePage, long dateTimeFrom,
			long dateTimeUntil, String typeProcess, int process) {
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

	public int startProcess() {
		
		sedesprovManager = factory.getBean("sedesprovManager",SedesprovManager.class);
		tSedeManager = factory.getBean("tSedeManager",TSedeManager.class);
		tParametroManager = factory.getBean("tParametroManager",TParametroManager.class);
		
		sedesprov = new Sedesprov();
		sedesprovExample = new SedesprovExample();
		
		tSede = new TSede();
		tSedeExample = new TSedeExample();
		
		tParametro = new TParametro();
		tParametroExample = new TParametroExample();
		
		lstParametro = new ArrayList<TParametro>();
		
		int offset = 0;
		
		while (true) {

			sedesprovExample.clear();

			sedesprovExample.createCriteria().andBiFecNumCamGreaterThanOrEqualTo(Util.getDateTimeLongAsDate(dateTimeFrom));
			sedesprovExample.createCriteria().andBiFecNumCamLessThan(Util.getDateTimeLongAsDate(dateTimeUntil));

			sedesprovExample.setPaginationByClause(" limit " + constantes.getSizePage() + " offset " + offset);
			
			List<Sedesprov> lstSedes = sedesprovManager.selectByExample(sedesprovExample);

			if (lstSedes.size() > 0) {
				for (Iterator<Sedesprov> iterator = lstSedes.iterator(); iterator.hasNext();) {
					sedesprov = iterator.next();
					tSede.clear();
					processRecordSede();
				}
				offset = offset + constantes.getSizePage();
			} else {

				lstSedes.clear();

				sedesprov.clear();
				sedesprovExample.clear();

				tSede.clear();
				tSedeExample.clear();
				
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

	public void processRecordSede() {
		
		completeFieldSede();
		
		if(typeProcess.equals(constantes.getTypeProcessSimple())){
			if(tSede.getCodIndCam().equals(constantes.getStateRecordNew())){
				if(insertRecordGenericSede()> constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordOrigen = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}else{
				if(updateRecordGenericSede() > constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1; 
				} else{
					stateRecordOrigen = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}else{
			if(updateRecordGenericSede() > constantes.getResultTransactionNoResult()){
				stateRecordOrigen = constantes.getStateRecordProcessed();
				recordProcessed = recordProcessed + 1; 
			}else{
				if(insertRecordGenericSede() > constantes.getResultTransactionNoResult()){
					stateRecordOrigen = constantes.getStateRecordProcessed();
					recordProcessed = recordProcessed + 1;
				}else{
					stateRecordOrigen = constantes.getStateRecordInconsistent();
					recordRejected = recordRejected + 1;
				}
			}
		}
		
		updateRecordOrigenSede(stateRecordOrigen);
		
	}

	public void completeFieldSede() {

		//Codigo de la sede
		tSede.setSedCod(sedesprov.getCodsede());
		
		//Ubicacion de la sede
		
		
		//Ubicacion
		if(sedesprov.getUbigeo() != null && sedesprov.getUbigeo().length()>0){
			tParametroExample.clear();
			tParametroExample.createCriteria().andParamCodTipEqualTo(constantes.getParamCodeUbigeoDistrito());
			tParametroExample.createCriteria().andParamCodEqualTo(sedesprov.getUbigeo());
			
			lstParametro = tParametroManager.selectByExample(tParametroExample);
			if(lstParametro.size()>0){
				tSede.setUbiId(lstParametro.get(0).getParamId());
			}else{
				tSede.setUbiId(constantes.getParamSerialUbigeoDistritoNoDefinido());
			}
		}else{
			tSede.setUbiId(constantes.getParamSerialUbigeoDistritoNoDefinido());
		}
		
		//Tipo de Sede: Valor por defecto
		tSede.setSedCodTip(constantes.getParamSerialTipoSedeNoDefinido());
		
		//Descripcion
		tSede.setSedDes(sedesprov.getNomsede());
		
		//Campos de control
		tSede.setFecNumCam(Util.getCurrentDateTimeAsLong());
		if(constantes.getStateRecordNew().equals(sedesprov.getBiCodIndCam())){
			tSede.setCodIndCam(constantes.getStateRecordNew());
		}else{
			tSede.setCodIndCam(constantes.getStateRecordProcessed());
		}
		tSede.setProcId(process);

	}

	public int insertRecordGenericSede() {
		try {
			resultTransaction = tSedeManager.insertSelective(tSede);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int updateRecordGenericSede() {
		try {
			tSedeExample.clear();
			tSedeExample.createCriteria().andSedCodEqualTo(tSede.getSedCod());	
			resultTransaction = tSedeManager.updateByExampleSelective(tSede, tSedeExample);	
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public int deleteRecordGenericSede() {
		try {
			tSedeExample.clear();
			tSedeExample.createCriteria().andSedCodEqualTo(tSede.getSedCod());	
			resultTransaction = tSedeManager.deleteByExample(tSedeExample);
		} catch (Exception e) {
			resultTransaction = constantes.getResultTransactionNoResult();
		}
		return resultTransaction;
	}

	public void updateRecordOrigenSede(String statusRecord) {
		try {
			String codSede = sedesprov.getCodsede();
			sedesprov.clear();
			sedesprov.setCodsede(codSede);
			sedesprov.setBiCodIndCam(statusRecord);
			sedesprovManager.updateByPrimaryKeySelective(sedesprov);
		} catch (Exception e) {

		}
	}

}
