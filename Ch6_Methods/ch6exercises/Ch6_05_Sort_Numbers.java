package ch6exercises;
import java.util.*;

		/* Chapter 6 - Exercise 5:
		 * (Sort three numbers) Write a method with the following header to display three numbers in increasing order:
		 * public static void displaySortedNumbers( double num1, double num2, double num3)
		 * Write a test program that prompts the user to enter three numbers and invokes the
			method to display them in increasing order.
		 */
				//By Khaled Shah

public class Ch6_05_Sort_Numbers
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter three numbers: ");
		double n1 = kb.nextDouble();
		double n2 = kb.nextDouble();
		double n3 = kb.nextDouble();
		
		System.out.print("The three numbers in increasing order is: ");
		displaySortedNumbers(n1, n2, n3);	//void
	}
	
	public static void displaySortedNumbers(double num1, double num2, double num3)
	{
		if ((num2 > num3) && (num3 > num1))
		{
			System.out.println(num2 + ", " + num3 + ", " + num1);
		}
		
		else if ((num1 > num2) && ( num2 > num3))
		{
			System.out.println(num3 + ", " + num2 + ", " + num1);
		}
		
		else if ((num2 > num1) && (num1 > num3))
		{
			System.out.println(num3 + ", " + num1 + ", " + num2);
		}
		
		else if ((num2 > num3) && (num3 > num1))
		{
			System.out.println(num1 + ", " + num3 + ", " + num2);
		}
		
		else if ((num3 > num2) && (num2 > num1))
		{
			System.out.println(num1 + ", " + num2 + ", " + num3);
		}
		
		else if ((num3 > num1) && (num1 > num2))
		{
			System.out.println(num2 + ", " + num1 + ", " + num3);
		}
	}

}
