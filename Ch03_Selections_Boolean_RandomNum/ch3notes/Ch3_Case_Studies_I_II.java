package ch3notes;
import java.util.*;

		/* BMI = weight in kg / (height in m squared)
		 *  BMI < 18.5 : underweight
		 *  18.5 <= BMI < 25: normal
		 *  25 <= BMI < 30: overweight
		 *  30 <= BMI : obese
		 *  User enters weight in pounds and height in inches
		 *  1 lb is 0.45359237 kilograms and one inch is 0.0254 m
		 */

public class Ch3_Case_Studies_I_II
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
//		System.out.println("Enter your weight (in pounds) and height (in inches) below.");
//		System.out.print("Weight: ");
//		double weight = kb.nextDouble() * 0.45359237;
//		System.out.print("Height: ");
//		double height = kb.nextDouble() * 0.0254;
//		
//		double bmi = (weight) / Math.pow(height, 2);
//		String category = "";
//		
//		if (bmi < 18.5)
//		{
//			category = "underweight";
//		}
//		
//		else if ((bmi >= 18.5) && (bmi < 25))
//		{
//			category = "normal";
//		}
//		
//		else if ((bmi >= 25) && (bmi < 30))
//		{
//			category = "overweight";
//		}
//		
//		else if ((bmi >= 30))
//		{
//			category = "obese";
//		}
//		
//		else
//		{
//			category = "uncategorized";
//		}
//		
//		System.out.println("Your BMI is " + bmi + " which is considered " + category);
	
	// Computing taxes: You are to write a program to compute personal income tax. Your program should prompt the 
		// user to enter the filing status and taxable income and compute the tax. Enter 0 for single filers, 1 for married 
		//filing jointly or qualified widow(er), 2 for married filing separately, and 3 for head of household.
		/* 
		 */
		
		System.out.print("Enter your status (0 for single, 1 for married filing jointly or qualified widow, 2 for Married\n"
				+ "Filing Separately and 3 for Head of Household");
		int status = kb.nextInt();
		
		System.out.print("Enter your income (annual): ");
		double income = kb.nextDouble();
		double tax;
		
		if (status == 0)
		{
			if (income <= 8350 )
			{
				tax = income * 0.10;
			}
			
			else if (income <= 33950)
			{
				tax = 8350 * 0.10 + (income - 8350) * 0.15;
			}
			
			else if (income <= 82250)
			{
				tax = 0.10 * 8350 + (33950 - 8350) * 0.15 + (82250 - income) * 0.25;
			}
			
			else if (income <= 171550)
			{
				tax = 0.10 * 8350 + (income - 33950) * 0.15 + (82250 - income) * 0.25 + (171550 - income) * 0.28;
			}
			
			else if (income <= 372950)
			{
				tax = 0.10 * 8350 + (income - 33950) * 0.15 + (82250 - income) * 0.25 + (171550 - income) * 0.28 + 
						(372950 - income) * 0.33;
			}
			
			else if (income >= 372951)
			{
				tax = 0.10 * 8350 + (income - 33950) * 0.15 + (82250 - income) * 0.25 + (171550 - income) * 0.28 + 
						(372950 - income) * 0.33 + (income * 0.35);
			}
		}
	
	}
	

}
