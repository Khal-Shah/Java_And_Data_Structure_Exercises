package ch3exercises;
import java.util.Scanner;

/* Chapter 3 - Exercise 25:
 * (Geometry: intersecting point) Two points on line 1 are given as (x1, y1) and (x2, y2) and on line 2 as (x3, y3) and (x4, y4), 
 * as shown in Figure 3.8a–b.
The intersecting point of the two lines can be found by solving the following linear equation:
(y1 -y2) * x - (x1 - x2) * y = (y1 - y2) * x1 - (x1 - x2) * y1
(y3 - y4) * x - (x3 - x4) * y = (y3 - y4) * x3 - (x3 - x4) * y3

This linear equation can be solved using Cramer’s rule (see Programming Exercise 3.3). 

 ax + by=e		 					x= ed - bf /ad - bc 
	cx + dy = f							y= af-ec /  ad - bc
	
	
If the equation has no solutions, the two lines are parallel (Figure 3.8c).

Sample runs:
Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 5 -1.0 4.0 2.0 -1.0 -2.0
The intersecting point is at (2.88889, 1.1111)

Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 7 6.0 4.0 2.0 -1.0 -2.0
The two lines are parallel
 */
	//By Khaled Shah

public class Ch3_25_Intersecting_Point
{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
		System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4:");
		double x1 = kb.nextDouble();
		double y1 = kb.nextDouble();
		double x2 = kb.nextDouble();
		double y2 = kb.nextDouble();
		double x3 = kb.nextDouble();
		double y3 = kb.nextDouble();
		double x4 = kb.nextDouble();
		double y4 = kb.nextDouble();
		
		double a = (y1 - y2);
		double b = (x1 - x2);
		double e = ((y1 - y2) * x1) - ((x1 - x2) * y1);
		double c = (y3 - y4);
		double d = (x3 - x4);
		double f = ((y3 - y4) * x3) - ((x3 - x4) * y3);
		
		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);
		
		if (Double.isFinite(x) || Double.isFinite(y))
		{
			System.out.println("The intersecting point is at (" + x + ", " + y + ")" );
		}
		else
		{
			System.out.println("The two lines are parallel.");
		}
		
		
		
	}

}
