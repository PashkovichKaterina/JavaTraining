package by.epam.javatraining.pashkovich.maintask01.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class contains unit-tests for check class MyVector.
 *
 * @author Pashkovich Katsiaryna Vasilevna
 * @version 1.0
 */

public class MyVectorTest {
    @Test
    public void testGetSizeZero() {
        MyVector vector = new MyVector();
        int expected = 0;
        assertEquals(expected, vector.getSize());
    }

    @Test
    public void testGetSizeNegative() {
        MyVector vector = new MyVector(-5);
        int expected = 0;
        assertEquals(expected, vector.getSize());
    }

    @Test
    public void testGetSizePositive() {
        MyVector vector = new MyVector(5);
        int expected = 0;
        assertEquals(expected, vector.getSize());
    }

    @Test
    public void testGetSizePositiveAdd() {
        MyVector vector = new MyVector(5);
        vector.add(5, 6);
        vector.add(7, 8, 9, 8, 7, 4, 2);
        vector.add(5, 6);
        int expected = 11;
        assertEquals(expected, vector.getSize());
    }

    @Test
    public void testGetElementPositiveIndex() {
        MyVector vector = new MyVector(5);
        vector.add(7, 9, 3, 4);
        int index = 1;
        double expected = 9;
        assertEquals(expected, vector.getElement(index), 0.1);
    }

    @Test
    public void testGetElementNegativeIndex() {
        MyVector vector = new MyVector(5);
        vector.add(7, 9, 3, 4);
        int index = -5;
        double expected = Double.NaN;
        assertEquals(expected, vector.getElement(index), 0.1);
    }

    @Test
    public void testGetElementOutOfBounds() {
        MyVector vector = new MyVector(8);
        vector.add(2, 7, 9, 3, 6);
        int index = 15;
        double expected = Double.NaN;
        assertEquals(expected, vector.getElement(index), 0.1);
    }

    @Test
    public void testSetElementPositiveIndex() {
        MyVector vector = new MyVector(5);
        vector.add(7, 9, 3, 4);
        int index = 2;
        double newValue = 8;
        vector.setElement(index, newValue);
        assertEquals(newValue, vector.getElement(index), 0.1);
    }

    @Test
    public void testToString() {
        MyVector vector = new MyVector(5);
        vector.add(7, 9, 8, 3);
        String expected = "7.0 9.0 8.0 3.0 ";
        assertEquals(expected, vector.toString());
    }

    @Test
    public void testEqualsOneRef() {
        MyVector vector = new MyVector(4);
        MyVector newVector = vector;
        boolean expected = true;
        assertEquals(expected, vector.equals(newVector));
    }

    @Test
    public void testEqualsNull() {
        MyVector vector = new MyVector(5);
        vector.add(7, 9, 8, 2, 2);
        MyVector newVector = null;
        boolean expected = false;
        assertEquals(expected, vector.equals(newVector));
    }

    @Test
    public void testEqualsClass() {
        MyVector vector = new MyVector(5);
        vector.add(7, 9, 5, 1, 2);
        String str = new String("Vector");
        boolean expected = false;
        assertEquals(expected, vector.equals(str));
    }

    @Test
    public void testEqualsCapacity() {
        MyVector vector = new MyVector(4);
        MyVector newVector = new MyVector(100);
        boolean expected = false;
        assertEquals(expected, vector.equals(newVector));
    }

    @Test
    public void testEqualsSize() {
        MyVector vector = new MyVector(5);
        vector.add(5, 2);
        MyVector newVector = new MyVector(5);
        newVector.add(7, 9, 8);
        boolean expected = false;
        assertEquals(expected, vector.equals(newVector));
    }

    @Test
    public void testEqualsValues() {
        MyVector vector = new MyVector(5);
        vector.add(7, 8, 9);
        MyVector newVector = new MyVector(5);
        newVector.add(7, 8, 9);
        boolean expected = true;
        assertEquals(expected, vector.equals(newVector));
    }

    @Test
    public void testSwap() {
        MyVector vector = new MyVector(5);
        vector.add(7, 5, 14, 61, 4, 51, 64);
        int index1 = 2, index2 = 4;
        vector.swap(index1, index2);
        MyVector expected = new MyVector();
        expected.add(7, 5, 4, 61, 14, 51, 64);
        assertTrue(expected.equals(vector));
    }

    @Test
    public void testSwapOutOfBounds() {
        MyVector vector = new MyVector(5);
        vector.add(7, 5, 14, 61, 4, 51, 64);
        int index1 = -5, index2 = 24;
        vector.swap(index1, index2);
        MyVector expected = new MyVector();
        expected.add(7, 5, 14, 61, 4, 51, 64);
        assertTrue(expected.equals(vector));
    }
}
