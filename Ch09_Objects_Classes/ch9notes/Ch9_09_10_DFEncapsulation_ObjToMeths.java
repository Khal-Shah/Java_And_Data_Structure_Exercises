package ch9notes;

/* 9.9: DATA FIELD ENCAPSULATION
 * Making data fields private protects data and makes the class easy to maintain.
 * 
 * The data fields radius and numberOfObjects in the CircleWithStaticMembers class we saw can be modified directly 
 * (e.g., c1.radius = 5 or CircleWithStaticMembers.numberOfObjects = 10). 
 * This is not a good practice—for two reasons:
■ First, data may be tampered with. For example, numberOfObjects is to count the number of objects created, 
but it may be mistakenly set to an arbitrary value (e.g., CircleWithStaticMembers.numberOfObjects = 10).

Second, the class becomes difficult to maintain and vulnerable to bugs. Suppose you want to modify the 
CircleWithStaticMembers class to ensure that the radius is nonnegative after other programs have already used the class. 
You have to change not only the CircleWithStaticMembers class but also the programs that use it, because the clients 
may have modified the radius directly (e.g.,c1.radius = -5).

To prevent direct modifications of data fields, you should declare the data fields private, using the private modifier. 
This is known as data field encapsulation.

A private data field cannot be accessed by an OBJECT from outside the class that defines the private field. 
However, a client often needs to retrieve and modify a data field. To make a private data field accessible, 
provide a getter method to return its value. To enable a private data field to be updated, provide a setter method to 
set a new value. A getter method is also referred to as an accessor and a setter to a mutator.

 */
public class Ch9_09_10_DFEncapsulation_ObjToMeths
{

	public static void main(String[] args)
	{
		CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields (5);
		//now if you do myCircle._____ the data fields won't appear cuz they were set as private (can't be accssed by objects
		//from outside the class. 
		
		//System.out.println("The area of the circle with radius " + myCircle.getRadius() + " is " + myCircle.getArea());
		
		//// Increase myCircle's radius by 10%
		//you can't access radius variable so you put myCircle.getRadius to access the radius in place
		//myCircle.setRadius(myCircle.getRadius() * 1.1);
		//radius in getRadius initially was at 5.0, now its at 5 * 1.1 = 5.5																						
		//System.out.println("The area of the circle with radius " + myCircle.getRadius() + " is " + myCircle.getArea());
		
		//System.out.println("The number of object created is " + CircleWithPrivateDataFields.getNumberOfObjects());
		
		/* 9.10: PASSING OBJECTS TO METHODS
		 * Passing an object to a method is to pass the reference of the object.
		 * You can pass objects to methods. Like passing an array (which is an object actually), passing an object is actually 
		 * passing the reference of the  object. The following code passes the myCircle object as an argument to the 
		 * printCircle method:
		 */
		//methName (refName)
		//printCircle (myCircle);
		
		//Following demonstrates the difference between passing a primitive type value and passing a reference value.
		
		CircleWithPrivateDataFields circle1 = new CircleWithPrivateDataFields(1);
		int n = 5;
		// Print areas for radius 1, 2, 3, 4, and 5.
		printAreas (circle1, n);
		//n (primitive type) hasn't changed here but radiius (reference value) has (from default 1) because we kept invoking the mutator
		System.out.println("Now the radius of circle1 is " + circle1.getRadius() + " and n is " + n);
		
	}
																//methName (className x)			object = refVar = myCircle		
	public static void printCircle (CircleWithPrivateDataFields object)
	{
		System.out.println("The area of the circle with radius " + object.getRadius() + " is " + object.getArea());	
																						//^^just like arrays, have to use the parameter name assigned to refVar
	}
																					//reference type				primitive type
	public static void printAreas (CircleWithPrivateDataFields object, int nTimes)
	{
		System.out.println("Radius\t\tArea");
		
		while (nTimes >= 1)
		{
			System.out.println(object.getRadius() + "\t\t" + object.getArea());
			object.setRadius(object.getRadius() + 1);
			nTimes--;
		}
		
	}

}

// a new circle class with a private data-field radius and its associated accessor and mutator methods.

class CircleWithPrivateDataFields
{
	private double radius;											//these can only be changed by accessing/using methods from this class
	private static int objectCreated = 0;
	
	CircleWithPrivateDataFields ()
	{
		radius = 1;
		objectCreated++;
	}
	
	CircleWithPrivateDataFields (double newRadius)
	{
		radius = newRadius;
		objectCreated++;
	}
	
	public void setRadius (double newRadius)
	{
		radius = ((newRadius >= 0)? newRadius : 0);
	}
	
	public double getRadius ()
	{
		return radius;
	}
	
	public double getArea ()
	{
		return (radius * radius * Math.PI);
	}
	
	public static int getNumberOfObjects ()
	{
		return objectCreated;
	}
	
	
	
}
