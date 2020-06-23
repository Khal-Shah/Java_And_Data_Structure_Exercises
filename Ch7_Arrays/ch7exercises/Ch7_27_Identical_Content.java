package ch7exercises;
import java.util.Arrays;
import java.util.Scanner;

/* Chapter 7 - Exercise 27:
 * (Identical arrays) The arrays list1 and list2 are identical if they have the same contents. 
 * Write a method that returns true if list1 and list2 are identical, using the following header:
public static boolean equals(int[] list1, int[] list2)
Write a test program that prompts the user to enter two lists of integers and displays whether the two are identical. 
Here are the sample runs. Note that the first number in the input indicates the number of the elements in the list. 
This number is not part of the list.

Enter list1: 5 2 5 6 6 1
Enter list2: 5 5 2 6 1 6
Two lists are identical

Enter list1: 5 5 5 6 6 1
Enter list2: 5 2 5 6 1 6
Two lists are not identical
 */
		//By Khaled Shah

public class Ch7_27_Identical_Content
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{

		int [] list1 = getList1();
		int [] list2 = getList2();
		
		System.out.println("Two lists are " + ((equals(list1, list2))? "" : "not ") + "identical.");
		
		
	}
	
	public static boolean equals(int[] list1, int[] list2)
	{
		sort(list1);
		sort(list2);
		
		for (int i = 0; i < list1.length; i++)
		{
			if (list1 [i] != list2 [i])
			{
				return false;
			}
		}
		return true;
	}
	
	public static int[] sort (int [] list)
	{
		java.util.Arrays.sort(list);
		return list;
	}
	
	public static int [] getList1()
	{
		int [] list;
		
		System.out.print("Enter list1 (first number is the size): ");
		int size = kb.nextInt();
		int i = 0;
		list = new int [size];
		
		do
		{
			list [i++] = kb.nextInt();
		} while (i < size);
		
		return list;
	}
	
	public static int [] getList2()
	{
		int [] list;
		
		System.out.print("Enter list2 (first number is the size): ");
		int size = kb.nextInt();
		int i = 0;
		list = new int [size];
		
		do
		{
			list [i++] = kb.nextInt();
		} while (i < size);
		
		return list;
	}

}
