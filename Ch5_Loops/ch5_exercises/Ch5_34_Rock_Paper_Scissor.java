package ch5_exercises;
import java.util.Scanner;

/* Chapter 5 - Exercise 34:
 * (Game: scissor, rock, paper) Programming Exercise 3.17 gives a program that plays the scissor-rock-paper game. 
 * Revise the program to let the user continuously play until either the user or the computer wins more than two times 
 * than its opponent. 
 */
		//By Khaled Shah

public class Ch5_34_Rock_Paper_Scissor
{
	static Scanner kb = new Scanner(System.in);
	//3 objects taken 2 at a time, 3!/(3 - 2)! 2! => 6/2 = 3 combinations 
	//rock beats scissor, paper beats rock, scissor beats paper 
	//Suppose 1 = rock, 2 = paper, 3 = scissor. 
	
	public static void main(String[] args)
	{
		int userWon = 0, compWon = 0;
		int userNum;
		int compChoice;
		String gameResult = "";
		String compStr = "";
		String userChoice;
		
		do
		{
			System.out.print("Choose rock, paper, or scissor: ");
			userChoice = kb.next();
			
			while(!(userChoice.equalsIgnoreCase("rock") || userChoice.equalsIgnoreCase("paper") || 
					userChoice.equalsIgnoreCase("scissor")))
			{
				System.out.print(userChoice + " is an invalid entry. Please enter either rock, paper or scissor: ");
				userChoice = kb.next();
			}
			
			switch(userChoice)
			{
				case "rock": userNum = 1;
				break;
				case "paper": userNum = 2;
				break;
				case "scissor": userNum = 3;
				break;
				default: userNum = 0;
			}
			
			compChoice = (int) (1 + Math.random() * 3);
			
			switch(compChoice)
			{
				case 1: compStr = "rock";
				break;
				case 2: compStr = "paper";
				break;
				case 3: compStr = "scissor";
				break;
			}
			
			if (compChoice == 1)					//comp = rock
			{
				switch (userNum)
				{
					case 2:  gameResult = "User wins";
					userWon++;
					break;
					case 3:  gameResult = "Comp wins";
					compWon++;
					break;
					default: gameResult = "Draw";
				}
			}
			
			else if (compChoice == 2)					//comp = paper
			{
				switch (userNum)
				{
					case 1:  gameResult = "Comp wins";
					compWon++;
					break;
					case 3:  gameResult = "User wins";
					userWon++;
					break;
					default: gameResult = "Draw";
				}
			}
			
			else if (compChoice == 3)					//comp = scissor
			{
				switch (userNum)
				{
					case 1:  gameResult = "User wins";
					userWon++;
					break;
					case 2:  gameResult = "Comp wins";
					compWon++;
					break;
					default: gameResult = "Draw";
				}
			}
		
			System.out.println("You chose " + userChoice.toLowerCase() + " and computer chose " + compStr + ". " + gameResult);
			
		} while (!((compWon == userWon + 2) || ((userWon == compWon + 2))));
		
		System.out.println(((compWon == userWon + 2)? "Computer has " : "You have ") + "won 2 more times. End of game");
		
	}	///comp wins +2 times than user = game stops (exit loop), vice versa
	
		

}
