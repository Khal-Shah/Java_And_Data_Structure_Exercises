package ch7exercises;
import java.util.Scanner;

/* Chapter 7 - Exercise 25:
 * (Algebra: solve quadratic equations) Write a method for solving a quadratic equation using the following header:
public static int solveQuadratic(double[] eqn, double[] roots)
The coefficients of a quadratic equation ax2 + bx + c = 0 are passed to the array eqn and the real roots are stored in roots. 
The method returns the number of real roots. See Programming Exercise 3.1 on how to solve a quadratic equation.
Write a program that prompts the user to enter values for a, b, and c and displays the number of real roots and all real roots.
 */
		//By Khaled Shah

public class ch7_25_Quadratic_Eq
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{

		double [] eqn = getCoefficients();
		double [] roots = getRoots(eqn);
		System.out.println("There are " + solveQuadratic(eqn, roots) + " real roots.");
		
		displayRoots(roots);
	}
	
	public static int solveQuadratic (double [] eqn, double [] roots)
	{
		int totalRoots = 0;
		int i;
		
		for (i = 0; i < roots.length; i++)
		{
			if (!Double.isNaN(roots [i]))
			{
				totalRoots++;
			}
		}
		
		i = 0;
		
		if (roots [i] == roots [i + 1])
		{
			totalRoots--;
		}
		
		return totalRoots;
	}
	
	public static double [] getCoefficients()
	{
		System.out.println("Quadratic equaton is in the form: \"ax^2 + bx + c = 0\".");
		double [] eq = new double [3];
		
		System.out.print("Enter a: ");
		eq [0] = kb.nextDouble();
		System.out.print("Enter b: ");
		eq [1] = kb.nextDouble();
		System.out.print("Enter c: ");
		eq [2] = kb.nextDouble();
		
		return eq;
	}
	
	public static double [] getRoots (double [] eq)
	{
		double [] realRoots = new double [2];
		double a = eq [0];
		double b = eq [1];
		double c = eq [2];
		
		double discriminant = Math.pow((b * b - (4 * a * c)), 0.5);
		realRoots [0] = (-b + discriminant) / (2 * a);
		realRoots [1] = (-b - discriminant) / (2 * a);
		
		return realRoots;
	}

	public static void displayRoots (double [] roots)
	{
		int i = 0;
		
		if (Double.isNaN(roots [i]))
		{
			System.exit(0);
		}
		System.out.println("The roots are: " + ((roots [i] == roots [i + 1])? roots[i] : roots[i] + " " + roots [i + 1]));
	}
}
