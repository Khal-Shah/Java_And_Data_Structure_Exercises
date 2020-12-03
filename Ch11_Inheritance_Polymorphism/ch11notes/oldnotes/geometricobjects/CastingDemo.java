package ch11notes.oldnotes.geometricobjects;


public class CastingDemo
{

	public static void main(String[] args)
	{
		
		/* The program uses implicit casting to assign a Circle object to object1 and a Rectangle object to object2, then 
		 * invokes the displayObject method to display the information on these objects.
		 */
		Object object1 = new CircleFromGeometricObject(1);
		Object object2 = new RectangleFromGeometricObject(1,1);
		/*	Why not define object as a Circle (declared) type in the first place? To enable generic programming, it is a good 
		 * practice to define a variable with a supertype, which can accept an object of any subtype.
		 */
		
		Object object3 = new CircleFromGeometricObject(3);
																			//v   what gets thrown to method
		System.out.println(object1.equals(object3));
		
		//display circle and rectangle
		displayObject(object1);
		displayObject(object2);

	}
																	//supertype
	public static void displayObject (Object object)
	{
		/*This operator is used only for object reference variables. The operator checks whether the object is of a 
		 * particular type (class type or interface type). instanceof operator is written as:
																									(Object reference variable) instanceof  (class/interface type)
If the object referred by the variable on the left side of the operator passes the "IS-A" check for the class/interface type 
on the right side, then the result will be true.
		 */
		if (object instanceof CircleFromGeometricObject)
		{														//target class
			System.out.println("The circle area is " + ((CircleFromGeometricObject) object).getArea());		//polymorphic call
			System.out.println("The circle diameter is " + ((CircleFromGeometricObject) object).getDiameter());
			
			//Explicit casting to Circle and to Rectangle is necessary because the getArea and 
			//getDiameter methods are not available in the Object class.
		}
		
		/* Casting can be done only when the source object is an instance of the target class. The program uses the 
		 * instanceof operator to ensure that the source object is an instance of the target class before performing a casting 
		 */
		else if (object instanceof RectangleFromGeometricObject)
		{
			System.out.println("The rectangle area is " + ((RectangleFromGeometricObject) object).getArea());
																	/*The object member access operator (.) precedes the casting operator. 
																	 * Use parentheses to ensure that casting is done before the . operator, as in
                   																		((Circle)object).getArea();	 (casting b4 accessing)*/
		}
	}
	
	/* You may be wondering why casting is necessary. The variable object (1 and 2) is declared Object. The declared type 
	  decides which method to match at compile time. Using object.getDiameter() would cause a compile error, 
	  because the Object class does not have the getDiameter method. The compiler cannot find a match for 
	  object.getDiameter(). Therefore, it is necessary to cast object into the Circle (actual) type to tell the compiler 
	  that object is also an instance of Circle.
	  
	  casting an object reference does not create a new object. For example:
Object o = new Circle();
Circle c = (Circle) o; 						// No new object is created
 Now reference variables o and c point to the same object.	 
	 */

}

/* Output:
 * The circle area is 3.141592653589793
The circle diameter is 2.0
The rectangle area is 1.0
*/