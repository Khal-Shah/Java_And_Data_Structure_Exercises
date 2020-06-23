package ch5_exercises;
import java.util.*;

		/* Chapter 5 - Exercise 9:
		 * (Find the two highest scores) Write a program that prompts the user to enter the number of students and each 
		 * student’s name and score, and finally displays the student with the highest score and the student with the second-
		 * highest score.
		 */
				//By Khaled Shah


public class Ch5_09_Highest_Scores
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("How many students are there? ");
		int totalStudents = kb.nextInt();
		
		double studentScore;
		double highestScore = 0;
		double secondHighestScore = 0;
		String studentName;
		int count = 1;
		String highestName = "";
		String secondHighestName = "";
		String tempName ="";
		
		do
		{
			System.out.print("Enter name of student " + count + ": ");
			studentName = kb.next();
			
			System.out.print("Enter score of " + studentName + ": ");
			studentScore = kb.nextDouble();
			
			if (studentScore >= highestScore)
			{
				secondHighestScore = highestScore;
				highestScore = studentScore;
				highestName = studentName;
				
			}
			
			else if ((studentScore < highestScore) && (studentScore > secondHighestScore))
			{
			 secondHighestScore = studentScore;
			 secondHighestName = studentName;
			}
			
			count++;
		} while (count <= totalStudents);
		
		System.out.println(highestName + " has the highest score of " + highestScore + ". And the second highest score is " 
				 + secondHighestScore + ").");

	}

}
