package BookExercise;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a = 21, b = 4, j;

		for (int i = 2; i < 10; i++) {
			j = a + b;
		
		System.out.println("" + j);
		a = b;
		b = j;
	}

	
//		int a = 67, b = 3, c;
//
//		for (int i = 2; i < 10; i++) {
//			c = a + b;
//
//			System.out.println("" + c);
//			a = b;
//			b = c;
//
//		}
	}
}
