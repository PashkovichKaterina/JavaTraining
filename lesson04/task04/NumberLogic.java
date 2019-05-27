public class NumberLogic{

	//count of digits in number
	private static final int COUNT = 6;

	public static double arithmeticAverage(int number){
		int digit1 = number % 10;
		number /= 10;

		int digit2 = number % 10;
		number /= 10;

		int digit3 = number % 10;
		number /= 10;

		int digit4 = number % 10;
		number /= 10;

		int digit5 = number % 10;
		number /= 10;

		int digit6 = number % 10;
		number /= 10;

		return (digit1 + digit2 + digit3 + digit4 + digit5 + digit6) / (double)COUNT;
	}
	
	public static double geometricalAverage(int number){
		int digit1 = number % 10;
		number /= 10;

		int digit2 = number % 10;
		number /= 10;

		int digit3 = number % 10;
		number /= 10;

		int digit4 = number % 10;
		number /= 10;

		int digit5 = number % 10;
		number /= 10;

		int digit6 = number % 10;
		number /= 10;

		return Math.pow(digit1 * digit2 * digit3 * digit4 * digit5 * digit6, 1 / (double)COUNT);
	}
}
