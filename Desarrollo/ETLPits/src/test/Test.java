package test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.sun.org.apache.xerces.internal.impl.dv.xs.YearDV;

import pe.com.j2techcon.bi.etl.domain.control.*;
import pe.com.j2techcon.bi.etl.domain.dimensional.*;
import pe.com.j2techcon.bi.etl.domain.generic.*;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		TProceso x = new TProceso();
		System.out.println(x.toString());
		
		DimCliente a = new DimCliente();
		System.out.println(a.toString());
		
		DimEstado b = new DimEstado();
		System.out.println(b.toString());
		
		DimMoneda c = new DimMoneda();
		System.out.println(c.toString());
		
		DimPersonal d = new DimPersonal();
		System.out.println(d.toString());
		
		DimProducto e = new DimProducto();
		System.out.println(e.toString());
		
		DimSede f = new DimSede();
		System.out.println(f.toString());
		
		DimServicio g = new DimServicio();
		System.out.println(g.toString());
		
		DimTiempo h = new DimTiempo();
		System.out.println(h.toString());
		
		DimTipoDocumento i = new DimTipoDocumento();
		System.out.println(i.toString());
		
		DimTipoPago j = new DimTipoPago();
		System.out.println(j.toString());
		
		DimTipoReparto k = new DimTipoReparto();
		System.out.println(k.toString());
		
		DimTipoRuta l = new DimTipoRuta();
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
//		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
//		System.out.println(calendar2.get(Calendar.DAY_OF_MONTH));
//		
//		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
//		System.out.println(calendar2.get(Calendar.HOUR_OF_DAY));
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
		Calendar calendar = Calendar.getInstance();
		Date dateCurrent = new GregorianCalendar(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).getTime();
		Date dateCurrentMenor = new GregorianCalendar(calendar.get(Calendar.YEAR)-1,calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).getTime();
		Date dateCurrentMayor = new GregorianCalendar(calendar.get(Calendar.YEAR)+1,calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).getTime();
		System.out.println(dateCurrentMayor.compareTo(dateCurrent));
		System.out.println(dateCurrentMenor.compareTo(dateCurrent));

	}

}
