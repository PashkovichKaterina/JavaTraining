package by.epam.javatraining.pashkovich.lesson06.task02.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberLogicTest {

    @Test
    public void testIsDecreasingDecrease() {
        int number = 98752;
        boolean expected = true;
        assertEquals(expected, NumberLogic.isDecreasing(number));
    }

    @Test
    public void testIsDecreasingIncrease() {
        int number = 156789;
        boolean expected = false;
        assertEquals(expected, NumberLogic.isDecreasing(number));
    }

    @Test
    public void testIsDecreasingNeitherOne() {
        int number = 77777;
        boolean expected = false;
        assertEquals(expected, NumberLogic.isDecreasing(number));
    }
    @Test
    public void testIsDecreasingNeitherTwo() {
        int number = 974821;
        boolean expected = false;
        assertEquals(expected, NumberLogic.isDecreasing(number));
    }


    @Test
    public void testIsDecreasingNegative() {
        int number = -985210;
        boolean expected = true;
        assertEquals(expected, NumberLogic.isDecreasing(number));
    }

    @Test
    public void testIsIncreasingDecrease() {
        int number = 98752;
        boolean expected = false;
        assertEquals(expected, NumberLogic.isIncreasing(number));
    }

    @Test
    public void testIsIncreasingIncrease() {
        int number = 26789;
        boolean expected = true;
        assertEquals(expected, NumberLogic.isIncreasing(number));
    }

    @Test
    public void testIsIncreasingNeitherOne() {
        int number = 55555555;
        boolean expected = false;
        assertEquals(expected, NumberLogic.isIncreasing(number));
    }

    @Test
    public void testIsIncreasingNeitherTwo() {
        int number = 12849;
        boolean expected = false;
        assertEquals(expected, NumberLogic.isIncreasing(number));
    }

    @Test
    public void testIsIncreasingNegative() {
        int number = -1345678;
        boolean expected = true;
        assertEquals(expected, NumberLogic.isIncreasing(number));
    }
}