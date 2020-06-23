package ch5_exercises;
import java.util.*;

/* Chapter 5 - Exercise 48:
 * (Process string) Write a program that prompts the user to enter a string and displays the characters at odd 
 * positions. Here is a sample run:
 * 
 * Enter a string: Beijing Chicago
	BiigCiao
 */
		//By Khaled Shah

public class Ch5_48_Processing_String
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter a string: ");
		String userStr = kb.nextLine();
		
		String oddStr = "";
		
		for (int i = 0; i <= userStr.length() - 1; i += 2)
		{
			oddStr += userStr.charAt(i);
			//i++;		i++ in loop if we keep the increment here too.
		}
		
		System.out.println(oddStr);

	}

}
