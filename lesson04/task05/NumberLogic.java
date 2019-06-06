public class NumberLogic{	
	public static int reverseNumber(int number){
		int newNumber = number % 10 * 1_000_000;
		number /= 10;

		newNumber += number % 10 * 100_000;
		number /= 10;

		newNumber += number % 10 * 10_000;
		number /= 10;

		newNumber += number % 10 * 1_000;
		number /= 10;

		newNumber += number % 10 * 100;
		number /= 10;

		newNumber += number % 10 *10;
		number /= 10;

		newNumber += number % 10;
		number /= 10;

		return newNumber;
	}
}
