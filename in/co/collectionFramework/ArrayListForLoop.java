package in.co.collectionFramework;

import java.util.ArrayList;

public class ArrayListForLoop {
public static void main(String[] args) {
	ArrayList a = new ArrayList();
	a.add("Manish");
	a.add("One");
	a.add("Two");
	a.add("Three");
	
	int size = a.size();
	for (int i = 0; i < size; i++) {
		System.out.println(i+ " : "+a.get(i));
	}
	
}
}
