
public class Cylinder2 extends Shape {
	private double radius;
	private double height;
	
	public Cylinder2(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	public double area() {
		return Math.PI * radius * radius * height;
	}
	public String toString() {
		return "Cylinder [radius = " + radius + ", height = " + height + 
				", surface area = " + area() + "]";
	}
}
