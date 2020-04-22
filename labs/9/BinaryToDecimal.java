import java.util.Scanner;

public class BinaryToDecimal {
	public static int bin2Dec(String binaryString) throws NumberFormatException {
		int num = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') 
				throw new NumberFormatException();
			num += Math.pow(2, binaryString.length() - i - 1)  * (binaryString.charAt(i) - '0');
		}
		return num;
	}
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a binary number: ");
		String str = input.next();
		try {
			System.out.println("Decimal value of " + str + " is " + bin2Dec(str));	
		}
		catch (NumberFormatException ex) {
			System.out.println(str + " is not a binary number");
		}
	}

}
