package ch3exercises;
import java.util.Scanner;

		/* Chapter 3 - Exercise 9:
		 * (Business: check ISBN-10) An ISBN-10 (International Standard Book Number) consists of 10 digits: 
		 * d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum, which is calculated from the other nine digits 
		 * using the following formula: (d1 *1+d2 *2+d3 *3+d4 *4+d5 *5+ d6 *6+d7 *7+d8 *8+d9 *9)%11
		 * If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention. Write a program 
		 * that prompts the user to enter the first 9 digits and displays the 10-digit ISBN (including leading zeros). 
		 * Your program should read the input as an integer. Here are sample runs:
		 * Enter the first 9 digits of an ISBN as integer: 013601267
			The ISBN-10 number is 0136012671
			
			Enter the first 9 digits of an ISBN as integer: 013031997
			The ISBN-10 number is 013031997X
		 */
				//By Khaled Shah.

public class Ch3_09_Check_ISBN
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int d1 = kb.nextInt();
		int d2 = kb.nextInt();
		int d3 = kb.nextInt();
		int d4 = kb.nextInt();
		int d5 = kb.nextInt();
		int d6 = kb.nextInt();
		int d7 = kb.nextInt();
		int d8 = kb.nextInt();
		int d9 = kb.nextInt();
		int d10 = (d1 * 1+d2 * 2+d3 *3+d4 *4+d5 *5+ d6 *6+d7 *7+d8 *8+d9 *9) % 11;
		
		if (d10 == 10)
		{
			System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
		}
		
		else
		{
			System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
		}
	}

}
