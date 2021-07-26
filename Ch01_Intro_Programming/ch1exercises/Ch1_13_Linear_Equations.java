package ch1exercises;

	/* Chapter 1 - Exercise 13:
	 * (Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the following 2 * 2 system of 
	 * linear equation:		ax + by=e		 					x= ed - bf /ad - bc 
	 * 							     		cx + dy = f							y= af-ec /  ad - bc
	 * Write a program that solves the following equation and displays the value for x and y : 
	 * 3.4x + 50.2y = 44.5
		2.1x + .55y = 5.9
	 */
			//By Khaled Shah

public class Ch1_13_Linear_Equations
{
	public static final double a = 3.4;
	public static final double b = 50.2;
	public static final double e = 44.5;
	public static final double c = 2.1;
	public static final double d = 0.55;
	public static final double f = 5.9;

	public static void main(String[] args)
	{
		double x = ((e * d - b * f) / (a * d - b * c));
		double y = ((a * f - e * c) / (a * d - b * c));

		System.out.println("The value of x is " + x + "\nThe value of y is " + y);
	}

}
