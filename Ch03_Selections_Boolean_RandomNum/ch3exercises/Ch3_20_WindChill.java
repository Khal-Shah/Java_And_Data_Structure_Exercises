package ch3exercises;
import java.util.Scanner;

/* Chapter 3 - Exercise 20:
 * (Science: wind-chill temperature) Programming Exercise 2.17 gives a formula to compute the wind-chill temperature. 
 * The formula is valid for temperatures in the range between −58' F and 41' F and wind speed greater than or equal to 2. 
 * Write a program that prompts the user to enter a temperature and a wind speed. 
 * The program displays the wind-chill temperature if the input is valid; otherwise, it displays a message 
 * indicating whether the temperature and/or wind speed is invalid.
 *  twc = 35.74 + 0.6215ta - 35.75v^0.16 + 0.4275tav^0.16
 */
		//By Khaled Shah

public class Ch3_20_WindChill
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		double temperature;
		double wind;
		double twc = 0;
		boolean tempValid = false;
		boolean windValid = false;
		
		System.out.print("Enter the temperature (between -58' F and 41' F): ");
		temperature = kb.nextDouble();
		System.out.print("Enter the wind speed (at least 2 mph): ");
		wind = kb.nextDouble();

		do
		{
			tempValid = ((temperature > -58) && (temperature < 41)? true: false);
			windValid = ((wind >= 2)? true: false);
			
			if (!tempValid)
			{
				System.out.print("The temperature is invalid. Please try again: ");
				temperature = kb.nextDouble();
			}
			
			else if (!windValid)
			{
				System.out.print("The wind speed is invalid. Please try again: ");
				wind = kb.nextDouble();
			}
			
			else
			{
				twc = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(wind, 0.16) + 0.4275 * temperature * Math.pow(wind, 0.16);
			}
				
			
		} while(!tempValid || !windValid);
		
		System.out.println("The wind chill temperature is " + twc);

	}

}
