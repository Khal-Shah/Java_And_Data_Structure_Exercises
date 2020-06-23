package ch1exercises;

	/* Chapter 1 - Exercise 11:
	 * (Population projection) The U.S. Census Bureau projects population based on the following assumptions:
	 * ■ One birth every 7 seconds
		■ One death every 13 seconds
		■ One new immigrant every 45 seconds
		
		Write a program to display the population for each of the next five years. Assume the current population is 
		312,032,486 and one year has 365 days. Hint: In Java, if two integers perform division, the result is an integer. 
		The fractional part is truncated. For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result 
		with the fractional part, one of the values involved in the division must be a number with a decimal point. 
		For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
	 */
			//By Khaled Shah

public class Ch1_11_Population_Projection
{
	public static final int pop_2012 = 312_032_486;

	public static void main(String[] args)
	{
		// Birth per (secs to year): (1 birth / 7 secs) * (3600 secs/ 1 hour) * (24 hour / 1 day) * (365 day / 1 year) = birth / year
		int birthPerYear =  (int) ((3600 * 24 * 365) / 7.0);
		int deathPerYear = (int) ((3600 * 24 * 365) / 13.0);
		int immigrantPerYear = (int) ((3600 *24 * 365) / 45.0);
		int currentPop = pop_2012;
		
		for (int currentYear = 2012; currentYear <= 2017; currentYear++)
		{
			System.out.println("The population in " + currentYear + " is projected to be " + currentPop);
			currentPop += (birthPerYear + immigrantPerYear) - deathPerYear;
		}

	}

}
