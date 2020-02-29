import java.util.Scanner;

public class Lab4Question8 {
	public static void main (String args[]) {
		Scanner input = new Scanner (System.in);
		int arr[] = new int[100];
		int x = 0;
		System.out.println("Enter a sequence of positive integers and 0 to end: ");
		int num = input.nextInt();
		while (num != 0 && x < 100) {
			arr[x] = num;
			x++;
			num = input.nextInt();
		}
		int key;
		int j;
		for (int i = 1; i < x; i++) {
			key = arr[i];
			j = i-1;
			while (j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;	
		}
		for (int i = 0; i < x; i++)
			System.out.print(arr[i] + " ");
	}

}
