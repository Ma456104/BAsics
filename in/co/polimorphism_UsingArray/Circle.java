package in.co.polimorphism_UsingArray;

public class Circle extends Shape{
	int radius;
	
	
	
	public Circle(int radius) {
		
		this.radius = radius;
	}



	public double area(){
		
		double carea = 3.14 * radius*radius;
		
		System.out.println("Circle Area: "+carea);
		return carea;
	}
	
}
