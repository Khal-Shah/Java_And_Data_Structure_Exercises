package ch5_exercises;
import java.util.Scanner;

/* Chapter 5 - Exercise 28:
 * (Display the first days of each month) Write a program that prompts the user to enter the year 
 * and first day of the year, and displays the first day of each month in the year. 
 * For example, if the user entered the year 2013, and 2 for Tuesday, your program should display the following output:
         January 1, 2013 is Tuesday
         ...
         December 1, 2013 is Sunday
 * 
 */
		//By Khaled Shah

public class Ch5_28_FirstDaysOfMonths
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter the year: ");
		int year = kb.nextInt();
		
		System.out.print("Enter the first day of that year (1 for Monday...7 for Sunday): ");
		int day = kb.nextInt();
		
		String monthName = "";
		int monthDays = 0;
		String dayName;
		
		for (int month = 1; month <= 12; month++)
		{
			switch (month)
			{
				case 1: monthName = "January";
								monthDays = 31;
				break;
				case 2: monthName = "February";
				monthDays = ((((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))? 29: 28);
				break;
				case 3: monthName = "March";
				monthDays = 31;
				break;
				case 4: monthName = "April";
				monthDays = 30;
				break;
				case 5: monthName = "May";
				monthDays = 31;
				break;
				case 6: monthName = "June";
				monthDays = 30;
				break;
				case 7: monthName = "July";
				monthDays = 31;
				break;				
				case 8: monthName = "August";
				monthDays = 31;
				break;
				case 9: monthName = "September";
				monthDays = 30;
				break;
				case 10: monthName = "October";
				monthDays = 31;
				break;
				case 11: monthName = "November";
				monthDays = 30;
				break;
				case 12: monthName = "December";
				monthDays = 31;
				break;
				default: monthName = "invalid";
				monthDays = 30;
			}
			
			day = day % 7;
			
			switch (day)
			{
				case 1: dayName = "Monday";
				break;
				case 2: dayName = "Tuesday";
				break;
				case 3: dayName = "Wednesday";
				break;
				case 4: dayName = "Thursday";
				break;
				case 5: dayName = "Friday";
				break;
				case 6: dayName = "Saturday";
				break;
				case 0: dayName = "Sunday";
				break;
				default: dayName = "invalid";
			}
			System.out.println(monthName + " 1, " + year + " is a " + dayName);
			day += monthDays;
			}
		
	}

}
