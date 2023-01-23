package in.co.polimorphism_UsingArray;

public class ShapeTest {
	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		s[0] = new Ractangle(31, 43);
		s[1] = new Triangle(23, 12);
		s[2] = new Circle(23);

		int num = 2;

		double totalArea = 0;
		System.out.println("Start");
		
		if (num == 0) {
			System.out.println("Ractangle: "+s[0].area());
		}
		if (num == 1) {
			System.out.println("Triangle: "+s[1].area());
		}
		if (num == 2) {
			System.out.println("Circle: "+s[2].area());
		}
		
//		for (int i = 0; i < s.length; i++) {
//			totalArea = totalArea + s[i].area();
//
//			
//		
//		}
		System.out.println("TotalArea is: " + totalArea);
	}
}
