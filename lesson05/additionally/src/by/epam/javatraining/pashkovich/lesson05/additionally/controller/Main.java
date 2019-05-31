package by.epam.javatraining.pashkovich.lesson05.additionally.controller;

import by.epam.javatraining.pashkovich.lesson05.additionally.model.CalendarLogic;
import by.epam.javatraining.pashkovich.lesson05.additionally.view.Printer;

public class Main {
    public static void main(String[] args) {
        int day = 4, month = 8, year = 2012;
        Printer.print("Day: " + day + "." + month + "." + year + " next day: " + CalendarLogic.nextDate(day, month, year));
    }
}
