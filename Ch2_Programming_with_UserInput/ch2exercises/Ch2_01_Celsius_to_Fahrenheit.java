package ch2exercises;
import java.util.*;	//or import java.util.Scanner

		/*Chapter 2 - Exercise 1:
		 * (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a double value from the console, 
		 * then converts it to Fahrenheit and displays the result. The formula for the conversion is as follows:
         	fahrenheit = (9 / 5) * celsius + 32
			Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8. 
			Here is a sample run:
			Enter a degree in Celsius: 43
			43 Celsius is 109.4 Fahrenheit 
		 */
			//By Khaled Shah
				
public class Ch2_01_Celsius_to_Fahrenheit
{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter the temperature in celsius that you'd like to convert: ");
		double celsius = input.nextDouble();
		double fahrenheit = (9 / 5.0) * celsius + 32;
		
		System.out.println("\n" + celsius + "' Celsius is " + fahrenheit + "' F");

	}

}
