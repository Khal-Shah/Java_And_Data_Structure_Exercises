package ch18exercises;

/** Chapter 18 - Exercise 4:
 * (Sum series) Write a recursive method to compute the following series:
 * m(i) = 1 + 1/2 + 1/3 +...+ 1/i
 * Write a test program that displays m(i) for i = 1, 2, . . ., 10
 *
 * @author Khaled Shah
 */

public class Ch18_04_Sum_Series
{

	public static void main(String[] args)
	{
		for (int i = 1; i <= 10; i++)
		{
			System.out.printf("%.2f ", computeSeries(i));
		}

	}
	
	public static double computeSeries(double i)
	{
		
		if (i == 1)
		{
			return (1);
		}
		
		else
		{
			return (1.0/i + computeSeries(i - 1));
		}
		
	}

}
