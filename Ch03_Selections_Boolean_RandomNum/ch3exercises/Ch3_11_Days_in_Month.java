package ch3exercises;
import java.util.Scanner;

		/* Chapter 3 - Exercise 11:
		 * (Find the number of days in a month) Write a program that prompts the user to enter the month and year and 
		 * displays the number of days in the month. For example, if the user entered month 2 and year 2012, 
		 * the program should display that February 2012 had 29 days. If the user entered month 3 and year 2015, 
		 * the program should display that March 2015 had 31 days.
		 */
				//By Khaled Shah


public class Ch3_11_Days_in_Month
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter year: ");
		int year = kb.nextInt();
		System.out.print("Enter month (1-12): ");
		int month = kb.nextInt();
		
		boolean leapYear = (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
		int days = 0;
		String monthName = "";
		
		if (month == 1)
		{
			monthName = "January";
			days = 31;
		}
		
		else if (month == 3)
		{
			monthName = "March";
			days = 31;
		}
		
		else if (month == 4)
		{
			monthName = "April";
			days = 30;
		}
		
		else if (month == 5)
		{
			monthName = "May";
			days = 31;
		}
		
		else if (month == 6)
		{
			monthName = "June";
			days = 30;
		}
		
		else if (month == 7)
		{
			monthName = "July";
			days = 31;
		}
		
		else if (month == 8)
		{
			monthName = "August";
			days = 31;
		}
		
		else if (month == 9)
		{
			monthName = "Sepetember";
			days = 30;
		}
		
		else if (month == 10)
		{
			monthName = "October";
			days = 31;
		}
		
		else if (month == 11)
		{
			monthName = "November";
			days = 30;
		}
		
		else if (month == 12)
		{
			monthName = "December";
			days = 31;
		}
		
		else if (month == 2)
		{
			monthName = "February";
			
			if (leapYear)
			{
				days = 29;
			}
			
			else
			{
				days = 28;
			}
			
		}
		
		System.out.println(monthName + " of " + year + " had " + days + " days.");
	}

}

/* Re-done with methods:
 * public static void main(String[] args)
	{
	
		System.out.print("Enter month (number): ");
		int month = kb.nextInt();
		
		System.out.print("Enter year: ");
		int year = kb.nextInt();
		
		String monthName = getMonthName(month);
		//boolean isLeapYear = isLeapYear(year);
		
		int daysInMonth = getDaysInMonth(monthName, year);

		System.out.println(monthName + " " + year + " had " + daysInMonth + " days.");
		
	}
	
	public static String getMonthName(int month)
	{
		String monthName = "";
		
		switch (month)
		{
			case 1: monthName = "January";
			break;
			case 2: monthName = "February";
			break;
			case 3: monthName = "March";
			break;
			case 4: monthName = "April";
			break;
			case 5: monthName = "May";
			break;
			case 6: monthName = "June";
			break;
			case 7: monthName = "July";
			break;
			case 8: monthName = "August";
			break;
			case 9: monthName = "September";
			break;
			case 10: monthName = "October";
			break;
			case 11: monthName = "November";
			break;
			case 12: monthName = "December";
		}
		return monthName;
	}
	
	public static boolean isLeapYear(int year)
	{
		boolean isLeapYear = ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
		return isLeapYear;
	}
	
	public static int getDaysInMonth(String monthName, int year)
	{
		int numberOfDays = 0;
		
		switch(monthName)
		{
			case "January": numberOfDays = 31;
			break;
			case "February": numberOfDays = ((isLeapYear(year))? 29: 28);
			break;
			case "March": numberOfDays = 31;
			break;
			case "May": numberOfDays = 31;
			break;
			case "July": numberOfDays = 31;
			break;
			case "August": numberOfDays = 31;
			break;
			case "October": numberOfDays = 31;
			break;
			case "December": numberOfDays = 31;
			Default: numberOfDays = 30;
			break;
		}
		
		return numberOfDays;
	}

 */

// With java 14 switch expression (very elegant!)

// 		System.out.print("Enter the month (number): ");
//		int monthNum = kb.nextInt();
//		System.out.print("Enter the year: ");
//		int year = kb.nextInt();
//
//		int days = switch (monthNum)
//		{
//		case 1, 3, 5, 7, 8, 10, 12 -> 31;
//		case 4, 6, 9, 11 -> 30;
//		case 2 -> ((isLeapYear(year))? 29: 28);
//		default -> 0;
//		};
//
//		System.out.printf("%d/%d had %d days.", monthNum, year, days);
