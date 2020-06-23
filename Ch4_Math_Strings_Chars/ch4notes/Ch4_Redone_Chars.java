package ch4notes;
import java.util.*;

		/** (Generate vehicle plate numbers) Assume a vehicle plate number consists of three uppercase letters 
		 * followed by four digits. Write a program to generate a plate number.
			*/

public class Ch4_Redone_Chars
{
	static Scanner kb = new Scanner(System.in);
	static final char pn1 = (char) (65 + Math.random() * 26);
	static final char pn2 = (char) (65 + Math.random() * 26);
	static final char pn3 = (char) (65 + Math.random() * 26);
	static final int pn4_7 = (int) (1000 + Math.random() * 9000);
	

	public static void main(String[] args)
	{
		System.out.println("The plate number is: " + (pn1) + (pn2) + (pn3) + (pn4_7));
		
	}

}
