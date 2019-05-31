package by.epam.javatraining.pashkovich.lesson05.task03.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoodSensorTest {
    @Test
    public void testMoodExcellent() {
        double moodNumber = 5;
        String expected = "XD";
        assertEquals(expected, MoodSensor.mood(moodNumber));
    }

    @Test
    public void testMoodGood() {
        double moodNumber = 0.7;
        String expected = ":)";
        assertEquals(expected, MoodSensor.mood(moodNumber));
    }

    @Test
    public void testMoodSoSo() {
        double moodNumber = 0.5;
        String expected = ":|";
        assertEquals(expected, MoodSensor.mood(moodNumber));
    }

    @Test
    public void testMoodBad() {
        double moodNumber = 0.3;
        String expected = ":(";
        assertEquals(expected, MoodSensor.mood(moodNumber));
    }

    @Test
    public void testMoodTerrible() {
        double moodNumber = -2;
        String expected = "T_T";
        assertEquals(expected, MoodSensor.mood(moodNumber));
    }
}