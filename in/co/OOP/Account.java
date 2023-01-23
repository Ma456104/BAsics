package in.co.OOP;

public class Account {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String number;
	private String AccountType;
	private double balance;

	public double getBalance() {
		return balance;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public double deposite(double amount) {
		if (amount <= 0) {
			System.out.println("Please deposite greater amount then 0");
			System.out.println("!Thank you");
			return balance;
		} else {
			balance += amount;
			return balance;
		}

	}

	public double withdrawal(double amount) {
		if (amount < balance) {
			balance -= amount;
			System.out.println("Hurrey Withdrawal Successful");
			return balance;
		} else if (amount == balance) {
			System.out.println("!! At least 1 rs. remin in your account");
			return balance;
		} else {
			System.out.println("!! Insufficiant balance");
			return balance;
		}
	}

	public double fundTransfer(String number, double amount) {

		if (amount < balance) {
			balance -= amount;
			System.out.println("Hurrey foundTransfer Successful");
			return balance;
		} else if (amount == balance) {
			System.out.println("!! At least 1 rs. remin in your account");
			return balance;
		} else {
			System.out.println("!! Insufficiant balance");
			return balance;
		}
	}

	public double payBill(double amount) {
		if (amount < balance) {
			balance -= amount;
			System.out.println("Hurrey foundTransfer Successful");
			return balance;
		} else if (amount == balance) {
			System.out.println("!! At least 1 rs. remin in your account");
			return balance;
		} else {
			System.out.println("!! Insufficiant balance");
			return balance;
		}

	}
	public double sendMoney(double amount) {
		return 0;
	}

}