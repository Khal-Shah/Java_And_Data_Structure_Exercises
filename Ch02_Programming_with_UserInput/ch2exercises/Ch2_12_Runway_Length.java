package ch2exercises;
import java.util.Scanner;

		/* Chapter 2 - Exercise 12:
		 * (Physics: finding runway length) Given an airplane’s acceleration a and take-off speed v, you can compute 
		 * the minimum runway length needed for an airplane to take off using the following formula: length = v^2 / 2a
		 * Write a program that prompts the user to enter v in meters/second (m/s) and the acceleration a in 
		 * meters/second squared (m/s2), and displays the minimum run-way length. Here is a sample run:
		 * Enter speed and acceleration: 60 3.5
			The minimum runway length for this airplane is 514.286
		 */
				//By Khaled Shah

public class Ch2_12_Runway_Length
{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Enter speed and acceleration below");
		System.out.print("speed (v) = ");
		double speed = input.nextDouble();
		System.out.print("acceleration (a) = ");
		double acceleration = input.nextDouble();
		
		double length = Math.pow(speed, 2) / (2 * acceleration);
		System.out.println("The minimum runway length for this airplane is " + length);
	}

}
