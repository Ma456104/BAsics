package in.co.collect;

import java.util.Comparator;

public class OrderByFirstName implements Comparator<Marksheet1>{

	@Override
	public int compare(Marksheet1 m1, Marksheet1 m2) {
		
		return m1.firstName.compareTo(m2.firstName);
	}

}
