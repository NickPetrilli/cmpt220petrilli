
public class Lab3Question3 {
	public static void main (String args[]) {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			count++;
			if (count % 20 == 0)
				System.out.println((char) i);
			else
				System.out.print((char) i + " ");
		}
			
			
	}

}
