package ch3exercises;
import java.util.*;

		/* Chapter 3 - Exercise 30:
		 * (Current time) Revise Programming Exercise 2.8 to display the hour using a 12-hour clock. 
		 * Here is a sample run:
		 * Enter the time zone offset to GMT: -5
			The current time is 4:50:34 AM
		 */
				//By Khaled Shah


public class Ch3_30_Time_12hr
{
	static Scanner kb = new Scanner(System.in);
	
	static long TOTAL_MS =  System.currentTimeMillis();
	static long TOTAL_S = (TOTAL_MS / 1000);
	static long CURRENT_S = (TOTAL_S % 60);
	
	static long TOTAL_MIN = (TOTAL_S / 60);
	static long CURRENT_MIN = (TOTAL_MIN % 60);
	
	static long TOTAL_HR = (TOTAL_MIN / 60);
	static long CURRENT_HR = (TOTAL_HR % 24);

	public static void main(String[] args)
	{
		System.out.print("Enter the time zone offset to GMT: ");
		int timezone = kb.nextInt();
		
		int currentHR = (int) CURRENT_HR + timezone;
		
		if (currentHR < 0 )
		{
			currentHR += 24;
		}
		
		else if(currentHR > 24)
		{
			currentHR -= 24;
		}
		
	
		
		System.out.printf("The current time is %d:" + ((CURRENT_MIN < 10)? "0" : "") + "%d:" + ((CURRENT_S < 10)? "0" : "")
		+ "%d " + ((currentHR > 12)? "PM" : "AM") ,
				(currentHR % 12), CURRENT_MIN, CURRENT_S);
		
//		System.out.println(CURRENT_HR);

	}

}
