import java.util.Scanner;

public class Lab5Question5 {
	public static void main(String[] args) {
		// Prompt user to enter size of matrix and read it in with a scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the matrix: ");
		int n = input.nextInt();
		// Create two matrices, one for the original elements, and one for after transposing
		int[][] matrix = new int[n][n];
		int[][] matrix2 = new int[n][n];
		// Read in elements of matrix
		System.out.println("Enter the elements of the matrix: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				matrix[i][j] = input.nextInt();
		}
		// Swap row and column in order to transpose array, store values in second matrix
		for (int r = 0; r < n; r++) 
			for (int c = 0; c < n; c++) 
				matrix2[r][c] = matrix[c][r];
		// Print out second array
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(matrix2[i][j] + " ");
			System.out.println();
		}

			
	}

}
