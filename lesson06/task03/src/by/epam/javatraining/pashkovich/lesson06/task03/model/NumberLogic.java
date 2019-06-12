package by.epam.javatraining.pashkovich.lesson06.task03.model;

public class NumberLogic {
    public static int calcFactorial(int number) {
        int result = -1;

        if (number >= 0) {
            result = 1;
            for (int i = 2; i <= number; ++i) {
                result *= i;
            }
        }

        return result;
    }
}
