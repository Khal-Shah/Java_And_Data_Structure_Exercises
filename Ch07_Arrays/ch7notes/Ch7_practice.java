package ch7notes;
import java.util.*;

/* Chapter 7 - Exercise 34:
 * (Sort characters in a string) Write a method that returns a sorted string using the following header:
public static String sort(String s)
For example, sort("acb") returns abc.
Write a test program that prompts the user to enter a string and displays the sorted string.
 */
//By Khaled Shah

public class Ch7_practice
{
	static Scanner kb = new Scanner(System.in);


	public static void main(String[] args)
	{
		System.out.print("Enter a string: ");
		String userChars = kb.next();

		System.out.println(sort(userChars));
	}

	public static String sort(String s)
	{
		int[] sArray = new int[s.length()];

		for(int i = 0; i < s.length(); i++)
		{
			sArray[i] = s.charAt(i);
		}
		Arrays.sort(sArray);

		String sortedS = "";
		for(int i = 0; i < s.length(); i++)
		{
			sortedS += (char) sArray[i];
		}
		return (sortedS);
	}


}

