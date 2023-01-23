package in.co.collectionFramework;

import java.util.Vector;

public class VectorExp {
public static void main(String[] args) {
	Vector v = new Vector();
	v.add("One");
	v.add("Two");
	v.add("Three");
	
	Integer i = new Integer(4);
	v.add(i);
	Integer value = (Integer)v.get(3);
	System.out.println("Index#3 Value = "+value);
	
	
}
}
