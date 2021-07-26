package ch7exercises;
import java.util.Scanner;
import java.util.Arrays;

/* Chapter 7 - Exercise 26
 * (Strictly identical arrays) The arrays list1 and list2 are strictly identical if their corresponding elements are equal. 
 * Write a method that returns true if list1 and list2 are strictly identical, using the following header:
public static boolean equals(int[] list1, int[] list2)
Write a test program that prompts the user to enter two lists of integers and displays whether the two are strictly identical. 
Here are the sample runs. 
Note that the first number in the input indicates the number of the elements in the list. This number is not part of the list.

Enter list1: 5 2 5 6 1 6
Enter list2: 5 2 5 6 1 6
Two lists are strictly identical

Enter list1: 5 2 5 6 6 1
Enter list2: 5 2 5 6 1 6
Two lists are not strictly identical
 */
		//By Khaled Shah

public class Ch7_26_Strictly_Identical
{

	static Scanner kb = new Scanner (System.in);
	static int listNum = 1;
	
	public static void main(String[] args)
	{

		int [] list1 = getList();
		int [] list2 = getList();
		
		System.out.println("Two lists are " + ((equals(list1, list2))? "" : "not ") + "strictly identical.");
		
	}
	
	public static boolean equals(int[] list1, int[] list2)
	{
		return (Arrays.equals(list1, list2));
	}
	
	public static int [] getList()
	{
		int [] list;
		
		System.out.print("Enter list " + listNum++ + " (first number is the size): ");
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
