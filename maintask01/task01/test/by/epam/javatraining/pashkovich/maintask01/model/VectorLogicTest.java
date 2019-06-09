package by.epam.javatraining.pashkovich.maintask01.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class contains unit-tests for check class VectorLogic.
 *
 * @author Pashkovich Katsiaryna Vasilevna
 * @version 1.0.0
 */
public class VectorLogicTest {

    @Test
    public void testFindMax() {
        double[] array = {5, 3, 7, -16, 88};
        double expected = 88;
        assertEquals(expected, VectorLogic.findMax(array), 0.1);
    }

    @Test
    public void testFindMaxZero() {
        double[] array = new double[0];
        double expected = Double.MIN_VALUE;
        assertEquals(expected, VectorLogic.findMax(array), 0.1);
    }

    @Test
    public void testFindMin() {
        double[] array = {5, 3, 7, -16, 88};
        double expected = -16;
        assertEquals(expected, VectorLogic.findMin(array), 0.1);
    }

    @Test
    public void testFindMinZero() {
        double[] array = new double[0];
        double expected = Double.MAX_VALUE;
        assertEquals(expected, VectorLogic.findMin(array), 0.1);
    }

    @Test
    public void testCalcArithmeticAverage() {
        double[] array = {5, 12, 6, 1};
        double expected = 6;
        assertEquals(expected, VectorLogic.calcArithmeticAverage(array), 0.1);
    }

    @Test
    public void testCalcArithmeticAverageZero() {
        double[] array = {};
        double expected = Double.MIN_VALUE;
        assertEquals(expected, VectorLogic.calcArithmeticAverage(array), 0.1);
    }

    @Test
    public void testCalcGeometricAverage() {
        double[] array = {5, 25, 5, 1};
        double expected = 5;
        assertEquals(expected, VectorLogic.calcGeometricAverage(array), 0.1);
    }

    @Test
    public void testCalcGeometricAverageZero() {
        double[] array = {};
        double expected = Double.MIN_VALUE;
        assertEquals(expected, VectorLogic.calcGeometricAverage(array), 0.1);
    }

    @Test
    public void testIsDecreasingDecrease() {
        double[] array = {56, 12, 8, 4, 3};
        boolean expected = true;
        assertEquals(expected, VectorLogic.isDecreasing(array));
    }

    @Test
    public void testIsDecreasingIncrease() {
        double[] array = {1, 3, 4, 56, 78};
        boolean expected = false;
        assertEquals(expected, VectorLogic.isDecreasing(array));
    }

    @Test
    public void testIsDecreasingNeither() {
        double[] array = {1, 56, 40, 5, 1};
        boolean expected = false;
        assertEquals(expected, VectorLogic.isDecreasing(array));
    }

    @Test
    public void testIsDecreasingZero() {
        double[] array = {};
        boolean expected = false;
        assertEquals(expected, VectorLogic.isDecreasing(array));
    }

    @Test
    public void testIsIncreasingDecrease() {
        double[] array = {56, 12, 8, 4, 3};
        boolean expected = false;
        assertEquals(expected, VectorLogic.isIncreasing(array));
    }

    @Test
    public void testIsIncreasingIncrease() {
        double[] array = {1, 3, 4, 56, 78};
        boolean expected = true;
        assertEquals(expected, VectorLogic.isIncreasing(array));
    }

    @Test
    public void testIsIncreasingNeither() {
        double[] array = {1, 56, 40, 5, 1};
        boolean expected = false;
        assertEquals(expected, VectorLogic.isIncreasing(array));
    }

    @Test
    public void testIsIncreasingZero() {
        double[] array = {};
        boolean expected = false;
        assertEquals(expected, VectorLogic.isIncreasing(array));
    }

    @Test
    public void testIsOrderedDecrease() {
        double[] array = {89, 45, 23, 12, 5};
        boolean expected = true;
        assertEquals(expected, VectorLogic.isOrdered(array));
    }

    @Test
    public void testIsOrderedIncrease() {
        double[] array = {5, 6, 46, 78, 90};
        boolean expected = true;
        assertEquals(expected, VectorLogic.isOrdered(array));
    }

    @Test
    public void testIsOrderedNeither() {
        double[] array = {54, 31, 87, 41, 654};
        boolean expected = false;
        assertEquals(expected, VectorLogic.isOrdered(array));
    }

    @Test
    public void testIsOrderedZero() {
        double[] array = {};
        boolean expected = false;
        assertEquals(expected, VectorLogic.isOrdered(array));
    }

    @Test
    public void testFindLocalMinPositionFirst() {
        double[] array = {1, 5, 8, 3, 4};
        int expected = 0;
        assertEquals(expected, VectorLogic.findLocalMinPosition(array));
    }

    @Test
    public void testFindLocalMinPositionLast() {
        double[] array = {7, 7, 8, 3, 1};
        int expected = 4;
        assertEquals(expected, VectorLogic.findLocalMinPosition(array));
    }

    @Test
    public void testFindLocalMinPositionInner() {
        double[] array = {7, 7, 2, 3, 1};
        int expected = 2;
        assertEquals(expected, VectorLogic.findLocalMinPosition(array));
    }

    @Test
    public void testFindLocalMinPositionNeither() {
        double[] array = {7, 7, 7, 8, 9, 15};
        int expected = -1;
        assertEquals(expected, VectorLogic.findLocalMinPosition(array));
    }

    @Test
    public void testFindLocalMinPositionZero() {
        double[] array = {};
        int expected = -1;
        assertEquals(expected, VectorLogic.findLocalMinPosition(array));
    }

    @Test
    public void testFindLocalMaxPositionFirst() {
        double[] array = {15, 5, 8, 3, 4};
        int expected = 0;
        assertEquals(expected, VectorLogic.findLocalMaxPosition(array));
    }

    @Test
    public void testFindLocalMaxPositionLast() {
        double[] array = {7, 7, 8, 8, 15};
        int expected = 4;
        assertEquals(expected, VectorLogic.findLocalMaxPosition(array));
    }

    @Test
    public void testFindLocalMaxPositionInner() {
        double[] array = {7, 7, 22, 3, 78};
        int expected = 2;
        assertEquals(expected, VectorLogic.findLocalMaxPosition(array));
    }

    @Test
    public void testFindLocalMaxPositionNeither() {
        double[] array = {7, 7, 7, 8, 8, 2};
        int expected = -1;
        assertEquals(expected, VectorLogic.findLocalMaxPosition(array));
    }

    @Test
    public void testFindLocalMaxPositionZero() {
        double[] array = {};
        int expected = -1;
        assertEquals(expected, VectorLogic.findLocalMaxPosition(array));
    }

    @Test
    public void testReverse() {
        double[] array = {546, 8, 13, 6, 4, 3125, 9, 4, 31, 4, 645};
        VectorLogic.reverse(array);
        double[] expected = {645, 4, 31, 4, 9, 3125, 4, 6, 13, 8, 546};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testReverseZero() {
        double[] array = {};
        VectorLogic.reverse(array);
        double[] expected = {};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortBubbleIncrease() {
        double[] array = {5, 7, 54, 9, 52};
        VectorLogic.sortBubbleIncrease(array);
        double[] expected = {5, 7, 9, 52, 54};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortBubbleIncreaseZero() {
        double[] array = {};
        VectorLogic.sortBubbleIncrease(array);
        double[] expected = {};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortBubbleDecrease() {
        double[] array = {5, 7, 54, 9, 52};
        VectorLogic.sortBubbleDecrease(array);
        double[] expected = {54, 52, 9, 7, 5};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortBubbleDecreaseZero() {
        double[] array = {};
        VectorLogic.sortBubbleDecrease(array);
        double[] expected = {};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortModify1BubbleIncrease() {
        double[] array = {5, 7, 54, 9, 52};
        VectorLogic.sortModify1BubbleIncrease(array);
        double[] expected = {5, 7, 9, 52, 54};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortModify1BubbleIncreaseZero() {
        double[] array = {};
        VectorLogic.sortModify1BubbleIncrease(array);
        double[] expected = {};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortModify1BubbleDecrease() {
        double[] array = {5, 7, 54, 9, 52};
        VectorLogic.sortModify1BubbleDecrease(array);
        double[] expected = {54, 52, 9, 7, 5};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortModify1BubbleDecreaseZero() {
        double[] array = {};
        VectorLogic.sortModify1BubbleDecrease(array);
        double[] expected = {};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortModify2BubbleIncrease() {
        double[] array = {5, 7, 54, 9, 52};
        VectorLogic.sortModify2BubbleIncrease(array);
        double[] expected = {5, 7, 9, 52, 54};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortModify2BubbleIncreaseZero() {
        double[] array = {};
        VectorLogic.sortModify2BubbleIncrease(array);
        double[] expected = {};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortModify2BubbleDecrease() {
        double[] array = {5, 7, 54, 9, 52};
        VectorLogic.sortModify2BubbleDecrease(array);
        double[] expected = {54, 52, 9, 7, 5};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortModify2BubbleDecreaseZero() {
        double[] array = {};
        VectorLogic.sortModify2BubbleDecrease(array);
        double[] expected = {};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortInsertionIncrease() {
        double[] array = {5, 7, 54, 9, 52};
        VectorLogic.sortInsertionIncrease(array);
        double[] expected = {5, 7, 9, 52, 54};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortInsertionIncreaseZero() {
        double[] array = {};
        VectorLogic.sortInsertionIncrease(array);
        double[] expected = {};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortInsertionDecrease() {
        double[] array = {5, 7, 54, 9, 52};
        VectorLogic.sortInsertionDecrease(array);
        double[] expected = {54, 52, 9, 7, 5};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortInsertionDecreaseZero() {
        double[] array = {};
        VectorLogic.sortInsertionDecrease(array);
        double[] expected = {};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortSelectionDecrease() {
        double[] array = {5, 7, 54, 9, 52};
        VectorLogic.sortSelectionDecrease(array);
        double[] expected = {54, 52, 9, 7, 5};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortSelectionDecreaseZero() {
        double[] array = {};
        VectorLogic.sortSelectionDecrease(array);
        double[] expected = {};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortSelectionIncrease() {
        double[] array = {5, 7, 54, 9, 52};
        VectorLogic.sortSelectionIncrease(array);
        double[] expected = {5, 7, 9, 52, 54};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortSelectionIncreaseZero() {
        double[] array = {};
        VectorLogic.sortSelectionIncrease(array);
        double[] expected = {};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortMergeIncrease() {
        double[] array = {5, 7, 54, 9, 52};
        VectorLogic.sortMergeIncrease(array);
        double[] expected = {5, 7, 9, 52, 54};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortMergeIncreaseZero() {
        double[] array = {};
        VectorLogic.sortMergeIncrease(array);
        double[] expected = {};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortMergeDecrease() {
        double[] array = {5, 7, 54, 9, 52};
        VectorLogic.sortMergeDecrease(array);
        double[] expected = {54, 52, 9, 7, 5};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortMergeDecreaseZero() {
        double[] array = {};
        VectorLogic.sortMergeDecrease(array);
        double[] expected = {};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortQuickIncrease() {
        double[] array = {45, 361, 89, 13, 847, 63, 64, 2};
        VectorLogic.sortQuickIncrease(array);
        double[] expected = {2, 13, 45, 63, 64, 89, 361, 847};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortQuickIncreaseZero() {
        double[] array = {};
        VectorLogic.sortQuickIncrease(array);
        double[] expected = {};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortQuickDecrease() {
        double[] array = {45, 361, 89, 13, 847, 63, 64, 2};
        VectorLogic.sortQuickDecrease(array);
        double[] expected = {847, 361, 89, 64, 63, 45, 13, 2};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSortQuickDecreaseZero() {
        double[] array = {};
        VectorLogic.sortQuickDecrease(array);
        double[] expected = {};
        assertArrayEquals(expected, array, 0.1);
    }

    @Test
    public void testSearchLinearFirst() {
        double[] array = {514, 651, 3, 3, 6487, 3, 694, 65};
        double searched = 3;
        int expected = 2;
        assertEquals(expected, VectorLogic.searchLinearFirst(array, searched));
    }

    @Test
    public void testSearchLinearFirstMiss() {
        double[] array = {514, 651, 3, 6487, 3, 694, 65};
        double searched = 87;
        int expected = -1;
        assertEquals(expected, VectorLogic.searchLinearFirst(array, searched));
    }

    @Test
    public void testSearchLinearFirstZero() {
        double[] array = {};
        double searched = 3;
        int expected = -1;
        assertEquals(expected, VectorLogic.searchLinearFirst(array, searched));
    }

    @Test
    public void testSearchLinearLast() {
        double[] array = {514, 651, 3, 6487, 3, 694, 65};
        double searched = 3;
        int expected = 4;
        assertEquals(expected, VectorLogic.searchLinearLast(array, searched));
    }

    @Test
    public void testSearchLinearLastMiss() {
        double[] array = {514, 651, 3, 6487, 3, 694, 65};
        double searched = 87;
        int expected = -1;
        assertEquals(expected, VectorLogic.searchLinearLast(array, searched));
    }

    @Test
    public void testSearchLinearLastZero() {
        double[] array = {};
        double searched = 3;
        int expected = -1;
        assertEquals(expected, VectorLogic.searchLinearLast(array, searched));
    }

    @Test
    public void testSearchBinaryFirst() {
        double[] array = {2, 6, 7, 7, 7, 7, 12, 78};
        double searched = 7;
        int expected = 2;
        assertEquals(expected, VectorLogic.searchBinaryFirst(array, searched));
    }

    @Test
    public void testSearchBinaryFirstMiss() {
        double[] array = {2, 6, 7, 7, 7, 7, 12, 78};
        double searched = 15;
        int expected = -1;
        assertEquals(expected, VectorLogic.searchBinaryFirst(array, searched));
    }

    @Test
    public void testSearchBinaryFirstZero() {
        double[] array = {};
        double searched = 7;
        int expected = -1;
        assertEquals(expected, VectorLogic.searchBinaryFirst(array, searched));
    }

    @Test
    public void testSearchBinaryLast() {
        double[] array = {2, 6, 7, 7, 7, 7, 12, 78};
        double searched = 7;
        int expected = 5;
        assertEquals(expected, VectorLogic.searchBinaryLast(array, searched));
    }

    @Test
    public void testSearchBinaryLastMiss() {
        double[] array = {2, 6, 7, 7, 7, 7, 12, 78};
        double searched = 15;
        int expected = -1;
        assertEquals(expected, VectorLogic.searchBinaryLast(array, searched));
    }

    @Test
    public void testSearchBinaryLastZero() {
        double[] array = {};
        double searched = 7;
        int expected = -1;
        assertEquals(expected, VectorLogic.searchBinaryLast(array, searched));
    }
}
