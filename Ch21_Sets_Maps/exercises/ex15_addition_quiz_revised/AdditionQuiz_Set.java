package exercises.ex15_addition_quiz_revised;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 * Chapter 21 (Sets and Maps) - Exercise 15:
 * (Addition quiz) Rewrite Programming Exercise 11.16 to store the answers in a set rather than a list.
 *
 *  Here is a sample run:
 *  What is 5 + 9? 12
 *  Wrong answer. Try again. What is 5 + 9? 34
 *  Wrong answer. Try again. What is 5 + 9? 12
 *  You already entered 12
 *  Wrong answer. Try again. What is 5 + 9? 14
 *  You got it!
 *
 * @author Khaled
 */

public class AdditionQuiz_Set
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        Random random = new Random();
        int sum1 = random.nextInt(100);
        int sum2 = random.nextInt(100);
        int result = (sum1 + sum2);
        int userInput;

        System.out.print("What is " + sum1 + " + " + sum2 + " = ");

        Set<Integer> userAnswers = new HashSet<>();
        userInput = kb.nextInt();
        userAnswers.add(userInput);

        while(!userAnswers.contains(result))
       {
           System.out.print("Wrong answer. Try again. ");
           System.out.print("What is " + sum1 + " + " + sum2 + " = ");
           userInput = kb.nextInt();

           if(userAnswers.contains(userInput))
           {
               System.out.print("You already entered " + userInput + "\n");
           }

           userAnswers.add(userInput);
       }

        System.out.println("You got it!");
    }
}
