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

public class Ch6_22_Approximate_SquareRoot
{

	public static void main(String[] args)
	{
		System.out.printf("%.2f", sqrt(25));
	}
	
	public static double sqrt(long n)
	{
		double lastGuess = 1;
		double nextGuess = (lastGuess + n / lastGuess) / 2.0;
	
		while (Math.abs(lastGuess - nextGuess) > .0001)
		{
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2.0;
		}
		return nextGuess;
	}

}
