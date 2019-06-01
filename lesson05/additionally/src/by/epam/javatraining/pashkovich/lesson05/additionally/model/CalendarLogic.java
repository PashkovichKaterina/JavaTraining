package by.epam.javatraining.pashkovich.lesson05.additionally.model;

public class CalendarLogic {
    final private static int APRIL = 4;
    final private static int JUNE = 6;
    final private static int SEPTEMBER = 9;
    final private static int NOVEMBER = 11;
    final private static int FEBRUARY = 2;

    //number of first day in month or first month in year
    final private static int FIRST = 1;
    final private static int MAX_DAY_IN_MONTH = 31;
    final private static int MAX_COUNT_OF_MONTH = 12;
    final private static int DAY_IN_LEAP_YEAR = 29;
    final private static int DAY_IN_NOT_LEAP_YEAR = 28;

    public static String nextDate(int day, int month, int year) {
        String date = "Invalid date";
        if (isValidDate(day, month, year)) {
            day++;
            if (!isValidDate(day, month, year)) {
                day = FIRST;
                ++month;
                if (!isValidDate(day, month, year)) {
                    month = FIRST;
                    ++year;
                }
            }
            date = day + "." + month + "." + year;
        }
        return date;
    }

    public static boolean isValidDate(int day, int month, int year) {
        if ((day <= 0 || month <= 0 || year <= 0 || day > MAX_DAY_IN_MONTH || month > MAX_COUNT_OF_MONTH)
                || ((month == APRIL || month == JUNE || month == SEPTEMBER || month == NOVEMBER) && day == MAX_DAY_IN_MONTH)
                || (month == FEBRUARY && ((isLeapYear(year) && day > DAY_IN_LEAP_YEAR) 
                                          || (!isLeapYear(year) && day > DAY_IN_NOT_LEAP_YEAR)))) {
            return false;
        }
        return true;
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
