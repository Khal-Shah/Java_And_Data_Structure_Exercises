package ch3exercises;
import java.util.*;

		/* Chapter 3 - Exercise 1:
		 * (Algebra: solve quadratic equations) The two roots of a quadratic equation ax^2 + bx + c = 0 can be obtained 
		 * using the following formula: r1 = [-b + (b^2 - 4ac]^(1/2) / 2a & r2 = [-b - (b^2-4ac)^1/2] / 2a
		 * 
		 * b^2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the equation has two real roots. 
		 * If it is zero, the equation has one root. If it is negative, the equation has no real roots. Write a program that 
		 * prompts the user to enter values for a, b, and c and displays the result based on the discriminant. 
		 * If the discriminant is positive, display two roots. If the discriminant is 0, display one root. Otherwise, 
		 * display “The equation has no real roots”. Note that you can use Math.pow(x, 0.5) to compute x^(1/2). 
		 * Here are some sample runs.
		 * Enter a, b, c: 1.0 3 1
		The equation has two roots -0.381966 and -2.61803
		
		Enter a, b, c: 1 2.0 1
		The equation has one root -1
		
		Enter a, b, c: 1 2 3
		The equation has no real roots
		 */
				//By Khaled Shah  


public class Ch3_01_Quadratic_Eq
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Enter the constants a, b and c for the equation ax^2 + bx + c = 0:");
		System.out.print("a = ");
		double a = kb.nextDouble();
		System.out.print("b = ");
		double b = kb.nextDouble();
		System.out.print("c = ");
		double c = kb.nextDouble();
		
		double discriminant = Math.pow((b * b - (4 * a * c)), 0.5);
		double x1 = (-b + discriminant) / (2 * a);
		double x2 = (-b - discriminant) / (2 * a);
		
		if (discriminant > 0)
		{
			System.out.println("The equation has two real roots. They are " + x1 + " and " + x2);
		}
		
		else if (discriminant == 0)
		{
			System.out.println("The equations has one real root. Which is " + x1);
		}
		
		else
		{
			System.out.println("The equation has no real root. " + x1 + " and " + x2 + " (Not a Number)");
		}
		
	}

}
