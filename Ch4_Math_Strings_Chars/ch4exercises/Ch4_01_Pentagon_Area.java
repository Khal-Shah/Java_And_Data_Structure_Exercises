package ch4exercises;
import java.util.Scanner;

public class Ch4_01_Pentagon_Area 

		/* Chapter 4 - Exercise 1:
		 *  (Geometry: area of a pentagon) Write a program that prompts the user to enter the length from the center of 
		 *  a pentagon to a vertex and computes the area of the pentagon, as shown in the following figure.
		 *  The formula for computing the area of a pentagon is Area = 5 s^2 / 4tan(π/5)
		 *  
		 *  where s is the length of a side. The side can be computed using the formula s = 2r sin(π / 5) ,
			where r is the length from the center of a pentagon to a vertex. Round up two digits after the decimal point. 
			
			Here is a sample run:	
			Enter the length from the center to a vertex: 5.5
			The area of the pentagon is 71.92
		 */
				// By Khaled Shah

{
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) 
	
	{
		System.out.print("Enter the length from the center to a vertex: ");
		double length = input.nextDouble();
		
		double side = (2 * length) * Math.sin(Math.PI / 5);
		double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
		
		System.out.printf("\nThe area of the pentagon is %.2f", area);

	}
	
	/*Re-done with methods:
	 * public static void main(String[] args)
	{
		double length = getLength();
		
		System.out.println("The area of the pentagon is " + getArea(length));
		
	}
	
	public static double getLength()
	{
		System.out.print("Enter the length from the center to a vertex: ");
		double length = kb.nextDouble();
		
		return length;
	}
	
	public static double getArea(double r)
	{
		double s = 2 * r * (Math.sin(Math.PI / 5));
		double area = 5 * s * s / (4 * Math.tan(Math.PI / 5));
		return area;
	}
	 * 
	 */

}
