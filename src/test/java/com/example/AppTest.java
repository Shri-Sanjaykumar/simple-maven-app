package com.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the App (Calculator) class.
 *
 * Tests all four arithmetic operations using JUnit 4:
 * add, subtract, multiply, and divide — including edge cases.
 */
public class AppTest {

    private App calculator;

    /**
     * Initializes a fresh App instance before each test method.
     */
    @Before
    public void setUp() {
        calculator = new App();
    }

    // =========================================================
    //  ADD Tests
    // =========================================================

    @Test
    public void testAddPositiveNumbers() {
        assertEquals("10 + 5 should equal 15", 15, calculator.add(10, 5));
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals("-3 + -7 should equal -10", -10, calculator.add(-3, -7));
    }

    @Test
    public void testAddPositiveAndNegative() {
        assertEquals("10 + -3 should equal 7", 7, calculator.add(10, -3));
    }

    @Test
    public void testAddWithZero() {
        assertEquals("5 + 0 should equal 5", 5, calculator.add(5, 0));
    }

    // =========================================================
    //  SUBTRACT Tests
    // =========================================================

    @Test
    public void testSubtractPositiveNumbers() {
        assertEquals("10 - 4 should equal 6", 6, calculator.subtract(10, 4));
    }

    @Test
    public void testSubtractResultingInNegative() {
        assertEquals("3 - 8 should equal -5", -5, calculator.subtract(3, 8));
    }

    @Test
    public void testSubtractNegativeNumbers() {
        assertEquals("-5 - -3 should equal -2", -2, calculator.subtract(-5, -3));
    }

    @Test
    public void testSubtractWithZero() {
        assertEquals("7 - 0 should equal 7", 7, calculator.subtract(7, 0));
    }

    // =========================================================
    //  MULTIPLY Tests
    // =========================================================

    @Test
    public void testMultiplyPositiveNumbers() {
        assertEquals("6 * 7 should equal 42", 42, calculator.multiply(6, 7));
    }

    @Test
    public void testMultiplyByZero() {
        assertEquals("100 * 0 should equal 0", 0, calculator.multiply(100, 0));
    }

    @Test
    public void testMultiplyNegativeNumbers() {
        assertEquals("-4 * -3 should equal 12", 12, calculator.multiply(-4, -3));
    }

    @Test
    public void testMultiplyPositiveAndNegative() {
        assertEquals("5 * -6 should equal -30", -30, calculator.multiply(5, -6));
    }

    @Test
    public void testMultiplyByOne() {
        assertEquals("9 * 1 should equal 9", 9, calculator.multiply(9, 1));
    }

    // =========================================================
    //  DIVIDE Tests
    // =========================================================

    @Test
    public void testDividePositiveNumbers() {
        assertEquals("20 / 4 should equal 5", 5, calculator.divide(20, 4));
    }

    @Test
    public void testDivideNegativeNumbers() {
        assertEquals("-20 / -4 should equal 5", 5, calculator.divide(-20, -4));
    }

    @Test
    public void testDividePositiveByNegative() {
        assertEquals("20 / -4 should equal -5", -5, calculator.divide(20, -4));
    }

    @Test
    public void testDivideZeroByNumber() {
        assertEquals("0 / 5 should equal 0", 0, calculator.divide(0, 5));
    }

    @Test
    public void testDivideByOne() {
        assertEquals("15 / 1 should equal 15", 15, calculator.divide(15, 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZeroThrowsException() {
        // Should throw IllegalArgumentException when dividing by zero
        calculator.divide(10, 0);
    }
}
