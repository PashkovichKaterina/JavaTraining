package by.epam.javatraining.pashkovich.lesson05.task03.model;

import java.util.Random;

public class MoodSensor {
    private static final int MOOD_NUMBER = 5;
    private static final String TERRIBLE = "T_T";
    private static final String BAD = ":(";
    private static final String SO_SO = ":|";
    private static final String GOOD = ":)";
    private static final String EXCELLENT = "XD";

    public static String checkMood() {
        Random random = new Random();
        String mood = EXCELLENT;
        switch (random.nextInt(MOOD_NUMBER)) {
            case 0:
                mood = TERRIBLE;
                break;
            case 1:
                mood = BAD;
                break;
            case 2:
                mood = SO_SO;
                break;
            case 3:
                mood = GOOD;
                break;
        }
        return mood;
    }
}
