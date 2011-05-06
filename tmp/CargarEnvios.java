package com.carga.envios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CargarEnvios {

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
					"jdbc:postgresql://localhost:5432/db_demo", "postgres",
					"okamismo");
			
			cdestino = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/db_pitsbi", "postgres",
					"okamismo");

			Statement stmt = corigen.createStatement();
			ResultSet rs = stmt.executeQuery("select serieguia,nroguia from despacho order by serieguia, nroguia asc");

			String sqlTextGuias = "" +
					"SELECT " +
					"	loc.key_localizacion," +
					"	cli.key_cliente," +
					"	ser.key_servicio," +
					"	pro.key_producto," +
					"	tsal.key_tiempo," +
					"	tent.key_tiempo," +
					"	estado.key_estado," +
					"	per1.key_personal," +
					"	per2.key_personal," +
					"	per3.key_personal," +
					"	de.serieguia," +
					"	de.nroguia," +
					"	sum(CASE WHEN det.codestado!='' THEN 1 ELSE 0 END)," +
					"	sum(CASE WHEN det.codestado='04' THEN 1 ELSE 0 END)," +
					"	sum(CASE WHEN det.codestado='05' THEN 1 ELSE 0 END)," +
					"	sum(CASE WHEN det.codestado='06' THEN 1 ELSE 0 END)," +
					"	sum(CASE WHEN det.codestado='09' THEN 1 ELSE 0 END)," +
					"	sum(CASE WHEN det.codestado='07' THEN 1 ELSE 0 END)," +
					"	sum(CASE WHEN det.codestado='08' THEN 1 ELSE 0 END) " +
					"FROM " +
					"	despacho de " +
					"	INNER JOIN detdespacho det ON de.serieguia = det.serieguia AND de.nroguia = det.nroguia " +
					"	INNER JOIN ordenes ord ON det.serie = ord.serie AND det.orden = ord.orden " +
					"	INNER JOIN dim_localizacion loc ON de.codzona = loc.cod_zona " +
					"	INNER JOIN dim_cliente cli ON ord.codcliente = cli.cod_cliente AND ord.codareacliente = cli.cod_area " +
					"	INNER JOIN dim_servicio ser ON ord.codservicio = ser.cod_servicio " +
					"	INNER JOIN dim_producto pro ON ord.codproducto = pro.cod_producto " +
					"	INNER JOIN dim_tiempo tsal ON de.fecsalida = tsal.fec_fecha " +
					"	INNER JOIN dim_tiempo tent ON de.fecretorno = tent.fec_fecha " +
					"	INNER JOIN (SELECT key_estado,cod_estado FROM dim_estado WHERE cod_tipo = '01') AS estado ON de.codestadoguia = estado.cod_estado " +
					"	INNER JOIN dim_personal per1 ON de.codmensajero = per1.cod_codigopersonal " +
					"	INNER JOIN dim_personal per2 ON de.usuariodesp = per2.cod_codigopersonal " +
					"	INNER JOIN dim_personal per3 ON de.usuariocierre = per3.cod_codigopersonal " +
					"WHERE " +
					"	det.serieguia = ? and det.nroguia = ? " +
					"GROUP BY " +
					"	cli.key_cliente," +
					"	ser.key_servicio," +
					"	pro.key_producto," +
					"	loc.key_localizacion," +
					"	tsal.key_tiempo," +
					"	tent.key_tiempo," +
					"	estado.key_estado," +
					"	per1.key_personal," +
					"	per2.key_personal," +
					"	per3.key_personal," +
					"	de.serieguia," +
					"	de.nroguia";
			
			String sqlTextInsert = "" +
					"INSERT INTO" +
					"	fac_envio(" +
					"		key_localizacion, key_cliente, key_servicio, key_producto," +
					"		key_tiempo_salida, key_tiempo_entrada, key_estado_guia," +
					"		key_personal_mensajero, key_personal_salida, key_personal_entrada," +
					"		cod_serie, cod_guia, num_cargos_total," +
					"		num_cargos_entregados, num_cargos_motivados," +
					"		num_cargos_reenvios, num_cargos_anulados," +
					"		num_cargos_fuerazona, num_cargos_perdidos) " +
					"	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

			while (rs.next()) {
				PreparedStatement psGuias = corigen.prepareStatement(sqlTextGuias);
				psGuias.setString(1, rs.getString(1));
				psGuias.setString(2, rs.getString(2));
				ResultSet rsGuias = psGuias.executeQuery();
				while(rsGuias.next()){
					PreparedStatement psEnvios = cdestino.prepareStatement(sqlTextInsert);
					psEnvios.setInt(1, rsGuias.getInt(1));
					psEnvios.setInt(2, rsGuias.getInt(2));
					psEnvios.setInt(3, rsGuias.getInt(3));
					psEnvios.setInt(4, rsGuias.getInt(4));
					psEnvios.setInt(5, rsGuias.getInt(5));
					psEnvios.setInt(6, rsGuias.getInt(6));
					psEnvios.setInt(7, rsGuias.getInt(7));
					psEnvios.setInt(8, rsGuias.getInt(8));
					psEnvios.setInt(9, rsGuias.getInt(9));
					psEnvios.setInt(10, rsGuias.getInt(10));
					psEnvios.setString(11, rsGuias.getString(11));
					psEnvios.setString(12, rsGuias.getString(12));
					psEnvios.setInt(13, rsGuias.getInt(13));
					psEnvios.setInt(14, rsGuias.getInt(14));
					psEnvios.setInt(15, rsGuias.getInt(15));
					psEnvios.setInt(16, rsGuias.getInt(16));
					psEnvios.setInt(17, rsGuias.getInt(17));
					psEnvios.setInt(18, rsGuias.getInt(18));
					psEnvios.setInt(19, rsGuias.getInt(19));
					psEnvios.executeUpdate();
				}
			}
		} catch (SQLException se) {
			System.out.println("Couldn't connect: print out a stack trace and exit.");
			se.printStackTrace();
			System.exit(1);
		}

	}

}
