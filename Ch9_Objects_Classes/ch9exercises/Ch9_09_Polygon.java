package ch9exercises;

/* Chapter 9 - Exercise 9:
 * (Geometry: n-sided regular polygon) In an n-sided regular polygon, all sides have the same length and all angles 
 * have the same degree (i.e., the polygon is both equilateral and equiangular). 
 * 
 * Design a class named RegularPolygon that contains:
■ A private int data field named n that defines the number of sides in the polygon with default value 3.
■ A private double data field named side that stores the length of the side with default value 1.
■ A private double data field named x that defines the x-coordinate of the poly- gon’s center with default value 0.
■ A private double data field named y that defines the y-coordinate of the poly- gon’s center with default value 0.
■ A no-arg constructor that creates a regular polygon with default values.
■ A constructor that creates a regular polygon with the specified number of sides and length of side, centered at (0, 0).
■ A constructor that creates a regular polygon with the specified number of sides, length of side, and x- and y-coordinates.
■ The accessor and mutator methods for all data fields.
■ The method getPerimeter() that returns the perimeter of the polygon.
■ The method getArea() that returns the area of the polygon. The formula for

computing the area of a regular polygon is Area = n * s^2 / 4 tan (pi/n)

Draw the UML diagram for the class and then implement the class. Write a test program that creates three RegularPolygon 
objects, created using the no-arg constructor, using RegularPolygon(6, 4), and using RegularPolygon(10, 4, 5.6, 7.8). 
For each object, display its perimeter and area.
 */

class RegularPolygon
{
	private int n;				//default 3
	private double side;				//1
	private double x;					//0
	private double y;					//0
	
	RegularPolygon()
	{
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}
	
	RegularPolygon (int n, double side)
	{
		//this();				<= could put that instead of doing this for each attribute/data?
		this.n = n;
		this.side = side;
	}
	
	RegularPolygon (int n, double side, double x, double y)
	{//sends to the constructor with n and side as its parameter (above one)
		this (n, side);			//the already defined n and side of the object (previous constructor)
		this.x = x;
		this.y = y;
	}
	
	//mutators:
	
	public void setN (int n)
	{
		this.n = n;
	}
	
	public void setSide (double side)
	{
		this.side = side;
	}
	
	public void setX (double x)
	{
		this.x = x;
	}
	
	public void setY (double y)
	{
		this.y = y;
	}
	
	//accessors:
	
	public int getN()
	{
		return n;
	}
	
	public double getSide()
	{
		return side;
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public double getPerimeter()
	{
		return (n * side);
	}
	
	public double getArea()
	{
		return ((n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n)));
	}
	
	
}

public class Ch9_09_Polygon
{

	public static void main(String[] args)
	{
		RegularPolygon polygon1 = new RegularPolygon (6, 4);
		RegularPolygon polygon2 = new RegularPolygon (10, 4, 5.6, 7.8);
		RegularPolygon polygon3 = new RegularPolygon ();
		
		System.out.println("Polygon1's perimeter: " + polygon1.getPerimeter() + "\nPolygon1's area " + polygon1.getArea());
	System.out.println("\nPolygon2's perimeter: " + polygon2.getPerimeter() + "\nPolygon2's area " + polygon2.getArea());
	System.out.println("\nPolygon3's perimeter: " + polygon3.getPerimeter() + "\nPolygon3's area " + polygon3.getArea());
	}

}
