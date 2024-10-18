package org.example;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PrimeNumberCheckerTest {

    PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker();

    // Test for valid prime numbers
    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11})
    void testValidPrimes(int primeNumber) {
        assertTrue(primeNumberChecker.validate(primeNumber));
    }

    // Test for invalid (non-prime) numbers
    @ParameterizedTest
    @ValueSource(ints = {4, 6, 10})
    void testInvalidPrimes(int nonPrimeNumber) {
        assertFalse(primeNumberChecker.validate(nonPrimeNumber));
    }
}
