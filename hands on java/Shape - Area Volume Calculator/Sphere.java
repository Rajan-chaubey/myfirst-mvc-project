
public class Sphere extends Shape implements Spatial{

	public Sphere(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double area() {
		double ar=4  * Math.PI * Math.pow(radius, 2);
		return ar;
	}

	@Override
	public double volume() {
		double vol= ( 4  * Math.PI * Math.pow(radius, 3))/3;
		return vol;
	}
	private double radius;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
