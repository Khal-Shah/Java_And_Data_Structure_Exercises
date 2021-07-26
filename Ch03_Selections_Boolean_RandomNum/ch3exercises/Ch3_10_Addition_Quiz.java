package ch3exercises;
import java.util.*;

/* Chapter 3 - Exercise 10:
 * (Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a subtraction question. Revise the 
 * program to randomly generate an addition question with two integers less than 100.
 */
		//By Khaled Shah

public class Ch3_10_Addition_Quiz
{
	static final  int NUM1 = (int) (-99 + Math.random() * 199);
	static final  int NUM2 = (int) (-99 + Math.random() * 199);
	static final int SUM = NUM1 + NUM2;
	
	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.print("What is " + NUM1 + " + " + ((NUM2 < 0)? "(" + NUM2 + ")": NUM2) + " = " );
		int userAns = kb.nextInt();
		
		System.out.println((userAns == SUM)? "That is correct!" : "Incorrect.");
		
	}

}
