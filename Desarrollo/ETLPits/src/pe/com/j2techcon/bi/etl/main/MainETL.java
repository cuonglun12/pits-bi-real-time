package pe.com.j2techcon.bi.etl.main;

import org.apache.log4j.Logger;

import pe.com.j2techcon.bi.etl.process.control.TProcesoProcess;

public class MainETL {

	/**
	 * @param args
	 * @throws Exception 
	 */
	
	static Logger log = Logger.getLogger(MainETL.class);
	
	public static void main(String[] args) throws Exception {
		TProcesoProcess tProcesoProcess = new TProcesoProcess();
		tProcesoProcess.start();
	}

}
