package part11.exceptions.validatingparameters;

public class Calculator {

    public int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Invalid number: factorial is only defined for non-negative integers.");
        }

        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public int binomialCoefficient(int n, int k) {
        if (n < 0 || k < 0) {
            throw new IllegalArgumentException("Invalid input: n and k must be non-negative.");
        }
        if (k > n) {
            throw new IllegalArgumentException("Invalid input: k cannot be greater than n.");
        }

        return factorial(n) / (factorial(k) * factorial(n - k));
    }
}
