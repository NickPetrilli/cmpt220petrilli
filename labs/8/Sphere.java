
public class Sphere extends Shape {
	private double radius;
	
	public Sphere(double radius) {
		this.radius = radius;
	}
	public double area() {
		return 4 * Math.PI * radius * radius;
	}
	public String toString() {
		return "Sphere [radius = " + radius + ", Surface area = " + area() + "]";
	}
	

}
