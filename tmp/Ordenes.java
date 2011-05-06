/**
 * 
 */
package com.carga.ordenes;

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
public class Ordenes {

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

		System.out.println("Registered the driver ok, so let's make a connection.");

		Connection corigen = null, cdestino = null;

		try {
			corigen = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/db_demo", "postgres",
					"okamismo");

			cdestino = DriverManager.getConnection(
					"jdbc:postgresql://192.168.1.126:5432/db_pitsbi",
					"user_prueba", "!12345678");

			int ordenes_cliente = 0, ordenes_servicio = 0, ordenes_producto = 0, ordenes_treg = 0, ordenes_tini = 0, ordenes_tven = 0, ordenes_tdev = 0, ordenes_cantidad = 0;
			java.sql.Date ordenes_ingreso = null, ordenes_inicio = null, ordenes_vencimiento = null, ordenes_devolucion = null;
			String ordenes_estado = "", ordenes_serie = "", ordenes_orden = "";
			double ordenes_importe = 0.0, ordenes_igv = 0.0, ordenes_total = 0.0;

			int detorden_correlativo = 0;
			String detorden_estado = "", detorden_motivo = "";

			String detdespacho_estado = "", detdespacho_motivo = "";
			java.sql.Date detdespacho_salida = null, detdespacho_retorno = null, detdespacho_cierre = null, detdespacho_modificacion = null;
			int detdespacho_tsal = 0, detdespacho_tret = 0, detdespacho_tcie = 0, detdespacho_tmod = 0;

			String sqlConsultaOrdenes = "select "
					+ "cli.key_cliente as cliente, "
					+ "ser.key_servicio as servicio, "
					+ "pro.key_producto as producto, "
					+ "treg.key_tiempo as treg, "
					+ "ord.fechaingreso as ingreso, "
					+ "tini.key_tiempo as tini, "
					+ "ord.fechainicio as inicio, "
					+ "tven.key_tiempo as tven, "
					+ "ord.fechavencimiento as vencimiento, "
					+ "tdev.key_tiempo as tdev, "
					+ "ord.fechadevolucion as devolucion, "
					+ "ord.estadoorden as estado, "
					+ "ord.serie as serie, "
					+ "ord.orden as orden, "
					+ "ord.importe as importe, "
					+ "ord.igv as igv, "
					+ "ord.total as total, "
					+ "ord.cnt_digitado as cantidad "
					+ "from "
					+ "ordenes ord "
					+ "INNER JOIN dim_cliente cli ON ord.codcliente = cli.cod_cliente AND ord.codareacliente = cli.cod_area "
					+ "INNER JOIN dim_servicio ser ON ord.codservicio = ser.cod_servicio "
					+ "INNER JOIN dim_producto pro ON ord.codproducto = pro.cod_producto "
					+ "LEFT JOIN dim_tiempo treg ON ord.fechaingreso = treg.fec_fecha "
					+ "LEFT JOIN dim_tiempo tini ON ord.fechainicio = tini.fec_fecha "
					+ "LEFT JOIN dim_tiempo tven ON ord.fechavencimiento = tven.fec_fecha "
					+ "LEFT JOIN dim_tiempo tdev ON ord.fechadevolucion = tdev.fec_fecha";

			String sqlConsultaDetOrden = "select correlativo,codestado as estado, codmotivo as motivo "
					+ "from detordenes "
					+ "where orden = ? and serie = ? and codestado not in ('09','12')";

			String sqlConsultaDetDepacho = "select "
					+ "det.codestado as estado, "
					+ "det.codmotivo as motivo, "
					+ "tsal.key_tiempo as tsal, "
					+ "dep.fecsalida as salida, "
					+ "tret.key_tiempo as tret, "
					+ "dep.fecretorno as retorno, "
					+ "tcie.key_tiempo as tcie, "
					+ "dep.fechacierre as cierre, "
					+ "tmod.key_tiempo as tmod, "
					+ "dep.fechamod as modificacion "
					+ "from "
					+ "detdespacho det "
					+ "inner join despacho dep on det.serieguia = dep.serieguia and det.nroguia = dep.nroguia "
					+ "inner join dim_tiempo tsal on dep.fecsalida = tsal.fec_fecha "
					+ "inner join dim_tiempo tret on dep.fecretorno = tret.fec_fecha "
					+ "inner join dim_tiempo tcie on date(dep.fechacierre) = tcie.fec_fecha "
					+ "inner join dim_tiempo tmod on date(dep.fechamod) = tmod.fec_fecha "
					+ "where "
					+ "det.orden = ? and det.serie = ? and det.correlativo = ? "
					+ "order by salida desc limit 1";

			String sqlTextInsert = ""
					+ "INSERT INTO fact_orden"
					+ "(key_cliente, key_servicio, key_producto, key_tiempo_registro, key_tiempo_inicio, "
					+ "key_tiempo_vencimiento, key_tiempo_cierre, key_tiempo_devolucion, "
					+ "key_estado, num_dias_excedidos, cod_serie, cod_orden, "
					+ "num_cargos, num_cargos_anulados, num_cargos_entregados, num_cargos_fuerazona, "
					+ "num_cargos_motivados, num_cargos_perdidos, num_cargos_reenvios, "
					+ "num_importe, num_igv, num_total) "
					+ " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

			Statement psOrdenes = corigen.createStatement();
			ResultSet rsOrdenes = psOrdenes.executeQuery(sqlConsultaOrdenes);

			while (rsOrdenes.next()) {

				ordenes_cliente = rsOrdenes.getInt("cliente");
				ordenes_servicio = rsOrdenes.getInt("servicio");
				ordenes_producto = rsOrdenes.getInt("producto");
				ordenes_treg = rsOrdenes.getInt("treg");
				ordenes_tini = rsOrdenes.getInt("tini");
				ordenes_tven = rsOrdenes.getInt("tven");
				ordenes_tdev = rsOrdenes.getInt("tdev");
				ordenes_ingreso = rsOrdenes.getDate("ingreso");
				ordenes_inicio = rsOrdenes.getDate("inicio");
				ordenes_vencimiento = rsOrdenes.getDate("vencimiento");
				ordenes_devolucion = rsOrdenes.getDate("devolucion");
				ordenes_estado = rsOrdenes.getString("estado");
				ordenes_serie = rsOrdenes.getString("serie");
				ordenes_orden = rsOrdenes.getString("orden");
				ordenes_importe = rsOrdenes.getDouble("importe");
				ordenes_igv = rsOrdenes.getDouble("igv");
				ordenes_total = rsOrdenes.getDouble("total");
				ordenes_cantidad = rsOrdenes.getInt("cantidad");
				
				if (!"01".equals(ordenes_estado)
						&& !"03".equals(ordenes_estado)) {
					PreparedStatement psOrdenDet = corigen.prepareStatement(sqlConsultaDetOrden);
					psOrdenDet.setString(1, ordenes_orden);
					psOrdenDet.setString(2, ordenes_serie);
					ResultSet rsOrdenDet = psOrdenDet.executeQuery();

					while (rsOrdenDet.next()) {

						detorden_correlativo = rsOrdenDet.getInt("correlativo");
						detorden_estado = rsOrdenDet.getString("estado");
						detorden_motivo = rsOrdenDet.getString("motivo");

						PreparedStatement psDespachoDet = corigen.prepareStatement(sqlConsultaDetDepacho);
						psDespachoDet.setString(1, ordenes_orden);
						psDespachoDet.setString(2, ordenes_serie);
						psDespachoDet.setInt(3, detorden_correlativo);
						ResultSet rsDespachoDet = psDespachoDet.executeQuery();

						while (rsDespachoDet.next()) {
							detdespacho_estado = rsDespachoDet.getString("estado");
							detdespacho_motivo = rsDespachoDet.getString("motivo");
							detdespacho_tsal = rsDespachoDet.getInt("tsal");
							detdespacho_tret = rsDespachoDet.getInt("tret");
							detdespacho_tcie = rsDespachoDet.getInt("tcie");
							detdespacho_tmod = rsDespachoDet.getInt("tmod");
							detdespacho_salida = rsDespachoDet.getDate("salida");
							detdespacho_retorno = rsDespachoDet.getDate("retorno");
							detdespacho_cierre = rsDespachoDet.getDate("cierre");
							detdespacho_modificacion = rsDespachoDet.getDate("modificacion");

						}

					}
				} else {
					Prepara
				}

				

				
				// PreparedStatement psOrdenes =
				// corigen.prepareStatement(sqlConsultaOrdenes);
				// ResultSet rsGuias = psOrdenes.executeQuery();
				// while(rsGuias.next()){
				// PreparedStatement psEnvios =
				// cdestino.prepareStatement(sqlTextInsert);
				// psEnvios.setInt(1, rsGuias.getInt(1));
				// psEnvios.setInt(2, rsGuias.getInt(2));
				// psEnvios.setInt(3, rsGuias.getInt(3));
				// psEnvios.setInt(4, rsGuias.getInt(4));
				// psEnvios.setInt(5, rsGuias.getInt(5));
				// psEnvios.setInt(6, rsGuias.getInt(6));
				// psEnvios.setInt(7, rsGuias.getInt(7));
				// psEnvios.setInt(8, rsGuias.getInt(8));
				// psEnvios.setInt(9, rsGuias.getInt(9));
				// psEnvios.setInt(10, rsGuias.getInt(10));
				// psEnvios.setString(11, rsGuias.getString(11));
				// psEnvios.setString(12, rsGuias.getString(12));
				// psEnvios.setInt(13, rsGuias.getInt(13));
				// psEnvios.setInt(14, rsGuias.getInt(14));
				// psEnvios.setInt(15, rsGuias.getInt(15));
				// psEnvios.setInt(16, rsGuias.getInt(16));
				// psEnvios.setInt(17, rsGuias.getInt(17));
				// psEnvios.setInt(18, rsGuias.getInt(18));
				// psEnvios.setInt(19, rsGuias.getInt(19));
				// psEnvios.executeUpdate();
			}
			// }
		} catch (SQLException se) {
			System.out.println("Couldn't connect: print out a stack trace and exit.");
			se.printStackTrace();
			System.exit(1);
		}

	}

}
