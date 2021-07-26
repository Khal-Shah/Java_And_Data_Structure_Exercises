package ch5_exercises;

/* Chapter 5 - Exercise 43:
 * (Math: combinations) Write a program that displays all possible combinations for picking two numbers 
 * from integers 1 to 7. Also display the total number of all combinations.
 * 1	2 
 * 1	3 
 * ...
 * ...
	The total number of all combinations is 21
 */
		//By Khaled Shah

public class Ch5_43_Num_Combinations
{

	public static void main(String[] args)
	{
		//C(n,r) = n!/(n−r)!r!
		// C(7, 2) = 7!/(5!)2! = 7! / (2) (120) = 5040 / 240 = 21 
		//But this problem is really asking for permutation (since order does matter)
		//Once 1 2 is printed, can't print 2 1
		
		int count = 0;
		String comb = "";
		
		for (int i = 1; i <= 7; i++)
		{
			for (int j = 1; j <= 7; j++)
			{
				
				if (!(j == i || (comb.contains(j + "\t" + i))))
				{
					comb += "\n" + i + "\t" + j;
					count += 1;
				}
			}

		}
		
		System.out.println(comb);
		
		System.out.println("The total number of combinations is " + count); 
		
		 

	}

}
