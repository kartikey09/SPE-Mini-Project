package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScientificCalculatorTest {

    private ScientificCalculator calculator;

    @BeforeEach
    void setUp() {
        // Initialize a new calculator instance before each test
        calculator = new ScientificCalculator();
    }

    @Test
    void testAdd() {
        assertEquals(5.0, calculator.add(2.0, 3.0), 0.0001);
        assertEquals(-1.0, calculator.add(-4.0, 3.0), 0.0001);
    }

    @Test
    void testSubtract() {
        assertEquals(5.5, calculator.subtract(10.0, 4.5), 0.0001);
    }

    @Test
    void testMultiply() {
        assertEquals(20.0, calculator.multiply(4.0, 5.0), 0.0001);
    }

    @Test
    void testDivide() {
        assertEquals(2.5, calculator.divide(5.0, 2.0), 0.0001);
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10.0, 0);
        });
        assertEquals("Cannot divide by zero.", exception.getMessage());
    }

    @Test
    void testPower() {
        assertEquals(8.0, calculator.power(2.0, 3.0), 0.0001);
        assertEquals(1.0, calculator.power(5.0, 0), 0.0001);
    }

    @Test
    void testSquareRoot() {
        assertEquals(4.0, calculator.squareRoot(16.0), 0.0001);
    }

    @Test
    void testSquareRootOfNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.squareRoot(-1.0);
        });
        assertEquals("Cannot calculate square root of a negative number.", exception.getMessage());
    }

    @Test
    void testNaturalLog() {
        assertEquals(0.0, calculator.naturalLog(1.0), 0.0001);
        // Math.E is approximately 2.71828
        assertEquals(1.0, calculator.naturalLog(Math.E), 0.0001);
    }

    @Test
    void testNaturalLogOfZeroOrNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.naturalLog(0);
            ;
        });
    }

    @Test
    void testSine() {
        // sin(PI/2) is 1
        assertEquals(1.0, calculator.sine(Math.PI / 2), 0.0001);
    }

    @Test
    void testCosine() {
        // cos(PI) is -1
        assertEquals(-1.0, calculator.cosine(Math.PI), 0.0001);
    }
}
