public class Task3{
	public static void main(String[] args) {
		double kilogram = 34;
		Printer.print(kilogram + " Kilogram = " + Converter.convertKilogramToMilligram(kilogram) + " Milligram");
		Printer.print(kilogram + " Kilogram = " + Converter.convertKilogramToGram(kilogram) + " Gram");
		Printer.print(kilogram + " Kilogram = " + Converter.convertKilogramToTon(kilogram) + " Ton");
	} 
}
