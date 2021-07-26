package ch5_exercises;

/* Chapter 5 - Exercise 4:
 * (Conversion from miles to kilometers) Write a program that displays the following table 
 * (note that 1 mile is 1.609 kilometers):
     Miles       Kilometers
		1 				1.609
		2				 3.218
		...
		9 				14.481
		10 			16.090
 */
		//By Khaled Shah

public class Ch5_04_Miles_to_Km
{

	public static void main(String[] args)
	{
		System.out.println("    Miles\t\t  Kilometers");
		int miles;
		double km;
		
		for (miles = 1; miles <= 10; miles++)
		{
			km = 1.609 * miles;
			System.out.printf("\t%d\t\t\t%.3f\n", miles, km);
		}

	}

}
