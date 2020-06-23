package ch6exercises;

/* Chapter 6 - Exercise 29:
 * (Twin primes) Twin primes are a pair of prime numbers that differ by 2. For example, 3 and 5 are twin primes, 
 * 5 and 7 are twin primes, and 11 and 13 are twin primes.
 * Write a program to find all twin primes less than 1,000. Display the output as follows:
         (3, 5)
         (5, 7)
         ...
 */
		//By Khaled Shah

public class Ch6_29_Twin_Primes
{

	public static void main(String[] args)
	{
			showTwinPrimes(1000);
	}
	
	public static boolean isPrime(int number)
	{
		for (int divisor  = 2; divisor <= (number / 2); divisor++)
		{
			if (number % divisor == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void showTwinPrimes(int totalTwinPrimes)
	{
		int number = 2;
		int twin = 4;
		
		while (number < totalTwinPrimes)
		{
			if (isPrime(number) && isPrime(twin))
			{
				System.out.println("(" + number + ", " + twin + ")");
			}
			number++;
			twin = number + 2;
		}
	}

}
