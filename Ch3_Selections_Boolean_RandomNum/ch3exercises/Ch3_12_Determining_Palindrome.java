package ch3exercises;
import java.util.Scanner;
	
		/* Chapter 3 - Exercise 12:
		 * (Palindrome number) Write a program that prompts the user to enter a three-digit integer and determines 
		 * whether it is a palindrome number. A number is palindrome if it reads the same from right to left and from left to 
		 * right. Here is a sample run of this program:
		 * Enter a three-digit integer: 121
			121 is a palindrome
			Enter a three-digit integer: 123
			123 is not a palindrome
		 */
				//By Khaled Shah


public class Ch3_12_Determining_Palindrome
{

	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.print("Enter a three digit intger number: ");
		String userNum = kb.nextLine();
		
		int firstDigit = Integer.parseInt(userNum.substring(0,1));
		int lastDigit = Integer.parseInt(userNum.substring(2));
		
		boolean isPalindrome = (firstDigit == lastDigit);
		
		if (isPalindrome)
		{
			System.out.println(userNum + " is a palindrome.");
		}
		
		else
		{
			System.out.println(userNum + " is not a palindrome.");
		}

//		System.out.println(firstDigit + " and " + lastDigit);
	}

}

/*Later re-done:
 * public static void main(String[] args)
	{
		int userNumber = getNum();
		
		System.out.println(userNumber + ((isPalindrome(userNumber))? " is" : " is not") + " a palindrome.");
		
	}
	
	public static int getNum()
	{
		System.out.println("Enter a three-digit integer: ");
		int num = kb.nextInt();
		
		return num;
	}
	
	public static boolean isPalindrome(int userNum)
	{
		boolean isPalindrome;
		String num2str = "" + userNum;
		int firstDig = Integer.parseInt(num2str.substring(0, 1));
		int lastDig = Integer.parseInt(num2str.substring(2, 3));
		
		isPalindrome = (firstDig == lastDig);
		
		return isPalindrome;
	}
 */