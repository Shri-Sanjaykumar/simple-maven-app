package com.example;

/**
 * Simple Calculator Application
 *
 * A straightforward calculator class that provides basic arithmetic operations.
 * Used as the main application class for the DevOps Maven lab assignment.
 */
public class App {

    /**
     * Adds two integers.
     *
     * @param a the first operand
     * @param b the second operand
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first.
     *
     * @param a the minuend
     * @param b the subtrahend
     * @return the result of a minus b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     *
     * @param a the first factor
     * @param b the second factor
     * @return the product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first integer by the second.
     *
     * @param a the dividend
     * @param b the divisor (must not be zero)
     * @return the integer quotient of a divided by b
     * @throws IllegalArgumentException if b is zero
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    /**
     * Main entry point of the application.
     * Demonstrates each calculator operation with sample values.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        App calculator = new App();

        System.out.println("========================================");
        System.out.println("   Simple Maven Calculator Application  ");
        System.out.println("========================================");
        System.out.println();

        int a = 20;
        int b = 4;

        System.out.println("Operands: a = " + a + ", b = " + b);
        System.out.println("----------------------------------------");
        System.out.println("Addition       : " + a + " + " + b + " = " + calculator.add(a, b));
        System.out.println("Subtraction    : " + a + " - " + b + " = " + calculator.subtract(a, b));
        System.out.println("Multiplication : " + a + " * " + b + " = " + calculator.multiply(a, b));
        System.out.println("Division       : " + a + " / " + b + " = " + calculator.divide(a, b));
        System.out.println("----------------------------------------");
        System.out.println("All operations completed successfully!");
    }
}
