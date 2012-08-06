package pe.com.j2techcon.bi.etl.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Util {
	
	public static int getDateAsInteger(java.util.Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		return Integer.parseInt(format.format(date.getTime()));
	}
	
	public static long getDateTimeAsLong(java.util.Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		return Long.parseLong(format.format(date.getTime()));
	}
	
	public static Date getDateLongAsDate(long date) {
		Date result = null;
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		try {
			result =  format.parse(Long.toString(date));
		} catch (ParseException e) {
			result = getCurrentDate();
		}
		
		return result;
	}
	
	public static Date getDateTimeLongAsDate(long date) {
		Date result = null;
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		try {
			result =  format.parse(Long.toString(date));
		} catch (ParseException e) {
			result = getCurrentDateTime();
		}
		
		return result;
	}

	public static int getCurrentDateAsLong() {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		return Integer.parseInt(format.format((Calendar.getInstance()).getTime()));
	}
	
	public static long getCurrentDateTimeAsLong() {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		return Long.parseLong(format.format((Calendar.getInstance()).getTime()));
	}
	
	public static int getDateAsInteger(java.util.Calendar date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		return Integer.parseInt(format.format(date.getTime()));
	}
	
	public static long getDateTimeAsLong(java.util.Calendar date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		return Long.parseLong(format.format(date.getTime()));
	}
	
	public static Date getDateDefault() {
		return new GregorianCalendar(1900,0,1).getTime();
	}
	
	public static Date getDateTimeDefault() {
		return new GregorianCalendar(1900,0,1,1,1,1).getTime();
	}
	
	public static Date getCurrentDate() {
		Calendar calendar = Calendar.getInstance();
		return new GregorianCalendar(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).getTime();
	}
	
	public static Date getCurrentDateTime() {
		Calendar calendar = Calendar.getInstance();
		return new GregorianCalendar(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH),calendar.get(Calendar.HOUR_OF_DAY),calendar.get(Calendar.MINUTE),calendar.get(Calendar.SECOND)).getTime();
	}
	
	public static Date addToDate(Date date, int field, int amount){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(field, amount);
		return calendar.getTime();
	}
	
	public static Date addToDateTime(Date date, int field, int amount){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(field, amount);
		return calendar.getTime();
	}
	
	public static int getDaysBetweenDates(java.util.Date lateDate, java.util.Date earlyDate) {
		long ONE_HOUR = 60 * 60 * 1000L;
		return (int)((lateDate.getTime() - earlyDate.getTime() + ONE_HOUR) / (ONE_HOUR * 24));
	}
	
	public static int getDaysAfterDate(java.util.Date date) {
		long ONE_HOUR = 60 * 60 * 1000L;
		Calendar calendar = Calendar.getInstance();
		Date dateCurrent = new GregorianCalendar(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).getTime();
		return (int)((dateCurrent.getTime() - date.getTime() + ONE_HOUR) / (ONE_HOUR * 24));
	}
	
	public static int getHoursAfterDate(java.util.Date date) {
		long ONE_HOUR = 60 * 60 * 1000L;
		Calendar calendar = Calendar.getInstance();
		Date dateCurrent = new GregorianCalendar(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).getTime();
		return (int)((dateCurrent.getTime() - date.getTime() + ONE_HOUR) / (ONE_HOUR));
	}
	
	public static boolean areEqualsTwoDates(java.util.Date firstDate, java.util.Date secondDate){
		return (firstDate.compareTo(secondDate)==0);
	}
	
	public static boolean isEqualsWithDefaultDate(java.util.Date date){
		Date dateDefault = new GregorianCalendar(1900,0,1).getTime();
		return (date.compareTo(dateDefault)==0);
	}
	
	public static boolean isGreaterThanDefaultDate(java.util.Date date){
		Date dateDefault = new GregorianCalendar(1900,0,1).getTime();
		return (date.compareTo(dateDefault)>0);
	}
	
	public static boolean isLessThanDefaultDate(java.util.Date date){
		Date dateDefault = new GregorianCalendar(1900,0,1).getTime();
		return (date.compareTo(dateDefault)<0);
	}
	
	public static boolean isEqualsWithDefaultDateTime(java.util.Date date){
		Date dateDefault = new GregorianCalendar(1900,0,1,1,1,1).getTime();
		return (date.compareTo(dateDefault)==0);
	}
	
	public static boolean isGreaterThanDefaultDateTime(java.util.Date date){
		Date dateDefault = new GregorianCalendar(1900,0,1,1,1,1).getTime();
		return (date.compareTo(dateDefault)>0);
	}
	
	public static boolean isLessThanDefaultDateTime(java.util.Date date){
		Date dateDefault = new GregorianCalendar(1900,0,1,1,1,1).getTime();
		return (date.compareTo(dateDefault)<0);
	}
	
	public static boolean isEqualsWithCurrentDate(java.util.Date date){
		Calendar calendar = Calendar.getInstance();
		Date dateCurrent = new GregorianCalendar(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).getTime();
		return (date.compareTo(dateCurrent)==0);
	}
	
	public static boolean isGreaterThanCurrentDate(java.util.Date date){
		Calendar calendar = Calendar.getInstance();
		Date dateCurrent = new GregorianCalendar(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).getTime();
		return (date.compareTo(dateCurrent)>0);
	}
	
	public static boolean isLessThanCurrentDate(java.util.Date date){
		Calendar calendar = Calendar.getInstance();
		Date dateCurrent = new GregorianCalendar(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).getTime();
		return (date.compareTo(dateCurrent)<0);
	}
	
	public static boolean isEqualsWithCurrentDateTime(java.util.Date date){
		Calendar calendar = Calendar.getInstance();
		Date dateTimeCurrent = new GregorianCalendar(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH),calendar.get(Calendar.HOUR_OF_DAY),calendar.get(Calendar.MINUTE),calendar.get(Calendar.SECOND)).getTime();
		return (date.compareTo(dateTimeCurrent)==0);
	}
	
	public static boolean isGreaterThanCurrentDateTime(java.util.Date date){
		Calendar calendar = Calendar.getInstance();
		Date dateTimeCurrent = new GregorianCalendar(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH),calendar.get(Calendar.HOUR_OF_DAY),calendar.get(Calendar.MINUTE),calendar.get(Calendar.SECOND)).getTime();
		return (date.compareTo(dateTimeCurrent)>0);
	}
	
	public static boolean isLessThanCurrentDateTime(java.util.Date date){
		Calendar calendar = Calendar.getInstance();
		Date dateTimeCurrent = new GregorianCalendar(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH),calendar.get(Calendar.HOUR_OF_DAY),calendar.get(Calendar.MINUTE),calendar.get(Calendar.SECOND)).getTime();
		return (date.compareTo(dateTimeCurrent)<0);
	}

	public static boolean isGreaterThanAnotherDate(java.util.Date date, java.util.Date anotherDate){
		return (date.compareTo(anotherDate)>0);
	}
	
	public static boolean isLessThanAnotherDate(java.util.Date date, java.util.Date anotherDate){
		return (date.compareTo(anotherDate)<0);
	}
	
	public static boolean isGreaterThanAnotherDateTime(java.util.Date dateTime, java.util.Date anotherDateTime){
		return (dateTime.compareTo(anotherDateTime)>0);
	}
	
	public static boolean isLessThanAnotherDateTime(java.util.Date dateTime, java.util.Date anotherDateTime){
		return (dateTime.compareTo(anotherDateTime)<0);
	}
	
}
