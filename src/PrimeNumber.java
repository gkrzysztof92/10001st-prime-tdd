
public class PrimeNumber {
	
	public static boolean isPrime(long number) {
		
		if (number < 2) {
			return false;
		}
		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static long findPrimeNumber(int index) {
		
		long primeNumber = 0;
		long currentNumber = 0;
		long i = 0;
		
		while (i < index) {
			if (isPrime(currentNumber)) {
				primeNumber = currentNumber;
				i++;
			}
			currentNumber++;
		}
		return primeNumber;
	}
	
}
