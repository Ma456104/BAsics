package co.in.CoreJava;

public class Hello_All_args {
	public static void main(String[] args) {
		for (int i = 1; i < args.length; i++) {
			System.out.println(i + " Hello " + args[i]);
		}
	}
}
