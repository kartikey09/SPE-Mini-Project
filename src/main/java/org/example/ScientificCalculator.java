package org.example;

public class ScientificCalculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number.");
        }
        return Math.sqrt(number);
    }

    public double naturalLog(double number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Logarithm is only defined for positive numbers.");
        }
        return Math.log(number);
    }

    public double sine(double angleRadians) {
        return Math.sin(angleRadians);
    }

    public double cosine(double angleRadians) {
        return Math.cos(angleRadians);
    }

    public long factorial(int x) {
        if (x < 0) return -1; // Error case for negative numbers
        long result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    // 3. Natural Log (ln(x))
    public double logarithm(double x) {
        return Math.log(x);
    }
}