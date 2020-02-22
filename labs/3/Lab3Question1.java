import java.util.Scanner;

public class Lab3Question1 {
	public static void main (String args[]) {
		// Prompt user to enter numbers, and read them in with a scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter positive integers, the input ends with 0: ");
		int num = input.nextInt();
		final int SENTINEL = 0;
		int count = 0;
		int evenCount = 0;
		int sum = 0;
		
		// Sentinel controlled while loop, ends when user enters 0
		while (num != SENTINEL) {
			sum += num;
			count++;
			if (num % 2 == 0)
				evenCount++;
			num = input.nextInt();
		}
		
		// Output calculations to user
		System.out.println("The number of even numbers: " + evenCount);
		System.out.println("The total sum: " + sum);
		System.out.println("The average is: " + sum / count);
		
	}

}
