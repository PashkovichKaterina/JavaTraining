package by.epam.javatraining.pashkovich.tasks.maintask02.model.entity;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LibraryTest {
    @Test
    public void testGetSizeZero() {
        Library library = new Library();
        int expected = 0;
        assertEquals(expected, library.getSize());
    }

    @Test
    public void testGetSizeNegative() {
        Library library = new Library(-5);
        int expected = 0;
        assertEquals(expected, library.getSize());
    }

    @Test
    public void testGetSizePositive() {
        Library library = new Library(5);
        int expected = 0;
        assertEquals(expected, library.getSize());
    }

    @Test
    public void testGetSizePositiveAdd() {
        Library library = new Library(5);
        library.add(new Book(), new Magazine(), new Album());
        library.add(new Book());
        int expected = 4;
        assertEquals(expected, library.getSize());
    }

    @Test
    public void testGetElementPositiveIndex() {
        Library library = new Library(5);
        Book book = new Book();
        Magazine magazine = new Magazine();
        Album album = new Album();
        library.add(book, magazine, album);
        int index = 1;
        assertEquals(magazine, library.getElement(index));
    }

    @Test
    public void testGetElementNegativeIndex() {
        Library library = new Library(5);
        Book book = new Book();
        Magazine magazine = new Magazine();
        Album album = new Album();
        library.add(book, magazine, album);
        int index = -5;
        Edition expected = new Edition();
        assertEquals(expected, library.getElement(index));
    }

    @Test
    public void testGetElementOutOfBounds() {
        Library library = new Library(5);
        Book book = new Book();
        Magazine magazine = new Magazine();
        Album album = new Album();
        library.add(book, magazine, album);
        int index = 5;
        Edition expected = new Edition();
        assertEquals(expected, library.getElement(index));
    }


    @Test
    public void testSetElementPositiveIndex() {
        Library library = new Library(5);
        library.add(new Book(), new Magazine());
        int index = 1;
        Edition newValue = new Album();
        library.setElement(index, newValue);
        assertEquals(newValue, library.getElement(index));
    }


    @Test
    public void testEqualsOneRef() {
        Library library1 = new Library(4);
        Library library2 = library1;
        boolean expected = true;
        assertEquals(expected, library1.equals(library2));
    }

    @Test
    public void testEqualsNull() {
        Library library1 = new Library(4);
        Library library2 = null;
        boolean expected = false;
        assertEquals(expected, library1.equals(library2));
    }

    @Test
    public void testEqualsGetClass() {
        Library library1 = new Library(4);
        String library2 = "Library";
        boolean expected = false;
        assertEquals(expected, library1.equals(library2));
    }

    @Test
    public void testEqualsCapacity() {
        Library library1 = new Library(4);
        Library library2 = new Library(100);
        boolean expected = false;
        assertEquals(expected, library1.equals(library2));
    }

    @Test
    public void testEqualsSize() {
        Library library1 = new Library(5);
        library1.add(new Book());
        Library library2 = new Library(5);
        library2.add(new Book(), new Book());
        boolean expected = false;
        assertEquals(expected, library1.equals(library2));
    }

    @Test
    public void testEqualsValue() {
        Library library1 = new Library(4);
        library1.add(new Book(), new Magazine());
        Library library2 = new Library(4);
        library2.add(new Book(), new Album());
        boolean expected = false;
        assertEquals(expected, library1.equals(library2));
    }
}