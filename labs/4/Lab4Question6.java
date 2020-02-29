
public class Lab4Question6 {
	public static void main (String args[]) {
		 int arr[] = new int[100];
		 arr[0] = -1;
		 int i =0;
		 insertAtEnd(arr, 1);
		 insertAtEnd(arr, 2);
		 insertAtEnd(arr, 3);
		 insertAtEnd(arr, 4);
		 insertAtEnd(arr, 5);
		 insertAtEnd(arr, 6);
		 insertAtEnd(arr, 7);
		 insertAtEnd(arr, 8);
		 insertAtEnd(arr, 9);
		 insertAtEnd(arr, 10);
		 while (arr[i] != -1) {
			System.out.print(arr[i] + " ");
			i++;
		}
		 System.out.println();
		 insertAtIndex(arr, 10, 3);
		 insertAtIndex(arr, 100, 7);
		 i = 0;
		 while (arr[i] != -1) {
			 System.out.print(arr[i] + " ");
			 i++;
		 }
			 
			
		
	}
	public static void insertAtEnd (int array[], int num) {
		int i = 0;
		while (array[i] != -1)
			i++;
		if (i == 100)
			System.out.println("Array is full");
		else {
			array[i] = num;
			array[i+1] = -1;
		}
		
		
	}
	public static void insertAtIndex (int array[], int num, int position) {
		int i = 0;
		int length = 0;
		while (array[length] != -1) {
			length++;
		}
		if (length == 100)
			System.out.println("Array is full");
		else {
			array[length+1] = -1;
			for (i = length; i > position; i--)
				array[i] = array[i-1];
			array[i] = num;
		}
			
	}
	

}
