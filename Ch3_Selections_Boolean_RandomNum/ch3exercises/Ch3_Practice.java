package ch3exercises;
import java.util.*;

/* 	Chapter 3 - Exercise 2:
	(Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates two integers and prompts the
 * 	user to enter the sum of these two integers. Revise the program to generate three single-digit integers and prompt
 * 	the user to enter the sum of these three integers.
 */
//By Khaled Shah


public class Ch3_Practice
{
	static Scanner kb = new Scanner(System.in);
	static final int NUM1 = (int) (Math.random() * 9);
	static final int NUM2 = (int) (Math.random() * 9);
	static final int NUM3 = (int) (Math.random() * 9);
	static final int SUM = NUM1 + NUM2 + NUM3;
	
	public static void main(String[] args)
	{
		System.out.printf("Enter the sum of the following numbers. \n" +
				"\t%d\n\t%d\n+   %d\n-------", NUM1, NUM2, NUM3);
		System.out.print("\n= ");
		int userSum = kb.nextInt();

		while(SUM != userSum)
		{
			System.out.print("Incorrect. Try again: ");
			userSum = kb.nextInt();
		}

		System.out.print(userSum + " is correct!");
	}
	

	
	
	

}
