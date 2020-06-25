package ch3exercises;
import java.util.Scanner;

/* 	Chapter 3 - Exercise 2:
	(Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates two integers and prompts the
 * 	user to enter the sum of these two integers. Revise the program to generate three single-digit integers and prompt
 * 	the user to enter the sum of these three integers.
 */
		//By Khaled Shah

public class Ch3_02_Addition
{
	static Scanner kb = new Scanner(System.in);
	//a + Math.random() * b Returns a random number BETWEEN a and (a + b), excluding (a + b).
	
	static final int NUM_1 = (int) (-9 + Math.random() * 19);
	static final int NUM_2 = (int) (-9 + Math.random() * 19);
	static final int NUM_3 = (int) (-9 + Math.random() * 19);

	public static void main(String[] args)
	{
		System.out.println("Perform the following addition:\n\t\t\t\t" + NUM_1 + "\n\t\t\t\t"+ NUM_2 + "\n\t\t\t  (+) " + 
	                                        NUM_3 +"\n\t\t\t  _______");
		System.out.print("\t\t\t");
		int userResult = kb.nextInt();
		int actualResult = NUM_1 + NUM_2 + NUM_3;
		
		while (actualResult != userResult)
		{
			System.out.println("Your answer is incorrect. Try again: ");
			System.out.println("Perform the following addition:\n\t\t\t\t" + NUM_1 + "\n\t\t\t\t"+ NUM_2 + "\n\t\t\t  (+) " + 
                    NUM_3 +"\n\t\t\t  _______");
			System.out.print("\t\t\t");
			userResult = kb.nextInt();
		}
		
		System.out.println("That's it! You got it right!");

	}

}
