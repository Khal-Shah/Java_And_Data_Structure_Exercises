package ch4exercises;
import java.util.Scanner;

public class Ch4_21_Check_SSN

		/* Chapter 4 - Exercise 21:
		 * (Check SSN) Write a program that prompts the user to enter a Social Security number in the format 
		 * DDD-DD-DDDD, where D is a digit. Your program should check whether the input is valid. 
		 * 
		 * Here are sample runs:
		 * Enter a SSN: 232-23-5435
			232-23-5435 is a valid social security number
			
			Enter a SSN: 23-23-5435
			23-23-5435 is an invalid social security number
		 */
				// By Khaled Shah
{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter a SSN: ");
		String userSSN = kb.nextLine();
		
		// 3-2-4
		
//		String first3 = userSSN.substring(0, 3); 
//		String middle2 = userSSN.substring(4, 6);
//		String last4 = userSSN.substring(7, 10);
//		
//		if (first3.contains("-") || middle2.contains("-") || last4.contains("-"))
//		{
//			System.out.println(userSSN + " is an invalid social security number.");
//		}
//		
//		else
//		{
//			System.out.println(userSSN + " is a valid social security number.");
//		}
		
		boolean isValid =  ((Character.isDigit(userSSN.charAt(0))) && (Character.isDigit(userSSN.charAt(1))) &&
		(Character.isDigit(userSSN.charAt(2))) && (userSSN.charAt(3) == '-') && 
		(Character.isDigit(userSSN.charAt(4))) &&  (Character.isDigit(userSSN.charAt(5))) && 
		(userSSN.charAt(6) == '-') && (Character.isDigit(userSSN.charAt(7))) &&
		(Character.isDigit(userSSN.charAt(8))) && Character.isDigit(userSSN.charAt(9)) &&
		(Character.isDigit(userSSN.charAt(10))) && (userSSN.length() == 11));
		
		System.out.printf("%s is " + ((isValid)?  "a valid" :  "an invalid") + " social security number.", userSSN);
		
		/* Could also do it as:
		 * 	System.out.print("Enter a SSN of the form (DDD-DD-DDDD): ");
		String ssn = kb.nextLine();
		boolean isValid = (ssn.length() == 11);
		
		for (int i = 0; i < ssn.length(); i++)
		{
			
			if (!Character.isDigit(ssn.charAt(i)))
			{
				if (i == 3 || i == 6)
				{
					isValid = (ssn.charAt(3) == '-' || ssn.charAt(6) == '-');
					continue;
				}
				
				isValid = false;
			}
		}
		
		System.out.println(ssn + " is a" + ((isValid)? " valid" : "n invalid") + " social security number.");
		 */
	}

}
