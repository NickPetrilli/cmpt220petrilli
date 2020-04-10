
public class TestMyLong {
	public static void main(String args[]) {
		MyLong m1 = new MyLong(82937451);
		if (m1.isEven())
			System.out.println(m1.getValue() + " is even");
		if (m1.isOdd())
			System.out.println(m1.getValue() + " is odd");
		if (m1.isPrime())
			System.out.println(m1.getValue() + " is prime");
		
		long num = 68401920;
		if (MyLong.isEven(num))
			System.out.println(num + " is even");
		if (MyLong.isOdd(num))
			System.out.println(num + " is odd");
		if (MyLong.isPrime(num))
			System.out.println(num + " is prime");
		
		
		MyLong m2 = new MyLong(20728134);
		if (MyLong.isEven(m2))
			System.out.println(m2.getValue() + " is even");
		if (MyLong.isOdd(m2))
			System.out.println(m2.getValue() + " is odd");
		if (MyLong.isPrime(m2))
			System.out.println(m2.getValue() + " is prime");
		
		if (m1.equals(82937451))
			System.out.println(m1.getValue() + " equals 82937451");
		if (!(m1.equals(m2)))
			System.out.println(m1.getValue() + " does not equal " + m2.getValue());
		
		char ch[] = {'2', '4', '1', '5', '9', '6', '8', '3'};
		long l1 = MyLong.parseLong(ch);
		System.out.println(l1);
		
		String str = "97391616475";
		long l2 = MyLong.parseLong(str);
		System.out.println(l2);
		
	}

}
