package ch2exercises;
import java.util.*;

		/* Chapter 2 - Exercise 19:
		 * (Geometry: area of a triangle) Write a program that prompts the user to enter three points (x1, y1), (x2, y2), 
		 * (x3, y3) of a triangle and displays its area. The formula for computing the area of a triangle is
		 * area = s(s - side1)(s - side2)(s - side3) all square rooted.
		 * s = (side1 + side2 + side3)/2;
		 * Here is a sample run:
		 * Enter three points for a triangle: 1.5 -3.4 4.6 5 9.5 -3.4
			The area of the triangle is 33.6
		 */
				//By Khaled Shah

public class Ch2_19_Triangle_Area
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter three points for a triangle (in order of (x1, y1), (x2, y2) and (x3, y3): ");
		double x1 = kb.nextDouble();
		double y1 = kb.nextDouble();
		double x2 = kb.nextDouble();
		double y2 = kb.nextDouble();
		double x3 = kb.nextDouble();
		double y3 = kb.nextDouble();
		
		double side1 = Math.pow((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)), 0.5);
		double side2 = Math.pow((Math.pow((x3 - x1), 2)) + (Math.pow((y3 - y1), 2)), 0.5);
		double side3 = Math.pow((Math.pow((x3 - x2), 2)) + (Math.pow((y3 - y2), 2)), 0.5);
		
		double s = (side1 + side2 + side3) / 2;
		double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
		System.out.println("The area of the triangle is " + area);
	}

}
