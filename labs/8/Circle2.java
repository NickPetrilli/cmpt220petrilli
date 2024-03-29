
public class Circle2 {
	// Named "Circle2" because we created a "Circle" class already
	private double radius = 1.0;
	private String color = "red";
	
	public Circle2() {

	}
	public Circle2(double radius) {
		this.radius = radius;
	}
	public Circle2(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		return Math.PI * radius * radius;
	}
	public String toString() {
		return "Circle2[radius = " + radius + ", color = " + color + "]";
	}
	

}
