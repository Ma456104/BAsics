package in.co.collectionFramework;

import java.util.Stack;

public class StackExp {
public static void main(String[] args) {
	Stack st = new Stack<>();
	
	st.push(12);
	st.push(51);
	st.push(7);
	System.out.println(st);
	st.peek();
	System.out.println(st);
	st.pop();
	System.out.println(st);
}
}
