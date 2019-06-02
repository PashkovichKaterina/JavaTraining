package by.epam.javatraining.pashkovich.lesson06.additionally.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberLogicTest {

    @Test
    public void testCalcEvenDigit() {
        int number = 16795366;
        int expected = 3;
        assertEquals(expected, NumberLogic.calcEvenDigit(number));
    }

    @Test
    public void testCalcEvenDigitZero() {
        int number = 19755;
        int expected = 0;
        assertEquals(expected, NumberLogic.calcEvenDigit(number));
    }

    @Test
    public void testCalcEvenDigitNegative() {
        int number = -88423;
        int expected = 4;
        assertEquals(expected, NumberLogic.calcEvenDigit(number));
    }

    @Test
    public void testCalcOddDigit() {
        int number = 16795366;
        int expected = 5;
        assertEquals(expected, NumberLogic.calcOddDigit(number));
    }

    @Test
    public void testCalcOddDigitZero() {
        int number = 228864;
        int expected = 0;
        assertEquals(expected, NumberLogic.calcOddDigit(number));
    }

    @Test
    public void testCalcOddDigitNegative() {
        int number = -88423;
        int expected = 1;
        assertEquals(expected, NumberLogic.calcOddDigit(number));
    }

    @Test
    public void testCalcDigitSumPositive() {
        int number = 159758;
        int expected = 35;
        assertEquals(expected, NumberLogic.calcDigitSum(number));
    }

    @Test
    public void testCalcDigitSumNegative() {
        int number = -159758;
        int expected = 35;
        assertEquals(expected, NumberLogic.calcDigitSum(number));
    }

    @Test
    public void testCalcDigitMultiplyPositive() {
        int number = 2315;
        int expected = 30;
        assertEquals(expected, NumberLogic.calcDigitMultiply(number));
    }

    @Test
    public void testCalcDigitMultiplyNegative() {
        int number = -12413;
        int expected = 24;
        assertEquals(expected, NumberLogic.calcDigitMultiply(number));
    }

    @Test
    public void testCalcArithmeticSumPosistive() {
        int number = 2954;
        double expected = 5;
        assertEquals(expected, NumberLogic.calcArithmeticSum(number),0.00001);
    }

    @Test
    public void testCalcArithmeticSumNegative() {
        int number = -111111;
        double expected = 1;
        assertEquals(expected, NumberLogic.calcArithmeticSum(number),0.00001);
    }

    @Test
    public void testCalcGeometricSumPosistive() {
        int number = 555;
        double expected = 5;
        assertEquals(expected, NumberLogic.calcGeometricSum(number),0.00001);
    }

    @Test
    public void testCalcGeometricSumNegative() {
        int number = -333;
        double expected = 3;
        assertEquals(expected, NumberLogic.calcGeometricSum(number),0.00001);
    }

    @Test
    public void testIsPalindromPositive() {
        int number = 1224224;
        boolean expected = false;
        assertEquals(expected, NumberLogic.isPalindrom(number));
    }

    @Test
    public void testIsPalindromNegative() {
        int number = -124421;
        boolean expected = true;
        assertEquals(expected, NumberLogic.isPalindrom(number));
    }

    @Test
    public void testIsDigitSamePositive() {
        int number = 14654698;
        boolean expected = false;
        assertEquals(expected, NumberLogic.isDigitSame(number));
    }

    @Test
    public void testIsDigitSameNegative() {
        int number = -5555555;
        boolean expected = true;
        assertEquals(expected, NumberLogic.isDigitSame(number));
    }

    @Test
    public void testIsDigitDifferentPositive() {
        int number = 1564781;
        boolean expected = false;
        assertEquals(expected, NumberLogic.isDigitDifferent(number));
    }

    @Test
    public void testIsDigitDifferentNegative() {
        int number = -15974;
        boolean expected = true;
        assertEquals(expected, NumberLogic.isDigitDifferent(number));
    }

    @Test
    public void testMaxDigit() {
        int number = 146547;
        int expected = 7;
        assertEquals(expected, NumberLogic.maxDigit(number));
    }

    @Test
    public void testMaxDigitFirst() {
        int number = 81365;
        int expected = 8;
        assertEquals(expected, NumberLogic.maxDigit(number));
    }

    @Test
    public void testMaxDigitNegative() {
        int number = -813865;
        int expected = 8;
        assertEquals(expected, NumberLogic.maxDigit(number));
    }

    @Test
    public void testMinDigit() {
        int number = 813865;
        int expected = 1;
        assertEquals(expected, NumberLogic.minDigit(number));
    }

    @Test
    public void testMinDigitFirst() {
        int number = 13865;
        int expected = 1;
        assertEquals(expected, NumberLogic.minDigit(number));
    }

    @Test
    public void testMinDigitNegative() {
        int number = -838635;
        int expected = 3;
        assertEquals(expected, NumberLogic.minDigit(number));
    }

    @Test
    public void testIsPerfectOne() {
        int number = 6;
        boolean expected = true;
        assertEquals(expected, NumberLogic.isPerfect(number));
    }

    @Test
    public void testIsPerfectTwo() {
        int number = 28;
        boolean expected = true;
        assertEquals(expected, NumberLogic.isPerfect(number));
    }

    @Test
    public void testIsPerfectThree() {
        int number = 496;
        boolean expected = true;
        assertEquals(expected, NumberLogic.isPerfect(number));
    }

    @Test
    public void testIsPerfectFour() {
        int number = 8128;
        boolean expected = true;
        assertEquals(expected, NumberLogic.isPerfect(number));
    }

    @Test
    public void testIsPerfectFife() {
        int number = 35;
        boolean expected = false;
        assertEquals(expected, NumberLogic.isPerfect(number));
    }
}