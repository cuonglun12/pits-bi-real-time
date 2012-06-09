package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CargaDimTiempo {

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

		Connection cBi = null;

		try {
			cBi = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/db_bi", "postgres",
					"123456");
			Date fecha = new java.util.Date();
			fecha = new GregorianCalendar(2000,0,1).getTime();
			Calendar fechaCalendario = Calendar.getInstance();
			fechaCalendario.setTime(fecha);
			
			
			String sqlInsertDimTiempo = "INSERT INTO dim_tiempo (" +
					"tiempo_fecha," +
					"tiempo_dia_semana," +
					"tiempo_dia_mes," +
					"tiempo_nombre_dia," +
					"tiempo_semana_mes," +
					"tiempo_semana_anio," +
					"tiempo_mes," +
					"tiempo_nombre_mes," +
					"tiempo_trimestre," +
					"tiempo_nombre_trimestre," +
					"tiempo_semestre," +
					"tiempo_nombre_semestre," +
					"tiempo_anio) " +
				"VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			while(fechaCalendario.get(Calendar.YEAR)<2021){
				PreparedStatement psInsertDimTiempo = cBi.prepareStatement(sqlInsertDimTiempo);
				psInsertDimTiempo.setDate(1, new java.sql.Date(fechaCalendario.getTime().getTime()));
				psInsertDimTiempo.setInt(2,fechaCalendario.get(Calendar.DAY_OF_WEEK));
				psInsertDimTiempo.setInt(3,fechaCalendario.get(Calendar.DAY_OF_MONTH));
				psInsertDimTiempo.setString(4,nombreDia(fechaCalendario.get(Calendar.DAY_OF_WEEK)));
				psInsertDimTiempo.setInt(5,fechaCalendario.get(Calendar.WEEK_OF_MONTH));
				psInsertDimTiempo.setInt(6,fechaCalendario.get(Calendar.WEEK_OF_YEAR));
				psInsertDimTiempo.setInt(7,fechaCalendario.get(Calendar.MONTH)+1);
				psInsertDimTiempo.setString(8,nombreMes(fechaCalendario.get(Calendar.MONTH)));
				psInsertDimTiempo.setInt(9,numeroTrimestre(fechaCalendario.get(Calendar.MONTH)));
				psInsertDimTiempo.setString(10,nombreTrimestre(numeroTrimestre(fechaCalendario.get(Calendar.MONTH))));
				psInsertDimTiempo.setInt(11,numeroSemestre(fechaCalendario.get(Calendar.MONTH)));
				psInsertDimTiempo.setString(12,nombreSemestre(numeroSemestre(fechaCalendario.get(Calendar.MONTH))));
				psInsertDimTiempo.setInt(13,fechaCalendario.get(Calendar.YEAR));
				psInsertDimTiempo.executeUpdate();
				
				fechaCalendario.add(Calendar.DATE,1);	
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static String nombreDia(int dia){
		String nombre = "";
		switch (dia){
		case 1: nombre="LUNES"; break;
		case 2: nombre="MARTES"; break;
		case 3: nombre="MIERCOLES"; break;
		case 4: nombre="JUEVES"; break;
		case 5: nombre="VIERNES"; break;
		case 6: nombre="SABADO"; break;
		case 7: nombre="DOMINGO"; break;
		}
		return nombre;
	}
	
	public static String nombreMes(int mes){
		String nombre = "";
		switch (mes) {
        case 0:  nombre = "ENERO"; break;
        case 1:  nombre = "FEBRERO"; break;
        case 2:  nombre = "MARZO"; break;
        case 3:  nombre = "ABRIL"; break;
        case 4:  nombre = "MAYO"; break;
        case 5:  nombre = "JUNIO"; break;
        case 6:  nombre = "JULIO"; break;
        case 7:  nombre = "AGOSTO"; break;
        case 8:  nombre = "SETIEMBRE"; break;
        case 9:  nombre = "OCTUBRE"; break;
        case 10: nombre = "NOVIEMBRE"; break;
        case 11: nombre = "DICIEMBRE"; break;
    }
		return nombre;
	}
	
	public static int numeroTrimestre(int mes){
		int trimestre = 0;
		switch(mes){
		case 0: trimestre = 1; break;
		case 1: trimestre = 1; break;
		case 2: trimestre = 1; break;
		case 3: trimestre = 2; break;
		case 4: trimestre = 2; break;
		case 5: trimestre = 2; break;
		case 6: trimestre = 3; break;
		case 7: trimestre = 3; break;
		case 8: trimestre = 3; break;
		case 9: trimestre = 4; break;
		case 10: trimestre = 4; break;
		case 11: trimestre = 4; break;
		}
		return trimestre;
	}
	
	public static int numeroSemestre(int mes){
		int trimestre = 0;
		switch(mes){
		case 0: trimestre = 1; break;
		case 1: trimestre = 1; break;
		case 2: trimestre = 1; break;
		case 3: trimestre = 1; break;
		case 4: trimestre = 1; break;
		case 5: trimestre = 1; break;
		case 6: trimestre = 2; break;
		case 7: trimestre = 2; break;
		case 8: trimestre = 2; break;
		case 9: trimestre = 2; break;
		case 10: trimestre = 2; break;
		case 11: trimestre = 2; break;
		}
		return trimestre;
	}
	
	public static String nombreTrimestre(int trimestre){
		String nombre = "";
		switch(trimestre){
		case 1: nombre = "1ER TRI"; break;
		case 2: nombre = "2DO TRI"; break;
		case 3: nombre = "3ER TRI"; break;
		case 4: nombre = "4TO TRI"; break;
		}
		return nombre;
	}
	
	public static String nombreSemestre(int semestre){
		String nombre = "";
		switch(semestre){
		case 1: nombre = "1ER SEM"; break;
		case 2: nombre = "2DO SEM"; break;
		}
		return nombre;
	}

}

