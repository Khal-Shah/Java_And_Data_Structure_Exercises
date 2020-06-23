package ch7notes;
import java.util.*;

/* Chapter 7 - Exercise 3:
 * (Count occurrence of numbers) Write a program that reads the integers between 1 and 100 and counts the 
 * occurrences of each. Assume the input ends with 0. 
 * 
 * Here is a sample run of the program:
 * Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0
2 occurs 2 times
3 occurs 1 time
4 occurs 1 time
5 occurs 2 times
6 occurs 1 time
23 occurs 1 time
43 occurs 1 time
Note that if a number occurs more than one time, the plural word “times” is used in the output.
 */
		//By Khaled Shah

public class Ch7_practice
{
	static Scanner kb = new Scanner(System.in);
	

	public static void main(String[] args)
	{
		int [] list = getNums();
		displayOccurences(list);
		
	}
	
	public static int [] getNums()
	{
		int [] nums = new int [100];
		int i = 0;
		System.out.println("Enter integers between 1 and 100 (0 to end): ");
		
		while ((nums [i] = kb.nextInt()) != 0)
		{
			i++;
			
			if (i == 99)
			{
				break;
			}
		}
		return nums;
	}
	
	public static void displayOccurences(int[] list)
	{
		int [] occurences = new int [list.length];
		
		for (int i = 0; i < list.length; i++)
		{
			occurences[list[i]]++;
			if (list[i] == 0)
			{
				break;
			}
		}
		
		int i = 1;
		
		for (int e: occurences)
		{
			System.out.print((occurences[i] == 0)? "" : i + " occurs " + occurences[i] + " times.\n");
			i++;
			if (i >= 99)
			{
				break;
			}
		}
	}
	
}

