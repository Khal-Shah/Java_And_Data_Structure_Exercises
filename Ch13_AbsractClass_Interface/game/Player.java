package game;


public class Player extends GameObject
{
	//Player's superclass is abstract (GameObject), does that mean we cant instantiate Player (subclass) as well? NO!
	//Player player1 = new Player();		//instantiated
	//Abstract classes exist only to be extended, they can not be instantiated. 
	
	//Must implement all the abstract method in the superclass
	@Override
	public void draw()
	{
		System.out.println("Player draw.");
	}

	public void someMethod()
	{
		System.out.println("Some method.");
	}
}
