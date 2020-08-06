package ch7exercises;
import java.util.Arrays;
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
		int[] list = getNums();
		int pivotIndex = partition(list);
		int[] partitionList = getPartitionList(list, pivotIndex);

		System.out.print("After the partition, the list is  ");
		for(int e: partitionList)
		{
			System.out.print(e + " ");
		}

	}

	static int[] getPartitionList(int[] list, int pivotIndex)
	{
		//pivotIndex is where the pivot should be.
		int pivot = list[0];

		int[] partitionList = new int[list.length];
		partitionList[pivotIndex] = pivot;
		//put all smaller elements to left of pivotIndex and bigger to the right
		int biggerIndex = partitionList.length - 1;
		int smallerIndex = 0;
		int[] morePivots = new int[10];
		int index = pivotIndex + 1;

		for(int i = 1; i < partitionList.length; i++)
		{
//			if(i == pivotIndex)
//			{
//				continue;
//			}

			if(list[i] < pivot)
			{
				partitionList[smallerIndex++] = list[i];
			}

			else if(list[i] > pivot)
			{
				partitionList[biggerIndex--] = list[i];
			}

//			else if(list[i] == pivot)
//			{
//				int temp = partitionList[pivotIndex + 1];
//				//11 12 94 24 59 60 (so 12 goes to 94's place, 94 to 24's and so on)...need to store the next one
//				for(int j = pivotIndex + 2; j < list.length - 1; j++)
//				{
//					partitionList[j + 1] = partitionList[j];
//				}
//				partitionList[partitionList.length - 1] = temp;
//				partitionList[pivotIndex + 1] = pivot;
//			}

			else if(list[i] == pivot)
			{
				morePivots[index++] = list[i];
			}

		}

		int morePivotCount = 0;
		for(int i = 0; i < morePivots.length; i++)
		{
			if(morePivots[i] != 0)
			{
				morePivotCount++;
			}
		}

		index = pivotIndex + 1;

		if (morePivotCount > 0)
		{
			for (int i = pivotIndex + 1; i < (pivotIndex + 1 + morePivotCount); i++)
			{
				partitionList[i] = morePivots[index++];
			}
		}

		return partitionList;
	}

	public static int partition(int[] list)
	{
		int pivot = list[0];
		int smallerElements = 0;

		for(int i = 0; i < list.length; i++)
		{
			if(list[i] < pivot)
			{
				smallerElements++;
			}
		}
		return(smallerElements);
	}

	static int[] getNums()
	{
		System.out.print("Enter size of list" + ": ");
		int size = kb.nextInt();

		int[] list = new int[size];

		for(int i = 0; i < size; i++)
		{
			System.out.print("Enter entry " + (i + 1) + ": ");
			list[i] = kb.nextInt();
		}
		return list;
	}

}
