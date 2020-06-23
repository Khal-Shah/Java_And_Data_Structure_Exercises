package ch6exercises;
import java.util.Scanner;

/* Chapter 6 - Exercise 36
 * (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in which all sides are of the same 
 * length and all angles have the same degree (i.e., the polygon is both equilateral and equiangular). 
 * The formula for computing the area of a regular polygon is
 * Area = (n * s^2) / 4tan(pi/n)
 * 
 * Write a method that returns the area of a regular polygon using the following header:
  public static double area(int n, double side)
Write a main method that prompts the user to enter the number of sides and the
side of a regular polygon and displays its area. Here is a sample run:
Enter the number of sides: 5
Enter the side: 6.5
The area of the polygon is 72.69017017488385
 */
		//By Khaled Shah

public class Ch6_36_Polygon_Area
{

	static Scanner kb = new Scanner(System.in);
	static final double PI = Math.PI;
	
	public static void main(String[] args)
	{
		System.out.print("Enter the number of sides: ");
		int n = kb.nextInt();
		
		System.out.print("Enter the side: ");
		double s = kb.nextDouble();
		
		showArea(n, s);
	}
	
	public static double area(int n, double side)
	{
		return ((n * Math.pow(side, 2)) / (4 * Math.tan(PI / n)));
	}
	
	public static void showArea(int n, double side)
	{
		System.out.println("The area of the polygon is " + area(n, side));
	}

}
