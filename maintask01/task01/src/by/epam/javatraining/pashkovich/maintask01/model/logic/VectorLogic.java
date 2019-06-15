package by.epam.javatraining.pashkovich.maintask01.model.logic;

import by.epam.javatraining.pashkovich.maintask01.model.MyVector;
import org.apache.log4j.Logger;

/**
 * This class contains static methods for work with class MyVector.
 *
 * @author Pashkovich Katsiaryna Vasilevna
 * @version 1.0
 * @see Double
 * @see MyVector
 * @since JDK1.0
 */
public class VectorLogic {
    private static final Logger LOGGER = Logger.getRootLogger();

    /**
     * Finds the maximum value of the vector.
     *
     * @param vector the vector in which maximum value will be founded
     * @return the maximum value of vector, or Double.MIN_VALUE if the vector length is 0
     */
    public static double findMax(MyVector vector) {
        double max = Double.MIN_VALUE;
        if (checkReference(vector)) {
            for (int i = 0; i < vector.getSize(); i++) {
                if (max < vector.getElement(i)) {
                    max = vector.getElement(i);
                }
            }
        }
        return max;
    }

    /**
     * Finds the minimum value of the vector.
     *
     * @param vector the vector in which minimum value will be founded
     * @return the minimum value of the vector, or Double.MAX_VALUE if the vector length is 0
     */
    public static double findMin(MyVector vector) {
        double min = Double.MAX_VALUE;
        if (checkReference(vector)) {
            for (int i = 1; i < vector.getSize(); i++) {
                if (min > vector.getElement(i)) {
                    min = vector.getElement(i);
                }
            }
        }
        return min;
    }

    /**
     * Calculates the arithmetic average of vector values.
     *
     * @param vector the vector in which arithmetic average will be calculated
     * @return the arithmetic average of vector values, or Double.NaN if the vector length is 0
     */
    public static double calcArithmeticAverage(MyVector vector) {
        double sum = Double.NaN;
        if (checkReference(vector)) {
            if (vector.getSize() > 0) {
                sum = vector.getElement(0);
                for (int i = 1; i < vector.getSize(); i++) {
                    sum += vector.getElement(i);
                }
                sum /= vector.getSize();
            }
        }
        return sum;
    }

    /**
     * Calculates the geometric average of vector values.
     *
     * @param vector the vector in which geometric average will be calculated
     * @return the geometric average of vector values, or Double.NaN if the vector length is 0
     */
    public static double calcGeometricAverage(MyVector vector) {
        double multiply = Double.NaN;
        if (checkReference(vector)) {
            if (vector.getSize() > 0) {
                multiply = vector.getElement(0);
                for (int i = 1; i < vector.getSize(); i++) {
                    multiply *= vector.getElement(i);
                }
                multiply = Math.pow(multiply, 1.0 / vector.getSize());
            }
        }
        return multiply;
    }

    /**
     * Checks that vector values are in decreasing order.
     *
     * @param vector the vector which will be checked
     * @return true if vector values are in decreasing order, or false if vector values are not in decreasing order or the vector length is 0
     */
    public static boolean isDecreasing(MyVector vector) {
        if (!checkReference(vector) || vector.getSize() == 0) {
            return false;
        }
        for (int i = 1; i < vector.getSize(); i++) {
            if (vector.getElement(i - 1) < vector.getElement(i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks that vector values are in increasing order.
     *
     * @param vector the vector which will be checked
     * @return true if vector values are in increasing order, or false if vector values are not in increasing order or the vector length is 0
     */
    public static boolean isIncreasing(MyVector vector) {
        if (!checkReference(vector) || vector.getSize() == 0) {
            return false;
        }
        for (int i = 1; i < vector.getSize(); i++) {
            if (vector.getElement(i - 1) > vector.getElement(i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks that vector values are in an ordered form.
     *
     * @param vector the vector which will be checked
     * @return true if vector values are in ordered form, or false if vector values are not in ordered form or the vector length is 0
     */
    public static boolean isOrdered(MyVector vector) {
        return checkReference(vector) && vector.getSize() != 0 && (isDecreasing(vector) || isIncreasing(vector));
    }

    /**
     * Finds position of the first local minimum of vector values.
     *
     * @param vector the vector in which first local minimum will be found
     * @return the position of the first local minimum, or -1 if there is no local minimum or the vector length is 0
     */
    public static int findFirstLocalMinPosition(MyVector vector) {
        if (checkReference(vector)) {
            for (int i = 1; i < vector.getSize() - 1; i++) {
                if (vector.getElement(i) < vector.getElement(i - 1)
                        && vector.getElement(i) < vector.getElement(i + 1)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * Finds position of the last local minimum of vector values.
     *
     * @param vector the vector in which last local minimum will be found
     * @return the position of the last local minimum, or -1 if there is no local minimum or the vector length is 0
     */
    public static int findLastLocalMinPosition(MyVector vector) {
        if (checkReference(vector)) {
            for (int i = vector.getSize() - 1; i > 0; i--) {
                if (vector.getElement(i) < vector.getElement(i - 1)
                        && vector.getElement(i) < vector.getElement(i + 1)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * Finds position of the first local maximum of vector values.
     *
     * @param vector the vector in which first local maximum will be found
     * @return the position of the first local maximum, or -1 if there is no local maximum or the vector length is 0
     */
    public static int findFirstLocalMaxPosition(MyVector vector) {
        if (checkReference(vector)) {
            for (int i = 1; i < vector.getSize() - 1; i++) {
                if (vector.getElement(i) > vector.getElement(i - 1)
                        && vector.getElement(i) > vector.getElement(i + 1)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * Finds position of the last local maximum of vector values.
     *
     * @param vector the vector in which last local maximum will be found
     * @return the position of the last local maximum, or -1 if there is no local maximum or the vector length is 0
     */
    public static int findLastLocalMaxPosition(MyVector vector) {
        if (checkReference(vector)) {
            for (int i = vector.getSize() - 1; i > 0; i--) {
                if (vector.getElement(i) > vector.getElement(i - 1)
                        && vector.getElement(i) > vector.getElement(i + 1)) {
                    return i;
                }
            }
        }
        return -1;
    }


    /**
     * Reverses all vector values.
     *
     * @param vector the vector which will be reversed
     */
    public static void reverse(MyVector vector) {
        if (checkReference(vector)) {
            for (int i = 0, j = vector.getSize() - 1; i < j; i++, j--) {
                vector.swap(j, i);
            }
        }
    }

    /**
     * Checks if the reference is null.
     *
     * @param vector the reference which will be checked
     * @return false is the reference is null, or false if the reference is not null
     */
    private static boolean checkReference(MyVector vector) {
        if (vector == null) {
            LOGGER.warn("NullPointer");
            return false;
        }
        return true;
    }
}
