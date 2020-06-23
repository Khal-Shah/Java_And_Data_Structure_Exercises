package geometricobjects;
import java.util.Scanner;

/* Chapter 11 - Exercise 1
 * (The Triangle class) Design a class named Triangle that extends GeometricObject. The class contains:
■ Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.
■ A no-arg constructor that creates a default triangle.
■ A constructor that creates a triangle with the specified side1, side2, and side3.
■ The accessor methods for all three data fields.
■ A method named getArea() that returns the area of this triangle.
■ A method named getPerimeter() that returns the perimeter of this triangle.
■ A method named toString() that returns a string description for the triangle.
For the formula to compute the area of a triangle, see Programming Exercise 2.19. 
The toString() method is implemented as follows:
return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;

Draw the UML diagrams for the classes Triangle and GeometricObject and implement the classes. 
Write a test program that prompts the user to enter three sides of the triangle, a color, and a Boolean value to 
indicate whether the triangle is filled. The program should create a Triangle object with these sides and set the color 
and filled properties using the input. The program should display the area, perimeter, color, and true or false to 
indicate whether it is filled or not.
 */

public class _11_01_TriangleClass
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		double side1, side2, side3;
		String color;
		boolean filled;
		
		System.out.print("Enter the three sides of the triangle below: \nSide1 = ");
		side1 = kb.nextDouble();
		
		System.out.print("Side2 = ");
		side2 = kb.nextDouble();
		
		System.out.print("Side3 = ");
		side3 = kb.nextDouble();
		
		System.out.print("What is the color? \nColor = ");
		color = kb.next();
		
		System.out.print("Is the triangle filled? Enter true for yes, and false for no.");
		filled = kb.nextBoolean();
		
		Triangle triangle1 = new Triangle (side1, side2, side3);
		triangle1.setColor(color);
		triangle1.setFilled(filled);
		
		System.out.println("The area is " + triangle1.getArea() + "\nThe perimeter is " + triangle1.getPerimeter());
		System.out.println("The color is " + triangle1.getColor() + "\n" + "The triangle is filled? " + triangle1.isFilled());
	}

}

class Triangle extends GeometricObject
{
	private double side1, side2, side3;
	
	Triangle()
	{
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	Triangle (double side1, double side2, double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getSide1()
	{
		return side1;
	}
	
	public double getSide2()
	{
		return side2;
	}
	
	public double getSide3()
	{
		return side3;
	}
	
	public double getArea()
	{
		// area = square root of (s (s - side1) (s - side2) (s - side3))
		//where s = (side1 + side2 + side3) / 2
		double s = (side1 + side2 + side3) / 2.0;
		return (Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5));
	}
	
	public double getPerimeter()
	{
		return (side1 + side2 + side3);
	}
	
	public String toString()
	{
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
