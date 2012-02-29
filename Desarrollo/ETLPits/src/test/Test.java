package test;

import pe.com.j2techcon.bi.etl.domain.control.*;
import pe.com.j2techcon.bi.etl.domain.dimensional.*;
import pe.com.j2techcon.bi.etl.domain.generic.*;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
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

	}

}
