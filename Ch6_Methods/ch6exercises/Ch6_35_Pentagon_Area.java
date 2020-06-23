package ch6exercises;
import java.util.Scanner;

/* Chapter 6 - Exercise 25;
 * (Geometry: area of a pentagon) The area of a pentagon can be computed using the following formula:
 * Area = (5 x s^2) / 4 tan(pi/5)
 * Write a method that returns the area of a pentagon using the following header:
 * public static double area(double side)
Write a main method that prompts the user to enter the side of a pentagon and
displays its area. Here is a sample run:
Enter the side: 5.5
The area of the pentagon is 52.04444136781625
 */
		//By Khaled Shah

public class Ch6_35_Pentagon_Area
{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter the side: ");
		double side = kb.nextDouble();
		
		printArea(side);
	}
	
	public static double area(double side)
	{
		double area;
		double s = side;
		//Area = (5 x s^2) / 4 tan(pi/5)
		area = (5 * Math.pow(side, 2) / (4 * Math.tan((Math.PI) / 5.0)));
		return area;
	}
	
	public static void printArea(double s)
	{
		System.out.println("The area of the pentagon is " + area(s));
	}

}
