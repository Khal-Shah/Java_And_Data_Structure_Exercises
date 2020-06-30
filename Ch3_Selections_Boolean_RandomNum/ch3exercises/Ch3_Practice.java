package ch3exercises;
import java.util.*;



/* Chapter 3 - Exercise 33:
 * (Financial: compare costs) Suppose you shop for rice in two different packages. You would like to write a program
 * to compare the cost. The program prompts the user to enter the weight and price of the each package and displays
 * the one with the better price.
 * Here is a sample run:
 *
 * Enter weight and price for package 1: 50 24.59
Enter weight and price for package 2: 25 11.99
Package 2 has a better price.

Enter weight and price for package 1: 50 25
Enter weight and price for package 2: 25 12.5
Two packages have the same price.
 */
//By Khaled Shah


public class Ch3_Practice
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter weight and price for package 1 below.\nWeight: ");
		double p1weight = kb.nextDouble();
		System.out.print("Price: ");
		double p1price = kb.nextDouble();

		System.out.print("Enter weight and price for package 2 below.\nWeight: ");
		double p2weight = kb.nextDouble();
		System.out.print("Price: ");
		double p2price = kb.nextDouble();

		double p1rate = p1weight / p1price;
		double p2rate =  p2weight / p2price;

		//System.out.println(p1rate + ", " + p2rate);

		if (p1rate == p2rate)
		{
			System.out.print("Two packages have the same price.");
		}

		else
		{
			System.out.print("Package " + ((p1rate > p2rate)? "1" : "2") + " has a better price.");
		}
	}


}
