package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void testSumPositiveNumbers() {
        assertEquals(8, calculatorService.sum(3, 5));
    }

    @Test
    void testSumNegativeNumbers() {
        assertEquals(-8, calculatorService.sum(-3, -5));
    }

    @Test
    void testSumMixedNumbers() {
        assertEquals(2, calculatorService.sum(-3, 5));
    }

    @Test
    void testSumWithZero() {
        assertEquals(5, calculatorService.sum(5, 0));
        assertEquals(5, calculatorService.sum(0, 5));
    }

    @Test
    void testSumBothZero() {
        assertEquals(0, calculatorService.sum(0, 0));
    }

    @Test
    void testSumNullInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.sum(null, 5);
        });
        assertEquals("Inputs must not be null", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.sum(5, null);
        });
        assertEquals("Inputs must not be null", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.sum(null, null);
        });
        assertEquals("Inputs must not be null", exception.getMessage());
    }

    @Test
    void testSumInvalidTypeInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.sum("abc", 5);
        });
        assertEquals("Inputs must be numbers", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.sum(5, "xyz");
        });
        assertEquals("Inputs must be numbers", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.sum("abc", "xyz");
        });
        assertEquals("Inputs must be numbers", exception.getMessage());
    }
}
