package in.co.collectionFramework;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExp {
	public static void main(String[] args) {
		SortedSet s = new TreeSet();
		s.add("Aditya");
		s.add("Manish");
		s.add("Aman");
		s.add("Neha");

		// Element are automatically sorted in ascending order
		for (Object o : s) {
			System.out.println(o);
		}
		
		//Get first element (Aditya)
		System.out.println(s.first());
		
		//Get last element (Neha)
		System.out.println(s.last());
	}
}
