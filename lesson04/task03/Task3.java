public class Task3{
	public static void main(String[] args)
	{
		int number = 2434;
		Printer.print("Is the number " + number + " decreasing? --> " + CheckNumber.isDecreasing(number));
		Printer.print("Is the number " + number + " increasing? --> " + CheckNumber.isIncreasing(number));
	}
}