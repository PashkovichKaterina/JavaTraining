package by.epam.javatraining.pashkovich.lesson06.task02.model;

public class NumberLogic {
    public static boolean isDecreasing(int number) {
        number = Math.abs(number);
        int digit = number % 10;
        number /= 10;
        while (number > 0) {
            if (digit >= number % 10) {
                return false;
            }
            digit = number % 10;
            number /= 10;
        }
        return true;
    }

    public static boolean isIncreasing(int number) {
        number = Math.abs(number);
        int digit = number % 10;
        number /= 10;
        while (number > 0) {
            if (digit <= number % 10) {
                return false;
            }
            digit = number % 10;
            number /= 10;
        }
        return true;
    }
}
