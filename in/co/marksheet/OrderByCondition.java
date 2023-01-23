package in.co.marksheet;

import java.util.Comparator;

public class OrderByCondition implements Comparator<Marksheets>{

	@Override
	public int compare(Marksheets m1, Marksheets m2) {
		
			if (m1.firstName.equals(m2.firstName)) {
				return m1.lastName.compareTo(m2.lastName);
			} else {
				return m1.firstName.compareTo(m2.firstName);
			}
	}

}
