package ch3exercises;
import java.util.Scanner;

	/* Chapter 3 - Exercise 5:
	 * (Find future dates) Write a program that prompts the user to enter an integer for today’s day of the week 
	 * (Sunday is 0, Monday is 1, ..., and Saturday is 6). Also prompt the user to enter the number of days after today 
	 * for a future day and display the future day of the week. Here is a sample run:
	 * Enter today's day: 1
		Enter the number of days elapsed since today: 3
		Today is Monday and the future day is Thursday
		
		Enter today's day: 0
		Enter the number of days elapsed since today: 31
		Today is Sunday and the future day is Wednesday
	 */
			//By Khaled Shah

public class Ch3_05_Future_Dates
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter an integer for today's day: (Sunday is 0, Monday is 1, ..., Saturday is 6): ");
		int dayNum = kb.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		int elapsed = kb.nextInt();
		
		String dayName = "";
		
		switch (dayNum)
		{
			case 0: dayName = "Sunday";
			break;
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
		}
		
		int futureNum = (dayNum + elapsed) % 7;
		String futureDay = "";
		
		switch (futureNum)
		{
			case 0: futureDay = "Sunday";
			break;
			case 1: futureDay = "Monday";
			break;
			case 2: futureDay = "Tuesday";
			break;
			case 3: futureDay = "Wednesday";
			break;
			case 4: futureDay= "Thursday";
			break;
			case 5: futureDay= "Friday";
			break;
			case 6: futureDay = "Saturday";
			break;
			default: futureDay = "Invalid";
		}
		
		System.out.println("Today is " + dayName + " and " + elapsed +" days from now is " + futureDay);
		
	}

}
