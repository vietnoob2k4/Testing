package com.example.demo;

public Integer sum(Object a, Object b) {
    if (a == null || b == null) {
        throw new IllegalArgumentException("Inputs must not be null");
    }
    if (!(a instanceof Integer) || !(b instanceof Integer)) {
        throw new IllegalArgumentException("Inputs must be numbers");
    }
    return (Integer) a + (Integer) b;
}
