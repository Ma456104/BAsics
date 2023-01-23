package in.co.collectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashTable_HashMap {
public static void main(String[] args) {
	HashMap m = new HashMap();
	m.put(101, "Manish");
	m.put(102, "Rahul");
	m.put(103, "Sonu");
	m.put(104, "Nitesh");
	
		//Integer i = (Integer) m.get(101);
		
		Set keys = m.keySet();
		
		for (Object k : keys) {
			System.out.println(k);
		}
		
		Collection val = m.values();
		for (Object v : val) {
			System.out.println(v);
		}
		
		Set keyValue = m.entrySet();
		for (Object ele : keyValue) {
			
		}
	
//	for (Iterator it = val.iterator(); it.hasNext();) {
//		String str = (String) it.next();
//		System.out.println(str);
//	}
	
}
}
