package by.epam.javatraining.lesson06.task01.model;

import java.util.Random;

public class HeadOrTail {
    final private static int HEAD = 0;
    final private static int TAIL = 1;
    final private static Random random = new Random();

    public static String headsORTails(int steps) {
        String result = "Invalid data";
        if(steps > 0) {
            int head = 0;
            for (int i = 0; i < steps; ++i) {
                if (random.nextInt(TAIL - HEAD + 1) == HEAD) {
                    ++head;
                }
            }
            result = "Heads: " + head + " Tails: " + (steps - head);
        }
        return result;
    }
}
