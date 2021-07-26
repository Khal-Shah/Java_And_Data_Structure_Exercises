package ch5_exercises;
import java.util.*;

/* Chapter 5 - Exercise 13:
 * (Find the largest n such that n^3 < 12,000)
 * Use a while loop to find the largest integer n such that n^3 is less than 12,000.
 */
		//By Khaled Shah

public class Ch5_13_Largest_NCubed
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		int n = 0;
		int nCubed = 0;
		
		while (nCubed < 12000)
		{
			nCubed = (int) (Math.pow(n, 3));
			
			if (nCubed >= 12000)
			{
				n -= 1;
				break;
			}
			
			n++;
		}
		
		System.out.println("The largest integer n such that n cubed is less than 12000 is " + n);
		

	}

}
