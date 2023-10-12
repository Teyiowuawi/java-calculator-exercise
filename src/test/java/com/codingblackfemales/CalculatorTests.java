package com.codingblackfemales;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName(value = "The Calculator should")
public class CalculatorTests {

    @Test
    @DisplayName("add two numbers")
    public void testAddition() {
        final Integer sum = Calculator.add(2, 4);

        assertEquals(6, sum);
    }

    @Test
    @DisplayName("subtract two numbers")
    public void testSubtraction() {
        final Integer difference = Calculator.subtract(2, 4);

        assertEquals(-2, difference);
    }

    @Test
    @DisplayName("divide two numbers")
    public void testDivide() {
        final Integer result = Calculator.divide(4, 2);

        assertEquals(2, result);
    }

    @Test
    @DisplayName("divide one negative number by  a positive number")
    public void testDivideTwo() {
        final Integer result = Calculator.divide(4, -2);

        assertEquals(-2, result);
    }

    @Test
    @DisplayName("divide two negative numbers")
    public void testDivideThree() {
        final Integer result = Calculator.divide(-4, -2);

        assertEquals(2, result);
    }

    @Test
    @DisplayName("divide by zero throws exception")
    public void testDivideByZero() {
        //final Integer product = Calculator.multiply(2, 4);

        assertThrows(ArithmeticException.class,() -> {
            Calculator.divide(4, 0);});
    }
}
