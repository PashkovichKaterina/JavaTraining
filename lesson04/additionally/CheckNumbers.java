public class CheckNumbers{

	//1_1
	public static boolean sameCouple(double a, double b, double c){
		return (a == b) || (b == c) || (a == c);
	}

	//1_2
	public static boolean oppositeCouple(double a, double b, double c){
		return (a + b == 0) || (b + c == 0) || (a + c == 0);
	}

	//2_1
	public static boolean isPositive(double a, double b, double c){
		return (a > 0) && (b > 0) && (c > 0);
	}

	//2_2
	public static boolean isNegative(double a, double b, double c){
		return (a < 0) && (b < 0) && (c < 0);
	}

	//3_1
	public static boolean leastOneNegative(double a, double b, double c){
		return (a < 0) || (b < 0) || (c < 0);
	}

	//3_2
	public static boolean leastOnePositive(double a, double b, double c){
		return a > 0 || b > 0 || c > 0;
	}

	//4_1
	public static boolean oneNegative(double a, double b, double c){
		return (a < 0 && b > 0 && c > 0) || (b < 0 && a > 0 && c > 0) || (c < 0 && b > 0 && a > 0);
	}

	//4_2
	public static boolean onePositive(double a, double b, double c){
		return (a > 0 && b < 0 && c < 0) || (b > 0 && a < 0 && c < 0) || (c > 0 && b < 0 && a < 0);
	}

	//5_1
	public static boolean mostNegative(double a, double b, double c){
		return (a < 0 && b < 0) || (b < 0 && c < 0) || (a < 0 || c < 0);
	}

	//5_2
	public static boolean mostPositive(double a, double b, double c){
		return (a > 0 && b > 0) || (b > 0 && c > 0) || (a > 0 || c > 0);
	}

	//6_1
	public static boolean isEven(double a, double b, double c){
		return (a % 2 == 0) && (b % 2 == 0) && (c % 2 == 0);
	}

	//6_2
	public static boolean isOdd(double a, double b, double c){
		return (a % 2 != 0) && (b % 2 != 0) && (c % 2 != 0);
	}

	//7_1
	public static boolean leastOneEven(double a, double b, double c){
		return (a % 2 == 0) || (b % 2 == 0) || (c % 2 == 0);
	}

	//7_2
	public static boolean leastOneOdd(double a, double b, double c){
		return (a % 2 != 0) || (b % 2 != 0) || (c % 2 != 0);
	}

	//8_1
	public static boolean oneEven(double a, double b, double c){
		return ((a % 2 == 0) && (b % 2 != 0) && (c % 2 != 0)) || ((b % 2 == 0) && (a % 2 != 0) && (c % 2 != 0)) || ((c % 2 == 0) && (b % 2 != 0) && (a % 2 != 0));
	}

	//8_2
	public static boolean oneOdd(double a, double b, double c){
		return ((a % 2 != 0) && (b % 2 == 0) && (c % 2 == 0)) || ((b % 2 != 0) && (a % 2 == 0) && (c % 2 == 0)) || ((c % 2 != 0) && (b % 2 == 0) && (a % 2 == 0));
	}

	//9
	public static boolean isOneParity(double a, double b, double c){
		return isEven(a, b, c) || isOdd(a, b, c);
	}

	//10_1
	public static boolean mostEven(double a, double b, double c){
		return ((a % 2 == 0) && (b % 2 == 0)) || ((a % 2 == 0) && (c % 2 == 0)) || ((c % 2 == 0) && (b % 2 == 0));
	}

	//10_2
	public static boolean mostOdd(double a, double b, double c){
		return ((a % 2 != 0) && (b % 2 == 0)) || ((a % 2 != 0) && (c % 2 == 0)) || ((c % 2 != 0) && (b % 2 == 0));
	}

	//11
	public static boolean isPalindrome(int number){
		return (number / 1000 == number % 10) && (number / 100 % 10 == number % 100 / 10);
	}

	//13
	public static boolean isTriangle(double a, double b, double c){
		return (a < b + c) && (b < a + c) && (c < b + a);
	}

	//14
	public static boolean isEquilateralTriangle(double a, double b, double c){
		return isTriangle(a, b, c) && (a == b && b == c);
	}

	//15
	public static boolean isIsoscelesTriangle(double a, double b, double c){
		return isTriangle(a, b, c) && (a == b || b == c || a == c);
	}

	//16
	public static boolean isRightTriangle(double a, double b, double c){
		return isTriangle(a, b, c) && ((Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) || Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2) || Math.pow(c, 2) == Math.pow(b, 2) + Math.pow(a, 2));
	}

	//17
	public static boolean isRightIsoscelesTriangle(double a, double b, double c){
		return isIsoscelesTriangle(a, b, c) && isRightTriangle(a, b, c);
	}

	//18
	public static boolean inRectangle(double x, double y, double x1, double y1, double x2, double y2){
		return x > x1 && y > y1 && x < x2 && y < y2;
	}

	//30_1
	public static double calcArithmeticAvarage(double a, double b, double c){
		return (a + b + c) / 3;
	}

	//30_2
	public static double calcGeometricAvarage(double a, double b, double c){
		return Math.pow(a * b * c, 1 / 3);
	}

	//31_1
	public static double max(double a, double b, double c){
		double max = (a > b) ? a : b;
		return (c > max) ? c : max;
	}

	//31_2
	public static double min(double a, double b, double c){
		double min = (a < b) ? a : b;
		return (c > min) ? c : min;
	}
}