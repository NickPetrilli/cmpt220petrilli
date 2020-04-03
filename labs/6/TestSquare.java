
public class TestSquare {

	public static void main(String[] args) {
		Square s1 = new Square(40.0);
		System.out.println("The width of square 1 is: " + s1.getWidth());
		System.out.println("The area of square 1 is: " + s1.getArea());
		System.out.println("The perimeter of square 1 is: " + s1.getPerimeter());
		
		Square s2 = new Square(35.9);
		System.out.println("The width of square 2 is: " + s2.getWidth());
		System.out.println("The area of square 2 is: " + s2.getArea());
		System.out.println("The perimeter of square 2 is: " + s2.getPerimeter());
		

	}

}
