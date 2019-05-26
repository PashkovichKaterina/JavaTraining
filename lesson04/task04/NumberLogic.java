public class NumberLogic{
	public static int calcDigit(int number, int position){
		return (int)(number / Math.pow(10, position - 1) % 10);
	}
	
	public static double arithmeticAverage(int number){
		int digit1 = calcDigit(number, 1);
		int digit2 = calcDigit(number, 2);
		int digit3 = calcDigit(number, 3);
		int digit4 = calcDigit(number, 4);
		int digit5 = calcDigit(number, 5);
		int digit6 = calcDigit(number, 6);

		return (digit1 + digit2 + digit3 + digit4 + digit5 + digit6) / 6.0;
	}
	
	public static double geometricalAverage(int number){
		int digit1 = calcDigit(number, 1);
		int digit2 = calcDigit(number, 2);
		int digit3 = calcDigit(number, 3);
		int digit4 = calcDigit(number, 4);
		int digit5 = calcDigit(number, 5);
		int digit6 = calcDigit(number, 6);

		return Math.pow(digit1 * digit2 * digit3 * digit4 * digit5 * digit6, 1 / 6.0);
	}
}