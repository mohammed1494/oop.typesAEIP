package oop.abstractionencapsulation;

public abstract class InjuredPlayer implements GSWarriors {

	public void outForSeason() {
		System.out.println("Steph Curry is out for the season 2020");
		//not abstract method
		//non abstract method can have class body/implemented
	}
	
	public abstract void injuryType();
	//abstract can only declare not implemented
}
