package ch6notes;
import java.util.Scanner;

/* Chapter 6 - Exercise 38:
 * (Generate random characters) Use the methods in RandomCharacter in Listing 6.10 to print 100 
 * uppercase letters and then 100 single digits, printing ten per line.
 */
		//By Khaled shah

public class Ch6_Practice
{

	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args)
	{
	}	
	
	public static char getRandomCharacter(char ch1, char ch2)
	{
		return ((char) (ch1 + Math.random() * (ch2 - ch1 + 1)));
		//65 to 90 for A-Z...So doing A + Math.random() * Z + 1 would be random between 65 and (65 + 90 + 1 = 156)
		//So we have to do A + Math.random() * (Z - A + 1) ==> 65 + Math.random() * (90 - 65 + 1 = 26) ==> 65 to 90
	}
	

	
	
}