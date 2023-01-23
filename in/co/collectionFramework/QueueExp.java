package in.co.collectionFramework;

import java.util.LinkedList;

public class QueueExp {
public static void main(String[] args) {
	LinkedList l = new LinkedList();
	l.offer("Manish");
	l.offer("Chirag");
	l.offer("Brajesh");
	l.offer('a');
	l.add('b');
	
	System.out.println(l);
	
	System.out.println(l.peek());//1st head of the list
	System.out.println(l.poll());
	
	System.out.println(l.peek());
	
	System.out.println(l.poll());
	
	System.out.println(l);
	
}
}
