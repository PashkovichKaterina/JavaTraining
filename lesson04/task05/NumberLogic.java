public class NumberLogic{
	public static int calcDigit(int number, int position){
		return (int)(number / Math.pow(10, position - 1) % 10);
	}
	
	public static int reverseNumber(int number){
		int digit1 = calcDigit(number, 1);
		int digit2 = calcDigit(number, 2);
		int digit3 = calcDigit(number, 3);
		int digit4 = calcDigit(number, 4);
		int digit5 = calcDigit(number, 5);
		int digit6 = calcDigit(number, 6);
		int digit7 = calcDigit(number, 7);

		return (digit1 * 1000000) + (digit2 * 100000) + (digit3 * 10000) + (digit4 * 1000) + (digit5 * 100) + (digit6 * 10) + digit7;
	}
}