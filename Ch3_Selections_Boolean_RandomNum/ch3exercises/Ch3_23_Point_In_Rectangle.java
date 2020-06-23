package ch3exercises;
import java.util.Scanner;

/* Chapter 3 - Exercise 23
 * (Geometry: point in a rectangle?) Write a program that prompts the user to enter a point (x, y) and checks whether 
 * the point is within the rectangle centered at (0, 0) with width 10 and height 5. 
 * For example, (2, 2) is inside the rectangle and (6, 4) is outside the rectangle, as shown in Figure 3.7b.
 *  (Hint: A point is in the rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and its vertical 
 *  distance to (0, 0) is less than or equal to 5.0 / 2. Test your program to cover all cases.) 
 *  
 *  Here are two sample runs.
 *  Enter a point with two coordinates: 2 2
Point (2.0, 2.0) is in the rectangle

Enter a point with two coordinates: 6 4
Point (6.0, 4.0) is not in the rectangle
 */
	//By Khaled Shah


public class Ch3_23_Point_In_Rectangle
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter a point with two coordinates below.\nx = ");
		double xPoint = kb.nextDouble();
		System.out.print("y = ");
		double yPoint = kb.nextDouble();
		
		System.out.println("The point (" + xPoint + ", " + yPoint + ") is " + (((xPoint <= 10/2) && (yPoint <= 5/2))?  
											"" : "not ") + "in the rectangle" );

	}

}
