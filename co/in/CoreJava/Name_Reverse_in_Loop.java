package co.in.CoreJava;

public class Name_Reverse_in_Loop {
public static void main(String[] args) {
	String name = "Manish Chouhan";
	char ch;
	String rev = "";
	for (int i = 0; i < name.length(); i++) {
		System.out.print(ch = name.charAt(i));
		rev = ch + rev;
	}
	System.out.println("");
	System.out.println(rev);
}
}
