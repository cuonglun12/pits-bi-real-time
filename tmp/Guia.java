/**
 * 
 */
package com.carga.guia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author digitador
 * 
 */
public class Guia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Couldn't find the driver!");
			System.out.println("Let's print a stack trace, and exit.");
			cnfe.printStackTrace();
			System.exit(1);
		}

		System.out
				.println("Registered the driver ok, so let's make a connection.");

		Connection corigen = null, cdestino = null;

		try {
			corigen = DriverManager.getConnection(
					"jdbc:postgresql://192.168.1.126:5432/db_prueba", "user_prueba",
					"!12345678");

			cdestino = DriverManager.getConnection(
					"jdbc:postgresql://192.168.1.126:5432/db_pitsbi",
					"user_prueba", "!12345678");

			String sqlConsultaGuias = "select "
					+ "(CASE WHEN zonas.key_localizacion is not null THEN zonas.key_localizacion ELSE 0 END) as localizacion, "
					+ "sed.key_sede as sede, "
					+ "(CASE WHEN tsal.key_tiempo is not null THEN tsal.key_tiempo ELSE 0 END) as salida, "
					+ "dep.fecsalida as fecha_salida, "
					+ "(CASE WHEN tret.key_tiempo is not null THEN tret.key_tiempo ELSE 0 END) as retorno, "
					+ "dep.fecretorno as fecha_retorno, "
					+ "(CASE WHEN trea.key_tiempo is not null THEN trea.key_tiempo ELSE 0 END) as real, "
					+ "dep.fechacierre as fecha_cierre, "
					+ "dep.codestadoguia as estado, "
					+ "per.key_personal as mensajero, "
					+ "sed.key_sede as sede, "
					+ "dep.serieguia as serie, "
					+ "dep.nroguia as numero, "
					+ "dep.total as cantidad_total, "
					+ "dep.entregados as cantidad_entregados, "
					+ "dep.motivos as cantidad_motivados, "
					+ "dep.reenvios as cantidad_reenvios, "
					+ "dep.anulados as cantidad_anulados, "
					+ "dep.fuerazona as cantidad_fuerazona, "
					+ "dep.perdidos as cantidad_perdidos "
					+ "from "
					+ "despacho dep "
					+ "left join (select zon.codzona, loc.cod_ubigeo, loc.key_localizacion from zonas zon inner join dim_localizacion loc on zon.codzona = loc.cod_zona) as zonas on dep.codzona = zonas.codzona "
					+ "inner join dim_sede sed on dep.codsede = sed.cod_sede "
					+ "left join dim_tiempo tsal on dep.fecsalida = tsal.fec_fecha "
					+ "left join dim_tiempo tret on dep.fecretorno = tret.fec_fecha "
					+ "left join dim_tiempo trea on date(dep.fechacierre) = trea.fec_fecha "
					+ "inner join dim_personal per on dep.codmensajero = per.cod_codigopersonal ";
			
			String sqlConsultaLocalizacion="select " +
					"loc.key_localizacion as localizacion " +
					"from " +
					"detdespacho det " +
					"inner join detordenes deo on det.serie = deo.serie and det.orden = deo.orden and det.correlativo = deo.correlativo " +
					"inner join dim_localizacion loc on deo.ubigeo = loc.cod_ubigeo " +
					"where " +
					"det.serieguia = ? and det.nroguia = ? " +
					"limit 1";
			
			int keyLocalizacion = 0, estado_guia=0, cierre = 0, num_dias_excedidos = 0;
			java.sql.Date fecha_cierre = null;
			
			String sqlTextInsert = ""
					+ "INSERT INTO fac_guia(key_localizacion, key_tiempo_salida, " +
							"key_tiempo_retorno, key_tiempo_retorno_real, key_estado_guia, key_personal_mensajero, " +
							"key_sede, cod_serie, cod_guia, num_cargos_total, num_cargos_entregados, num_cargos_motivados, " +
							"num_cargos_reenvios, num_cargos_anulados, num_cargos_fuerazona, num_cargos_perdidos, num_dias_excedidos) " +
					" VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

			Statement psGuias = corigen.createStatement();
			ResultSet rsGuias = psGuias.executeQuery(sqlConsultaGuias);
			
			while (rsGuias.next()) {
				
				if(rsGuias.getInt("localizacion")==0){
					PreparedStatement psLocalizaciones = corigen.prepareStatement(sqlConsultaLocalizacion);
					psLocalizaciones.setString(1, rsGuias.getString("serie"));
					psLocalizaciones.setString(2, rsGuias.getString("numero"));
					ResultSet rsLocalizaciones = psLocalizaciones.executeQuery();
					while(rsLocalizaciones.next()){
						keyLocalizacion = rsLocalizaciones.getInt("localizacion");
					}
				}
				
				fecha_cierre = rsGuias.getDate("fecha_cierre"); 
				
				if(fecha_cierre!=null){
					if(fecha_cierre.compareTo(rsGuias.getDate("fecha_retorno"))>0){
						if("01".equals(rsGuias.getString("estado"))) estado_guia = 18;
						if("02".equals(rsGuias.getString("estado"))) estado_guia = 19;
						if("03".equals(rsGuias.getString("estado"))) estado_guia = 20;
						if("04".equals(rsGuias.getString("estado"))) estado_guia = 21;
						if("05".equals(rsGuias.getString("estado"))) estado_guia = 22;
						if("06".equals(rsGuias.getString("estado"))) estado_guia = 23;
						num_dias_excedidos = (new Long((fecha_cierre.getTime() - rsGuias.getDate("fecha_retorno").getTime()) / (1000 * 60 * 60 * 24))).intValue();
						if(keyLocalizacion == 0) estado_guia = 24;
					}else{
						if("01".equals(rsGuias.getString("estado"))) estado_guia = 11;
						if("02".equals(rsGuias.getString("estado"))) estado_guia = 12;
						if("03".equals(rsGuias.getString("estado"))) estado_guia = 13;
						if("04".equals(rsGuias.getString("estado"))) estado_guia = 14;
						if("05".equals(rsGuias.getString("estado"))) estado_guia = 15;
						if("06".equals(rsGuias.getString("estado"))) estado_guia = 16;
						num_dias_excedidos = 0;
						if(keyLocalizacion == 0) estado_guia = 17;
					}
					cierre = rsGuias.getInt("real"); 
				}else{
					estado_guia = 24;
					cierre = 0;
					num_dias_excedidos = 0;
				}
				
				PreparedStatement psInsertGuias = cdestino.prepareStatement(sqlTextInsert);
				psInsertGuias.setInt(1, keyLocalizacion);
				psInsertGuias.setInt(2, rsGuias.getInt("salida"));
				psInsertGuias.setInt(3, rsGuias.getInt("retorno"));
				psInsertGuias.setInt(4, cierre);
				psInsertGuias.setInt(5, estado_guia);
				psInsertGuias.setInt(6, rsGuias.getInt("mensajero"));
				psInsertGuias.setInt(7, rsGuias.getInt("sede"));
				psInsertGuias.setString(8, rsGuias.getString("serie"));
				psInsertGuias.setString(9, rsGuias.getString("numero"));
				psInsertGuias.setInt(10, rsGuias.getInt("cantidad_total"));
				psInsertGuias.setInt(11, rsGuias.getInt("cantidad_entregados"));
				psInsertGuias.setInt(12, rsGuias.getInt("cantidad_motivados"));
				psInsertGuias.setInt(13, rsGuias.getInt("cantidad_reenvios"));
				psInsertGuias.setInt(14, rsGuias.getInt("cantidad_anulados"));
				psInsertGuias.setInt(15, rsGuias.getInt("cantidad_fuerazona"));
				psInsertGuias.setInt(16, rsGuias.getInt("cantidad_perdidos"));
				psInsertGuias.setInt(17, num_dias_excedidos);
				psInsertGuias.executeUpdate();
			}
		} catch (SQLException se) {
			System.out.println("Couldn't connect: print out a stack trace and exit.");
			se.printStackTrace();
			System.exit(1);
		}

	}

	public int getEstado(Connection con, String estado) {
		int resultado = 0;

		return resultado;
	}

}
