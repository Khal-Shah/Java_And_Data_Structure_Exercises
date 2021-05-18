package ch18exercises;

import java.util.Scanner;

/** Chapter 18 - Exercise 9:
 * (Print the characters in a string reversely) Write a recursive method that displays a string reversely on the console 
 * using the following header:
   public static void reverseDisplay(String value)
   For example, reverseDisplay("abcd") displays dcba.
   Write a test program that prompts the user to enter a string and displays its reversal

 @author Khaled
 */

public class Ch18_09_Reverse_Chars
{

	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.print("Enter a string that you'd like to display in reverse: ");
		String str = kb.nextLine();

		reverseDisplay(str);
	}
	
	public static void reverseDisplay(String value)
	{
		if (!(value.length() == 0))
		{
			value = value.toLowerCase();
			System.out.print((value.charAt(value.length() - 1)));
			reverseDisplay(value.substring(0, value.length() - 1));
		}
	}
}
