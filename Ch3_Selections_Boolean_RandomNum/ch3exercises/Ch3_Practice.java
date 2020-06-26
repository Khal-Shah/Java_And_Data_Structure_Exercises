package ch3exercises;
import java.util.*;

/* Chapter 3 - Exercise 11:
 * (Find the number of days in a month) Write a program that prompts the user to enter the month and year and
 * displays the number of days in the month. For example, if the user entered month 2 and year 2012,
 * the program should display that February 2012 had 29 days.
 * If the user entered month 3 and year 2015, the program should display that March 2015 had 31 days.
 */
//By Khaled Shah


public class Ch3_Practice
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter the month (number): ");
		int monthNum = kb.nextInt();
		System.out.print("Enter the year: ");
		int year = kb.nextInt();

		int days = switch (monthNum)
				{
					case 1, 3, 5, 7, 8, 10, 12 -> 31;
					case 4, 6, 9, 11 -> 30;
					case 2 -> ((isLeapYear(year))? 29: 28);
					default -> 0;
				};

		System.out.printf("%d/%d had %d days.", monthNum, year, days);
	}

	public static boolean isLeapYear(int year)
	{
		return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
	}
}
