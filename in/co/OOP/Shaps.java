package in.co.OOP;

public class Shaps {
	private String name;
	private int num;
	
	
	public Shaps(String name, int num) {
		//super();
		System.out.println("Constructor calling");
		this.name = name;
		this.num = num;
	}


	public String getName() {
		return name;
	}


	public int getNum() {
		return num;
	}
	
	
}
