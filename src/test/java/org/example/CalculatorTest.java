package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc = new Calculator();
    @BeforeEach
    void setUp() {
    }

    @Test
    void add() {
        assertEquals(3, calc.add(2, 1));
    }

    @Test
    void subtract() {
        assertEquals(3, calc.subtract(4, 1));
    }

    @Test
    void multiply() {
        assertEquals(3, calc.multiply(3, 1));
    }

    @Test
    void divide() {
        assertEquals(3, calc.divide(6, 2));
    }
}