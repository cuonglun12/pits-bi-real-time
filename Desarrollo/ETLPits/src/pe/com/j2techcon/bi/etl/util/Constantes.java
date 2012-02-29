package pe.com.j2techcon.bi.etl.util;

public class Constantes {
	
	private String valueStringDefault;
	private int valueNumberDefault;
	
	private String stateRecordNew;
	private String stateRecordProcessed;
	private String stateRecordInconsistent;
	
	private String stateProcessStarted;
	private String stateProcessCompletedCorrectly;
	private String stateProcessCompletedErrors;

	private String typeProcessSimple;
	private String typeProcessReProcess;
	
	private int resultTransactionNoResult;
	
	private int resultProcessStarted;
	private int resultProcessCompletedCorrectly;
	private int resultProcessCompletedErrors;
	
	private int sizePage;

	public String getValueStringDefault() {
		return valueStringDefault;
	}

	public void setValueStringDefault(String valueStringDefault) {
		this.valueStringDefault = valueStringDefault;
	}

	public int getValueNumberDefault() {
		return valueNumberDefault;
	}

	public void setValueNumberDefault(int valueNumberDefault) {
		this.valueNumberDefault = valueNumberDefault;
	}

	public String getStateRecordNew() {
		return stateRecordNew;
	}

	public void setStateRecordNew(String stateRecordNew) {
		this.stateRecordNew = stateRecordNew;
	}

	public String getStateRecordProcessed() {
		return stateRecordProcessed;
	}

	public void setStateRecordProcessed(String stateRecordProcessed) {
		this.stateRecordProcessed = stateRecordProcessed;
	}

	public String getStateRecordInconsistent() {
		return stateRecordInconsistent;
	}

	public void setStateRecordInconsistent(String stateRecordInconsistent) {
		this.stateRecordInconsistent = stateRecordInconsistent;
	}

	public String getStateProcessStarted() {
		return stateProcessStarted;
	}

	public void setStateProcessStarted(String stateProcessStarted) {
		this.stateProcessStarted = stateProcessStarted;
	}

	public String getStateProcessCompletedCorrectly() {
		return stateProcessCompletedCorrectly;
	}

	public void setStateProcessCompletedCorrectly(
			String stateProcessCompletedCorrectly) {
		this.stateProcessCompletedCorrectly = stateProcessCompletedCorrectly;
	}

	public String getStateProcessCompletedErrors() {
		return stateProcessCompletedErrors;
	}

	public void setStateProcessCompletedErrors(String stateProcessCompletedErrors) {
		this.stateProcessCompletedErrors = stateProcessCompletedErrors;
	}

	public String getTypeProcessSimple() {
		return typeProcessSimple;
	}

	public void setTypeProcessSimple(String typeProcessSimple) {
		this.typeProcessSimple = typeProcessSimple;
	}

	public String getTypeProcessReProcess() {
		return typeProcessReProcess;
	}

	public void setTypeProcessReProcess(String typeProcessReProcess) {
		this.typeProcessReProcess = typeProcessReProcess;
	}

	public int getResultTransactionNoResult() {
		return resultTransactionNoResult;
	}

	public void setResultTransactionNoResult(int resultTransactionNoResult) {
		this.resultTransactionNoResult = resultTransactionNoResult;
	}

	public int getResultProcessStarted() {
		return resultProcessStarted;
	}

	public void setResultProcessStarted(int resultProcessStarted) {
		this.resultProcessStarted = resultProcessStarted;
	}

	public int getResultProcessCompletedCorrectly() {
		return resultProcessCompletedCorrectly;
	}

	public void setResultProcessCompletedCorrectly(
			int resultProcessCompletedCorrectly) {
		this.resultProcessCompletedCorrectly = resultProcessCompletedCorrectly;
	}

	public int getResultProcessCompletedErrors() {
		return resultProcessCompletedErrors;
	}

	public void setResultProcessCompletedErrors(int resultProcessCompletedErrors) {
		this.resultProcessCompletedErrors = resultProcessCompletedErrors;
	}

	public int getSizePage() {
		return sizePage;
	}

	public void setSizePage(int sizePage) {
		this.sizePage = sizePage;
	}

	@Override
	public String toString() {
		return "Constantes [valueStringDefault=" + valueStringDefault
				+ ", valueNumberDefault=" + valueNumberDefault
				+ ", stateRecordNew=" + stateRecordNew
				+ ", stateRecordProcessed=" + stateRecordProcessed
				+ ", stateRecordInconsistent=" + stateRecordInconsistent
				+ ", stateProcessStarted=" + stateProcessStarted
				+ ", stateProcessCompletedCorrectly="
				+ stateProcessCompletedCorrectly
				+ ", stateProcessCompletedErrors="
				+ stateProcessCompletedErrors + ", typeProcessSimple="
				+ typeProcessSimple + ", typeProcessReProcess="
				+ typeProcessReProcess + ", resultTransactionNoResult="
				+ resultTransactionNoResult + ", resultProcessStarted="
				+ resultProcessStarted + ", resultProcessCompletedCorrectly="
				+ resultProcessCompletedCorrectly
				+ ", resultProcessCompletedErrors="
				+ resultProcessCompletedErrors + ", sizePage=" + sizePage + "]";
	}

	
}


