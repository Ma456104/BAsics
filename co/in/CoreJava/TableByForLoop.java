package co.in.CoreJava;

public class TableByForLoop {
	public static void main(String[] args) {
		int[] t2 = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
//
////	for (int i = 0; i < table.length; i++) {
////		
////		System.out.println(table);
////	}
		for (int v : t2) {
			System.out.println(v);
		}
		
		int num = 5;
		for (int a = 1; a <= 10; a++) {
			System.out.println(num * a);
		}
		
	}
}
