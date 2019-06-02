package by.epam.javatraining.pashkovich.lesson06.additionally.controller;

import by.epam.javatraining.pashkovich.lesson06.additionally.model.NumberLogic;
import by.epam.javatraining.pashkovich.lesson06.additionally.view.Printer;

public class Main {
    public static void main(String[] args) {
        int number = 57813;
        Printer.print("Count of even digit " + number + ": " + NumberLogic.calcEvenDigit(number));
        Printer.print("Count of odd digit " + number + ": " + NumberLogic.calcOddDigit(number));
        Printer.print("Sum of digit " + number + ": " + NumberLogic.calcDigitSum(number));
        Printer.print("Multiply of digit " + number + ": " + NumberLogic.calcDigitMultiply(number));
        Printer.print("Arithmetic sum of digit " + number + ": " + NumberLogic.calcArithmeticSum(number));
        Printer.print("Geometric sum of digit " + number + ": " + NumberLogic.calcGeometricSum(number));
        Printer.print("Is number " + number + " palindrom --> " + NumberLogic.isPalindrom(number));
        Printer.print("Is all digits of number " + number + " same --> " + NumberLogic.isDigitSame(number));
        Printer.print("Is all digits of number " + number + " different --> " + NumberLogic.isDigitDifferent(number));
        Printer.print("Max digit of number " + number + ": " + NumberLogic.maxDigit(number));
        Printer.print("Min digit of number " + number + ": " + NumberLogic.minDigit(number));
        Printer.print("Is number " + number + " perfect --> " + NumberLogic.isPerfect(number));
    }
}
