package ch5_exercises;
import java.util.Scanner;

/* Chapter 5 - Exercise 14:
 * (Compute the greatest common divisor) Another solution for Listing 5.9 to find the greatest common divisor of two 
 * integers n1 and n2 is as follows: First find d to be the minimum of n1 and n2, then check whether d, d-1, d-2, ..., 2, 
 * or 1 is a divisor for both n1 and n2 in this order. The first such common divisor is the greatest common divisor for n1 
 * and n2. Write a program that prompts the user to enter two positive integers and displays the gcd.
 */
		//By Khaled Shah

public class Ch5_14_Computing_GCD
{

	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.print("Enter two integers to get their Greatest Common Divisor.\nFirst integer = ");
		int n1 = kb.nextInt();
		System.out.print("Second integer = ");
		int n2 = kb.nextInt();
		
		int d = Math.min(n1, n2);
		int gcd = 0;
		
		while(d > 0)
		{
			gcd = (((n1 % d == 0) && (n2 % d == 0))? d : 0);
			d--;
			
			if (gcd != 0)
			{
				break;
			}
		}
		
		System.out.println(((gcd != 1)? "The GCD of " +n1 + " and " + n2 + " is " + gcd : "These numbers are coprimes "
				+ "(i.e no GCD aside from 1)."));

	}

}
