package by.epam.javatraining.pashkovich.maintask01.model.logic;

import by.epam.javatraining.pashkovich.maintask01.model.MyVector;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class contains unit-test for checks class Searched.
 *
 * @author Pashkovich Katsiaryna Vasilevna
 * @version 1.0
 * @see Searched
 */
public class SearchedTest {
    @Test
    public void testSearchLinearFirst() {
        MyVector vector = new MyVector();
        vector.add(514, 651, 3, 3, 6487, 3, 694, 65);
        double searched = 3;
        int expected = 2;
        assertEquals(expected, Searched.searchLinearFirst(vector, searched));
    }

    @Test
    public void testSearchLinearFirstMiss() {
        MyVector vector = new MyVector();
        vector.add(514, 651, 3, 3, 6487, 3, 694, 65);
        double searched = 87;
        int expected = -1;
        assertEquals(expected, Searched.searchLinearFirst(vector, searched));
    }

    @Test
    public void testSearchLinearFirstZero() {
        MyVector vector = new MyVector();
        double searched = 3;
        int expected = -1;
        assertEquals(expected, Searched.searchLinearFirst(vector, searched));
    }

    @Test
    public void testSearchLinearFirstNull() {
        MyVector vector = null;
        double searched = 3;
        int expected = -1;
        assertEquals(expected, Searched.searchLinearFirst(vector, searched));
    }

    @Test
    public void testSearchLinearLast() {
        MyVector vector = new MyVector();
        vector.add(514, 651, 3, 3, 6487, 3, 694, 65);
        double searched = 3;
        int expected = 5;
        assertEquals(expected, Searched.searchLinearLast(vector, searched));
    }

    @Test
    public void testSearchLinearLastMiss() {
        MyVector vector = new MyVector();
        vector.add(514, 651, 3, 3, 6487, 3, 694, 65);
        double searched = 87;
        int expected = -1;
        assertEquals(expected, Searched.searchLinearLast(vector, searched));
    }

    @Test
    public void testSearchLinearLastZero() {
        MyVector vector = new MyVector();
        double searched = 3;
        int expected = -1;
        assertEquals(expected, Searched.searchLinearLast(vector, searched));
    }

    @Test
    public void testSearchLinearLastNull() {
        MyVector vector = null;
        double searched = 3;
        int expected = -1;
        assertEquals(expected, Searched.searchLinearLast(vector, searched));
    }

    @Test
    public void testSearchBinaryFirst() {
        MyVector vector = new MyVector();
        vector.add(2, 6, 7, 7, 7, 7, 12, 78);
        double searched = 7;
        int expected = 2;
        assertEquals(expected, Searched.searchBinaryFirst(vector, searched));
    }

    @Test
    public void testSearchBinaryFirstMiss() {
        MyVector vector = new MyVector();
        vector.add(2, 6, 7, 7, 7, 7, 12, 78);
        double searched = 15;
        int expected = -1;
        assertEquals(expected, Searched.searchBinaryFirst(vector, searched));
    }

    @Test
    public void testSearchBinaryFirstZero() {
        MyVector vector = new MyVector();
        double searched = 7;
        int expected = -1;
        assertEquals(expected, Searched.searchBinaryFirst(vector, searched));
    }

    @Test
    public void testSearchBinaryFirstNull() {
        MyVector vector = null;
        double searched = 7;
        int expected = -1;
        assertEquals(expected, Searched.searchBinaryFirst(vector, searched));
    }

    @Test
    public void testSearchBinaryLast() {
        MyVector vector = new MyVector();
        vector.add(2, 6, 7, 7, 7, 7, 12, 78);
        double searched = 7;
        int expected = 5;
        assertEquals(expected, Searched.searchBinaryLast(vector, searched));
    }

    @Test
    public void testSearchBinaryLastMiss() {
        MyVector vector = new MyVector();
        vector.add(2, 6, 7, 7, 7, 7, 12, 78);
        double searched = 15;
        int expected = -1;
        assertEquals(expected, Searched.searchBinaryLast(vector, searched));
    }

    @Test
    public void testSearchBinaryLastZero() {
        MyVector vector = new MyVector();
        double searched = 7;
        int expected = -1;
        assertEquals(expected, Searched.searchBinaryLast(vector, searched));
    }

    @Test
    public void testSearchBinaryLastNull() {
        MyVector vector = null;
        double searched = 7;
        int expected = -1;
        assertEquals(expected, Searched.searchBinaryLast(vector, searched));
    }


}