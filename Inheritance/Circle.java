package Inheritance;

public class Circle extends Shape{
	int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void area(){
		 double d = (radius*radius*22/7);
		 System.out.println(d);
	}
}
