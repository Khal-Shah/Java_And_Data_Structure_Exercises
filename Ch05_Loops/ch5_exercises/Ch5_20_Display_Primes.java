package ch5_exercises;
import java.util.Scanner;

/* Chapter 5 - Exercise 20
 * (Display prime numbers between 2 and 1,000) Modify Listing 5.15 to display all the prime numbers between 
 * 2 and 1,000, inclusive. Display eight prime numbers per line. Numbers are separated by exactly one space.
 */
		//By Khaled Shah

public class Ch5_20_Display_Primes
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		int primes = 0;
		int num = 2;
		//int k = 1;
		
		
		while (num <= 1000)
		{
			boolean isPrime = true;
			for (int k = 2; (k <= num / 2); k++)
			{
				if (num % k == 0)
				{
					isPrime = false;
					break;
				}
			}	
				if (isPrime)
				{
					System.out.print(num + ", ");
					primes += 1;
					
					if (primes % 8 == 0)
					{
						System.out.println();
					}
				}
			
			num++;
		}

	}

}
