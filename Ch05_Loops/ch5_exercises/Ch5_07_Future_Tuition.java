package ch5_exercises;
import java.util.*;

		/* Chapter 5 - Exercise 7:
		 * (Financial application: compute future tuition) Suppose that the tuition for a university is $10,000 this year and 
		 * increases 5% every year. In one year, the tuition will be $10,500. Write a program that computes the tuition in ten 
		 * years and the total cost of four years’ worth of tuition after the tenth year.
		 */
				//By Khaled Shah

public class Ch5_07_Future_Tuition
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		double tuition = 10_000;
		double tenthYear = 0;
		double tuition4yrs = 0;
		
		for (int year = 1; year <= 14; year++)
		{
			tuition += (tuition * 0.05);
			
			if (year == 10)
			{
				tenthYear = tuition;
			}
			
			if (year > 10)
			{
				tuition4yrs += tuition;
			}
		}
		
		System.out.printf("The tuition in ten years will be $%.2f and a 4 year degree after 10 years will cost $%.2f", tenthYear, 
				tuition4yrs);

	}

}
