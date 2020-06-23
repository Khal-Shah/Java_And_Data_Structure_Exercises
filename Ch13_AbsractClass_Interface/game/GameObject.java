package game;
//we're gonna make our base class abstract

//The constructor in the abstract class is defined as protected, because it is used only by subclasses.
//A subclass can be abstract even if its superclass is concrete. For example, the Object class is concrete, but its subclasses, 
//such as GeometricObject, may be abstract.
//A subclass CAN override a concrete method in a superclass to define it as abstract. 
//An abstract method must be nonstatic.

//just have to put abstract before class className:				modifer abstract class className
public abstract class GameObject
{
	
	public static void main(String[] args)
	{
		//We have a GameObject class, so can we instantiate/create an object of that class? No, because it's an abstract class
		//Try it:
		//GameObject go1 = new GameObject(); //cannot instantiate to type GameObject...cuz this type is abstract
		
		//So why have an abstract class? So you can extend it...Abstract: represents the idea of an abstract object. 
		
		//However we CAN instantiate subclasses.
/*		Player player = new Player();
		Menu menu = new Menu();
		player.draw();
		menu.draw();
		We can actually assign the declared variables to GameObject (polymorphism). 
		*/
		
		GameObject player1 = new Player();
		GameObject menu1 = new Menu();				//no downcasting/explicit needed
		menu1.draw();
		player1.draw();
		
		GameObject [] gameObjects = new GameObject [2];		//we've set up a place in memory to store 2 references to object
		//of type GameObject
		
		gameObjects [0] = player1;
		gameObjects [1] = menu1;
		
		for (GameObject obj: gameObjects)
		{
			obj.draw();
		}
		
		//player1.someMethod(); won't work cuz our declared variable is GameObject, we have to downcast it
		((Player) player1).someMethod();
	}
	
	//Benefits of abstract class? You can use abstract methods. (can also use regular non-abs meths) as well as have attributes
	//Creating it is very similar to make normal methods:
	public abstract void draw();																			//modifier abstract type name(); 	
//	{																																											^^^end statement
		//you're not going to put an implementation here. You'll differ the implementation to the class that extends the
		//abstract class because it's an abstract method. 
	//}			<=== No curly braces to indicate start/end of method implementation 
	//This is saying that any class that extends this (GameObject) class, MUST implement the draw() method
	//A class that contains abstract methods must be defined as abstract....So you can't have an abstract meth in a regular class
}
