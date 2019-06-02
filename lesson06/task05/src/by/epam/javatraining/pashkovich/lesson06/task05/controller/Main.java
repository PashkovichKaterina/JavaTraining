package by.epam.javatraining.pashkovich.lesson06.task05.controller;

import by.epam.javatraining.pashkovich.lesson06.task05.model.NumberLogic;
import by.epam.javatraining.pashkovich.lesson06.task05.view.Printer;

public class Main {
    public static void main(String[] args) {
        int number = 5;
        Printer.print("Is number " + number + " simple? --> " + NumberLogic.isSimple(number));
    }
}
