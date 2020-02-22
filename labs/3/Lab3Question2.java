
public class Lab3Question2 {
	public static void main (String args[]) {
		int count = 0;
		for (int i = 100; i <= 500; i++) {
			if ((i % 5 == 0 && i % 7 != 0) || (i % 7 == 0 && i % 5 != 0)) {
				count++;
				if (count % 10 == 0)
					System.out.println(i);
				else
					System.out.print(i + " ");
			}
				
				
				
				
		}
			
	}

}
