package ch11notes.oldnotes;

/* Chapter 11.4: OVERRIDING METHODS: (super.toString())
 * To override a method, the method must be defined in the subclass using the same signature and the same return type 
 * as in its superclass.
 * A subclass inherits methods from a superclass. Sometimes it is necessary for the subclass to modify the implementation 
 * of a method defined in the superclass. This is referred to as method overriding
 * 
 * For example, in our GeometricObject class, we have the toString method:
 * public String toString()
		{
		return ("Created on " + getDateCreated() + ". Color: " + getColor() + ((isFilled())? ". It is filled\n" : " It is not filled.\n"));
		}
		
		After we created our circle class, we have the additional info of Radius to return as a toString along with the info^^^
		above from its superclass. So what we'd do is invoke the super toString from within Circle's (newly created) toString
		and then add in the new info:
		In circle class:
		public String toString()							<===Has to have the same name
		{
		return (super.toString() + "\nAnd The radius is " + radius);
		}
		^^^This invokes the superclass (GeometricObj) toString method and adds on a new piece of info particular to this 
		class
		
		=> An instance method can be overridden only if it is accessible. Thus a private method can not be overridden, 
		because it is not accessible outside its own class. If a method defined in a subclass is private in its superclass, the two 
		methods are completely unrelated......Meaning, if method is private in superclass, can't override/invoke it. 
		
		Like an instance method, a static method can be inherited. However, a static method cannot be overridden. 
		If a static method defined in the superclass is redefined in a subclass, the method defined in the superclass is hidden. 
		The hidden static methods can be invoked using the syntax SuperClassName.staticMethodName.
 */

/* 11.5: OVERRIDING VS OVERLOADING:
 * Overloading means to define multiple methods with the same name but different signatures. Overriding means to 
 * provide a new implementation for a method in the subclass.
 * To override a method, the method must be defined in the subclass using the same signature and the same return type.
 * 
 * Overloading: horizontal, methods with the same name but different parameters/arguments at the SAME level within
 * a class. (Same name, different arguments). It'll be invoked based on the type of argument you pass it (it'll match). 
 * 
 * Overriding: vertital, methods with the same name and signature at different levels within an inheritance hierarchy. 
 * Overriding Example: 
 * 
 * public class Test 
{
	public static void main(String[] args) 
	{
	A a = new A(); 
	a.p(10); 
	a.p(10.0);
	} 
}

class B 
{
	public void p(double i) 
	{
	System.out.println(i * 2); 
	}
}	

class A extends B 
{
// This method overrides the method in B 
 * public void p(double i)
 * {
    System.out.println(i);
  	}
}
the method p(double i) in class A overrides the same method defined in class B.
both a.p(10) and a.p(10.0) invoke the p(double i) method defined in class A to display 10.0.
Since you built it from class A and called it, it'll OVERRIDE the method with the same name from class B
(don't think about constructor (implicit super) chaining here. These are methods.

Overloading example:
public class Test 
{
	public static void main(String[] args) 
	{
	A a = new A(); 
	a.p(10); 
	a.p(10.0);
	} 
}

class B 
{
	public void p(double i) 
	{
	System.out.println(i * 2); 
	}
}

class A extends B 
{
// This method overloads the method in B 
 * 	public void p(int i) 
 * {
    System.out.println(i);
  }
 }
 class A has two overloaded methods: p(double i) and p(int i). The method p(double i) is inherited from B.
 a.p(10) invokes the p(int i) method defined in class A to display 10, and a.p(10.0) invokes the p(double i) method defined 
 in class B to display 20.0.
 
 ■ Overridden methods are in different classes related by inheritance; overloaded methods can be either in the same 
 class or different classes related by inheritance.
■ Overridden methods have the same signature and return type; overloaded methods have the same name but a different 
parameter list.

To avoid mistakes, you can use a special Java syntax, called override annotation, to place @Override before the method 
in the subclass. For example:
public class CircleFromSimpleGeometricObject extends SimpleGeometricObject
 { 
 // Other methods are omitted
 @Override
	public String toString() 
	{
	return (super.toString() + "\nradius is " + radius);
	}
}
This annotation denotes that the annotated method is required to override a method in the superclass. 
If a method with this annotation does not override its superclass’s method, the compiler will report an error.For example,
if toString is mistyped as tostring, a compile error is reported. If the override annotation isn’t used, the compile won’t 
report an error. Using annotation avoids mistakes.
 */

/* 11.6: THE OBJECT CLASS AND ITS TOSTRING() METHOD
 * Every class in Java is descended from the java.lang.Object class.
 * If no inheritance is specified when a class is defined, the superclass of the class is Object by default. 
 * For example, the following two class definitions are the same:
 * public class ClassName													public class ClassName extends Object
 * {														=======>				{
 * }																							}
 * 
 *The public String toString() method for example is a method of the parent Object class
 *
 *You can also pass an object to invoke System.out.println(object) or System.out.print(object). 
 *This is equivalent to invoking System.out .println(object.toString()) or System.out.print(object. toString()). 
 *Thus, you could replace System.out.println(loan .toString()) with System.out.println(loan).
 */
public class _04_05_06_Overriding_Overloading_ObjClass
{

	public static void main(String[] args)
	{

	}

}
