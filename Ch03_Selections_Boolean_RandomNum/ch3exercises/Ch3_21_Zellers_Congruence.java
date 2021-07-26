package ch3exercises;
import java.util.*;

		/* Chapter 3 - Exercise 21:
		 * (Science: day of the week) Zeller’s congruence is an algorithm developed by Christian Zeller to calculate the day 
		 * of the week. The formula is: h = (q + ((26 * (m + 1)) / 10.0) + k + (k / 4.0) + (j / 4.0) + (5 * j)) % 7;
		 * h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, 6: Friday).
		■ q is the day of the month.
		■ m is the month (3: March, 4: April, ..., 12: December). January and February are counted as months 13 and 14 
		of the previous year.
		■ j is the century (i.e., year/100)
		■ k is the year of the century (i.e., year % 100).
		Note that the division in the formula performs an integer division. Write a program that prompts the user to enter a 
		year, month, and day of the month, and displays the name of the day of the week. Here are some sample runs:
		Enter year: (e.g., 2012): 2015
		Enter month: 1-12:  1
		Enter the day of the month: 1-31: 25
		Day of the week is Sunday
		
		Enter year: (e.g., 2012): 2012
		Enter month: 1-12: 5
		Enter the day of the month: 1-31: 12
		Day of the week is Saturday
		 */
					// By Khaled Shah 

public class Ch3_21_Zellers_Congruence
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter a year (e.g. 2012): ");
		int year = kb.nextInt();
		
		int j =(int) year / 100;	//century
		int k = (int) year % 100; //year of century
		
		System.out.print("Enter month (1-12): ");
		int m = kb.nextInt();
		
		switch (m)
		{
			case 1: m = 13; k -= 1;
			break;
			case 2: m = 14; k =- 1;
			break;
		}
		
		System.out.print("Enter the day of the month (1-31): ");
		int q = kb.nextInt();
		
		int h = ( q +( (int) (26 * (m+1) / 10)) + k + ((int) k / 4) + ((int) j/4) + 5 * j) % 7;
		
		String dayName = "";
		
		switch (h)
		{
			case 0: dayName = "Saturday";
			break;
			case 1: dayName = "Sunday";
			break;
			case 2: dayName = "Monday";
			break;
			case 3: dayName = "Tuesday";
			break;
			case 4: dayName = "Wednesday";
			break;
			case 5: dayName = "Thursday";
			break;
			case 6: dayName = "Friday";
			break;
			default: dayName = "Invalid result.";
		}
		
		System.out.println("Day of the week is " + dayName);

	}

}
