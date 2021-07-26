package ch6exercises;
import java.util.Scanner;

/* Chapter 6 - Exercise 23:
 * (Occurrences of a specified character) Write a method that finds the number of
occurrences of a specified character in a string using the following header:
public static int count(String str, char a)

For example, count("Welcome", 'e') returns 2. 
Write a test program that prompts the user to enter a string followed by a character and 
displays the number of occurrences of the character in the string.
 */
		//By Khaled Shah

public class Ch6_23_Char_Occurrence
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter a string: ");
		String msg = kb.nextLine();
		
		System.out.print("Which character would you like to count the occurence of? ");
		char occurenceOf = kb.next().charAt(0);
		
		System.out.println("The number of occurences of \"" + occurenceOf + "\" in \"" + msg +"\" is " 
		+ count(msg, occurenceOf));
	}
	
	public static int count(String str, char a)
	{
		int count = 0;
		int i = 0;
		
		do
		{
			count += ((Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(a))? 1 : 0);
			i++;
		} while (str.length() > i);
		
		return count;
	}

}
