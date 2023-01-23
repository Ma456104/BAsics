package in.co.polimorphism_UsingArray;

public class Ractangle extends Shape {

	int hieght;
	int width;

	public double area() {

		double RacArea = hieght * width;
		System.out.println("Ractangle Area: " + RacArea);
		return RacArea;
	}

	public Ractangle(int hieght, int width) {
		super();
		this.hieght = hieght;
		this.width = width;
	}

	
}
