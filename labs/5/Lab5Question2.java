import java.util.Scanner;

public class Lab5Question2 {
	public static void main (String args[]) {
		// Prompt user to enter 10 numbers, and read them in using a scanner
		Scanner input = new Scanner (System.in);
		double arr[] = new double[10];
			System.out.println("Enter a number: ");
		// Read numbers into an array
		for (int i = 0; i < arr.length; i++) {
			arr[i] =input.nextDouble();
		}
		// Function calls to deviation and mean, in order to obtain the standard deviation and the mean
		double sd = deviation(arr);
		double mean = mean(arr);
		System.out.println("The standard deviation is " + sd);
		System.out.println("The mean is " + mean);
	}	
	// Function that calculates the standard deviation of elements in an array
	public static double deviation (double[] x) {
		double sd = 0;
		for (int i = 0; i < x.length; i++) {
			sd += ((x[i] - mean(x))*(x[i] - mean(x))) / (x.length - 1);
		}
		return sd;
	}
	// Function that calculates the mean of elements in an array
	public static double mean (double[] x) {
		double sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		double mean = sum / 10;
		return mean;
	}
}
