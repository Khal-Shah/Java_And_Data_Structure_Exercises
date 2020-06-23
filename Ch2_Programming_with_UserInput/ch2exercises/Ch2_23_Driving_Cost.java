package ch2exercises;
import java.util.*;

		/* Chapter 2 - Exercise 23:
		 * (Cost of driving) Write a program that prompts the user to enter the distance to drive, the fuel efficiency of the car 
		 * in miles per gallon and the price per gallon, and displays the cost of the trip. Here is a sample run:
		 * Enter the driving distance: 900.5
			Enter miles per gallon: 25.5
			Enter price per gallon: 3.55
			The cost of driving is $125.36
		 */
				//By Khaled Shah

public class Ch2_23_Driving_Cost
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		// total cost = distance (gallon/distance) (cost/gallon) = cost
		System.out.print("Enter the driving distance (in miles): ");
		double distance = kb.nextDouble();
		System.out.print("Enter the fuel efficiency (miles per gallon): ");
		double efficiency = kb.nextDouble();
		System.out.print("Enter the price (cost per gallon): ");
		double gallonCost = kb.nextDouble();
									//			miles   miles/gallon		$/gallon
		double totalCost = distance * (1 / efficiency) * gallonCost;
		System.out.printf("The cost of driving is $%.2f", totalCost);
	}

}
