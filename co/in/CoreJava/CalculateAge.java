package co.in.CoreJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;



public class CalculateAge {
//		public static void main(String[] args) throws ParseException {
//		Date d = new Date();
//		SimpleDateFormat format = new SimpleDateFormat("dd/MMM/yyyy");
//		String str = format.format(d);
//		System.out.println(str);
//		
//		Date d1 = format.parse("22/Sep/1993");
//		String str1 = format.format(d1);
//		System.out.println(str1);
		
		
//	}
//	public static void main(String[] args) {
//		Date d = new Date();
//		Calendar c = Calendar.getInstance();
//		c.setTime(d);
//		int dof = c.get(Calendar.DAY_OF_YEAR);
//		
//		c.add(Calendar.DATE, -1);
//		Date yd = c.getTime();
//		
//		c.add(Calendar.DATE, 30);
//		
//		Date nt = c.getTime();
//	}
	
	

		public static void main(String[] args) {
			Calendar dob = new GregorianCalendar(1993, 9, 22);
			Calendar cd = new GregorianCalendar();
			
			int age = cd.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
			
			if ((dob.get(Calendar.MONTH) > cd.get(Calendar.MONTH)) ||(dob.get(Calendar.MONTH) == cd.get(Calendar.MONTH) && dob.get(Calendar.DAY_OF_MONTH) > cd.get(Calendar.DAY_OF_MONTH))) {
				age--;
			}
			System.out.println("Your age is "+age);
		}
	
	
}
