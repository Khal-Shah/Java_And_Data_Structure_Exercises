package ch4exercises;
import java.util.Scanner;

public class Ch4_04_Hexagon_Area 

		/* Chapter 4 - Exercise 4:
		 * (Geometry: area of a hexagon) The area of a hexagon can be computed using the following formula (s is the 
		 * length of a side): Area = 6s^2 / 4tan(π/6)
		 * 
		 * Write a program that prompts the user to enter the side of a hexagon and displays its area. 
		 * Here is a sample run:
	
		 * Enter the side: 5.5
			The area of the hexagon is 78.59
		 */
				// By Khaled Shah

{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args) 
	
	{
		System.out.print("Enter the side of the hexagon: ");
		double side = kb.nextDouble();
		
		double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
		
		System.out.printf("The area of the hexagon is %.2f", area);
		

	}

}
