package by.epam.javatraining.pashkovich.tasks.maintask02.model.entity;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BookTest {
    @Test
    public void testEmptyData() {
        Book book = new Book();
        StringBuilder expected = new StringBuilder();
        expected.append("Edition: Book");
        expected.append("\nTitle: Title");
        expected.append("\nGenre: No genre");
        expected.append("\nLanguage: English");
        expected.append("\nPrint Edition: No edition");
        expected.append("\nCount of pages: 1");
        expected.append("\nPrint year: 1");
        expected.append("\nAuthor: No author");
        assertEquals(expected.toString(), book.toString());
    }

    @Test
    public void testSetAuthor() {
        Book book = new Book();
        book.setAuthor("Pushkin");
        String expected = "Pushkin";
        assertEquals(expected, book.getAuthor());
    }

    @Test
    public void testSetAuthorNull() {
        Book book = new Book();
        book.setAuthor(null);
        String expected = "No author";
        assertEquals(expected, book.getAuthor());
    }

    @Test
    public void testSetAuthorNullWithData() {
        Book book = new Book();
        book.setAuthor("Pushkin");
        book.setAuthor(null);
        String expected = "Pushkin";
        assertEquals(expected, book.getAuthor());
    }

    @Test
    public void testSetAuthorZero() {
        Book book = new Book();
        book.setAuthor("");
        String expected = "No author";
        assertEquals(expected, book.getAuthor());
    }

    @Test
    public void testSetAuthorSpace() {
        Book book = new Book();
        book.setAuthor("   ");
        String expected = "No author";
        assertEquals(expected, book.getAuthor());
    }

    @Test
    public void testEqualsSameRef() {
        Book book1 = new Book();
        Book book2 = book1;
        boolean expected = true;
        assertEquals(expected, book1.equals(book2));
    }

    @Test
    public void testEqualsNull() {
        Book book1 = new Book();
        Book book2 = null;
        boolean expected = false;
        assertEquals(expected, book1.equals(book2));
    }

    @Test
    public void testEqualsGetClass() {
        Book book1 = new Book();
        String book2 = "Book";
        boolean expected = false;
        assertEquals(expected, book1.equals(book2));
    }

    @Test
    public void testEqualsSameFields() {
        Book book1 = new Book();
        Book book2 = new Book();
        boolean expected = true;
        assertEquals(expected, book1.equals(book2));
    }

    @Test
    public void testEqualsDifferentFields() {
        Book book1 = new Book();
        book1.setAuthor("Pushkin");
        Book book2 = new Book();
        boolean expected = false;
        assertEquals(expected, book1.equals(book2));
    }

}