package in.co.collect;

import java.util.Comparator;

public class OrderByCondition implements Comparator<Marksheet1> {

	@Override
	public int compare(Marksheet1 m1, Marksheet1 m2) {
		if (m1.firstName.equals(m2.firstName)) {
			return m1.lastName.compareTo(m2.lastName);
		} else {
			return m1.firstName.compareTo(m2.firstName);
		}

	}

}
