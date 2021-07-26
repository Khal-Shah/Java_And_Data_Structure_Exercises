package ch6exercises;

import java.util.Scanner;

/* Chapter 6 - Exercise 19:
 * (The MyTriangle class) Create a class named MyTriangle that contains the following two methods:
         Return true if the sum of any two sides is greater than the third side. 
									public static boolean isValid(double side1, double side2, double side3)
 
 Return the area of the triangle. 
public static double area(double side1, double side2, double side3)

Write a test program that reads three sides for a triangle and computes the area if the input is valid. 
Otherwise, it displays that the input is invalid. 
 
 The formula for computing the area of a triangle is
		 * area = s(s - side1)(s - side2)(s - side3) all square rooted.
		 * s = (side1 + side2 + side3)/2;
 */
		//By Khaled Shah

public class Ch6_19_Triangle_Area
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter the three sides of a triangle below.\nSide 1 = ");
		double s1 = kb.nextDouble();
		
		System.out.print("Side 2 = ");
		double s2 = kb.nextDouble();
		
		System.out.print("Side 3 = ");
		double s3 = kb.nextDouble();
		
		System.out.printf("The area of the triangle is: " + ((isValid(s1, s2, s3))? "%.3f" : "can't be computed, invalid."), 
				area(s1, s2, s3));
	}
	
	public static double area(double side1, double side2, double side3)
	{
		/* area = s(s - side1)(s - side2)(s - side3) all square rooted.
				 * s = (side1 + side2 + side3)/2; */
		double s = (side1 + side2 + side3) / 2.0;
		double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
		return area;
	}
	
	public static boolean isValid(double side1, double side2, double side3)
	{
		boolean isValid = true;
		
		if ((side1 + side2 <= side3) || (side1 + side3 <= side2) || (side2 + side3 <= side1))
		{
			isValid = false;
		}
		return isValid;
	}

}
