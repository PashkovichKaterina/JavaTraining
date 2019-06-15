package by.epam.javatraining.pashkovich.lesson06.task05.model;

public class NumberLogic {
    public static boolean isSimple(int number) {
        if (number <= 1) {
            return false;
        }
        int border = number / 2;
        for (int i = 2; i <= border; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
