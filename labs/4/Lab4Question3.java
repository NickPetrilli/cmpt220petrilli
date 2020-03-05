import java.util.Scanner;

public class Lab4Question3 {
	public static void main(String args[]) {
		// Prompts user to enter a string and creates a scanner to read it in
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a string: ");
		String str = input.next();
		if (isPalindrome(str))
			System.out.println(str + " is a palindrome");
		else
			System.out.println(str + " is not a palindrome");
		
	}
		// Function that tests if a string is a palindrome
	public static boolean isPalindrome(String s) {
		if (s.equals(reverse(s)))
			return true;
		return false;
	}
	// Function that reverses a string and returns the reverse
	public static String reverse (String s) {
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse += s.charAt(i);
		}
		return reverse;
	}

}
