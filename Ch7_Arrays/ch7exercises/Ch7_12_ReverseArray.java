package ch7exercises;
import java.util.Scanner;

/* Chapter 7 - Exercise 12:
 * Reverse an array) The reverse method in Section 7.7 reverses an array by copying it to a new array. 
 * Rewrite the method that reverses the array passed in the argument and returns this array. 
 * Write a test program that prompts the user to enter ten numbers, invokes the method to reverse the numbers, 
 * and displays the numbers.
 */
		//By Khaled Shah

public class Ch7_12_ReverseArray
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		int [] numbers = getNums();
		int [] reversedNumbers = getReverse(numbers);
		
		displayReverse(reversedNumbers);
	}

	public static int [] getNums()
	{
		int [] nums = new int [10];
		int i = 0;
		
		System.out.print("Enter 10 numbers: ");
		
		while (i < nums.length)
		{
			nums[i++] = kb.nextInt();
		}
		return nums;
	}
	
	public static int [] getReverse(int [] nums)
	{
		int [] revNums = new int [nums.length];
		int i = nums.length - 1;
		int j = 0;
		
		for (int e: nums)
		{
			revNums [i--] = nums [j++];
		}
		return revNums;
	}
	
	public static void displayReverse(int [] revNums)
	{
		for (int e: revNums)
		{
			System.out.print(e + " ");
		}
	}
}
