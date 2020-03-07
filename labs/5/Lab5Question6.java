import java.util.Scanner;

public class Lab5Question6 {
	public static void main (String args[]) {
		// Prompt user to enter size of matrix, read in with scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the matrix: ");
		int x = input.nextInt();
		double[][] matrix = new double[x][x];
		System.out.println("Enter the elements of the matrix: ");
		// Read in elements of matrix
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++)
				matrix[i][j] = input.nextInt();
		}		
		System.out.println("Enter a row number: ");
		int row = input.nextInt();
		// Call to averageRow function
		double average = averageRow(matrix, row);
		System.out.println("The average of row " + row + " is " + average);
	}
	// Function that calculates the average of a row in a matrix
	public static double averageRow (double[][] array, int row) {
		double sum = 0;
		for (int c = 0; c < array.length; c++)
			sum += array[row][c];			
		return sum / array.length;
	}
}

