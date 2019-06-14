package by.epam.javatraining.pashkovich.maintask01.model;

import org.apache.log4j.Logger;

import java.util.Objects;

/**
 * This class allows to work with a growable array of double values.
 *
 * @author Pashkovich Katsiaryna Vasilevna
 * @version 1.0
 * @see Double
 * @since JDK1.0
 */
public class MyVector {
    private static final Logger LOGGER = Logger.getRootLogger();
    /**
     * The array of double numbers into which the components of the vector are stored.
     */
    private double[] array;

    /**
     * The number of valid components in this object.
     */
    private int size;

    /**
     * The capacity of the vector.
     */
    private int capacity;

    /**
     * A constant holding the default value of the vector capacity.
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * A constant holding the max size of the vector.
     */
    private static final int MAX_CAPACITY = 1_000_000_000;

    /**
     * Constructs an empty vector with capacity value is DEFAULT_CAPACITY.
     */
    public MyVector() {
        capacity = DEFAULT_CAPACITY;
        size = 0;
        array = new double[capacity];
    }

    /**
     * Constructs a vector with the given capacity value.
     * If the given capacity value is negative number, the capacity value is DEFAULT_CAPACITY.
     *
     * @param initialCapasity the initial capacity of the vector
     */
    public MyVector(int initialCapasity) {
        if (initialCapasity <= 0) {
            LOGGER.warn("NegativeArraySize");
            capacity = DEFAULT_CAPACITY;
        } else {
            capacity = initialCapasity;
        }
        size = 0;
        array = new double[capacity];
    }

    /**
     * Returns the number of components in this vector.
     *
     * @return the number of components in this vector
     */
    public int getSize() {
        return size;
    }

    /**
     * Checks if the index goes beyond the boundaries of the vector.
     *
     * @param index index of the element which will bw checked
     * @return false if the index goes beyond the boundaries of the vector
     */
    private boolean checkIndex(int index) {
        if (index < 0 || index >= size) {
            LOGGER.warn("ArrayIndexOutOfBounds");
            return false;
        }
        return true;
    }

    /**
     * Increases the capacity of the vector if possible.
     */
    private void increaseCapasity() {
        if (capacity > MAX_CAPACITY / 2) {
            LOGGER.warn("MaxValueCapacity");
            return;
        }
        capacity *= 2;
        double[] newArray = new double[capacity];
        for (int i = 0; i < size; ++i) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    /**
     * Sets the value at the specified index of this vector if possible.
     * The previous value at that position is discarded.
     *
     * @param index the specified index
     * @param value the new value of vector element
     */
    public void setElement(int index, double value) {
        if (checkIndex(index)) {
            array[index] = value;
        }
    }

    /**
     * Returns the element at the specified position in this vector.
     *
     * @param index the specified position
     * @return value of the specified position, or Double.NaN if the index goes beyond the boundaries of the vector
     */
    public double getElement(int index) {
        if (checkIndex(index)) {
            return array[index];
        }
        return Double.NaN;
    }

    /**
     * Adds all elements to the end of this vector, if it is possible to increase the capacity of the vector to the required.
     *
     * @param numbers numbers to be added
     */
    public void add(double... numbers) {
        if (numbers == null) {
            LOGGER.warn("NullPointer");
            return;
        }
        while (size + numbers.length > capacity && capacity < MAX_CAPACITY / 2) {
            increaseCapasity();
        }
        for (int i = size, j = 0; j < numbers.length && i < capacity; ++i, ++j) {
            array[i] = numbers[j];
        }
        size += numbers.length;
    }

    /**
     * Returns a string representation of this vector.
     *
     * @return a string representation of this vector
     */
    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < size; ++i) {
            str += array[i] + " ";
        }
        return str;
    }

    /**
     * Compares the specified Object with this vector for equality.
     *
     * @param obj the Object to be compared for equality with this vector
     * @return true if the specified Object is equal to this vector
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        MyVector newVector = (MyVector) obj;
        if (newVector.size != size || newVector.capacity != capacity) {
            return false;
        }
        for (int i = 0; i < size; ++i) {
            if (newVector.getElement(i) != array[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns the hash code value for this vector.
     *
     * @return the hash code value for this vector
     */
    @Override
    public int hashCode() {
        return Objects.hash(array);
    }

    /**
     * Finds the maximum value of the vector.
     *
     * @return the maximum value of vector, or Double.MIN_VALUE if the vector length is 0
     */
    public double findMax() {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < size; ++i) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * Finds the minimum value of the vector.
     *
     * @return the minimum value of the vector, or Double.MAX_VALUE if the vector length is 0
     */
    public double findMin() {
        double min = Double.MAX_VALUE;
        for (int i = 1; i < size; ++i) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Calculates the arithmetic average of vector values.
     *
     * @return the arithmetic average of vector values, or Double.NaN if the vector length is 0
     */
    public double calcArithmeticAverage() {
        double sum = Double.NaN;
        if (size > 0) {
            sum = array[0];
            for (int i = 1; i < size; ++i) {
                sum += array[i];
            }
            sum /= size;
        }
        return sum;
    }

    /**
     * Calculates the geometric average of vector values.
     *
     * @return the geometric average of vector values, or Double.NaN if the vector length is 0
     */
    public double calcGeometricAverage() {
        double multiply = Double.NaN;
        if (size > 0) {
            multiply = array[0];
            for (int i = 1; i < size; ++i) {
                multiply *= array[i];
            }
            multiply = Math.pow(multiply, 1.0 / size);
        }
        return multiply;
    }

    /**
     * Checks that vector values are in decreasing order.
     *
     * @return true if vector values are in decreasing order, or false if vector values are not in decreasing order or the vector length is 0
     */
    public boolean isDecreasing() {
        if (size == 0) {
            return false;
        }
        for (int i = 1; i < size; ++i) {
            if (array[i - 1] < array[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks that vector values are in increasing order.
     *
     * @return true if vector values are in increasing order, or false if vector values are not in increasing order or the vector length is 0
     */
    public boolean isIncreasing() {
        if (size == 0) {
            return false;
        }
        for (int i = 1; i < size; ++i) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks that vector values are in an ordered form.
     *
     * @return true if vector values are in ordered form, or false if vector values are not in ordered form or the vector length is 0
     */
    public boolean isOrdered() {
        return size != 0 && (isDecreasing() || isIncreasing());
    }

    /**
     * Finds position of the first local minimum of vector values.
     *
     * @return the position of the first local minimum, or -1 if there is no local minimum or the vector length is 0
     */
    public int findFirstLocalMinPosition() {
        for (int i = 1; i < size - 1; ++i) {
            if (array[i] < array[i - 1] && array[i] < array[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Finds position of the last local minimum of vector values.
     *
     * @return the position of the last local minimum, or -1 if there is no local minimum or the vector length is 0
     */
    public int findLastLocalMinPosition() {
        for (int i = size - 1; i > 0; --i) {
            if (array[i] < array[i - 1] && array[i] < array[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Finds position of the first local maximum of vector values.
     *
     * @return the position of the first local maximum, or -1 if there is no local maximum or the vector length is 0
     */
    public int findFirstLocalMaxPosition() {
        for (int i = 1; i < size - 1; ++i) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Finds position of the last local maximum of vector values.
     *
     * @return the position of the last local maximum, or -1 if there is no local maximum or the vector length is 0
     */
    public int findLastLocalMaxPosition() {
        for (int i = size - 1; i > 0; --i) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Swaps two vector values
     *
     * @param index1 the position of the first value in the vector
     * @param index2 the position of the second value in the vector
     */
    private void swap(int index1, int index2) {
        double buf = array[index1];
        array[index1] = array[index2];
        array[index2] = buf;
    }

    /**
     * Reverses all vector values.
     */
    public void reverse() {
        for (int i = 0, j = size - 1; i < j; ++i, --j) {
            swap(j, i);
        }
    }

    /**
     * Sorts all vector values in increasing order by bubble sort.
     */
    public void sortBubbleIncrease() {
        for (int i = 1; i < size; ++i) {
            for (int j = 0; j < size - i; ++j) {
                if (array[j] > array[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    /**
     * Sorts all vector values in decreasing order by bubble sort.
     */
    public void sortBubbleDecrease() {
        for (int i = 1; i < size; ++i) {
            for (int j = 0; j < size - i; ++j) {
                if (array[j] < array[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    /**
     * Sorts all vector values in increasing order by modify bubble sort.
     */
    public void sortModify1BubbleIncrease() {
        for (int i = 1; i < size; ++i) {
            boolean isChange = false;
            for (int j = 0; j < size - i; ++j) {
                if (array[j] > array[j + 1]) {
                    swap(j, j + 1);
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
     */
    public void sortModify2BubbleIncrease() {
        for (int i = 1; i < size; ++i) {
            int changes = 0;
            for (int j = 0; j < size - i; ++j) {
                if (array[j] > array[j + 1]) {
                    swap(j, j + 1);
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
     */
    public void sortModify1BubbleDecrease() {
        for (int i = 1; i < size; ++i) {
            boolean isChange = false;
            for (int j = 0; j < size - i; ++j) {
                if (array[j] < array[j + 1]) {
                    swap(j, j + 1);
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
     */
    public void sortModify2BubbleDecrease() {
        for (int i = 1; i < size; ++i) {
            int changes = 0;
            for (int j = 0; j < size - i; ++j) {
                if (array[j] < array[j + 1]) {
                    swap(j, j + 1);
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
     */
    public void sortInsertionIncrease() {
        for (int i = 1; i < size; ++i) {
            double buf = array[i];
            int j = i - 1;
            while (j >= 0 && buf < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = buf;
        }
    }

    /**
     * Sorts all vector values in decreasing order by insertion sort.
     */
    public void sortInsertionDecrease() {
        for (int i = 1; i < size; ++i) {
            double buf = array[i];
            int j = i - 1;
            while (j >= 0 && buf > array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = buf;
        }
    }

    /**
     * Sorts all vector values in decreasing order by selection sort.
     */
    public void sortSelectionDecrease() {
        for (int i = 0; i < size - 1; ++i) {
            int k = i;
            for (int j = i + 1; j < size; ++j) {
                if (array[k] < array[j]) {
                    k = j;
                }
            }
            swap(k, i);
        }
    }

    /**
     * Sorts all vector values in increasing order by selection sort.
     */
    public void sortSelectionIncrease() {
        for (int i = 0; i < size - 1; ++i) {
            int k = i;
            for (int j = i + 1; j < size; ++j) {
                if (array[k] > array[j]) {
                    k = j;
                }
            }
            swap(k, i);
        }
    }

    /**
     * Sorts all vector values in increasing order by merge sort.
     */
    public void sortMergeIncrease() {
        sortMerge(0, size - 1, true);
    }

    /**
     * Sorts all vector values in decreasing order by merge sort.
     */
    public void sortMergeDecrease() {
        sortMerge(0, size - 1, false);
    }

    /**
     * This method recursively divides vector into subvectors and sort them by merge sort.
     *
     * @param left  left border of the subvector
     * @param right right border of the subvector
     * @param order sort order: true - increasing order, false - decreasing order
     */
    private void sortMerge(int left, int right, boolean order) {
        if (right <= left) {
            return;
        }
        int middle = left + (right - left) / 2;
        sortMerge(left, middle, order);
        sortMerge(middle + 1, right, order);

        double[] buf = new double[size];

        for (int k = left; k <= right; ++k) {
            buf[k] = array[k];
        }
        for (int i = left, j = middle + 1, k = left; k <= right; k++) {
            if (i > middle) {
                array[k] = buf[j++];
            } else if (j > right) {
                array[k] = buf[i++];
            } else if ((order && buf[j] < buf[i]) || (!order && buf[j] > buf[i])) {
                array[k] = buf[j++];
            } else {
                array[k] = buf[i++];
            }
        }
    }

    /**
     * Sorts all vector values in increasing order by quick sort.
     */
    public void sortQuickIncrease() {
        sortQuick(0, size - 1, true);
    }

    /**
     * Sorts all vector values in decreasing order by quick sort.
     */
    public void sortQuickDecrease() {
        sortQuick(0, size - 1, false);
    }

    /**
     * This method recursively divides vector into subvectors and sort them by quick sort.
     *
     * @param left  left border of the subvector
     * @param right right border of the subvector
     * @param order sort order: true - increasing order, false - decreasing order
     */
    private void sortQuick(int left, int right, boolean order) {
        if (left >= right) {
            return;
        }
        int i = left, j = right;
        int average = i - (i - j) / 2;
        while (i < j) {
            while (i < average && ((order && array[i] <= array[average]) || (!order && array[i] >= array[average]))) {
                i++;
            }
            while (j > average && ((order && array[j] >= array[average]) || (!order && array[j] <= array[average]))) {
                j--;
            }
            if (i < j) {
                swap(i, j);
                if (i == average) {
                    average = j;
                } else if (j == average) {
                    average = i;
                }
                sortQuick(left, average, order);
                sortQuick(average + 1, right, order);
            }
        }
    }

    /**
     * Finds the first position of key value in the vector.
     *
     * @param key the value to be searched
     * @return first position of key value in vector, or -1 if there is no such key value or the vector length is 0
     */
    public int searchLinearFirst(double key) {
        for (int i = 0; i < size; ++i) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Finds the last position of key value in the vector.
     *
     * @param key the value to be searched
     * @return last position of key value in vector, or -1 if there is no such key value or the vector length is 0
     */
    public int searchLinearLast(double key) {
        for (int i = size - 1; i >= 0; --i) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Finds the first position of key value in the sorted vector.
     * If the vector is not sorted, the results is undefined.
     *
     * @param key the value to be searched
     * @return first position of key value in vector, or -1 if there is no such key value or the vector length is 0
     */
    public int searchBinaryFirst(double key) {
        return searchBinary(key, 0, size, true);
    }

    /**
     * Finds the last position of key value in the sorted vector.
     * If the vector is not sorted, the results is undefined.
     *
     * @param key the value to be searched
     * @return last position of key value in vector, or -1 if there is no such key value or the vector length is 0
     */
    public int searchBinaryLast(double key) {
        return searchBinary(key, 0, size - 1, false);
    }

    /**
     * This method recursively divides vector into subvectors and search key value by binary search.
     * If the vector is not sorted, the results is undefined.
     *
     * @param key   the value to be searched
     * @param left  left border of the subvector
     * @param right right border of the subvector
     * @param order search order: true - first, false - last
     * @return position of key value in vector, or -1 if there is no such key value or the vector length is 0
     */
    private int searchBinary(double key, int left, int right, boolean order) {
        if (right < left) {
            return -1;
        }
        int middle = left + (right - left) / 2;
        if (array[middle] == key && ((order && array[middle - 1] != key) || (!order && array[middle + 1] != key))) {
            return middle;
        }
        if (order && array[middle] >= key) {
            return searchBinary(key, left, middle - 1, order);
        }
        return searchBinary(key, middle + 1, right, order);
    }
}
