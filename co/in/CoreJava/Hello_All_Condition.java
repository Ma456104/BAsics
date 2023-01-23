package co.in.CoreJava;

public class Hello_All_Condition {
public static void main(String[] args) {
	int size = args.length;
	if (size == 0) {
		System.out.println("Hello All");
	}else {
		for (int i = 0; i < size; i++) {
			System.out.println(i+" Hello "+args[i]);
		}
	}
}
}
