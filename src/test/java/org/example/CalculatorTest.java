package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void addTest() {
        Calculator calc = new Calculator();
        double result = Calculator.add(10, 5);

        Assertions.assertEquals(15, result);
    }

    @Test
    void subtractTest() {
        Calculator calc = new Calculator();
        double result = Calculator.subtract(10, 5);

        Assertions.assertEquals(5, result);
    }

    @Test
    void multiplyTest() {
        Calculator calc = new Calculator();
        double result = Calculator.multiply(10, 5);

        Assertions.assertEquals(50, result);
    }

    @Test
    void divideTest() {
        Calculator calc = new Calculator();
        double result = Calculator.divide(10, 5);

        Assertions.assertEquals(2, result);
    }
}