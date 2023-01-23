package in.co.collectionFramework;

import java.util.ArrayList;

public class Collection {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add("Manish");
		list.add('c');
		list.add(true);
		list.add(10.20);
		System.out.println(list);

		ArrayList l = new ArrayList<>();
		l.add("Sumit");
		l.add('c');

		l.addAll(list);
		System.out.println(l);
		l.contains(list);
		
		boolean ans = l.contains("Sumit");
		System.out.println(ans);
		System.out.println(l.isEmpty());
		
		System.out.println(l.remove(0));
		System.out.println(l.size());
		
	}
}
