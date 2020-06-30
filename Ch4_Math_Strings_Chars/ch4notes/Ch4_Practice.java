package ch4notes;
import java.util.Scanner;


public class Ch4_Practice
{
	static Scanner kb = new Scanner(System.in);


	public static void main(String[] args)
	{
		System.out.print("Enter a decimal value (0 to 15): ");
		int deciVal = kb.nextInt();
		String hexiVal = Integer.toHexString(deciVal);

		System.out.println(((deciVal < 0 || deciVal > 15)? (+ deciVal + " is an invalid input.") : "The hex value is " + hexiVal.toUpperCase() + "."));

	}

}
