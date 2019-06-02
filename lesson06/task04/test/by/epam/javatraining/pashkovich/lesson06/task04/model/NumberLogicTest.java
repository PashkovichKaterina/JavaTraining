package by.epam.javatraining.pashkovich.lesson06.task04.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberLogicTest {

    @Test
    public void testIsDigitEvenOne() {
        int number = 137591;
        boolean expected = false;
        assertEquals(expected, NumberLogic.isDigitEven(number));
    }

    @Test
    public void testIsDigitEvenTwo() {
        int number = 8246;
        boolean expected = true;
        assertEquals(expected, NumberLogic.isDigitEven(number));
    }

    @Test
    public void testIsDigitEvenThree() {
        int number = 1267459;
        boolean expected = false;
        assertEquals(expected, NumberLogic.isDigitEven(number));
    }

    @Test
    public void testIsDigitEvenNegative() {
        int number = -1267459;
        boolean expected = false;
        assertEquals(expected, NumberLogic.isDigitEven(number));
    }

    @Test
    public void testIsDigitOddOne() {
        int number = 137591;
        boolean expected = true;
        assertEquals(expected, NumberLogic.isDigitOdd(number));
    }

    @Test
    public void testIsDigitOddTwo() {
        int number = 48266;
        boolean expected = false;
        assertEquals(expected, NumberLogic.isDigitOdd(number));
    }

    @Test
    public void testIsDigitOddThree() {
        int number = 1674692;
        boolean expected = false;
        assertEquals(expected, NumberLogic.isDigitOdd(number));
    }

    @Test
    public void testIsDigitOddNegative() {
        int number = -16752;
        boolean expected = false;
        assertEquals(expected, NumberLogic.isDigitOdd(number));
    }

    @Test
    public void testIsSameParityOne() {
        int number = 15793;
        boolean expected = true;
        assertEquals(expected, NumberLogic.isSameParity(number));
    }

    @Test
    public void testIsSameParityTwo() {
        int number = 286642;
        boolean expected = true;
        assertEquals(expected, NumberLogic.isSameParity(number));
    }

    @Test
    public void testIsSameParityThree() {
        int number = 1554796214;
        boolean expected = false;
        assertEquals(expected, NumberLogic.isSameParity(number));
    }
}