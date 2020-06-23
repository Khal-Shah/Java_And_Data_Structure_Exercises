package ch7exercises;
import java.util.*;

/* Chapter 7 - Exercise 8:
 * (Average an array) Write two overloaded methods that return the average of an array with the following headers:
public static int average(int[] array) 
public static double average(double[] array)
Write a test program that prompts the user to enter ten double values, invokes this method, and 
displays the average value.
 */

public class Ch7_08_AvgOfArray
{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter 10 double values: ");
		double [] userVals = new double [10];
		
		for (int i = 0; i < userVals.length; i++)
		{
			userVals [i] = kb.nextDouble();
		}
		
		double average = average(userVals);
		
		System.out.println(average);
		
	}
	
	public static int average (int [] array)
	{
		int sum = 0;
		
		for (int e: array)
		{
			sum += e; 
		}
		return (sum / array.length);
	}
	
	public static double average (double [] array)
	{
		double sum = 0;
		
		for (double e: array)
		{
			sum += e; 
		}
		return (sum / array.length);
	}

}
