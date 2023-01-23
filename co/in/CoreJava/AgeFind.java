package co.in.CoreJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AgeFind {
public static void main(String[] args) throws ParseException {
	Date d = new Date();
	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	String str = format.format(d);
	
	
	String s = new String("22/09/2022");
	Date d1 = format.parse(s);
	System.out.println(s);
}
}
