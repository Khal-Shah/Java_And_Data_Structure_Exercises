package ch4exercises;
import java.util.Scanner;

public class Ch4_08_ASCII_to_Char

		/* Chapter 4 - Exercise 8:
		   (Find the character of an ASCII code) Write a program that receives an ASCII code (an integer between 0 and 127)
		 * and displays its character. 
		 * Here is a sample run:
 			Enter an ASCII code: 69
			The character for ASCII code 69 is E
		 */
				// By Khaled Shah

{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter an ASCII code (integer between 0 and 127): ");
		int aCode = kb.nextInt();
		
		while (aCode <= 0 || aCode >= 127)
		{
			System.out.print("Invalid entry. Enter an integer between 0 and 127: ");
			aCode = kb.nextInt();
		}
		
		System.out.println("The character for ASCII code " + aCode + " is \"" + (char) (aCode) + "\"");
		
	}

}
