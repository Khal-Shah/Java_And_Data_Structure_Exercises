package ch5_exercises;
import java.util.Scanner;

/* Chapter 5 - Exercise 2: 
 * (Repeat additions) 
 * Listing 5.4, SubtractionQuizLoop.java, generates five random subtraction questions. Revise the program to generate 
 * ten random addition questions for two integers between 1 and 15. Display the correct count and test time.
 */
		//By Khaled Shah

public class Ch5_02_Quiz_Time
{
	static Scanner kb = new Scanner(System.in);
	

	public static void main(String[] args)
	{
		int q1 = 1;
		int q10 = 10;
		int count = 0;
		
		long startTime = System.currentTimeMillis();
		
		for (int i = q1; i <= q10; i++)
		{
			int num1 = (int) (1 + (Math.random() * 15));
			int num2 = (int) (1 + (Math.random() * 15));
			int result = num1 + num2;
			
			System.out.print("Perform " + num1 + " + " + num2 + " = ");
			int userResult = kb.nextInt();
			
			if (userResult == result)
			{
				count += 1;
			}
			
		}
		
		long endTime = System.currentTimeMillis();
		long testTime = (endTime - startTime) / 1000;
		System.out.println("You got " + (count * 10) + "% in the test. You took " + testTime + " seconds to complete it.");

	}

}
