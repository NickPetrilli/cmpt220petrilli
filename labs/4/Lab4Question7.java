import java.util.Scanner;

public class Lab4Question7 {
	public static void main (String args[]) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter array size: ");
		int size = input.nextInt();
		int arr[] = new int[size+1];
		int i = 0;
		int j = 0;
		System.out.println("Enter elements: ");
		while (i < size) {
			arr[i] = input.nextInt();
			i++;
		}
		i = 0;
		while (arr[i] != -1) {
			System.out.print(arr[i] + " ");
			i++;
		}
		i = 0;
		// JA: I'm not sure what yoiu are doing here. Some comments would help.
		while (arr[i] != -1) {
			j = 0;
			while (arr[j] != -1) {
				if (arr[i] == arr[j] && i != j) {
					int temp = j;
					while (arr[temp] != -1)
						arr[temp] = arr[++temp];
					arr[temp-1] = -1;
				}
				j++;
			}
			i++;
		}
		i = 0;
		while (arr[i] != -1) {
			System.out.print(arr[i] + " ");
			i++;
		}
	}

}
