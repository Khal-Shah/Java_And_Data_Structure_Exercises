package ch5_exercises;
import java.util.Scanner;

/* Chapter 5 - Exercise 45
 * (Statistics: compute mean and standard deviation) In business applications, you are often asked to compute the mean 
 * and standard deviation of data. The mean is simply the average of the numbers. 
 * The standard deviation is a statistic that tells you how tightly all the various data are clustered around the mean in a set 
 * of data. For example, what is the average age of the students in a class? How close are the ages? 
 * If all the students are the same age, the deviation is 0.
 * Write a program that prompts the user to enter ten numbers, and displays the mean and standard deviations of these 
 * numbers using the following formula: mean = sum of all numbers / total numbers
 * deviation = (square of all numbers summed minus (sum of all numbers squared over n) over n minus 1))^.05
 * Sample runs:
 * Enter ten numbers: 1 2 3 4.5 5.6 6 7 8 9 10
The mean is 5.61
The standard deviation is 2.99794
 */
		//By Khaled Shah

public class Ch5_45_Mean_StdDev
{
	static Scanner kb = new Scanner(System.in);
	static final int N = 10;

	public static void main(String[] args)
	{
		System.out.print("Enter " + N + " numbers: ");
		int count = 0;
		double userNum;
		double sum = 0;
		double squaredSum = 0;
		
		do
		{
			userNum = kb.nextDouble();
			count++;
			sum += userNum;
			squaredSum += Math.pow(userNum, 2);
		} while (count < N);
		
		double mean = sum / N;
		double deviation = Math.pow((squaredSum - (Math.pow(sum, 2) / N))	/ (N - 1) , 0.5);
		
		System.out.printf("The mean is %.2f\nThe standard deviation is %.5f", mean, deviation);

	}

}
