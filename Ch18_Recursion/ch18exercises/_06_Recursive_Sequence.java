package ch18exercises;

/* Chapter 18 - Exercise 6:
 * (Sum series) Write a recursive method to compute the following series:
 * m (i) = 1/2 + 2/3 + 3/4 +...+ i/i+1
 * Write a test program that displays m(i) for i = 1, 2, . . ., 10
 */

public class _06_Recursive_Sequence
{

	public static void main(String[] args)
	{
		for (int i = 1; i <= 10; i++)
		{
			System.out.printf("%.2f ", computeSequence(i));
		}

	}
	
	public static double computeSequence(int i)
	{
		if (i == 1)
		{
			return (i / 2.0);
		}
		
		else
		{
			return (i / (i + 1.0) + computeSequence(i - 1));
		}
	}

}
