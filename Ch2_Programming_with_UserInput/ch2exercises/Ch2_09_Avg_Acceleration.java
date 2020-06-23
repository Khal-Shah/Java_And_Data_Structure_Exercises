package ch2exercises;
import java.util.Scanner;

	/* Chapter 2 - Exercise 9:
 	(Physics: acceleration) Average acceleration is defined as the change of velocity
	divided by the time taken to make the change, as shown in the following formula: a = v1 - v0 / t
	Write a program that prompts the user to enter the starting velocity v0 in meters/ second, the ending velocity v1 
	in meters/second, and the time span t in seconds, and displays the average acceleration. Here is a sample run:
	Enter v0, v1, and t: 5.5 50.9 4.5
	The average acceleration is 10.0889
	 */
			//By Khaled Shah

public class Ch2_09_Avg_Acceleration
{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Enter below the starting velocity (v0), the ending velocity (v1) and the time taken (t). ");
		System.out.print("v0 = "); 
		double v0 = input.nextDouble();
		System.out.print("v1 = ");
		double v1 = input.nextDouble();
		System.out.print("t = ");
		double time = input.nextDouble();
		
		double avgAcceleration = (v1 - v0) / time;
		
		System.out.println("The average acceleration is " + avgAcceleration);

	}

}
