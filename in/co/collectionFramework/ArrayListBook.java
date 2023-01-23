package in.co.collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class ArrayListBook {
public static void main(String[] args) {
	ArrayList l = new ArrayList();
	
	l.add("Zero");
	l.add("One");
	l.add("Two");
	l.add("Three");
	//l.add("Four");
	l.add("Five");
	System.out.println(l);
	l.add(4, "Four");
	System.out.println(l);
	
	List synclist = Collections.synchronizedList(l);
	System.out.println("Synclist = "+synclist);
	
	
	
	//get an element by index
	String val = (String) l.get(1);
	System.out.println(val);
	
//	print all element
	for (Object ele : l) {
		String str = (String) ele;
		System.out.println(str);
	}
	
//	sort the list
	Collections.sort(l);
	System.out.println(l);
	
//	Create a sublist
	ArrayList subList = new ArrayList(l.subList(1, 4));
	System.out.println(subList);
	
//	Convert to array
	Object[] nums = l.toArray();
	
	for (int i = 0; i < nums.length; i++) {
		System.out.println(nums[i]);
	}
	
	
	
}
}
