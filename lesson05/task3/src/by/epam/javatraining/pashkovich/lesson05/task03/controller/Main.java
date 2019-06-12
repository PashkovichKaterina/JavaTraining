package by.epam.javatraining.pashkovich.lesson05.task03.controller;

import by.epam.javatraining.pashkovich.lesson05.task03.model.MoodSensor;
import by.epam.javatraining.pashkovich.lesson05.task03.view.Printer;

public class Main {
    public static void main(String[] args) {
        Printer.print(MoodSensor.checkMood());
    }
}
