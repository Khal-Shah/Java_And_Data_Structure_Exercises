package ch3exercises;
import java.util.Scanner;				//cmd + shift + o

/* Chapter 3 - Exercise 16
 * (Random point) Write a program that displays a random coordinate in a rectangle. The rectangle is centered at (0, 0) 
 * with width 100 and height 200.
 */
		//By Khaled Shah

public class Ch3_16_Rectangle_Coordinate
{
	static Scanner kb = new Scanner(System.in);
	
	static final int X_POINT = (int) (-49 + Math.random() * 99);
	static final int Y_POINT = (int) (-99 + Math.random() * 199);

	public static void main(String[] args)
	{
		System.out.println("One random coordinate (X, Y) of a rectangle centered at (0, 0) could be (" + X_POINT + ", " 
										+Y_POINT + ").");
	}

}
