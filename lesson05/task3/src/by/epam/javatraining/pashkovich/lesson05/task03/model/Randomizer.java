package by.epam.javatraining.pashkovich.lesson05.task03.model;

import java.util.Random;

public class Randomizer {
    final static Random rand = new Random();

    public static double randomNumber() {
        return rand.nextDouble();
    }
}
