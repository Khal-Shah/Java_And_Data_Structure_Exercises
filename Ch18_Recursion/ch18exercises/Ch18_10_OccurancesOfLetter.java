package ch18exercises;
import java.util.Scanner;

/** Chapter 18 - Exercise 10:
 * (Occurrences of a specified character in a string)
 * Write a recursive method that finds the number of occurrences of a specified letter in a string using the following 
 * method header:
public static int count(String str, char a)
For example, count("Welcome", 'e') returns 2. 
Write a test program that prompts the user to enter a string and a character, and displays the number of occurrences 
for the character in the string.
*
* @author Khaled
 */

public class Ch18_10_OccurancesOfLetter
{

	static Scanner kb = new Scanner(System.in);
	static int count = 0;
	
	public static void main(String[] args)
	{
		System.out.print("Enter a string: ");
		String str = kb.nextLine();
		
		System.out.print("Enter a letter from the above string for which you want to count the occurances for: ");
		String letter = kb.nextLine();
		char a = Character.toLowerCase(letter.charAt(0));
		
		System.out.println("The number of times the letter " + a + " appears in the string entered is " + count(str, a));
		
		
	}

	public static int count(String str, char a)
	{
			if(str.length() == 1)
			{
				count += (str.charAt(0) == a)? 1 : 0;
				return count;
			}

			else if(Character.toLowerCase(str.charAt(0)) == Character.toLowerCase(a))
			{
				count++;
			}
		
			return count(str.substring(1), a);
	}
	
}
