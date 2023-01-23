package in.co.collectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExp {
public static void main(String[] args) {
	HashSet hs = new HashSet<>();
	hs.add("Sumit");
	hs.add("Sagar");
	hs.add("Manish");
	hs.add("Aman");
	
	System.out.println(hs);
	
	Iterator it = hs.iterator();
	while (it.hasNext()) {
//		Object o = (Object) it.next();
		String str = (String) it.next();
		System.out.println(str);
	
	}
}
}
