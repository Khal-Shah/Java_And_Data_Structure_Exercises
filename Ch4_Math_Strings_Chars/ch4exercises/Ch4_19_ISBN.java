package ch4exercises;
import java.util.Scanner;

public class Ch4_19_ISBN

		/* Chapter 4 - Exercise 19:
		 * (Business: check ISBN-10) Rewrite the Programming Exercise 3.9 by entering the ISBN number as a string.
		 * 
		 * 3.9: (Business: check ISBN-10) An ISBN-10 (International Standard Book Number) consists of 10 digits: 
		 * d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum, which is calculated from the other nine digits 
		 * using the following formula:
		 * 
		 * (d1 *1+d2 *2+d3 *3+d4 *4+d5 *5+ d6 *6+d7 *7+d8 *8+d9 *9) % 11
		 * If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention. 
		 * 
		 * Write a program that prompts the user to enter the first 9 digits and displays the 10-digit ISBN (including 
		 * leading zeros). Your program should read the input as an integer. 
		 * 
		 * Here are sample runs:
		 * Enter the first 9 digits of an ISBN as integer: 013601267
			The ISBN-10 number is 0136012671
			
			Enter the first 9 digits of an ISBN as integer: 013031997
			The ISBN-10 number is 013031997X
		 */
				// By Khaled Shah

{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter the first 9 digits of an ISBN: ");
		String user9Dig = kb.next();
		
		while (user9Dig.length() != 9)
		{
			System.out.print("Invalid entry. Try again: ");
			user9Dig = kb.next();
		}
		
		// d10 = (d1 *1+d2 *2+d3 *3+d4 *4+d5 *5+ d6 *6+d7 *7+d8 *8+d9 *9) % 11
		
		int d1 = Integer.parseInt(user9Dig.substring(0,1));
		int d2 = Integer.parseInt(user9Dig.substring(1, 2));
		int d3 = Integer.parseInt(user9Dig.substring(2, 3));
		int d4 = Integer.parseInt(user9Dig.substring(3, 4));
		int d5 = Integer.parseInt(user9Dig.substring(4, 5));
		int d6 = Integer.parseInt(user9Dig.substring(5, 6));
		int d7 = Integer.parseInt(user9Dig.substring(6, 7));
		int d8 = Integer.parseInt(user9Dig.substring(7, 8));
		int d9 = Integer.parseInt(user9Dig.substring(8));
		int d10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		
		String lastDig = "" + d10;
		
		lastDig = (d10 == 10)? "X" : lastDig;
		
		System.out.println("The ISBN-10 number is " + user9Dig + lastDig);
		
	}

}