package by.epam.javatraining.pashkovich.lesson06.task02.model;

public class NumberLogic {
    public static boolean isDecreasing(int number) {
        number = Math.abs(number);
        while (number / 10 > 0) {
            int digit = number % 10;
            number /= 10;
            if (digit >= number % 10) {
                return false;
            }
        }
        return true;
    }

    public static boolean isIncreasing(int number) {
        number = Math.abs(number);
        while (number / 10 > 0) {
            int digit = number % 10;
            number /= 10;
            if (digit <= number % 10) {
                return false;
            }
        }
        return true;
    }
}
