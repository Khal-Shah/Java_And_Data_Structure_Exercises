package ch6exercises;

/* Chapter 6 - Exercise 10:
 * (Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the isPrime(int number) method for 
 * testing whether a number is prime. Use this method to find the number of prime numbers less than 10000.
 * 
 */
		//By Khaled Shah

public class Ch6_10_Prime_Nums
{
	final static int TOTAL_PRIME = 10000;

	public static void main(String[] args)
	{
		System.out.println("The first " + TOTAL_PRIME + " numbers are \n");
		printPrimes(TOTAL_PRIME);

	}
	
	public static boolean isPrime (int number)
	{
		for (int divisor = 2; divisor <= (number / 2); divisor++)
		{
			if (number % divisor == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void printPrimes(int numOfPrimes)
	{
		int count = 0;
		int number = 2;
		
		while (count < numOfPrimes)
		{
			if (isPrime(number))
			{
				count++;
				System.out.printf("%5s \t ", number);
				if (count % 10 == 0)
				{
					System.out.println();
				}
			}
			number++;
		}
	}

}
