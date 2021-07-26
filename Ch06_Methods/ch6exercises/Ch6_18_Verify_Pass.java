package ch6exercises;
import java.util.*;

/* Chapter 6 - Exercise 18:
 * (Check password) Some websites impose certain rules for passwords. Write a method that checks whether a 
 * string is a valid password. Suppose the password rules are as follows:
■ A password must have at least eight characters.
■ A password consists of only letters and digits.
■ A password must contain at least two digits.

Write a program that prompts the user to enter a password and displays Valid Password if the rules are followed or 
Invalid Password otherwise.
 */
		//By Khaled Shah

public class Ch6_18_Verify_Pass
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Please enter a password: ");
		String password = kb.next();
		
		System.out.println("Your password is " + ((isValid(password))? "valid": "not valid"));

	}
	
	
	public static Boolean isValid(String pw)
	{
		boolean isValid = true;
		char pwChar;
		int digitCount = 0;
		
		for (int i = 0; i < pw.length(); i++)
		{
			isValid = ((Character.isLetterOrDigit(pw.charAt(i)))? true: false);
			digitCount += ((Character.isDigit(pw.charAt(i)))? 1: 0);
		}
		return (isValid && pw.length() >= 8 && digitCount >= 2);
	}

}
