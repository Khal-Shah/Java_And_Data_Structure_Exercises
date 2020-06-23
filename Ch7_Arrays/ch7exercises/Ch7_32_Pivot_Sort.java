package ch7exercises;
import java.util.Scanner;

/* Chapter 7 - Exercise 32:
 * (Partition of a list) Write the following method that partitions the list using the first element, called a pivot.
public static int partition(int[] list)
After the partition, the elements in the list are rearranged so that all the elements before the pivot are less than or equal to 
the pivot and the elements after the pivot are greater than the pivot. 
The method returns the index where the pivot is located in the new list. 
For example, suppose the list is {5, 2, 9, 3, 6, 8}. After the partition, the list becomes {3, 2, 5, 9, 6, 8}. 
Implement the method in a way that takes at most list.length comparisons. 

Write a test program that prompts the user to enter a list and displays the list after the partition. 
Here is a sample run. Note that the first number in the input indicates the number of the elements in the list. 
This number is not part of the list.

Enter list: 8 10 1 5 16 61 9 11 1
After the partition, the list is 9 1 5 1 10 61 11 16
 */
	//By Khaled Shah

public class Ch7_32_Pivot_Sort
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		int [] list = getList();
		int pivotIndex = partition(list);
		
		displayPartition(list, pivotIndex);

	}
	
	public static int partition(int [] list)
	{
		//The method returns the index where the pivot is located in the new list.
	
		int pivot = list [0];
		int smaller = 0;
		
		for (int i = 1; i < list.length; i++)
		{
			if (list [i] < pivot)
			{
				smaller++;
			}
		}
		return smaller;
	}
	
	public static int [] getList()
	{
		System.out.print("Enter list (first numbe is the size): ");
		int sz = kb.nextInt();
		int [] list = new int [sz];
		
		for (int i = 0; i < sz; i++)
		{
			list [i] = kb.nextInt();
		}
		return list;
	}
	
	public static void displayPartition(int [] list, int pivotIndex)
	{
		int pivotVal = list[0];
		//all smaller val go to left of pivotIndex
		int index = 0;
		int [] newList = new int [list.length];
		newList [pivotIndex] = pivotVal;
		
		for (int i = 0; i < list.length; i++)
		{
			if (index == pivotIndex)
			{
				index++;
			}
			
			if (list [i] < pivotVal)
			{
				newList[index++] = list[i];
			}
		}
		
		index = pivotIndex + 1;
		
		for (int i = 0; i < list.length; i++)
		{
			
			if (index == pivotIndex)
			{
				index++;
			}
			
			if (list[i] > pivotVal)
			{
				newList[index++] = list[i];
			}
		}
		
		for (int e: newList)
		{
			System.out.print(e + "\t");
		}
	}

}
