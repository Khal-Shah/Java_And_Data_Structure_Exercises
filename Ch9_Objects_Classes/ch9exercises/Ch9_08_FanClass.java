package ch9exercises;

/* Chapter 9 - Exercise 8:
 * (The Fan class) Design a class named Fan to represent a fan. The class contains:
■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to denote the fan speed.
■ A private int data field named speed that specifies the speed of the fan (the default is SLOW).
■ A private boolean data field named on that specifies whether the fan is on (the default is false).
■ A private double data field named radius that specifies the radius of the fan (the default is 5).
■ A string data field named color that specifies the color of the fan (the default is blue).
■ The accessor and mutator methods for all four data fields.
■ A no-arg constructor that creates a default fan.
■ A method named toString() that returns a string description for the fan. If the fan is on, the method returns the fan speed, 
color, and radius in one combined string. If the fan is not on, the method 
returns the fan color and radius along with the string “fan is off” in one combined string.

Draw the UML diagram for the class and then implement the class. Write a test program that creates two Fan objects. 
Assign maximum speed, radius 10, color yellow, and turn it on to the first object. Assign medium speed, radius 5, 
color blue, and turn it off to the second object. Display the objects by invoking their toString method.
 */

		//By Khaled Shah

class Fan
{
	final static int SLOW = 1;
	final static int MEDIUM = 2;							//constants can be public
	final static int FAST = 3;
	
	private int speed;
	private boolean on;
	private double radius;
	String color;															//doesn't say private
	
	Fan ()
	{
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}
	
	//mutator methods
	
	public void setSpeed (int newSpeed)
	{
		speed = (((newSpeed >= 1) && (newSpeed <= 3))? newSpeed : speed);
	}
	
	public void setState (boolean newState)
	{
		on = ((newState == true) || (newState == false)? newState : on);
	}
	
	public void setRadius (double newRadius)
	{
		radius = newRadius;
	}
	
	public void setColor (String newColor)
	{
		color = newColor;
	}
	
	//accessor methods
	
	public String getSpeed()
	{
		if (speed == SLOW)
		{
			return "slow";
		}
		
		else if (speed == MEDIUM)
		{
			return "medium";
		}
		
		else 
		{
			return "fast";
		}
	}
	
	public boolean getState()
	{
		return on;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public String toString()
	{
		if (getState())
		{
			return ("Fan speed: " + getSpeed() + "\nColor: " + getColor() + "\nRadius: " + getRadius());
		}
		
		else
		{
			return ("Fan is off.\nColor: " + getColor() + "\nRadius: " + getRadius());
		}
	}
	
}

public class Ch9_08_FanClass
{

	public static void main(String[] args)
	{
		Fan fan1 = new Fan ();
		fan1.setSpeed(3);
		fan1.setState(true);
		fan1.setRadius(10.0);
		fan1.setColor("yellow");
		
		Fan fan2 = new Fan ();
		fan2.setSpeed(2);
		fan2.setState(false);
		fan2.setRadius(5.0);
		fan2.setColor("blue");
		
		System.out.println("Fan1 info:\n" + fan1.toString());
		
		System.out.println("\nFan2 info:\n" + fan2.toString());

	}

}
