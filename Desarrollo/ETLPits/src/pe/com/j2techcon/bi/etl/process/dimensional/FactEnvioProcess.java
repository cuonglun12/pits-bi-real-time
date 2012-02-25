package pe.com.j2techcon.bi.etl.process.dimensional;

import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.logic.dimensional.FactEnvioManager;

public class FactEnvioProcess {
	
	private BeanFactory factory;
	private int sizePage;
	private int dateTimeFrom;
	private String typeProcess;
	
	private int recordTotal;
	private int recordProcessed;
	private int recordRejected;
	private int resultProcess;
	private int resultTransaction;

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

	public int getDateTimeFrom() {
		return dateTimeFrom;
	}

	public void setDateTimeFrom(int dateTimeFrom) {
		this.dateTimeFrom = dateTimeFrom;
	}

	public String getTypeProcess() {
		return typeProcess;
	}

	public void setTypeProcess(String typeProcess) {
		this.typeProcess = typeProcess;
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

	public FactEnvioProcess(BeanFactory factory, int sizePage,
			int dateTimeFrom, String typeProcess) {
		this.factory = factory;
		this.sizePage = sizePage;
		this.dateTimeFrom = dateTimeFrom;
		this.typeProcess = typeProcess;
		
		this.recordTotal = 0;
		this.recordProcessed = 0;
		this.recordRejected = 0;
		this.resultProcess = 0;
		this.resultTransaction = 0;
		
	}
	
	public int startProcess(){
		FactEnvioManager factEnvioManager = factory.getBean("factEnvioManager", FactEnvioManager.class);
		return getResultProcess();
	}
	
	public int insertRecord(){
		return getResultTransaction();
	}
	
	public int updateRecord(){
		return getResultTransaction();
	}
	
	public int deleteRecord(){
		return getResultTransaction();
	}
	
}
