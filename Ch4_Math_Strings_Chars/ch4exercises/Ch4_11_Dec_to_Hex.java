package ch4exercises;
import java.util.Scanner;

public class Ch4_11_Dec_to_Hex

		/* Chapter 4 - Exercise 11:
		 * (Decimal to hex) Write a program that prompts the user to enter an integer between 0 and 15 and displays 
		 * its corresponding hex number. 
		 * 
		 * Here are some sample runs:
		 * Enter a decimal value (0 to 15): 11
			The hex value is B
			
			Enter a decimal value (0 to 15): 5
			The hex value is 5
			
			Enter a decimal value (0 to 15): 31
			31 is an invalid input		
		 */
				// By Khaled Shah

{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	
	{
		System.out.print("Enter a decimal value (0 to 15): ");
		int userDecimal = kb.nextInt();
//		int decVal = Integer.parseInt(userDecimal);
		
		while (userDecimal < 0 || userDecimal > 15)
		{
			System.out.print(userDecimal + " is an invalid input. Please try again: " );
			userDecimal = kb.nextInt();
		}
		
		String hexValue = "";
		
		if (userDecimal >=0 && userDecimal <= 9)
		{
//			hexValue = userDecimal;
			System.out.println("The hex value for the decimal " + userDecimal + " is " + userDecimal);
		}
		
		else 
		{
//			hexValue = "userDecimal" - "A"+ 15;				//Can't do operation with String type (only char)
			//But since 10-15 is double digit, can't use char. Must use switch
			switch (userDecimal)
			{
				case 10: hexValue = "A";
				break;
				case 11: hexValue = "B";
				break;
				case 12: hexValue = "C";
				break;
				case 13: hexValue = "D";
				break;
				case 14: hexValue = "E";
				break;
				case 15: hexValue = "F";
				break;
			}
			
			System.out.println("The hex value for the decimal " + userDecimal + " is " + hexValue);
		}
		
		/*Could also do:
		 * System.out.println("The hex value is " + Character.toUpperCase((Integer.toHexString(decVal)).charAt(0)));
		 */

	}

}