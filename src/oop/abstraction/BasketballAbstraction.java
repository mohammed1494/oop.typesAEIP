package oop.abstraction;

public interface BasketballAbstraction {
	
	//interface is just declaration of method cannot open method body
	// can use static keyword only
	// interface will not allow you to create objects in other class, because below methods are not implemented
	// must implement in another class use implement key word in class
	
	
	public void teamName();	

	public void coach();	

	public void topPlayer();	
	
	public void jerseyNumber();	
	
	public static void playoffs() {
		System.out.println("Lakers went to playoffs");
	}
}
