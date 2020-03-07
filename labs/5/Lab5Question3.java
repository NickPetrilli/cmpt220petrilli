import java.util.Scanner;

public class Lab5Question3 {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int students = input.nextInt();
		String[] names = new String[students];
		int[] score = new int[students];
		for (int i = 0; i < students; i++) {
			System.out.println("Enter name: ");
			names[i] = input.next();
			System.out.println("Enter score: ");
			score[i] = input.nextInt();
		}
		// For loops to iterate through arrays in order to swap elements
		for (int i = 0; i < students; i++)
			for (int j = 0; j < students - i - 1; j++)
				if (score[j] > score[j+1]) {
					// swap in scores array
					int temp1 = score[j];
					score[j] = score[j+1];
					score[j+1] = temp1;
					// swap in names array
					String temp2 = names[j];
					names[j] = names[j+1];
					names[j+1] = temp2;
				}
		for (int i = 0; i < students; i++) 
			System.out.println("Name: " + names[i] + " Score: " + score[i]);
	}

}
