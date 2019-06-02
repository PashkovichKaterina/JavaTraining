package by.epam.javatraining.pashkovich.lesson06.task04.controller;

import by.epam.javatraining.pashkovich.lesson06.task04.model.NumberLogic;
import by.epam.javatraining.pashkovich.lesson06.task04.view.Printer;

public class Main {
    public static void main(String[] args) {
        int number = 54987;
        Printer.print("Is number " + number + " have similar parity? --> " + NumberLogic.isSameParity(number));
    }
}
