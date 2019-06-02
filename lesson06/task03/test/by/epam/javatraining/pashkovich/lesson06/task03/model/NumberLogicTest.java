package by.epam.javatraining.pashkovich.lesson06.task03.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberLogicTest {

    @Test
    public void testCalcFactoriaNegative() {
        int number = -5;
        int expected = -1;
        assertEquals(expected, NumberLogic.calcFactorial(number));
    }

    @Test
    public void testCalcFactorialZero() {
        int number = 0;
        int expected = 1;
        assertEquals(expected, NumberLogic.calcFactorial(number));
    }
    @Test
    public void testCalcFactorialOne() {
        int number = 1;
        int expected = 1;
        assertEquals(expected, NumberLogic.calcFactorial(number));
    }

    @Test
    public void testCalcFactorialPositive() {
        int number = 5;
        int expected = 120;
        assertEquals(expected, NumberLogic.calcFactorial(number));
    }

}