package ch2exercises;
import java.util.*;

		/* Chapter 2 - Exercise 14:
		 * (Health application: computing BMI) Body Mass Index (BMI) is a measure of health on weight. It can be calculated 
		 * by taking your weight in kilograms and dividing by the square of your height in meters. Write a program that 
		 * prompts the user to enter a weight in pounds and height in inches and displays the BMI. 
		 * Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters. 
		 * Here is a sample run:
		 * Enter weight in pounds: 95.5
			Enter height in inches: 50
			BMI is 26.8573
		 */
				//By Khaled Shah


public class Ch2_14_Computing_BMI
{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args)
	{
		// lbs to kg: lbs * (0.45359237 kg/ 1 lb)
		// inches to meters: inches * (0.0254 m / 1 inch)
		
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble() * 0.45359237;
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble() * 0.0254;
		
		double bmi = weight / (Math.pow(height, 2));
		
		System.out.println("BMI is " + bmi);
		
		
	}

}
