public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double divide(double a, double b) {
        if (b == 0.0d) {
            throw new IllegalArgumentException("Second number can't be a zero.");
        }

        return a / b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }
}
