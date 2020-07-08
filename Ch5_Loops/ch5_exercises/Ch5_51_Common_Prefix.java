package ch5_exercises;
import java.util.Scanner;

/* Chapter 5 - Exercise 51:
 * (Longest common prefix) Write a program that prompts the user to enter two strings and displays the largest 
 * common prefix of the two strings. Here are some sample runs:
 * Enter the first string: Welcome to C++
	Enter the second string: Welcome to programming
	The common prefix is Welcome to
	
	Enter the first string: Atlanta
	Enter the second string: Macon
	Atlanta and Macon have no common prefix
 */
		//By Khaled Shah

public class Ch5_51_Common_Prefix
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter the first string: ");
		String firstStr = kb.nextLine();
		
		System.out.print("Enter the second string: ");
		String secStr = kb.nextLine();
		
		String commonStr = "";
		char singleL;
										//can also do Math.max
		for (int i = 0; i < ((firstStr.length() < secStr.length())? firstStr.length() : secStr.length()); i++)
		{
			if (firstStr.charAt(i) == secStr.charAt(i))
			{
				commonStr += firstStr.charAt(i);
				//if (firstS)
			}
		}
		
		System.out.println((commonStr == "")? (firstStr + " and " + secStr + " have no common prefix.") : ("The common "
				+ "prefix is " + commonStr) );
		

	}

}
