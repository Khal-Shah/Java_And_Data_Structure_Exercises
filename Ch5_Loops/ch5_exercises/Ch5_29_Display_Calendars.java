package ch5_exercises;
import java.util.*;

/* Chapter 5 - Exercise 29:
 *  (Display calendars) Write a program that prompts the user to enter the year and first day of the year and 
 *  displays the calendar table for the year on the console. For example, if the user entered the year 2013, 
 *  and 2 for Tuesday, January 1, 2013, your program should display the calendar for each month in the year, 
 *  as follows:

             January 2015
---------------------------------------
Sun   Mon   Tue   Wed   Thu   Fri   Sat   
                        1        2         3      4     5     
   6         7        8       9       10      11    12    
   13      14     15     16      17      18    19   
    20      21     22     23     24       25    26   
     27     28     29     30     31 
 */
		//By Khaled Shah

public class Ch5_29_Display_Calendars
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
			 System.out.printf("%" + (34 + monthName.length()) / 2 + "s %s\n",
				     monthName, year);
				   System.out.println(String.format("%39S", "").replace(' ', '-'));
				   System.out.printf("%-6s%-6s%-6s%-6s%-6s%-6s%-6s\n", "Sun", "Mon",
				     "Tue", "Wed", "Thu", "Fri", "Sat");			
				   day += monthDays;
				     
				     if (day != 0) {
				    	    System.out.print(String.format("%" + 6 * day + "s", ""));
				    	   }
				    	 
				    	   // Loop to print date
				    	 
				    	   for (int i = 1; i <= monthDays; i++) {
				    	    System.out.printf("%-8d", i);
				    	 
				    	    // print new line after Saturday
				    	    if (day % 7 == 6) {
				    	     System.out.println("");
				    	    }
				    	    day += 1;
				    	   }
				    	   // print new line at the end of each month
				    	   System.out.println("");
			}

	}

}
