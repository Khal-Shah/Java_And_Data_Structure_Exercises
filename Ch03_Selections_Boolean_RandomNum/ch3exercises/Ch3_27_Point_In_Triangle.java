package ch3exercises;
import java.util.*;

/* Chapter 3 - Exercise 27:
 * (Geometry: points in triangle?) Suppose a right triangle is placed in a plane as shown below. The right-angle 
 * point is placed at (0, 0), and the other two points are placed at (200, 0), and (0, 100). 
 * Write a program that prompts the user to enter a point with x- and y-coordinates and determines whether 
 * the point is inside the triangle. Here are the sample runs:
 * 
 * Enter a point's x- and y-coordinates: 100.5 25.5
The point is in the triangle
 */
		//By Khaled Shah

public class Ch3_27_Point_In_Triangle
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter a point's x and y coordinates.\nx: ");
		double xPoint = kb.nextDouble();
		System.out.print("y: ");
		double yPoint = kb.nextDouble();
		
		double slope = (100 - 0) / (200 - 0);
		
		boolean underSlope = (yPoint + (xPoint * slope)  <= 100);
		
		System.out.println("The point is " + (((xPoint > 200) || (xPoint < 0) || (yPoint > 100) || (yPoint < 0) || !(underSlope))?  
											"not ": "") + "in the triangle.");
		
		
	}

}
