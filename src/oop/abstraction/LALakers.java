package oop.abstraction;

public class LALakers extends InjuredPlayer implements BasketballAbstraction {

	
	public void teamName() {
		System.out.println("Team: Los Angelos Lakers");
	}

	public void coach() {
		System.out.println("Coach: Frank Vogel");
		
	}

	public void topPlayer() {
		System.out.println("Top player: Lebron James");
		
	}

	public void jerseyNumber() {
		System.out.println("Jersey Number is 23");
	}
	
	public void secondBestPlayer() {
	System.out.println("The second best player on the LA Lakers is Anthony Davis");
	}

	
	public void injuryType() {
		System.out.println("Anthony Davis has a right heel contusion");
		//method is coming from abstract class InjuredPlayer
		
	}

	public void injuredPlayer() {
		System.out.println("Steph Curry is injured on his team");
		// Coming from interface class GSWarriors which was implemented in abstract class InjuredPlayer
		
	}
}

		

