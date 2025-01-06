package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
