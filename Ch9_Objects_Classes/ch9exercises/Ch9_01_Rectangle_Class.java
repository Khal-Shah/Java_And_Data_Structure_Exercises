package ch9exercises;

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

public class Ch9_01_Rectangle_Class
{

	public static void main(String[] args)
	{
		Rectangle rectangle1 = new Rectangle (4, 40);
		Rectangle rectangle2 = new Rectangle (3.5, 35.9);
		
		System.out.println("Rectangle1's width: " + rectangle1.width + "...Rectangle1's height: " + rectangle1.height
				+ "...Rectangle1's area: " + rectangle1.getArea() + "...Rectangle1's perimeter: " + rectangle1.getPerimeter());
		
		System.out.println("Rectangle2's width: " + rectangle2.width + "...Rectangle2's height: " + rectangle2.height
				+ "...Rectangle2's area: " + rectangle2.getArea() + "...Rectangle2's perimeter: " + rectangle2.getPerimeter());

	}

}

class Rectangle
{
	double width;
	double height;
	
	Rectangle ()
	{
		width = 1;
		height = 1;
	}
	
	Rectangle (double newWidth, double newHeight)
	{
		width = newWidth;
		height = newHeight;
	}
	
	double getArea ()
	{
		return (height * width);
	}
	
	double getPerimeter ()
	{
		return (2 * width + 2 * height);
	}
}
