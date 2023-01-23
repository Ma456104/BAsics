package in.co.collect;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheet1 {
public static void main(String[] args) {
	ArrayList m = new ArrayList();
	
	m.add(new Marksheet1("101", "Manish", "Chouhan", 101));
	m.add(new Marksheet1("102", "Sumit","Sharma", 33));
	m.add(new Marksheet1("103", "Sagar", "Singh", 55));
	m.add(new Marksheet1("104", "Aman","Shriwastav", 44));
	m.add(new Marksheet1("105", "Chirag", "Tiwari", 38));
	m.add(new Marksheet1("106", "Brajesh","Sharma", 78));
	
	Collections.sort(m, new OrderByCondition());
	for (Object v : m) {
		System.out.println(v);
	}
	
	
	
}
}
