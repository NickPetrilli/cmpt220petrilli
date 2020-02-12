
public class Question6 {
	public static void main(String args[]) {
		// Randomly generates first number in between 2-9 
		int num1 = (int) (Math.random() * (9 - 2 + 1) + 1);
		
		// Randomly generates all other numbers in between 0-9
		int num2 = (int) (Math.random() * (9 - 0 + 1));
		int num3 = (int) (Math.random() * (9 - 0 + 1));
		int num4 = (int) (Math.random() * (9 - 0 + 1));
		int num5 = (int) (Math.random() * (9 - 0 + 1));
		int num6 = (int) (Math.random() * (9 - 0 + 1));
		int num7 = (int) (Math.random() * (9 - 0 + 1));
		int num8 = (int) (Math.random() * (9 - 0 + 1));
		int num9 = (int) (Math.random() * (9 - 0 + 1));
		int num10 = (int) (Math.random() * (9 - 0 + 1));
		
		// Prints out randomly generated phone number
		System.out.println("(" + num1 + "" + num2 + ""  + num3 + ") " + 
		num4 + "" + num5 + "" + num6 + "-" + num7 + "" + num8 + "" + num9 + "" + num10);
		
	}

}
