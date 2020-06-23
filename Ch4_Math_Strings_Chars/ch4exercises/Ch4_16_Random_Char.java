package ch4exercises;
import java.util.Scanner;

public class Ch4_16_Random_Char

		/* Chapter 4 - Exercise 16:
		 * (Random character) Write a program that displays a random uppercase letter using the Math.random() method.
		 */
				// By Khaled Shah

{
	static Scanner kb = new Scanner (System.in);
	
	static final int letterNum =  (int)  (97 + (Math.random() * 26));		//returns a number between 97 and 122
	static char letter = (char) letterNum;

	public static void main(String[] args)
	
	// 97-122 is a-z				65-90 is A-Z
	// a + Math.random() * b					returns a number between a and a + b (excluding a+b)
	
	{
//		System.out.println(letterNum + "\n" + letter);
		
		if(Character.isAlphabetic(letter))
		{
			letter = Character.toUpperCase(letter);
			System.out.println(letter);
		}
		
		else
		{
			System.out.println("Non alphabetic character was generated.");
		}
	}

}
