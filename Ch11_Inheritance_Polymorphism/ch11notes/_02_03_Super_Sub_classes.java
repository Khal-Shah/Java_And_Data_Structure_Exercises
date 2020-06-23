package ch11notes;

/* Chater 11.1: INTRODUCTION
 * Object-oriented programming allows you to define new classes from existing classes. This is called inheritance.
 * Suppose you need to define classes to model circles, rectangles, and triangles. 
 * These classes have many common features. What is the best way to design these classes so as to avoid redundancy and 
 * make the system easy to comprehend and easy to maintain? The answer is to use inheritance.
 */

/* Chapter 11.2: SUPERCLASSES AND SUBCLASSES
 * Inheritance enables you to define a general class (i.e., a superclass) and later extend it to more specialized classes 
 * (i.e., subclasses).
 * You can define a specialized class that extends the generalized class. The specialized classes inherit the properties and 
 * methods from the general class.
 * 
 * When to use: SUBCLASS IS A SUPERCLASS
 * A subclass and its superclass must have the is-a relationship.
														^^the subclass must have the IS A relationship with the superclass.
														For ex: Circle IS A GeometricObject
																	 Rectangle IS A GeometricObject
																	    ^sub							^super
 * 
 * In Java terminology, a class C1 extended from another class C2 is called a subclass, and C2 is called a superclass. 
 * A superclass is also referred to as a parent class or a base class, and a subclass as a child class, an extended class, or 
 * a derived class. A subclass inherits accessible data fields and methods from its superclass and may also add new data 
 * fields and methods.
 * EXAMPLE: check the geometricobjects package
 * 
 * The Circle class extends the GeometricObject class using the following syntax:
 * public class Circle extends GeometricObject
 * 					^subclass				^superclass				(what child class is being extended from is the superclass/parent class)
 * 
 * The keyword extends tells the compiler that the Circle class extends the GeometricObject class, thus inheriting the 
 * methods getColor, setColor, isFilled, setFilled, and toString.
The overloaded constructor Circle(double radius, String color, boolean filled) is implemented by invoking the setColor 
and setFilled methods to set the color and filled properties. These two public methods are defined in the superclass 
GeometricObject and are inherited in Circle, so they can be used in the Circle class.

OVERLOADED CONSTRUCTOR = constructor in a subclass that uses attributes of superclass
Ex:
public CircleFromGeometricObject (double radius, String color, boolean filled)
	{																								^SC				^SC
		this.radius = radius;
		setColor(color);										
		setFilled(filled);
	}
	
	^That's right, but the below one would be wrong:
	public CircleFromSimpleGeometricObject (double radius, String color, boolean filled) 
	{
	this.radius = radius;
	this.color = color; // Illegal 
	this.filled = filled; // Illegal
	This is wrong, because the private data fields color and filled in the GeometricObject (super) class cannot be accessed 
	in any class other than in the GeometricObject class itself. The only way to read and modify color and filled is through 
	their getter and setter methods.
	
■ Contrary to the conventional interpretation, a subclass is not a subset of its superclass. In fact, a subclass usually 
	contains more information and methods than its superclass.
	
■ Private data fields in a superclass are not accessible outside the class. Therefore, they cannot be used directly in a 
subclass. They can, however, be accessed/mutated through public accessors/mutators if defined in the superclass.

■ Not all is-a relationships should be modeled using inheritance. For example, a square is a rectangle, but you should not 
extend a Square class from a Rectangle class, because the width and height properties are not appropriate for a square. 
Instead, you should define a Square class to extend the GeometricObject class and define the side property for the side 
of a square.

(subclass is a superclass)
■ Inheritance is used to model the IS-A relationship. Do not blindly extend a class just for the sake of reusing methods. 
For example, it makes no sense for a Tree class to extend a Person class, even though they share common properties such 
as height and weight. A subclass and its superclass must have the is-a relationship.
														^^the subclass must have the IS A relationship with the superclass.
														For ex: Circle IS A GeometricObject
																	 Rectangle IS A GeometricObject
																	    ^sub							^super
								
					A child/sub class can only inherit methods/attributes of ONE parent/(super)class
■ Some programming languages allow you to derive a subclass from several classes. This capability is known as 
multiple inheritance. Java, however, does not allow multiple inheritance. A Java class may inherit directly from only one 
superclass. This restriction is known as single inheritance. If you use the extends keyword to define a subclass, it allows 
only one parent class. Nevertheless, multiple inheritance can be achieved through interfaces, which will be introduced 
in Section 13.4.
 */

/* 11.3: USING THE SUPER KEYWORD (to call superclass' constructor or method)
 * The keyword super refers to the superclass and can be used to invoke the super-class’s methods and constructors.
 * 
 * A subclass inherits accessible data fields and methods from its superclass. Does it inherit constructors? 
 * Can the superclass’s constructors be invoked from a subclass? This section addresses these questions and their 
 * ramifications. Section 9.14, The this Reference, introduced the use of the keyword this to reference the calling object. 
 * The keyword super refers to the superclass of the class in which (keyword) super appears. It can be used in two ways:
■ To call a superclass constructor. 
■ To call a superclass method.
 */

/* 11.3.1: CALLING SUPERCLASS CONSTRUCTORS: (use when you wanna refer to parent constructor)
 * We know that a constructor is used to construct an instance of a class. 
 * Unlike properties and methods, the constructors of a superclass are not inherited by a subclass. 
 * They can only be invoked FROM the CONSTRUCTOR of the SUBclasses using the keyword super.
The syntax to call a superclass’s constructor is:
																							super(), or super(parameters);
				
	super() invokes the no-arg constructor of its superclass, 
	super (parameters) invokes the superclass constructor that matches the arguments. 
	^^^^^^^When you use keyword super to invoke constructors from the superclass, the keyword MUST BE the FIRST
	statement of the (subclass's) constructor.
	
	For example: The overloaded constructor in the Circle subclass can be written as:
public CircleFromSimpleGeometricObject (double radius, String color, boolean filled) 
{
this.radius = radius;												recall super keyword in constructor must be used first. 
setColor(color); 								======> super(color, filled);								//reffering back to parent class constructor
setFilled(filled);													this.radius = radius;								//radius is subclass' attribute
} 																		
			Very similar to using the this keyword. Here you use super (superclass attributeVar) to use superclass' constructor
 */

/* 11.3.2: CONSTRUCTOR CHAINING
 * A constructor may invoke an overloaded constructor or its superclass constructor. If neither is invoked explicitly, 
 * the compiler automatically puts super() as the first statement in the constructor. For example:
 *
 * public ClassName() 																	public ClassName ()
 * {												Equivalent										{
  	 some statements				============>							super();
	}																										some statements;
																											}
																											
		Meaning, constructing an instance of a class invokes the constructors of all the superclasses along the inheritance 
		chain. When constructing an object of a subclass, the subclass constructor first invokes its superclass constructor 
		before performing its own tasks. If the superclass is derived from another class, the superclass constructor invokes its 
		parent-class constructor before performing its own tasks. This process continues until the last constructor 
		along the inheritance hierarchy is called. This is called constructor chaining.
		Consider:
		public class Faculty extends Employee 
	{
		public static void main(String[] args) 									//main method
		{
			new Faculty();																		//constructing a faculty object
		}
		public Faculty()   												//faculty constructor here first gets invoked by creating obj^ but Faculty
		{																			extends Employee so it's a subclass of Employee, so we go to no-arg
		System.out.println("(4) Performs Faculty's tasks");  <= doesn't print first pass thru....				 	employee constructor
		}	 										
	}	

 class Employee extends Person 
 {
	public Employee() 
	{
	this("(2) Invoke Employee's overloaded constructor"); 								invokes overloaded constructor (2nd constructor)
	System.out.println("(3) Performs Employee's tasks ");
	}
	
	public Employee(String s) 
	{
 	System.out.println(s);									//2nd constructor now...but still doesn't do its task cuz Employee is a subclass of
 	}																		Person...So we now go to Person no-arg constructor
}

 class Person 
 {
	public Person() 
	{
 	System.out.println("(1) Performs Person's tasks");				//This is PErson's no-arg constructor and since it's the last class
 	}  																										in the chain (isn't a subclass of any other class), the task here is
 }																											performed first. And then we go back to the constructor we
																								came from (Employee 2nd constructor), then employee first const.
}																							and then finally back on Faculty where we began.

OUTPUT:
(1) Performs Person's tasks
(2) Invoke Employee's overloaded constructor
(3) Performs Employee's tasks
(4) Performs Faculty's tasks
  
  If a class is designed to be extended, it is better to provide a no-arg constructor to avoid programming errors. 
  Consider the following code:
 public class Apple extends Fruit 
 { 
 }

 class Fruit 
 {
 	public Fruit(String name) 
 	{
 	System.out.println("Fruit's constructor is invoked");
 	} 
 }
Since no constructor is explicitly defined in Apple, Apple’s default no-arg constructor is defined implicitly. 
Since Apple is a subclass of Fruit, Apple’s default constructor automatically invokes Fruit’s no-arg constructor. 
However, Fruit does not have a no-arg constructor, because Fruit has an explicit constructor defined (String). 
Therefore, the program cannot be compiled.		
BOTTOMLINE: define an explicit NO-ARG constructor in the parent class if you'll derive subclasses from it. 
Subclasses have implicitly defined (with keyword super()) constructors in them that invoke parent constructors.
The parent constructor itself doesn't have an implicit one, so you have to make it explicit. 
 */					

/* 11.3.3: CALLING SUPERCLASS METHODS
 * The keyword super can also be used to reference a method other than the constructor in the superclass. The syntax is:
																			super.method(parameters);
																			You could rewrite the printCircle() method in the Circle class as follows:
public void printCircle() 
{ 																				VVVusing meth from superclass to get the date (which is a superclass meth)
System.out.println("The circle is created " + super.getDateCreated() + " and the radius is " + radius); 
}
 */

public class _02_03_Super_Sub_classes
{

	public static void main(String[] args)
	{
		

	}

}
