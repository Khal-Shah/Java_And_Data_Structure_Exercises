package ch2notes;


/* Chapter 2 - Exercise 23:
		 * (Cost of driving) Write a program that prompts the user to enter the distance to drive, the fuel efficiency of the car
		 * in miles per gallon and the price per gallon, and displays the cost of the trip. Here is a sample run:
		 * Enter the driving distance: 900.5
			Enter miles per gallon: 25.5
			Enter price per gallon: 3.55
			The cost of driving is $125.36
		 */
//By Khaled Shah


import java.util.Arrays;
import java.util.Scanner;

class Ch2_Practice
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter the driving distance: ");
		double distance = kb.nextDouble();							//miles

		System.out.print("Enter miles per gallon: ");
		double mpg = kb.nextDouble();								//miles/gallon

		System.out.print("Enter price per gallon: ");
		double ppg = kb.nextDouble();								//price/gallon

		double cost = distance/mpg/ppg;						//how many gallons needed for distance?

		System.out.println("The cost of driving is $" + cost);

	}

}
