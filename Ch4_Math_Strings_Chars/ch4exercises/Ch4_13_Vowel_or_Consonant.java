package ch4exercises;
import java.util.Scanner;

public class Ch4_13_Vowel_or_Consonant

		/* Chapter 4 - Exercise 13: 
		 *  (Vowel or consonant?) Write a program that prompts the user to enter a letter and check whether the letter is 
		 *  a vowel or consonant. 
		 *  
		 *  Here is a sample run:
		 *  Enter a letter: B
			B is a consonant
			
			Enter a letter grade: a
			a is a vowel
			
			Enter a letter grade: #
			# is an invalid input
		 */
				// By Khaled Shah

{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter a letter: ");
		String userLetter = kb.next();
		char userChar = userLetter.charAt(0);
		
		if (userLetter.equalsIgnoreCase("a") || userLetter.equalsIgnoreCase("e") || userLetter.equalsIgnoreCase("i")
				|| userLetter.equalsIgnoreCase("o") || userLetter.equalsIgnoreCase("u"))
		{
			System.out.println(userLetter + " is a vowel");
		}
		
		else if (Character.isAlphabetic(userChar))
		{
			System.out.println(userChar + " is a consonant.");
		}
		
		else
		{
			System.out.println(userChar + " is an invalid input.");
		}

	}

}
