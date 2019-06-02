package by.epam.javatraining.pashkovich.lesson06.task05.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberLogicTest {

    @Test
    public void testIsSimple() {
        int number = 2;
        boolean expected = true;
        assertEquals(expected, NumberLogic.isSimple(number));
    }

    @Test
    public void testIsSimpleTwo() {
        int number = 4;
        boolean expected = false;
        assertEquals(expected, NumberLogic.isSimple(number));
    }

    @Test
    public void testIsSimpleNegative() {
        int number = -8;
        boolean expected = false;
        assertEquals(expected, NumberLogic.isSimple(number));
    }

}