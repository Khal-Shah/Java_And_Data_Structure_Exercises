package ch7notes;
import java.util.*;


/* Chapter 7 - Exercise 20:
 * (Revise selection sort) In Section 7.11, you used selection sort to sort an array.
 * The selection-sort method repeatedly finds the smallest number in the current array and swaps it with the first.
 * Rewrite this program by finding the largest number and swapping it with the last.
 * Write a test program that reads in ten double numbers, invokes the method, and displays the sorted numbers.
 */
//By Khaled Shah

public class Ch7_practice
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		double[] list;

		list = getList(10);
		//selection sort but: find maxValue and swap with list.length - 1
		sortList(list);		//so we can sort list with a void function

		displaySortedList(list);
	}

	static void displaySortedList(double[] list)
	{
		System.out.print("The sorted list is: ");
		for(double e: list)
		{
			System.out.print(e + ", ");
		}
	}

	static void sortList(double[] list)
	{
		double maxValue;
		int maxIndex;

		for(int i = list.length - 1; i >= 0; i--)
		{
			maxIndex = i;
			maxValue = list[i];

			for(int j = i; j >= 0; j--)
			{
				if(list[j] > maxValue)
				{
					maxValue = list[j];
					maxIndex = j;
				}
			}
			if(maxIndex != i)
			{
				list[maxIndex] = list[i];		//put the small value from right where we found the max value
				list[i] = maxValue;			//put the max value far right
			}
		}
	}

	static double[] getList(int size)
	{
		double[] list = new double[size];

		for(int i = 0; i < list.length; i++)
		{
			System.out.print("Enter entry " + (i + 1) + ") ");
			list[i] = kb.nextDouble();
		}
		return list;
	}


}

