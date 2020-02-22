
public class Lab3Question4 {
	public static void main(String args[]) {
		boolean isPrime;
		int maxPrime = 0;
		for (int i = 2; i < 15000; i++) {
			isPrime = checkPrime(i);
			if (isPrime)
				maxPrime = i;
		}
		System.out.println(maxPrime);
		
	}
	public static boolean checkPrime(int num) {
        int remainder;
        for (int i = 2; i <= num / 2; i++) {
            remainder = num % i;
            if (remainder == 0) {
                return false;
            }
        }
        return true;
 
    }
}
