package ch18exercises;

/** Chapter 18 - Exercise 5:
 * (Sum series) Write a recursive method to compute the following series:
 * m(i) = 1/3 + 2/5 + 3/7 + 4/9 + 5/11+...+ i / (2i + 1)
 * Write a test program that displays m(i) for i = 1, 2, . . ., 10.
 *
 * @author khaled Shah
 */

public class Ch18_05_Recursive_Series
{

	public static void main(String[] args)
	{
		for (int i = 1; i <= 10; i++)
		{
			System.out.printf("%.2f ", computeSeries(i));
		}
		

	}
	
	public static double computeSeries(int i)
	{
		if (i == 1)
		{
			return (1.0/3.0);
		}
		else
		{
			return ((i / ((2.0 * i) + 1.0)) + computeSeries(i - 1));
		}
	}

}
