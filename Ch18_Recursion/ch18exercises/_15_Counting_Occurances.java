package ch18exercises;

import java.util.Scanner;

/* Chapter 18 - Exercise 15:
 * (Occurrences of a specified character in a string)
 * Rewrite Programming Exercise 18.10 using a helper method to pass the substring high index to the method. 
 * The helper method header is:
public static int count(String str, char a, int high)
 */
public class _15_Counting_Occurances
{
	static Scanner kb = new Scanner(System.in);
	static int count = 0;
	
	public static void main(String[] args)
	{
		System.out.print("Enter a string: ");
		String str = kb.nextLine();
		
		System.out.print("Enter a letter from the above string for which you want to count the occurances for: ");
		String letter = kb.nextLine();
		char a = letter.charAt(0);		
		
		System.out.println("The number of times the letter " + a + " appears in the string entered is " + count(str, a));

	}
	
	public static int count(String str, char a)
	{
		return (count(str, a, str.length() - 1));
	}
	
	public static int count(String str, char a, int high)
	{
		
		if (high < 1)
		{
			return count;
		}
		
		if (str.charAt(0) == a)
		{
			count++;
		}
		
		return count(str.substring(1), a, str.length() - 1);
			
	}

}
