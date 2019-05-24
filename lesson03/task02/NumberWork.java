public class NumberWork{
	public static void changeNumbers(int a, int b){
		Printer.print("Value of variables befor change: a = " + a + ", b = " + b);
		a += b;
		b = a - b;
		a -= b;
		Printer.print("Value of variables after change: a = " + a + ", b = " + b);
	}	
}