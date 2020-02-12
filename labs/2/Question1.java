import java.util.Scanner;

public class Question1 {
	public static void main (String args[]) {
		// Prompt user to enter number and read it in with a scanner
		System.out.println("Enter first number: ");
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		
		// Prompt user to enter second number and read in with scanner
		System.out.println("Enter second number: ");
		int number2 = input.nextInt();
		
		// Print statements comparing both numbers
		System.out.println(number1 + " is LESS THAN " + number2 + "? " + (number1 < number2));
		System.out.println(number1 + " is LESS THAN OR EQUAL TO " + number2 + "? " + (number1 <= number2));
		System.out.println(number1 + " is EQUAL TO " + number2 + "? " + (number1 == number2));
		System.out.println(number1 + " is NOT EQUAL TO " + number2 + "? " + (number1 != number2));
		System.out.println(number1 + " is GREATER THAN " + number2 + "? " + (number1 > number2));
		System.out.println(number1 + " is GREATER THAN OR EQUAL TO " + number2 + "? " + (number1 >= number2));
	}

}
