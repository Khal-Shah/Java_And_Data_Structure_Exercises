package ch4exercises;
import java.util.Scanner;

public class Ch4_09_Char_to_ASCII

		/* (Find the Unicode of a character) Write a program that receives a character and displays its Unicode. 
		 * Here is a sample run:
		 * Enter a character: E
			The Unicode for the character E is 69
		 */
				// By Khaled Shah 

{
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter a character: ");			//initially store it as a string with nextLine method and then 
		String charOfChoice = input.nextLine();			//convert it to char using chartAt(0) method
		
//		char convertedChar = charOfChoice.charAt(0);
		
//		System.out.println("The Unicode for the character " + convertedChar + " is " + (int) convertedChar);
		
		//Could ALSO do it like this:
		System.out.println("The Unicode for the character " + charOfChoice.charAt(0) + " is "  + (int) charOfChoice.charAt(0));
		
	}

}
