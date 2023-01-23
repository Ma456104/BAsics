package in.co.collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class TestMarksheet {
public static void main(String[] args) {
	List l = new ArrayList();
	Marksheet m1 = new Marksheet("101", "Manish", 21, 56, 36);
	Marksheet m2 = new Marksheet("102", "Rahul", 26, 27, 92);
	
	HashMap hm = new HashMap();
	hm.put(m1, "101");
	
	System.out.println(hm.get(m1));
	hm.put(m2, "102");
	l.add(m1);
	l.add(m2);
	System.out.println(l.contains(m1));
	System.out.println(l.contains(m2));
	
	Iterator it = l.iterator();
	while (it.hasNext()) {
		Marksheet m = (Marksheet) it.next();
		System.out.print(m.getRollNo());
		System.out.print(" " +m.getName());
		System.out.print(" "+m.getChemistry());
		System.out.print(" "+m.getMaths());
		System.out.print(" "+m.getPhysics());
		System.out.println();
	}
	
}
}
