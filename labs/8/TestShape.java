
public class TestShape {
	public static void main(String[] args) {
		Shape s1 = new Sphere(5.0);
		System.out.println(s1.toString());
		
		Shape s2 = new Rectangle(4, 6);
		System.out.println(s2.toString());
		
		Shape s3 = new Cylinder2(8, 10);
		System.out.println(s3.toString());

	}

}
