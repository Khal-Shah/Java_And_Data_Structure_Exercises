package ch7exercises;

/* Chapter 7 - Exercise 29:
 *  (Game: pick four cards) Write a program that picks four cards from a deck of 52 cards and computes their sum. 
 *  An Ace, King, Queen, and Jack represent 1, 13, 12, and 11, respectively. 
 *  Your program should display the number of picks that yields the sum of 24.
 */
		//By Khaled Shah

public class Ch7_29_Pick_Cards
{

	public static void main(String[] args)
	{
		String [] suits = {"Spades", "Heart", "Diamond", "Club"};
		String [] ranks = {"Ace",  "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		int [] deck = new int [52];
		
		shuffleCards(deck, suits, ranks);
	}

	public static void shuffleCards(int [] deck, String [] suits, String [] ranks)
	{
		int temp;
		int index;
		
		for (int i = 0; i < deck.length; i++)				//initialize
		{
			deck [i] = i;
		}
		
		for (int i = 0; i < deck.length; i++)				//shuffle
		{
			index = (int) (Math.random() * deck.length);
			temp = deck [i];
			deck [i] = deck [index];
			deck [index] = temp;
			
		}
		display4Cards(deck, suits, ranks);
	}
	
	public static void display4Cards(int [] deck, String [] suits, String [] ranks)
	{
		String suit;
		String rank;
		String [] rankCollection = new String[4];
		
		for (int i = 0; i < 4; i++)
		{
			suit = suits [deck [i] / 13];
			rank = ranks [deck [i] % 13];
			rankCollection[i] = rank;
			System.out.println("Card number " + deck [i] + ": " + rank + " of " + suit + ".");
		}
		System.out.println("Their sum is " + getSum(rankCollection));
	}
	
	public static int getSum(String [] ranks)
	{
		int sum = 0;
		int cardVal = 0;
		
		for (int i = 0; i < ranks.length; i++)
		{
			switch (ranks[i])
			{
				case "Ace": cardVal = 1;
				break;
				case "Jack": cardVal = 11;
				break;
				case "Queen": cardVal = 12;
				break;
				case "King": cardVal = 13;
				break;
				default: cardVal = Integer.parseInt(ranks[i]);
			}
			sum += cardVal;
		}
		return sum;
	}
}
