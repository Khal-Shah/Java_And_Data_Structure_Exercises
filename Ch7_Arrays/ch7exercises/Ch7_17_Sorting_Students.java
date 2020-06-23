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
		int totalStudents = kb.nextInt();
		
		String [] studentNames = getNames(totalStudents);
		double [] studentScores = getScores (totalStudents);
		
		double [] orderedScores = descendingScores(studentScores, studentNames);	//also swaps name array accordingly
		
		displayNames(studentNames, orderedScores);

	}
	
	public static String [] getNames (int size)
	{
		String [] studentNames = new String [size];
		
		System.out.println("Enter " + size + " student names: ");
		
		for (int i = 0; i < size; i++)
		{
			studentNames[i] = kb.next();
		}
		return studentNames;
	}
	
	public static double [] getScores (int size)
	{
		double [] studentScores = new double [size];
		
		System.out.println("Enter " + size + " student scores: ");
		
		for (int i = 0; i < size; i++)
		{
			studentScores [i] = kb.nextDouble();
		}
		return studentScores;
	}
	
	public static double [] descendingScores (double [] list, String [] names)
	{
		String temp;					//String cuz it can hold both 
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
				temp = names [i];						//stores 1st element
				names [i] = names [maxIndex];		//in place of 1st element, put the big one
				names [maxIndex] = temp;			//put 1st element into big index's place
				
				//now swap scores array
				temp = "" + list [i];
				list [i] = list [maxIndex];
				list [maxIndex] = Double.parseDouble(temp);
			}
		}
		return list;
	}
	
	public static void displayNames (String [] names, double [] scores)
	{
		System.out.println("Name\t\t\tScore");
		
		for (int i = 0; i <names.length; i++)
		{
			System.out.println(names[i] + "\t\t\t" + scores [i]);
		}
		
	}

}
