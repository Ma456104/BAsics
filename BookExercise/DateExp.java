package BookExercise;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateExp {
public static void main(String[] args) {
	Date d = new Date();
	SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
	System.out.println(sd.format(d));
	LocalDate ld = LocalDate();
	
}
}
