package in.co.collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorBook {
	public static void main(String[] args) {
		Collection c = new ArrayList();

		c.add(10);
		c.add("Manish");
		c.add(10.22);
		c.add('c');

		Iterator it = c.iterator();

	while (it.hasNext()) {
		Object o = it.next();
		System.out.println(o);
	}
	}

}
