package ch4exercises;
import java.util.Scanner;

public class Ch4_12_Hex_to_Binary

		/* Chapter 4 - Exercise 12: 
		 * (Hex to binary) Write a program that prompts the user to enter a hex digit and displays its corresponding 
		 * binary number. 
		 * 
		 * Here is a sample run:
		 * Enter a hex digit: B
			The binary value is 1011
			
			Enter a hex digit: G
			G is an invalid input
		 */
				// By Khaled Shah

{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter a hex digit: ");
		String userHex = kb.nextLine();
		
		while(userHex.length() != 1)
		{
			System.out.print(userHex + " is an invalid input. Please try again: ");
			userHex = kb.nextLine();
		}
		
		String binString = "";			
		int userHexInt = 0;			// so we can convert this to binString
		char hexChar = userHex.charAt(0);
		
		while ((hexChar< 48 || hexChar> 57) && (hexChar < 'A' || hexChar > 'F'))
		{
			System.out.print(hexChar + " is an invalid input. Please try again: ");
			userHex = kb.nextLine();
			
			while(userHex.length() != 1)
			{
				System.out.print(userHex + " is an invalid input. Please try again: ");
				userHex = kb.nextLine();
			}
			
			hexChar = userHex.charAt(0);
		}
		
		if (hexChar >= 48 && hexChar <= 57)
		{
			userHexInt = hexChar - '9' + 9;
			binString = Integer.toBinaryString(userHexInt);
		}
		
		if (hexChar >= 'A' && hexChar <= 'F')
		{
			userHexInt = hexChar - 'A' + 10;
			binString = Integer.toBinaryString(userHexInt);
		}
		
		System.out.println("The binary value for " + userHex + " is " + binString);
	
	}

}

/*Could also do:
 * System.out.print("Enter a hex digit: ");
		String hexVal = kb.next();
		char hex = Character.toUpperCase(hexVal.charAt(0));
		
		int binary = 0;
		
		if (Character.isAlphabetic(hex))
		{
			switch (hex)
			{
				case 'A': binary = 'A' - 55;
				break;
				case 'B': binary = 'B' - 55;
				break;
				case 'C': binary = 'C' - 55;
				break;
				case 'D': binary = 'D' - 55;
				break;
				case 'E': binary = 'E' - 55;
				break;
				case 'F': binary = 'F' - 55;
				break;
				default: binary = -1;
			}
		}
		
		else
		{
			binary = Integer.parseInt(hexVal);
		}
		
		System.out.println(((binary < 0)? hex + " is an invalid input." : "The binary value is " + Integer.toBinaryString(binary)));
	
		
*/ 