package ch5_exercises;
import java.util.*;

/* Chapter 5 - Exercise 16
 * (Find the factors of an integer) Write a program that reads an integer and displays all its smallest factors in 
 * increasing order. For example, if the input integer is 120, the output should be as follows: 2, 2, 2, 3, 5.
 */
		//By Khaled Shah

public class Ch5_16_Displaying_Factors
{

	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Enter the integer of which you'd like to find the smallest factors of: ");
		int userInt = kb.nextInt();
		
		//int factors = 1;
		int i = 2;
		
		for (i = 2; i <= userInt;)		//initial and terminate conditions, increment is optional
		{
			if (userInt % i == 0)
			{
				System.out.print(i + ", ");
				userInt /= i;							//the user number must be reduced by dividing it by the divisor
			}
			
			else
			{
				i++;
			}
		
		}
			
			
		
		}
		
		



}
