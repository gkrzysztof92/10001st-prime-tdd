import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumberTest {

	@Test
	public void isPrime() {
		assertTrue(PrimeNumber.isPrimeNumber(5));
		assertFalse(PrimeNumber.isPrimeNumber(1));
	}
	
	@Test
	public void findPrimeNumber() {
		assertEquals(11, PrimeNumber.findPrimeNumber(5));
	}
	
	@Test
	public void getPrimeNumber() {
		PrimeNumber test = new PrimeNumber(10);
		assertEquals(29, test.getPrimeNumber());
	}
	
}
