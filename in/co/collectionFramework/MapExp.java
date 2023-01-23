package in.co.collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapExp {
public static void main(String[] args) {
	//Duplicate key can't give in map
	
	HashMap map = new HashMap();
	map.put(101, "Single");
	map.put(102, "Manish");
	map.put(103, "Aman");
	map.put(104, "Sanny");
	
	map.forEach((key, value) -> System.out.println(key+" = "+value));
	
			
	
	
	//System.out.println(map.get(101));
	
	
	Set keys = map.keySet();
	Iterator it = keys.iterator();
	while (it.hasNext()) {
	
		System.out.println(it.next());
	}
}
}
