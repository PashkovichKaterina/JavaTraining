package by.epam.javatraining.pashkovich.lesson06.task03.controller;

import by.epam.javatraining.pashkovich.lesson06.task03.model.NumberLogic;
import by.epam.javatraining.pashkovich.lesson06.task03.view.Printer;

public class Main {
    public static void main(String[] args) {
        int number = 7;
        Printer.print("Factorial of number " + number + ": " + NumberLogic.calcFactorial(number));
    }
}
