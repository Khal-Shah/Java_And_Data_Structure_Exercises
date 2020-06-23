package ch2exercises;
import java.util.*;

		/* Chapter 2 - Exercise 2:
		 * (Compute the volume of a cylinder) Write a program that reads in the radius and length of a cylinder and 
		 * computes the area and volume using the following formulas:
			area = radius * radius * pi 
			volume = area * length
			Here is a sample run:
			Enter the radius and length of a cylinder: 5.5 12
			The area is 95.0331
			The volume is 1140.4
		 */
				//By Khaled Shah

public class Ch2_02_Volume_Of_Cylinder
{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter the radius and length of the cylinder below.\nRadius = ");
		double radius = input.nextDouble();
		System.out.print("Length = ");
		double length = input.nextDouble();
		
		double area = radius * radius * Math.PI;
		double volume = area * length;
		
		System.out.println("\nThe area is " + area + "\nThe volume is " + volume);

	}

}
