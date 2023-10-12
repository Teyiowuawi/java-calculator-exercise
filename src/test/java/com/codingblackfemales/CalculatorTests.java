package com.codingblackfemales;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    @DisplayName("multiply two numbers")
    public void testMultiply() {
        final Integer product = Calculator.multiply(2, 4);

        assertEquals(8, product);
    }

    @Test
    @DisplayName("multiply one negative number by a positive number")
    public void testMultiply2() {
        final Integer product = Calculator.multiply(-2, 4);

        assertEquals(-8, product);
    }

    @Test
    @DisplayName("multiply two negative numbers")
    public void testMultiply3() {
        final Integer product = Calculator.multiply(-2, -4);

        assertEquals(8, product);
    }

    @Test
    @DisplayName("multiply by zero")
    public void testMultiply4() {
        final Integer product = Calculator.multiply(2, 0);

        assertEquals(0, product);
    }



    
}
