import java.util.Arrays;
import java.util.Scanner;

public class Lab5Question4 {
	public static void main (String args[]) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the size of the first array: ");
		int size1 = input.nextInt();
		int[] arr1 = new int[size1];
		System.out.println("Enter the elements for the first array: ");
		for (int i = 0; i < size1; i++)
			arr1[i] = input.nextInt();
		System.out.println("Enter the size of the second array: ");
		int size2 = input.nextInt();
		int[] arr2 = new int[size2];
		System.out.println("Enter the elements for the second array: ");
		for (int i = 0; i < size2; i++)
			arr2[i] = input.nextInt();
		if (equal(arr1, arr2))
			System.out.println("The arrays are identical");
		else
			System.out.println("The arrays are different");
	}
	public static boolean equal (int[] x, int[] y) {
		Arrays.sort(x);
		Arrays.sort(y);		
		if (x.length != y.length)
			return false;	
		if (x == y)
			return true;
		return false;
	}
}
