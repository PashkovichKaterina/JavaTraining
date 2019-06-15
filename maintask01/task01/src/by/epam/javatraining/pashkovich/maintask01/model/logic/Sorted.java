package by.epam.javatraining.pashkovich.maintask01.model.logic;

import by.epam.javatraining.pashkovich.maintask01.model.MyVector;
import org.apache.log4j.Logger;

/**
 * This class contains static methods for sort MyVector.
 *
 * @author Pashkovich Katsiaryna Vasilevna
 * @version 1.0
 * @see MyVector
 * @since JDK1.0
 */
public class Sorted {
    private static final Logger LOGGER = Logger.getRootLogger();

    /**
     * Sorts all vector values in increasing order by bubble sort.
     *
     * @param vector the vector which will be sorted
     */
    public static void sortBubbleIncrease(MyVector vector) {
        if (!checkReference(vector)) {
            return;
        }
        for (int i = 1; i < vector.getSize(); i++) {
            for (int j = 0; j < vector.getSize() - i; j++) {
                if (vector.getElement(j) > vector.getElement(j + 1)) {
                    vector.swap(j, j + 1);
                }
            }
        }
    }

    /**
     * Sorts all vector values in decreasing order by bubble sort.
     *
     * @param vector the vector which will be sorted
     */
    public static void sortBubbleDecrease(MyVector vector) {
        if (!checkReference(vector)) {
            return;
        }
        for (int i = 1; i < vector.getSize(); i++) {
            for (int j = 0; j < vector.getSize() - i; j++) {
                if (vector.getElement(j) < vector.getElement(j + 1)) {
                    vector.swap(j, j + 1);
                }
            }
        }
    }

    /**
     * Sorts all vector values in increasing order by modify bubble sort.
     *
     * @param vector the vector which will be sorted
     */
    public static void sortModify1BubbleIncrease(MyVector vector) {
        if (!checkReference(vector)) {
            return;
        }
        for (int i = 1; i < vector.getSize(); i++) {
            boolean isChange = false;
            for (int j = 0; j < vector.getSize() - i; j++) {
                if (vector.getElement(j) > vector.getElement(j + 1)) {
                    vector.swap(j, j + 1);
                    isChange = true;
                }
            }
            if (!isChange) {
                return;
            }
        }
    }

    /**
     * Sorts all vector values in increasing order by modify bubble sort.
     *
     * @param vector the vector which will be sorted
     */
    public static void sortModify2BubbleIncrease(MyVector vector) {
        if (!checkReference(vector)) {
            return;
        }
        for (int i = 1; i < vector.getSize(); i++) {
            int changes = 0;
            for (int j = 0; j < vector.getSize() - i; j++) {
                if (vector.getElement(j) > vector.getElement(j + 1)) {
                    vector.swap(j, j + 1);
                    changes++;
                }
            }
            if (changes <= 1) {
                return;
            }
        }
    }

    /**
     * Sorts all vector values in decreasing order by modify bubble sort.
     *
     * @param vector the vector which will be sorted
     */
    public static void sortModify1BubbleDecrease(MyVector vector) {
        if (!checkReference(vector)) {
            return;
        }
        for (int i = 1; i < vector.getSize(); i++) {
            boolean isChange = false;
            for (int j = 0; j < vector.getSize() - i; j++) {
                if (vector.getElement(j) < vector.getElement(j + 1)) {
                    vector.swap(j, j + 1);
                    isChange = true;
                }
            }
            if (!isChange) {
                return;
            }
        }
    }

    /**
     * Sorts all vector values in decreasing order by modify bubble sort.
     *
     * @param vector the vector which will be sorted
     */
    public static void sortModify2BubbleDecrease(MyVector vector) {
        if (!checkReference(vector)) {
            return;
        }
        for (int i = 1; i < vector.getSize(); i++) {
            int changes = 0;
            for (int j = 0; j < vector.getSize() - i; j++) {
                if (vector.getElement(j) < vector.getElement(j + 1)) {
                    vector.swap(j, j + 1);
                    changes++;
                }
            }
            if (changes <= 1) {
                return;
            }
        }
    }

    /**
     * Sorts all vector values in increasing order by insertion sort.
     *
     * @param vector the vector which will be sorted
     */
    public static void sortInsertionIncrease(MyVector vector) {
        if (!checkReference(vector)) {
            return;
        }
        for (int i = 1; i < vector.getSize(); i++) {
            double buf = vector.getElement(i);
            int j = i - 1;
            while (j >= 0 && buf < vector.getElement(j)) {
                vector.setElement(j + 1, vector.getElement(j));
                --j;
            }
            vector.setElement(j + 1, buf);
        }
    }

    /**
     * Sorts all vector values in decreasing order by insertion sort.
     *
     * @param vector the vector which will be sorted
     */
    public static void sortInsertionDecrease(MyVector vector) {
        if (!checkReference(vector)) {
            return;
        }
        for (int i = 1; i < vector.getSize(); i++) {
            double buf = vector.getElement(i);
            int j = i - 1;
            while (j >= 0 && buf > vector.getElement(j)) {
                vector.setElement(j + 1, vector.getElement(j));
                --j;
            }
            vector.setElement(j + 1, buf);
        }
    }

    /**
     * Sorts all vector values in decreasing order by selection sort.
     *
     * @param vector the vector which will be sorted
     */
    public static void sortSelectionDecrease(MyVector vector) {
        if (!checkReference(vector)) {
            return;
        }
        for (int i = 0; i < vector.getSize() - 1; i++) {
            int k = i;
            for (int j = i + 1; j < vector.getSize(); j++) {
                if (vector.getElement(k) < vector.getElement(j)) {
                    k = j;
                }
            }
            vector.swap(k, i);
        }
    }

    /**
     * Sorts all vector values in increasing order by selection sort.
     *
     * @param vector the vector which will be sorted
     */
    public static void sortSelectionIncrease(MyVector vector) {
        if (!checkReference(vector)) {
            return;
        }
        for (int i = 0; i < vector.getSize() - 1; i++) {
            int k = i;
            for (int j = i + 1; j < vector.getSize(); j++) {
                if (vector.getElement(k) > vector.getElement(j)) {
                    k = j;
                }
            }
            vector.swap(k, i);
        }
    }

    /**
     * Sorts all vector values in increasing order by merge sort.
     *
     * @param vector the vector which will be sorted
     */
    public static void sortMergeIncrease(MyVector vector) {
        if (checkReference(vector)) {
            sortMerge(vector, 0, vector.getSize() - 1, true);
        }
    }

    /**
     * Sorts all vector values in decreasing order by merge sort.
     *
     * @param vector the vector which will be sorted
     */
    public static void sortMergeDecrease(MyVector vector) {
        if (checkReference(vector)) {
            sortMerge(vector, 0, vector.getSize() - 1, false);
        }
    }

    /**
     * This method recursively divides vector into subvectors and sort them by merge sort.
     *
     * @param vector the vector which will be sorted
     * @param left   left border of the subvector
     * @param right  right border of the subvector
     * @param order  sort order: true - increasing order, false - decreasing order
     */
    private static void sortMerge(MyVector vector, int left, int right, boolean order) {
        if (right <= left) {
            return;
        }
        int middle = left + (right - left) / 2;
        sortMerge(vector, left, middle, order);
        sortMerge(vector, middle + 1, right, order);

        MyVector buf = new MyVector(vector.getSize());

        for (int k = left; k <= right; k++) {
            buf.add(vector.getElement(k));
        }
        for (int i = left, j = middle + 1, k = left; k <= right; k++) {
            if (i > middle) {
                vector.setElement(k, buf.getElement(j++ - left));
            } else if (j > right) {
                vector.setElement(k, buf.getElement(i++ - left));
            } else if ((order && buf.getElement(j - left) < buf.getElement(i - left))
                    || (!order && buf.getElement(j - left) > buf.getElement(i - left))) {
                vector.setElement(k, buf.getElement(j++ - left));
            } else {
                vector.setElement(k, buf.getElement(i++ - left));
            }
        }
    }

    /**
     * Sorts all vector values in increasing order by quick sort.
     *
     * @param vector the vector which will be sorted
     */
    public static void sortQuickIncrease(MyVector vector) {
        if (checkReference(vector)) {
            sortQuick(vector, 0, vector.getSize() - 1, true);
        }
    }

    /**
     * Sorts all vector values in decreasing order by quick sort.
     *
     * @param vector the vector which will be sorted
     */
    public static void sortQuickDecrease(MyVector vector) {
        if (checkReference(vector)) {
            sortQuick(vector, 0, vector.getSize() - 1, false);
        }
    }

    /**
     * This method recursively divides vector into subvectors and sort them by quick sort.
     *
     * @param vector the vector which will be sorted
     * @param left   left border of the subvector
     * @param right  right border of the subvector
     * @param order  sort order: true - increasing order, false - decreasing order
     */
    private static void sortQuick(MyVector vector, int left, int right, boolean order) {
        if (left >= right) {
            return;
        }
        int i = left, j = right;
        int average = i - (i - j) / 2;
        while (i < j) {
            while (i < average && ((order && vector.getElement(i) <= vector.getElement(average))
                    || (!order && vector.getElement(i) >= vector.getElement(average)))) {
                i++;
            }
            while (j > average && ((order && vector.getElement(j) >= vector.getElement(average))
                    || (!order && vector.getElement(j) <= vector.getElement(average)))) {
                j--;
            }
            if (i < j) {
                vector.swap(i, j);
                if (i == average) {
                    average = j;
                } else if (j == average) {
                    average = i;
                }
                sortQuick(vector, left, average, order);
                sortQuick(vector, average + 1, right, order);
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
