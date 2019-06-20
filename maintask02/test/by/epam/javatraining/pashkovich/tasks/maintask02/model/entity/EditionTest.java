package by.epam.javatraining.pashkovich.tasks.maintask02.model.entity;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EditionTest {
    @Test
    public void testDefaultData() {
        Edition edition = new Edition();
        StringBuilder expected = new StringBuilder();
        expected.append("Title: Title");
        expected.append("\nGenre: No genre");
        expected.append("\nLanguage: English");
        expected.append("\nPrint Edition: No edition");
        expected.append("\nCount of pages: 1");
        expected.append("\nPrint year: 1");
        assertEquals(expected.toString(), edition.toString());
    }

    @Test
    public void testSetOrderCountPositive() {
        Edition edition = new Edition();
        edition.setOrderCount(5);
        int expected = 5;
        assertEquals(expected, edition.getOrderCount());
    }

    @Test
    public void testSetOrderCountNegative() {
        Edition edition = new Edition();
        edition.setOrderCount(-20);
        int expected = 0;
        assertEquals(expected, edition.getOrderCount());
    }

    @Test
    public void testSetOrderCountZero() {
        Edition edition = new Edition();
        edition.setOrderCount(5);
        edition.setOrderCount(0);
        int expected = 5;
        assertEquals(expected, edition.getOrderCount());
    }

    @Test
    public void testSetTitle() {
        Edition edition = new Edition();
        edition.setTitle("Interesting book");
        String expected = "Interesting book";
        assertEquals(expected, edition.getTitle());
    }

    @Test
    public void testSetTitleNull() {
        Edition edition = new Edition();
        edition.setTitle(null);
        String expected = "Title";
        assertEquals(expected, edition.getTitle());
    }

    @Test
    public void testSetTitleNullWithData() {
        Edition edition = new Edition();
        edition.setTitle("Interesting book");
        edition.setTitle(null);
        String expected = "Interesting book";
        assertEquals(expected, edition.getTitle());
    }

    @Test
    public void testSetTitleZero() {
        Edition edition = new Edition();
        edition.setTitle("");
        String expected = "Title";
        assertEquals(expected, edition.getTitle());
    }

    @Test
    public void testSetTitleSpace() {
        Edition edition = new Edition();
        edition.setTitle("       ");
        String expected = "Title";
        assertEquals(expected, edition.getTitle());
    }

    @Test
    public void testSetGenre() {
        Edition edition = new Edition();
        edition.setGenre("Fantasy");
        String expected = "Fantasy";
        assertEquals(expected, edition.getGenre());
    }

    @Test
    public void testSetGenreNull() {
        Edition edition = new Edition();
        edition.setGenre(null);
        String expected = "No genre";
        assertEquals(expected, edition.getGenre());
    }

    @Test
    public void testSetGenreNullWithData() {
        Edition edition = new Edition();
        edition.setGenre("Fantasy");
        edition.setGenre(null);
        String expected = "Fantasy";
        assertEquals(expected, edition.getGenre());
    }

    @Test
    public void testSetGenreZero() {
        Edition edition = new Edition();
        edition.setGenre("");
        String expected = "No genre";
        assertEquals(expected, edition.getGenre());
    }

    @Test
    public void testSetGenreSpace() {
        Edition edition = new Edition();
        edition.setGenre("      ");
        String expected = "No genre";
        assertEquals(expected, edition.getGenre());
    }

    @Test
    public void testSetLanguage() {
        Edition edition = new Edition();
        edition.setLanguage("France");
        String expected = "France";
        assertEquals(expected, edition.getLanguage());
    }

    @Test
    public void testSetLanguageNull() {
        Edition edition = new Edition();
        edition.setLanguage(null);
        String expected = "English";
        assertEquals(expected, edition.getLanguage());
    }

    @Test
    public void testSetLanguageNullWithData() {
        Edition edition = new Edition();
        edition.setLanguage("France");
        edition.setLanguage(null);
        String expected = "France";
        assertEquals(expected, edition.getLanguage());
    }

    @Test
    public void testSetLanguageZero() {
        Edition edition = new Edition();
        edition.setLanguage("");
        String expected = "English";
        assertEquals(expected, edition.getLanguage());
    }

    @Test
    public void testSetLanguageSpace() {
        Edition edition = new Edition();
        edition.setLanguage("    ");
        String expected = "English";
        assertEquals(expected, edition.getLanguage());
    }

    @Test
    public void testSetPageCountPositive() {
        Edition edition = new Edition();
        edition.setPageCount(25);
        int expected = 25;
        assertEquals(expected, edition.getPageCount());
    }

    @Test
    public void testSetPageCountNegative() {
        Edition edition = new Edition();
        edition.setPageCount(-25);
        int expected = 1;
        assertEquals(expected, edition.getPageCount());
    }

    @Test
    public void testSetPageCountZero() {
        Edition edition = new Edition();
        edition.setPageCount(0);
        int expected = 1;
        assertEquals(expected, edition.getPageCount());
    }

    @Test
    public void testSetPageCountZeroWithData() {
        Edition edition = new Edition();
        edition.setPageCount(25);
        edition.setPageCount(0);
        int expected = 25;
        assertEquals(expected, edition.getPageCount());
    }

    @Test
    public void testSetPrintEdition() {
        Edition edition = new Edition();
        edition.setPrintEdition("Moscow");
        String expected = "Moscow";
        assertEquals(expected, edition.getPrintEdition());
    }

    @Test
    public void testSetPrintEditionNull() {
        Edition edition = new Edition();
        edition.setPrintEdition(null);
        String expected = "No edition";
        assertEquals(expected, edition.getPrintEdition());
    }

    @Test
    public void testSetPrintEditionNullWithData() {
        Edition edition = new Edition();
        edition.setPrintEdition("Moscow");
        edition.setPrintEdition(null);
        String expected = "Moscow";
        assertEquals(expected, edition.getPrintEdition());
    }

    @Test
    public void testSetPrintEditionZero() {
        Edition edition = new Edition();
        edition.setPrintEdition("");
        String expected = "No edition";
        assertEquals(expected, edition.getPrintEdition());
    }

    @Test
    public void testSetPrintEditionSpace() {
        Edition edition = new Edition();
        edition.setPrintEdition("     ");
        String expected = "No edition";
        assertEquals(expected, edition.getPrintEdition());
    }

    @Test
    public void testSetPrintYear() {
        Edition edition = new Edition();
        edition.setPrintYear(1999);
        int expected = 1999;
        assertEquals(expected, edition.getPrintYear());
    }

    @Test
    public void testSetPrintYearNegative() {
        Edition edition = new Edition();
        edition.setPrintYear(-1999);
        int expected = 1;
        assertEquals(expected, edition.getPrintYear());
    }

    @Test
    public void testSetPrintYearFuture() {
        Edition edition = new Edition();
        edition.setPrintYear(2220);
        int expected = 1;
        assertEquals(expected, edition.getPrintYear());
    }

    @Test
    public void testEqualsSameRef() {
        Edition edition1 = new Edition();
        Edition edition2 = edition1;
        boolean expected = true;
        assertEquals(expected, edition1.equals(edition2));
    }

    @Test
    public void testEqualsNull() {
        Edition edition1 = new Edition();
        Edition edition2 = null;
        boolean expected = false;
        assertEquals(expected, edition1.equals(edition2));
    }

    @Test
    public void testEqualsGetClass() {
        Edition edition1 = new Edition();
        String str = "Edition";
        boolean expected = false;
        assertEquals(expected, edition1.equals(str));
    }

    @Test
    public void testEqualsSameFields() {
        Edition edition1 = new Edition();
        Edition edition2 = new Edition();
        boolean expected = true;
        assertEquals(expected, edition1.checkFields(edition2));
    }

    @Test
    public void testEqualsDifferentFields() {
        Edition edition1 = new Edition();
        edition1.setPrintYear(2005);
        Edition edition2 = new Edition();
        boolean expected = false;
        assertEquals(expected, edition1.checkFields(edition2));
    }

}