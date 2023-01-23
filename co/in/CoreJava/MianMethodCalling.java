package co.in.CoreJava;

public class MianMethodCalling {
	public static void main(String[] args) {
		Add();
		MianMethodCalling m = new MianMethodCalling();
		m.Sub(10, 33);
		Multi(21, 34, 52);
	}

	private static void Multi(int a, int b, int c) {
		int d = a * b * c;
		System.out.println("Multiplication is: " + d);
	}

	private void Sub(int a, int b) {
		int c = a - b;
		System.out.println("Substraction is: " + c);
	}

	private static void Add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("Add is : " + c);
	}
}
