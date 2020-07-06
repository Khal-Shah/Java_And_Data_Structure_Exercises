package ch5_exercises;
import java.util.*;

/* Chapter 5 - Exercise 36:
 * (Decimal to binary) Write a program that prompts the user to enter a decimal integer and displays its corresponding 
 * binary value. Don’t use Java’s Integer .toBinaryString(int) in this program.
 */
		//By Khaled Shah

public class Ch5_37_Dec_toBin
{
	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.print("Enter a decimal integer: ");
		int userDeci = kb.nextInt();
		
		//System.out.println(userDeci + " in binary is " + Integer.toBinaryString(userDeci));
		String bin = "";
		 
		  while (userDeci != 0) {
		   bin += userDeci % 2;
		   userDeci /= 2;
		  }

		  //now reverse:
		String binary = "";

		for (int i = bin.length() - 1; i >= 0; i--)
		{
			binary += bin.charAt(i);
		}
		
		System.out.println("Binary equivalent is " + binary);
		

	}

}
