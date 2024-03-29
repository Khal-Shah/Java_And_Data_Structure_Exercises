package ch6exercises;
import java.util.*;

	/* Chapter 6 - Exercise 2:
	 * (Sum the digits in an integer) Write a method that computes the sum of the digits in an integer. Use the following 
	 * method header: public static int sumDigits(long n)
	 * For example, sumDigits(234) returns 9 (2 + 3 + 4). (Hint: Use the % operator to extract digits, and the / operator to 
	 * remove the extracted digit. For instance, to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use 234 /10 
	 * (= 23).  Use a loop to repeatedly extract and remove the digit until all the digits are extracted. 
	 * Write a test program that prompts the user to enter an integer and displays the sum of all its digits.
	 */
			//By Khaled Shah.

public class Ch6_02_SumDigs
{

	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.print("Enter an integer: ");
		long userNum = kb.nextLong();
		
		System.out.println("The sum of each digit of " + userNum + " is " + sumDigits(userNum));
	}
	
	public static int sumDigits(long n)
	{
		int sum = 0;
		
		while (n > 0)
		{
			sum += n % 10;
			n /= 10;
		}
		
		return sum;
	}
	
	

}
