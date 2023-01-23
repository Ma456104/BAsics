package in.co.OOP;

public class triangleTest {
public static void main(String[] args) {
	Triangle t = new Triangle();
	t.setHeight(2.9);
	t.setWidth(2.8);
	t.setBase(5);
	System.out.println("Heght = "+t.getHeight());
	System.out.println("Width = "+t.getWidth());
	System.out.println("Base = "+t.getBase());
	
	System.out.println(t.area());
	
	
}
}
