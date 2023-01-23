package in.co.Abstraction;

public class Person {
	protected String firstName = null;
	protected String lastName = null;
	protected String address = null;
	
	public Person() {
		System.out.println("Person Default Con");
	}
	
	public Person(String fn, String ln) {
		firstName = fn;
		lastName = ln;
		System.out.println("2 params constructor is called");
	}
	
	public Person(String fn, String ln, String address) {
		firstName = fn;
		lastName = ln;
		this.address = address;
		System.out.println("3 params constructor is called");
	}
	
	
}
