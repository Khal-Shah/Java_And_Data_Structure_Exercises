package ch5_exercises;

/* Chapter 5 - Exercise 25:
 * (Compute p) You can approximate p by using the following series:
 * pi = 4 (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 +++ (-1)^(i+1) / 2i - 1 
 * Write a program that displays the p value for i = 10000, 20000, ..., and 100000.
 */
		//By Khaled Shah

public class Ch5_25_PI_Series
{

	public static void main(String[] args)
	{
		double pi = 0;
		for (int i = 1; i <= 100_000; i++)
		{
			pi +=  Math.pow(-1, i+1) / (2 * i - 1);
			
			if (i == 10_000)
			{
				System.out.println("At i = " + i + " PI is " + 4 * pi);
			}
			
			if (i == 20_000)
			{
				System.out.println("At i = " + i + " PI is " + 4 * pi);
			}
			
			if (i == 100_000)
			{
				System.out.println("At i = " + i + " PI is " + 4 * pi);
			}
		}
		
		

	}

}
