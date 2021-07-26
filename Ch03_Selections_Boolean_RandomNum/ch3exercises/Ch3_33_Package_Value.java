package ch3exercises;
import java.util.Scanner;

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

public class Ch3_33_Package_Value
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter weight and price package 1.\nWeight = ");
		double p1Weight = kb.nextDouble();
		System.out.print("Price = ");
		double p1Price = kb.nextDouble();
		
		System.out.print("Now enter weight and price for package 2.\nWeight = ");
		double p2Weight = kb.nextDouble();
		System.out.print("Price = ");
		double p2Price = kb.nextDouble();
		
		boolean equalVal = (p1Weight/p1Price == p2Weight / p2Price);
		boolean pack1Val =  (p1Weight/p1Price > p2Weight / p2Price);
		boolean pack2Val =  (p1Weight/p1Price < p2Weight / p2Price);
		
		if (equalVal)
		{
			System.out.println("The two packages have the same price."); 
		}
		
		else 
		{
			System.out.println(((pack1Val)? "Package 1 has the better price": "Package 2 has the better price."));		
		}
		
	}

}
