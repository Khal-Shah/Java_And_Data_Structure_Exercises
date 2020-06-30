package ch3exercises;
import java.util.*;


<<<<<<< HEAD

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
=======
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
>>>>>>> 15dbb107121e900211e01b38d78c411b59cc6136


public class Ch3_Practice
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
<<<<<<< HEAD
		System.out.print("Enter weight and price for package 1 below.\nWeight: ");
		double p1weight = kb.nextDouble();
		System.out.print("Price: ");
		double p1price = kb.nextDouble();

		System.out.print("Enter weight and price for package 2 below.\nWeight: ");
		double p2weight = kb.nextDouble();
		System.out.print("Price: ");
		double p2price = kb.nextDouble();

		double p1rate = p1weight / p1price;
		double p2rate =  p2weight / p2price;

		//System.out.println(p1rate + ", " + p2rate);

		if (p1rate == p2rate)
		{
			System.out.print("Two packages have the same price.");
		}

		else
		{
			System.out.print("Package " + ((p1rate > p2rate)? "1" : "2") + " has a better price.");
		}
=======
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
>>>>>>> 15dbb107121e900211e01b38d78c411b59cc6136
	}


}
