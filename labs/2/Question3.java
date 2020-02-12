import java.util.Scanner;

public class Question3 {
	public static void main (String args[]) {
		// Prompt user to enter upper and lower limit integers, and read in with scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a lower limit integer: ");
		int lower = input.nextInt();
		System.out.println("Enter an upper limit integer: ");
		int upper = input.nextInt();
		
		// Generates 3 random numbers within upper and lower limit using Math.random() function
		int rand1 = (int) (Math.random() * (upper - lower + 1) + 1);
		int rand2 = (int) (Math.random() * (upper - lower + 1) + 1);
		int rand3 = (int) (Math.random() * (upper - lower + 1) + 1);
		
		// Prints out the 3 randomly generated numbers
		System.out.println(rand1);
		System.out.println(rand2);
		System.out.println(rand3);
		
	}

}
