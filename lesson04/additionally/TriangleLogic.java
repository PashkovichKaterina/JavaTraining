public class TriangleLogic{
	//32_1
	public static double calcHypotenuse(double a, double b){
		return Math.sqrt(a * a + b * b);
	}

	//32_2
	public static double calcSquare(double a, double b){
		return 1 / 2 * a * b;
	}

	//32_3
	public static double calcPerimetr(double a, double b){
		return a + b + calcHypotenuse(a, b);
	}
}
