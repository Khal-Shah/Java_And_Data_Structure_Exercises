package ch7exercises;
import java.util.Arrays;
import java.util.Scanner;

/* Chapter 7 - Exercise 31:
 * (Merge two sorted lists) Write the following method that merges two sorted lists into a new sorted list.
public static int[] merge(int[] list1, int[] list2)
Implement the method in a way that takes at most list1.length + list2. length comparisons. 
Write a test program that prompts the user to enter two sorted lists and displays the merged list. 
Here is a sample run. Note that the first number in the input indicates the number of the elements in the list. 
This number is not part of the list.
Enter list1: 5 1 5 16 61 111
Enter list2: 4 2 4 5 6
The merged list is 1 2 4 5 5 6 16 61 111
 */
		//By Khaled Shah

public class Ch7_31_Merge_Sorted
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		int [] list1 = getList(1);
		int [] list2 = getList(2);
		
		int [] mergedList = merge(list1, list2);
		
		display(mergedList);

	}
	
	public static int [] merge(int [] list1, int [] list2)
	{
		int [] merged = new int [list1.length + list2.length];
		
		//2 arrays [val1, val2....valn]
		//                [val1, val2...valn]
		
		//What we can do is just add the two arrays first and sort after:
		
		for (int i = 0; i < list1.length; i++)
		{
			merged[i] = list1[i];
		}
		
		for (int i = list1.length; i < merged.length; i++)
		{
			merged[i] = list2 [i - list1.length];
		}
		
		java.util.Arrays.sort(merged);
		
		return merged;
	}
	
	public static int [] getList(int listNum)
	{
		int size;
		int [] list;
		
		System.out.print("Enter list " + listNum + " (first number is the size): ");
		size = kb.nextInt();
		
		list = new int [size];
		
		for (int i = 0; i < size; i++)
		{
			list [i] = kb.nextInt();
		}
		
		 java.util.Arrays.sort(list);
		return list;
	}
	
	public static void display(int [] mergedList)
	{
		for (int e: mergedList)
		{
			System.out.print(e + "\t");
		}
	}
	
}
