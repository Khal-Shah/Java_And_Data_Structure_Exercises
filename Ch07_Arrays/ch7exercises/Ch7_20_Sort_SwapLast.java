package ch7exercises;
import java.util.Scanner;

/* Chapter 7 - Exercise 20:
 * (Revise selection sort) In Section 7.11, you used selection sort to sort an array. 
 * The selection-sort method repeatedly finds the smallest number in the current array and swaps it with the first. 
 * Rewrite this program by finding the largest number and swapping it with the last. 
 * Write a test program that reads in ten double numbers, invokes the method, and displays the sorted numbers.
 */
	//By Khaled Shah

public class Ch7_20_Sort_SwapLast
{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{

		double [] numbers = getNums();
		sortNums(numbers);
		
	}
	
	public static double [] getNums()
	{
		System.out.print("Enter 10 double numbers: ");
		double [] userNums = new double [10];
		
		for (int i = 0; i < userNums.length; i++)
		{
			userNums[i] = kb.nextDouble();
		}
		
		return userNums;
	}
	
	public static void sortNums(double [] list)
	{
		//find largest and swap it with the last. 
		int biggestIndex;
		double biggestValue;
		
		for (int i = list.length - 1; i >= 0; i--)
		{
			biggestIndex = i;
			biggestValue = list [i];
			
			for (int j = i; j >= 0; j--)
			{
				if (list [j] > biggestValue)
				{
					biggestValue = list [j];
					biggestIndex = j;
				}
			}
			
			if (biggestIndex != i)
			{
				list [biggestIndex] = list [i];
				list [i] = biggestValue;
			}
		}
		
		displaySorted(list);
	}
	
	public static void displaySorted(double [] list)
	{
		for (double e: list)
		{
			System.out.print(e + "\t");
		}
	}

}
