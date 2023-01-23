package co.in.CoreJava;

public class whileExp {
	public static void main(String[] args) {
//		int a = 1;
//		while (a <= 5) {
//			System.out.println(a+ " Shot");
//			a++;
//		}
		boolean basanti = true;
		int round = 0;
		while (basanti) {
			System.out.println("Basanti Dance");
			if (++round > 5) {
				basanti = false;
				System.out.println("Stop!!");
			}
		}
	}
}
