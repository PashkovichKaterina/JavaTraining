package by.epam.javatraining.pashkovich.maintask01.model.logic;

import by.epam.javatraining.pashkovich.maintask01.model.MyVector;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class contains unit-test for checks class Sorted.
 *
 * @author Pashkovich Katsiaryna Vasilevna
 * @version 1.0
 * @see Sorted
 */
public class SortedTest {

    @Test
    public void testSortBubbleIncrease() {
        MyVector vector = new MyVector();
        vector.add(5, 7, 54, 9, 52);
        Sorted.sortBubbleIncrease(vector);
        MyVector expected = new MyVector();
        expected.add(5, 7, 9, 52, 54);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortBubbleIncreaseZero() {
        MyVector vector = new MyVector();
        Sorted.sortBubbleIncrease(vector);
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortBubbleIncreaseNull() {
        MyVector vector = null;
        Sorted.sortBubbleIncrease(vector);
        MyVector expected = new MyVector();
        assertFalse(expected.equals(vector));
    }

    @Test
    public void testSortBubbleDecrease() {
        MyVector vector = new MyVector();
        vector.add(5, 7, 54, 9, 52);
        Sorted.sortBubbleDecrease(vector);
        MyVector expected = new MyVector();
        expected.add(54, 52, 9, 7, 5);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortBubbleDecreaseZero() {
        MyVector vector = new MyVector();
        Sorted.sortBubbleDecrease(vector);
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortBubbleDecreaseNull() {
        MyVector vector = null;
        Sorted.sortBubbleDecrease(vector);
        MyVector expected = new MyVector();
        assertFalse(expected.equals(vector));
    }

    @Test
    public void testSortModify1BubbleIncrease() {
        MyVector vector = new MyVector();
        vector.add(5, 7, 54, 9, 52);
        Sorted.sortModify1BubbleIncrease(vector);
        MyVector expected = new MyVector();
        expected.add(5, 7, 9, 52, 54);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortModify1BubbleIncreaseZero() {
        MyVector vector = new MyVector();
        Sorted.sortModify1BubbleIncrease(vector);
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortModify1BubbleIncreaseNull() {
        MyVector vector = null;
        Sorted.sortModify1BubbleIncrease(vector);
        MyVector expected = new MyVector();
        assertFalse(expected.equals(vector));
    }

    @Test
    public void testSortModify1BubbleDecrease() {
        MyVector vector = new MyVector();
        vector.add(5, 7, 54, 9, 52);
        Sorted.sortModify1BubbleDecrease(vector);
        MyVector expected = new MyVector();
        expected.add(54, 52, 9, 7, 5);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortModify1BubbleDecreaseZero() {
        MyVector vector = new MyVector();
        Sorted.sortModify1BubbleDecrease(vector);
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortModify1BubbleDecreaseNull() {
        MyVector vector = null;
        Sorted.sortModify1BubbleDecrease(vector);
        MyVector expected = new MyVector();
        assertFalse(expected.equals(vector));
    }

    @Test
    public void testSortModify2BubbleIncrease() {
        MyVector vector = new MyVector();
        vector.add(5, 7, 54, 9, 52);
        Sorted.sortModify2BubbleIncrease(vector);
        MyVector expected = new MyVector();
        expected.add(5, 7, 9, 52, 54);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortModify2BubbleIncreaseZero() {
        MyVector vector = new MyVector();
        Sorted.sortModify2BubbleIncrease(vector);
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortModify2BubbleIncreaseNull() {
        MyVector vector = null;
        Sorted.sortModify2BubbleIncrease(vector);
        MyVector expected = new MyVector();
        assertFalse(expected.equals(vector));
    }

    @Test
    public void testSortModify2BubbleDecrease() {
        MyVector vector = new MyVector();
        vector.add(5, 7, 54, 9, 52);
        Sorted.sortModify2BubbleDecrease(vector);
        MyVector expected = new MyVector();
        expected.add(54, 52, 9, 7, 5);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortModify2BubbleDecreaseZero() {
        MyVector vector = new MyVector();
        Sorted.sortModify2BubbleDecrease(vector);
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortModify2BubbleDecreaseNull() {
        MyVector vector = null;
        Sorted.sortModify2BubbleDecrease(vector);
        MyVector expected = new MyVector();
        assertFalse(expected.equals(vector));
    }

    @Test
    public void testSortInsertionIncrease() {
        MyVector vector = new MyVector();
        vector.add(5, 7, 54, 9, 52);
        Sorted.sortInsertionIncrease(vector);
        MyVector expected = new MyVector();
        expected.add(5, 7, 9, 52, 54);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortInsertionIncreaseZero() {
        MyVector vector = new MyVector();
        Sorted.sortInsertionIncrease(vector);
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortInsertionIncreaseNull() {
        MyVector vector = null;
        Sorted.sortInsertionIncrease(vector);
        MyVector expected = new MyVector();
        assertFalse(expected.equals(vector));
    }

    @Test
    public void testSortInsertionDecrease() {
        MyVector vector = new MyVector();
        vector.add(5, 7, 54, 9, 52);
        Sorted.sortInsertionDecrease(vector);
        MyVector expected = new MyVector();
        expected.add(54, 52, 9, 7, 5);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortInsertionDecreaseZero() {
        MyVector vector = new MyVector();
        Sorted.sortInsertionDecrease(vector);
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortInsertionDecreaseNull() {
        MyVector vector = null;
        Sorted.sortInsertionDecrease(vector);
        MyVector expected = new MyVector();
        assertFalse(expected.equals(vector));
    }

    @Test
    public void testSortSelectionDecrease() {
        MyVector vector = new MyVector();
        vector.add(5, 7, 54, 9, 52);
        Sorted.sortSelectionDecrease(vector);
        MyVector expected = new MyVector();
        expected.add(54, 52, 9, 7, 5);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortSelectionDecreaseZero() {
        MyVector vector = new MyVector();
        Sorted.sortSelectionDecrease(vector);
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortSelectionDecreaseNull() {
        MyVector vector = null;
        Sorted.sortSelectionDecrease(vector);
        MyVector expected = new MyVector();
        assertFalse(expected.equals(vector));
    }

    @Test
    public void testSortSelectionIncrease() {
        MyVector vector = new MyVector();
        vector.add(5, 7, 54, 9, 52);
        Sorted.sortSelectionIncrease(vector);
        MyVector expected = new MyVector();
        expected.add(5, 7, 9, 52, 54);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortSelectionIncreaseZero() {
        MyVector vector = new MyVector();
        Sorted.sortSelectionIncrease(vector);
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortSelectionIncreaseNull() {
        MyVector vector = null;
        Sorted.sortSelectionIncrease(vector);
        MyVector expected = new MyVector();
        assertFalse(expected.equals(vector));
    }

    @Test
    public void testSortMergeIncrease() {
        MyVector vector = new MyVector();
        vector.add(5, 7, 54, 9, 52);
        Sorted.sortMergeIncrease(vector);
        MyVector expected = new MyVector();
        expected.add(5, 7, 9, 52, 54);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortMergeIncreaseZero() {
        MyVector vector = new MyVector();
        Sorted.sortMergeIncrease(vector);
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortMergeIncreaseNull() {
        MyVector vector = null;
        Sorted.sortMergeIncrease(vector);
        MyVector expected = new MyVector();
        assertFalse(expected.equals(vector));
    }

    @Test
    public void testSortMergeDecrease() {
        MyVector vector = new MyVector();
        vector.add(5, 7, 54, 9, 52);
        Sorted.sortMergeDecrease(vector);
        MyVector expected = new MyVector();
        expected.add(54, 52, 9, 7, 5);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortMergeDecreaseZero() {
        MyVector vector = new MyVector();
        Sorted.sortMergeDecrease(vector);
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortMergeDecreaseNull() {
        MyVector vector = null;
        Sorted.sortMergeDecrease(vector);
        MyVector expected = new MyVector();
        assertFalse(expected.equals(vector));
    }

    @Test
    public void testSortQuickIncrease() {
        MyVector vector = new MyVector();
        vector.add(45, 361, 89, 13, 847, 63, 64, 2);
        Sorted.sortQuickIncrease(vector);
        MyVector expected = new MyVector();
        expected.add(2, 13, 45, 63, 64, 89, 361, 847);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortQuickIncreaseZero() {
        MyVector vector = new MyVector();
        Sorted.sortQuickIncrease(vector);
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortQuickIncreaseNull() {
        MyVector vector = null;
        Sorted.sortQuickIncrease(vector);
        MyVector expected = new MyVector();
        assertFalse(expected.equals(vector));
    }

    @Test
    public void testSortQuickDecrease() {
        MyVector vector = new MyVector();
        vector.add(45, 361, 89, 13, 847, 63, 64, 2);
        Sorted.sortQuickDecrease(vector);
        MyVector expected = new MyVector();
        expected.add(847, 361, 89, 64, 63, 45, 13, 2);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortQuickDecreaseZero() {
        MyVector vector = new MyVector();
        Sorted.sortQuickDecrease(vector);
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortQuickDecreaseNull() {
        MyVector vector = null;
        Sorted.sortQuickDecrease(vector);
        MyVector expected = new MyVector();
        assertFalse(expected.equals(vector));
    }

}