package by.epam.javatraining.pashkovich.lesson05.task03.model;

public class MoodSensor {
    private static double BAD = 0.2;
    private static double SO_SO = 0.4;
    private static double GOOD = 0.6;
    private static double EXCELLENT = 0.9;

    public static String moodRandom() {
        double moodNumber = Randomizer.randomNumber();
        return mood(moodNumber);
    }

    public static String mood(double moodNumber) {
        String moodString = "T_T";
        if (moodNumber >= BAD && moodNumber < SO_SO) {
            moodString = ":(";
        } else if (moodNumber >= SO_SO && moodNumber < GOOD) {
            moodString = ":|";
        } else if (moodNumber >= GOOD && moodNumber < EXCELLENT) {
            moodString = ":)";
        } else if (moodNumber >= EXCELLENT) {
            moodString = "XD";
        }
        return moodString;
    }
}
