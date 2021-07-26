package ch6exercises;
import java.util.Scanner;

/* Chapter 6 - Exercise 8:
 * (Conversions between Celsius and Fahrenheit) Write a class that contains the following two methods:
 * public static double celsiusToFahrenheit(double celsius)
 * public static double fahrenheitToCelsius(double fahrenheit)
 * The formula for the conversion is:
      fahrenheit = (9.0 / 5) * celsius + 32
      celsius = (5.0 / 9) * (fahrenheit – 32)
      
      Write a test program that invokes these methods to display the following tables:
      Celsius 					Fahrenheit 					|					 Fahrenheit						Celsius
		40.0 							104.0							| 						120.0 								  48.89

 */
		//By Khaled Shah

public class Ch6_08_Convert_Temp
{

	public static void main(String[] args)
	{
		double celTemp = 40.0;
		double fahrenTemp = 120.0;
		
		System.out.println("Celsius\t\t\tFahrenheit\t\t\t |\t\t\tFahrenheit\t\t\t\tCelsius");
		
		for (int  i = 0; i <= 9; i++)
		{
			System.out.printf("%6.1f %32.2f \t\t\t | %32.1f %38.2f \n", celTemp, celsiusToFahrenheit(celTemp), fahrenTemp, 
					fahrenheitToCelsius(fahrenTemp));
			celTemp -= 1;
			fahrenTemp -= 10;
		}

	}
	
	public static double celsiusToFahrenheit(double celsius)
	{
		return (9.0 / 5) * celsius + 32;
	}
	
	public static double fahrenheitToCelsius(double fahrenheit)
	{
		return (5.0 / 9) * (fahrenheit - 32);
	}

}
