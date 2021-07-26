package ch3exercises;
import java.util.*;

		/* Chapter 3 - Exercise 17:
		 * (Game: scissor, rock, paper) Write a program that plays the popular scissor-rock- paper game. (A scissor can cut 
		 * a paper, a rock can knock a scissor, and a paper can wrap a rock.) The program randomly generates a number 
		 * 0, 1, or 2 representing scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or 2 and 
		 * displays a message indicating whether the user or the computer wins, loses, or draws. Here are sample runs:
		 * scissor (0), rock (1), paper (2): 1
			The computer is scissor. You are rock. You won
			
			scissor (0), rock (1), paper (2): 2
			The computer is paper. You are paper too. It is a draw
		 */
			//By Khaled Shah

public class Ch3_17_Rock_Paper_Scissor
{
	static Scanner kb = new Scanner(System.in);
	static final int COMP_CHOICE = (int) (Math.random() * 3);

	public static void main(String[] args)
	{
		System.out.print("Scissor (0), rock (1), paper (2): ");
		int userChoice = kb.nextInt();
		
		String compName = "";
		String userName = "";
		
		switch (COMP_CHOICE)
		{
			case 0: compName = "scissor";
			break;
			case 1: compName = "rock";
			break;
			case 2: compName = "paper";
			break;
		}
		
		switch (userChoice)
		{
			case 0: userName = "scissor";
			break;
			case 1: userName = "rock";
			break;
			case 2: userName = "paper";
			break;
		}
		
		String gameResult = "";
		
		if (userChoice == 0)
		{
			switch (COMP_CHOICE)
			{
				case 1: gameResult = "lose";
				break;
				case 2: gameResult = "win";
				break;
				default: gameResult = "draw";
			}
		}
		
		else if (userChoice == 1)
		{
			switch (COMP_CHOICE)
			{
				case 0: gameResult = "win";
				break;
				case 2: gameResult = "lose";
				break;
				default: gameResult = "draw";
			}
		}
		
		else if (userChoice == 2)
		{
			switch (COMP_CHOICE)
			{
				case 0: gameResult = "lose";
				break;
				case 1: gameResult = "win";
				break;
				default: gameResult = "draw";
			}
		}
		
		System.out.println("The computer is " +compName + " , you are " + userName + ((compName == userName)?  
				" too" : "") + ((gameResult == "draw")? ". It is a " : ". You ") + gameResult + ".");
		

	}

}
