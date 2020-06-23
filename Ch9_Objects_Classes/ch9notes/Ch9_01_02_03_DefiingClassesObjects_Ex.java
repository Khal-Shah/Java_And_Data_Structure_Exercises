package ch9notes;

/* Intro: Object-oriented programming enables you to develop large-scale software and GUIs effectively.
 * DEFINING CLASSES FOR OBJECTS:
 * A class defines the properties and behaviors for objects.
 * An object has a unique identity, state, and behavior.
 * The state of an object (also known as its properties or attributes) is represented by data fields with their current values. 
 * A circle object, for example, has a data field radius, which is the property that characterizes a circle.
 * The behavior of an object (also known as its actions) is defined by methods. To invoke a method on an object is to 
 * ask the object to perform an action. For example, you may define methods named getArea() and getPerimeter() for 
 * circle objects. 
 * 
 * Objects of the same type are defined using a common class. A class is a template, blue- print, or contract that defines 
 * what an object’s data fields and methods will be. An object is an instance of a class. 
 * You can create many instances of a class. Creating an instance is referred to as instantiation. 
 * The terms object and instance are often interchangeable. 
 * 
 * A Java class uses variables to define data fields and methods to define actions. 
 * Additionally, a class provides methods of a special type, known as constructors, which are invoked to create a 
 * new object. A constructor can perform any action, but constructors are designed to perform initializing actions, 
 * such as initializing the data fields of objects.
 */

public class Ch9_01_02_03_DefiingClassesObjects_Ex
{
	/* You can put the two classes into one file, but only one class in the file can be a public class. Furthermore, the public 
	 * class must have the same name as the file name
	 * Each class in the source code is compiled into a .class file. (So after this .java is compiled, it'll have the Ch_901
	 * and the Circle classes as separate .class files
	 */

	public static void main(String[] args)
	{
		//Create objects
		//Create a circle with radius 1...Class objName = new Class(parameter you wanna pass to constructor)
		Circle circle1 = new Circle();
		System.out.println("The area of the circle of radius "+ circle1.radius + " is " + circle1.getArea());

		//// Create a circle with radius 25
		Circle circle2 = new Circle (25);
		System.out.println("The area of the circle of radius "+ circle2.radius + " is " + circle2.getArea());
		
		//// Create a circle with radius 125
		Circle circle3 = new Circle (125);
		System.out.println("The area of the circle of radius "+ circle3.radius + " is " + circle3.getArea());
		
		// Modify circle radius
		circle2.radius = 100;
		System.out.println("The area of the circle of radius "+ circle2.radius + " is " + circle2.getArea());
		//could also use the setRadius method to set.
		circle2.setRadius(10);
		System.out.println("The area of the circle of radius "+ circle2.radius + " is " + circle2.getArea());
		
		/* As another example, consider television sets. Each TV is an object with states (current channel, 
		 * current volume level, power on or off) and behaviors (change channels, adjust volume, turn on/off). 
	       So behaviours (methods) essentially are to change the states (instance variables)
		 */
		
		TV tv1 = new TV();							//create a TV
		tv1.turnOn();														//turn on
		tv1.setChannel(30);								//set a new channel
		tv1.setVolumeLevel(3);									//set a new volume
		
		System.out.println("tv1 is turned " + ((tv1.getOnOff())? "on " : "off") + " and is set on channel " + tv1.channel + 
				" with a volume level of " + tv1.volumeLevel);
		
		TV tv2 = new TV ();
		tv2.turnOn();
		
		
		System.out.println("Initially, tv2's channel is at " + tv2.channel + " with volume level of " + tv2.volumeLevel);
		
		tv2.channelUp();
		tv2.volumeUp();
		
		System.out.println("If we increase both one level then channel is on " + tv2.channel + " and volume is at "
				+ tv2.volumeLevel);
		//if method is a void, you can't use + within sysout...We can always do object.variable to access the data field. 
		tv2.setChannel(120);			//mutalotor is a void too so we can't access it from sysout.
		System.out.println(tv2.channel);
	}
	
	
}
	
	/* 9.3: Defining class and creating objects (an example) 
	 * Classes are definitions for objects and objects are created from classes.
	 * Following is a program that defines the Circle class and uses it to create objects. 
	 * The program constructs three circle objects with radius 1, 25, and 125 and displays the radius and area of each 
	 * of the three circles. It then changes the radius of the second object to 100 and displays its new radius and area.
	 */
//Define the circle class with two constructors

class Circle
{
	double radius;						//data field (i.e. instance variable or attributes)
	
	// Construct a circle with radius 1 									(i.e. no arg constructor)
	Circle ()		//has to match class name
	{
		radius = 1;																		//default value
	}
	
	//Construct a circle with a specified radius					(second constructor)
	Circle (double newRadius)
	{
		radius = newRadius;
	}
	
	//Following are methods:
	//Return the area of this circle */
	double getArea ()
	{
		return (radius * radius * Math.PI); 
	}
	
	//Return the perimeter of this circle */
	
	double getPerimeter ()
	{
		return (2 * radius * Math.PI);
	}
	
	//Set a new radius for this circle
	void setRadius (double newRadius)
	{
		radius = newRadius;
	}
	
}

//program that defines the TV class.
class TV
{
	int volumeLevel =  1;
	int channel = 1;						//default values of instance variables, could also assign them in the default constructor
	boolean on = false;				//initiall off
	
	TV ()
	{
		//constructor
	}
	
	//Turn on TV
	public void turnOn ()
	{
		on = true;
	}
	
	//Turn off TV
	public void turnOff()
	{
		on = false;
	}
	
	public boolean getOnOff()
	{
		return on;
	}
	
	//set a new channel
	public void setChannel (int newChannel)
	{
		if (on && (newChannel >=1 && newChannel <= 120))			//we're told there's 120 channels max
			{
			channel = newChannel;
			}	
	}
	
	//set a new volume
	public void setVolumeLevel (int newVolumeLevel)								//volume levels 1-7
	{
		if (on && (newVolumeLevel >= 1 && newVolumeLevel <= 7))
		{
			volumeLevel = newVolumeLevel;
		}
	}
	
	//Increase volume
	public void volumeUp ()
	{
		if (on && volumeLevel < 7)		//you can't increase any more if it's already at 7 (max vol)
		{
			volumeLevel++;
		}
	}
	
	//Decrease volume
	public void volumeDown ()
	{
		if (on && volumeLevel > 1)			//can only decrease if it's above 1 (min)
		{
			volumeLevel--;
		}
	}
	
	//Increase channel
	public void channelUp ()
	{
		if (on && channel <120)
		{
			channel++;
		}
	}
	
	//Decrease channel
	public void channelDown ()
	{
		if (on && channel > 1)
		{
			channel--;
		}
	}
	//The constructor and methods in the TV class are defined public so they can be accessed from other classes.
	
}


