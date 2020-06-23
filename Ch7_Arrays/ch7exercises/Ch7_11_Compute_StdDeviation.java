package ch7exercises;
import java.util.Scanner;

/* Chapter 7 - Exercise 11:
 * (Statistics: compute deviation) Programming Exercise 5.45 computes the standard deviation of numbers. 
 * This exercise uses a different but equivalent formula to compute the standard deviation of n numbers.
 
  mean = x1 + x2 + x3 + ... + Xn / n
  deviation = Sigma (i = 1 to n) (Xi - mean)^2 / n -1 all square rooted
 
 * To compute the standard deviation with this formula, you have to store the individual numbers using an array, 
 * so that they can be used after the mean is obtained.
Your program should contain the following methods:
        Compute the deviation of double values 
public static double deviation(double[] x)
 Compute the mean of an array of double values 
public static double mean(double[] x)
Write a test program that prompts the user to enter ten numbers and displays the mean and standard deviation, 
as shown in the following sample run:
Enter ten numbers: 1.9 2.5 3.7 2 1 6 3 4 5 2
The mean is 3.11
The standard deviation is 1.55738
 */

		//By Khaled Shah

public class Ch7_11_Compute_StdDeviation
{

	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args)
	{

		double [] values = getNums();
		
		System.out.printf("The mean is %.2f \nThe standard deviation is %.5f", mean(values), deviation(values));
	}
	
	public static double deviation(double [] x)
	{
		double deviation = 0;
		double mean = mean(x);
		
		for (double e: x)
		{
			deviation += (Math.pow((e - mean), 2));
		}
		return (Math.sqrt(deviation / (x.length - 1)));
	}

	public static double mean(double [] x)
	{
		double mean = 0;
		
		for (double e: x)
		{
			mean += e; 
		}
		
		return (mean / x.length);
	}
	
	public static double [] getNums()
	{
		System.out.print("Enter 10 numbers: ");
		double [] nums = new double [10];
		int i = 0;
		
		for (double e: nums)
		{
			System.out.print("Enter value " + (i + 1) + ": ");
			nums[i] = kb.nextDouble();
			i++;
		}
		return nums;
	}

}
