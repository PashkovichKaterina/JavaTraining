public class Task1{
	public static void main(String[] args){
		
		double celsius = 38.6;
		Printer.print(celsius + " Celsius = " + Converter.convertCelsiusToFahrenheit(celsius) + " Fahrenheit");
		Printer.print(celsius + " Celsius = " + Converter.convertCelsiusToKelvin(celsius) + " Kelvin");

		double fahrenheit = 137;
		Printer.print(fahrenheit + " Fahrenheit = " + Converter.convertFahrenheitToCelsius(celsius) + " Celsius");
		Printer.print(fahrenheit + " Fahrenheit = " + Converter.convertFahrenheitToKelvin(celsius) + " Kelvin");

		double kelvin = 160;
		Printer.print(kelvin + " Kelvin = " + Converter.convertKelvinToCelsius(celsius) + " Celsius");
		Printer.print(kelvin + " Kelvin = " + Converter.convertKelvinToFahrenheit(celsius) + " Fahrenheit");
	}
} 
