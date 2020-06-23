package ch7exercises;
import java.util.*;

/* Chapter 7 - Exercise 18:
 * (Bubble sort) Write a sort method that uses the bubble-sort algorithm. The bubble- sort algorithm makes several 
 * passes through the array. On each pass, successive neighboring pairs are compared. If a pair is not in order, 
 * its values are swapped; otherwise, the values remain unchanged. The technique is called a bubble sort or sinking sort 
 * because the smaller values gradually “bubble” their way to the top and the larger values “sink” to the bottom. 
 * Write a test program that reads in ten double numbers, invokes the method, and displays the sorted numbers.
 */
		//By Khaled Shah

public class Ch7_18_BubbleSort
{

	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args)
	{

		double [] numbers = getNumbers();
		System.out.print("The numbers: ");
		displayNums(numbers);
		System.out.print(" sorted are: \n");
		numbers = bubbleSort(numbers);
		displayNums(numbers);
	}

	public static double [] getNumbers()
	{
		double [] nums = new double [10];
		
		System.out.println("Enter 10 numbers below: ");
		int i = 0;
		
		do
		{
			System.out.print("Enter number " + (i + 1) + ": ");
			nums [i++] = kb.nextDouble();
		} while (i < 10);
		
		return nums;
	}
	
	public static double [] bubbleSort (double [] nums)
	{
		//On each pass, successive neighboring pairs are compared. If a pair is not in order, 
		 // its values are swapped; otherwise, the values remain unchanged. 
		double temp;
		
		for (int i = 0; i < nums.length - 1; i++)
		{
			for (int j = 0; j < nums.length - 1 - i; j++)
			{
				if (nums[j] > nums [j + 1])		//if left > right
				{
					temp = nums [j];					//left (bigger) as temp
					nums [j] = nums [j + 1];		//move right (smaller) to left
					nums [j + 1] = temp;			//move bigger to right
				}
			}
		}
		
		return nums;
	}
	
	public static void displayNums(double [] nums)
	{
		
		for (double e: nums)
		{
			System.out.printf("%.0f\t", e);
		}
	}
}
