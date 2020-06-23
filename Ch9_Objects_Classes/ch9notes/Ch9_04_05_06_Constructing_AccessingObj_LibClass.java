package ch9notes;

import java.util.Random;

/* 9.4: CONSTRUCTING OBJECTS USING CONSTRUCTORS
 * A constructor is invoked to create an object using the new operator.

 * Constructors are a special kind of method. They have three peculiarities:
■ A constructor must have the same name as the class itself.
■ Constructors do not have a return type—not even void.
■ Constructors are invoked using the new operator when an object is created. 
Constructors play the role of initializing objects.

Like regular methods, constructors can be overloaded (i.e., multiple constructors can have the same name but different 
signatures), making it easy to construct objects with different initial data values.

Constructors are used to construct objects. To construct an object from a class, invoke a
constructor of the class using the new operator, as follows: 
new ClassName(arguments);

For example, new Circle() creates an object of the Circle class using the first constructor defined in the Circle class, 
and new Circle(25) creates an object using the second constructor defined in the Circle class.
A class normally provides a constructor without arguments (e.g., Circle()). Such a constructor is referred to as a no-arg 
or no-argument constructor.
A class may be defined without constructors. In this case, a public no-arg constructor with an empty body is implicitly 
defined in the class. This constructor, called a default constructor, is provided automatically only if no constructors are 
explicitly defined in the class.
 */

public class Ch9_04_05_06_Constructing_AccessingObj_LibClass
{
	/* 9.5: ACCESSING OBJECTS VIA REFERENCE VARIABLES
	 * An object’s data and methods can be accessed through the dot (.) operator via the object’s reference variable.
	 * Objects are accessed via the object’s reference variables, which contain references to the objects. 
	 * Such variables are declared using the following syntax:		ClassName objectRefVar;
	 * 
You can write a single statement that combines the declaration of an object reference variable, the creation of an object, 
and the assigning of an object reference to the variable with the following syntax:
ClassName objectRefVar = new ClassName(); Here is an example:
Circle myCircle = new Circle();
The variable myCircle holds a reference to a Circle object.
	 */
	
	/* 9.5.2 ACCESSING AN OBJECT'S DATA AND METHODS
	 * In OOP terminology, an object’s member refers to its data fields and methods. After an object is created, 
	 * its data can be accessed and its methods can be invoked using the dot operator (.), also known as the object 
	 * member access operator:
■ objectRefVar.dataField references a data field in the object.
■ objectRefVar.method(arguments) invokes a method on the object
	
	 * Usually you create an object and assign it to a variable, and then later you can use the variable to reference the 
	 * object.  Occasionally an object does not need to be referenced later. In this case, you can create an object without 
	 * explicitly assigning it to a variable using the syntax:										new Circle();
or																							System.out.println("Area is " + new Circle(5).getArea());
The former statement creates a Circle object. The latter creates a Circle object and invokes its getArea method to 
return its area. An object created in this way is known as an anonymous object.
	 */
	
	/* 9.5.3: REFERENCE DATA FIELDS AND THE NULL VALUE
	 * The default value of a data field is null for a reference type, (of the String type. )...if you don't assign them anything.
	 * 0 for a numeric type, false for a boolean type, and \u0000 for a char type. However, Java assigns no default value 
	 * to a local variable inside a method. (so you'd have to initialize them in the method to use them within the method)
	 */
	
	/* 9.5.4: DIFFERENCE BETWEEN VARIABLES OF PRIMITIVE TYPES AND REFERENCE TYPES
	 * A variable of a primitive type holds a value of the primitive type, and a variable of a reference type holds a 
	 * reference to where an object is stored in memory (the class)
	 * the assignment statement i = j copies the contents of j into i for primitive variables. 
	 * The assignment statement c1 = c2 copies the reference of c2 into c1 for reference variables. After the assignment, 
	 * variables c1 and c2 refer to the same object.
	 */

	public static void main(String[] args)
	{
		/* 9.6 Using Classes from the Java Library
		 * Java provides a system-independent encapsulation (i.e hidden/implicit) of date and time in the java.util.Date class,
		 * You can use the no-arg constructor in the Date class to create an instance for the current date and time, 
		 * the getTime() method to return the elapsed time since January 1, 1970, GMT, and the toString() method to 
		 * return the date and time as a string. For example, the following code
		 */
				//class		refVar
		java.util.Date date = new java.util.Date(); 										//creating the object from the class
		System.out.println("The elapsed time since Jan 1, 1970 is " +
		date.getTime() + " milliseconds"); 
		System.out.println(date.toString());
		
		/* The Random Class
		 * Another way to generate random numbers is to use the java.util.Random class which can generate a random int, 
		 * long, double, float, and boolean value.								^import it
		 When you create a Random object, you have to specify a seed or use the default seed. A seed is a number 
		 used to initialize a random number generator. The no-arg constructor creates a Random object using the current 
		 elapsed time as its seed. If two Random objects have the same seed, they will generate identical sequences 
		 of numbers. For example, the following code creates two Random objects with the same seed, 3.
		 */
		
			Random random1 = new Random(3); 
			System.out.print("From random1: ");
			for (int i = 0; i < 10; i++)
			{
				System.out.print(random1.nextInt(1000) + " ");
			}
			
			Random random2 = new Random(3); 
			System.out.print("\nFrom random2: "); 
			for (int i = 0; i < 10; i++)
			{
				System.out.print(random2.nextInt(1000) + " ");
			}
	

	}

}
