package pe.com.j2techcon.bi.etl.main;

import pe.com.j2techcon.bi.etl.process.control.TProcesoProcess;

public class MainETL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TProcesoProcess tProcesoProcess = new TProcesoProcess();
		tProcesoProcess.start();
		
	}

}
