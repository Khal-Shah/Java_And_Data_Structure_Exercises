package ch4exercises;
import java.util.Scanner;

public class Ch4_05_Polygon_Area

		/* Chapter 4 - Exercise 5:
		 * (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in which all sides are of the 
		 * same length and all angles have the same degree (i.e., the polygon is both equilateral and equiangular). 
		 * The formula for computing the area of a regular polygon is Area = n s^2 / 4tan(π/n)
		 * 
		 * Here, s is the length of a side. Write a program that prompts the user to enter the number of sides and their 
		 * length of a regular polygon and displays its area. 
		 * 
		 * Here is a sample run:
		 * Enter the number of sides: 5
			Enter the side: 6.5
			The area of the polygon is 74.69017017488385
		 */
				//By Khaled Shah
{
	static Scanner kb = new Scanner (System.in);
	static final double PI = Math.PI;

	public static void main(String[] args)
	
	{
		System.out.println("Enter how many sides the equilateral polygon has and the side's length below.");
		System.out.print("Number of sides: ");
		int n = kb.nextInt();
		
		System.out.print("Length of side: ");
		double s = kb.nextDouble();
		
		double area = (n * Math.pow(s, 2)) / (4 * Math.tan(PI / n));
		
		System.out.println("The area of the polygone is " + area);
	}

}
