package in.co.OOP;

public class AccountTest {
	public static void main(String[] args) {
		Account a = new Account();
		a.setName("Manish Chouhan");
		a.setAccountType("Saving Account");
		a.setNumber("13838209230112");
		System.out.println(a.getName());
		System.out.println(a.getAccountType());
		System.out.println(a.getNumber());
		
		System.out.println(a.getBalance());
		System.out.println(a.deposite(1200));
		System.out.println(a.withdrawal(200));
		System.out.println(a.payBill(200));
		System.out.println(a.deposite(2000));
		System.out.println(a.deposite(-200));
		System.out.println(a.deposite(0));
		
	}
}
