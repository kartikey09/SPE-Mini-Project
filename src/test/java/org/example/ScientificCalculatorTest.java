package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ScientificCalculatorTest {
    ScientificCalculator calc = new ScientificCalculator();

    @Test
    void testSquareRoot() {
        assertEquals(4.0, calc.squareRoot(16.0), 0.001);
        assertThrows(IllegalArgumentException.class, () -> {
            calc.squareRoot(-1.0);
        });
    }

    @Test
    void testFactorial() {
        assertEquals(120, calc.factorial(5));
        assertEquals(1, calc.factorial(0));
    }

    @Test
    void testLogarithm() {
        assertEquals(0.0, calc.logarithm(1.0), 0.001);
        assertTrue(Double.isInfinite(calc.logarithm(0))); // ln(0) is -inf
    }

    @Test
    void testPower() {
        assertEquals(8.0, calc.power(2.0, 3.0), 0.001);
    }
}
