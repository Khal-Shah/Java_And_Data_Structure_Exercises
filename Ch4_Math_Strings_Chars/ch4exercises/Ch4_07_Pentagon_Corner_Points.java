package ch4exercises;
import java.util.Scanner;

public class Ch4_07_Pentagon_Corner_Points

		/* (Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one point at the 0 o’clock position, 
		 * as shown in Figure 4.7c. Write a program that prompts the user to enter the radius of the bounding circle of a 
		 * pentagon and displays the coordinates of the five corner points on the pentagon. 
		 * 
		 * Here is a sample run:
		 * Enter the radius of the bounding circle: 100
			The coordinates of five points on the pentagon are
			(95.1057, 30.9017)
			(0.000132679, 100)
			(-95.1056, 30.9019)
			(-58.7788, -80.9015)
			(58.7782, -80.902)
		 */
				// By Khaled Shah
{
	static Scanner kb = new Scanner (System.in);
	
	static final double CENTERED = (2 * Math.PI / 5);

	public static void main(String[] args)
	
	{
		System.out.print("Enter the radius of the bounding circle: ");
		double radius = kb.nextDouble();
		
		System.out.println("\nThe coordinates of the five points on the pentagon are: ");
		
		for (int i = 1; i <= 5; i++)
		{
			double x = radius *  Math.sin(CENTERED * i);
			double y = radius * Math.cos(CENTERED * i);
			
			System.out.printf("(%.4f, %.4f)\n", x, y);
		}

	}

}
