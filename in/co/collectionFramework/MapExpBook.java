package in.co.collectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapExpBook {
public static void main(String[] args) {
	HashMap m = new HashMap();
	m.put(101, "Manish");
	m.put(102, "Chirag");
	m.put(103, "Brajesh");
	m.put(104, "Aman");
	m.put(105, "Somesh");
	
	System.out.println(m);
	int size = m.size();
	String val = (String) m.get(104);
	System.out.println(val);
	m.remove(101);
	System.out.println(m);
	
	boolean flag = m.containsKey(104);
	flag = m.containsValue("Chirag");
	
	Set keys = m.keySet();
	for (Object k : keys) {
		System.out.println(k);
	}
	Collection value = m.values();//Get values
	Set keyValue = m.entrySet();//Get k-v pair
	
	
	
}
}
