package ch6exercises;

/* Chapter 6 - Exercise 16:
 * (Number of days in a year) Write a method that returns the number of days in a year using the following header:
public static int numberOfDaysInAYear(int year)
Write a test program that displays the number of days in year from 2000 to 2020.
 */
		//By Khaled Shah

public class Ch6_16_Days_inYear
{

	public static void main(String[] args)
	{
		System.out.println("Year\t\t\t\tDays");
		printDaysinYear(2000, 2020);

	}
	
	public static boolean isLeapYear (int year)
	{
		return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
		
	}
	
	public static void printDaysinYear(int year1, int year2)
	{
		for (int i = year1; i <= year2; i++)
		{
			System.out.println(i + "\t\t\t\t" + ((isLeapYear(i))? 366 : 365));
		}
	}

}