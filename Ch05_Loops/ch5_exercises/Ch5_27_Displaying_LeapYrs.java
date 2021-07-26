package ch5_exercises;

/* Chapter 5 - Exercise 27:
 * (Display leap years) 
 * Write a program that displays all the leap years, ten per line, from 101 to 2100, 
 * separated by exactly one space. Also display the number of leap years in this period
 * boolean leapYear = (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
 */
		//By Khaled Shah

public class Ch5_27_Displaying_LeapYrs
{

	public static void main(String[] args)
	{
		int totalYrs = 0;
		int year = 101;
		
		while (year <= 2100)
		{
			boolean isLeapYear = (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
			
			if (isLeapYear)
			{
				System.out.print(year + " ");
				totalYrs += 1;
				
				if (totalYrs % 10 == 0)
				{
					System.out.println();
				}
			}
			year++;
		}
		
		System.out.println("\nIn that " + (year - 101) + " year time period, there have been " + totalYrs + " leap years.");

	}

}
