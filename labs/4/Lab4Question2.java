import java.util.Random;

public class Lab4Question2 {
	public static void main (String args[]) {
		// creates two dimensional array
		char arr[][] = new char[5][5];
		// instance of the random class in order to generate random characters
		Random random = new Random();
		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 5; c++) {
				char letter = (char)(random.nextInt(26) + 'a');
				arr[r][c] = letter;
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
}
}