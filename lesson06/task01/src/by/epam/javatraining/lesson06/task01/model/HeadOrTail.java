package by.epam.javatraining.lesson06.task01.model;

import java.util.Random;

public class HeadOrTail {
    private static final boolean HEAD = true;

    public static int calcHead(int steps) {
        Random random = new Random();
        int head = 0;
        for (int i = 0; i < steps; ++i) {
            if (random.nextBoolean() == HEAD) {
                ++head;
            }
        }
        return head;
    }
}
