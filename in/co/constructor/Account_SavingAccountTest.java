package in.co.constructor;

public class Account_SavingAccountTest {
public static void main(String[] args) {
	SavingAccount s = new SavingAccount();
	Account a = new Account();
	Account sa = new SavingAccount();

	System.out.println(s.getAccount());
	System.out.println(a.getAmount());
	System.out.println(sa.getAmount());
}
}
