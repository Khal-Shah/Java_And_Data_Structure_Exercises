package ch2exercises;
import java.util.*;

		/* Chapter 2 - Exercise 4
		 * (Convert pounds into kilograms) Write a program that converts pounds into kilograms. The program prompts 
		 * the user to enter a number in pounds, converts it to kilograms, and displays the result. 
		 * One pound is 0.454 kilograms. Here is a sample run:
		 * Enter a number in pounds: 55.5
			55.5 pounds is 25.197 kilograms
		 */
				//By Khaled Shah

public class Ch2_04_Pounds_into_kg
{
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter the mass in pound (lbs): ");
		double pounds = input.nextDouble();
		//lbs to kg: pounds * (0.454kg/1 pound)
		double kilogram = pounds * 0.454;
		
		System.out.printf("%.2f lbs is %.3f kg", pounds, kilogram);

	}

}
