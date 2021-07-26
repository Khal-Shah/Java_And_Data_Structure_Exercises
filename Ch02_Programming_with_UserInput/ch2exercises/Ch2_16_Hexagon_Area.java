package ch2exercises;
import java.util.Scanner;

		/* Chapter 2 - Exercise 16:
		 * (Geometry: area of a hexagon) Write a program that prompts the user to enter the side of a hexagon and 
		 * displays its area. The formula for computing the area of a hexagon is : Area = 3 (3)^0.5 s^2 / 2
		 * where s is the length of a side. Here is a sample run:
		 * Enter the side: 5.5
			The area of the hexagon is 78.5895
		 */
				//By Khaled Shah


public class Ch2_16_Hexagon_Area
{
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		
		double area = (3 * Math.pow(3, 0.5) * Math.pow(side, 2)) / 2;
		
		System.out.println("The area of the hexagon is " + area);

	}

}
