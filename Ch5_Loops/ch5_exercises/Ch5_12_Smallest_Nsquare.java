package ch5_exercises;
import java.util.*;

		/* Chapter 5 - Exercise 12:
		 * (Find the smallest n such that n^2 > 12,000) Use a while loop to find the smallest integer n such that n^2 is 
		 * greater than 12,000.
		 */
				//By Khaled Shah

public class Ch5_12_Smallest_Nsquare
{

	public static void main(String[] args)
	{
		int n = 0;
		int nSquared = 0;
		
		while (n < 12_000)
		{
			nSquared= (int) Math.pow(n, 2);
			if (nSquared > 12_000)
			{
				break;
			}
			n++;
		}
		
		System.out.println(n);
			

	}

}
