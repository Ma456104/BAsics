package in.co.polimorphism_UsingArray;

public class Triangle extends Shape{

	int base;
	int hieght;
	public double area() {
		double Area = base * hieght;
		System.out.println("Triangle Area: "+ Area);
		return Area;
	}
	
	public Triangle(int base, int hieght) {
		super();
		this.base = base;
		this.hieght = hieght;
	}

}
