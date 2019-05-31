package by.epam.javatraining.pashkovich.lesson05.task01.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class DragonLogicTest {
    @Test
    public void testCountHeadNegative() {
        double age = -12;
        int expected = -1;

        assertEquals(expected, DragonLogic.countHead(age));
    }

    @Test
    public void testCountHeadChild() {
        double age = 5;
        int expected = 18;

        assertEquals(expected, DragonLogic.countHead(age));
    }

    @Test
    public void testCountHeadYoung() {
        double age = 203;
        int expected = 609;

        assertEquals(expected, DragonLogic.countHead(age));
    }

    @Test
    public void testCountHeadOld() {
        double age = 305;
        int expected = 808;

        assertEquals(expected, DragonLogic.countHead(age));
    }

    @Test
    public void testCountHeadIncompleteAge() {
        double age = 23.5;
        int expected = 72;

        assertEquals(expected, DragonLogic.countHead(age));
    }

    @Test
    public void testCountEyeNegative() {
        double age = -12;
        int expected = -1;

        assertEquals(expected, DragonLogic.countEye(age));
    }

    @Test
    public void testCountEyeChild() {
        double age = 5;
        int expected = 36;

        assertEquals(expected, DragonLogic.countEye(age));
    }

    @Test
    public void testCountEyeYoung() {
        double age = 203;
        int expected = 1218;

        assertEquals(expected, DragonLogic.countEye(age));
    }

    @Test
    public void testCountEyedOld() {
        double age = 305;
        int expected = 1616;

        assertEquals(expected, DragonLogic.countEye(age));
    }

    @Test
    public void testCountEyeHncompleteAge() {
        double age = 23.5;
        int expected = 144;

        assertEquals(expected, DragonLogic.countEye(age));
    }
}