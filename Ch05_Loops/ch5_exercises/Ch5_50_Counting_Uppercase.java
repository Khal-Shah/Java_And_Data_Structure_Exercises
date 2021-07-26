package ch5_exercises;
import java.util.*;

/* Chapter 5 - Exercise 50:
 * (Count uppercase letters) Write a program that prompts the user to enter a string and displays the number of the 
 * uppercase letters in the string.
 * 
 * Enter a string: Welcome to Java
	The number of uppercase letters is 2
 */
		//By Khaled Shah

public class Ch5_50_Counting_Uppercase
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter a string: ");
		String userStr = kb.nextLine();
		
		int upperCount = 0;
		char singleL;
		
		/*for (int i = 0; i < userStr.length(); i++)
		{
			singleL = userStr.charAt(i);
			
			if (Character.isUpperCase(singleL))
			{
				upperCount += 1;
			}
			
		}
		
		System.out.println("The number of uppercase letters is " + upperCount);*/
		
		//Could also do it with replaceAll
		userStr = userStr.replaceAll("[^A-Z]", "");			//replace everything that isn't uppercase
		//or userStr = userStr.replaceAll("[a-z\\s]", "");	//replace all small letters and white space
		System.out.println("The number of uppercase letters is " + userStr.length());
		
		

	}

}
