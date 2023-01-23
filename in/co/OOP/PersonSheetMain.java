package in.co.OOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PersonSheetMain {
	public static void main(String[] args) throws ParseException {

//		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
//		Date d = new Date("09/22/1993");
//		sd.format(d);

		PersonSheet ps = new PersonSheet();
		ps.setAdd("16/1, Sadar Bazar, Indore");
		ps.setName("Manish Chouhan");
//		ps.setDob(sd);
		ps.setDob("22/09/1993");
		System.out.println(ps.getName());
		System.out.println(ps.getAdd());
		System.out.println(ps.getDob());
		
		
		
	}
}
