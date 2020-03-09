

public class Cube extends Shape implements Spatial{

	@Override
	public double area() {
		double ar= (2*length*width)+(2*length*height)+(2*width*height);
		return ar;
	}

	public Cube(double length, double width, double height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}

	@Override
	public double volume() {
		double vol=length * width * height;
		return vol;
	}

	private double length;
	private double width;
	private double height;

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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
