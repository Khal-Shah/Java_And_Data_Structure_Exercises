package ch11notes;


/* Chapter 11.9: CASTING OBJECTS & THE INSTANCEOF OPERATOR
 * 
 * CASTING: One object reference can be typecast into another object reference. This is called casting object.
 * Recall in the previous section we used m(new Student());
 * 																			and the method: public static void m(Object x)
 * assigns the object new Student() to a parameter of the Object type. This statement is equivalent to: 
 * Object o = new Student();																									//implicit casting
 * m(o)				^Upcasting (casting an instance of a subclass to a refVar of a superclass)
 * 
 * The statement Object o = new Student(), known as implicit casting, is legal because an instance of Student is an 
 * instance of Object.
 * 
Suppose you want to assign the object reference o to a variable of the Student type using the following statement:
Student b = o; (o is not necessarily an instance of Student)
^refVar of subclass 

In this case a compile error would occur. Why does the statement Object o = new Student() work but Student b = o 
doesn’t? The reason is that a Student object is always an instance of Object, but an Object is not necessarily an instance 
of Student. Even though you can see that o is really a Student object, the compiler is not clever enough to know it. 
To tell the compiler that o is a Student object, use explicit casting. 
The syntax is similar to the one used for casting among primitive data types. 
Enclose the target object type in parentheses and place it before the object to be cast, as follows:
  Student b = (Student) o; 																										// Explicit casting
  
  It is always possible to cast an instance of a subclass to a variable of a superclass (known as UPCASTING), 	<===
  because an instance of a subclass is always an instance of its superclass (Ex: Object o = new Student() )
  
  When  casting an instance of a superclass to a variable of its subclass (known as DOWNCASTING), explicit casting 
  must be used to confirm your intention to the compiler with the (SubclassName) cast notation. 
  Ex: Student b = (Student) o 			(b is var of subclass...o is instance of superclass)
  								^^casting o 
  For the casting to be successful, you must make sure that the object to be cast is an instance of the subclass. 
  If the superclass object is not an instance of the subclass, a runtime ClassCastException occurs. 
  
  UPCASTING: object to be cast is a subclass of variable's declared type.
  DOWNCASTING: object to be cast is a superclass of variable's declared type. 
  
  For example, if an object is not an instance of Student, it cannot be cast into a variable of Student. It is a good practice, 
  therefore, to ensure that the object is an instance of another object before attempting a casting. 
  This can be accomplished by using the INSTANCE OF OPERATOR. 
  Consider the following code:
  
  vvvimplicit casting/upcasting
  Object myObject = new Circle();			recall The declared type of refVar decides which method to match at compile time
  //lines of codes...
   * * Perform casting if myObject is an instance of Circle  
   * if (myObject instanceof Circle) 
   * {																						
	System.out.println("The circle diameter is " + ((Circle)myObject).getDiameter());
		... 
	  }
	  
	  You may be wondering why casting is necessary. The variable myObject is declared Object. The declared type 
	  decides which method to match at compile time. Using myObject.getDiameter() would cause a compile error, 
	  because the Object class does not have the getDiameter method. The compiler cannot find a match for 
	  myObject.getDiameter(). Therefore, it is necessary to cast myObject into the Circle (actual) type to tell the compiler 
	  that myObject is also an instance of Circle.
	Why not define myObject as a Circle type in the first place? To enable generic programming, it is a good practice to 
	define a variable with a supertype, which can accept an object of any subtype.
	
	To help understand casting, you may also consider the analogy of fruit, apple, and orange, with the Fruit class as the 
	superclass for Apple and Orange. An apple is a fruit, so you can always safely assign an instance of Apple to a variable 
	for Fruit. However, a fruit is not necessarily an apple, so you have to use explicit casting to assign an instance of Fruit to 
	a variable of Apple.
	
	casting an object reference does not create a new object. For example:
Object o = new Circle();
Circle c = (Circle)o; // No new object is created
precedes casting
 Now reference variables o and c point to the same object.
 */

/* Chapter 11.10: THE OBJECT'S EQUALS METHOD
 * Like the toString() method, the equals(Object) method is another useful method defined in the Object's class.
 * Another method defined in the Object class that is often used is the equals method. It signature is
															public boolean equals(Object o)
	This method tests whether two objects are equal. The syntax for invoking it is:
  															object1.equals(object2);
The default implementation of the equals method in the Object class is:
public boolean equals(Object obj) 
{ 
return (this == obj);
}

This implementation checks whether two reference variables point to the same object using the == operator. 
You should override this method in your custom class to test whether two distinct objects have the same content.
You have already used the equals method to compare two strings (The String Class). The equals method in the 
String class is inherited from the Object class and is overridden in the String class to test whether two strings are 
identical in content.

You can override the equals method in the Circle class to compare whether two circles are equal based on their radius as follows:
public boolean equals(Object o) 
{ 
if (o instanceof Circle)
return radius == ((Circle)o).radius; 
else
return this == o; 
}

									***CHECK THIS METHOD IN CIRCLEFROMGEOMETRICOBJECT CLASS and driver in castingdemo
 */

public class _09_10_CastingObj_instanceOf_ObjEquals
{

	public static void main(String[] args)
	{
		
	}

}
