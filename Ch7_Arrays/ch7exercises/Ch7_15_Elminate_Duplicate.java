package ch7exercises;
import java.util.*;

/* Chapter 7 - Exercise 15:
 * (Eliminate duplicates) Write a method that returns a new array by eliminating the duplicate values in the array using 
 * the following method header:
public static int[] eliminateDuplicates(int[] list)
Write a test program that reads in ten integers, invokes the method, and displays
the result. Here is the sample run of the program:
Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
The distinct numbers are: 1 2 3 6 4 5
 */
		//By Khaled Shah

public class Ch7_15_Elminate_Duplicate
{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
		System.out.println("Enter ten integers: ");
		int [] list = new int [10];
		
		list = eliminateDuplicates(list);
		
		
		
		System.out.print("The distinct numbers are: ");
		for (int e: list)
		{
			System.out.print( ((e !=0)? e + " " : ""));
		}

	}
	
	public static int [] eliminateDuplicates (int...list)
	{
		int num;
		
		for (int i = 0; i < list.length; i++)
		{
			num = kb.nextInt();
			
			if (isNew(list, num))
			{
				list [i] = num;
			}
		}
		return list;
	}
	
	public static boolean isNew (int [] list, int n)
	{
		for (int e: list)
		{
			if (e == n)
			{
				return false;
			}
		}
		return true;
	}
	
	

}
