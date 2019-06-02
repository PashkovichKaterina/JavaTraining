package by.epam.javatraining.pashkovich.lesson06.task03.model;

public class NumberLogic {
    public static int calcFactorial(int number) {
        int result = 1;

        if (number >= 0) {
            for (int i = 2; i <= number; ++i) {
                result *= i;
            }
        } else {
            result = -1;
        }

        return result;
    }
}
