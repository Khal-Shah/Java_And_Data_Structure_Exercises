package ch2exercises;
import java.util.*;

		/* Chapter 2 - Exercise 17:
		 * (Science: wind-chill temperature) How cold is it outside? The temperature alone is not enough to provide 
		 * the answer. Other factors including wind speed, relative humidity, and sunshine play important roles in 
		 * determining coldness outside. In 2001, the National Weather Service (NWS) implemented the new wind-chill 
		 * temperature to measure the coldness using temperature and wind speed. The formula is
		 * twc = 35.74 + 0.6215ta - 35.75v^0.16 + 0.4275tav^0.16
		 * where ta is the outside temperature measured in degrees Fahrenheit and v is the speed measured in miles 
		 * per hour. twc is the wind-chill temperature. The formula cannot be used for wind speeds below 2 mph or 
		 * temperatures below -58' F or above 41' F.
			Write a program that prompts the user to enter a temperature between - 58 'F and 41'F and a wind speed 
			greater than or equal to 2 and displays the wind-chill temperature. Use Math.pow(a, b) to compute v^0.16. 
			Here is a sample run:
			Enter the temperature in Fahrenheit between -58°F and 41°F:
			5.3
			Enter the wind speed (>=2) in miles per hour: 6
			The wind chill index is -5.56707
		 */
				//By Khaled Shah

public class Ch2_17_Wind_Chill_Temp
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter the temperature in Fahrenheit between -58'F and 41'F: ");
		double temperature = kb.nextDouble();
		
		while (temperature < -58 || temperature > 41)
		{
			System.out.print("Invalid entry. Please enter a temperature between -58'F and 41'F: ");
			temperature = kb.nextDouble();
		}
		
		System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
		double windSpeed = kb.nextDouble();
		
		while (windSpeed < 2)
		{
			System.out.print("Invalid entry. Please enter a valid wind speed above 2 mph: ");
			windSpeed = kb.nextDouble();
		}
		
		double windChill = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16)) + 
				(0.4275 * temperature * Math.pow(windSpeed, 0.16));
		
		System.out.println("The wind chill index is " + windChill);
	}

}
