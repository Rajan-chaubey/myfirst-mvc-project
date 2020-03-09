

public class Triangle extends Shape {

	@Override
	public double area() {
		double ar=0.5*base*height;
		return ar;
	}

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return -1;
	}

	private double base;
	private double height;
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
