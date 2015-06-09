import static org.junit.Assert.*;

import org.junit.Test;


public class PrimeNumberTest {

	@Test
	public void isPrime() {
		assertTrue(PrimeNumber.isPrime(5));
		assertFalse(PrimeNumber.isPrime(1));
	}

}
