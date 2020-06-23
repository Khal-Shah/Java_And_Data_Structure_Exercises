package ch5_exercises;
import java.util.Scanner;

/* Chapter 5 - Exercise 47:
 * (Business: check ISBN-13) ISBN-13 is a new standard for identifying books. It uses 13 digits 
 * d1 d2 d3 d4 d5 d6 d7 d8 d9 d10 d11 d12 d13. The last digit d13 is a checksum, which is calculated from the other 
 * digits using the following formula:
10 - (d1 +3d2 +d3 +3d4 +d5 +3d6 +d7 +3d8 +d9 +3d10 +d11 +3d12) % 10
 * If the checksum is 10, replace it with 0. Your program should read the input as a
string.

 Here are sample runs:
Enter the first 12 digits of an ISBN-13 as a string: 978013213080
The ISBN-13 number is 9780132130806

Enter the first 12 digits of an ISBN-13 as a string: 978013213079
The ISBN-13 number is 9780132130790

Enter the first 12 digits of an ISBN-13 as a string: 97801320
97801320 is an invalid input
 */
		//By Khaled Shah

public class Ch5_47_Checksum
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
		String isbn12 = kb.next();
		int d13 = 0;
		
		if (!(isbn12.length() == 12))
		{
			System.out.println(isbn12 + " is an invalid input");
			System.exit(0);
		}
		//d13 = 10 - (d1 +3d2 +d3 +3d4 +d5 +3d6 +d7 +3d8 +d9 +3d10 +d11 +3d12) % 10
		
		for (int i = 0; i < isbn12.length(); i++)
		{
			//isbn12 is a String (can't just sum it (int) by extracting individual chars, have to use parseInt to convert the str to int
			d13 += ((i % 2 == 0)? (Integer.parseInt(isbn12.substring(i, i + 1))): 3 * (Integer.parseInt(isbn12.substring(i, i + 1))));
		}
		
		d13 = 10 - d13 % 10; 
		
		
		System.out.println("The ISBN-13 number is " + isbn12 +((d13 == 10)? 0 : d13));
		
	}

}
