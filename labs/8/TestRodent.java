
public class TestRodent {
	public static void main(String args[]) {
		Rodent arr[] = new Rodent[4];
		arr[0] = new Rodent();
		arr[1] = new Mouse();
		arr[2] = new Gerbil();
		arr[3] = new Hamster();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].eat();
			arr[i].run();
		}	
	}

}
