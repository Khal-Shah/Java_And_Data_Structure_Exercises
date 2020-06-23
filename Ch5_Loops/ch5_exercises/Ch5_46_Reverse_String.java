package ch5_exercises;
import java.util.*;

/* Chapter 5 - Exercise 46:
 * (Reverse a string) Write a program that prompts the user to enter a string and displays the string in reverse order.
 * Enter a string: ABCD
	The reversed string is DCBA
 */
		//By Khaled Shah

public class Ch5_46_Reverse_String
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{	
		System.out.print("Enter a string: ");
		String userStr = kb.nextLine();
		
		String reverse = "";
		//char singleStr;
		
		for (int i = (userStr.length() - 1); i >= 0 ; i--)
		{
			//singleStr = userStr.charAt(i);
			reverse += userStr.charAt(i);
		}
		
		System.out.println("The reverse string is " + reverse);

	}

}
