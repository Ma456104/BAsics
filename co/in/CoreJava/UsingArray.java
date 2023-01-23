package co.in.CoreJava;

import java.util.Iterator;

public class UsingArray {
	public static void main(String[] args) {
		int[] salaries = {15220, 77687, 67678, 56765, 34554, 45678, 45654};
		System.out.println(salaries);
//		for (int i : salaries) {
//			System.out.println(i);
//		}
		for (int i = 0; i < salaries.length; i++) {
			System.out.println(salaries[i]);
		}
		
	}
}
