package ch5_exercises;

/* Chapter 5 - Exercise 3:
 * (Conversion from kilograms to pounds) Write a program that displays the following table 
 * (note that 1 kilogram is 2.2 pounds):
	Kilograms						Pounds
		1										2.2
		3										6.6
		...
	   197 								  433.4
   	   199								  437.8
 */
		//By Khaled Shah

public class Ch5_03_kg_to_lbs
{

	public static void main(String[] args)
	{
		System.out.println("Kilograms\t\tPounds");
		for (int i = 1; i < 200; i += 2)
		{
			System.out.printf("\t%d\t\t\t%.1f\n", i, (i * 2.2));
		}

	}

}
