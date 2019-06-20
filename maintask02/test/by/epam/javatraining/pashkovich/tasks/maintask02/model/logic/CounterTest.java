package by.epam.javatraining.pashkovich.tasks.maintask02.model.logic;

import by.epam.javatraining.pashkovich.tasks.maintask02.model.entity.Album;
import by.epam.javatraining.pashkovich.tasks.maintask02.model.entity.Book;
import by.epam.javatraining.pashkovich.tasks.maintask02.model.entity.Library;
import by.epam.javatraining.pashkovich.tasks.maintask02.model.entity.Magazine;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CounterTest {
    @Test
    public void testCalcBookCount() {
        Library library = new Library();
        library.add(new Book(), new Album(), new Album(), new Book());
        int expected = 2;
        assertEquals(expected, Counter.calcBookCount(library));
    }

    @Test
    public void testCalcBookCountNull() {
        Library library = null;
        int expected = -1;
        assertEquals(expected, Counter.calcBookCount(library));
    }

    @Test
    public void testCalcBookCountZero() {
        Library library = new Library();
        int expected = 0;
        assertEquals(expected, Counter.calcAlbumCount(library));
    }

    @Test
    public void testCalcAlbumCount() {
        Library library = new Library();
        library.add(new Book(), new Album(), new Album(), new Book());
        int expected = 2;
        assertEquals(expected, Counter.calcAlbumCount(library));
    }

    @Test
    public void testCalcAlbumCountNull() {
        Library library = null;
        int expected = -1;
        assertEquals(expected, Counter.calcAlbumCount(library));
    }

    @Test
    public void testCalcAlbumCountZero() {
        Library library = new Library();
        int expected = 0;
        assertEquals(expected, Counter.calcAlbumCount(library));
    }

    @Test
    public void testCalcMagazineCount() {
        Library library = new Library();
        library.add(new Book(), new Magazine(), new Album(), new Book());
        int expected = 1;
        assertEquals(expected, Counter.calcMagazineCount(library));
    }

    @Test
    public void testCalcMagazineCountNull() {
        Library library = null;
        int expected = -1;
        assertEquals(expected, Counter.calcMagazineCount(library));
    }

    @Test
    public void testCalcMagazineCountZero() {
        Library library = new Library();
        int expected = 0;
        assertEquals(expected, Counter.calcMagazineCount(library));
    }

    @Test
    public void testCalcBookCountByAuthor() {
        Library library = new Library();
        Book book1 = new Book();
        book1.setAuthor("Pushkin");
        Book book2 = new Book();
        book2.setAuthor("Esenin");
        Book book3 = new Book();
        book3.setAuthor("Esenin");
        library.add(book3, book1, book2);
        String author = "Esenin";
        int expected = 2;
        assertEquals(expected, Counter.calcBookCountByAuthor(library, author));
    }

    @Test
    public void testCalcBookCountByAuthorNullLibrary() {
        Library library = null;
        String author = "Esenin";
        int expected = -1;
        assertEquals(expected, Counter.calcBookCountByAuthor(library, author));
    }

    @Test
    public void testCalcBookCountByAuthorNullAuthor() {
        Library library = new Library();
        Book book1 = new Book();
        book1.setAuthor("Pushkin");
        Book book2 = new Book();
        book2.setAuthor("Esenin");
        Book book3 = new Book();
        book3.setAuthor("Esenin");
        library.add(book3, book1, book2);
        String author = null;
        int expected = -1;
        assertEquals(expected, Counter.calcBookCountByAuthor(library, author));
    }

    @Test
    public void testCalcBookCountByAuthorZero() {
        Library library = new Library();
        String author = "Esenin";
        int expected = 0;
        assertEquals(expected, Counter.calcBookCountByAuthor(library, author));
    }

    @Test
    public void testCalcAlbumCountByArtEditor() {
        Library library = new Library();
        Album album1 = new Album();
        album1.setArtEditor("Pushkin");
        Album album2 = new Album();
        album2.setArtEditor("Esenin");
        Album album3 = new Album();
        album3.setArtEditor("Esenin");
        library.add(album1, album2, album3);
        String author = "Esenin";
        int expected = 2;
        assertEquals(expected, Counter.calcAlbumCountByArtEditor(library, author));
    }

    @Test
    public void testCalcAlbumCountByArtEditorNullLibrary() {
        Library library = null;
        String author = "Esenin";
        int expected = -1;
        assertEquals(expected, Counter.calcAlbumCountByArtEditor(library, author));
    }

    @Test
    public void testCalcAlbumCountByArtEditorNullEditor() {
        Library library = new Library();
        Album album1 = new Album();
        album1.setArtEditor("Pushkin");
        Album album2 = new Album();
        album2.setArtEditor("Esenin");
        Album album3 = new Album();
        album3.setArtEditor("Esenin");
        library.add(album1, album2, album3);
        String author = null;
        int expected = -1;
        assertEquals(expected, Counter.calcAlbumCountByArtEditor(library, author));
    }

    @Test
    public void testCalcAlbumCountByArtEditorZero() {
        Library library = new Library();
        String author = "Esenin";
        int expected = 0;
        assertEquals(expected, Counter.calcAlbumCountByArtEditor(library, author));
    }

    @Test
    public void testCalcMagazineCountByEditor() {
        Library library = new Library();
        Magazine magazine1 = new Magazine();
        magazine1.setEditor("Pushkin");
        Magazine magazine2 = new Magazine();
        magazine2.setEditor("Esenin");
        Magazine magazine3 = new Magazine();
        magazine3.setEditor("Esenin");
        library.add(magazine1, magazine2, magazine3);
        String author = "Esenin";
        int expected = 2;
        assertEquals(expected, Counter.calcMagazineCountByEditor(library, author));
    }

    @Test
    public void testCalcMagazineCountByEditorNullLibrary() {
        Library library = null;
        String author = "Esenin";
        int expected = -1;
        assertEquals(expected, Counter.calcMagazineCountByEditor(library, author));
    }

    @Test
    public void testCalcMagazineCountByEditorNullEditor() {
        Library library = new Library();
        Magazine magazine1 = new Magazine();
        magazine1.setEditor("Pushkin");
        Magazine magazine2 = new Magazine();
        magazine2.setEditor("Esenin");
        Magazine magazine3 = new Magazine();
        magazine3.setEditor("Esenin");
        library.add(magazine1, magazine2, magazine3);
        String author = null;
        int expected = -1;
        assertEquals(expected, Counter.calcMagazineCountByEditor(library, author));
    }

    @Test
    public void testCalcMagazineCountByEditorZero() {
        Library library = new Library();
        String author = "Esenin";
        int expected = 0;
        assertEquals(expected, Counter.calcMagazineCountByEditor(library, author));
    }

    @Test
    public void testCalcEditionCountByGenre() {
        Library library = new Library();
        Book book = new Book();
        book.setGenre("Fantasy");
        Album album = new Album();
        album.setGenre("Fantasy");
        Magazine magazine = new Magazine();
        magazine.setGenre("Home");
        library.add(book, magazine, album);
        String genre = "Fantasy";
        int expected = 2;
        assertEquals(expected, Counter.calcEditionCountByGenre(library, genre));
    }

    @Test
    public void testCalcEditionCountByGenreNullLibrary() {
        Library library = null;
        String genre = "Fantasy";
        int expected = -1;
        assertEquals(expected, Counter.calcEditionCountByGenre(library, genre));
    }

    @Test
    public void testCalcEditionCountByGenreNullGenre() {
        Library library = new Library();
        Book book = new Book();
        book.setGenre("Fantasy");
        Album album = new Album();
        album.setGenre("Fantasy");
        Magazine magazine = new Magazine();
        magazine.setGenre("Home");
        library.add(book, magazine, album);
        String genre = null;
        int expected = -1;
        assertEquals(expected, Counter.calcEditionCountByGenre(library, genre));
    }

    @Test
    public void testCalcEditionCountByGenreZero() {
        Library library = new Library();
        String genre = "Fantasy";
        int expected = 0;
        assertEquals(expected, Counter.calcEditionCountByGenre(library, genre));
    }

    @Test
    public void testCalcEditionCountByLanguage() {
        Library library = new Library();
        Book book = new Book();
        book.setLanguage("France");
        Album album = new Album();
        Magazine magazine = new Magazine();
        library.add(book, magazine, album);
        String genre = "English";
        int expected = 2;
        assertEquals(expected, Counter.calcEditionCountByLanguage(library, genre));
    }

    @Test
    public void testCalcEditionCountByLanguageNullLibrary() {
        Library library = null;
        String genre = "English";
        int expected = -1;
        assertEquals(expected, Counter.calcEditionCountByLanguage(library, genre));
    }

    @Test
    public void testCalcEditionCountByLanguageNullLanguage() {
        Library library = new Library();
        Book book = new Book();
        book.setLanguage("France");
        Album album = new Album();
        Magazine magazine = new Magazine();
        library.add(book, magazine, album);
        String genre = null;
        int expected = -1;
        assertEquals(expected, Counter.calcEditionCountByLanguage(library, genre));
    }

    @Test
    public void testCalcEditionCountByLanguageZero() {
        Library library = new Library();
        String genre = "English";
        int expected = 0;
        assertEquals(expected, Counter.calcEditionCountByLanguage(library, genre));
    }

    @Test
    public void testCalcEditionCountByPrintEdition() {
        Library library = new Library();
        Book book = new Book();
        book.setPrintEdition("Moscow");
        Album album = new Album();
        album.setPrintEdition("Moscow");
        Magazine magazine = new Magazine();
        library.add(book, magazine, album);
        String printEdition = "Moscow";
        int expected = 2;
        assertEquals(expected, Counter.calcEditionCountByPrintEdition(library, printEdition));
    }

    @Test
    public void testCalcEditionCountByPrintEditionNullLibrary() {
        Library library = null;
        String printEdition = "Moscow";
        int expected = -1;
        assertEquals(expected, Counter.calcEditionCountByLanguage(library, printEdition));
    }

    @Test
    public void testCalcEditionCountByPrintEditionNullEdition() {
        Library library = new Library();
        Book book = new Book();
        book.setPrintEdition("Moscow");
        Album album = new Album();
        album.setPrintEdition("Moscow");
        Magazine magazine = new Magazine();
        library.add(book, magazine, album);
        String printEdition = null;
        int expected = -1;
        assertEquals(expected, Counter.calcEditionCountByLanguage(library, printEdition));
    }

    @Test
    public void testCalcEditionCountByPrintEditionZero() {
        Library library = new Library();
        String printEdition = "Moscow";
        int expected = 0;
        assertEquals(expected, Counter.calcEditionCountByLanguage(library, printEdition));
    }

}