package ch7exercises;
import java.util.*;

/* Chapter 7 - Exercise 14:
 * (Computing gcd) Write a method that returns the gcd of an unspecified number
of integers. The method header is specified as follows:
public static int gcd(int... numbers)
Write a test program that prompts the user to enter five numbers, invokes the
method to find the gcd of these numbers, and displays the gcd.
 */
		//By Khaled Shah

public class Ch7_14_Compute_GCD
{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
		int [] userNumbers = getNumbers();
		int gcd = gcd(userNumbers);
		
		System.out.println(gcd);

	}
	
	public static int gcd (int...numbers)
	{
		int gcd = 1; 	//initial gcd
		boolean isDiv;
										//check up to the smallest element
		for (int i = 2; i <= min(numbers); i++)
		{
			isDiv = true;
			
			for (int e: numbers)
			{
				if (e % i != 0)
				{
					isDiv = false;
				}
			}
			
			if (isDiv)
			{
				gcd = i;
			}
		}
		return gcd;
	}
	
	public static int min (int...numbers)
	{
		int min = numbers [0];
		
		for (int i = 0; i < numbers.length; i++)
		{
			if (numbers[i] < min)
			{
				min = numbers [i];
			}
		}
		return min;
	}
	
	public static int [] getNumbers ()
	{
		System.out.print("Enter 5 numbers: ");
		int [] usrNms = new int [5];
		
		for (int i = 0; i < usrNms.length; i++)
		{
			usrNms [i] = kb.nextInt();
		}
		return usrNms;
	}

}
