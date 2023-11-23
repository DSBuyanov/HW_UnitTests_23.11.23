
package calculator;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return (double) a / b;
    }

    // New method to calculate discount
    public double calculateDiscount(double amount, double discountPercentage) {
        if (amount < 0 || discountPercentage < 0) {
            throw new ArithmeticException("Negative values are not allowed");
        }
        return amount * (1 - discountPercentage / 100);
    }
}
