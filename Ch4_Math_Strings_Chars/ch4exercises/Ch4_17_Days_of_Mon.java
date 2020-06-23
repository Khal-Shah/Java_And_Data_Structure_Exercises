package ch4exercises;
import java.util.Scanner;

public class Ch4_17_Days_of_Mon

		/* Chapter 4 - Exercise 17:
		 * (Days of a month) Write a program that prompts the user to enter a year and the first three letters of a month 
		 * name (with the first letter in uppercase) and displays the number of days in the month. 
		 * 
		 * Here is a sample run:
		 * Enter a year: 2001
			Enter a month: Jan
			Jan 2001 has 31 days
			
			Enter a year: 2016
			Enter a month: Feb
			Jan 2016 has 29 days
			
			Leap year conditions: 
			isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		 */
				// By Khaled Shah

{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter a year: ");
		int year = kb.nextInt();
		
		System.out.print("Enter a month (only the first three letters): ");
		String month = kb.next();
		
		char firstLetter = month.charAt(0);
		int days = 30;
		String monthFull = "";
		
		while (!Character.isUpperCase(firstLetter) || month.length() != 3)
		{
			System.out.print("Please make sure to capitalize the first letter of the month and only enter three letters "
					+ "(ex: Jan for January). Try again: ");
			month = kb.next();
			firstLetter = month.charAt(0);
		}
				
		// isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		switch (month)
		{
			case "Jan": monthFull = "January"; days = 31;
			break;
			case "Feb": monthFull = "February"; 
			days = (((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))? 29: 28);
			break;
			case "Mar": monthFull = "March"; days = 31;
			break;
			case "Apr": monthFull = "April";
			break;
			case "May": monthFull = month; days = 31;
			break;
			case "Jun": monthFull = "June";
			break;
			case "Jul": monthFull = "July"; days = 31;
			break;
			case "Aug": monthFull = "August"; days = 31;
			break;
			case "Sep": monthFull = "September";
			break;
			case "Oct": monthFull = "October"; days = 31;
			break;
			case "Nov": monthFull = "November"; 
			break;
			case "Dec": monthFull = "December"; days = 31;
		}
			
		System.out.println((year >= 2019)? (monthFull + " " + year + " has " + days + " days."): 
			monthFull + " " + year + " had " + days + " days." );

	}

}
