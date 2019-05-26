public class Test{
	public static void main(String[] args) {
		double a = 5, b = 7, c = 9;
		Printer.print("Are there any couple of identical numbers " + a + ", " + b + ", " + c + " --> " + CheckNumbers.sameCouple(a, b, c));
		Printer.print("Are there any couple of oposite numbers " + a + ", " + b + ", " + c + " --> " + CheckNumbers.oppositeCouple(a, b, c));
		Printer.print("Are all numbers " + a + ", " + b + ", " + c + " positive --> " + CheckNumbers.isPositive(a, b, c));
		Printer.print("Are all numbers " + a + ", " + b + ", " + c + " negative --> " + CheckNumbers.isNegative(a, b, c));
		Printer.print("Is there at least one positive number " + a + ", " + b + ", " + c + " --> " + CheckNumbers.leastOnePositive(a, b, c));
		Printer.print("Is there at least one negative number " + a + ", " + b + ", " + c + " --> " + CheckNumbers.leastOneNegative(a, b, c));
		Printer.print("Is there only one positive number " + a + ", " + b + ", " + c + " --> " + CheckNumbers.onePositive(a, b, c));
		Printer.print("Is there only one negative number " + a + ", " + b + ", " + c + " --> " + CheckNumbers.oneNegative(a, b, c));
		Printer.print("Are most numbers " + a + ", " + b + ", " + c + " positive --> " + CheckNumbers.mostPositive(a, b, c));
		Printer.print("Are most numbers " + a + ", " + b + ", " + c + " negative --> " + CheckNumbers.mostNegative(a, b, c));
		Printer.print("Are all numbers " + a + ", " + b + ", " + c + " even --> " + CheckNumbers.isEven(a, b, c));
		Printer.print("Are all numbers " + a + ", " + b + ", " + c + " odd --> " + CheckNumbers.isOdd(a, b, c));
		Printer.print("Is there at least one even number " + a + ", " + b + ", " + c + " --> " + CheckNumbers.leastOneEven(a, b, c));
		Printer.print("Is there at least one odd number " + a + ", " + b + ", " + c + " --> " + CheckNumbers.leastOneOdd(a, b, c));
		Printer.print("Are most numbers " + a + ", " + b + ", " + c + " even --> " + CheckNumbers.mostEven(a, b, c));
		Printer.print("Are most numbers " + a + ", " + b + ", " + c + " odd --> " + CheckNumbers.mostOdd(a, b, c));
		Printer.print("Are all numbers " + a + ", " + b + ", " + c + " one parity --> " + CheckNumbers.isOneParity(a, b, c));
		Printer.print("Maximum of numbers" + a + ", " + b + ", " + c + " --> " + CheckNumbers.max(a, b, c));
		Printer.print("Minimum of numbers" + a + ", " + b + ", " + c + " --> " + CheckNumbers.min(a, b, c));
		Printer.print("Geometric avarage of numbers" + a + ", " + b + ", " + c + " --> " + CheckNumbers.calcArithmeticAvarage(a, b, c));
		Printer.print("Arithmetic avarage of numbers" + a + ", " + b + ", " + c + " --> " + CheckNumbers.calcGeometricAvarage(a, b, c));
		Printer.print("Do the numbers " + a + ", " + b + ", " + c + "  form a triangle --> " + CheckNumbers.isTriangle(a, b, c));

		int number = 1221;
		Printer.print("Is the number " + number + " palindrom --> " + CheckNumbers.isPalindrome(number));

		int bytes = 1024;
		Printer.print(bytes + "Bytes = " + Converter.convertByteToKB(bytes) + "KB");
		Printer.print(bytes + "Bytes = " + Converter.convertByteToMB(bytes) + "MB");

		int centimeters = 45;
		Printer.print(centimeters + "Centimeters = " + Converter.convertCentimeterToKilometer(centimeters) + "Kilometer");
		Printer.print(centimeters + "Centimeters = " + Converter.convertCentimeterToMeter(centimeters) + "Meter");

		int degree = 32;
		Printer.print(degree + "Degree = " + Converter.convertDegreeToRadian(degree) + "Radian");

		int radians = 20;
		Printer.print(radians + "Radian = " + Converter.convertRadianToDegree(radians) + "Degree");

		double celsius = 20;
		Printer.print(celsius + "Celsius = " + Converter.convertCelsiusToFahrenheit(celsius) + "Fahrenheit");

		double fahrenheit = 40;
		Printer.print(fahrenheit + "Fahrenheit = " + Converter.convertFahrenheitToCelsius(fahrenheit) + "Celsius");

		a = 2; b = 6;
		Printer.print("Hypotenuse of triangle with cathetus " + a + ", " + b + " --> " + TriangleLogic.calcHypotenuse(a, b));
		Printer.print("Square of triangle with cathetus " + a + ", " + b + " --> " + TriangleLogic.calcSquare(a, b));
		Printer.print("Perimetr of triangle with cathetus " + a + ", " + b + " --> " + TriangleLogic.calcPerimetr(a, b));

		a = 9; b = 7;
		Printer.print("Square of rectangle with sides " + a + ", " + b + " --> " + RectangleLogic.calcSquare(a, b));
		Printer.print("Perimetr of quadrate with sides " + a + ", " + b + " --> " + RectangleLogic.calcPerimetr(a, b));

		a = 5;
		Printer.print("Square of quadrate with side " + a + " --> " + QuadrateLogic.calcSquare(a));
		Printer.print("Perimetr of quadrate with side " + a + " --> " + QuadrateLogic.calcPerimetr(a));

		a = 7;
		Printer.print("Square of cube with side " + a + " --> " + CubeLogic.calcSquare(a));
		Printer.print("Volum of cube with side " + a + " --> " + CubeLogic.calcVolum(a));

		double r = 3;
		Printer.print("Square of circle with radious " + r + " --> " + CircleLogic.calcSquareAlongRadius(r));
		Printer.print("Length of circle with radious " + r + " --> " + CircleLogic.calcLengthAlongRadius(r));

		double d = 6;
		Printer.print("Square of circle with diametr " + d + " --> " + CircleLogic.calcSquareAlongDiametr(d));
		Printer.print("Length of circle with diametr " + d + " --> " + CircleLogic.calcLengthAlongDiametr(d));

		double x = 3, y = 6;
		Printer.print("Is the point with coordinates (" + x + ", " + y + ") in the first quarter --> " + PointLogic.isFirstQuarter(x, y));
		Printer.print("Is the point with coordinates (" + x + ", " + y + ") in the second quarter --> " + PointLogic.isSecondQuarter(x, y));
		Printer.print("Is the point with coordinates (" + x + ", " + y + ") in the third quarter --> " + PointLogic.isThirdQuarter(x, y));
		Printer.print("Is the point with coordinates (" + x + ", " + y + ") in the fourth quarter --> " + PointLogic.isFourthQuarter(x, y));

		double x1 = 8, y1 = 12, x2 = 7, y2 = 10;
		Printer.print("Distance between point (" + x1 + ", " + y1 + ") and point (" + x2 + ", " + y2 + ") --> " + PointLogic.calcDistance(x1, y1, x2, y2));

		Printer.print("Perimetr of rectangle with point (" + x1 + ", " + y1 + ") and point (" + x2 + ", " + y2 + ") --> " + PointLogic.calcRectanglePerimetr(x1, y1, x2, y2));
		Printer.print("Square of rectangle with point (" + x1 + ", " + y1 + ") and point (" + x2 + ", " + y2 + ") --> " + PointLogic.calcRectangleSquare(x1, y1, x2, y2));

		double x3 = 12, y3 = 9;
		Printer.print("Perimetr of triangle is " + PointLogic.calcTrianglePerimetr(x1, y1, x2, y2, x3, y3));
		Printer.print("Square of triangle is " + PointLogic.calcTriangleSquare(x1, y1, x2, y2, x3, y3));
	}
}