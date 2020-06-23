package ch4notes;
import java.util.Scanner;

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

public class Ch4_Practice
{
	static Scanner kb = new Scanner(System.in);
	
	
	
	public static void main(String[] args)
	{
		System.out.println("Enter a SSN below: ");
		
		String SSN = getSSN();
		
		boolean checkSSN = isValid(SSN);
		
		System.out.println(SSN + " is " + ((checkSSN)? "a valid" : "an invalid") + " social security number.");
		
	
	}
	
	public static String getSSN()
	{
		String ssn = kb.next();
		return ssn;
	}
	
	public static Boolean isValid(String ssn)
	{
		boolean isValid = ((ssn.length() == 11));
		
		if (!isValid)
		{
			return false;
		}
		
		for (int i = 0; i < 11; i++)
		{
			/*if (!(Character.isDigit(ssn.charAt(i))))
				{
					if ((i == 3) || (i == 6))
					{
						isValid = (ssn.charAt(i) ==  '-');
						continue;
					}
					isValid = false;
				}*/
			if (i == 3 || i == 6)
			{
				isValid = (ssn.charAt(i) ==  '-');
				
				if (!isValid)
				{
					return false;
				}
			}
			
			else
			{
				isValid = ((Character.isDigit(ssn.charAt(i))));
			}
		}
		
		return isValid;
	}
	
}
