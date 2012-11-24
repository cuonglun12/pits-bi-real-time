package test;


import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.com.j2techcon.bi.etl.domain.generic.TCliente;
import pe.com.j2techcon.bi.etl.domain.origen.Sedesprov;
import pe.com.j2techcon.bi.etl.domain.origen.SedesprovExample;
import pe.com.j2techcon.bi.etl.logic.generic.TClienteManager;
import pe.com.j2techcon.bi.etl.logic.origen.SedesprovManager;




public class TestETL {

	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		BeanFactory factory = new ClassPathXmlApplicationContext("application-context.xml");
//		//TOrdenManager manager=factory.getBean("tOrdenManager", TOrdenManager.class);
//		//TOrdenExample tmp = new TOrdenExample();
//		//tmp.createCriteria().andCodIndCamEqualTo(" ");
//		//int id = 0;
//		//TOrden orden = manager.selectByPrimaryKey(id);
//		//System.out.println(orden.toString());
//		
//		//List<TOrden> lst = manager.selectByExample(tmp);
//		//for (Iterator<TOrden> iterator = lst.iterator(); iterator.hasNext();) {
//			//TOrden tOrden = iterator.next();
//			//System.out.println(tOrden.toString());
//			
//		//}
//		TParametroManager manager = factory.getBean("tParametroManager", TParametroManager.class);
//		TParametroExample example = new TParametroExample();
//		example.createCriteria().andCodIndCamIsNull();
//		List<TParametro> lst = manager.selectByExample(example);
//		for (Iterator<TParametro> iterator = lst.iterator(); iterator.hasNext();) {
//			TParametro tParametro = iterator.next();
//			System.out.println(tParametro.toString());
//		}
//		
//		
//
//	}
	
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("pe/com/j2techcon/bi/etl/resources/application-context.xml");
/*		TProcesoManager manager = factory.getBean("tProcesoManager", TProcesoManager.class);
		TProcesoExample example = new TProcesoExample();
		example.createCriteria().andProcCntRegXBloqueIsNotNull();
		List<TProceso> lst = manager.selectByExample(example);
		for (Iterator iterator = lst.iterator(); iterator.hasNext();) {
			TProceso tProceso = (TProceso) iterator.next();
			System.out.println(tProceso.toString());
		}*/
/*		
		TParametroManager manager = factory.getBean("tParametroManager", TParametroManager.class);
		TParametroExample example = new TParametroExample();
		example.createCriteria().andCodIndCamIsNotNull();
		List<TParametro> lst = manager.selectByExample(example);
		for (Iterator iterator = lst.iterator(); iterator.hasNext();) {
			TParametro tParametro = (TParametro) iterator.next();
			System.out.println(tParametro.toString());
		}*/
		
		SedesprovManager manager = factory.getBean("sedesprovManager",SedesprovManager.class);
		SedesprovExample example = new SedesprovExample();
		example.createCriteria().andNomsedeLike("%PUCALLPA%");
		List<Sedesprov> lst;

		
		while(true){
			
			try {
				lst = manager.selectByExample(example);
				for (Iterator<Sedesprov> iterator = lst.iterator(); iterator.hasNext();) {
					Sedesprov sede = iterator.next();
					System.out.println(sede.getCodsede() + "-" + sede.getNomsede());
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				java.lang.Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
