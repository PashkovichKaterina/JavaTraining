package by.epam.javatraining.pashkovich.maintask01.model;

/**
 * This class contains different static methods for working with array.
 *
 * @author Pashkovich Katsiaryna Vasilevna
 * @version 1.0.0
 */
public class VectorLogic {
    /**
     * This method finds the maximum value of the array.
     *
     * @param array The array in which the maximum value will be searched
     * @return The maximum value of source array, or Double.MIN_VALUE if the array length is 0
     */
    public static double findMax(double[] array) {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < array.length; ++i) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * This method finds the minimum value of the array.
     *
     * @param array The array in which the minimum value will be searched
     * @return The minimum value of source array, or Double.MAX_VALUE if the array length is 0
     */
    public static double findMin(double[] array) {
        double min = Double.MAX_VALUE;
        for (int i = 1; i < array.length; ++i) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * This method calculate the arithmetic average of array values.
     *
     * @param array The array that will be used for calculate the arithmetic average
     * @return The arithmetic average of array values, or Double.MIN_VALUE if the array length is 0
     */
    public static double calcArithmeticAverage(double[] array) {
        double sum = Double.MIN_VALUE;
        if (array.length > 0) {
            sum = array[0];
            for (int i = 1; i < array.length; ++i) {
                sum += array[i];
            }
            sum /= array.length;
        }
        return sum;
    }

    /**
     * This method calculate the geometric average of array values.
     *
     * @param array The array that will be used for calculate the geometric average
     * @return The geometric average of array values, or Double.MIN_VALUE if the array length is 0
     */
    public static double calcGeometricAverage(double[] array) {
        double multiply = Double.MIN_VALUE;
        if (array.length > 0) {
            multiply = array[0];
            for (int i = 1; i < array.length; ++i) {
                multiply *= array[i];
            }
            multiply = Math.pow(multiply, 1.0 / array.length);
        }
        return multiply;
    }

    /**
     * This method checks that array values are in decreasing order.
     *
     * @param array The array which values ​​will be used to check decreasing order
     * @return True if array values are in decreasing order, or false if array values are not in decreasing order or the array length is 0
     */
    public static boolean isDecreasing(double[] array) {
        if (array.length == 0) {
            return false;
        }
        for (int i = 1; i < array.length; ++i) {
            if (array[i - 1] < array[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * This method checks that array values are in increasing order.
     *
     * @param array The array which values ​​will be used to check increasing order
     * @return True if array values are in increasing order, or false if array values are not in increasing order or the array length is 0
     */
    public static boolean isIncreasing(double[] array) {
        if (array.length == 0) {
            return false;
        }
        for (int i = 1; i < array.length; ++i) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * This method checks that array values are in an ordered form.
     *
     * @param array The array which values will be used to check ordered form
     * @return True if array values are in ordered form, or false if array values are not in ordered form or the array length is 0
     */
    public static boolean isOrdered(double[] array) {
        return array.length != 0 && (isDecreasing(array) || isIncreasing(array));
    }

    /**
     * This method finds position of the local minimum of array values.
     *
     * @param array The array in which position of the local minimum will be searched
     * @return The position of the local minimum, or -1 if there is no local minimum or the array length is 0
     */
    public static int findLocalMinPosition(double[] array) {
        for (int i = 0; i < array.length; ++i) {
            if ((i == 0 && array[i] < array[i + 1])
                    || (i == array.length - 1 && array[i - 1] > array[i])
                    || (i != 0 && i != array.length - 1 && array[i] < array[i - 1] && array[i] < array[i + 1])) {
                return i;
            }
        }
        return -1;
    }

    /**
     * This method finds position of the local maximum of array values.
     *
     * @param array The array in which position of the local maximum will be searched
     * @return The position of the local maximum, or -1 if there is no local maximum or the array length is 0
     */
    public static int findLocalMaxPosition(double[] array) {
        for (int i = 0; i < array.length; ++i) {
            if ((i == 0 && array[i] > array[i + 1])
                    || (i == array.length - 1 && array[i - 1] < array[i])
                    || (i != 0 && i != array.length - 1 && array[i] > array[i - 1] && array[i] > array[i + 1])) {
                return i;
            }
        }
        return -1;
    }

    /**
     * This method swaps two array values
     *
     * @param array  The array in which will be swap values
     * @param index1 The position of the first value in the array
     * @param index2 The position of the second value in the array
     */
    private static void swap(double[] array, int index1, int index2) {
        double buf = array[index1];
        array[index1] = array[index2];
        array[index2] = buf;
    }

    /**
     * This method reverse all array values.
     *
     * @param array The array which values will be reverse
     */
    public static void reverse(double[] array) {
        for (int i = 0, j = array.length - 1; i < j; ++i, --j) {
            swap(array, j, i);
        }
    }

    /**
     * This method sorts all array values in increasing order by bubble sort.
     *
     * @param array The array which will be sorted
     */
    public static void sortBubbleIncrease(double[] array) {
        for (int i = 1; i < array.length; ++i) {
            for (int j = 0; j < array.length - i; ++j) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    /**
     * This method sorts all array values in decreasing order by bubble sort.
     *
     * @param array The array which will be sorted
     */
    public static void sortBubbleDecrease(double[] array) {
        for (int i = 1; i < array.length; ++i) {
            for (int j = 0; j < array.length - i; ++j) {
                if (array[j] < array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    /**
     * This method sorts all array values in increasing order by modify bubble sort.
     *
     * @param array The array which will be sorted
     */
    public static void sortModify1BubbleIncrease(double[] array) {
        for (int i = 1; i < array.length; ++i) {
            boolean isChange = false;
            for (int j = 0; j < array.length - i; ++j) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    isChange = true;
                }
            }
            if (!isChange) {
                return;
            }
        }
    }

    /**
     * This method sorts all array values in increasing order by modify bubble sort.
     *
     * @param array The array which will be sorted
     */
    public static void sortModify2BubbleIncrease(double[] array) {
        for (int i = 1; i < array.length; ++i) {
            int changes = 0;
            for (int j = 0; j < array.length - i; ++j) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    changes++;
                }
            }
            if (changes <= 1) {
                return;
            }
        }
    }

    /**
     * This method sorts all array values in decreasing order by modify bubble sort.
     *
     * @param array The array which will be sorted
     */
    public static void sortModify1BubbleDecrease(double[] array) {
        for (int i = 1; i < array.length; ++i) {
            boolean isChange = false;
            for (int j = 0; j < array.length - i; ++j) {
                if (array[j] < array[j + 1]) {
                    swap(array, j, j + 1);
                    isChange = true;
                }
            }
            if (!isChange) {
                return;
            }
        }
    }

    /**
     * This method sorts all array values in decreasing order by modify bubble sort.
     *
     * @param array The array which will be sorted
     */
    public static void sortModify2BubbleDecrease(double[] array) {
        for (int i = 1; i < array.length; ++i) {
            int changes = 0;
            for (int j = 0; j < array.length - i; ++j) {
                if (array[j] < array[j + 1]) {
                    swap(array, j, j + 1);
                    changes++;
                }
            }
            if (changes <= 1) {
                return;
            }
        }
    }

    /**
     * This method sorts all array values in increasing order by insertion sort.
     *
     * @param array The array which will be sorted
     */
    public static void sortInsertionIncrease(double[] array) {
        for (int i = 1; i < array.length; ++i) {
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
     * This method sorts all array values in decreasing order by insertion sort.
     *
     * @param array The array which will be sorted
     */
    public static void sortInsertionDecrease(double[] array) {
        for (int i = 1; i < array.length; ++i) {
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
     * This method sorts all array values in decreasing order by selection sort.
     *
     * @param array The array which will be sorted
     */
    public static void sortSelectionDecrease(double[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            int k = i;
            for (int j = i + 1; j < array.length; ++j) {
                if (array[k] < array[j]) {
                    k = j;
                }
            }
            swap(array, k, i);
        }
    }

    /**
     * This method sorts all array values in increasing order by selection sort.
     *
     * @param array The array which will be sorted
     */
    public static void sortSelectionIncrease(double[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            int k = i;
            for (int j = i + 1; j < array.length; ++j) {
                if (array[k] > array[j]) {
                    k = j;
                }
            }
            swap(array, k, i);
        }
    }

    /**
     * This method sorts all array values in increasing order by merge sort.
     *
     * @param array The array which will be sorted
     */
    public static void sortMergeIncrease(double[] array) {
        sortMerge(array, 0, array.length - 1, true);
    }

    /**
     * This method sorts all array values in decreasing order by merge sort.
     *
     * @param array The array which will be sorted
     */
    public static void sortMergeDecrease(double[] array) {
        sortMerge(array, 0, array.length - 1, false);
    }

    /**
     * This method recursively divides array into subarrays and sort them by merge sort.
     *
     * @param array The array which will be sorted
     * @param left  Left border of the subarray
     * @param right Right border of the subarray
     * @param order Sort order: true - increasing order, false - decreasing order
     */
    private static void sortMerge(double[] array, int left, int right, boolean order) {
        if (right <= left) {
            return;
        }
        int middle = left + (right - left) / 2;
        sortMerge(array, left, middle, order);
        sortMerge(array, middle + 1, right, order);

        double[] buf = new double[array.length];

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
     * This method sorts all array values in increasing order by quick sort.
     *
     * @param array The array which will be sorted
     */
    public static void sortQuickIncrease(double[] array) {
        sortQuick(array, 0, array.length - 1, true);
    }

    /**
     * This method sorts all array values in decreasing order by quick sort.
     *
     * @param array The array which will be sorted
     */
    public static void sortQuickDecrease(double[] array) {
        sortQuick(array, 0, array.length - 1, false);
    }

    /**
     * This method recursively divides array into subarrays and sort them by quick sort.
     *
     * @param array The array which will be sorted
     * @param left  Left border of the subarray
     * @param right Right border of the subarray
     * @param order Sort order: true - increasing order, false - decreasing order
     */
    private static void sortQuick(double[] array, int left, int right, boolean order) {
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
                swap(array, i, j);
                if (i == average) {
                    average = j;
                } else if (j == average) {
                    average = i;
                }
                sortQuick(array, left, average, order);
                sortQuick(array, average + 1, right, order);
            }
        }
    }

    /**
     * This method finds the first position of key value in the array.
     *
     * @param array The array in which key value will be searched
     * @param key   The value to be searched
     * @return First position of key value in array, or -1 if there is no such key value or the array length is 0
     */
    public static int searchLinearFirst(double[] array, double key) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    /**
     * This method finds the last position of key value in the array.
     *
     * @param array The array in which key value will be searched
     * @param key   The value to be searched
     * @return Last position of key value in array, or -1 if there is no such key value or the array length is 0
     */
    public static int searchLinearLast(double[] array, double key) {
        for (int i = array.length - 1; i >= 0; --i) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    /**
     * This method finds the first position of key value in the sorted array.
     * If the array is not sorted, the results is undefined.
     *
     * @param array The array in which key value will be searched
     * @param key   The value to be searched
     * @return First position of key value in array, or -1 if there is no such key value or the array length is 0
     */
    public static int searchBinaryFirst(double[] array, double key) {
        return searchBinary(array, key, 0, array.length - 1, true);
    }

    /**
     * This method finds the last position of key value in the sorted array.
     * If the array is not sorted, the results is undefined.
     *
     * @param array The array in which key value will be searched
     * @param key   The value to be searched
     * @return First position of key value in array, or -1 if there is no such key value or the array length is 0
     */
    public static int searchBinaryLast(double[] array, double key) {
        return searchBinary(array, key, 0, array.length - 1, false);
    }

    /**
     * This method recursively divides array into subarrays and search key value by binary search.
     * If the array is not sorted, the results is undefined.
     *
     * @param array The array in which key value will be searched
     * @param key   The value to be searched
     * @param left  Left border of the subarray
     * @param right Right border of the subarray
     * @param order Search order: true - first, false - last
     * @return Position of key value in array, or -1 if there is no such key value or the array length is 0
     */
    private static int searchBinary(double[] array, double key, int left, int right, boolean order) {
        if (right < left) {
            return -1;
        }
        int middle = left + (right - left) / 2;
        if (array[middle] == key && ((order && array[middle - 1] != key) || (!order && array[middle + 1] != key))) {
            return middle;
        }
        if (order && array[middle] >= key) {
            return searchBinary(array, key, left, middle - 1, order);
        }
        return searchBinary(array, key, middle + 1, right, order);
    }

}
