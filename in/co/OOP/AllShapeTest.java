package in.co.OOP;

public class AllShapeTest {
public static void main(String[] args) {
	AllShape s = new AllShape(12, 53, 78);
	System.out.println("Triangle: "+(s.getHight()*s.getWidth()*s.getBase() ));
	System.out.println("");
}
}
