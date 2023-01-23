package in.co.collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetExp {
public static void main(String[] args) {
	HashSet hs = new HashSet();
	hs.add("Aman");
	hs.add("Manish");
	hs.add(10);
	hs.add(102.21);
	hs.add('a');
	hs.add('a');
	
	//HashSet duplicate element nahi leta hai
	System.out.println(hs);
	
	Iterator it = hs.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
		
	}
	SortedSet ss = new TreeSet();
//	ss.addAll(hs);
	System.out.println(ss.addAll(hs));
}
}
