package by.epam.javatraining.pashkovich.tasks.maintask02.model.logic;

import by.epam.javatraining.pashkovich.tasks.maintask02.model.entity.Album;
import by.epam.javatraining.pashkovich.tasks.maintask02.model.entity.Book;
import by.epam.javatraining.pashkovich.tasks.maintask02.model.entity.Library;
import by.epam.javatraining.pashkovich.tasks.maintask02.model.entity.Magazine;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SearchedTest {
    @Test
    public void testFindPositionPopularEdition() {
        Library library = new Library();
        Book book = new Book();
        book.setOrderCount(5);
        Album album = new Album();
        album.setOrderCount(20);
        Magazine magazine = new Magazine();
        magazine.setOrderCount(15);
        library.add(book, album, magazine);
        int expected = 1;
        assertEquals(expected, Searched.findPositionPopularEdition(library));
    }

    @Test
    public void testFindPositionPopularEditionFirst() {
        Library library = new Library();
        Book book = new Book();
        book.setOrderCount(5);
        Album album = new Album();
        album.setOrderCount(20);
        Magazine magazine = new Magazine();
        magazine.setOrderCount(15);
        library.add(album, book, magazine);
        int expected = 0;
        assertEquals(expected, Searched.findPositionPopularEdition(library));
    }

    @Test
    public void testFindPositionPopularEditionLast() {
        Library library = new Library();
        Book book = new Book();
        book.setOrderCount(5);
        Album album = new Album();
        album.setOrderCount(20);
        Magazine magazine = new Magazine();
        magazine.setOrderCount(15);
        library.add(book, magazine, album);
        int expected = 2;
        assertEquals(expected, Searched.findPositionPopularEdition(library));
    }

    @Test
    public void testFindPositionPopularEditionNull() {
        Library library = null;
        int expected = -1;
        assertEquals(expected, Searched.findPositionPopularEdition(library));
    }

    @Test
    public void testFindPositionPopularEditionZero() {
        Library library = new Library();
        int expected = -1;
        assertEquals(expected, Searched.findPositionPopularEdition(library));
    }

    @Test
    public void testFindPositionPopularBook() {
        Library library = new Library();
        Book book = new Book();
        book.setOrderCount(5);
        Album album = new Album();
        album.setOrderCount(20);
        Book book1 = new Book();
        book1.setOrderCount(15);
        library.add(book, album, book1);
        int expected = 2;
        assertEquals(expected, Searched.findPositionPopularBook(library));
    }

    @Test
    public void testFindPositionPopularBookNull() {
        Library library = null;
        int expected = -1;
        assertEquals(expected, Searched.findPositionPopularBook(library));
    }

    @Test
    public void testFindPositionPopularBookZero() {
        Library library = new Library();
        int expected = -1;
        assertEquals(expected, Searched.findPositionPopularBook(library));
    }

    @Test
    public void testFindPositionPopularAlbumNull() {
        Library library = null;
        int expected = -1;
        assertEquals(expected, Searched.findPositionPopularAlbum(library));
    }

    @Test
    public void testFindPositionPopularAlbum() {
        Library library = new Library();
        Album album = new Album();
        album.setOrderCount(5);
        Magazine magazine = new Magazine();
        magazine.setOrderCount(20);
        Album album2 = new Album();
        album2.setOrderCount(15);
        library.add(album2, magazine, album);
        int expected = 0;
        assertEquals(expected, Searched.findPositionPopularAlbum(library));
    }

    @Test
    public void testFindPositionPopularAlbumZero() {
        Library library = new Library();
        int expected = -1;
        assertEquals(expected, Searched.findPositionPopularAlbum(library));
    }


    @Test
    public void testFindPositionBigEdition() {
        Library library = new Library();
        Book book = new Book();
        book.setPageCount(5);
        Album album = new Album();
        album.setPageCount(20);
        Magazine magazine = new Magazine();
        magazine.setPageCount(15);
        library.add(book, album, magazine);
        int expected = 1;
        assertEquals(expected, Searched.findPositionBigEdition(library));
    }

    @Test
    public void testFindPositionBigEditionNull() {
        Library library = null;
        int expected = -1;
        assertEquals(expected, Searched.findPositionBigEdition(library));
    }

    @Test
    public void testFindPositionBigEditionZero() {
        Library library = new Library();
        int expected = -1;
        assertEquals(expected, Searched.findPositionBigEdition(library));
    }

    @Test
    public void testFindPositionBigBook() {
        Library library = new Library();
        Book book = new Book();
        book.setPageCount(5);
        Book book1 = new Book();
        book1.setPageCount(20);
        Magazine magazine = new Magazine();
        magazine.setPageCount(15);
        library.add(book, book1, magazine);
        int expected = 1;
        assertEquals(expected, Searched.findPositionBigBook(library));
    }

    @Test
    public void testFindPositionBigBookNull() {
        Library library = null;
        int expected = -1;
        assertEquals(expected, Searched.findPositionBigBook(library));
    }

    @Test
    public void testFindPositionBigBookZero() {
        Library library = new Library();
        int expected = -1;
        assertEquals(expected, Searched.findPositionBigBook(library));
    }

    @Test
    public void testFindPositionBigAlbum() {
        Library library = new Library();
        Album album = new Album();
        album.setPageCount(5);
        Album album1 = new Album();
        album1.setPageCount(20);
        Magazine magazine = new Magazine();
        magazine.setPageCount(15);
        library.add(album, album1, magazine);
        int expected = 1;
        assertEquals(expected, Searched.findPositionBigAlbum(library));
    }

    @Test
    public void testFindPositionBigAlbumZero() {
        Library library = new Library();
        int expected = -1;
        assertEquals(expected, Searched.findPositionBigBook(library));
    }

    @Test
    public void testFindPositionBigAlbumNull() {
        Library library = null;
        int expected = -1;
        assertEquals(expected, Searched.findPositionBigBook(library));
    }

    @Test
    public void testFindPositionBigMagazine() {
        Library library = new Library();
        Album album = new Album();
        album.setPageCount(5);
        Magazine magazine1 = new Magazine();
        magazine1.setPageCount(20);
        Magazine magazine = new Magazine();
        magazine.setPageCount(15);
        library.add(album, magazine1, magazine);
        int expected = 1;
        assertEquals(expected, Searched.findPositionBigMagazine(library));
    }

    @Test
    public void testFindPositionBigMagazineNull() {
        Library library = null;
        int expected = -1;
        assertEquals(expected, Searched.findPositionBigBook(library));
    }

    @Test
    public void testFindPositionBigMagazineZero() {
        Library library = new Library();
        int expected = -1;
        assertEquals(expected, Searched.findPositionBigMagazine(library));
    }

    @Test
    public void testFindPositionByTitle() {
        Library library = new Library();
        Album album = new Album();
        album.setTitle("Magazine");
        Book book = new Book();
        book.setTitle("Book");
        Magazine magazine = new Magazine();
        magazine.setTitle("New magazine");
        library.add(album, book, magazine);
        String title = "Magazine";
        int expected = 0;
        assertEquals(expected, Searched.findPositionByTitle(library, title));
    }

    @Test
    public void testFindPositionByTitleNullLibrary() {
        Library library = null;
        String title = "Magazine";
        int expected = -1;
        assertEquals(expected, Searched.findPositionByTitle(library, title));
    }

    @Test
    public void testFindPositionByTitleNullTitle() {
        Library library = new Library();
        Album album = new Album();
        album.setTitle("Magazine");
        Book book = new Book();
        book.setTitle("Book");
        Magazine magazine = new Magazine();
        magazine.setTitle("New magazine");
        library.add(album, book, magazine);
        String title = null;
        int expected = -1;
        assertEquals(expected, Searched.findPositionByTitle(library, title));
    }

    @Test
    public void testFindPositionByTitleZero() {
        Library library = new Library();
        String title = "Magazine";
        int expected = -1;
        assertEquals(expected, Searched.findPositionByTitle(library, title));
    }
}