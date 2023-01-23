package in.co.OOP;

public class ShapeTest {
public static void main(String[] args) {
	
	Shape s1 = new Shape();
	Shape s2 = new Shape();
	
	s1.setColor("Red");
	s1.setBorderWidth(5);
	System.out.println(s1.getColor());
	System.out.println(s1.getBorderWidth());
	System.out.println(s1.PI);
	System.out.println(s2.PI);
	
	System.out.println(Shape.PI);
}
}
