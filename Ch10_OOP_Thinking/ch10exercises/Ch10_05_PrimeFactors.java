package ch10exercises;
import ch10exercises.Ch10_00_Stack_Of_Integers.StackOfIntegers;
import ch10exercises.Ch10_03_MyInteger.MyInteger;

import java.util.Scanner;

/* Chapter 10 - Exercise 5:
 * (Displaying the prime factors) Write a program that prompts the user to enter a positive integer and displays all its 
 * smallest factors in decreasing order. For example, if the integer is 120, the smallest factors are displayed as 
 * 5, 3, 2, 2, 2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and retrieve and display them in 
 * reverse order.
 */
		//By Khaled Shah

public class Ch10_05_PrimeFactors
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter a positive integer: ");
		int userNum = kb.nextInt();

		StackOfIntegers smallestFactorStack = new StackOfIntegers();
		int savedUserNum = userNum;

		int factor = 2; 	//smallest
		
		while (factor <= userNum)
		{
			if (userNum % factor == 0)
			{
				smallestFactorStack.push(factor);
				userNum /= factor;
			}

			else
			{
				factor++;
			}
		}

		if(MyInteger.isPrime(savedUserNum))
		{
			System.out.println(savedUserNum + " is a prime number. There are no factors.");
		}

		else
		{
			System.out.println("The factors of " + savedUserNum + " are: ");
			while (!smallestFactorStack.empty())
			{
				System.out.print(smallestFactorStack.pop() + ((smallestFactorStack.empty())? " = " + savedUserNum : " x "));
			}
		}
	}

}
