package by.epam.javatraining.pashkovich.lesson05.task03.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoodSensorTest {
    @Test
    public void testCheckMood() {
        String expected = "T_T:(:|:)XD";
        assertTrue(expected.contains(MoodSensor.checkMood()));
    }
}
