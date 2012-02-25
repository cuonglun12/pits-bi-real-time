package pe.com.j2techcon.bi.etl.process.control;

public class ThreadTProcesoProcess extends Thread {

	private static ThreadTProcesoProcess INSTANCE = null;

	private ThreadTProcesoProcess() {
	}

	private synchronized static void createInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ThreadTProcesoProcess();
		}
	}

	public static ThreadTProcesoProcess getInstance() {
		if (INSTANCE == null)
			createInstance();
		return INSTANCE;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			System.out.println("Se creo el Thread");
			Thread.sleep(10*60*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
