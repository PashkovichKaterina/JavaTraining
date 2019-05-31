package by.epam.javatraining.pashkovich.lesson05.additionally.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalendarLogicTest {

    @Test
    public void isLeapYearOne() {
        int year = 2008;
        boolean expected = true;

        assertEquals(expected, CalendarLogic.isLeapYear(year));
    }

    @Test
    public void isLeapYearTwo() {
        int year = 1700;
        boolean expected = false;

        assertEquals(expected, CalendarLogic.isLeapYear(year));
    }

    @Test
    public void isLeapYearThree() {
        int year = 1600;
        boolean expected = true;

        assertEquals(expected, CalendarLogic.isLeapYear(year));
    }

    @Test
    public void testIsValidDateYear() {
        int day = 5;
        int month = 2;
        int year = -1700;
        boolean expected = false;

        assertEquals(expected, CalendarLogic.isValidDate(day, month, year));
    }

    @Test
    public void testIsValidDateMonthMore() {
        int day = 5;
        int month = 13;
        int year = 1700;
        boolean expected = false;

        assertEquals(expected, CalendarLogic.isValidDate(day, month, year));
    }

    @Test
    public void testIsValidDateMonthLess() {
        int day = 5;
        int month = 0;
        int year = 1700;
        boolean expected = false;

        assertEquals(expected, CalendarLogic.isValidDate(day, month, year));
    }

    @Test
    public void testIsValidDateDayLess() {
        int day = 0;
        int month = 13;
        int year = 1700;
        boolean expected = false;

        assertEquals(expected, CalendarLogic.isValidDate(day, month, year));
    }

    @Test
    public void testIsValidDateDayLeap() {
        int day = 29;
        int month = 2;
        int year = 2008;
        boolean expected = true;

        assertEquals(expected, CalendarLogic.isValidDate(day, month, year));
    }

    @Test
    public void testIsValidDateDayLeapMore() {
        int day = 30;
        int month = 2;
        int year = 2008;
        boolean expected = false;

        assertEquals(expected, CalendarLogic.isValidDate(day, month, year));
    }

    @Test
    public void testIsValidDateDayNotLeap() {
        int day = 29;
        int month = 2;
        int year = 1700;
        boolean expected = false;

        assertEquals(expected, CalendarLogic.isValidDate(day, month, year));
    }

    @Test
    public void testIsValidDateApril() {
        int day = 31;
        int month = 4;
        int year = 2006;
        boolean expected = false;

        assertEquals(expected, CalendarLogic.isValidDate(day, month, year));
    }

    @Test
    public void testIsValidDateJune() {
        int day = 31;
        int month = 6;
        int year = 2006;
        boolean expected = false;

        assertEquals(expected, CalendarLogic.isValidDate(day, month, year));
    }

    @Test
    public void testIsValidDateSeptember() {
        int day = 31;
        int month = 9;
        int year = 2006;
        boolean expected = false;

        assertEquals(expected, CalendarLogic.isValidDate(day, month, year));
    }

    @Test
    public void testIsValidDateNovember() {
        int day = 31;
        int month = 11;
        int year = 2006;
        boolean expected = false;

        assertEquals(expected, CalendarLogic.isValidDate(day, month, year));
    }

    @Test
    public void testIsValidDateThirtyOne() {
        int day = 31;
        int month = 7;
        int year = 2006;
        boolean expected = true;

        assertEquals(expected, CalendarLogic.isValidDate(day, month, year));
    }

    @Test
    public void testNextDateDay() {
        int day = 5;
        int month = 5;
        int year = 2005;
        String expected = "6.5.2005";

        assertEquals(expected, CalendarLogic.nextDate(day, month, year));
    }

    @Test
    public void testNextDateMonth() {
        int day = 30;
        int month = 6;
        int year = 2005;
        String expected = "1.7.2005";

        assertEquals(expected, CalendarLogic.nextDate(day, month, year));
    }

    @Test
    public void testNextDateYear() {
        int day = 31;
        int month = 12;
        int year = 2005;
        String expected = "1.1.2006";

        assertEquals(expected, CalendarLogic.nextDate(day, month, year));
    }
}