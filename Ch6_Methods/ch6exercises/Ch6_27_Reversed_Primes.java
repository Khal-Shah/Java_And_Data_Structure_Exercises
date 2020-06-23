package ch6exercises;

/* Chapter 6 - Exercise 27:
 * (Emirp) An emirp (prime spelled backward) is a nonpalindromic prime number whose reversal is also a prime. 
 * For example, 17 is a prime and 71 is a prime, so 17 and 71 are emirps. 
 * Write a program that displays the first 100 emirps. 
 * Display 10 numbers per line, separated by exactly one space, as follows:
         13 17 31 37 71 73 79 97 107 113
         149 157 167 179 199 311 337 347 359 389
         ...
 */
		//By Khaled Shah

public class Ch6_27_Reversed_Primes
{

	public static void main(String[] args)
	{
		printEmirp(100);
	}
	
	public static boolean isNotPalindromic(int number)
	{
		int temp = number;
		int reverse = 0;
		int currentDig;
		do 
		{
			currentDig = number % 10;
			reverse = (reverse * 10) + currentDig;		//shifts previousDig left
			number /= 10;
		} while(number > 0);
		
		return (!(temp == reverse));
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
	
	public static void printEmirp(int numOfPrimes)
	{
		int count = 0;
		int number = 2;
		
		while (count < numOfPrimes)
		{
			if (isPrime(number) && isNotPalindromic(number) && reverseIsPrime(number))
			{
				count++;
				System.out.print(number + "\t");
				if (count % 10 == 0)
				{
					System.out.println();
				}
			}
			number++;
		}
	}
	
	public static boolean reverseIsPrime(int number)
	{
		int reverse = 0;
		int currentDig;
		do 
		{
			currentDig = number % 10;
			reverse = (reverse * 10) + currentDig;		//shifts previousDig left
			number /= 10;
		} while(number > 0);
		
		return isPrime(reverse);
	}

}
