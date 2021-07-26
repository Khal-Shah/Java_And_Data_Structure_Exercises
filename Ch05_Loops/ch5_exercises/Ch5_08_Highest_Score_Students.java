package ch5_exercises;

import java.util.Scanner;

/* Chapter 5 - Exercise 8:
 * (Find the highest score) Write a program that prompts the user to enter the number of students and each student’s 
 * name and score, and finally displays the name of the student with the highest score.
 */
	//By Khaled Shah

public class Ch5_08_Highest_Score_Students
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter how many students you'd like to create a database for: ");
		int n = kb.nextInt();
		
		String name = "";
		int score = 0;
		int count = 0;
		int highestScore = 0;
		String bestStudent = "";
		
		while (count < n)
		{
			if (n == 0)
			{
				System.out.println("You've elected to not proceed. End of program.");
				System.exit(0);
			}
			
			count++;
			
			System.out.print("Enter name of student " + count + ": ");
			name = kb.next();
			
			System.out.print("Enter score of student " + count + ": ");
			score = kb.nextInt();
			
			if (score > highestScore)
			{
				highestScore = score;
				bestStudent = name;
			}
		}
		
		System.out.println("Out of the " + n + " students, " + bestStudent + " has the highest score of " + highestScore);

	}

}
