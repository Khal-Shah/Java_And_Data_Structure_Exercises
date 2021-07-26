package ch1exercises;

	/* Chapter 1 - Exercise 12:
	 *  (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. 
	 *  Write a program that displays the average speed in kilometers per hour. (Note that 1 mile is 1.6 kilometers.)
	 */
			//By Khaled Shah

public class Ch1_12_Speed_in_km
{

	public static void main(String[] args)
	{
		//avg mph: (24 miles /((3600 * 40 * 60) + 35) * (3600 sec / 1 hr)
		//mph to kmh: (miles/hour) * (1.6 km / 1 mile)
		double secToHr = ((3600 + (40 * 60) + 35) / 3600.0);
		double mph = (24 / secToHr);
		double kmph = mph * 1.6;
		
		System.out.printf("The average speed in km per hour is %.2f", kmph);;

	}

}
