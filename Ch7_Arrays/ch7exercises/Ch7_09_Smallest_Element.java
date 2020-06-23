package ch7exercises;
import java.util.*;

/* Chapter 7 - Exercise 9:
 * (Find the smallest element) Write a method that finds the smallest element in an array of double values using the 
 * following header:
public static double min(double[] array)
Write a test program that prompts the user to enter ten numbers, invokes this method to return the minimum value, 
and displays the minimum value. 

Here is a sample run of the program:
Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2
The minimum number is: 1.5
 */

		//By Khaled Shah

public class Ch7_09_Smallest_Element
{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
		double [] userNums = createArray();
		
		System.out.println("The minimum number is " + min(userNums));

	}
	
	public static double [] createArray()
	{
		System.out.print("Enter ten numbers: ");
		double [] usrNms = new double [10];
		
		for (int i = 0; i < usrNms.length; i++)
		{
			usrNms [i] = kb.nextDouble();
		}
		return usrNms;
	}
	
	public static double min (double [] array)
	{
		double min = array [0];
		
		for (int i = 0; i < array.length; i++)
		{
			if (array [i] < min)
			{
				min = array [i];
			}
		}
		return min;
	}

}
