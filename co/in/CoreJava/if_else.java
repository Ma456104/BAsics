package co.in.CoreJava;

public class if_else {
public static void main(String[] args) {
	int amount = 1100;
	int balance = 1200;
	if (amount <= 0) {
		
		System.out.println("insufficiant Balance");
	}else if (amount <= balance) {
		System.out.println("insufficiant Balance!!");
		
	}else {
		System.out.println("Your Money Send");
	}
}
}
