package ch4exercises;
import java.util.Scanner;

public class Ch4_25_Generate_Vehicle_Plates

		/* Chapter 4 - Exercise 25
		 * (Generate vehicle plate numbers) Assume a vehicle plate number consists of three uppercase letters followed 
		 * by four digits. Write a program to generate a plate number.
		 */
				// By Khaled Shah . 
{
	static Scanner kb = new Scanner(System.in);
	
	static final char pn1 = (char) (65 + Math.random() * (26));
	static final char pn2 = (char) (65 + Math.random() * (26));
	static final char pn3 = (char) (65 + Math.random() * (26));
	
	static final int pn3_7 = (int) (1000 + (Math.random() * 9000));

	public static void main(String[] args)
	{
		String plateNumber = "" + pn1+pn2+pn3+ " " + pn3_7;
		
		System.out.println("The plate number is " + plateNumber);
	
	}

}
