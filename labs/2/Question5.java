import java.util.Scanner;

public class Question5 {
	public static void main (String args[]) {
		// Prompt user to enter two strings, and read them in using scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String s1 = input.next();
		System.out.println("Enter second string: ");
		String s2 = input.next();
		
		// Compares the first letter of each string for lexicographic order
		if (s1.charAt(0) < s2.charAt(0))
			System.out.println(s1 + " " + s2);
		else
				System.out.println(s2 + " " + s1);
			
	}

}
