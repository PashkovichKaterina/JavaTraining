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
        if (initialCapasity < 0) {
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
        for (int i = 0; i < size; i++) {
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
        double element = Double.NaN;
        if (checkIndex(index)) {
            element = array[index];
        }
        return element;
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
        for (int i = size, j = 0; j < numbers.length && i < capacity; i++, j++) {
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
        for (int i = 0; i < size; i++) {
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
        for (int i = 0; i < size; i++) {
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
     * Swaps two vector values
     *
     * @param index1 the position of the first value in the vector
     * @param index2 the position of the second value in the vector
     */
    public void swap(int index1, int index2) {
        if (checkIndex(index1) && checkIndex(index2)) {
            double buf = array[index1];
            array[index1] = array[index2];
            array[index2] = buf;
        }
    }
}
