package in.co.polimorphism;

public class Triangle extends Shape{


	int base;
	int height;
	
	@Override
	public double area() {
		
		return base * height;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
