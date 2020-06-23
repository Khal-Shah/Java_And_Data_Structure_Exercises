package ch18exercises;

import java.util.Scanner;

/* Chapter 18 - Exercise 13:
 * (Find the largest number in an array)
 * Write a recursive method that returns the largest integer in an array. 
 * Write a test program that prompts the user to enter a list of eight integers and displays the largest element.
 */
public class _13_LargestNum_inArray
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter a list of 8 integers: ");
		int [] list = takeInputs();
		
		System.out.println("The largest integer you entered is " + maxNum(list));
	}

	public static int [] takeInputs()
	{
		int [] list = new int [8];
		
		for(int i = 0; i < list.length; i++)
		{
			list[i] = kb.nextInt();
		}
		return list;
	}
	
	public static int maxNum(int[] list)			//say list is 1, 3, 9, 5, 6, 4, 8, 8
	{
		return maxNum(list, 0, list[0]);
	}
	
	public static int maxNum(int [] list, int n, int high)		//helper method
	{
		if (n == list.length)
		{
			return high;
		}
		
		if (list[n] > high)
		{
			high = list[n];
		}
		
		return maxNum(list, n + 1, high);
		}
}
