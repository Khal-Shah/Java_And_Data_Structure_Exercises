package ch9notes;

public class Ch9_11_12_ObjArray_ImmutableObj
{

	public static void main(String[] args)
	{
		/* 9.11: ARRAY OF OBJECTS:
		 * An array can hold objects as well as primitive type values.
		 Chapter 7, Single-Dimensional Arrays, described how to create arrays of primitive type elements. 
		 You can also create arrays of objects. For example, the following statement declares and creates an array of ten 
		 Triangle objects:
		 */
		
		//class [] refVar = new class [size/how many objects]
		//Triangle [] triangleArray = new Triangle [10];
		//can initialize using for loop
	//	for (int i = 0; i < 10; i++)
		{
		//	triangleArray [i] = new Triangle ();								//creates 10 objects of Triangle class
		}
		/*An array of objects is actually an array of reference variables. (In an array of objects, an element of the array 
		 * contains a reference to an object.)
		 * So, invoking triangleArray[x]. getArea() involves two 
		 * levels of referencing (triangleArray ---> triangleArray [x] -----> Triangle object x. 
		 * triangleArray references the entire array; triangleArray[x] references a Triangle object.
		 */
		
		/* Following gives an example that demonstrates how to use an array of objects. The program summarizes the areas of 
		 * an array of triangles. The program creates triangleArray, an array composed of five Triangle objects; it then initializes 
		 * triangle base and height with random values and displays the total area of the triangle in the array.
		 */
		//Class [] refName = new Class [# of objects]
		Triangle [] triangleArray;	//we won't create it here cuz we wanna use a method to create it
		triangleArray = createTriangleArray ();
		
		// Print triangleArray and total areas of the triangles
		printTriangleArray (triangleArray); //send it the array in parameter so method can use it to print
		
	}
	
	//Create an array of Triangle objects */					vvint/double												vpublic static		v returns arr Obj
			//for primitive array you'd use public static type [] methName ()....for array of objects: className [] methName
	public static Triangle [] createTriangleArray ()
	{
		Triangle [] triangleArray = new Triangle [5];
		
		for (int i = 0; i < triangleArray.length; i++)						//you have to initialize the objects:
		{																	//each object gets two parameters from 0-10 (base n height) 
			triangleArray [i] = new Triangle (Math.random() * 10, Math.random() * 10);
		};
		return triangleArray;
	}
	
	//Add triangle areas 
	public static double sum (Triangle [] triangleArray)		//pass the array of objects so it can compute sum of all objects
	{
		double sum = 0;
		
		for (int i = 0; i < triangleArray.length; i++)
		{
			sum += triangleArray[i].getArea();		//gets the area of each object based on the random base & height they
		}																		//were given when each object was initialized in the for loop 
		return sum;
	}
	
	
	public static void printTriangleArray (Triangle [] triangleArray)
	{
		System.out.println("Base\t\t\tHeight\t\t\tArea");
		
		for (int i = 0; i < triangleArray.length; i++)
		{
		System.out.printf("%-28.2f %-28.2f %-28.2f\n", triangleArray[i].getBase(), triangleArray[i].getHeight(), 
				triangleArray[i].getArea());
		}
		System.out.println("--------------------------------------------------------------------");
		System.out.println("The total areas covered by the " + triangleArray.length + " objects in  the triangle array is "
				+ sum(triangleArray));
		System.out.println("The total object created is " + Triangle.getNumberOfObjects());
	}
	
	
	//think CLASS in place of TYPE for array of Objects

}

class Triangle
{
	private double base;			
	private double height;
	private static int objectCreated = 0;
	
	Triangle ()
	{
		 base = 1;
		 height = 1;
		objectCreated++;
	}
	
	Triangle (double newBase, double newHeight)
	{
		base = newBase;
		height = newHeight;
		objectCreated++;
	}
	
	public void setBase (double newBase)
	{
		base = ((newBase >= 0)? newBase : 0);
	}
	
	public double getBase ()
	{
		return base;
	}
	
	public void setHeight (double newHeight)
	{
		height = ((newHeight >= 0)? newHeight : 0);
	}
	
	public double getHeight ()
	{
		return height;
	}
	
	public double getArea ()
	{
		return ((base * height) / 2.0);
	}
	
	public static int getNumberOfObjects ()
	{
		return objectCreated;
	}
	
}

/*9.12:  IMMUTABLE OBJECTS AND CLASSES:		(removing mutator/setter methods make data unchangeable after 
 * creation)
 * You can define immutable classes to create immutable objects. The contents of immutable objects cannot be changed.
 * Normally, you create an object and allow its contents to be changed later. However, occasionally it is desirable to create 
 * an object whose contents cannot be changed once the object has been created. We call such an object as immutable 
 * object  and its class as immutable class. 
 *  If you deleted the two setter methods (setBase & setHeight) in the above Triangle class, then the class would be 
 *  immutable, because base and height are private and cannot be changed without their respective setter methods.
 *  
 *  For a class to be immutable, it must meet the following requirements:
■ All data fields must be private.
■ There can’t be any mutator (set) methods for data fields.
■ No accessor methods can return a reference to a data field that is mutable.
^^^for instance an object of the Date/Random/Math class, cuz then we'd be able to use Date.meth or Math.meth to 
change val
 */
 
