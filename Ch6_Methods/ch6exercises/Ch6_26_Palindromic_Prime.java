package ch6exercises;

/* Chapter 6 - Exercise 26:
 * (Palindromic prime) A palindromic prime is a prime number and also palindromic. For example, 131 is a prime and 
 * also a palindromic prime, as are 313 and 757. Write a program that displays the first 100 palindromic prime numbers. 
 * Display 10 numbers per line, separated by exactly one space, as follows:
         2 3 5 7 11 101 131 151 181 191
         313 353 373 383 727 757 787 797 919 929
         ...
 */
		//By Khaled Shah

public class Ch6_26_Palindromic_Prime
{

	public static void main(String[] args)
	{
		
		printPalindromicPrimes(100);						//print the first 100 #s

	}
	
	public static boolean isPalindromic(int number)
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
		
		return (temp == reverse);
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
	
	public static void printPalindromicPrimes(int numOfPrimes)
	{
		int count = 0;
		int number = 2;
		
		while (count < numOfPrimes)
		{
			if (isPrime(number) && isPalindromic(number))
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

}
