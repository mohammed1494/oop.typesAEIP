package oop.Polymorphism;

public class TestLandCalculator {

	public static void main(String[] args) {
		LandCalculator cal1 = new LandCalculator();
		int resultOfTwoPoints = cal1.areaOfTwoPoints( 0, 12);
		System.out.println("Distance of two points is" + " " + resultOfTwoPoints);
		int resultOfThreePoints = cal1.areaOfTwoPoints(0, 12, 15);
		System.out.println("Distance of triangle is" + " " + resultOfThreePoints);
		int resultOfFourPoints = cal1.areaOfTwoPoints(0, 12, 15, 26);
		System.out.println("Distance of regtangle is " + " " + resultOfFourPoints);
		int resultsTestofTwoPoints = cal1.areaTestOfTwoPoints("Mohammed", 26);
				System.out.println(resultsTestofTwoPoints);
		//Method overloading happens in compile time
		//Method overriding happens in run time

		ModernLandCalculatorOriding modCal = new ModernLandCalculatorOriding();
		int resultsTestofTwoPointsModern = modCal.areaOfTwoPoints(0, 12, 15, 26);
		System.out.println( "Modern calculator result is" + " " + resultsTestofTwoPointsModern);
	
	}

}
