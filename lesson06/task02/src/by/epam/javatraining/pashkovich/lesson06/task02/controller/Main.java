package by.epam.javatraining.pashkovich.lesson06.task02.controller;

import by.epam.javatraining.pashkovich.lesson06.task02.model.NumberLogic;
import by.epam.javatraining.pashkovich.lesson06.task02.view.Printer;

public class Main {
    public static void main(String[] args) {
        int number = 2434;
        Printer.print("Is the number " + number + " decreasing? --> " + NumberLogic.isDecreasing(number));
        Printer.print("Is the number " + number + " increasing? --> " + NumberLogic.isIncreasing(number));
    }
}
