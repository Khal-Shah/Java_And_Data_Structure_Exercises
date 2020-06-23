package ch7exercises;
import java.util.*;

/* Chapter 7 - Exercise 10:
 * (Find the index of the smallest element) Write a method that returns the index of the smallest element in an array of 
 * integers. If the number of such elements is greater than 1, return the smallest index. Use the following header:
public static int indexOfSmallestElement(double[] array)
Write a test program that prompts the user to enter ten numbers, invokes this
method to return the index of the smallest element, and displays the index.
 */

public class Ch7_10_IndexOf_Smallest_E
{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
		
		double [] userNums = createUserNums();
		
		System.out.println("The index of the smallest element is: " + indexOfSmallestElement(userNums));

	}
	
	public static int indexOfSmallestElement (double [] array)
	{
		int smallestElementIndex = 0;
		double smallestElement = array [0];
		
		for (int i = 0; i < array.length; i++)
		{
			if (array [i] < smallestElement)
			{
				smallestElement = array [i];
				smallestElementIndex = i;
			}
		}
		return smallestElementIndex;
	}
	
	public static double [] createUserNums()
	{
		System.out.print("Enter ten numbers: ");
		double [] usrNms = new double [10];
		
		for (int i = 0; i < usrNms.length; i++)
		{
			usrNms [i] = kb.nextInt();
		}
		return usrNms;
	}

}
