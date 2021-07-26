package ch7exercises;
import java.util.Arrays;
import java.util.Scanner;

/* Chapter 7 - Exercise 34:
 * (Sort characters in a string) Write a method that returns a sorted string using the following header:
public static String sort(String s) 
For example, sort("acb") returns abc.
Write a test program that prompts the user to enter a string and displays the sorted string.
 */
	//By Khaled Shah

public class Ch7_34_Sort_Chars
{

	public static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String userStr = getString();
		
		System.out.println(userStr + " sorted is " + sort(userStr));
	}

	public static String sort(String s)
	{
		//will need to convert the string into chars then put it into a char array
		char [] charArray = new char [s.length()];
		
		for (int i = 0; i < s.length(); i++)
		{
			charArray [i] = s.charAt(i);
		}
		//Then sort the charArray
		java.util.Arrays.sort(charArray);
		
		//Now return this sorted charArray as a String:
		return Arrays.toString(charArray);
	}
	
	public static String getString()
	{
		System.out.print("Enter a string: ");
		String str = kb.nextLine();
		
		return str;
	}
}
