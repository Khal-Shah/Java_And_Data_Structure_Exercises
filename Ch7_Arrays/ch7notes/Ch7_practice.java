package ch7notes;
import java.util.*;

/* Chapter 7 - Exercise 29:
 *  (Game: pick four cards) Write a program that picks four cards from a deck of 52 cards and computes their sum.
 *  An Ace, King, Queen, and Jack represent 1, 13, 12, and 11, respectively.
 *  Your program should display the number of picks that yields the sum of 24.
 */
//By Khaled Shah

public class Ch7_practice
{
	static Scanner kb = new Scanner(System.in);
	static final String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};	//cardNum / 13 for suit
	static final String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	//cardNum % 13 for rank
	static int count = 0;

	public static void main(String[] args)
	{
		int[] deck = getDeck(52);

		//System.out.println("Card number " + deck[11] + " is " + ranks[(11 % 13) + 1] + " of " + suits[11 / 13]);
		int[] first4Cards = new int[4];

		int i = 0;
		while(i < first4Cards.length)
		{
			first4Cards[i] = pickCards(deck);
			i++;
		}

		int sum = getSum(first4Cards);

		displayResults(first4Cards, sum);

	}

	static void displayResults(int[] cards, int sum)
	{
		System.out.println("The 4 cards picked are: ");

		for(int i = 0; i < cards.length; i++)
		{
			System.out.println("Card number " + cards[i] + " is " + getSuitsAndRanks(cards[i]));
		}

		if(sum < 24)
		{
			System.out.println("4 cards were not enough to reach a sum of 24.");
		}

		else
		{
			System.out.println("It took " + (count + 1) + " cards to reach 24.");
		}
	}


	static int getSum(int[] firstCards)
	{
		int sum = 0;
		int i = 0;
		int rankVal = 0;

		do
		{
			switch (ranks[firstCards[i] % 13])
			{
				case "Ace" -> rankVal = 1;
				case "Jack" -> rankVal = 11;
				case "Queen" -> rankVal = 12;
				case "King" -> rankVal = 13;
				default -> rankVal = Integer.parseInt(ranks[firstCards[i] % 13]);
			}
			sum += rankVal;
			i++;
			if(sum < 24)
			{
				count++;
			}
		} while(i < firstCards.length);

		return sum;
	}

	static String getSuitsAndRanks(int cardNum)
	{
		return (ranks[(cardNum % 13)] + " of " + suits[cardNum / 13]);
	}

	static int pickCards(int[] deck)
	{
		return ((int) (Math.random() * 52));
	}

	static int[] getDeck(int size)
	{
		int[] deck = new int[size];

		for(int i = 0; i < size; i++)
		{
			deck[i] = i;
		}
		return deck;
	}

}

