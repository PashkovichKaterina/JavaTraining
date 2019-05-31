package by.epam.javatraining.pashkovich.lesson05.task01.controller;

import by.epam.javatraining.pashkovich.lesson05.task01.model.DragonLogic;
import by.epam.javatraining.pashkovich.lesson05.task01.view.Printer;

public class Main {
    public static void main(String[] args) {
        double age = 23.5;
        Printer.print("The number of the dragon heads whose age " + age + " years is " + DragonLogic.countHead(age));
        Printer.print("The number of the dragon eyes whose age " + age + " years is " + DragonLogic.countEye(age));
    }
}
