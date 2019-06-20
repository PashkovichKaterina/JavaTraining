package by.epam.javatraining.pashkovich.tasks.maintask02.model.entity;

import org.apache.log4j.Logger;

import java.util.Objects;

public class Library {
    private static final Logger LOGGER = Logger.getRootLogger();

    private static final int DEFAULT_CAPACITY = 10;
    private static final int MAX_CAPACITY = 1_000_000_000;

    private Edition[] array;
    private int size = 0;
    private int capacity = DEFAULT_CAPACITY;


    public Library() {
        array = new Edition[capacity];
    }

    public Library(int initialCapasity) {
        if (initialCapasity < 0) {
            LOGGER.warn("NegativeArraySize");
        } else {
            capacity = initialCapasity;
        }
        array = new Edition[capacity];
    }

    public int getSize() {
        return size;
    }

    private boolean checkIndex(int index) {
        if (index < 0 || index >= size) {
            LOGGER.warn("ArrayIndexOutOfBounds");
            return false;
        }
        return true;
    }

    private void increaseCapacity() {
        if (capacity > MAX_CAPACITY / 2) {
            LOGGER.warn("MaxValueCapacity");
            return;
        }
        capacity *= 2;
        Edition[] newLibrary = new Edition[capacity];
        for (int i = 0; i < size; i++) {
            newLibrary[i] = array[i];
        }
        array = newLibrary;
    }

    public void setElement(int index, Edition value) {
        if (checkIndex(index)) {
            array[index] = value;
        }
    }

    public Edition getElement(int index) {
        Edition element = new Edition();
        if (checkIndex(index)) {
            element = array[index];
        }
        return element;
    }

    public void add(Edition... numbers) {
        if (numbers == null) {
            LOGGER.warn("NullPointer");
            return;
        }
        while (size + numbers.length > capacity && capacity < MAX_CAPACITY / 2) {
            increaseCapacity();
        }
        for (int i = size, j = 0; j < numbers.length && i < capacity; i++, j++) {
            array[i] = numbers[j];
        }
        size += numbers.length;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < size; i++) {
            str.append(array[i].toString());
        }
        return str.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Library newLibrary = (Library) obj;
        if (newLibrary.size != size || newLibrary.capacity != capacity) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (newLibrary.getElement(i).equals(array[i])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(array);
    }

    public void swap(int index1, int index2) {
        if (checkIndex(index1) && checkIndex(index2)) {
            Edition buf = array[index1];
            array[index1] = array[index2];
            array[index2] = buf;
        }
    }
}
