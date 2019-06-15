package by.epam.javatraining.pashkovich.maintask01.model.logic;

import by.epam.javatraining.pashkovich.maintask01.model.MyVector;
import org.apache.log4j.Logger;

/**
 * This class contains static methods for search MyVector.
 *
 * @author Pashkovich Katsiaryna Vasilevna
 * @version 1.0
 * @see MyVector
 * @since JDK1.0
 */
public class Searched {
    private static final Logger LOGGER = Logger.getRootLogger();

    /**
     * Finds the first position of key value in the vector.
     *
     * @param vector the vector in which position of key value will be found
     * @param key    the value to be searched
     * @return first position of key value in vector, or -1 if there is no such key value or the vector length is 0
     */
    public static int searchLinearFirst(MyVector vector, double key) {
        if (checkReference(vector)) {
            for (int i = 0; i < vector.getSize(); i++) {
                if (vector.getElement(i) == key) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * Finds the last position of key value in the vector.
     *
     * @param vector the vector in which position of key value will be found
     * @param key    the value to be searched
     * @return last position of key value in vector, or -1 if there is no such key value or the vector length is 0
     */
    public static int searchLinearLast(MyVector vector, double key) {
        if (checkReference(vector)) {
            for (int i = vector.getSize() - 1; i >= 0; i--) {
                if (vector.getElement(i) == key) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * Finds the first position of key value in the sorted vector.
     * If the vector is not sorted, the results is undefined.
     *
     * @param vector the vector in which position of key value will be found
     * @param key    the value to be searched
     * @return first position of key value in vector, or -1 if there is no such key value or the vector length is 0
     */
    public static int searchBinaryFirst(MyVector vector, double key) {
        if (checkReference(vector)) {
            return searchBinary(vector, key, 0, vector.getSize() - 1, true);
        }
        return -1;
    }

    /**
     * Finds the last position of key value in the sorted vector.
     * If the vector is not sorted, the results is undefined.
     *
     * @param vector the vector in which position of key value will be found
     * @param key    the value to be searched
     * @return last position of key value in vector, or -1 if there is no such key value or the vector length is 0
     */
    public static int searchBinaryLast(MyVector vector, double key) {
        if (checkReference(vector)) {
            return searchBinary(vector, key, 0, vector.getSize() - 1, false);
        }
        return -1;
    }

    /**
     * This method recursively divides vector into subvectors and search key value by binary search.
     * If the vector is not sorted, the results is undefined.
     *
     * @param vector the vector in which position of key value will be found
     * @param key    the value to be searched
     * @param left   left border of the subvector
     * @param right  right border of the subvector
     * @param order  search order: true - first, false - last
     * @return position of key value in vector, or -1 if there is no such key value or the vector length is 0
     */
    private static int searchBinary(MyVector vector, double key, int left, int right, boolean order) {
        if (right < left) {
            return -1;
        }
        int middle = left + (right - left) / 2;
        if (vector.getElement(middle) == key && ((order && vector.getElement(middle - 1) != key)
                || (!order && vector.getElement(middle + 1) != key))) {
            return middle;
        }
        if (order && vector.getElement(middle) >= key) {
            return searchBinary(vector, key, left, middle - 1, order);
        }
        return searchBinary(vector, key, middle + 1, right, order);
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
