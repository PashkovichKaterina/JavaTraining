public class Converter{
	//19_1
	public static double convertByteToKB(int bytes){
		return bytes / 1000.0;
	}

	//19_2
	public static double convertByteToMB(int bytes){
		return bytes / 1000000.0;
	}

	//20_1
	public static double convertCentimeterToKilometer(int centimeters){
		return centimeters / 100000.0;
	}

	//20_2
	public static double convertCentimeterToMeter(int centimeters){
		return centimeters / 100.0;
	}

	//36_1
	public static double convertDegreeToRadian(int degree){
		return degree * Math.PI / 180;
	}

	//36_2
	public static double convertRadianToDegree(int radians){
		return radians * 180 / Math.PI;
	}

	//37_1
	public static double convertCelsiusToFahrenheit(double x){
		return x * 1.8 + 32;
	}

	//37_2
	public static double convertFahrenheitToCelsius(double x){
		return (x - 32) * 5 / 9.0;
	}

	//38_2
	public static double convertBRtoUSD(double d){
		return d * 2.3;
	}

	//38_2
	public static double convertUSDtoBR(double d){
		return d / 2.3;
	}
}