package ch11notes.oldnotes;

/* Chapter 11.7: POLYMORPHISM:
 * Polymorphism means that a variable of a supertype can refer to a subtype object.
     The three pillars of object-oriented programming are encapsulation, inheritance, and polymorphism. 
      This section introduces polymorphism.
Two useful terms: subtype and supertype. 
A class defines a type. A type defined by a subclass is called a subtype, 
and a type defined by its superclass is called a supertype. 
Therefore, you can say that Circle is a subtype of GeometricObject and GeometricObject is a supertype for Circle.

A subclass is a specialization of its superclass; every instance of a subclass is also an instance of its superclass, 
but not vice versa. For example, every circle is a geometric object, but not every geometric object is a circle. 
Therefore, you can always PASS AN INSTANCE OF A SUBCLASS TO A PARAMETER OF ITS SUPERCLASS TYPE.  
Consider the code below

In main:						//creating a new subtype/subclass object and passing it
displayObject (new CircleFromGeometricObject(1, "red", false));
								^instance of a subclass
								
In static:										//vParameter of supertype (recall IS A relationship...a subtype IS A supertype so it can accept)
public static void displayObject (GeometricObject object) 	<= super class object so it can accept any subclass instance
	{
		System.out.println("Created on " + object.getDateCreated() + "\nColor is " + object.getColor());
	}
	
	The method displayObject takes a parameter of the GeometricObject type. You can invoke displayObject by passing 
	any instance of GeometricObject (e.g., new CircleFromGeometricObject(1, "red", false) and 
	new Rectangle FromSimpleGeometricObject(1, 1, "black", false). 
	An object of a subclass can be used wherever its superclass object is used/expected. 
																																						
	This is commonly known as polymorphism (from a Greek word meaning “many forms”). In simple terms, 
	polymorphism means that a variable of a supertype can refer to a subtype object.
 */

/* In a nutshell, Polymorphism means, if you have a subclass from a superclass, you can always use the subclass 
 * anywhere where you'd normally use the superclass.
 * So you save yourself the trouble of making each type of object: Tuna tunaObj = new Tuna () etc
		//You just have to make sure the referenceVar is of the superclass type. 
 */

/* 11.8: DYNAMIC BINDING
 * A method can be implemented in several classes along the inheritance chain. The JVM decides which method is 
 * invoked at runtime.
 * 
 * A method can be defined in a superclass and overridden in its subclass. For example, the toString() method is defined 
 * in the Object (by default) class and overridden in GeometricObject. Consider the following code:
 * 
 declared T				actual T
Object o = new GeometricObject(); 
System.out.println(o.toString());

Which toString() method is invoked by o? The one from (default/implicit) Object Class or the one from Geometric Class?
We first have to introduce two terms: DECLARED TYPE.....&....ACTUAL TYPE
A variable must BE declared A type. The type that declares a variable is called the variable’s declared type. 	<===
Here o’s declared type is Object. 
A variable of a reference type can hold a null value or a reference to an INSTANCE OF the declared type. 
The instance may be created using the constructor of the declared type or its subtype. 

The actual type of the variable is the actual class for the object referenced by the variable. Here o’s actual type is 
GeometricObject, because o references an object created using new GeometricObject(). Which toString() method is 
invoked by o is determined by o’s actual type. This is known as dynamic binding.

Ex:
Suppose an object o is an instance of classes C1, C2, . . . , Cn-1,and Cn, where C1 is a subclass of C2, C2 is a subclass of 
C3,...,and Cn-1 is a subclass of Cn. That is, Cn is the most general class, and C1 is the most specific class. In Java, Cn is the 
Object class. If o invokes a method p, the JVM searches for the implementation of the method p in C1, C2, . . . , Cn-1, and 
Cn, in this order, until it is found. Once an implementation is found, the search stops and the first-found 
implementation is invoked.
So when you have the same method in many subclasses and main classes. When you call a method, it'll go from most 
most specific to least (subclasses to super).

Matching a method signature and binding a method implementation are two separate issues. The declared type of the 
reference variable decides which method to match at compile time. The compiler finds a matching method according 
to the parameter type, number of parameters, and order of the parameters at compile time. 
A method may be implemented in several classes along the inheritance chain. The JVM dynamically binds the 
implementation of the method at runtime, decided by the actual type of the variable.
 */


public class _07_08_Polymorphism_Binding
{

	public static void main(String[] args)
	{
		m(new GraduateStudent());	//we're not passing declared or actual variable type, but rather a new instance
		m(new Student());					//object of a Class (w/o a reference var/type).
		m(new Person());
		m(new Object());
	}
	
	public static void m(Object x)
	{
		System.out.println(x.toString());
		/* Since everything is a subclass of Object, we can throw in any instance of any Class here. 
		 * Recall JVM looks for from the least specific to the most in that order.
		 * The invokation of method (which one) is determined by x's actual type at runtime. 
		 * 1) First it throws an instance of GraduateStudent, but there are no methods in that class, so then it looks for its parent
		 * class Student...thus prints "Student"... (x's actual type is GraduateStudent)
		 * 
		 * 2) Passes an instance of the Student class, looks to invoke the Student toString and does..."Student"
		 * 3) Passes an instance of Person class...so it invokes method in Person class and prints "Person"
		 * 4) We haven't defined any method in object, it's the main superclass...it'll print java.lang.Object@hexMemory
		 */
	}

}

class GraduateStudent extends Student
{
	
}


class Student extends Person
{
	@Override
	public String toString() 
	{
		return "Student";
	}
}

class Person extends Object
{
	@Override
	public String toString()
	{
		return "Person";
	}
}

//Main takeaway...SUBCLASS TO SUPERCLASS invokation of methods (most specific to least)
