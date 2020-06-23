package ch4exercises;
import java.util.Scanner;

public class Ch4_22_Check_Substring

		/* Chapter 4 - Exercise 22:
		 * (Check substring) Write a program that prompts the user to enter two strings and reports whether the second 
		 * string is a substring of the first string.
		 * 
		 * Sample Runs: 
		 * Enter string s1: ABCD
			Enter string s2: BC
			BC is a substring of ABCD
			
			Enter string s1: ABCD
			Enter string s2: BDC
			BDC is not a substring of ABCD
		 */
				// By Khaled Shah
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter string 1: ");
		String s1 = kb.nextLine();
		
		System.out.print("Enter string 2: ");
		String s2 = kb.nextLine();
		
		System.out.println(s2 + ((s1.contains(s2))?  " is " : " is not ") +" a substring of " + s1);

	}

}
