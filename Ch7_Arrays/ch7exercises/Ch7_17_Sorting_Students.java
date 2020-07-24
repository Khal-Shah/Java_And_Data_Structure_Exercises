package ch7exercises;
import java.util.*;

/* Chapter 7 - Exercise 17:
 * (Sort students) Write a program that prompts the user to enter the number of students, the students’ names, 
 * and their scores, and prints student names in decreasing order of their scores.
 */
		//By Khaled Shah

public class Ch7_17_Sorting_Students
{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter the number of students: ");
		int size = kb.nextInt();
		
		String [] studentNames = getNames(size);
		double [] studentScores = getScores (studentNames);
		
		double [] orderedScores = descendingScores(studentScores, studentNames);	//also swaps name array accordingly
		
		displayNames(studentNames, orderedScores);

	}

	static double[] getScores(String[] names)
	{
		double[] scores = new double[names.length];

		for(int i = 0; i < names.length; i++)
		{
			System.out.print("Enter score for " + names[i] + ": ");
			scores[i] = kb.nextDouble();
		}
		return scores;
	}

	static String[] getNames(int sz)
	{
		String[] names = new String[sz];

		for(int i = 0; i < sz; i++)
		{
			System.out.print("Enter name of student " + (i + 1) + ": ");
			names[i] = kb.next();
		}
		return names;
	}
	
	public static double [] descendingScores (double [] list, String [] names)
	{
		String name;					//String cuz it can hold both
		double maxValue;
		int maxIndex;
		
		for (int i = 0; i < list.length; i++)
		{
			maxValue = list [i];
			maxIndex = i;
			
			for (int j = i; j < list.length; j++)
			{
				if (list [j] > maxValue)
				{
					maxValue = list [j];
					maxIndex = j;
				}
			}
			
			if (maxValue > list [i])
			{
				//now swap the string (name) array
				name = names [i];						//stores 1st element
				names [i] = names [maxIndex];		//in place of 1st element, put the big one
				names [maxIndex] = name;			//put 1st element into big index's place
				
				//now swap scores array
				list[maxIndex] = list[i];
				list[i] = maxValue;
			}
		}
		return list;
	}
	
	public static void displayNames (String [] names, double [] scores)
	{
		System.out.print("Name\t\t\tScore");
		
		for (int i = 0; i <names.length; i++)
		{
			System.out.printf("\n%-10s\t\t%.2f", names[i], scores [i]);
		}
		
	}

}
