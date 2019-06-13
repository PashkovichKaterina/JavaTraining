package by.epam.javatraining.pashkovich.maintask01.additionally.model;

import org.apache.log4j.Logger;

/**
 * This class contains different method for work with matrix.
 *
 * @author Pashkovich Katsiaryna Vasilevna
 * @version 1.0.0
 */
public class MatrixLogic {

    private static final Logger LOGGER = Logger.getRootLogger();

    /**
     * This method finds the maximum value in the matrix.
     *
     * @param matrix The matrix in which the maximum value will be found.
     * @return The maximum value in the matrix, or Double.MIN_VALUE if the matrix length is 0
     */
    public static double findMaxValue(double[][] matrix) {
        double max = Double.MIN_VALUE;
        if (matrix == null) {
            LOGGER.warn("NullPointer");
            return max;
        }
        for (int i = 0; i < matrix.length; ++i) {
            if (matrix[i] != null) {
                for (int j = 0; j < matrix[i].length; ++j) {
                    if (matrix[i][j] > max) {
                        max = matrix[i][j];
                    }
                }
            }else {
                LOGGER.warn("NullPointer");
            }
        }
        return max;
    }


    /**
     * This method finds the minimum value in the matrix.
     *
     * @param matrix The matrix in which the minimum value will be found.
     * @return The minimum value in the matrix, or Double.MAX_VALUE if the matrix length is 0
     */
    public static double findMinValue(double[][] matrix) {
        double min = Double.MAX_VALUE;
        if (matrix == null) {
            LOGGER.warn("NullPointer");
            return min;
        }
        for (int i = 0; i < matrix.length; ++i) {
            if (matrix[i] != null) {
                for (int j = 0; j < matrix[i].length; ++j) {
                    if (matrix[i][j] < min) {
                        min = matrix[i][j];
                    }
                }
            }else {
                LOGGER.warn("NullPointer");
            }
        }
        return min;
    }

    /**
     * This method checks is the matrix square.
     *
     * @param matrix The matrix which will be checked.
     * @return True if the matrix is square, or false if the matrix is not square ot the matrix length is 0
     */
    public static boolean isSquare(double[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        for (int i = 0; i < matrix.length; ++i) {
            if (matrix[i] == null || matrix.length != matrix[i].length) {
                return false;
            }
        }
        return true;
    }

    /**
     * This method checks is the matrix symmetric relative to the main diagonal.
     *
     * @param matrix The matrix which will be checked
     * @return True if the matrix symmetric relative to the main diagonal,
     * or false if the matrix not symmetric relative to the main diagonal
     */
    public static boolean isSymmetric(double[][] matrix) {
        if (!isSquare(matrix)) {
            return false;
        }
        for (int i = 0; i < matrix.length - 1; ++i) {
            for (int j = i + 1; j < matrix[i].length; ++j) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * This method transposes matrix.
     *
     * @param matrix The matrix which will be transposed.
     */
    public static void transpose(double[][] matrix) {
        if (!isSquare(matrix)) {
            return;
        }
        for (int i = 0; i < matrix.length - 1; ++i) {
            for (int j = i + 1; j < matrix[i].length; ++j) {
                matrix[i][j] += matrix[j][i];
                matrix[j][i] = matrix[i][j] - matrix[j][i];
                matrix[i][j] -= matrix[j][i];
            }
        }
    }
}

