package by.epam.javatraining.lesson06.task01.model;

import java.util.Random;

public class HeadOrTail {
    private static final int HEAD = 0;
    private static final int SIDES = 2;

    public static String headsORTails(int steps) {
        Random random = new Random();
        String result = "Invalid data";
        if (steps >= 0) {
            int head = 0;
            for (int i = 0; i < steps; ++i) {
                if (random.nextInt(SIDES + 1) == HEAD) {
                    ++head;
                }
            }
            result = "Heads: " + head + " Tails: " + (steps - head);
        }
        return result;
    }
}
