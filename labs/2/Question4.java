import java.util.Scanner;

public class Question4 {
	public static void main (String args[]) {
		// Prompt user to enter two characters and read them in using a scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first character: ");
		char character1 = input.next().charAt(0);
		System.out.println("Enter second character: ");
		char character2 = input.next().charAt(0);
		
		// Print out the sum of the two character's corresponding values 
		System.out.println(character1 + character2);
		
	}

}
