public class Task1{
	public static void main(String[] args)
	{
		double a = 7, b = 9, c = 1;
		Printer.print("Are the numbers " + a + ", " + b + ", " + c + " the same? --> " + CheckNumbers.isSame(a, b, c));
		Printer.print("Are the numbers " + a + ", " + b + ", " + c + " the different? --> " + CheckNumbers.isDifferent(a, b, c));
	}
}