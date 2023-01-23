package in.co.OOP;

public class RactangleMain {
public static void main(String[] args) {
	Ractangle r = new Ractangle();
	r.setHeight(2.4);
	r.setWidth(2.7);
	System.out.println(r.getHeight());
	System.out.println(r.getWidth());
	
	System.out.println(r.area());
}
}
