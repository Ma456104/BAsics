package co.in.CoreJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String str = format.format(d);
		System.out.println("Date " + str);
		
		
		String st = new String("22/09/1993");
		Date d1 = format.parse(st);
		
		System.out.println(d1);
		
		
		
		
		
	}
}
