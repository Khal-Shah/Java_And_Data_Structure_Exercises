package ch5_exercises;

/* Chapter 5 - Exercise 6:
 * (Conversion from miles to kilometers) Write a program that displays the following two tables side by side:
 * Miles       Kilometers  |  Kilometers		Miles
	1 					1.609					 20				12.430
	2					 3.218					 25				15.538
	...
	9 					14.481				 60				37.290
	10 				16.090				 65				40.398
 */
		//By Khaled Shah

public class Ch5_06_Distance_Conversions
{

	public static void main(String[] args)
	{
		System.out.println("Miles\t\tKilometers\t|\tKilometers\t\tMiles");
		
		//1km = 0.621371 miles
		int km = 20;
		double miles;
		
		for (int i = 1; i <= 10; i++)
		{
			miles = 0.621371 * km;
			System.out.printf("%d\t\t\t%.3f\t\t\t\t%d\t\t\t%.3f\n", i, (i * 1.609), km, miles);
			km += 5;
		}

	}

}
