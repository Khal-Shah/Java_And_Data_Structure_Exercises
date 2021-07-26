package ch9exercises.Ch9_11_Linear_Equation;
import java.util.Scanner;

/* Chapter 9 - Exercise 11:
 * (Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a 2 X 2 system of linear equations:
 * ax+by = e 							x= ed-bf / ad - bc  
 * cx + dy = f 						y = af - ec / ad - bc
 * The class contains:
■ Private data fields a, b, c, d, e, and f.
■ A constructor with the arguments for a, b, c, d, e, and f.
■ Six getter methods for a, b, c, d, e, and f.
■ A method named isSolvable() that returns true if ad - bc is not 0.
■ Methods getX() and getY() that return the solution for the equation.
Draw the UML diagram for the class and then implement the class. Write a test program that prompts the user to 
enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report that “The equation has no solution.” 
See Programming Exercise 3.3 for sample runs.
*
* Chapter 1 - Exercise 13:
	 * (Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the following 2 * 2 system of
	 * linear equation:		ax + by=e		 					x= ed - bf /ad - bc
	 * 							     		cx + dy = f							y= af-ec /  ad - bc
	 * Write a program that solves the following equation and displays the value for x and y :
	 * 3.4x + 50.2y = 44.5
		2.1x + .55y = 5.9
 */
		//By Khaled Shah

public class Ch9_11_Linear_Equation_Driver
{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
		
		double a, b, c, d, e, f;
		
		System.out.println("Enter a, b, c, d, e, f below:");
		a = kb.nextDouble();
		b = kb.nextDouble();
		c = kb.nextDouble();
		d = kb.nextDouble();
		e = kb.nextDouble();
		f = kb.nextDouble();
		
		getEquation(a, b, c, d, e, f);
		
		LinearEquation equation1 = new LinearEquation(a, b, c, d, e, f);
		System.out.println((!equation1.isSolvable())? "The equation has no solution" : "x = " + equation1.getX() + "\ny = "
				+ equation1.getY());
		
	}
	
	public static void getEquation (double a, double b, double c, double d, double e, double f)
	{
		System.out.println("Your equations are: \n" + a + "x + " + b + "y = " + e +"\n" + c + "x + " + d + "y = " + f );
	}

}
