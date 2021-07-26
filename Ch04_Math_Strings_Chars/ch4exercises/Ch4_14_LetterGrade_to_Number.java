package ch4exercises;
import java.util.Scanner;

public class Ch4_14_LetterGrade_to_Number

		/* Chapter 4 - Exercise 14:
		 * (Convert letter grade to number) Write a program that prompts the user to enter a letter grade A, B, C, D, or F 
		 * and displays its corresponding numeric value 4, 3, 2, 1, or 0. 
		 * 
		 * Here is a sample run:
		 * Enter a letter grade: B
			The numeric value for grade B is 3
			
			Enter a letter grade: T
			T is an invalid grade
		 */
				// By Khaled Shah

{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter a letter grade (A, B, C, D or F): ");
		String letterGrade = kb.next();
		
//		while (!(letterGrade.equals("A") || letterGrade.equals("B") || letterGrade.equals("C") || letterGrade.equals("D") || 
//				letterGrade.equals("F")))
//		{
//			System.out.print(letterGrade + " is an invalid grade. Please enter A, B, C, D or F: ");
//			letterGrade = kb.next();
//		}
		
//		char grade = letterGrade.charAt(0);
		int numVal = 0;
		
		while (!(letterGrade.equals("A") || letterGrade.equals("B") || letterGrade.equals("C") || letterGrade.equals("D") || 
		letterGrade.equals("F")))
		{
			System.out.print(letterGrade + " is an invalid grade. Please enter A, B, C, D or F: ");
			letterGrade = kb.next();
		}

		switch (letterGrade)
		{
			case "A":  numVal = 4;
			break;
			case "B": numVal = 3;
			break;
			case "C": numVal = 2;
			break;
			case "D": numVal = 1;
			break;
			case "F": numVal = 0;
			break;
		}
		
		System.out.println("The numeric value for grade " + letterGrade + " is " + numVal);

	}

}
