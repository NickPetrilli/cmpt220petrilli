
public class Lab4Question1 {
	public static void main (String args[]) {
		System.out.print("\nin cm | cm in");
		System.out.print("\n-----------------------");
		for (int i = 1, j = 1; i < 50 && j < 50; i++, j += 5) {
				System.out.printf("\n%2d ", i);
				System.out.print(i * 2.54);
				System.out.printf(" |%3d ", j);
				System.out.print(j * 0.393701);
			}
		}
		

}
