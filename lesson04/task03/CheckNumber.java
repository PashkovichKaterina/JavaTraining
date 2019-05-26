public class CheckNumber{
	public static int calcDigit(int number, int position){
		return (int)(number / Math.pow(10, position - 1) % 10);
	}

	public static boolean isDecreasing(int number)
	{
		int digit1 = calcDigit(number, 1);
		int digit2 = calcDigit(number, 2);
		int digit3 = calcDigit(number, 3);
		int digit4 = calcDigit(number, 4);

		return (digit4 > digit3) && (digit3 > digit2) && (digit2 > digit1);
	}

	public static boolean isIncreasing(int number)
	{
		int digit1 = calcDigit(number, 1);
		int digit2 = calcDigit(number, 2);
		int digit3 = calcDigit(number, 3);
		int digit4 = calcDigit(number, 4);

		return (digit4 < digit3) && (digit3 < digit2) && (digit2 < digit1);
	}
}