package by.epam.javatraining.pashkovich.tasks.maintask02.model.entity;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AlbumTest {
    @Test
    public void testDefaultData() {
        Album album = new Album();
        StringBuilder expected = new StringBuilder();
        expected.append("Edition: Album");
        expected.append("\nTitle: Title");
        expected.append("\nGenre: No genre");
        expected.append("\nLanguage: English");
        expected.append("\nPrint Edition: No edition");
        expected.append("\nCount of pages: 1");
        expected.append("\nPrint year: 1");
        expected.append("\nCount of images: 1");
        expected.append("\nArt editor: No editor");
        assertEquals(expected.toString(), album.toString());
    }

    @Test
    public void testSetImageCountPositive() {
        Album album = new Album();
        album.setImageCount(60);
        int expected = 60;
        assertEquals(expected, album.getImageCount());
    }

    @Test
    public void testSetImageCountNegative() {
        Album album = new Album();
        album.setImageCount(-60);
        int expected = 1;
        assertEquals(expected, album.getImageCount());
    }

    @Test
    public void testSetImageCountZero() {
        Album album = new Album();
        album.setImageCount(0);
        int expected = 1;
        assertEquals(expected, album.getImageCount());
    }

    @Test
    public void testSetArtEditor() {
        Album album = new Album();
        album.setArtEditor("Petrov");
        String expected = "Petrov";
        assertEquals(expected, album.getArtEditor());
    }

    @Test
    public void testSetArtEditorNull() {
        Album album = new Album();
        album.setArtEditor(null);
        String expected = "No editor";
        assertEquals(expected, album.getArtEditor());
    }

    @Test
    public void testSetArtEditorNullWithData() {
        Album album = new Album();
        album.setArtEditor("Petrov");
        album.setArtEditor(null);
        String expected = "Petrov";
        assertEquals(expected, album.getArtEditor());
    }

    @Test
    public void testSetArtEditorZero() {
        Album album = new Album();
        album.setArtEditor("");
        String expected = "No editor";
        assertEquals(expected, album.getArtEditor());
    }

    @Test
    public void testSetArtEditorSpace() {
        Album album = new Album();
        album.setArtEditor("    ");
        String expected = "No editor";
        assertEquals(expected, album.getArtEditor());
    }

    @Test
    public void testEqualsSameRef() {
        Album album1 = new Album();
        Album album2 = album1;
        boolean expected = true;
        assertEquals(expected, album1.equals(album2));
    }

    @Test
    public void testEqualsNull() {
        Album album1 = new Album();
        Album album2 = null;
        boolean expected = false;
        assertEquals(expected, album1.equals(album2));
    }

    @Test
    public void testEqualsGetClass() {
        Album album1 = new Album();
        String album2 = "Album";
        boolean expected = false;
        assertEquals(expected, album1.equals(album2));
    }

    @Test
    public void testEqualsSameFields() {
        Album album1 = new Album();
        album1.setArtEditor("Petrov");
        Album album2 = new Album();
        album2.setArtEditor("Petrov");
        boolean expected = true;
        assertEquals(expected, album1.equals(album2));
    }

    @Test
    public void testEqualsDifferenFoelds() {
        Album album1 = new Album();
        album1.setArtEditor("Petrov");
        Album album2 = new Album();
        boolean expected = false;
        assertEquals(expected, album1.equals(album2));
    }

}