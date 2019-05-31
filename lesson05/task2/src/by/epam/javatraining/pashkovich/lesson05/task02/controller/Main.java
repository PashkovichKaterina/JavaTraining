package by.epam.javatraining.pashkovich.lesson05.task02.controller;

import by.epam.javatraining.pashkovich.lesson05.task02.model.CheckChar;
import by.epam.javatraining.pashkovich.lesson05.task02.view.Printer;

public class Main {
    public static void main(String[] args) {
        char c = 'M';
        Printer.print("Is character " + c + " vowel? --> " + CheckChar.isVowel(c));
    }
}
