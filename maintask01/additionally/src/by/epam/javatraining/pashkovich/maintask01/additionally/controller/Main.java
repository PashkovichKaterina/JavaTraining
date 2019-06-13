package by.epam.javatraining.pashkovich.maintask01.additionally.controller;

import by.epam.javatraining.pashkovich.maintask01.additionally.model.MatrixLogic;
import by.epam.javatraining.pashkovich.maintask01.additionally.view.Printer;

public class Main {
    public static void main(String[] args) {
        double[][] matrix = {
                {7,6,25,46,4},
                {9,4,5,5,4},
                {9,58,4,4}
        };
        Printer.print("MinValue: " + MatrixLogic.findMinValue(matrix));
        Printer.print("MaxValue: " + MatrixLogic.findMaxValue(matrix));
    }
}
