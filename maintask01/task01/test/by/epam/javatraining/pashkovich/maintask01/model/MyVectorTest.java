package by.epam.javatraining.pashkovich.maintask01.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class contains unit-tests for check class VectorLogic.
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
        double expected = 9;
        assertEquals(expected, vector.getElement(1), 0.1);
    }

    @Test
    public void testGetElementNegativeIndex() {
        MyVector vector = new MyVector(5);
        vector.add(7, 9, 3, 4);
        double expected = Double.NaN;
        assertEquals(expected, vector.getElement(-5), 0.1);
    }

    @Test
    public void testSetElementPositiveIndex() {
        MyVector vector = new MyVector(5);
        vector.add(7, 9, 3, 4);
        vector.setElement(2, 8);
        double expected = 8;
        assertEquals(expected, vector.getElement(2), 0.1);
    }

    @Test
    public void testEqualsOneRef() {
        MyVector vector = new MyVector(4);
        MyVector newVector = vector;
        boolean expected = true;
        assertEquals(expected, vector.equals(newVector));
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
    public void testFindMax() {
        MyVector vector = new MyVector(5);
        vector.add(7, 9, 3, 4, 7, 3);
        double expected = 9;
        assertEquals(expected, vector.findMax(), 0.1);
    }

    @Test
    public void testFindMaxZero() {
        MyVector vector = new MyVector(5);
        double expected = Double.MIN_VALUE;
        assertEquals(expected, vector.findMax(), 0.1);
    }

    @Test
    public void testFindMin() {
        MyVector vector = new MyVector(5);
        vector.add(7, 9, 3, -4, 7, 0);
        double expected = -4;
        assertEquals(expected, vector.findMin(), 0.1);
    }

    @Test
    public void testFindMinZero() {
        MyVector vector = new MyVector(5);
        double expected = Double.MAX_VALUE;
        assertEquals(expected, vector.findMin(), 0.1);
    }

    @Test
    public void testCalcArithmeticAverage() {
        MyVector vector = new MyVector();
        vector.add(5, 12, 6, 1);
        double expected = 6;
        assertEquals(expected, vector.calcArithmeticAverage(), 0.1);
    }

    @Test
    public void testCalcArithmeticAverageZero() {
        MyVector vector = new MyVector();
        double expected = Double.NaN;
        assertEquals(expected, vector.calcArithmeticAverage(), 0.1);
    }

    @Test
    public void testCalcGeometricAverage() {
        MyVector vector = new MyVector();
        vector.add(5, 25, 5, 1);
        double expected = 5;
        assertEquals(expected, vector.calcGeometricAverage(), 0.1);
    }

    @Test
    public void testCalcGeometricAverageZero() {
        MyVector vector = new MyVector();
        double expected = Double.NaN;
        assertEquals(expected, vector.calcGeometricAverage(), 0.1);
    }

    @Test
    public void testIsDecreasingDecrease() {
        MyVector vector = new MyVector();
        vector.add(56, 12, 8, 4, 3);
        boolean expected = true;
        assertEquals(expected, vector.isDecreasing());
    }

    @Test
    public void testIsDecreasingIncrease() {
        MyVector vector = new MyVector();
        vector.add(1, 3, 4, 56, 78);
        boolean expected = false;
        assertEquals(expected, vector.isDecreasing());
    }

    @Test
    public void testIsDecreasingNeither() {
        MyVector vector = new MyVector();
        vector.add(1, 56, 40, 5, 1);
        boolean expected = false;
        assertEquals(expected, vector.isDecreasing());
    }

    @Test
    public void testIsDecreasingZero() {
        MyVector vector = new MyVector();
        boolean expected = false;
        assertEquals(expected, vector.isDecreasing());
    }

    @Test
    public void testIsIncreasingDecrease() {
        MyVector vector = new MyVector();
        vector.add(56, 12, 8, 4, 3);
        boolean expected = false;
        assertEquals(expected, vector.isIncreasing());
    }

    @Test
    public void testIsIncreasingIncrease() {
        MyVector vector = new MyVector();
        vector.add(1, 3, 4, 56, 78);
        boolean expected = true;
        assertEquals(expected, vector.isIncreasing());
    }

    @Test
    public void testIsIncreasingNeither() {
        MyVector vector = new MyVector();
        vector.add(1, 56, 40, 5, 1);
        double[] array = {1, 56, 40, 5, 1};
        boolean expected = false;
        assertEquals(expected, vector.isIncreasing());
    }

    @Test
    public void testIsIncreasingZero() {
        MyVector vector = new MyVector();
        boolean expected = false;
        assertEquals(expected, vector.isIncreasing());
    }

    @Test
    public void testIsOrderedDecrease() {
        MyVector vector = new MyVector();
        vector.add(89, 45, 23, 12, 5);
        boolean expected = true;
        assertEquals(expected, vector.isOrdered());
    }

    @Test
    public void testIsOrderedIncrease() {
        MyVector vector = new MyVector();
        vector.add(5, 6, 46, 78, 90);
        boolean expected = true;
        assertEquals(expected, vector.isOrdered());
    }

    @Test
    public void testIsOrderedNeither() {
        MyVector vector = new MyVector();
        vector.add(54, 31, 87, 41, 654);
        boolean expected = false;
        assertEquals(expected, vector.isOrdered());
    }

    @Test
    public void testIsOrderedZero() {
        MyVector vector = new MyVector();
        boolean expected = false;
        assertEquals(expected, vector.isOrdered());
    }

    @Test
    public void testFindFirstLocalMinPosition() {
        MyVector vector = new MyVector();
        vector.add(7, 7, 2, 5, 1, 3);
        int expected = 2;
        assertEquals(expected, vector.findFirstLocalMinPosition());
    }

    @Test
    public void testFindFirstLocalMinPositionNeither() {
        MyVector vector = new MyVector();
        vector.add(7, 7, 7, 8, 9, 15);
        int expected = -1;
        assertEquals(expected, vector.findFirstLocalMinPosition());
    }

    @Test
    public void testFindFirstLocalMinPositionZero() {
        MyVector vector = new MyVector();
        int expected = -1;
        assertEquals(expected, vector.findFirstLocalMinPosition());
    }

    @Test
    public void testFindLastLocalMinPosition() {
        MyVector vector = new MyVector();
        vector.add(7, 7, 2, 5, 1, 3);
        int expected = 4;
        assertEquals(expected, vector.findLastLocalMinPosition());
    }

    @Test
    public void testFindLastLocalMinPositionNeither() {
        MyVector vector = new MyVector();
        vector.add(7, 7, 7, 8, 9, 15);
        int expected = -1;
        assertEquals(expected, vector.findLastLocalMinPosition());
    }

    @Test
    public void testFindLastLocalMinPositionZero() {
        MyVector vector = new MyVector();
        int expected = -1;
        assertEquals(expected, vector.findLastLocalMinPosition());
    }

    @Test
    public void testFindFirstLocalMaxPositionInner() {
        MyVector vector = new MyVector();
        vector.add(7, 7, 22, 3, 78, 5);
        int expected = 2;
        assertEquals(expected, vector.findFirstLocalMaxPosition());
    }

    @Test
    public void testFindFirstLocalMaxPositionNeither() {
        MyVector vector = new MyVector();
        vector.add(7, 7, 7, 8, 8, 2);
        int expected = -1;
        assertEquals(expected, vector.findFirstLocalMaxPosition());
    }

    @Test
    public void testFindFirstLocalMaxPositionZero() {
        MyVector vector = new MyVector();
        int expected = -1;
        assertEquals(expected, vector.findFirstLocalMaxPosition());
    }

    @Test
    public void testFindLastLocalMaxPositionInner() {
        MyVector vector = new MyVector();
        vector.add(7, 7, 22, 3, 78, 5);
        int expected = 4;
        assertEquals(expected, vector.findLastLocalMaxPosition());
    }

    @Test
    public void testFindLastLocalMaxPositionNeither() {
        MyVector vector = new MyVector();
        vector.add(7, 7, 7, 8, 8, 2);
        int expected = -1;
        assertEquals(expected, vector.findLastLocalMaxPosition());
    }

    @Test
    public void testFindLastLocalMaxPositionZero() {
        MyVector vector = new MyVector();
        int expected = -1;
        assertEquals(expected, vector.findLastLocalMaxPosition());
    }

    @Test
    public void testReverse() {
        MyVector vector = new MyVector();
        vector.add(546, 8, 13, 6, 4, 3125, 9, 4, 31, 4, 645);
        vector.reverse();
        MyVector expected = new MyVector();
        expected.add(645, 4, 31, 4, 9, 3125, 4, 6, 13, 8, 546);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testReverseZero() {
        MyVector vector = new MyVector();
        vector.reverse();
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortBubbleIncrease() {
        MyVector vector = new MyVector();
        vector.add(5, 7, 54, 9, 52);
        vector.sortBubbleIncrease();
        MyVector expected = new MyVector();
        expected.add(5, 7, 9, 52, 54);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortBubbleIncreaseZero() {
        MyVector vector = new MyVector();
        vector.sortBubbleIncrease();
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortBubbleDecrease() {
        MyVector vector = new MyVector();
        vector.add(5, 7, 54, 9, 52);
        vector.sortBubbleDecrease();
        MyVector expected = new MyVector();
        expected.add(54, 52, 9, 7, 5);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortBubbleDecreaseZero() {
        MyVector vector = new MyVector();
        vector.sortBubbleDecrease();
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortModify1BubbleIncrease() {
        MyVector vector = new MyVector();
        vector.add(5, 7, 54, 9, 52);
        vector.sortModify1BubbleIncrease();
        MyVector expected = new MyVector();
        expected.add(5, 7, 9, 52, 54);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortModify1BubbleIncreaseZero() {
        MyVector vector = new MyVector();
        vector.sortModify1BubbleIncrease();
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortModify1BubbleDecrease() {
        MyVector vector = new MyVector();
        vector.add(5, 7, 54, 9, 52);
        vector.sortModify1BubbleDecrease();
        MyVector expected = new MyVector();
        expected.add(54, 52, 9, 7, 5);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortModify1BubbleDecreaseZero() {
        MyVector vector = new MyVector();
        vector.sortModify1BubbleDecrease();
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortModify2BubbleIncrease() {
        MyVector vector = new MyVector();
        vector.add(5, 7, 54, 9, 52);
        vector.sortModify2BubbleIncrease();
        MyVector expected = new MyVector();
        expected.add(5, 7, 9, 52, 54);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortModify2BubbleIncreaseZero() {
        MyVector vector = new MyVector();
        vector.sortModify2BubbleIncrease();
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortModify2BubbleDecrease() {
        MyVector vector = new MyVector();
        vector.add(5, 7, 54, 9, 52);
        vector.sortModify2BubbleDecrease();
        MyVector expected = new MyVector();
        expected.add(54, 52, 9, 7, 5);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortModify2BubbleDecreaseZero() {
        MyVector vector = new MyVector();
        vector.sortModify2BubbleDecrease();
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortInsertionIncrease() {
        MyVector vector = new MyVector();
        vector.add(5, 7, 54, 9, 52);
        vector.sortInsertionIncrease();
        MyVector expected = new MyVector();
        expected.add(5, 7, 9, 52, 54);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortInsertionIncreaseZero() {
        MyVector vector = new MyVector();
        vector.sortInsertionIncrease();
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortInsertionDecrease() {
        MyVector vector = new MyVector();
        vector.add(5, 7, 54, 9, 52);
        vector.sortInsertionDecrease();
        MyVector expected = new MyVector();
        expected.add(54, 52, 9, 7, 5);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortInsertionDecreaseZero() {
        MyVector vector = new MyVector();
        vector.sortInsertionDecrease();
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortSelectionDecrease() {
        MyVector vector = new MyVector();
        vector.add(5, 7, 54, 9, 52);
        vector.sortSelectionDecrease();
        MyVector expected = new MyVector();
        expected.add(54, 52, 9, 7, 5);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortSelectionDecreaseZero() {
        MyVector vector = new MyVector();
        vector.sortSelectionDecrease();
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortSelectionIncrease() {
        MyVector vector = new MyVector();
        vector.add(5, 7, 54, 9, 52);
        vector.sortSelectionIncrease();
        MyVector expected = new MyVector();
        expected.add(5, 7, 9, 52, 54);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortSelectionIncreaseZero() {
        MyVector vector = new MyVector();
        vector.sortSelectionIncrease();
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortMergeIncrease() {
        MyVector vector = new MyVector();
        vector.add(5, 7, 54, 9, 52);
        vector.sortMergeIncrease();
        MyVector expected = new MyVector();
        expected.add(5, 7, 9, 52, 54);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortMergeIncreaseZero() {
        MyVector vector = new MyVector();
        vector.sortMergeIncrease();
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortMergeDecrease() {
        MyVector vector = new MyVector();
        vector.add(5, 7, 54, 9, 52);
        vector.sortMergeDecrease();
        MyVector expected = new MyVector();
        expected.add(54, 52, 9, 7, 5);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortMergeDecreaseZero() {
        MyVector vector = new MyVector();
        vector.sortMergeDecrease();
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortQuickIncrease() {
        MyVector vector = new MyVector();
        vector.add(45, 361, 89, 13, 847, 63, 64, 2);
        vector.sortQuickIncrease();
        MyVector expected = new MyVector();
        expected.add(2, 13, 45, 63, 64, 89, 361, 847);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortQuickIncreaseZero() {
        MyVector vector = new MyVector();
        vector.sortQuickIncrease();
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortQuickDecrease() {
        MyVector vector = new MyVector();
        vector.add(45, 361, 89, 13, 847, 63, 64, 2);
        vector.sortQuickDecrease();
        MyVector expected = new MyVector();
        expected.add(847, 361, 89, 64, 63, 45, 13, 2);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSortQuickDecreaseZero() {
        MyVector vector = new MyVector();
        vector.sortQuickDecrease();
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testSearchLinearFirst() {
        MyVector vector = new MyVector();
        vector.add(514, 651, 3, 3, 6487, 3, 694, 65);
        double searched = 3;
        int expected = 2;
        assertEquals(expected, vector.searchLinearFirst(searched));
    }

    @Test
    public void testSearchLinearFirstMiss() {
        MyVector vector = new MyVector();
        vector.add(514, 651, 3, 3, 6487, 3, 694, 65);
        double searched = 87;
        int expected = -1;
        assertEquals(expected, vector.searchLinearFirst(searched));
    }

    @Test
    public void testSearchLinearFirstZero() {
        MyVector vector = new MyVector();
        double searched = 3;
        int expected = -1;
        assertEquals(expected, vector.searchLinearFirst(searched));
    }

    @Test
    public void testSearchLinearLast() {
        MyVector vector = new MyVector();
        vector.add(514, 651, 3, 3, 6487, 3, 694, 65);
        double searched = 3;
        int expected = 5;
        assertEquals(expected, vector.searchLinearLast(searched));
    }

    @Test
    public void testSearchLinearLastMiss() {
        MyVector vector = new MyVector();
        vector.add(514, 651, 3, 3, 6487, 3, 694, 65);
        double searched = 87;
        int expected = -1;
        assertEquals(expected, vector.searchLinearLast(searched));
    }

    @Test
    public void testSearchLinearLastZero() {
        MyVector vector = new MyVector();
        double searched = 3;
        int expected = -1;
        assertEquals(expected, vector.searchLinearLast(searched));
    }

    @Test
    public void testSearchBinaryFirst() {
        MyVector vector = new MyVector();
        vector.add(2, 6, 7, 7, 7, 7, 12, 78);
        double searched = 7;
        int expected = 2;
        assertEquals(expected, vector.searchBinaryFirst(searched));
    }

    @Test
    public void testSearchBinaryFirstMiss() {
        MyVector vector = new MyVector();
        vector.add(2, 6, 7, 7, 7, 7, 12, 78);
        double searched = 15;
        int expected = -1;
        assertEquals(expected, vector.searchBinaryFirst(searched));
    }

    @Test
    public void testSearchBinaryFirstZero() {
        MyVector vector = new MyVector();
        double searched = 7;
        int expected = -1;
        assertEquals(expected, vector.searchBinaryFirst(searched));
    }

    @Test
    public void testSearchBinaryLast() {
        MyVector vector = new MyVector();
        vector.add(2, 6, 7, 7, 7, 7, 12, 78);
        double searched = 7;
        int expected = 5;
        assertEquals(expected, vector.searchBinaryLast(searched));
    }

    @Test
    public void testSearchBinaryLastMiss() {
        MyVector vector = new MyVector();
        vector.add(2, 6, 7, 7, 7, 7, 12, 78);
        double searched = 15;
        int expected = -1;
        assertEquals(expected, vector.searchBinaryLast(searched));
    }

    @Test
    public void testSearchBinaryLastZero() {
        MyVector vector = new MyVector();
        double searched = 7;
        int expected = -1;
        assertEquals(expected, vector.searchBinaryLast(searched));
    }
}
