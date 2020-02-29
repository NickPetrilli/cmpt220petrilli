
public class Lab4Question5 {
	public static void main (String args[]) {
		// Generates random numbers and puts them into an array
		int num = 0;
		int arr[] = new int[1000];
		for (int i = 0; i < 1000; i++) {
			num = (int) (Math.random() * 1000);
			arr[i] = num;
		}
		// Calculates the sum and the average of the random integers
		int sum = 0;
		int average = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		average = sum / 1000;
		
		// Tests how many numbers are smaller and larger than the average
		int smaller = 0;
		int larger = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > average)
				larger++;
			else if (arr[i] < average)
				smaller++;
		}
		// Output results
		System.out.println("The average of the random numbers is: " + average);
		System.out.println("There were " + smaller + " integers smaller than the average");
		System.out.println("There were " + larger + " integers larger than the average");
	}
}
