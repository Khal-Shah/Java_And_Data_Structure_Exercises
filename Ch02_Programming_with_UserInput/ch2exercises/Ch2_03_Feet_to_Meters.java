package ch2exercises;
import java.util.Scanner;

		/* Chapter 2 - Exercise 3;
		 * (Convert feet into meters) Write a program that reads a number in feet, converts it to meters, and displays the 
		 * result. One foot is 0.305 meter. 
		 * Here is a sample run:
			Enter a value for feet: 16.5
			16.5 feet is 5.0325 meters
		 */
				//By Khaled Shah

public class Ch2_03_Feet_to_Meters
{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter a value for feet: ");
		double feet = input.nextDouble();
		
		System.out.println(feet + " feet is " + (feet * 0.305) + " meters.");

	}

}
