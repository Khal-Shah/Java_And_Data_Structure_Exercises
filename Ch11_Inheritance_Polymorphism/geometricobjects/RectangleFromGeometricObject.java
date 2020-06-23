package geometricobjects;

/* The Rectangle class inherits all accessible data fields and methods from the GeometricObject class. In addition, it has 
 * the data fields width and height and their associated getter and setter methods. It also contains the getArea() and 
 * getPerimeter() methods for returning the area and perimeter of the rectangle.
 * 
 * -width: double
-height: double
+Rectangle()
+Rectangle(width: double, height: double)
+Rectangle(width: double, height: double color: String, filled: boolean)
+getWidth(): double
+setWidth(width: double): void
+getHeight(): double
+setHeight(height: double): void
+getArea(): double
+getPerimeter(): double
 
 */

public class RectangleFromGeometricObject extends GeometricObject
{
	private double width;
	private double height;
	
	public RectangleFromGeometricObject()
	{
	}
	
	public RectangleFromGeometricObject (double width, double height)
	{
		this.width = width;
		this.height = height;
	}
	
	public RectangleFromGeometricObject (double width, double height, String color, boolean filled)
	{
		this (width, height);						//This is an overloaded constructor
		setColor (color);							//you can't use this.color = color cuz remember color attribute is private (so can only
		setFilled (filled);							//be accessed/changed through setters.
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public void setWidth (double width)
	{
		this.width = width;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setHeight (double height)
	{
		this.height = height;
	}
	
	public double getArea()
	{
		return (width * height);
	}
	
	public double getPerimeter()
	{
		return (width + height + width + height);
	}
	
}
