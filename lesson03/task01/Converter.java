public class Converter{
	public static double convertCelsiusToFahrenheit(double x){
		return x * 1.8 + 32;
	}

	public static double convertCelsiusToKelvin(double x){
		return x + 273.15;
	}

	public static double convertFahrenheitToCelsius(double x){
		return (x - 32) * 5 / 9.0;
	}

	public static double convertKelvinToCelsius(double x){
		return x - 273.15;
	}

	public static double convertKelvinToFahrenheit(double x){
		return (x - 273.15) * 1.8 + 32;
	}

	public static double convertFahrenheitToKelvin(double x){
		return (x - 32) * 5 / 9 + 273.15;
	}
}