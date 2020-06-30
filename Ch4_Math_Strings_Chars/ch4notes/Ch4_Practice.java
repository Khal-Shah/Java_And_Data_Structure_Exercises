package ch4notes;
import java.util.Scanner;


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

public class Ch4_Practice
{
	static Scanner kb = new Scanner(System.in);
	
	
	public static void main(String[] args)
	{
		System.out.print("Enter the first city: ");
		String city1 = kb.nextLine();

		System.out.print("Enter the second city: ");
		String city2 = kb.nextLine();

		System.out.print("Enter the third city: ");
		String city3 = kb.nextLine();

		System.out.print("The three cities in alphabetical order are ");

		String orderedCity1 = "";
		String orderedCity2 = "";
		String orderedCity3 = "";

		if (city1.compareToIgnoreCase(city2) < 0 && city1.compareToIgnoreCase(city3) < 0 && city2.compareToIgnoreCase(city3) < 0)
		{
			orderedCity1 = city1;
			orderedCity2 = city2;
			orderedCity3 = city3;
		}

		else if (city2.compareToIgnoreCase(city1) < 0 && city2.compareToIgnoreCase(city3) < 0 && city1.compareToIgnoreCase(city3) < 0)
		{
			orderedCity1 = city2;
			orderedCity2 = city1;
			orderedCity3 = city3;
		}

		else if (city3.compareToIgnoreCase(city1) < 0 && city3.compareToIgnoreCase(city2) < 0 && city1.compareToIgnoreCase(city2) < 0)
		{
			orderedCity1 = city3;
			orderedCity2 = city1;
			orderedCity3 = city2;
		}

		System.out.println(orderedCity1 + " " + orderedCity2 + " " + orderedCity3);



	}

}
