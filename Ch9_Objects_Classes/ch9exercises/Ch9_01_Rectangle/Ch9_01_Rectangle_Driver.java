package ch9exercises.Ch9_01_Rectangle;

/* Chapter 9 - Exercise 1:
 * (The Rectangle class) Following the example of the Circle class in Section 9.2, design a class named Rectangle to 
 * represent a rectangle. The class contains:
■ Two double data fields named width and height that specify the width and height of the rectangle. 
The default values are 1 for both width and height.
■ A no-arg constructor that creates a default rectangle.
■ A constructor that creates a rectangle with the specified width and height.
■ A method named getArea() that returns the area of this rectangle.
■ A method named getPerimeter() that returns the perimeter.
Draw the UML diagram for the class and then implement the class. 
Write a test program that creates two Rectangle objects—one with width 4 and height 40 and the other with width 3.5 
and height 35.9. Display the width, height, area, and perimeter of each rectangle in this order.
 */
		//By Khaled Shah


public class Ch9_01_Rectangle_Driver
{

	public static void main(String[] args)
	{
		Rectangle rectangle1 = new Rectangle (4, 40);
		Rectangle rectangle2 = new Rectangle (3.5, 35.9);
		
		System.out.println("Rectangle1 info:\nwidth = " + rectangle1.width + ", height = " + rectangle1.height
				+ "\narea = " + rectangle1.getArea() + ", perimeter = " + rectangle1.getPerimeter());

		System.out.printf("Rectangle2 info:\nwidth = %.2f, height = %.2f\narea = %.2f, perimeter = %.2f",
						  rectangle2.width, rectangle2.height, rectangle2.getArea(), rectangle2.getPerimeter());

	}

}

