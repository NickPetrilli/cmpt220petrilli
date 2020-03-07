import java.util.Scanner;

public class Lab5Question1 {
	public static void main (String args[]) {
		// Prompt user to enter 10 numbers, and read them in using a scanner
		Scanner input = new Scanner (System.in);
		double arr[] = new double[10];
		System.out.println("Enter 10 numbers: ");
		// Read numbers into an array
		for (int i = 0; i < arr.length; i++) {
			arr[i] =input.nextDouble();
		}
		// Call to max function, which returns the max number in the array
		double maximum = max(arr);
		System.out.println("The maximum number is " + maximum);	
	}
	// Function that calculates max number in an array and returns it
	public static double max (double[] array) {
		double max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];			
		}
		return max;
	}
}
