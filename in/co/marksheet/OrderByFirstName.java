package in.co.marksheet;

import java.util.Comparator;

public class OrderByFirstName implements Comparator<Marksheets>{

	@Override
	public int compare(Marksheets m1, Marksheets m2) {

		return m1.firstName.compareTo(m2.firstName);
	}

}
