package org.example;

public class PrimeNumberChecker {
    public boolean validate(int  primeNumber) {
        if (primeNumber <= 1) {
            return false;
        }
        for (int i = 2; i < primeNumber; i++) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
