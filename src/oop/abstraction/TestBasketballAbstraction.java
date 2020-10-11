package oop.abstraction;

public class TestBasketballAbstraction {

	public static void main(String[] args) {

		System.out.println("Best team------------------------------------------------------");


		BasketballAbstraction team = new LALakers();
		team.teamName();
		team.coach();
		team.topPlayer();
		team.jerseyNumber();
//		team.playoffs
		//not showing up

		LALakers secondBestPlayer = new LALakers();
		secondBestPlayer.secondBestPlayer();


		System.out.println("Worst team------------------------------------------------------");

		BasketballAbstraction team2 = new NYKnicks();
		team2.teamName();
		team2.coach();
		team2.topPlayer();
		team2.jerseyNumber();

		System.out.println("Top team in East------------------------------------------------------");


		MilBucks Bucks = new MilBucks();
		Bucks.MilwaukeeBucks();
	}

	InjuredPlayer aDavis = new LALakers(); {
	aDavis.injuryType();
	
	}
	
	GSWarriors sCurry = new LALakers(); {
	sCurry.injuredPlayer();
	
	
	}


}

