import java.util.Scanner;

public class Lab9Question1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[100];
		for (int i = 0; i < 100; i++)
			arr[i] = (int) (Math.random() * (100));
		System.out.println("Enter an index of the array: ");
		int index = input.nextInt();
		try {
			System.out.println("Element at index " + index + " = " + arr[index]);
		}
		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Out of bounds");
		}
		
		

	}

}
