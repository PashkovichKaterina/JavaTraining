package by.epam.javatraining.pashkovich.lesson06.task05.model;

public class NumberLogic {
    public static boolean isSimple(int number) {
        boolean result = true;
        if (number >= 0) {
            for (int i = 2; i <= number / 2; ++i) {
                if (number % i == 0) {
                    result = false;
                }
            }
        } else {
            result = false;
        }
        return result;
    }
}
