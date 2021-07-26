package ch5_notes;
import java.util.*;

/* 
You have used the keyword break in a switch statement. You can also use break in a loop to immediately terminate 
the loop.

You can also use the continue keyword in a loop. When it is encountered, it ends the current iteration and program 
control goes to the end of the loop body. In other words, continue breaks out of an iteration while the break keyword 
breaks out of a loop
 */

public class Ch5_Continue_Break
{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
//		int sum = 0;
//		int num = 0;
//		for (num = 0; num < 20; num++)
//		{
//			sum += num;
//			
//			if (sum >= 100)
//			{
//				break;
//			}
//		}
		//adds integers from 1 to 20 in this order to sum until sum is greater than or equal to 100. W/o break it'd keep adding 
//		System.out.println("The number is " + num + " and the sum is " + sum);
		
//		for (int k = 0; k <= 10; k++)
//		{
//			if (k == 4)
//			{
//				continue;
//			}
//			System.out.println(k); //all numbers 0 to 10 execept 4
			//The continue statement ends the current iteration so that the rest of the statement in the loop body is not 
			//executed
			
			//Suppose you need to write a program to find the smallest factor other than 1 for an integer n (assume n >= 2).	
//		}
		System.out.print("Enter an integer: ");
		int n = kb.nextInt();
		int i = 2;
		int factor = 0;
		
		for (i = 2; i <= n; i++)
		{
			if (n % i == 0)
			{
				factor = i;
				System.out.println("The smallest factor for " + n + " is " + factor);
				break;
			}
			
		}
		
		

	}

}
