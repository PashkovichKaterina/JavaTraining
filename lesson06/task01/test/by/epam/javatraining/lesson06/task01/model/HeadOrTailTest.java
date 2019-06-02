package by.epam.javatraining.lesson06.task01.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeadOrTailTest {

    @Test
    public void testHeadsORTails() {
        int steps = -20;
        String expected = "Invalid data";
        assertEquals(expected, HeadOrTail.headsORTails(steps));
    }
}