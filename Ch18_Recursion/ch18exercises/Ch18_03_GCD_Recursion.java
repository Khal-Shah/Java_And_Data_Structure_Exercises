package ch18exercises;

import java.util.Scanner;

/** Chapter 18 - Exercise 3:
 * (Compute greatest common divisor using recursion) The gcd(m, n) can also be defined recursively as follows:
■ If m % n is 0, gcd(m, n) is n.
■ Otherwise, gcd(m, n) is gcd (n, m % n).
Write a recursive method to find the GCD. 
Write a test program that prompts the user to enter two integers and displays their GCD.

 @author khaled Shah
 */

public class Ch18_03_GCD_Recursion
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter two integers to test their GCD below.\nInteger1 = ");
		int m = kb.nextInt();
		System.out.print("Integer2 = ");
		int n = kb.nextInt();
		
		System.out.println("The Greatest Common Divisor of " + m + " and " + n + " is " + computeGCD(m, n));

	}
	
	public static int computeGCD(int m, int n)
	{
		if (m % n == 0)
		{
			return n;
		}
		
		else 
		{
			return (computeGCD(n, m % n));
		}
	}

}
