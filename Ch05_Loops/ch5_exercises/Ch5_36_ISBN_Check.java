package ch5_exercises;
import java.util.Scanner;

/* Chapter 5 - Exercise 36:
 * (Business application: checking ISBN) Use loops to simplify Programming
Exercise 3.9.
 *  Chapter 3 - Exercise 9:
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
		//By Khaled Shah

public class Ch5_36_ISBN_Check
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter the 9-digit ISBN: ");
		String userISBN = kb.next();
		
		while(userISBN.length() != 9)
		{
			System.out.print("Make sure you enter 9 digits: ");
			userISBN = kb.next();
		}
		
		int d10 = 0;
		
		for (int i = 1; i <= userISBN.length(); i++)
		{
			d10 += (i * Integer.parseInt(userISBN.substring(i-1, i)));			//charAt wouldn't work, can't do arithmatic with chars
			//System.out.println(d10);											//But could do "" + charAt to convert char to str
		}
		
		int checkSum = d10 % 11;
		
		System.out.println( ((checkSum == 10)? "The ISBN is " + userISBN + "X" : "The ISBN is " + userISBN  + "" + checkSum));

	}

}
