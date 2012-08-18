package test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import com.sun.org.apache.xerces.internal.impl.dv.xs.YearDV;

import pe.com.j2techcon.bi.etl.domain.control.*;
import pe.com.j2techcon.bi.etl.domain.dimensional.*;
import pe.com.j2techcon.bi.etl.domain.generic.*;
import pe.com.j2techcon.bi.etl.domain.origen.Areacliente;
import pe.com.j2techcon.bi.etl.domain.origen.Cliente;
import pe.com.j2techcon.bi.etl.domain.origen.Despacho;
import pe.com.j2techcon.bi.etl.domain.origen.Detdespacho;
import pe.com.j2techcon.bi.etl.domain.origen.Detordenes;
import pe.com.j2techcon.bi.etl.domain.origen.Ordenes;
import pe.com.j2techcon.bi.etl.domain.origen.Personal;
import pe.com.j2techcon.bi.etl.domain.origen.Sedesprov;
import pe.com.j2techcon.bi.etl.domain.origen.TCotizaciones;
import pe.com.j2techcon.bi.etl.domain.origen.TProductos;
import pe.com.j2techcon.bi.etl.domain.origen.TServicios;
import pe.com.j2techcon.bi.etl.domain.origen.TTipopersonal;
import pe.com.j2techcon.bi.etl.domain.origen.Ubigeos;
import pe.com.j2techcon.bi.etl.domain.origen.Zonas;
import pe.com.j2techcon.bi.etl.util.Util;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		Areacliente x = new Areacliente();
		System.out.println(x.toString());
		
		Cliente a = new Cliente();
		System.out.println(a.toString());
		
		Despacho b = new Despacho();
		System.out.println(b.toString());
		
		Detdespacho c = new Detdespacho();
		System.out.println(c.toString());
		
		Detordenes d = new Detordenes();
		System.out.println(d.toString());
		
		Ordenes e = new Ordenes();
		System.out.println(e.toString());
		
		Personal f = new Personal();
		System.out.println(f.toString());
		
		Sedesprov g = new Sedesprov();
		System.out.println(g.toString());
		
		TCotizaciones h = new TCotizaciones();
		System.out.println(h.toString());
		
		TProductos i = new TProductos();
		System.out.println(i.toString());
		
		TServicios i0 = new TServicios();
		System.out.println(i0.toString());
		
		TTipopersonal j = new TTipopersonal();
		System.out.println(j.toString());
		
		Ubigeos k = new Ubigeos();
		System.out.println(k.toString());
		
		Zonas l = new Zonas();
		System.out.println(l.toString());
		
		DimZona m = new DimZona();
		System.out.println(m.toString());
		
		FactCotizacion n = new FactCotizacion();
		System.out.println(n.toString());
		
		FactDespacho o = new FactDespacho();
		System.out.println(o.toString());
		
		FactEnvio p = new FactEnvio();
		System.out.println(p.toString());
		
		FactOrden q = new FactOrden();
		System.out.println(q.toString());
		
		TAreaCliente a1 = new TAreaCliente();
		System.out.println(a1.toString());
		
		TCargo b1 = new TCargo();
		System.out.println(b1.toString());
		
		TCargoDespacho c1 = new TCargoDespacho();
		System.out.println(c1.toString());
		
		TCliente d1 = new TCliente();
		System.out.println(d1.toString());
		
		TCotizacion e1 = new TCotizacion();
		System.out.println(e1.toString());
		
		TDespacho f1 = new TDespacho();
		System.out.println(f1.toString());
		
		TEmpleado g1 = new TEmpleado();
		System.out.println(g1.toString());
		
		TEmpleadoCategoria h1 = new TEmpleadoCategoria();
		System.out.println(h1.toString());
		
		TOrden i1 = new TOrden();
		System.out.println(i1.toString());
		
		TParametro j1 = new TParametro();
		System.out.println(j1.toString());
		
		TProducto k1 = new TProducto();
		System.out.println(k1.toString());
		
		TSede l1 = new TSede();
		System.out.println(l1.toString());
		
		TServicio m1 = new TServicio();
		System.out.println(m1.toString());
		
		TUbigeo n1 = new TUbigeo();
		System.out.println(n1.toString());
		
		TZona o1 = new TZona();
		System.out.println(o1.toString());
		*/

//		Calendar calendar = Calendar.getInstance();
//		calendar.set(1900,1,1,1,1,1);
//		Date date = new GregorianCalendar(1900,1,1,1,1,1).getTime();
//		Calendar calendar2= new GregorianCalendar();
//		calendar2.setTime(date);
//		
//		System.out.println(date.getYear());
//		
//		System.out.println(calendar.get(Calendar.YEAR));
//		System.out.println(calendar2.get(Calendar.YEAR));
//		
//		System.out.println(calendar.get(Calendar.MONTH));
//		System.out.println(calendar2.get(Calendar.MONTH));
//		
//		System.out.println(calendar.get(Calendar.DAYOFMONTH));
//		System.out.println(calendar2.get(Calendar.DAYOFMONTH));
//		
//		System.out.println(calendar.get(Calendar.HOUROFDAY));
//		System.out.println(calendar2.get(Calendar.HOUROFDAY));
//		
//		System.out.println(calendar.get(Calendar.MINUTE));
//		System.out.println(calendar2.get(Calendar.MINUTE));
//		
//		System.out.println(calendar.get(Calendar.SECOND));
//		System.out.println(calendar2.get(Calendar.SECOND));
//		
//		System.out.println(date.getTime());
//		System.out.println(calendar.getTimeInMillis());
//		System.out.println(date.toString());
//		System.out.println(calendar.getTime().toString());
//		System.out.println(calendar.getTime().compareTo(date));
//		Calendar calendar = Calendar.getInstance();
//		Date dateCurrent = new GregorianCalendar(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAYOFMONTH)).getTime();
//		Date dateCurrentMenor = new GregorianCalendar(calendar.get(Calendar.YEAR)-1,calendar.get(Calendar.MONTH),calendar.get(Calendar.DAYOFMONTH)).getTime();
//		Date dateCurrentMayor = new GregorianCalendar(calendar.get(Calendar.YEAR)+1,calendar.get(Calendar.MONTH),calendar.get(Calendar.DAYOFMONTH)).getTime();
//		System.out.println(dateCurrentMayor.compareTo(dateCurrent));
//		System.out.println(dateCurrentMenor.compareTo(dateCurrent));
		
		//short a = (short)123;
		//System.out.println(a);
		
//		Long x = new Long(12222222);
//		x=Util.getCurrentDateTimeAsLong();
//		long y = new Long(1);
//		
//		System.out.println(Long.toString(x));
//		System.out.println(Long.toString(y));
		
//		List<String> letras = new ArrayList<String>();
//		letras.add("Uno");
//		letras.add("Dos");
//		letras.add("Tres");
//		letras.add("Cuatro");
//		
//		List<Integer> numeros = new ArrayList<Integer>();
//		numeros.add(1);
//		numeros.add(2);
//		numeros.add(3);
//		numeros.add(4);
//
//		for (Iterator<Integer> iteratorNumeros = numeros.iterator(); iteratorNumeros.hasNext();) {
//			System.out.println("Numero: "+iteratorNumeros.next());
//			for (Iterator<String> iteratorLetras = letras.iterator(); iteratorLetras.hasNext();) {
//				System.out.println("Letra: "+iteratorLetras.next());
//				
//			}
//		}
		
		BigDecimal a = new BigDecimal("123223.42424");
		System.out.println(a.toString());
		
		String x = null;
		if(x!= null && x.length()>0){
			System.out.println(x);
		}
		x = "123";
		if( x!= null && x.length()>0){
			System.out.println(x);
		}

	}

}
