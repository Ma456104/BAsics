package co.in.CoreJava;

public class HelloAllSwithCase {
public static void main(String[] args) {
	int size = args.length;
	switch (size) {
	case 0:
		System.out.println("Usage: java Hello All ");
		break;
	case 1:
		System.out.println("Hello "+args[0]);
		break;

	default:
		for (int i = 1; i < size; i++) {
			System.out.println(i+ " Hello "+args[i]);
		}
		break;
	}
}
}
