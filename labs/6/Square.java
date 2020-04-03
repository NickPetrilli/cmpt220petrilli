
public class Square {
	private double width;
	
	public Square() {
		width = 1.0;
	}
	public Square(double width) {
		this.width = width;
	}
	public double getArea() {
		return width * width;
	}
	public double getPerimeter() {
		return width * 4;
	}
	public double getWidth() {
		return width;
	}
	

}
