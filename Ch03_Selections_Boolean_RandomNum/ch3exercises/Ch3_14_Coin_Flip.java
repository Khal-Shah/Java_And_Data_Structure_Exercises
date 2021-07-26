package ch3exercises;
import java.util.Scanner;

/* Chapter 3 - Exercise 14 
 * (Game: heads or tails) 
 * Write a program that lets the user guess whether the flip of a coin results in heads or tails. The program randomly 
 * generates an integer 0 or 1, which represents head or tail. The program prompts the user to enter a guess and reports 
 * whether the guess is correct or incorrect.
 */
		//By Khaled Shah

public class Ch3_14_Coin_Flip
{
	static Scanner kb = new Scanner(System.in);
	
	static final int COIN_FLIP = (int) (Math.random() * 2);

	public static void main(String[] args)
	{	
		String coinSide = ((COIN_FLIP == 0)? "heads" : "tails");
		
		System.out.println("Heads or Tails?");
		String userGuess = kb.nextLine();
		
		System.out.println(((userGuess.equalsIgnoreCase(coinSide))? "You win" : "You lose"));
	}

}

/*Re-done with methods:
 * static final int draw = (int) (Math.round(Math.random()));
	
	public static void main(String[] args)
	{
		System.out.println(draw);
		String result = getResult(draw);
		String guess = getGuess();
		
		System.out.println((result.equalsIgnoreCase(guess))? "Correct!" : "Incorrect.");
		
	
		
	}
	
	public static String getResult(int draw)
	{
		String result = ((draw == 1)? "Head" : "Tail");
		return result;
	}
	
	public static String getGuess()
	{
		System.out.print("Enter your guess (Head or Tail): ");
		String guess = kb.nextLine();
		
		return guess;
	}
	
 */
