package ch6exercises;

/* Chapter 6 - Exercise 9:
 * (Conversions between feet and meters) Write a class that contains the following two methods:
      /** Convert from feet to meters 
public static double footToMeter(double foot) 

/** Convert from meters to feet 
public static double meterToFoot(double meter)

The formula for the conversion is:
      meter = 0.305 * foot
      foot = 3.279 * meter
      
Write a test program that invokes these methods to display the following tables:
		Feet 							Meters 					|					 Meters						Feet
		1.0 								.305							| 						20.0 						65.574
		
		10.0								3.050						|						65.0							213.115

 */
		//By Khaled Shah

public class Ch6_09_FeetToM_MToFeet
{

	public static void main(String[] args)
	{
		System.out.println("Feet\t\t\tMeters\t\t\t |\t\t\t\tMeters\t\t\t\tFeet");
		double feet = 1.0, meters = 20.0;
		
		do
		{
			System.out.printf("%6.1f %32.3f \t\t\t | %32.1f %38.3f \n", feet, footToMeter(feet), meters, 
					meterToFoot(meters));
			feet++;
			meters += 5;
		} while (feet <= 10 && meters <= 65);
	}
	
	public static double footToMeter(double foot)
	{
		return 0.305 * foot;
	}
	
	public static double meterToFoot(double meter)
	{
		return 3.279 * meter;
	}

}
