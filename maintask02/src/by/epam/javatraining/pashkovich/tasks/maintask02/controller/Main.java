package by.epam.javatraining.pashkovich.tasks.maintask02.controller;

import by.epam.javatraining.pashkovich.tasks.maintask02.model.entity.*;
import by.epam.javatraining.pashkovich.tasks.maintask02.view.Printer;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.add(new Book(), new Album(), new Magazine());

        Printer.print(library.toString());
    }
}
