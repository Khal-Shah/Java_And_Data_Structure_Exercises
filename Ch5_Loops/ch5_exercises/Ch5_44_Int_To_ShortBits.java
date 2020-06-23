package ch5_exercises;
import java.util.Scanner;

/* Chapter 5 - Exercise 44
 * (Computer architecture: bit-level operations) A short value is stored in 16 bits. Write a program that prompts the 
 * user to enter a short integer and displays the 16 bits for the integer. Here are sample runs:
 * Enter an integer: 5
The bits are 0000000000000101
Enter an integer: -5
The bits are 1111111111111011
 */
		//By Khaled Shah

public class Ch5_44_Int_To_ShortBits
{

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter an integer: ");
		int userNum = kb.nextInt();
		String bin = "";

		for (int i = 0; i < 16; i++)
		{
			bin += userNum % 2;
			userNum /= 2;
		}
		
		for (int j = 15; j >= 0; j--)
		{
			System.out.print(bin.charAt(j));
		}
		
		//use bitwise shift >> and mask for negative (signed) binary
		//https://en.wikipedia.org/wiki/Bitwise_operation
		
	}

}
