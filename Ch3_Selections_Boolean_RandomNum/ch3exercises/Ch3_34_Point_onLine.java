package ch3exercises;
import java.util.*;

/* Chapter 3 - Exercise 34:
 * (Geometry: point on line segment) Programming Exercise 3.32 shows how to test whether a point is on an unbounded 
 * line. Revise Programming Exercise 3.32 to test whether a point is on a line segment. 
 * Write a program that prompts the user to enter the three points for p0, p1, and p2 
 * and displays whether p2 is on the line segment from p0 to p1. 
 * 
 * Here are some sample runs:
 * Enter three points for p0, p1, and p2: 1 1 2.5 2.5 1.5 1.5
(1.5, 1.5) is on the line segment from (1.0, 1.0) to (2.5, 2.5)

Enter three points for p0, p1, and p2:  1 1 2 2 3.5 3.5
(3.5, 3.5) is not on the line segment from (1.0, 1.0) to (2.0, 2.0)
 */
	//By Khaled Shah

public class Ch3_34_Point_onLine
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter three points for p0, p1, and p2 below.\nFor p0\nEnter x0: ");
		double x0 = kb.nextDouble();
		System.out.print("Enter y0: ");
		double y0 = kb.nextDouble();
		
		System.out.print("For p1\nEnter x1: ");
		double x1 = kb.nextDouble();
		System.out.print("Enter y1: ");
		double y1 = kb.nextDouble();
		
		System.out.print("For p2\nEnter x2: ");
		double x2 = kb.nextDouble();
		System.out.print("Enter y2: ");
		double y2 = kb.nextDouble();
		
		double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
	
	/*	System.out.printf("(%.1f, %.1f) is " + ((position == 0)? "" : "not ") + "on the line segment from (%.1f, %.1f) "
					+ "to (%.1f, %.1f)", x2, y2, x0, y0, x1, y1);*/
		
		if (position == 0)
		{
			System.out.printf("(%.1f, %.1f) is on the line segment from (%.1f, %.1f) to (%.1f, %.1f)", x2, y2, x0, y0, x1, y1);
		}
		
		else
		{
			System.out.printf("(%.1f, %.1f) is not on the line segment from (%.1f, %.1f) to (%.1f, %.1f)", x2, y2, x0, y0, x1, y1);
		}

	}

}
