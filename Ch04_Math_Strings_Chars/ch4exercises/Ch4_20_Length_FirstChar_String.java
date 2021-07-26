package ch4exercises;
import java.util.Scanner;

public class Ch4_20_Length_FirstChar_String

		/* Chapter 4 - Exercise 20:
		 * (Process a string) Write a program that prompts the user to enter a string and displays its length and its 
		 * first character.
		 */
				// By Khaled Shah

{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter a message: ");
		String msg = kb.nextLine();
		
		System.out.println("Your message has a length of " + msg.length() + " characters and its' first character is " + 
		msg.substring(0, 1));

	}

}
