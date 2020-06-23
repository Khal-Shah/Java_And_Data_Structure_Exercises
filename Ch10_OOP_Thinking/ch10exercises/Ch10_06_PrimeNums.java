package ch10exercises;

/* Chapter 10 - Exercise 6:
 * (Displaying the prime numbers) Write a program that displays all the prime numbers less than 120 in decreasing order. 
 * Use the StackOfIntegers class to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in reverse order.
 */

public class Ch10_06_PrimeNums
{
	static final int MAX = 120;

	public static void main(String[] args)
	{
		StackOfIntegers stack = new StackOfIntegers();
		
		int num = 1;
	
		
		while (num <= MAX)
		{
			boolean isPrime = true;
			
			for (int divisor = 2; (divisor <= num / 2); divisor++)
			{
				if (num % divisor == 0)
				{
					isPrime = false;
					break;
				}
			}	
				if (isPrime)
				{
					stack.push(num);
				}
			num++;
		}
		
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}

	}

}

