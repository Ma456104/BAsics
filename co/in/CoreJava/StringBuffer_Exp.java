package co.in.CoreJava;

public class StringBuffer_Exp {
public static void main(String[] args) {
	StringBuffer sub = new StringBuffer("Vijay");
	System.out.println(sub.append(" Dinanath Chouhan"));
	System.out.println("Length "+sub.length());
	System.out.println("Capacity = "+sub.capacity());
	System.out.println("Char at = "+sub.charAt(1));
	System.out.println("Index Of = "+sub.indexOf("Dinanath"));
	System.out.println("Replace = "+sub.replace(0,  5, "jay"));
	System.out.println("Reverse = "+sub.reverse());
}
}
