package ch6exercises;

/* Chapter 6 - Exercise 22:
 * (Math: approximate the square root) There are several techniques for implementing the sqrt method in the Math class. 
 * One such technique is known as the Babylonian method. 
 * It approximates the square root of a number, n, by repeatedly performing a calculation using the following formula:
nextGuess = (lastGuess + n / lastGuess) / 2

When nextGuess and lastGuess are almost identical, nextGuess is the approximated square root. 
The initial guess can be any positive value (e.g., 1). This value will be the starting value for lastGuess. 
If the difference between nextGuess and lastGuess is less than a very small number, such as 0.0001, 
you can claim that nextGuess is the approximated square root of n. 
If not, next- Guess becomes lastGuess and the approximation process continues. 
Implement the following method that returns the square root of n.
public static double sqrt(long n)
 */
		//By Khaled Shah

import java.util.Scanner;

public class Ch6_22_Approximate_SquareRoot
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("What number would you like to guess the square root of? ");
		int n = kb.nextInt();

		System.out.printf("The square root of %d is %f", n, sqrt(n));
	}

	public static double sqrt(long n)
	{
		double lastGuess = 1;
		//nextGuess = (lastGuess + n / lastGuess) / 2
		double nextGuess = 0;
		double difference;

		do
		{
			nextGuess = (lastGuess + n / lastGuess) / 2;
			difference = Math.abs(nextGuess - lastGuess);

			if(difference < 0.0001)
			{
				break;
			}

			System.out.print("Enter guess: ");
			lastGuess = kb.nextDouble();

		} while(difference > 0.0001);

		return nextGuess;
	}

}
