public class CircleLogic{
	//28_1
	public static double calcSquareAlongRadius(double r){
		return Math.PI * Math.pow(r, 2);
	}

	//28_2
	public static double calcSquareAlongDiametr(double d){
		return Math.PI * Math.pow(d / 2, 2);
	}

	//28_3
	public static double calcLengthAlongRadius(double r){
		return 2 * Math.PI * r;
	}

	//28_4
	public static double calcLengthAlongDiametr(double d){
		return Math.PI * d;
	}
}