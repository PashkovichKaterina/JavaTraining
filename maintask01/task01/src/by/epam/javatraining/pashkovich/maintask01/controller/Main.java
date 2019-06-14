package by.epam.javatraining.pashkovich.maintask01.controller;

import by.epam.javatraining.pashkovich.maintask01.model.MyVector;
import by.epam.javatraining.pashkovich.maintask01.view.Printer;


public class Main {
    public static void main(String[] args) {
        MyVector vector = new MyVector(5);
        vector.add(81, 2);
        vector.add(5, 8, 7, 9, 6, 2, 5, 5, 9);

        Printer.print("Vector before sort: " + vector.toString());
        vector.sortBubbleDecrease();
        Printer.print("Vector after sort: " + vector.toString());
    }
}
