package test;

import pe.com.j2techcon.bi.etl.process.control.ThreadTProcesoProcess;

public class TestThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("X");
		ThreadTProcesoProcess x = ThreadTProcesoProcess.getInstance();
		System.out.println(x.getAllStackTraces().toString());
		x.setName("X");
		x.start();
		
		System.out.println("Y");
		ThreadTProcesoProcess y = ThreadTProcesoProcess.getInstance();
		if(y.getName().equals("X")){
			System.out.println("Ya existe el Thread");
			y.setName("Z");
		}else{
			y.setName("Y");
			y.start();
		}
		

	}

}
