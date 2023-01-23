package in.co.ExceptionHandling;

public class ArithmeticTest {
	public static void main(String[] args) {
		int k = 0;
		int i = 15;
	
		try {
			double div = i / k;
			System.out.println("Division is : " + div);
		} catch (ArithmeticException e) {
			System.out.println("Divided by Zero");
		} finally {

			System.out.println("My Name is Manish");
		}
	
	}
}