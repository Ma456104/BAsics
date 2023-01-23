package in.co.collectionFramework;

import java.util.ArrayList;

public class ArrayListImplements {
public static void main(String[] args) {
	ArrayList v = new ArrayList();
	v.add("One");
	v.add("Two");
	v.add("Three");
//	v.add("Chirag");
//	v.add("Brajesh");
	
	Integer i = new Integer(4);
	v.add(i);
	Integer value = (Integer) v.get(3);
	System.out.println("Index#3 value = "+value);
	
}
}
