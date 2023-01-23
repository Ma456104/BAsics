package in.co.OOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PersonSheet {
	private String name = null;
	private String add;
	private Date dob;

	SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getDob() {
		String st = sd.format(dob);

		return st;
	}

	public void setDob(String st) throws ParseException {
		dob = sd.parse(st);
//		this.dob = dob;
	}

	
}
