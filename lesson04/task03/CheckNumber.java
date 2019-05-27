public class CheckNumber{
	public static boolean isDecreasing(int number)
	{
		int digit1 = number % 10;
		number /= 10;

		int digit2 = number % 10;
		number /= 10;

		int digit3 = number % 10;
		number /= 10;

		int digit4 = number % 10;
		number /= 10;

		return digit4 > digit3 && digit3 > digit2 && digit2 > digit1;
	}

	public static boolean isIncreasing(int number)
	{
		int digit1 = number % 10;
		number /= 10;

		int digit2 = number % 10;
		number /= 10;

		int digit3 = number % 10;
		number /= 10;

		int digit4 = number % 10;
		number /= 10;

		return digit4 < digit3 && digit3 < digit2 && digit2 < digit1;
	}
}
