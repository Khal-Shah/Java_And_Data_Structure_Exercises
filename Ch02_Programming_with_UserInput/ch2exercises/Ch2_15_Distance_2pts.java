package ch2exercises;
import java.util.Scanner;

		/* Chapter 2 - Exercise 15:
		 * (Geometry: distance of two points) Write a program that prompts the user to enter two points (x1, y1) and 
		 * (x2, y2) and displays their distance between them. The formula for computing the distance is 
		 * (x2 - x1)^2 + (y2 - y1)^2 all square rooted.
		 *  Note that you can use Math.pow(a, 0.5) to compute 2a. Here is a sample run:
		 *  Enter x1 and y1: 1.5 -3.4
			Enter x2 and y2: 4 5
			The distance between the two points is 8.764131445842194
		 */
				//By Khaled Shah


public class Ch2_15_Distance_2pts
{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Enter point 1 below.");
		System.out.print("x1 = ");
		double x1 = input.nextDouble();
		System.out.print("y1 = ");
		double y1 = input.nextDouble();
		
		System.out.println("Enter point 2 below.");
		System.out.print("x2 = ");
		double x2 = input.nextDouble();
		System.out.print("y2 = ");
		double y2 = input.nextDouble();
		
		double distance = Math.pow((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)), 0.5);
		
		System.out.println("The distance between the two points is " + distance);
	}

}
