package ch4notes;
import java.util.Scanner;

			/* Chapter 4 - Exercise 11:
		 * (Decimal to hex) Write a program that prompts the user to enter an integer between 0 and 15 and displays
		 * its corresponding hex number.
		 *
		 * Here are some sample runs:
		 * Enter a decimal value (0 to 15): 11
			The hex value is B

			Enter a decimal value (0 to 15): 5
			The hex value is 5

			Enter a decimal value (0 to 15): 31
			31 is an invalid input
		 */
// By Khaled Shah


public class Ch4_Practice
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter a decimal value (0 to 15): ");
		int deciVal = kb.nextInt();
		String hexiVal = Integer.toHexString(deciVal);

		System.out.println(((deciVal < 0 || deciVal > 15)? (+ deciVal + " is an invalid input.") : "The hex value is " + hexiVal.toUpperCase() + "."));

	}

	
}
