package co.in.CoreJava;

public class PrintAll {
public static void main(String[] args) {
	printAlls(args);
	
}

public static void printAlls(String[] args) {
	for (int i = 0; i < args.length; i++) {
		System.out.println("Hello "+args[i]);
	}
	
}
}
