package by.epam.javatraining.pashkovich.maintask01.additionally.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class contains unit-tests for checks class MatrixLogic
 *
 * @author Pashkovich Katsiaryna Vasilevna
 * @version 1.0.0
 */
public class MatrixLogicTest {

    @Test
    public void testFindMaxValue() {
        double[][] matrix = {
                {5, 97, 4, 6, 4},
                {4, 6, 8, 7},
                {6, 5, 7, 2}
        };
        double expected = 97;
        assertEquals(expected, MatrixLogic.findMaxValue(matrix), 0.1);
    }

    @Test
    public void testFindMaxValueZero() {
        double[][] matrix = {};
        double expected = Double.MIN_VALUE;
        assertEquals(expected, MatrixLogic.findMaxValue(matrix), 0.1);
    }

    @Test
    public void testFindMaxValueNull() {
        double[][] matrix = null;
        double expected = Double.MIN_VALUE;
        assertEquals(expected, MatrixLogic.findMaxValue(matrix), 0.1);
    }

    @Test
    public void testFindMinValue() {
        double[][] matrix = {
                {5, 97, 4, 6, 4},
                {4, 6, 2, 7},
                {6, 5, 7, 2}
        };
        double expected = 2;
        assertEquals(expected, MatrixLogic.findMinValue(matrix), 0.1);
    }

    @Test
    public void testFindMinValueZero() {
        double[][] matrix = {};
        double expected = Double.MAX_VALUE;
        assertEquals(expected, MatrixLogic.findMinValue(matrix), 0.1);
    }

    @Test
    public void testFindMinValueNull() {
        double[][] matrix = null;
        double expected = Double.MAX_VALUE;
        assertEquals(expected, MatrixLogic.findMinValue(matrix), 0.1);
    }

    @Test
    public void testIsSquare() {
        double[][] matrix = {
                {5, 7, 8, 9, 5},
                {6, 7, 8, 2, 1},
                {4, 3, 6, 9, 2},
                {5, 7, 3, 9, 6},
                {8, 7, 2, 6, 4}
        };
        boolean expected = true;
        assertEquals(expected, MatrixLogic.isSquare(matrix));
    }

    @Test
    public void testIsSquareNot1() {
        double[][] matrix = {
                {5, 7, 8, 9, 5},
                {6, 7, 8, 2, 1},
                {4, 3, 9, 2},
                {5, 7, 3, 9, 6},
                {8, 7, 2, 6}
        };
        boolean expected = false;
        assertEquals(expected, MatrixLogic.isSquare(matrix));
    }

    @Test
    public void testIsSquareNot2() {
        double[][] matrix = {
                {5, 7, 8, 9, 5},
                {6, 7, 8, 2, 1},
                {5, 7, 3, 9, 6}
        };
        boolean expected = false;
        assertEquals(expected, MatrixLogic.isSquare(matrix));
    }

    @Test
    public void testIsSquareZero() {
        double[][] matrix = {};
        boolean expected = false;
        assertEquals(expected, MatrixLogic.isSquare(matrix));
    }

    @Test
    public void testIsSquareNull() {
        double[][] matrix = null;
        boolean expected = false;
        assertEquals(expected, MatrixLogic.isSquare(matrix));
    }

    @Test
    public void testIsSymmetric() {
        double[][] matrix = {
                {5, 7, 8, 9},
                {7, 7, 8, 2},
                {8, 8, 3, 9},
                {9, 2, 9, 9}
        };
        boolean expected = true;
        assertEquals(expected, MatrixLogic.isSymmetric(matrix));
    }

    @Test
    public void testIsSymmetricNot() {
        double[][] matrix = {
                {5, 7, 8, 9},
                {7, 7, 8, 3},
                {5, 8, 3, 9},
                {9, 2, 9, 9}
        };
        boolean expected = false;
        assertEquals(expected, MatrixLogic.isSymmetric(matrix));
    }

    @Test
    public void testIsSymmetricNotSquare() {
        double[][] matrix = {
                {5, 7, 8, 9},
                {7, 7, 8, 2},
                {8, 8, 3, 9}
        };
        boolean expected = false;
        assertEquals(expected, MatrixLogic.isSymmetric(matrix));
    }

    @Test
    public void testIsSymmetricZero() {
        double[][] matrix = {};
        boolean expected = false;
        assertEquals(expected, MatrixLogic.isSymmetric(matrix));
    }

    @Test
    public void testIsSymmetricNull() {
        double[][] matrix = null;
        boolean expected = false;
        assertEquals(expected, MatrixLogic.isSymmetric(matrix));
    }

    @Test
    public void testTranspose() {
        double[][] matrix = {
                {5, 7, 8, 9},
                {7, 7, 8, 3},
                {5, 8, 3, 9},
                {9, 2, 9, 9}
        };
        MatrixLogic.transpose(matrix);
        double[][] expected = {
                {5, 7, 5, 9},
                {7, 7, 8, 2},
                {8, 8, 3, 9},
                {9, 3, 9, 9}
        };
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                assertEquals(expected[i][j], matrix[i][j], 0.1);
            }
        }
    }

    @Test
    public void testTransposeNotSquare() {
        double[][] matrix = {
                {5, 7, 8, 9},
                {7, 7, 8, 3}
        };
        MatrixLogic.transpose(matrix);
        double[][] expected = {
                {5, 7, 8, 9},
                {7, 7, 8, 3}
        };
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                assertEquals(expected[i][j], matrix[i][j], 0.1);
            }
        }
    }
}
