package ch4notes;
import java.util.Scanner;

public class Ch4_5_HowTo_Convert_HexToBinary

	// Chapter 4.5 - Case Studies: Converting a hexadecimal digit to a decimal value:
	// Hex: 0-9, A-F
{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter a hex digit: ");	
		String hexString = kb.nextLine();					// Has to be string cuz hex contains A-F too
		
		// This is for One hex digit:
		
		if (hexString.length() != 1)
		{
			System.out.println("This program only converts one hexadecimal digit to decimal number. Restart the program.");
			System.exit(0);
		}
		
		//assuming it has one digit, convert it to char so we can use Character.isDigit() later
		char hexDigit = hexString.charAt(0);
		int decimalValue = 0;
		
		if (hexDigit >= 'A' && hexDigit <= 'F')			//First, only for A-F (10-15)
		{
			decimalValue = (hexDigit - 'A' + 10);		//so if hexDigit is B: 66 - 65 + 10 = 11				If F: 70 - 65 + 10 = 15
			// Recall 'A' = 65....B = 66...so on
			
			System.out.println("The decimal value for the hex digit " + hexDigit + " is " + decimalValue);
		}
		
		else if (Character.isDigit(hexDigit))			//for 0-9 (48-57 in Unicode)
		{
//			decimalValue = hexDigit - '9' + 9;
//			
//			System.out.println("The decimal value for the hex digit " + hexDigit + " is " + decimalValue);
			//could also do: 
			System.out.println("The decimal vlaue for the hex digit " + hexDigit + " is " + hexDigit);	//if you don't put it in ' ' then
			//it acts as normal int/decimal value instead of unicode
		}
		
		else
		{
			System.out.println(hexDigit + " is an invalid entry. Restart the program.");
		}

	}

}
