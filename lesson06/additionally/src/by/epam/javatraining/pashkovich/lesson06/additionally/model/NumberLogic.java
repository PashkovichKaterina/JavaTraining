package by.epam.javatraining.pashkovich.lesson06.additionally.model;

public class NumberLogic {
    public static int calcEvenDigit(int number) {
        number = Math.abs(number);
        int count = 0;
        while (number > 0) {
            if ((number % 10) % 2 == 0) {
                ++count;
            }
            number /= 10;
        }
        return count;
    }

    public static int calcOddDigit(int number) {
        number = Math.abs(number);
        int count = 0;
        while (number > 0) {
            if ((number % 10) % 2 != 0) {
                ++count;
            }
            number /= 10;
        }
        return count;
    }

    public static int calcDigitSum(int number) {
        number = Math.abs(number);
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int calcDigitMultiply(int number) {
        number = Math.abs(number);
        int multiply = 1;
        while (number > 0) {
            multiply *= number % 10;
            number /= 10;
        }
        return multiply;
    }

    public static double calcArithmeticSum(int number) {
        number = Math.abs(number);
        int count = 0;
        int sum = 0;
        while (number > 0) {
            ++count;
            sum += number % 10;
            number /= 10;
        }
        return sum / (double) count;
    }

    public static double calcGeometricSum(int number) {
        number = Math.abs(number);
        int count = 0;
        int multiply = 1;
        while (number > 0) {
            ++count;
            multiply *= number % 10;
            number /= 10;
        }
        return Math.pow(multiply, 1.0 / count);
    }

    public static boolean isPalindrom(int number) {
        number = Math.abs(number);
        String str = Integer.toString(number);
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            --j;
            ++i;
        }
        return true;
    }

    public static boolean isDigitSame(int number) {
        number = Math.abs(number);
        int digit = number % 10;
        number /= 10;
        while (number > 0) {
            if (number % 10 != digit) {
                return false;
            }
            number /= 10;
        }
        return true;
    }

    public static boolean isDigitDifferent(int number) {
        number = Math.abs(number);
        String str = Integer.toString(number);
        for (int i = 0; i < str.length(); ++i) {
            for (int j = 0; j < str.length(); ++j) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int maxDigit(int number) {
        number = Math.abs(number);
        int max = number % 10;
        number /= 10;
        while (number > 0) {
            if (number % 10 > max) {
                max = number % 10;
            }
            number /= 10;
        }
        return max;
    }

    public static int minDigit(int number) {
        number = Math.abs(number);
        int min = number % 10;
        number /= 10;
        while (number > 0) {
            if (number % 10 < min) {
                min = number % 10;
            }
            number /= 10;
        }
        return min;
    }

    public static boolean isPerfect(int number) {
        boolean bool = false;
        int sum = 0;
        for (int i = 1; i <= number / 2; ++i) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            bool = true;
        }
        return bool;
    }
}