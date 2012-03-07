package test;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.com.j2techcon.bi.etl.domain.control.TProceso;
import pe.com.j2techcon.bi.etl.domain.control.TProcesoExample;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimEstado;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimEstadoExample;
import pe.com.j2techcon.bi.etl.domain.generic.TOrden;
import pe.com.j2techcon.bi.etl.domain.generic.TOrdenExample;
import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.domain.generic.TParametroExample;
import pe.com.j2techcon.bi.etl.logic.control.TProcesoManager;
import pe.com.j2techcon.bi.etl.logic.dimensional.DimEstadoManager;
import pe.com.j2techcon.bi.etl.logic.generic.TOrdenManager;
import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;


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
		BeanFactory factory = new ClassPathXmlApplicationContext("application-context.xml");
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
		
		TOrdenManager manager = factory.getBean("tOrdenManager", TOrdenManager.class);
		TOrdenExample example = new TOrdenExample();
		example.createCriteria().andCodAreCliIsNotNull();
		List<TOrden> lst = manager.selectByExample(example);
		for (Iterator<TOrden> iterator = lst.iterator(); iterator.hasNext();) {
			TOrden tOrden = iterator.next();
			
			Date dateDefault = new GregorianCalendar(1900,0,1).getTime();
			System.out.println(dateDefault.compareTo(tOrden.getOrdFecIni()));
		}

	}

}
