package ch3exercises;
import java.util.*;


/* Chapter 3 - Exercise 33:
 * (Financial: compare costs) Suppose you shop for rice in two different packages. You would like to write a program
 * to compare the cost. The program prompts the user to enter the weight and price of the each package and displays
 * the one with the better price.
 * Here is a sample run:
 *
 * Enter weight and price for package 1: 50 24.59
Enter weight and price for package 2: 25 11.99
Package 2 has a better price.

Enter weight and price for package 1: 50 25
Enter weight and price for package 2: 25 12.5
Two packages have the same price.
 */
//By Khaled Shah


public class Ch3_Practice
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter an integer: ");
		int userNum = kb.nextInt();
//		System.out.print("Is " + userNum + " divisible by " + checkDivisibleAnd(userNum) + "\nIs divisible by " + checkDivisibleOr(userNum) +
//						"\nIs divisible by " + checkDivisibleXOr(userNum));
		//boolean isDivisibleAnd = checkDivisibleAnd(userNum)
		System.out.print("Is " + userNum + " divisible by ");
		System.out.println(checkDivisibleAnd(userNum));
		System.out.print("Is " + userNum + " divisible by ");
		System.out.println(checkDivisibleOr(userNum));
		System.out.print("Is " + userNum + " divisible by ");
		System.out.println(checkDivisibleXOr(userNum));
	}

	public static boolean checkDivisibleAnd(int userNum)
	{
		System.out.print("5 and 6? ");
		return ((userNum % 5 == 0) && (userNum % 6 == 0));
	}

	public static boolean checkDivisibleOr(int userNum)
	{
		System.out.print("5 or 6? ");
		return ((userNum % 5 == 0) || (userNum % 6 == 0));
	}

	public static boolean checkDivisibleXOr(int userNum)
	{
		System.out.print("5 or 6, but not both? ");
		return ((userNum % 5 == 0) ^ (userNum % 6 == 0));
	}


}
