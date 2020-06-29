package ch3exercises;
import java.util.*;


//* Chapter 3 - Exercise 26 (Use the &&, || and ^ operators)
//		* Write a program that prompts the user to enter an integer and determines whether it is divisible by 5 and 6,
//		* whether it is divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both.
//		* Here is a sample run of this program:
//		* Enter an integer: 10
//		Is 10 divisible by 5 and 6? false
//		Is 10 divisible by 5 or 6? true
//		Is 10 divisible by 5 or 6, but not both? true
//		*/
////By Khaled Shah


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
