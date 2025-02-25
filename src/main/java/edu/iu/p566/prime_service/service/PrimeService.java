package edu.iu.p566.prime_service.service;

import org.springframework.stereotype.Service;

@Service
public class PrimeService implements IPrimeService {

    @Override
    public boolean isPrime(long n) {
        if (n < 2) return false; // 0 and 1 are not prime
        if (n == 2 || n == 3) return true; // 2 and 3 are prime numbers
        if (n % 2 == 0 || n % 3 == 0) return false; // Eliminate multiples of 2 and 3

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}
