package geometricobjects;

/* The Circle class inherits all accessible data fields and methods from the GeometricObject class. In addition, it has a 
 * new data field, radius, and its associated getter and setter methods. The Circle class also contains the getArea(), 
 * getPerimeter(), and getDiameter() methods for returning the area, perimeter, and diameter of the circle.
 * 
 * -radius: double
+Circle()
+Circle(radius: double)
+Circle(radius: double, color: String, filled: boolean)
+getRadius(): double
+setRadius(radius: double): void
+getArea(): double
+getPerimeter(): double
+getDiameter(): double
+printCircle(): void
 * 
 */
public class CircleFromGeometricObject extends GeometricObject
{
	private double radius;
	
	public CircleFromGeometricObject()
	{
	}
	
	public CircleFromGeometricObject (double radius)
	{
		this.radius = radius;
	}
	
	//+Circle(radius: double, color: String, filled: boolean)
	
	public CircleFromGeometricObject (double radius, String color, boolean filled)
	{
		this.radius = radius;										//Overloaded constructor
		setColor(color);												//check overloaded constructor of rectangle class for explanation
		setFilled(filled);
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius (double radius)
	{
		this.radius = radius;
	}
	
	public double getArea()
	{
		return (radius * radius * Math.PI);
	}
	
	public double getPerimeter()
	{
		return (Math.PI * getDiameter());
	}
	
	public double getDiameter()
	{
		return (radius * 2);
	}
	
	public void printCircle()
	{
		System.out.println("The circle is created on " + getDateCreated() + ". It has a radius of " + getRadius());
	}
	
	public String toString()
	{
		return (super.toString() + "And the radius is " + radius + ". while the area is " + getArea());
	}
	//object1 radius = 1, object3 radius = 3
	//Used object1.equals(object3) in castingdemo (so object3 is what gets thrown into the Parameter of this method
	//and object 1 is the "this" object. 
	//You can override the equals method in the Circle class to compare whether two circles are equal based on their radius
	public boolean equals (Object o)
	{
		if (o instanceof CircleFromGeometricObject)
		{
			System.out.println(((CircleFromGeometricObject) o).getRadius());		//would print radius of object 3
			System.out.println(this.getRadius());	//prints 1
			//return (((CircleFromGeometricObject) o).getRadius() == this.getRadius());
			//Could also do:
			return (radius == ((CircleFromGeometricObject) o).radius);		//radius 1 is the "this/in-Class" object (obj1.equ)
		}
		else
		{
			return false;		//Or....return this == o;
		}
		/* Using the signature equals(SomeClassName obj) (e.g., equals(Circle c)) to override the equals method in a 
		 * subclass is a common mistake. You should use equals(Object obj).
		 * 																								^grand super class
		 */
	}

}
