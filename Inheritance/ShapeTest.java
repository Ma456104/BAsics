package Inheritance;

public class ShapeTest {
public static void main(String[] args) {
	Ractangle r = new Ractangle();
	r.setBorderWidth(23);
	r.setColor("Red");
	r.setLength(2);
	r.setWidth(2);
	System.out.println(r.getColor());
	System.out.println(r.getBorderWidth());
	System.out.println("Length is: "+r.getLength()+ " Width is: "+r.getWidth());
	r.area();
	
	Circle c = new Circle();
	c.setColor("Blue");
	c.setBorderWidth(31);
	c.setRadius(23);
	System.out.println(c.getColor());
	System.out.println(c.getBorderWidth());
	System.out.println(c.getRadius());
	c.area();
	
}
}
