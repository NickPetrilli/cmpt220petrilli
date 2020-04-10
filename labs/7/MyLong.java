
public class MyLong {
	private long value;
	
	public MyLong(long value) {
		this.value = value;
	}
	public long getValue() {
		return value;
	}
	public boolean isEven() {
		if (value % 2 == 0)
			return true;
		return false;
	}
	public boolean isOdd() {
		if (value % 2 != 0)
			return true;
		return false;
	}
	public boolean isPrime() {
		if (value == 1)
			return false;
		for (int i = 2; i < value; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}
	public static boolean isEven(long num) {
		if (num % 2 == 0)
			return true;
		return false;
	}
	public static boolean isOdd(long num) {
		if (num % 2 != 0)
			return true;
		return false;
	}
	public static boolean isPrime(long num) {
		if (num == 1)
			return false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;		
	}
	public static boolean isEven(MyLong x) {
		if (x.getValue() % 2 == 0)
			return true;
		return false;
	}
	public static boolean isOdd(MyLong x) {
		if (x.getValue() % 2 != 0)
			return true;
		return false;
	}
	public static boolean isPrime(MyLong x) {
		if (x.getValue() == 1)
			return false;
		for (int i = 2; i < x.getValue(); i++) {
			if (x.getValue() % i == 0)
				return false;
		}
		return true;
	}
	public boolean equals(long num) {
		if (value == num)
			return true;
		return false;
	}
	public boolean equals(MyLong x) {
		if (value == x.getValue())
			return true;
		return false;
	}
	public static long parseLong(char ch[]) {
		String str = "";
		for (int i = 0; i < ch.length; i++)
			str += ch[i];
		return Long.parseLong(str);
	}
	public static long parseLong(String str) {
		return Long.parseLong(str);
	}

}
