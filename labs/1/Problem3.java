import java.util.Scanner;

public class Problem3 {
	public static void main (String args[]) {
		// Declare constant for amount of grams in one ounce
		final double gramsInOunce = 28.3495;
		
		// Prompt user to enter value for ounces
		System.out.print("Enter a value for ounces: ");
		
		// Read user input using a scanner
		Scanner input = new Scanner(System.in);
		double ounces = input.nextDouble();
		
		// Convert user's input of ounces to grams
		double grams = ounces * gramsInOunce;
		
		// Print out ounce and gram value 
		System.out.println(ounces + " ounces is " + grams + " grams");
		
		
		
	}

}
