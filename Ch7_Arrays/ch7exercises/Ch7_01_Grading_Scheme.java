package ch7exercises;
import java.util.*;

/* Chapter 7 - Exercise 1:
 * (Assign grades) Write a program that reads student scores, gets the best score, and then assigns grades 
 * based on the following scheme:
                  Grade is A if score is >= best - 10 
                  Grade is B if score is >= best - 20 
                  Grade is C if score is >= best - 30 
                  Grade is D if score is >= best - 40 
                  Grade is F otherwise.
 
The program prompts the user to enter the total number of students, then prompts the user to enter all of the scores, 
and concludes by displaying the grades. 

Here is a sample run:
Enter the number of students: 4
Enter 4 scores: 40 55 70 58
Student 0 score is 40 and grade is C
Student 1 score is 55 and grade is B
Student 2 score is 70 and grade is A
Student 3 score is 58 and grade is B
 */
		//By Khaled Shah

public class Ch7_01_Grading_Scheme
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		
		/*
		String [] letterGrades = {"A", "B", "C", "D", "F"};
		System.out.print("Enter the number of students: ");
		int numOfStudents = kb.nextInt();
		
		double [] grades = new double [numOfStudents];
		int i = 0;
		
		System.out.print("Enter " + numOfStudents + " scores: ");
		
		do
		{
			grades[i] = kb.nextDouble();
			i++;	
		} while (i < numOfStudents);
		
		
		double best = grades[0];
		
		for (int j = 0; j < grades.length; j++)
		{
			if (grades[j] > best)
			{
				best = grades[j];
			}
		}
		
		for (int j = 0; j < grades.length; j++)
		{
			if (grades[j] >= (best - 10))
			{
				System.out.println("Student " + j + " score is " + grades[j] + " and grade is " + letterGrades[0]);
			}
			
			else if (grades[j] >= (best - 20))
			{
				System.out.println("Student " + j + " score is " + grades[j] + " and grade is " + letterGrades[1]);
			}
			
			else if (grades[j] >= (best - 30))
			{
				System.out.println("Student " + j + " score is " + grades[j] + " and grade is " + letterGrades[2]);
			}
			
			else if (grades[j] >= (best - 20))
			{
				System.out.println("Student " + j + " score is " + grades[j] + " and grade is " + letterGrades[3]);
			}
			
			else 
			{
				System.out.println("Student " + j + " score is " + grades[j] + " and grade is " + letterGrades[4]);
			}
		}
		
		*/
		
		readMark();			//Alternate implementation with methods
	}
	
	public static void printGrade(double[] mark)
	{
		double best = getBest(mark);
		char grade = 'n';
		
		System.out.println("The best grade is " + best);
		
		for (int i = 0; i < mark.length; i++)
		{
			if (mark[i] >= (best - 10))
			{
				grade = 'A';
			}
			
			else if (mark[i] >= (best - 20))
			{
				grade = 'B';
			}
			
			else if (mark[i] >= (best - 30))
			{
				grade = 'C';
			}
			
			else if (mark[i] >= (best - 40))
			{
				grade = 'D';
			}
			
			else
			{
				grade = 'F';
			}
			
			System.out.println("Student " + i + " score is " + mark[i] + " and grade is " + grade);
		}
		
	}
	
	
	public static double[] readMark()
	{
		System.out.print("Enter the number of students: ");
		int totalStudents = kb.nextInt();
		
		System.out.print("Enter " + totalStudents + " scores: ");
		double[] marks = new double[totalStudents];
		
		for (int i = 0; i < marks.length; i++)
		{
			marks[i] = kb.nextDouble();
		}
		
		printGrade(marks);
		
		return marks;
	}
	
	
	public static double getBest(double[] mark)
	{
		double temp = 0;
		double best = 0;
		
		for (int i = 0; i < mark.length; i++)
		{
			if (mark[i] > temp)
			{
				best = mark[i];
				temp = best;
			}
		}
		return best;
	}

}
