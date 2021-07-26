package ch5_exercises;

/* Chapter 5 - Exercise 23
 * (Demonstrate cancellation errors) A cancellation error occurs when you are manipulating a very large number with a 
 * very small number. The large number may cancel out the smaller number. For example, the result of 
 * 100000000.0 + 0.000000001 is equal to 100000000.0. To avoid cancellation errors and obtain more accurate results, 
 * carefully select the order of computation. For example, in computing the following series, you will obtain more 
 * accurate results by computing from right to left rather than from left to right:
 * 1 + 1/2 + 1/3 + 1/4 +...+ 1/n
 * 
 * Write a program that compares the results of the summation of the preceding series, computing from left to 
 * right and from right to left with n = 50000.
 */
		//By Khaled Shah

public class Ch5_23_Rounding_Errors
{
	static final int N = 50_000;

	public static void main(String[] args)
	{
		double sum = 0;
		double difference;
		
		for (int i = 1; i <= N; i++)
		{
			sum += 1.0/i;
		}
		
		System.out.println("Computing from left to right, the series 1/n for n = 1 to 50000 converges to: " + sum);
		
		difference = sum;
		sum = 0;
		
		for (int j = N; j > 0; j--)
		{
			sum += 1.0/j;
		}
		
		System.out.println("Computing from right to left, the series 1/n for n = 50000 to n = 1 converges to: " + sum);
		System.out.println("The difference between computing left to right vs right to left is " + Math.abs(difference - sum));
	}

}
