
public class PrimeNumber {
	
	private long primeNumber;
	private long index;
	
	public PrimeNumber(long index) {
		
		this.index = index;
		setPrimeNumber(index);
	}
	
	private void setPrimeNumber(long index) {
		
		this.primeNumber = findPrimeNumber(index);
	}
	
	public long getPrimeNumber() {
		
		return this.primeNumber;
	}
	
	/**
	 * Checks if number is prime
	 * @param number - value to checked
	 * @return return boolean value, if number is prime return true,
	 * else return false
	 */
	public static boolean isPrimeNumber(long number) {
		
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

	public static long findPrimeNumber(long index) {
		
		long primeNumber = 0;
		long currentNumber = 0;
		long i = 0;
		
		while (i < index) {
			if (isPrimeNumber(currentNumber)) {
				primeNumber = currentNumber;
				i++;
			}
			currentNumber++;
		}
		return primeNumber;
	}
	
}
