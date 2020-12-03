package ch11notes.oldnotes.geometricobjects;

/* The main method creates objects of Circle and Rectangle and invokes the methods on these objects.
 * The toString() method is inherited from the GeometricObject class and is invoked from a Circle object and a Rectangle 
 * object
 *  
 */
public class Circle_Rectangle_Driver
{

	public static void main(String[] args)
	{
		CircleFromGeometricObject circle = new CircleFromGeometricObject(1);		//I wanna give it radius 1
		
		RectangleFromGeometricObject rectangle = new RectangleFromGeometricObject(2, 4);
		
		//System.out.println("Circle was created on " + circle.toString() + "The radius is " + circle.getRadius() + " and the area"
				//+ " is " + circle.getArea() + "\nThe diameter is " + circle.getDiameter());
		
		System.out.println("Circle " + circle.toString());
		
		rectangle.setColor("black");
		
		System.out.println("\nRectangle was created on " + rectangle.toString() + "The area is " + rectangle.getArea() +
				" and the perimeter is " + rectangle.getPerimeter());
		
		displayObject(new CircleFromGeometricObject(1, "red", false));

	}
	
	public static void displayObject(GeometricObject object)
	{
		System.out.println("Created on " + object.getDateCreated() + "\nColor is " + object.getColor());
	}

}
