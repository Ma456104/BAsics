package in.co.OOP;

public class AutomobileTest {
	public static void main(String[] args) {
		Automobile a = new Automobile();
		a.setColor("Red");
		a.setMake("Maruti");
		
		System.out.println(a.getColor());
		System.out.println(a.getMake());
		System.out.println(a.getGear(-4));
		
	}
	
}
