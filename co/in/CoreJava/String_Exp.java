package co.in.CoreJava;

public class String_Exp {
public static void main(String[] args) {
	String name = "Vijay Dinanath Chouhan";
	System.out.println("String length is "+name.length());
	System.out.println("String 8th Character is "+name.charAt(7));
	System.out.println("Dina index is "+name.indexOf("Dina"));
	System.out.println("first i Position "+name.indexOf('i'));
	System.out.println("last i position "+name.lastIndexOf('i'));
	System.out.println("a is replaced by b = "+name.replace('a', 'b'));
	System.out.println("Small vijay = "+name.toLowerCase());
	System.out.println("Capital name = "+name.toUpperCase());
	System.out.println("Start with vijay "+name.startsWith("Vijay"));
	System.out.println("End with han "+name.endsWith("han"));
	System.out.println("Substring - "+name.substring(6));
}
}
