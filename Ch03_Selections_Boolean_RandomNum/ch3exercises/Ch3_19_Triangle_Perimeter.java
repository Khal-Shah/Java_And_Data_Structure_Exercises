package ch3exercises;
import java.util.Scanner;

/* Chapter 3 - Exercise 19:
 * (Compute the perimeter of a triangle) Write a program that reads three edges for a triangle and computes the 
 * perimeter if the input is valid. Otherwise, display that the input is invalid. 
 * The input is valid if the sum of every pair of two edges is greater than the remaining edge.
 */
		//By Khaled Shah

public class Ch3_19_Triangle_Perimeter
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		boolean isValid = false;
		
		System.out.println("Enter the three edges of the triangle below.");
		
		double edge1, edge2, edge3;
		
		do
		{
			System.out.print("Edge 1 = ");
			edge1 = kb.nextDouble();
			System.out.print("Edge 2 = ");
		    edge2 = kb.nextDouble();
			System.out.print("Edge 3 = ");
			edge3 = kb.nextDouble();
			
			if (((edge1 + edge2) > edge3) && ((edge1 + edge3) > edge2) && ((edge2 + edge3) > edge1))
			{
				isValid = true;
			}
			
			else
			{
				System.out.println("The input of the edges are invalid. Try again.");
			}
			
			
		} while (!isValid);
		
		System.out.println("The perimeter of the triangle is " + (edge1 + edge2 + edge3));

	}

}
