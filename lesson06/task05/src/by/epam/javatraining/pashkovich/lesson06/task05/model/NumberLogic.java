package by.epam.javatraining.pashkovich.lesson06.task05.model;

public class NumberLogic {
    public static boolean isSimple(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
