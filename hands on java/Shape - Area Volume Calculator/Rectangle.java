
public class Rectangle extends Shape{
	private double length;
	private double width;
	@Override
	public double area() {
		double ar= length*width;
		return ar;
	}
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return -1;
	}
	
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

	
}
