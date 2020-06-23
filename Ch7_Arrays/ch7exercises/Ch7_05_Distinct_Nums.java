package ch7exercises;
import java.util.*;

/* Chapter 7 - Exercise 5:
 * (Print distinct numbers) Write a program that reads in ten numbers and displays the number of distinct numbers 
 * and the distinct numbers separated by exactly one space (i.e., if a number appears multiple times, it is displayed 
 * only once). 
 * (Hint: Read a number and store it to an array if it is new. If the number is already in the array, ignore it.) 
 * After the input, the array contains the distinct numbers. 
 * 
 * Here is the sample run of the program:
 * 
 * Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
The number of distinct number is 6
The distinct numbers are: 1 2 3 6 4 5
 */
		//By Khaled Shah

public class Ch7_05_Distinct_Nums
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		int [] nums = new int [10];
        int index = 0;
        
        System.out.print("Enter ten numbers: ");


        for (int i = 0; i < nums.length; i++) 
        {
            int num = kb.nextInt();

            if (isNew(nums, num)) 
            {
                nums [index++] = num;
            }
        }
        
        System.out.println("The number of distinct number is " + index);
        System.out.print("The distinct numbers are: ");
        
        for (int i = 0; i < index; i++) 
        {
            System.out.print(nums[i] + " ");
		}
	}
	
	public static boolean isNew (int [] numbers, int n) 
	{
        for (int i : numbers)
        {
            if (n == i) 
            	{
            		return false;
            	}
        }
        return true;
    }

}
