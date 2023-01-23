package co.in.CoreJava;

import java.time.LocalDate;
import java.time.Period;

public class PeriodByDOB {
public static void main(String[] args) {
	LocalDate dob = LocalDate.of(1967, 7, 1);
	LocalDate curDate = LocalDate.now();
	Period period = Period.between(dob, curDate);
	
	System.out.printf("Your age is %d years %d months and %d days.",period.getYears(),period.getMonths(), period.getDays());
	System.out.println();
	
	System.out.println("Your age is : "+period.getYears()+" Years "+period.getMonths()+" Months "+ period.getDays()+" Days.");
}
}
