public class NumberLogic{

	//count of digits in number
	private static final int COUNT = 6;

	public static double arithmeticAverage(int number){
		int sum = number % 10;
		number /= 10;

		sum += number % 10;
		number /= 10;

		sum += number % 10;
		number /= 10;

		sum += number % 10;
		number /= 10;

		sum += number % 10;
		number /= 10;

		sum += number % 10;
		number /= 10;

		return sum / (double)COUNT;
	}
	
	public static double geometricalAverage(int number){
		int multiply = number % 10;
		number /= 10;

		multiply *= number % 10;
		number /= 10;

		multiply *= number % 10;
		number /= 10;

		multiply *= number % 10;
		number /= 10;

		multiply *= number % 10;
		number /= 10;

		multiply *= number % 10;
		number /= 10;

		return Math.pow(multiply, 1 / (double)COUNT);
	}
}
