package ch6exercises;
import java.util.Scanner;

/* Chapter 6 - Exercise 4:
 * (Display an integer reversed) Write a method with the following header to display an integer in reverse order:
public static void reverse(int number)
For example, reverse(3456) displays 6543. Write a test program that prompts
the user to enter an integer and displays its reversal.
 */
		//By Khaled shah

public class Ch6_04_ReverseNum
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter an integer number: ");
		int userNum = kb.nextInt();
		
		reverse(userNum);

	}
	
	public static void reverse(int number)
	{
		int reverse = 0;
		int currentDig;
		do 
		{
			currentDig = number % 10;
			reverse = (reverse * 10) + currentDig;		//shifts previousDig left
			number /= 10;
		} while(number > 0);
		
		System.out.println(reverse);
	}

}
