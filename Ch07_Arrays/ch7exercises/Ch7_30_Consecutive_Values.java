package ch7exercises;

import java.util.Scanner;

/* Chapter 7 - Exercise 30:
 * (Pattern recognition: consecutive four equal numbers) Write the following method that tests whether the array has four 
 * consecutive numbers with the same value.
public static boolean isConsecutiveFour(int[] values)
Write a test program that prompts the user to enter a series of integers and displays if the series contains four 
consecutive numbers with the same value. 
Your program should first prompt the user to enter the input size—i.e., the number of values in the series. 

Here are sample runs:

Enter the number of values: 8
Enter the values: 3 4 5 5 5 5 4 5
The list has consecutive fours

Enter the number of values: 9
Enter the values: 3 4 5 5 6 5 5 4 5
The list has no consecutive fours
 */
	//By Khaled Shah

public class Ch7_30_Consecutive_Values
{

	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int [] list = getValues();
		
		System.out.print("The list has " + ((isConsecutiveFour(list))? "" : "no ") + "consecutive fours.");
	}
	
	public static boolean isConsecutiveFour (int [] values)
	{
		//boolean isConsecutive = false; 
		int count = 0;
		
		for (int i = 0; i < values.length; i++)
		{
			int j = i;
			
			if (i == (values.length - 3))
			{
				break;
			}
			
			while (j <= (i + 3))
			{
				if (values [i] == values [j])
				{
					//isConsecutive = true; 
					count++;
					
					if (count == 4)
					{
						return true;
					}
				}
				
				else
				{
					//isConsecutive = false;
					count = 0;
				}
				j++;
			}
		}
		return false;
	}

	//Can also do with just one loop:
//	public static boolean isConsecutiveFour(int[] values)
//	{
//		int count = 1;	//because if first two are a match then that's TWO (and not one)
//		int i = 0;
//
//		while(i < (values.length - 1))
//		{
//			if(values[i] == values[i + 1])
//			{
//				count++;
//
//				if(count >= 4)
//				{
//					return true;
//				}
//			}
//
//			else
//			{
//				count = 1;
//			}
//			i++;
//		}
//
//		return ((count >= 4)? true: false);
//	}
//
	public static int [] getValues()
	{
		int size = 0;
		
		System.out.print("Enter the number of values: ");
		size = kb.nextInt();
		System.out.print("Enter the values: ");
		int i = 0;
		int [] vals = new int [size];
		
		do
		{
			vals [i++] = kb.nextInt();
		} while (i < size);
		
		return vals;
	}

}
