package ch7exercises;
import java.util.*;

/* Chapter 7 - Exercise 4:
 * (Analyze scores) Write a program that reads an unspecified number of scores and determines how many scores 
 * are above or equal to the average and how many scores are below the average. 
 * Enter a negative number to signify the end of the input. 
 * Assume that the maximum number of scores is 100.
 */
		//By Khaled Shah

public class Ch7_04_Analyze_Nums
{
	static Scanner kb = new Scanner (System.in);
	static final int MAX_INPUT = 100;

	public static void main(String[] args)
	{
		System.out.println("Enter scores below (enter a negative number when finished): ");
		double [] scores = new double [MAX_INPUT];
		scores [0] = kb.nextDouble();
		
		double sum = 0;
		int i = 0;
		int totalScores = 0;
		
		while ((scores [i] >= 0) && scores.length <= MAX_INPUT)
		{
			sum += scores [i];
			i++;
			scores [i] = kb.nextDouble();
			totalScores++;
		}
		
		double average = sum / totalScores;
		int aboveOrEqual = 0;
		int below = 0;
		
		for (int k = 0; k < totalScores; k++)
		{
			if (scores [k] >= average)
			{
				aboveOrEqual++;
			}
			else if (scores [k] < average)
			{
				below++;
			}
		}
		
		System.out.println("The average is: " + average + "\nThe number of scores above or equal to the average is: "
				+ aboveOrEqual + "\nThe number of scores below average is: " + below);
		
		/* Or with methods:
		 * double[] scores = new double[100];
		readScores(scores);*/

	}
	
	/*
	  public static double[] readScores(double[] scores)
	  {
		System.out.print("Enter each score: ");
		int i = 0;
		
		do
		{
			scores[i] = kb.nextDouble();
			i++;
		} while((scores[i - 1] >= 0) && (scores[i - 1] <= 100));
		
		int lastIndex = 0;
		i = 0;
		
		for (double e: scores)
		{
			System.out.print(e + "\t\t");
		}
		
		do
		{
			if (scores[i] < 0)
			{
				lastIndex = i - 1;
				break;
			}
			
			i++;
		} while(i < 100);
		
		double[] scoresFixed = new double[lastIndex + 1];
		System.arraycopy(scores, 0, scoresFixed, 0, lastIndex + 1);
		
		average(scoresFixed);
		return (scoresFixed);
	}
	
	public static double average(double[] scores)
	{
		double avg = 0;
		
		for (int i = 0; i < scores.length; i++)
		{
			avg += scores[i];
		}
		avg = (avg / scores.length);
		aboveBelowAvg(scores, avg);
		
		System.out.println("The average is " + avg);
		return (avg);
	}
	
	public static int[] aboveBelowAvg(double[] scores, double avg)
	{
		int belowAvg = 0;
		int aboveAvg = 0;
		int[] aboveBelow = new int[2];
		
		for (int i = 0; i < scores.length; i++)
		{
			if (scores[i] >= avg)
			{
				aboveAvg++;
			}
			
			else
			{
				belowAvg++;
			}
	
		}
		
		aboveBelow[0] = aboveAvg;
		aboveBelow[1] = belowAvg;
		System.out.println("There are " + aboveAvg + " numbers that are above average and " + belowAvg + " that are below the average.");
		return(aboveBelow);
		
	} */

}
