
public class Circle {
	private double x;
	private double y;
	private double radius;
	
	public Circle() {
		x = 0;
		y = 0;
		radius = 1;
	}
	public Circle (double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return Math.PI * radius * radius;
	}
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	public boolean contains(double x, double y) {
		// calculates the distance between center of circle and inputted point
		double distance = Math.sqrt(Math.pow((getX()-x),2)-Math.pow((getY()-y), 2));
		if (distance <= radius)
			return true;
		return false;
	}
	public boolean contains(Circle circle) {
		// Calculates the distance between the two centers of the two circles
		double distance = Math.sqrt(Math.pow((getX()-circle.x),2)-Math.pow((getY()-circle.y), 2));
		if (radius > (distance + circle.radius))
			return true;
		return false;
	}
	public boolean overlaps(Circle circle) {
		 double distance = Math.sqrt(Math.pow((getX()-circle.x),2)-Math.pow((getY()-circle.y), 2));
		 if (distance < (radius + circle.radius))
			 return true;
		 return false;
	}
}
