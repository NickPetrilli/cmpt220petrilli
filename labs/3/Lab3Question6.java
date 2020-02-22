import java.util.Scanner;

public class Lab3Question6 {
	public static void main (String args[]) {
		// Prompt user to enter string and read it in using a scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = input.nextLine();
		
		// Call to vowels function
		int numVowels = vowels(s);
		System.out.println("There are " + numVowels + " vowels in " + s);
			
	}
// Function that counts the number of vowels in a string
public static int vowels (String str) {
	str.toLowerCase();
	int vowels = 0;
	for (int i = 0; i < str.length(); i++)
		if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
			vowels++;
	return vowels;
}
}
