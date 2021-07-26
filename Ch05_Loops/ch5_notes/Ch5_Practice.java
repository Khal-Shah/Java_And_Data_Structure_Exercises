package ch5_notes;
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

public class Ch5_Practice
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter the first string: ");
		String str1 = kb.nextLine();

		System.out.print("Enter the second string: ");
		String str2 = kb.nextLine();

		String common = "";

		for(int i = 0; i < Math.max(str1.length(), str2.length()); i++)
		{
			if (str1.charAt(i) == str2.charAt(i))
			{
				common += "" + str1.charAt(i);
				continue;
			}

			else
			{
				break;
			}
		}

		System.out.print(((common.length() == 0)? str1 + " and " + str2 + " have no common prefix." :
				"The longest common prefix is " + common));

	}



}

