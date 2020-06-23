package ch3exercises;
import java.util.Scanner;

/* Chapter 3 - Exercise 26 (Use the &&, || and ^ operators) 
 * Write a program that prompts the user to enter an integer and determines whether it is divisible by 5 and 6, 
 * whether it is divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both. 
 * Here is a sample run of this program:
 * Enter an integer: 10
Is 10 divisible by 5 and 6? false
Is 10 divisible by 5 or 6? true
Is 10 divisible by 5 or 6, but not both? true
 */
		//By Khaled Shah

public class Ch3_26_Divisibility
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter an integer: ");
		int userNum = kb.nextInt();
		
		boolean byFive = (userNum % 5 == 0);
		boolean bySix = (userNum % 6 == 0);
		
		System.out.println("Is " + userNum + " divisible by 5 and 6? " + (byFive && bySix));
		System.out.println("Is " + userNum + " divisible by 5 or 6? " + (byFive || bySix));
		System.out.println("Is " + userNum + " divisible by 5 or 6, but not both? " + (byFive ^ bySix));

	}

}
