package ch3exercises;
import java.util.Scanner;

/* Chapter 3 - Exercise 18:
 * (Cost of shipping) A shipping company uses the following function to calculate the cost (in dollars) of shipping based 
 * on the weight of the package (in pounds).
 * 		Cost									Weight
 *		3.5 										0 < w <= 1
 *		5.5										1 < w <= 3
 *		8.5										3 < w <= 10
 *		10.5										10 < w <= 20
 *Write a program that prompts the user to enter the weight of the package and display the shipping cost. 
 *If the weight is greater than 50, display a message “the package cannot be shipped.”
 */
		//By Khaled Shah

public class Ch3_18_ShippingCost
{
		static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter the weight of the package (in pounds): ");
		double weight = kb.nextDouble();
		
		double cost = 0;
		String invalid = "";
		
		if (weight > 0 && weight <= 1)
		{
			cost = 3.5;
		}
		
		else if (weight > 1 && weight <= 3)
		{
			cost = 5.5;
		}
		
		else if (weight > 3 && weight <= 10)
		{
			cost = 8.5;
		}
		
		else if (weight > 10 && weight <= 20)
		{
			cost = 10.5;
		}
		
		else
		{
			invalid = "The package can't be shipped.";
		}
		
		System.out.printf(((invalid.length() > 0)? invalid: "The cost of your shipment is $%.2f"), cost);

	}

}
