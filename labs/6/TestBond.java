
public class TestBond {

	public static void main(String[] args) {
		Bond b1 = new Bond(500, 100, .05, 10000);
		System.out.println("The price of this bond is: $" + (double) Math.round(b1.getPrice() * 100) / 100);
	}
}
