package in.co.polimorphism;

public class Ractngle extends Shape {
	int length;
	int width;

	public Ractngle(int length, int width) {
		
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	@Override
	public double area() {
		
		return length * width;
	}
	
	

}
