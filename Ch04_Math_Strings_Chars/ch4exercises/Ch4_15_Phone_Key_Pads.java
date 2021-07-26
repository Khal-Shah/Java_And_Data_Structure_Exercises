package ch4exercises;
import java.util.Scanner;

public class Ch4_15_Phone_Key_Pads

		/* Chapter 4 - Exercise 15:
		 * (Phone key pads) The international standard letter/number mapping found on the telephone is shown below:
		 * 2 = abc			3 = def		4 = ghi			5 = jkl			6 = mno			7 = pqrs			8 = tuv			9 = wxyz
		 * Write a program that prompts the user to enter a letter and displays its corresponding number.
		 * 
		 * Sample Runs:
		 * Enter a letter: A
			The corresponding number is 2
			Enter a letter: a
			The corresponding number is 2
			Enter a letter: +
			+ is an invalid input 
		 */
				// By Khaled Shah

{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	
	{
		System.out.print("Enter a letter: ");
		String userLetter = kb.nextLine();
		
		String number = "0";
		
		if (userLetter.equalsIgnoreCase("a") || userLetter.equalsIgnoreCase("b") || userLetter.equalsIgnoreCase("c"))
		{
			number = "2";
		}
		
		else if (userLetter.equalsIgnoreCase("d") || userLetter.equalsIgnoreCase("e") || userLetter.equalsIgnoreCase("f"))
		{
			number = "3";
		}
		
		else if (userLetter.equalsIgnoreCase("g") || userLetter.equalsIgnoreCase("h") || userLetter.equalsIgnoreCase("i"))
		{
			number = "4";
		}
		
		else if (userLetter.equalsIgnoreCase("j") || userLetter.equalsIgnoreCase("k") || userLetter.equalsIgnoreCase("l"))
		{
			number = "5";
		}
		
		else if (userLetter.equalsIgnoreCase("m") || userLetter.equalsIgnoreCase("n") || userLetter.equalsIgnoreCase("o"))
		{
			number = "6";
		}
		
		else if (userLetter.equalsIgnoreCase("p") || userLetter.equalsIgnoreCase("q") || userLetter.equalsIgnoreCase("r")
				|| userLetter.equalsIgnoreCase("s"))
		{
			number = "7";
		}
		
		else if (userLetter.equalsIgnoreCase("t") || userLetter.equalsIgnoreCase("u") || userLetter.equalsIgnoreCase("v"))
		{
			number = "8";
		}
		
		else if (userLetter.equalsIgnoreCase("w") || userLetter.equalsIgnoreCase("x") || userLetter.equalsIgnoreCase("y")
				|| userLetter.equalsIgnoreCase("z"))
		{
			number = "9";
		}
		
		else
		{
			number = "invalid input";
		}
		
		System.out.println((number.equalsIgnoreCase("invalid input"))? (userLetter + " corresponds to an " + number) :
			(userLetter + " corresponds to " + number));
	}
	
	//would've been simpler to use Character.toUpperCase and then check >= 'W', then check >='T'...etc

}
