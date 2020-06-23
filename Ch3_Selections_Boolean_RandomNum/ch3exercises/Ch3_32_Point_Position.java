package ch3exercises;
import java.util.Scanner;

/* Chapter 3 - Exercise 32:
 * (Geometry: point position) Given a directed line from point p0(x0, y0) to p1(x1, y1), you can use the following 
 * condition to decide whether a point p2(x2, y2) is on the left of the line, on the right, or on the same line (see Figure 3.11):
(x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0)
>0: p2 is on the left side of the line
= 0: p2 is on the same line 
< 0: p2 is on the right side of the line

Write a program that prompts the user to enter the three points for p0, p1, and p2 and displays whether 
p2 is on the left of the line from p0 to p1, on the right, or on the same line. 
Here are some sample runs:
Enter three points for p0, p1, and p2: 4.4 2 6.5 9.5 -5 4
(-5.0, 4.0) is on the left side of the line from (4.4, 2.0) to (6.5, 9.5)

  Enter three points for p0, p1, and p2: 1 1 5 5 2 2
(2.0, 2.0) is on the line from (1.0, 1.0) to (5.0, 5.0)

Enter three points for p0, p1, and p2: 3.4 2 6.5 9.5 5 2.5
(5.0, 2.5) is on the right side of the line from (3.4, 2.0) to (6.5, 9.5)
 */
	//By Khaled Shah

public class Ch3_32_Point_Position
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
		
		if (position == 0)
		{
			System.out.printf("(%.1f, %.1f) is on the line from (%.1f, %.1f) to (%.1f, %.1f)", x2, y2, x0, y0, x1, y1);
		}
		else
		{
			System.out.printf("(%.1f, %.1f) is on the " + ((position > 0)? "left " : "right ") + "side of the line from (%.1f, %.1f) "
					+ "to (%.1f, %.1f)", x2, y2, x0, y0, x1, y1);
		}

	}

}
