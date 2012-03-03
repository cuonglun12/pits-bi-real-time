package pe.com.j2techcon.bi.etl.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Util {
	
	public static long getDateString() {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		return Long.parseLong(format.format((Calendar.getInstance()).getTime()));
	}
	
	public static long getDateString(java.util.Calendar date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		return Long.parseLong(format.format(date.getTime()));
	}
	
	public static long getDateString(java.util.Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		return Long.parseLong(format.format(date.getTime()));
	}
}
