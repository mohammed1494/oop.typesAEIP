package oop.Polymorphism;

public class LandCalculator {

	public int areaOfTwoPoints(int pointA, int pointB) {

		int total = pointA + pointB;
		return total;
	}

	public int areaTestOfTwoPoints(String pointName, int pointB) {
		System.out.println(pointName);
		int total = pointB;
		return total;
	}
	public int areaOfTwoPoints(int pointB, String pointName ) {
		System.out.println(pointName);
		int total = pointB;
		return total;
	}	

	public int areaOfTwoPoints(int pointA, int pointB, int pointC) {

		int total = pointA + pointB + pointC;
		return total;
	}

	public int areaOfTwoPoints(int pointA, int pointB, int pointC, int pointD) {

		int total = pointA + pointB + pointC + pointD;
		return total;
	}



}
