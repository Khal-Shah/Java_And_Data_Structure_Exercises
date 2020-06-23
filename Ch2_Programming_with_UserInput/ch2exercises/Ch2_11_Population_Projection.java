package ch2exercises;
import java.util.Scanner;

		/* Chapter 2 - Exercise 11: 
		 * (Population projection) Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years and 
		 * displays the population after the number of years. Use the hint in Programming Exercise 1.11 for this program. 
		 * The population should be cast into an integer. Here is a sample run of the program:
		 * Enter the number of years: 5
			The population in 5 years is 325932970
		 */
				//By Khaled Shah

public class Ch2_11_Population_Projection
{
	public static final int pop_2012 = 312_032_486;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args)
	{
		// Birth per (secs to year): (1 birth / 7 secs) * (3600 secs/ 1 hour) * (24 hour / 1 day) * (365 day / 1 year) = birth / year
				int birthPerYear =  (int) ((3600 * 24 * 365) / 7.0);
				int deathPerYear = (int) ((3600 * 24 * 365) / 13.0);
				int immigrantPerYear = (int) ((3600 *24 * 365) / 45.0);
				int currentPop = pop_2012;
				
				System.out.print("Enter the number of years (after 2012): ");
				int yearsAfter = input.nextInt();
				int currentYear = 2012;
				int i;
				
				for (i = 2012; (i <= (currentYear + (yearsAfter-1))); i++)
				{
					currentPop += (birthPerYear + immigrantPerYear) - deathPerYear;
				}
				
				System.out.println("The population in " + (currentYear + yearsAfter) + " is projected to be " + currentPop);

	}

}
