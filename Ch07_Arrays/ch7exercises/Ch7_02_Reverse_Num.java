package ch7exercises;
import java.util.Scanner;

/* Chapter 7 - Exercise 2:
 * (Reverse the numbers entered) Write a program that reads ten integers and displays them in the reverse of the 
 * order in which they were read.
 */
		//By Khaled Shah

public class Ch7_02_Reverse_Num
{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
		
		readNums();

	}
	
	// with methods
	public static void readNums()
	{
		System.out.println("Enter 10 integers. ");
		int[] list = new int[10];
		
		for (int i = 0; i < list.length; i++)
		{
			System.out.print("Enter integer " + (1 + i) + ": ");
			list[i] = kb.nextInt();
		}
		reverseNums(list);
	}
	
	public static int[] reverseNums(int[] list)
	{
		int[] reversed = new int[list.length];
		int j = 0;
		
		for (int i = (list.length - 1); i >= 0; i--)
		{
			reversed[j] = list[i];
			j++;
		}
		
		showReverse(list, reversed);
		return list;
	}
	
	public static void showReverse(int[] ogList, int[] reverseList)
	{
		System.out.println("The original list was: ");
		
		for (int e: ogList)
		{
			System.out.print(e + "\t");
		}
		
		System.out.println("\nAnd the reversed list is: ");
		
		for (int e: reverseList)
		{
			System.out.print(e + "\t");
		}
	}

}
