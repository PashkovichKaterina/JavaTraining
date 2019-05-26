public class RingLogic{
	public static double calcSquare(double r1, double r2){
		return Math.abs(CircleLogic.calcSquare(r1) - CircleLogic.calcSquare(r2));
	}
}