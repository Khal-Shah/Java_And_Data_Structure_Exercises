package ch1exercises;

/* Chapter 1 - Exercise 6:
 * (Summation of a series) Write a program that displays the result of:
 * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9.
 */
		// By Khaled Shah

public class Ch1_06_Summation
{

	public static void main(String[] args)
	{
		int sum = 0;
		System.out.print("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 is " + (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9));
		
		for (int i = 1; i <= 9; i++)
		{
			sum += i;
		}
		
		System.out.print(" using direct addition. \nUsing loop, the sum is " + sum);

	}

}
