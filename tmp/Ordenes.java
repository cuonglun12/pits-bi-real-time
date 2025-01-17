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

			int ordenes_cliente = 0, ordenes_servicio = 0, ordenes_producto = 0, ordenes_treg = 0, ordenes_tini = 0, ordenes_tven = 0, ordenes_tdev = 0, ordenes_admision = 0, ordenes_digitado = 0;
			java.sql.Date ordenes_ingreso = null, ordenes_inicio = null, ordenes_vencimiento = null, ordenes_devolucion = null;
			String ordenes_estado = "", ordenes_serie = "", ordenes_orden = "";
			double ordenes_importe = 0.0, ordenes_igv = 0.0, ordenes_total = 0.0;

			int detorden_correlativo = 0;
			String detorden_estado = "", detorden_motivo = "";

			String detdespacho_estado = "", detdespacho_motivo = "";
			java.sql.Date detdespacho_salida = null, detdespacho_retorno = null, detdespacho_cierre = null, detdespacho_modificacion = null;
			int detdespacho_tsal = 0, detdespacho_tret = 0, detdespacho_tcie = 0, detdespacho_tmod = 0;

			// boolean buscarDetOrdenes = true, buscarDetDespacho = true;

			java.sql.Date despacho_salida = null, despacho_cierre = null, despacho_modificacion = null;
			int despacho_tsal = 0, despacho_tcie = 0, despacho_tmod = 0;
			
			int cantidad_cargos_anulados = 0, cantidad_cargos_entregados = 0, cantidad_cargos_fuerazona = 0, cantidad_cargos_motivados = 0, cantidad_cargos_perdidos = 0, cantidad_cargos_reenvios = 0;
			int estado_orden = 0;
			int num_dias_excedidos = 0;
			int cantidad = 0;
			int num_ord_cef = 0,num_ord_cff = 0, num_ord_pef = 0, num_ord_pff = 0, num_ord_anulados = 0, num_ord_incosistentes = 0, num_ord = 0;

			String sqlConsultaOrdenes = "select "
					+ "cli.key_cliente as cliente, "
					+ "ser.key_servicio as servicio, "
					+ "pro.key_producto as producto, "
					+ "(CASE WHEN treg.key_tiempo is not null THEN treg.key_tiempo ELSE 0 END) as treg, "
					+ "ord.fechaingreso as ingreso, "
					+ "(CASE WHEN tini.key_tiempo is not null THEN tini.key_tiempo ELSE 0 END) as tini, "
					+ "ord.fechainicio as inicio, "
					+ "(CASE WHEN tven.key_tiempo is not null THEN tven.key_tiempo ELSE 0 END) as tven, "
					+ "ord.fechavencimiento as vencimiento, "
					+ "(CASE WHEN tdev.key_tiempo is not null THEN tdev.key_tiempo ELSE 0 END) as tdev, "
					+ "ord.fechadevolucion as devolucion, "
					+ "ord.estadoorden as estado, "
					+ "ord.serie as serie, "
					+ "ord.orden as orden, "
					+ "ord.importe as importe, "
					+ "ord.igv as igv, "
					+ "ord.total as total, "
					+ "ord.cnt_admision as admision, "
					+ "ord.cnt_digitado as digitado "
					+ "from "
					+ "ordenes ord "
					+ "INNER JOIN dim_cliente cli ON ord.codcliente = cli.cod_cliente AND ord.codareacliente = cli.cod_area "
					+ "INNER JOIN dim_servicio ser ON ord.codservicio = ser.cod_servicio "
					+ "INNER JOIN dim_producto pro ON ord.codproducto = pro.cod_producto "
					+ "LEFT JOIN dim_tiempo treg ON ord.fechaingreso = treg.fec_fecha "
					+ "LEFT JOIN dim_tiempo tini ON ord.fechainicio = tini.fec_fecha "
					+ "LEFT JOIN dim_tiempo tven ON ord.fechavencimiento = tven.fec_fecha "
					+ "LEFT JOIN dim_tiempo tdev ON ord.fechadevolucion = tdev.fec_fecha "
					+ "where "
					+ "ord.serie||'-'||ord.orden not in (select cod_serie||'-'||cod_orden from fac_orden)";
					//+ "order by serie, orden";

			String sqlConsultaDetOrden = "select correlativo,codestado as estado, codmotivo as motivo "
					+ "from detordenes " + "where orden = ? and serie = ? ";
			// +
			// "where orden = ? and serie = ? and codestado not in ('09','12')";

			String sqlConsultaDetDepacho = "select "
					+ "det.codestado as estado, "
					//+ "det.codmotivo as motivo, "
					+ "(CASE WHEN tsal.key_tiempo is not null THEN tsal.key_tiempo ELSE 0 END) as tsal, "
					+ "dep.fecsalida as salida, "
					//+ "(CASE WHEN tret.key_tiempo is not null THEN tret.key_tiempo ELSE 0 END) as tret, "
					//+ "dep.fecretorno as retorno, "
					+ "(CASE WHEN tcie.key_tiempo is not null THEN tcie.key_tiempo ELSE 0 END) as tcie, "
					+ "dep.fechacierre as cierre, "
					+ "(CASE WHEN tmod.key_tiempo is not null THEN tmod.key_tiempo ELSE 0 END) as tmod, "
					+ "dep.fechamod as modificacion "
					+ "from "
					+ "detdespacho det "
					+ "inner join despacho dep on det.serieguia = dep.serieguia and det.nroguia = dep.nroguia "
					+ "inner join dim_tiempo tsal on dep.fecsalida = tsal.fec_fecha "
					//+ "inner join dim_tiempo tret on dep.fecretorno = tret.fec_fecha "
					+ "inner join dim_tiempo tcie on date(dep.fechacierre) = tcie.fec_fecha "
					+ "inner join dim_tiempo tmod on date(dep.fechamod) = tmod.fec_fecha "
					+ "where " + "det.orden = ? and det.serie = ? ";
			// + "det.orden = ? and det.serie = ? and det.correlativo = ? ";
			// + "order by salida desc limit 1";

			String sqlTextInsert = ""
					+ "INSERT INTO fac_orden"
					+ "(key_cliente, key_servicio, key_producto, key_tiempo_registro, key_tiempo_inicio, "
					+ "key_tiempo_vencimiento, key_tiempo_cierre, key_tiempo_devolucion, "
					+ "key_estado, num_dias_excedidos, cod_serie, cod_orden, "
					+ "num_cargos, num_cargos_anulados, num_cargos_entregados, num_cargos_fuerazona, "
					+ "num_cargos_motivados, num_cargos_perdidos, num_cargos_reenvios, "
					+ "num_importe, num_igv, num_total, num_ord_cef, num_ord_cff, num_ord_pef, num_ord_pff, num_ord_anulados, num_ord_incosistentes, num_ord) "
					+ " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

			Statement psOrdenes = corigen.createStatement();
			ResultSet rsOrdenes = psOrdenes.executeQuery(sqlConsultaOrdenes);

			while (rsOrdenes.next()) {

				cantidad_cargos_anulados = 0;
				cantidad_cargos_entregados = 0;
				cantidad_cargos_fuerazona = 0;
				cantidad_cargos_motivados = 0;
				cantidad_cargos_perdidos = 0;
				cantidad_cargos_reenvios = 0;

				// buscarDetOrdenes = true;
				// buscarDetDespacho = true;

				estado_orden = 0;

				num_dias_excedidos = 0;
				cantidad = 0;
				
				despacho_salida = null;
				despacho_cierre = null;
				despacho_modificacion = null;
				despacho_tsal = 0;
				despacho_tcie = 0;
				despacho_tmod = 0;
				
				num_ord_cef = 0;
				num_ord_cff = 0;
				num_ord_pef = 0;
				num_ord_pff = 0;
				num_ord_anulados = 0;
				num_ord_incosistentes = 0;
				num_ord = 0;

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
				ordenes_admision = rsOrdenes.getInt("admision");
				ordenes_digitado = rsOrdenes.getInt("digitado");


				if ("01".equals(ordenes_estado) || "03".equals(ordenes_estado)) {
					
					//System.out.println("1: "+new java.util.Date());
					
					PreparedStatement psOrdenDet = corigen.prepareStatement(sqlConsultaDetOrden);
					psOrdenDet.setString(1, ordenes_orden);
					psOrdenDet.setString(2, ordenes_serie);
					ResultSet rsOrdenDet = psOrdenDet.executeQuery();

					//System.out.println("2: "+new java.util.Date());
					
					num_ord = 1;
					
					while (rsOrdenDet.next()) {
						if ("01".equals(rsOrdenDet.getString("estado"))
								|| "02".equals(rsOrdenDet.getString("estado"))
								|| "03".equals(rsOrdenDet.getString("estado"))
								|| "10".equals(rsOrdenDet.getString("estado"))) {
							// buscarDetDespacho = false;
							if ("01".equals(ordenes_estado)) {
								estado_orden = 7;
								num_ord_pff = 1;
							}
							if ("03".equals(ordenes_estado)) {
								estado_orden = 7;
								num_ord_pff = 1;
							}
						}
					}
					
					//System.out.println("3: "+new java.util.Date());
					
					rsOrdenDet = null;
					System.gc();

					// if(buscarDetDespacho){
					// detorden_correlativo = rsOrdenDet.getInt("correlativo");
					// detorden_estado = rsOrdenDet.getString("estado");
					// detorden_motivo = rsOrdenDet.getString("motivo");

					//System.out.println("4: "+new java.util.Date());
					
					PreparedStatement psDespachoDet = corigen.prepareStatement(sqlConsultaDetDepacho);
					psDespachoDet.setString(1, ordenes_orden);
					psDespachoDet.setString(2, ordenes_serie);
					// psDespachoDet.setInt(3, detorden_correlativo);
					ResultSet rsDespachoDet = psDespachoDet.executeQuery();

					//System.out.println("5: "+new java.util.Date());
					
					while (rsDespachoDet.next()) {
						detdespacho_estado = rsDespachoDet.getString("estado");
						//detdespacho_motivo = rsDespachoDet.getString("motivo");
						detdespacho_tsal = rsDespachoDet.getInt("tsal");
						//detdespacho_tret = rsDespachoDet.getInt("tret");
						detdespacho_tcie = rsDespachoDet.getInt("tcie");
						detdespacho_tmod = rsDespachoDet.getInt("tmod");
						//detdespacho_salida = rsDespachoDet.getDate("salida");
						//detdespacho_retorno = rsDespachoDet.getDate("retorno");
						detdespacho_cierre = rsDespachoDet.getDate("cierre");
						detdespacho_modificacion = rsDespachoDet.getDate("modificacion");
						
						if("09".equals(detdespacho_estado)) cantidad_cargos_anulados = cantidad_cargos_anulados + 1;
						if("04".equals(detdespacho_estado)) cantidad_cargos_entregados = cantidad_cargos_entregados + 1;
						if("07".equals(detdespacho_estado)) cantidad_cargos_fuerazona = cantidad_cargos_fuerazona + 1;
						if("05".equals(detdespacho_estado)) cantidad_cargos_motivados = cantidad_cargos_motivados + 1;
						if("08".equals(detdespacho_estado)) cantidad_cargos_perdidos = cantidad_cargos_perdidos + 1;
						if("06".equals(detdespacho_estado)) cantidad_cargos_reenvios = cantidad_cargos_reenvios + 1;
						
						if(despacho_salida == null){
							
							despacho_salida = detdespacho_salida;
							despacho_cierre = detdespacho_cierre;
							despacho_modificacion = detdespacho_modificacion;
							
							despacho_tsal = detdespacho_tsal;
							despacho_tcie = detdespacho_tcie;
							despacho_tmod = detdespacho_tmod;
							
						}else{
							if(despacho_salida.compareTo(detdespacho_salida)<0){
								despacho_salida = detdespacho_salida;
								despacho_cierre = detdespacho_cierre;
								despacho_modificacion = detdespacho_modificacion;
								
								despacho_tsal = detdespacho_tsal;
								despacho_tcie = detdespacho_tcie;
								despacho_tmod = detdespacho_tmod;
							}
						}

					}
					
					//System.out.println("6: "+new java.util.Date());
					
					rsDespachoDet = null;
					System.gc();
					
					if(ordenes_vencimiento == null){
						estado_orden = 10;
						num_dias_excedidos = 0;
						num_ord_incosistentes = 1;
					}else{
						if(estado_orden == 7){
							if(ordenes_vencimiento.compareTo(new java.sql.Date((new java.util.Date()).getTime()))>0){
								estado_orden = 2;
								num_ord_pef = 1;
							}else{
								num_dias_excedidos = (new Long(((new java.sql.Date((new java.util.Date()).getTime())).getTime() - ordenes_vencimiento.getTime()) / (1000 * 60 * 60 * 24))).intValue();
							}
						}else{
							if(despacho_cierre != null){
								if(ordenes_vencimiento.compareTo(despacho_cierre)>0){
									estado_orden = 4;
									num_ord_cef = 1;
								}else{
									estado_orden = 9;
									num_ord_cff = 1;
									num_dias_excedidos = (new Long((despacho_cierre.getTime() - ordenes_inicio.getTime()) / (1000 * 60 * 60 * 24))).intValue();
								}
							}else if(despacho_cierre == null && despacho_modificacion != null){
								
								despacho_tcie = despacho_tmod;
								despacho_cierre = despacho_modificacion;
								
								if(ordenes_vencimiento.compareTo(despacho_cierre)>0){
									estado_orden = 4;
									num_ord_cef = 1;
								}else{
									estado_orden = 9;
									num_ord_cff = 1;
									num_dias_excedidos = (new Long((despacho_cierre.getTime() - ordenes_inicio.getTime()) / (1000 * 60 * 60 * 24))).intValue();
								}
							}else{
								despacho_tcie = 0;
								if(ordenes_vencimiento.compareTo(new java.sql.Date((new java.util.Date()).getTime()))>0){
									estado_orden = 5;
									num_ord_incosistentes = 1;
								}else{
									estado_orden = 10;
									num_ord_incosistentes = 1;
									num_dias_excedidos = (new Long(((new java.sql.Date((new java.util.Date()).getTime())).getTime() - ordenes_vencimiento.getTime()) / (1000 * 60 * 60 * 24))).intValue();
								}
							}						
						}
					}

					if (ordenes_digitado == 0)
						cantidad = ordenes_admision;
					else
						cantidad = ordenes_digitado;

					PreparedStatement psInsertOrdenes = cdestino.prepareStatement(sqlTextInsert);
					psInsertOrdenes.setInt(1, ordenes_cliente);
					psInsertOrdenes.setInt(2, ordenes_servicio);
					psInsertOrdenes.setInt(3, ordenes_producto);
					psInsertOrdenes.setInt(4, ordenes_treg);
					psInsertOrdenes.setInt(5, ordenes_tini);
					psInsertOrdenes.setInt(6, ordenes_tven);
					psInsertOrdenes.setInt(7, despacho_tcie);
					psInsertOrdenes.setInt(8, ordenes_tdev);
					psInsertOrdenes.setInt(9, estado_orden);
					psInsertOrdenes.setInt(10, num_dias_excedidos);
					psInsertOrdenes.setString(11, ordenes_serie);
					psInsertOrdenes.setString(12, ordenes_orden);
					psInsertOrdenes.setInt(13, cantidad);
					psInsertOrdenes.setInt(14, cantidad_cargos_anulados);
					psInsertOrdenes.setInt(15, cantidad_cargos_entregados);
					psInsertOrdenes.setInt(16, cantidad_cargos_fuerazona);
					psInsertOrdenes.setInt(17, cantidad_cargos_motivados);
					psInsertOrdenes.setInt(18, cantidad_cargos_perdidos);
					psInsertOrdenes.setInt(19, cantidad_cargos_reenvios);
					psInsertOrdenes.setDouble(20, ordenes_importe);
					psInsertOrdenes.setDouble(21, ordenes_igv);
					psInsertOrdenes.setDouble(22, ordenes_total);
					psInsertOrdenes.setInt(23, num_ord_cef);
					psInsertOrdenes.setInt(24, num_ord_cff);
					psInsertOrdenes.setInt(25, num_ord_pef);
					psInsertOrdenes.setInt(26, num_ord_pff);
					psInsertOrdenes.setInt(27, num_ord_anulados);
					psInsertOrdenes.setInt(28, num_ord_incosistentes);
					psInsertOrdenes.setInt(29, num_ord);
					
					psInsertOrdenes.executeUpdate();
					
					psInsertOrdenes = null;
					
					System.gc();
					// }

				} else {
					if ("00".equals(ordenes_estado)) {
						estado_orden = 6;
						num_ord_pff = 1;
					}
					// else if("01".equals(ordenes_estado)) {estado = 7;}
					else if ("02".equals(ordenes_estado)) {
						estado_orden = 8;
						num_ord_anulados = 1;
					}
					// /else if("03".equals(ordenes_estado)) {estado = 9;}
					else {
						estado_orden = 10;
						num_ord_incosistentes = 1;
					}

					if (ordenes_tini != 0) {
						if(ordenes_vencimiento != null){
							num_dias_excedidos = (new Long(((new java.sql.Date((new java.util.Date()).getTime())).getTime() - ordenes_vencimiento.getTime()) / (1000 * 60 * 60 * 24))).intValue();	
						}else{
							num_dias_excedidos = 0;
						}
					}

					if (ordenes_digitado == 0)
						cantidad = ordenes_admision;
					else
						cantidad = ordenes_digitado;

					PreparedStatement psInsertOrdenes = cdestino.prepareStatement(sqlTextInsert);
					psInsertOrdenes.setInt(1, ordenes_cliente);
					psInsertOrdenes.setInt(2, ordenes_servicio);
					psInsertOrdenes.setInt(3, ordenes_producto);
					psInsertOrdenes.setInt(4, ordenes_treg);
					psInsertOrdenes.setInt(5, ordenes_tini);
					psInsertOrdenes.setInt(6, ordenes_tven);
					psInsertOrdenes.setInt(7, 0);
					psInsertOrdenes.setInt(8, ordenes_tdev);
					psInsertOrdenes.setInt(9, estado_orden);
					psInsertOrdenes.setInt(10, num_dias_excedidos);
					psInsertOrdenes.setString(11, ordenes_serie);
					psInsertOrdenes.setString(12, ordenes_orden);
					psInsertOrdenes.setInt(13, cantidad);
					psInsertOrdenes.setInt(14, 0);
					psInsertOrdenes.setInt(15, 0);
					psInsertOrdenes.setInt(16, 0);
					psInsertOrdenes.setInt(17, 0);
					psInsertOrdenes.setInt(18, 0);
					psInsertOrdenes.setInt(19, 0);
					psInsertOrdenes.setDouble(20, ordenes_importe);
					psInsertOrdenes.setDouble(21, ordenes_igv);
					psInsertOrdenes.setDouble(22, ordenes_total);
					psInsertOrdenes.setInt(23, num_ord_cef);
					psInsertOrdenes.setInt(24, num_ord_cff);
					psInsertOrdenes.setInt(25, num_ord_pef);
					psInsertOrdenes.setInt(26, num_ord_pff);
					psInsertOrdenes.setInt(27, num_ord_anulados);
					psInsertOrdenes.setInt(28, num_ord_incosistentes);
					psInsertOrdenes.setInt(29, num_ord);
					psInsertOrdenes.executeUpdate();
					
					psInsertOrdenes = null;
					System.gc();

				}
			}
		} catch (SQLException se) {
			System.out.println("Couldn't connect: print out a stack trace and exit.");
			se.printStackTrace();
			System.exit(1);
		}

	}
}
