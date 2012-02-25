package test;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.com.j2techcon.bi.etl.domain.control.TProceso;
import pe.com.j2techcon.bi.etl.domain.control.TProcesoExample;
import pe.com.j2techcon.bi.etl.domain.control.TProcesoExample.Criteria;
import pe.com.j2techcon.bi.etl.domain.dimensional.DimEstado;
import pe.com.j2techcon.bi.etl.domain.generic.TParametro;
import pe.com.j2techcon.bi.etl.logic.control.TProcesoManager;
import pe.com.j2techcon.bi.etl.logic.dimensional.DimEstadoManager;
import pe.com.j2techcon.bi.etl.logic.generic.TParametroManager;
import pe.com.j2techcon.bi.etl.util.Constantes;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("application-context.xml");
		TProcesoManager managerProcesoControl = factory.getBean("tProcesoManager", TProcesoManager.class);
		
		Constantes constantes = factory.getBean("constantes", Constantes.class);
		System.out.println(constantes.toString());
		
		//TParametroManager managerParametroGeneric = factory.getBean("tParametroManager", TParametroManager.class);
		//DimEstadoManager managerEstadoControl = factory.getBean("dimEstadoManager", DimEstadoManager.class);
		
		//List<TProceso> lstProcesos = managerProcesoControl.selectByExample(null);
		TProcesoExample example = new TProcesoExample();
		example.setOrderByClause(" proc_id asc");
		example.setPaginationByClause(" limit 3 offset 0 ");
		List<TProceso> lstProcesos = managerProcesoControl.selectByExample(example);
		
		for (Iterator iterator = lstProcesos.iterator(); iterator.hasNext();) {
			TProceso tProceso = (TProceso) iterator.next();
			System.out.println(tProceso.toString());
		}
		
		TProceso beanProceso1 = new TProceso();
		beanProceso1.setProcId(1);
		
		
		int resultado = 0;
		try {
			resultado = managerProcesoControl.insertSelective(beanProceso1);
		} catch (Exception e) {
			System.out.println("Resultado incorrecto = "+resultado);
		}
		
		TProceso beanProceso2 = new TProceso();
		beanProceso2.setProcTip("2");
		
		System.out.println("Resultado correcto = "+managerProcesoControl.insertSelective(beanProceso2));
		System.out.println("Resultado correcto = "+managerProcesoControl.deleteByPrimaryKey(2));
		System.out.println("Resultado no conocido = "+managerProcesoControl.deleteByPrimaryKey(20));
		
		beanProceso2 = managerProcesoControl.selectByPrimaryKey(3);
		//beanProceso2.setProcTip("9");
		//beanProceso2.setProcTip("9")
		
		
		TProceso x = new TProceso();
		x.setProcNumRegPro(200);
		
		TProcesoExample y = new TProcesoExample();
		y.createCriteria().andProcCntRegXBloqueEqualTo(0);
		
		try {
			System.out.println("Id = " + beanProceso2.getProcId());
			//resultado = managerProcesoControl.updateByPrimaryKeySelective(beanProceso2);
			resultado = managerProcesoControl.updateByExampleSelective(x, y);
			System.out.println("Numero de registros actualizados = "+resultado);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println("Resultado correcto = "+managerProcesoControl.insertSelective(beanProceso1));
		
		/*
		List<TParametro> lstParametros = managerParametroGeneric.selectByExample(null);
		
		for (Iterator iterator = lstParametros.iterator(); iterator.hasNext();) {
			TParametro tParametro = (TParametro) iterator.next();
			System.out.println(tParametro.toString());
			
		}
		
		List<DimEstado> lstEstados = managerEstadoControl.selectByExample(null);
		
		for (Iterator iterator = lstEstados.iterator(); iterator.hasNext();) {
			DimEstado dimEstado = (DimEstado) iterator.next();
			System.out.println(dimEstado.toString());
		}
		*/

	}

}
