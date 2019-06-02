package by.epam.javatraining.pashkovich.lesson06.task04.model;

public class NumberLogic {
    public static boolean isDigitEven(int number) {
        number = Math.abs(number);
        while (number > 0) {
            if ((number % 10) % 2 != 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }

    public static boolean isDigitOdd(int number) {
        number = Math.abs(number);
        while (number > 0) {
            if (number % 10 % 2 == 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }

    public static boolean isSameParity(int number) {
        return isDigitEven(number) || isDigitOdd(number);
    }
}
