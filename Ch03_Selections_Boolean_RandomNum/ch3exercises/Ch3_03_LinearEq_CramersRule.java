package ch3exercises;
import java.util.*;

/* Chapter 3 - Exercise 3
 * (Algebra: solve 2 * 2 linear equations) A linear equation can be solved using Cramer’s rule given in Programming 
 * Exercise 1.13. Write a program that prompts the user to enter a, b, c, d, e, and f and displays the result. 
 * If ad - bc is 0, report that “The equation has no solution.”
 * 
 * ax + by=e		 					x= ed - bf /ad - bc 
	cx + dy = f							y= af-ec /  ad - bc
	
	Enter a, b, c, d, e, f: 9.0 4.0 3.0 -5.0 -6.0 -21.0
	x is -2.0 and y is 3.0
	
	Enter a, b, c, d, e, f: 1.0 2.0 2.0 4.0 4.0 5.0	
	The equation has no solution
 */
		//By Khaled Shah

public class Ch3_03_LinearEq_CramersRule
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Enter the values for a, b, c, d, e and f respectively below.");
		System.out.print("a = ");
		double a = kb.nextDouble();
		System.out.print("b = ");
		double b = kb.nextDouble();
		System.out.print("c = ");
		double c = kb.nextDouble();
		System.out.print("d = ");
		double d = kb.nextDouble();
		System.out.print("e = ");
		double e = kb.nextDouble();
		System.out.print("f = ");
		double f = kb.nextDouble();
		
		boolean invalid = (a* d - b* c == 0);
		
		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);
		
		System.out.println((invalid)? "The system has no solution" : "x is " + x + "\ny is " + y);
	}

}
