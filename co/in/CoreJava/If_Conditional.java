package co.in.CoreJava;

public class If_Conditional {
	public static void main(String[] args) {
		if (args.length == 1) {
			System.out.println("Hello " + args[0]);
		} else {
			System.out.println("Parameter name is required");
		}
	}
}
