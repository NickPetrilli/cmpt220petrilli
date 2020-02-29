import java.util.Scanner;

public class Lab4Question4 {
	public static void main (String args[]) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		str.toLowerCase();
		int arr[] = new int[130];
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)]++;
		}
		for (int i = 97; i < 124; i++) {
			if (arr[i] != 0)
				System.out.println("Occurences of " + (char)i + ": " + arr[i]);
		}
	}

}
