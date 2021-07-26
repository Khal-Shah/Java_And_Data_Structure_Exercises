package ch9notes;

/* 9.7: STATIC VARIABLES, CONSTANTS AND METHODS
A static variable is shared by all objects of the class. A static method cannot access instance members of the class.
 * 
 * The data field radius in the circle class is an instance variable, it is NOT tied to a specific instance of the class...Meaning,
 * it is not shared among objects of the same class. 
 * If you create 2 objects called circle1 and circle2, the radius (that you passed to constructor) of circle2 is independent 
 * of radius of circle1
 * 
 * If you want all the instances (objects) of a class to share data, use static variables, also known as class variables.
 * if one object changes the value of a static variable, all objects of the same class are affected. Java supports static 
 * methods as well as static variables. Static methods can be called without creating an instance of the class.
 */

public class Ch9_07_08_StaticVars_VisibilityModifiers
{
	/* CONSTANTS: 
	 * Constants in a class are shared by all objects of the class. Thus, constants should be declared as final static. 
	 * For example, the constant PI in the Math class is defined as:
		final static double PI = 3.14159265358979323846;
	 */

	public static void main(String[] args)
	{
		System.out.println("Before creating objects, the number of circle objects is: " + 
				CircleWithStaticMembers.numberOfObjects);
		
		//create 1st object
		CircleWithStaticMembers c1 = new CircleWithStaticMembers ();
		
		System.out.println("After creating c1, radius is " + c1.radius + " and number of objects created is " + 
				CircleWithStaticMembers.getNumberOfObjects());		//could also use c1.getNumberOfObjects
		
		CircleWithStaticMembers c2 = new CircleWithStaticMembers (10);
		
		System.out.println("After creating c2, radius is " + c2.radius + " and number of objects created is " + 
				c2.getNumberOfObjects());					//could also use c1.getNumber....same data for all obj
		
		c1.radius = 9;
		
		
		System.out.println("After creating c1, c2 and modifying c1, c1's radius is " + c1.radius + " and number of objects"
				+ " created is " + CircleWithStaticMembers.numberOfObjects);
													//^^coulda also used Class.getNumberOfObjects() which just returns numberOfObjects
		
		/* Convention:
		 * Use ClassName.methodName(arguments) to invoke a static method and ClassName.staticVariable to access a 
		 * static variable. This improves readability, because this makes the static method and data easy to spot.
		 */
		
		/* 9.8: VISIBILITY MODIFIERS: Visibility modifiers can be used to specify the visibility of a class and its members.
		 * You can use the public visibility modifier for classes, methods, and data fields to denote that they can be accessed 
		 * from any other classes. If no visibility modifier is used, then by default they're public.
		 * 
		 * TIP: Packages can be used to organize classes. To do so, you need to add the following line as the first 
		 * noncomment and nonblank statement in the program:
																													package packageName;
																													
			In addition to public, Java provides the private and protected (Ch 11) modifiers for class members. 
			This section introduces the private modifier...
			The private modifier makes methods and data fields accessible ONLY from within its own class. 
			
			package p1;
public class C1 
{ public int x; 
int y;												If a class is not defined as public, it can be accessed only within the same package. 
private int z;

public void m1() { 
}
void m2() {												same package accessible only
}
private void m3() {
}

}

package p1;
public class C2 { 
void aMethod() {
C1 o = new C1(); 
can access o.x; can access o.y; cannot access o.z;
    can invoke o.m1();
    can invoke o.m2();
    cannot invoke o.m3();
} 
}

package p2;
public class C3 { 
void aMethod() {
C1 o = new C1(); 
can access o.x; 
cannot access o.y; 																		(not the same package)
cannot access o.z;
    can invoke o.m1();
    cannot invoke o.m2();
    cannot invoke o.m3();
} 
}
The private modifier restricts access to its defining class, 
the default modifier restricts access to a package, 
and the public modifier enables unrestricted access.

Caution
The private modifier applies only to the members of a class. The public modifier can apply to a class or members of a 
class. Using the modifiers public and private on local variables would cause a compile error.

In most cases, the constructor should be public. However, if you want to prohibit the user from creating an instance of a 
class, use a private constructor. For example, there is no reason to create an instance from the Math class, 
because all of its data fields and methods are static

		 */
		
	}

}


/* Let’s modify the Circle class by adding a static variable numberOfObjects to count the number of circle objects created.
 * the instance methods getRadius, setRadius, and getArea, and the static method getNumberOfObjects
 */

class CircleWithStaticMembers
{
	double radius;											//not shared by all objects
	
	// (the number of objects created)
	static int numberOfObjects = 0;					//shared by all objects
	
	CircleWithStaticMembers ()
	{
		radius = 1;														//default
		numberOfObjects++;			//anytime an object is created (w/o passing parameter), this constructor will get triggered
	}
	
	CircleWithStaticMembers (double newRadius)
	{
		radius = newRadius;			//this constructor will get triggered when an arg is passed during object creation
		numberOfObjects++;
	}
	
	public double getRadius ()
	{
		return (radius);
	}
	
	public void setRadius (double newRadius)
	{
		radius = newRadius;
	}
	
	public double getArea ()
	{
		return (radius * radius * Math.PI);
	}
	
	public static int getNumberOfObjects ()
	{
		return numberOfObjects;
	}
	
	/* Instance methods (e.g., getArea()) and instance data (e.g., radius) belong to instances and can be used only after 
	 * the instances are created. They are accessed via a reference variable.
	 * Static methods (e.g., getNumberOfObjects()) and static data (e.g., numberOfObjects) can be accessed from a 
	 * reference variable or from their class name.
	 * 
	 * An instance method can invoke an instance or static method and access an instance or static data field. 
	 * A static method can invoke a static method and access a static data field. However, a static method cannot 
	 * invoke an instance method or access an instance data field, since static methods and static data fields don’t 
	 * belong to a particular object.
	 * 
	 * A variable or a method that is not dependent on a specific instance of the class should be a static variable or 
	 * method. For example, every circle has its own radius, so the radius is dependent on a specific circle. Therefore, 
	 * radius is an instance variable of the Circle class. Since the getArea method is dependent on a specific circle, it is 
	 * an instance method. 
	 */
	
}
