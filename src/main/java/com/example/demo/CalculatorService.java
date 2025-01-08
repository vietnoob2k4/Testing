package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public Integer sum(Object a, Object b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Inputs must not be null");
        }
        if (!(a instanceof Integer) || !(b instanceof Integer)) {
            throw new IllegalArgumentException("Inputs must be numbers");
        }
        return (Integer) a + (Integer) b;
    }
}
