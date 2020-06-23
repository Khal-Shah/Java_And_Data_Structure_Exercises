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
		int totalNums = kb.nextInt();
		
		int [] userList = new int [totalNums];
		
		getUserList(userList);
		
		int [] sortedList = new int [totalNums];
	    System.arraycopy(userList, 0, sortedList, 0, totalNums);
		
		getSortedList(sortedList);
		
		System.out.println("The list is " + ((checkSorted(userList, sortedList))? "already sorted" : "not sorted"));
		

	}
	
	public static int [] getUserList (int [] list)
	{
		for (int i = 0; i < list.length; i++)
		{
			list [i] = kb.nextInt();
		}
		return list;
	}
	
	public static int [] getSortedList (int [] list)
	{
		int temp = 0;
		int minValue;
		int minIndex;
		
		for (int i = 0; i < list.length; i++)
		{
			minValue = list [i];
			minIndex = i;
			
			for (int j = i; j < list.length; j++)
			{
				if (list [j] < minValue)
				{
					minValue = list [j];
					minIndex = j;
				}
			}
			if (minValue != list [i])
			{
				temp = list [i];
				list [i] = list [minIndex];
				list [minIndex] = temp;
			}
		}
		return list;
	}
	
	public static boolean checkSorted (int [] list1, int [] list2)
	{
		for (int i = 0; i < list1.length; i++)
		{
			if (list1 [i] != list2[i])
			{
				return false;
			}
		}
		return true;
	}

}
