package in.co.collectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExp {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet<>();
		ts.add("Manish");
		ts.add("Aman");
		ts.add("Sumit");
		ts.add("Sagar");
		
		System.out.println(ts);
		
		Iterator it = ts.iterator();
		while (it.hasNext()) {
//			Object object = (Object) it.next();
			String str = (String) it.next();
			
			System.out.println(str);
		}
	}
	
}
