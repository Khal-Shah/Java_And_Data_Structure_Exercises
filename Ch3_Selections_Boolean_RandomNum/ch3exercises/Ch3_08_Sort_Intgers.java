package ch3exercises;
import java.util.Scanner;

		/* Chapter 3 - Exercise 8:
		 * (Sort three integers) Write a program that prompts the user to enter three integers and display the integers in 
		 * non-decreasing order.
		 */
				//By Khaled Shah

public class Ch3_08_Sort_Intgers
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter three numbers: ");
		int num1 = kb.nextInt();
		int num2 = kb.nextInt();
		int num3 = kb.nextInt();
		
		if ((num3 >= num2) && (num2 >= num1))
		{
			System.out.println(num1 + ", " + num2 + ", " + num3);
		}
		
		else if ((num2 >= num3) && (num3 >= num1))
		{
			System.out.println(num1 + ", " + num3 + ", " + num2);
		}
		
		else if ((num1 >= num2) && (num2 >= num3))
		{
			System.out.println(num3 + ", " + num2 + ", " + num1);
		}
		
		else if((num3 >= num1) && (num1 >= num2))
		{
			System.out.println(num2 + ", " + num1 + ", " + num3);
		}
		
		else if ((num1 >= num3) && (num3 >= num2))
		{
			System.out.println(num2 + ", " + num3 + ", " + num1);
		}
			
		else 
		{
			System.out.println(num3 + ", " + num1 + ", " + num2);
		}

	}

}
