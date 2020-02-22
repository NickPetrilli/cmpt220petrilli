import java.util.Scanner;

public class Lab3Question5 {
	public static void main (String args[]) {
		// Prompt user to enter three numbers, and read them in with a scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		// Call to average function which will return the average of the three numbers
		double average = average(num1, num2, num3);
		System.out.println("The average is: " + average);
		
	}
// Function that calculates the average between three numbers
public static double average (double a, double b, double c) {
	double sum = a + b + c;
	double avg = sum / 3;
	return avg;
}

}
