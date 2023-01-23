package in.co.polimorphism;

public class ShapeTest {
	public static void main(String[] args) {
		Ractngle r = new Ractngle(10, 20);
		System.out.println(r.area());
		
		Triangle t = new Triangle();
		t.setColor("Red");
		t.setBorderWidth(12);
		t.setBase(20);
		t.setHeight(24);
		
		System.out.println(t.getColor());
		System.out.println(t.getBorderWidth());
		System.out.println(t.getHeight());
		System.out.println(t.getBase());
		System.out.println(t.area());
	}
}
