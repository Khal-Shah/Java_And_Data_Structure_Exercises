package ch5_exercises;
import java.util.Scanner;

/* Chapter 5 - Exercise 49:
 * (Count vowels and consonants) Assume letters A, E, I, O, and U as the vowels. 
 * Write a program that prompts the user to enter a string and displays the number of vowels and consonants in the string.
 * Enter a string: Programming is fun
	The number of vowels is 5
	The number of consonants is 11
 */
		//By Khaled Shah

public class Ch5_49_Counting_VowNCons
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
	/*	System.out.print("Enter a string: ");
		String userStr = kb.nextLine();
		
		int vowelCounts = 0;
		int consonantCounts = 0;
		String singleL = "";
		
		int i = 0;
		
		while (i < userStr.length())
		{
			singleL += userStr.charAt(i);
			
			if (singleL.equalsIgnoreCase("a") || singleL.equalsIgnoreCase("e") || singleL.equalsIgnoreCase("i") ||
					singleL.equalsIgnoreCase("o") || singleL.equalsIgnoreCase("u"))
			{
				vowelCounts += 1;
			}
			
			else if (!singleL.equals(" "))
			{
				consonantCounts += 1;
			}
			
			i++;
			singleL = "";
		}
		
		System.out.println("The number of vowel is " + vowelCounts + "\nThe number of consonant is " + consonantCounts );*/

		System.out.print("Enter a string: ");
		String userStr = kb.nextLine();
		int i = 0;
		int vowels = 0, consonants = 0, nonalphabetic = 0;
		
		userStr = userStr.replaceAll("\\s", "");			//removes all white space
		vowels = userStr.length();								//length without white space
		consonants = userStr.replaceAll("[aeiouAEIOU]", "").length();		//consonants = length without all vowels
		vowels = Math.abs(consonants - vowels);
		
		System.out.println("The number of vowels is: " + vowels + "\nThe number of consonants is: " + consonants);
	}

}
