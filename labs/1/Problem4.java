import java.util.Scanner;

public class Problem4 {
	public static void main (String args[]) {
		// Declare speed of light constant
		final int speedOfLight = 299972458;
		
		// Prompt user to enter value for mass
		System.out.print("Enter a value for mass (in kg): ");
		
		// Read user's input using a scanner
		Scanner input = new Scanner(System.in);
		double mass = input.nextDouble();
		
		// Multiply mass by speed of light squared in order to obtain the energy
		double energy = mass * speedOfLight * speedOfLight;
		
		// Print out energy value 
		System.out.println(energy);
		
		
		
	}

}
