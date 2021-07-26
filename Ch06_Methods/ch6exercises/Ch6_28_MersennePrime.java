package ch6exercises;

/* Chapter 6 - Exercise 28:
 * (Mersenne prime) A prime number is called a Mersenne prime if it can be written in the form 2^(p) - 1 
 * for some positive integer p. Write a program that finds all Mersenne primes with p <= 31
 * and displays the output as follows:
 * p 				2^p –1
	2				3
	3 				7
	5 				31
 */
		//By Khaled Shah

public class Ch6_28_MersennePrime
{

	public static void main(String[] args)
	{
		displayMersennePrimes();
	}
	
	public static void displayMersennePrimes()
	{
		int p = 2;
		System.out.println("p\t\t2^p-1");
		
		while (p <= 31)
		{
			System.out.print(((isMersennePrime(p))? p + "\t\t" + getMersennePrime(p) + "\n": ""));
			p++;
		}
	}
	
	public static boolean isPrime(int num)
	{
		int divisor = 2;
		boolean isPrime = true;
		
		while (divisor <= (num / 2.0))
		{
			if (num % divisor == 0)
			{
				return false;
			}
			divisor++;
		}
		return isPrime;
	}
	
	public static boolean isMersennePrime(int num)
	{
		boolean isMersennePrime = true;
		
		if (!(isPrime(num) && isPrime(getMersennePrime(num))))
		{
			return false;
		}
			
		return isMersennePrime;
	}
	
	public static int getMersennePrime(int p)
	{
		return (int) (Math.pow(2, p) - 1);
	}

}
