package pe.com.j2techcon.bi.etl.process.dimensional;

import org.springframework.beans.factory.BeanFactory;

import pe.com.j2techcon.bi.etl.logic.dimensional.FactOrdenManager;

public class FactOrdenProcess {
	
	private BeanFactory factory;
	private int sizePage;
	private int dateTimeFrom;
	private int dateTimeUntil;
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

	public int getDateTimeUntil() {
		return dateTimeUntil;
	}

	public void setDateTimeUntil(int dateTimeUntil) {
		this.dateTimeUntil = dateTimeUntil;
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

	public FactOrdenProcess(BeanFactory factory, int sizePage,
			int dateTimeFrom, int dateTimeUntil, String typeProcess) {
		this.factory = factory;
		this.sizePage = sizePage;
		this.dateTimeFrom = dateTimeFrom;
		this.dateTimeUntil = dateTimeUntil;
		this.typeProcess = typeProcess;
		
		this.recordTotal = 0;
		this.recordProcessed = 0;
		this.recordRejected = 0;
		this.resultProcess = 0;
		this.resultTransaction = 0;
		
	}
	
	public int startProcess(){
		FactOrdenManager factOrdenManager = factory.getBean("factOrdenManager", FactOrdenManager.class);
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
