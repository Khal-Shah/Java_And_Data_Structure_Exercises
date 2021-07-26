package ch3exercises;
import java.util.*;

/* Chapter 3 - Exercise 6:
 * (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to let the user enter weight, feet, and inches. 
 * For example, if a person is 5 feet and 10 inches, you will enter 5 for feet and 10 for inches. 
 *
 * It can be calculated by taking your weight in kilograms and dividing it by the square of your height in meters. 
 * The interpretation of BMI for people 20 years or older is as follows:
 * BMI											Interpretation
BMI < 18.5 									Underweight 
18.5 ≤ BMI 25.0 								Normal
25.0 ≤ BMI < 30.0 							Overweight
 BMI ≤ 30.0											Obese

 * Here is a sample run:
 * Enter weight in pounds: 140
Enter feet: 5
Enter inches: 10
BMI is 20.087702275404553
Normal
 */
		//By Khaled Shah

public class Ch3_06_BMI_NonMetric
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter weight in pounds: ");
		double weight = kb.nextDouble();
		System.out.print("Now for your height information.\nEnter feet: ");
		double heightFeet = kb.nextDouble();
		System.out.print("Enter inches: ");
		double heightInches = kb.nextDouble();

		//1Kg = 2.20462 lb
		weight /= 2.20462;
		
		//1 meter = 39.3701 inches
		heightInches += (heightFeet * 12);
		double height = heightInches / 39.3701;
		double bmi = weight / (Math.pow(height, 2));
		
		String interpretation;
		
		if (bmi < 18.5)
		{
			interpretation = "underweight";
		}
		
		else if (bmi >= 18.5 && bmi < 25.0)
		{
			interpretation = "normal";
		}
		
		else if (bmi >= 25.0 && bmi < 30.0)
		{
			interpretation = "overweight";
		}
		
		else
		{
			interpretation = "obese";
		}
		
		System.out.printf("Your BMI of %.2f is considered %s.", bmi, interpretation);
	}

}
