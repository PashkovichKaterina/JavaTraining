public class PointLogic{
	//12_1
	public static boolean isFirstQuarter(double x, double y){
		return x > 0 && y > 0;
	}

	//12_2
	public static boolean isSecondQuarter(double x, double y){
		return x < 0 && y > 0;
	}

	//12_3
	public static boolean isThirdQuarter(double x, double y){
		return x < 0 && y < 0;
	}

	//12_4
	public static boolean isFourthQuarter(double x, double y){
		return x > 0 && y < 0;
	}
	
	//33
	public static double calcDistance(double x1, double y1, double x2, double y2){
		double x = Math.abs(x1 - x2);
		double y = Math.abs(y1 - y2);
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	//34_1
	public static double calcRectangleSquare(double x1, double y1, double x2, double y2){
		double x = Math.abs(x1 - x2);
		double y = Math.abs(y1 - y2);
		return x * y;
	}

	//34_2
	public static double calcRectanglePerimetr(double x1, double y1, double x2, double y2){
		double x = Math.abs(x1 - x2);
		double y = Math.abs(y1 - y2);
		return 2 * (x + y);
	}

	//35_1
	public static double calcTriangleSquare(double x1, double y1, double x2, double y2, double x3, double y3){
		double a1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		double a2 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		double a3 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		double p = (a1 + a2 + a3) / 2;
		return Math.sqrt(p * (p - a1) * (p - a2) * (p - a3));
	}

	//35_2
	public static double calcTrianglePerimetr(double x1, double y1, double x2, double y2, double x3, double y3){
		double a1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		double a2 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		double a3 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		return a1 + a2 + a3;
	}
}