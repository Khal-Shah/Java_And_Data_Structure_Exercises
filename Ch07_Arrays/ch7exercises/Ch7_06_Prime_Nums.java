package ch7exercises;
import java.util.Scanner;

/* Chapter 7 - Exercise 6:
 * (Revise Listing 5.15, PrimeNumber.java) Listing 5.15 determines whether a number n is prime by checking whether 
 * 2, 3, 4, 5, 6, ..., n/2 is a divisor. If a divisor is found, n is not prime. A more efficient approach is to check whether any of
 * the prime numbers less than or equal to (sqrt n)  can divide n evenly. If not, n is prime. Rewrite listing 5.15 to
 * display the first 50 prime numbers using this approach. You need to use an array to store the prime numbers and 
 * later use them to check whether they are possible divisors for n.
 */
		//By Khaled Shah

public class Ch7_06_Prime_Nums
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		int[] primes = getPrimes();
		
		for (int e: primes)
		{
			System.out.print(e + " ");
		}
	}

	public static int[] getPrimes()
	{
		int[] primes = new int [50];
		int n = 2;
		int divisor = 2;
		int i = 0;
		
		while(i < 50)
		{
			if (isPrime(n, divisor))
			{
				primes[i++] = n;
			}
				n++; 
		}
		return primes;
	}
	
	public static boolean isPrime(int n, int divisor)
	{
		while (divisor <= (n/2))
		{
			if (n % divisor == 0)
			{
				return false;
			}
			divisor++;
		}
		return true;
	}
}
