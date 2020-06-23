package ch6exercises;
import java.util.*;

/* Chapter 6 - Exercise 20:
 * (Count the letters in a string) Write a method that counts the number of letters in a string using the following header:
public static int countLetters(String s)
Write a test program that prompts the user to enter a string and displays the number of letters in the string.
 */
		//By Khaled Shah

public class Ch6_20_Num_Lttrs_inStr
{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter a string: ");
		String userStr = kb.nextLine();
		
		System.out.println("The total number of letters in the string is: " + countLetters(userStr));

	}
	
	public static int countLetters(String s)
	{
		char strLetter;
		int letterCount = 0;
		
		for (int i = 0; i < s.length(); i++)
		{
			strLetter = s.charAt(i);
			
			if (Character.isLetter(strLetter))
			{
				letterCount++;
			}
		}
		return letterCount;
	}

}
