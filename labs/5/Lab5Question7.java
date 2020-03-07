
public class Lab5Question7 {
	public static void main(String[] args) {
		double[][] matrix = { {2.3, 4.1, 8.6}, {0.0, 6.4, 5.3}, {0.0, 0.0, 4.9} };
		if (isUpperTriangle(matrix))
			System.out.println("Matrix is an upper triangle");
		else
			System.out.println("Matrix is not an upper triangle");
		
	}
	public static boolean isUpperTriangle(double[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				while (i > j) {
					if (array[i][j] != 0)
						return false;		
				}
			}
		}
		return true;
	}
}
