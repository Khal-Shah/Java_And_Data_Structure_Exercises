package ch5_exercises;

/* Chapter 5 - Exercise 33:
 * (Perfect number) A positive integer is called a perfect number if it is equal to the sum of all of its positive divisors, 
 * excluding itself. For example, 6 is the first perfect number because 6 = 3 + 2 + 1. 
 * The next is 28 = 14 + 7 + 4 + 2 + 1. There are four perfect numbers less than 10,000. 
 * Write a program to find all these four numbers.
 */
		//By Khaled Shah

public class Ch5_33_Perfect_Num
{

	public static void main(String[] args)
	{
		//isPerfect ==> (num % i == 0) +++ = num
		int num = 6;
		int divisor;
		int sum = 0;
		
		while (num <= 10000)
		{
			for (divisor = 1; (divisor <= (num / 2)); divisor++)
			{
				if (num % divisor == 0)
				{
					sum += divisor;
				}
			}
			
			if (num == sum)
			{
				System.out.println(num);
			}
			sum = 0;
			num++;
		}

	}

}
