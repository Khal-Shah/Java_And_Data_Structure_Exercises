package ch5_exercises;
import java.util.Scanner;

/* Chapter 5 - Exercise 38:
 * (Decimal to octal) Write a program that prompts the user to enter a decimal integer and displays its 
 * corresponding octal value. Don’t use Java’s Integer .toOctalString(int) in this program.
 */
		//By Khaled Shah

public class Ch5_38_Dec_toOctal
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		
		System.out.print("Enter a decimal integer: ");
		int userDeci = kb.nextInt();
		
		System.out.println(Integer.toOctalString(userDeci));
		
		String octal = "";
		
		while(userDeci != 0)
		{
			octal = userDeci % 8 + octal; //shifts/reverses the string. += stores from left to right, putting + at end reverses it
			userDeci /= 8;
			
		}
		
		System.out.println("In octal, it is " + octal); 

	}

}
