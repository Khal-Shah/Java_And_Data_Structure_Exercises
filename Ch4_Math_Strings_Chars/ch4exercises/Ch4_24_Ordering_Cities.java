package ch4exercises;
import java.util.Scanner;

public class Ch4_24_Ordering_Cities

		/* Chapter 4 - Exercise 24:
		 * (Order three cities) Write a program that prompts the user to enter three cities and displays them in ascending 
		 * order. 
		 * 
		 * Here is a sample run:
		 * Enter the first city: Chicago
			Enter the second city: Los Angeles
			Enter the third city: Atlanta
			The three cities in alphabetical order are Atlanta Chicago Los Angeles
		 */
				// By Khaled Shah
{
	static Scanner kb = new Scanner (System.in);
	

	public static void main(String[] args)
	{
		System.out.print("Enter the first city: ");
		String city1 = kb.nextLine();
		
		System.out.print("Enter the second city: ");
		String city2 = kb.nextLine();
		
		System.out.print("Enter the third city: ");
		String city3 = kb.nextLine();
		
		System.out.print("The three cities in alphabetical order are ");
		
		//Can use transitive properties to shorten these
		if ((city1.compareTo(city2)) < 0 && (city1.compareTo(city3)) < 0 && (city2.compareTo(city3) < 0))
		{
			System.out.println(city1 + ", " + city2 + ", " + city3);
		}
		
		else if ((city1.compareTo(city2)) < 0 && (city1.compareTo(city3)) < 0 && (city3.compareTo(city2) < 0))
		{
			System.out.println(city1 + ", " + city3 + ", " + city2);
		}
		
		else if ((city2.compareTo(city1)) < 0 && (city2.compareTo(city3)) < 0 && (city1.compareTo(city3) < 0))
		{
			System.out.println(city2 + ", " + city1 + ", " + city3);
		}
		
		else if ((city2.compareTo(city1)) > 0 && (city2.compareTo(city3)) > 0 && (city3.compareTo(city1) > 0))
		{
			System.out.println(city2 + ", " + city3 + ", " + city1);
		}
		
		else if ((city3.compareTo(city1)) < 0 && (city3.compareTo(city2)) < 0 && (city1.compareTo(city2) < 0))
		{
			System.out.println(city3 + ", " + city1 + ", " + city2);
		}
		
		else
		{
			System.out.println(city3 + ", " + city2 + ", " + city1);
		}

	}

}
