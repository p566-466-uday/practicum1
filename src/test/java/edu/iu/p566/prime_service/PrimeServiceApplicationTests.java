package edu.iu.p566.prime_service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.iu.p566.prime_service.service.PrimeService;
import org.junit.jupiter.api.Test;

public class PrimeServiceApplicationTests {

	private final PrimeService primesService = new PrimeService();

	@Test
	void _539828945930573IsNotPrime() {
		long n = 539828945930573L;
		boolean expected = false;
		boolean actual = primesService.isPrime(n);
		assertEquals(expected, actual);
	}

	@Test
	void _285191IsPrime() {
		long n = 285191;
		boolean expected = true;
		boolean actual = primesService.isPrime(n);
		assertEquals(expected, actual);
	}
}
