package ch5_exercises;

/* Chapter 5 - Exercise 10:
 * (Find numbers divisible by 5 and 6) Write a program that displays all the numbers from 100 to 1,000, ten per line, 
 * that are divisible by 5 and 6. Numbers are separated by exactly one space.
 */
		//By Khaled Shah

public class Ch5_10_DivisibleBy
{
	static final int LOWER_BOUND = 100;
	static final int HIGHER_BOUND = 1000;

	public static void main(String[] args)
	{
		int n;
		boolean divisible;
		int count = 0;
		
		for (n = LOWER_BOUND; n <= HIGHER_BOUND; n++)
		{
			divisible = ((n % 5 == 0) && (n % 6 == 0));
			count += (((divisible)? 1 : 0));
			System.out.print(((divisible)? n + " " : "") + ((count % 10 == 0 && (divisible))? "\n" : ""));
		
		}
		//System.out.println(count);
			

	}

}
