package pe.com.j2techcon.bi.etl.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Util {
	
	public static int getDateString() {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		return Integer.parseInt(format.format((Calendar.getInstance()).getTime()));
	}
	
	public static int getDateString(java.util.Calendar date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		return Integer.parseInt(format.format(date.getTime()));
	}
	
	public static int getDateString(java.util.Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		return Integer.parseInt(format.format(date.getTime()));
	}
}
