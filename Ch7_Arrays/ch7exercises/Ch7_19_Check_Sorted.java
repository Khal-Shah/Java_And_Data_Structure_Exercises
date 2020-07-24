package ch7exercises;
import java.util.*;

/* Chapter 7 - Exercise 19
 * (Sorted?) Write the following method that returns true if the list is already sorted in increasing order.
public static boolean isSorted(int[] list)
Write a test program that prompts the user to enter a list and displays whether the list is sorted or not. 
Here is a sample run. 
Note that the first number in the input indicates the number of the elements in the list. This number is not part of the list.
Enter list: 8 10 1 5 16 61 9 11 1
The list is not sorted
      Enter list: 10 1 1 3 4 4 5 7 9 11 21
The list is already sorted
 */
		//By Khaled Shah

public class Ch7_19_Check_Sorted
{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter list: ");
		int size = kb.nextInt();

		int[] list = getList(size);
		int[] sortedList = getSortedList(list);

		System.out.println("The list is" + ((isSorted(list, sortedList))? " already" : " not") + " sorted.");

	}

	static int[] getSortedList(int[] list)
	{
		int[] sortedList;
		sortedList = populateSortedList(list);

		int currentMinVal;
		int currentMinIndex;

		for(int i = 0; i < sortedList.length; i++)
		{
			currentMinVal = sortedList[i];
			currentMinIndex = i;

			for (int j = i + 1; j < sortedList.length; j++)
			{
				if(sortedList[j] < currentMinVal)
				{
					currentMinVal = sortedList[j];
					currentMinIndex = j;
				}
			}

			if(currentMinIndex != i)
			{
				sortedList[currentMinIndex] = sortedList[i];
				sortedList[i] = currentMinVal;
			}
		}
		return sortedList;
	}

	static int[] populateSortedList(int[] list)
	{
		int[] sortedList = new int[list.length];
//		int i = 0;
//		for(int e: list)
//		{
//			sortedList[i++] = e;
//		}
		//instead of populating E by E, we can use System.arraycopy(srcArr, srcPos, targetArr, targetPos, length
		System.arraycopy(list, 0, sortedList, 0, list.length);

		return sortedList;
	}

	static boolean isSorted(int[] list, int[] sortedList)
	{
		//int[] sortedList = list;			//makes list the same as sortedList, changing sortedList will reflect on list too!
		int i = 0;
		do
		{
			if(list[i] != sortedList[i])
			{
				return false;
			}
			i++;
		}while (i < list.length);

		return true;
	}

	static int[] getList(int sz)
	{
		int[] list = new int[sz];

		for(int i = 0; i < sz; i++)
		{
			list[i] = kb.nextInt();
		}
		return list;
	}


}