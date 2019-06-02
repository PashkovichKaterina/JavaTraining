package by.epam.javatraining.lesson06.task01.controller;

import by.epam.javatraining.lesson06.task01.model.HeadOrTail;
import by.epam.javatraining.lesson06.task01.view.Printer;

public class Main {
    public static void main(String[] args) {
        Printer.print(HeadOrTail.headsORTails(100));
    }
}
