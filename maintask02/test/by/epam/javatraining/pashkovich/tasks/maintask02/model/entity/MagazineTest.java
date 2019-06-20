package by.epam.javatraining.pashkovich.tasks.maintask02.model.entity;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MagazineTest {
    @Test
    public void testDefaultData() {
        Magazine magazine = new Magazine();
        StringBuilder expected = new StringBuilder();
        expected.append("Edition: Magazine");
        expected.append("\nTitle: Title");
        expected.append("\nGenre: No genre");
        expected.append("\nLanguage: English");
        expected.append("\nPrint Edition: No edition");
        expected.append("\nCount of pages: 1");
        expected.append("\nPrint year: 1");
        expected.append("\nEditor: No editor");
        expected.append("\nPrint month: 1");
        expected.append("\nNumber of magazine: 1");
        assertEquals(expected.toString(), magazine.toString());
    }

    @Test
    public void testSetEditor() {
        Magazine magazine = new Magazine();
        magazine.setEditor("Ivanov");
        String expected = "Ivanov";
        assertEquals(expected, magazine.getEditor());
    }

    @Test
    public void testSetEditorNull() {
        Magazine magazine = new Magazine();
        magazine.setEditor(null);
        String expected = "No editor";
        assertEquals(expected, magazine.getEditor());
    }

    @Test
    public void testSetEditorNullWithData() {
        Magazine magazine = new Magazine();
        magazine.setEditor("Ivanov");
        magazine.setEditor(null);
        String expected = "Ivanov";
        assertEquals(expected, magazine.getEditor());
    }

    @Test
    public void testSetEditorZero() {
        Magazine magazine = new Magazine();
        magazine.setEditor("");
        String expected = "No editor";
        assertEquals(expected, magazine.getEditor());
    }

    @Test
    public void testSetEditorSpace() {
        Magazine magazine = new Magazine();
        magazine.setEditor("   ");
        String expected = "No editor";
        assertEquals(expected, magazine.getEditor());
    }

    @Test
    public void testSetPrintMonth() {
        Magazine magazine = new Magazine();
        magazine.setPrintMonth(2);
        int expected = 2;
        assertEquals(expected, magazine.getPrintMonth());
    }

    @Test
    public void testSetPrintMonthNegative() {
        Magazine magazine = new Magazine();
        magazine.setPrintMonth(-2);
        int expected = 1;
        assertEquals(expected, magazine.getPrintMonth());
    }

    @Test
    public void testSetPrintMonthZero() {
        Magazine magazine = new Magazine();
        magazine.setPrintMonth(0);
        int expected = 1;
        assertEquals(expected, magazine.getPrintMonth());
    }

    @Test
    public void testSetPrintMonthCurrentYear() {
        Magazine magazine = new Magazine();
        magazine.setPrintYear(2019);
        magazine.setPrintMonth(2);
        int expected = 2;
        assertEquals(expected, magazine.getPrintMonth());
    }

    @Test
    public void testSetPrintMonthCurrentYearFuture() {
        Magazine magazine = new Magazine();
        magazine.setPrintYear(2019);
        magazine.setPrintMonth(10);
        int expected = 1;
        assertEquals(expected, magazine.getPrintMonth());
    }

    @Test
    public void testSetMagazineNumber() {
        Magazine magazine = new Magazine();
        magazine.setMagazineNumber(5);
        int expected = 5;
        assertEquals(expected, magazine.getMagazineNumber());
    }

    @Test
    public void testSetMagazineNumberNegative() {
        Magazine magazine = new Magazine();
        magazine.setMagazineNumber(-5);
        int expected = 1;
        assertEquals(expected, magazine.getMagazineNumber());
    }

    @Test
    public void testSetMagazineNumberZero() {
        Magazine magazine = new Magazine();
        magazine.setMagazineNumber(0);
        int expected = 1;
        assertEquals(expected, magazine.getMagazineNumber());
    }

    @Test
    public void testEqualsSameRef() {
        Magazine magazine1 = new Magazine();
        Magazine magazine2 = magazine1;
        boolean expected = true;
        assertEquals(expected, magazine1.equals(magazine2));
    }

    @Test
    public void testEqualsNull() {
        Magazine magazine1 = new Magazine();
        Magazine magazine2 = null;
        boolean expected = false;
        assertEquals(expected, magazine1.equals(magazine2));
    }

    @Test
    public void testEqualsGetClass() {
        Magazine magazine1 = new Magazine();
        String magazine2 = "Magazine";
        boolean expected = false;
        assertEquals(expected, magazine1.equals(magazine2));
    }

    @Test
    public void testEqualsSameFields() {
        Magazine magazine1 = new Magazine();
        magazine1.setPrintMonth(5);
        Magazine magazine2 = new Magazine();
        magazine2.setPrintMonth(5);
        boolean expected = true;
        assertEquals(expected, magazine1.equals(magazine2));
    }

    @Test
    public void testEqualsDifferentFields() {
        Magazine magazine1 = new Magazine();
        magazine1.setPrintMonth(2);
        Magazine magazine2 = new Magazine();
        magazine2.setPrintMonth(5);
        boolean expected = false;
        assertEquals(expected, magazine1.equals(magazine2));
    }
}