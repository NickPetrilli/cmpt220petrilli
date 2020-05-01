import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise10_1 {
	public static void main(String[] args) throws Exception {
		File file = new File("Exercise10_1.txt");
		try (
			PrintWriter output = new PrintWriter(file);
		) {
			// generating 100 random numbers and printing them to be read in with scanner
			for (int i = 0; i < 100; i++) {
				output.print(((int)(Math.random() * 200) + 1));
				output.print(" ");
			}
		}
		int arr[] = new int[100];
		try(
			Scanner input = new Scanner(file);
		) {
			// reading in random numbers into array
			int i = 0;
			while (input.hasNext()) {
				arr[i] = (input.nextInt());
				i++;
			}
		}
		// sorting array into increasing order
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if  (arr[j] < arr[index])
					index = j;
			}
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		// printing array
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
