package in.co.Abstraction;

public class Employee extends Person {

	private String designation = null;

	public Employee() {
		System.out.println("Default Constructor");
	}

	public Employee(String fn, String ln, String des) {
		super(fn, ln);
		designation = des;
		System.out.println("3 params construtor is called");
	}
}
