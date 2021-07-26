package ch2exercises;
import java.util.Scanner;

		/* Chapter 2 - Exercise 7:
		 * Find the number of years) Write a program that prompts the user to enter the minutes (e.g., 1 billion), 
		 * and displays the number of years and days for the minutes. For simplicity, assume a year has 365 days. 
		 * Here is a sample run:
		 * Enter the number of minutes: 1_000_000_000
			1000000000 minutes is approximately 1902 years and 214 days
		 */
				//By Khaled Shah

public class Ch2_07_Find_NumberOf_Years
{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter the number of minutes: ");
		long totalMinutes = input.nextLong();
		//mins to yrs: totalMins * (1 hr / 60 mins) * (1 day / 24 hrs) * (1 yr / 365 days) = yrs
		long years = (long) (totalMinutes / (60 * 24 * 365));
		int days = (int) (totalMinutes / (60 * 24)) % 365;		// convert min to days then mod with 365
		
		System.out.println(totalMinutes + " minutes is approximately " + years + " years and " + days + " days." );
		
	}

}
