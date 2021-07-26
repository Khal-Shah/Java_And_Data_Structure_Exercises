package ch5_exercises;
import java.util.Scanner;

/* Chapter 5 - Exercise 41;
 * (Occurrence of max numbers) Write a program that reads integers, finds the largest of them, and counts its 
 * occurrences. Assume that the input ends with number 0. Suppose that you entered 3 5 2 5 5 5 0; the program finds 
 * that the largest is 5 and the occurrence count for 5 is 4.
	(Hint: Maintain two variables, max and count. max stores the current max number, and count stores its occurrences. 
	Initially, assign the first number to max and 1 to count. 
	Compare each subsequent number with max. If the number is greater than max, assign it to max and reset count to 1. 
	If the number is equal to max, increment count by 1.)
	
	Enter numbers: 3 5 2 5 5 5 0
	The largest number is 5
	The occurrence count of the largest number is 4
 */
		//By Khaled Shah

public class Ch5_41_MaxNum_Occurances
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		int count = 0;
		int userNum;
		int max = 0 ;
		
		System.out.print("Enter numbers: ");
		userNum = kb.nextInt();
		
		do
		{	
			
			if (userNum > max)
			{
				max = userNum;
				count = 1;
			}
			
			else if (userNum == max)
			{
				count += 1;
			}
			
		} while ((userNum = kb.nextInt() ) != 0);
		
		System.out.println("The largest number is " + max + "\nThe occurance count of " + max + " is " + count);

	}

}
