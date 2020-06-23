package ch2exercises;
import java.util.Scanner;

			/* Chapter 2 - Exercise 8:
			 * (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays the current time in GMT. 
			 * Revise the program so that it prompts the user to enter the time zone offset to GMT and displays the time 
			 * in the specified time zone. Here is a sample run:
			 * Enter the time zone offset to GMT: −5
				The current time is 4:50:34
			 */
					//By Khaled Shah 

public class Ch2_08_Time_Zone
{
	static Scanner kb = new Scanner(System.in);

	final static long totalMSec = System.currentTimeMillis();
	final static long totalSec = totalMSec/1000; 			//1000ms = 1sec
	final static int currentSec = (int) totalSec % 60;
	final static long totalMins = totalSec / 60;			//1 min = 60 sec
	final static int currentMin = (int) totalMins % 60;
	final static long totalHrs = totalSec / 3600;						//3600 sec = 1hr
	final static int currentHr = (int) totalHrs % 24;

	public static void main(String[] args)
	{
		System.out.print("Enter the time zone offset to GMT: ");	//-4 when DST, -5 otherwise.
		int offset = kb.nextInt();

		System.out.printf("Current time is %d:%d:%d", ((((currentHr + offset) % 24) < 0)? (currentHr + offset + 12): currentHr), currentMin, currentSec);

	}

}
