package ch3exercises;
import java.util.*;

		/* Chapter 3 - Exercise 24:
		 * (Game: pick a card) Write a program that simulates picking a card from a deck of 52 cards. 
		 * Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King) and suit 
		 * (Clubs, Diamonds, Hearts, Spades) of the card. 
		 * Here is a sample run of the program:
		 * The card you picked is Jack of Hearts
		 */
				//By Khaled Shah

public class Ch3_24_Pick_a_Card
{
	static Scanner kb = new Scanner(System.in);
	static final int RANDOM_CARD =  ((int) (1 + Math.random() * 52));

	public static void main(String[] args)
	{
		// 1 - 13 = clubs....14 - 26 = diamond...27 - 39 = hearts....40 - 52 = spades 
		String rank = "";
		String suit = "Clubs";
		
		System.out.println(RANDOM_CARD);
		
		if (RANDOM_CARD > 13)
		{
			if ((RANDOM_CARD >= 14) && (RANDOM_CARD <= 26))
			{
				suit = "Diamond";
			}
			
			else if ((RANDOM_CARD >= 27) && (RANDOM_CARD <= 39))
			{
				suit = "Hearts";
			}
			
			else
			{
				suit = "Spades";
			}
		}
		
		int randomCard = RANDOM_CARD % 13;
		
		switch (randomCard)
		{
			case 0: rank = "King";
			break;
			case 1: rank = "Ace";
			break;
			case 2: rank = "2";
			break;
			case 3: rank = "3";
			break;
			case 4: rank = "4";
			break;
			case 5: rank = "5";
			break;
			case 6: rank = "6";
			break;
			case 7: rank = "7";
			break;
			case 8: rank = "8";
			break;
			case 9: rank = "9";
			break;
			case 10: rank = "10";
			break;
			case 11: rank = "Jack";
			break;
			case 12: rank = "Queen";
			break;
		}
		
		System.out.println("The card you picked is " + rank + " of " + suit + ".");

	}

}
