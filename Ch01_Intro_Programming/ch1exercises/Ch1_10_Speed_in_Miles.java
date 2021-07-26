package ch1exercises;

	/* Chapter 1 - Exercise 10:
	 * (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30 seconds. Write a program 
	 * that displays the average speed in miles per hour. (Note that 1 mile is 1.6 kilometers.)
	 */
			// By Khaled Shah

public class Ch1_10_Speed_in_Miles
{

	public static void main(String[] args)
	{
		//14km in 45 mins and 30 secs = avg km/hour?
		//45 mins = (60*45 + 30 secs) * 1 hr/3600secs)
		// km/hour * (1 mile/ 1.6 km) = mile/hour
		
		double hour = ((60 * 45) + 30) / 3600.0;
		double kmPerHour = 14 / hour;
		double milePerHour = kmPerHour / 1.6;

		System.out.printf("The average speed is %.2f miles per hour.", milePerHour);
	}

}
