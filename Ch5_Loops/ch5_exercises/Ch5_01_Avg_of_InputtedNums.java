package ch5_exercises;
import java.util.*;

		/* Chapter 5 - Exercise 1:
		 * (Count positive and negative numbers and compute the average of numbers) Write a program that reads an 
		 * unspecified number of integers, determines how many positive and negative values have been read, and 
		 * computes the total and average of the input values (not counting zeros). Your program ends with the input 0. 
		 * Display the average as a floating-point number. 
		 * 
		 * Here is a sample run:
		 * Enter an integer, the input ends if it is 0: 1 2 -1 3 0
			The number of positives is 3
			The number of negatives is 1
			The total is 5.0
			The average is 1.25
			
			Enter an integer, the input ends if it is 0: 0
			No numbers are entered except 0
		 */
				//By Khaled Shah

public class Ch5_01_Avg_of_InputtedNums
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int n = kb.nextInt();
		double avg = 0;			//	total/(pos + neg)
		int posN = 0;
		int negN = 0;
		double total = 0; 
		
		if (n == 0)
		{
			System.out.println("No numbers are entered except 0");
		}
		
		while (n != 0)
		{
			if (n > 0)
			{
				posN += 1;
			}
			
			else 
			{
				negN += 1;
			}
			
			total += n;
			n = kb.nextInt();
		}
		
		avg = (total / (posN+negN));
		
		System.out.println("The number of positives is: " + posN + "\nThe number of negatives is: " + negN + "\nThe total "
				+ "is: " + total + "\nThe average is: " +avg);
		

	}

}
