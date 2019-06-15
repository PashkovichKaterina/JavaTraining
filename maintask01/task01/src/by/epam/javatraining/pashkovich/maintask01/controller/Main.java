package by.epam.javatraining.pashkovich.maintask01.controller;


import by.epam.javatraining.pashkovich.maintask01.model.MyVector;
import by.epam.javatraining.pashkovich.maintask01.model.logic.*;
import by.epam.javatraining.pashkovich.maintask01.view.Printer;

public class Main {
    public static void main(String[] args) {
        MyVector vector = new MyVector(8);
        vector.add(8, 7, 2, 63, 4, 6, 3, 5);
        Sorted.sortQuickIncrease(vector);
        Printer.print(vector.toString());
    }
}
