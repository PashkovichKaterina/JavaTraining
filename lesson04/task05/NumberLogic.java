public class NumberLogic{	
	public static int reverseNumber(int number){
		int digit1 = number % 10 * 1_000_000;
		number /= 10;

		int digit2 = number % 10 * 100_000;
		number /= 10;

		int digit3 = number % 10 * 10_000;
		number /= 10;

		int digit4 = number % 10 * 1_000;
		number /= 10;

		int digit5 = number % 10 * 100;
		number /= 10;

		int digit6 = number % 10 *10;
		number /= 10;

		int digit7 = number % 10;
		number /= 10;

		return digit1 + digit2 + digit3 + digit4 + digit5 + digit6 + digit7;
	}
}
