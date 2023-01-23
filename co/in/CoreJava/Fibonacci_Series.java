package co.in.CoreJava;

public class Fibonacci_Series {
	public static void main(String[] args) {

		int a = 67, b = 3, c;

		for (int i = 2; i < 10; i++) {
			c = a + b;

			System.out.println("" + c);
			a = b;
			b = c;

		}

	}

}
