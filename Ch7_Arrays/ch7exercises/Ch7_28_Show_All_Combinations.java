package ch7exercises;
import java.util.Scanner;

/* Chapter 7 - Exercise 28:
 * (Math: combinations) Write a program that prompts the user to enter 10 integers and displays all combinations 
 * of picking two numbers from the 10.
 */
		//By Khaled Shah

public class Ch7_28_Show_All_Combinations
{
	
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{

		int [] list = getList();
		showCombinations(list);
	}
//if (!(j == i || (comb.contains(j + "\t" + i))))
	static void showCombinations(int[] list)
	{
		String nums = "";

		for(int i = 0; i < list.length; i++)
		{
			for(int j = i + 1; j < list.length; j++)
			{
				if(!(list[j] == list[i] || (nums.contains(list[i] + ", " + list[j]))) && !isDuplicate(i, list))
				{
					nums += list[i] + ", " + list[j] + "\t";
				}
			}
			//nums += "\n";
		}
		System.out.println(nums);
	}

	static boolean isDuplicate(int index, int[] list)
	{
		for(int i = index + 1; i < list.length; i++)
		{
			if(list[index] == list[i])
			{
				return true;
			}
		}
		return false;
	}
	
	public static int [] getList()
	{
		int [] userNums = new int [10];
		
		System.out.print("Enter " + userNums.length + " integers: ");
		
		for (int i = 0; i < userNums.length; i++)
		{
			userNums [i] = kb.nextInt();
		}
		return userNums;
	}
	
//	public static void displayCombinations(int [] list)
//	{
//		//displays all combinations  of picking two numbers from the 10.
//		 int count = 0;
//		 String comb = "";
//
//		for (int i = 0; i < list.length; i++)
//		{
//			for (int j = 0; j < list.length; j++)
//			{
//				if (i != j && !comb.contains(list[j] + "->" + list[i]))
//				{
//					count++;
//					comb += (list [i] + "->" + list [j] + "\t");
//				}
//			}
//			comb += "\n";
//		}
//		System.out.print(comb);
//		System.out.println("Total: " + count);
//	}

}
