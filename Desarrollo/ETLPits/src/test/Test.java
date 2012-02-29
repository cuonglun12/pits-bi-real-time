package test;

import pe.com.j2techcon.bi.etl.domain.generic.TAreaCliente;
import pe.com.j2techcon.bi.etl.domain.generic.TCliente;
import pe.com.j2techcon.bi.etl.domain.generic.TParametro;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TParametro x = new TParametro();
		TCliente y = new TCliente();
		x.setParamCod("XX");
		
		y.setCliDesCor(x.getParamCod());
		
		x.setParamCod("YY");
		
		y.setCliDesDir(x.getParamCod());
		
		
		System.out.println(y.toString());
		
		
		
	}

}
