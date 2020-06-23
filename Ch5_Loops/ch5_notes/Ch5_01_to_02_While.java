package ch5_notes;
import java.util.Scanner;

public class Ch5_01_to_02_While

{
	static Scanner kb = new Scanner(System.in);
	
//	static final int ADDITION_N1 = (int) (Math.random() * 9);
//	static final int ADDITION_N2 = (int) (Math.random() * 9);
//	static final int SUM = ADDITION_N1 + ADDITION_N2;
	
	static final int GENERATED_N = (int) (Math.random() *101);		//0 to 100 inclusive

	public static void main(String[] args)
	
	{
		/* AdditionQuiz.java, gives a program that prompts the user to enter an answer for a question on addition of two 
		 * single digits. Using a loop, you can now rewrite the program to let the user repeatedly enter a new answer until 
		 * it is correct
		 */
		
//		System.out.println("Perform the following addition below.");
//		System.out.print(ADDITION_N1 + " + " + ADDITION_N2 + " = ");
//		int sum = kb.nextInt();
//		
//		while (sum != SUM)
//		{
//			System.out.println(sum + " is incorrect. Try again.");
//			System.out.print(ADDITION_N1 + " + " + ADDITION_N2 + " = ");
//			sum = kb.nextInt();
//		}
//		
//		System.out.println(ADDITION_N1 + " + " + ADDITION_N2 + " = " + sum + " is correct!");
		
		/* 5.2.1 Case Study: Guessing Numbers
The problem is to guess what number a computer has in mind. You will write a program that randomly generates an 
integer between 0 and 100, inclusive. The program prompts the user to enter a number continuously until the number 
matches the randomly generated number. For each user input, the program tells the user whether the input is too low 
or too high, so the user can make the next guess intelligently. 
Here is a sample run:
Guess a magic number between 0 and 100
Enter your guess: 50
Your guess is too high
Enter your guess: 25
Your guess is too low
Enter your guess: 42
Your guess is too high
Enter your guess: 39
Yes, the number is 39
		 */
		
//		System.out.print("Try to guess the number the computer generated (integer between 0 and 100 inclusive: ");	
//		int userGuess = kb.nextInt();
//		int attempts = 1;							//1st attempt
//		
//		while (userGuess != GENERATED_N)
//		{
//			System.out.println("Your guess of " + userGuess + " is too " + ((userGuess > GENERATED_N)?  "high." : "low."));
//			System.out.print("Try again: ");
//			userGuess = kb.nextInt();
//		    attempts++;
//		}
//		
//		System.out.println("You got it! It took you " + attempts + " attempts to guess the correct number " + GENERATED_N);

		/* Following gives a program that generates five (subtraction) questions and, after a student answers all five, 
		 * reports the number of correct answers. The program also displays the time spent on the test and lists all the 
		 * questions.
		 */
		
		int questionNum = 0;
		int difference, correctAns = 0;
		String output = "";
		long startingTime = System.currentTimeMillis();
		
		while (questionNum < 5)
		{
			int n1 = (int) (Math.random() * 9);
			int n2 = (int) (Math.random() * 9);
			
			if (n2 > n1)
			{
				int temp;
				temp = n2;
				n2 = n1;
				n1 = temp;
			}
			
			System.out.print(n1 + " - " + n2 + " = ");
			difference = kb.nextInt();
			
			if (difference == n1 - n2)
			{
				System.out.println("Correct!");
				correctAns++;
			}
			
			else
			{
				System.out.println("Wrong. " + n1 + " - " + n2 + " should be " + (n1 - n2));
			}
			
			output += "\n" + n1 + " - " + n2 + " = " + difference + ((n1 - n2 == difference)? " correct" : " incorrect");
			
			questionNum++;
		}
		
		long endTime = System.currentTimeMillis();
		long testTime = (endTime - startingTime) / 1000;
		
		System.out.println("\nYou answered " + correctAns + " questions correctly. You spent " + testTime + " seconds on "
				+ "the test." + "\n" + output);
	}

}
