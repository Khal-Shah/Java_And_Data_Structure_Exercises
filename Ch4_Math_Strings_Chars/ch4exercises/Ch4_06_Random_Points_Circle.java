package ch4exercises;
import java.util.Scanner;

public class Ch4_06_Random_Points_Circle

		/* Chapter 4 - Exercise 6:
		   (Random points on a circle) Write a program that generates three random points on a circle centered at (0, 0)
		 * with radius 40 and display three angles in a triangle formed by these three points, as shown in Figure 4.7a. 
		 * (Hint: Generate a random angle a in radians between 0 and 2pi, as shown in Figure 4.7b and the point determined 
		 * by this angle is x = r*cos(a) and y = r*sin(a)
		 */
				// By Khaled Shah

{
	static Scanner kb = new Scanner (System.in);
	
	static final double RADIUS = 40.0;
	
	static final double ANGLE1 = Math.toRadians((Math.random() * 360));
	static final double x1 = RADIUS * (Math.cos(ANGLE1));
	static final double y1= RADIUS * Math.sin(ANGLE1);
	
	static final double ANGLE2 = Math.toRadians((Math.random() * 360));
	static final double x2 = RADIUS * (Math.cos(ANGLE2));
	static final double y2= RADIUS * Math.sin(ANGLE2);
	
	static final double ANGLE3 = Math.toRadians((Math.random() * 360));
	static final double x3 = RADIUS * (Math.cos(ANGLE3));
	static final double y3= RADIUS * Math.sin(ANGLE3);
	
	public static void main(String[] args)
	
	{
		System.out.printf("The three random points are (%.1f, %.1f), (%.1f, %.1f) and (%.1f, %.1f)", x1, y1, x2, y2, x3, y3);
	}

}
