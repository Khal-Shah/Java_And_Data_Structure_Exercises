package ch6exercises;
import java.util.Scanner;

/* Chapter 6 - Exercise 21:
 * (Phone keypads) The international standard letter/number mapping for telephones is shown in Programming Exercise 
 * 4.15. 
 * 2 = abc			3 = def		4 = ghi			5 = jkl			6 = mno			7 = pqrs			8 = tuv			9 = wxyz
 * Write a method that returns a number, given an uppercase letter, as follows:
int getNumber(char uppercaseLetter)

Write a test program that prompts the user to enter a phone number as a string. 
The input number may contain letters. The program translates a letter (uppercase or lowercase) to a digit and leaves all 
other characters intact. 

Here is a sample run of the program:
Enter a string: 1-800-Flowers
1-800-3569377

Enter a string: 1800flowers
18003569377
 */
		//By Khaled Shah

public class Ch6_21_Phone_Pad
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter a phone number (as a string): ");
		String str = kb.next();
		
		printNumber(str);

	}
	
	public static int getNumber(char uppercaseLetter)
	{
		//2 = abc			3 = def		4 = ghi			5 = jkl			6 = mno			7 = pqrs			8 = tuv			9 = wxyz
		int digit;
		
		if (uppercaseLetter == 'A' || uppercaseLetter == 'B' || uppercaseLetter == 'C')
		{
			digit = 2;
		}
		
		else if (uppercaseLetter == 'D' || uppercaseLetter == 'E' || uppercaseLetter == 'F')
		{
			digit = 3;
		}
		
		else if (uppercaseLetter == 'G' || uppercaseLetter == 'H' || uppercaseLetter == 'I')
		{
			digit = 4;
		}

		else if (uppercaseLetter == 'J' || uppercaseLetter == 'K' || uppercaseLetter == 'L')
		{
			digit = 5;
		}
		
		else if (uppercaseLetter == 'M' || uppercaseLetter == 'N' || uppercaseLetter == 'O')
		{
			digit = 6;
		}
		
		else if (uppercaseLetter == 'P' || uppercaseLetter == 'Q' || uppercaseLetter == 'R' || uppercaseLetter == 'S')
		{
			digit = 7;
		}

		else if (uppercaseLetter == 'T' || uppercaseLetter == 'U' || uppercaseLetter == 'V')
		{
			digit = 8;
		}
		
		else
		{
			digit = 9;
		}
		
		return digit;
		
	}
	
	public static void printNumber(String str)
	{
		int i = 0;
		char currentChar;
		
		while (i < str.length())
		{
			if (!Character.isAlphabetic(str.charAt(i)))
			{
				System.out.print(str.charAt(i));
			}
			
			else
			{
				System.out.print(getNumber(Character.toUpperCase(str.charAt(i))));
			}
			i++;
		}
	}

}
