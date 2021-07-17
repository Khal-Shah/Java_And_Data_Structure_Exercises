package ch20exercises.ex03_addition_quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *  Chapter 20 (Lists, Stacks, & Queues) - Exercise 3:
 * Write a program that repeatedly prompts the user to enter a capital for a state. Upon receiving the
 * user input, the program reports whether the answer is correct.
 *
 * Note: exercise modified to quiz two digit additions instead of US state capitals
 *
 * @author Khaled
 */

public class Addition_Quiz_List
{

    static Scanner kb = new Scanner(System.in);
    static int correctAnswers = 0;

    public static void main(String[] args)
    {
        //Question List
        List<String> questions = new ArrayList<>(50);

        //Answer List
        List<Integer> answers = new ArrayList<>(50);

        Random random = new Random();
        int sum1, sum2 = 0;

        //populate questions with two digit addition questions and store the answers
        for(int i = 0; i < 50; i++)
        {
            sum1 = ( -99 + random.nextInt(199));
            sum2 = (-99 + random.nextInt(199));
            questions.add(sum1 + " + " + sum2);
            answers.add(sum1 + sum2);
        }

        int totalQs = 0;
        System.out.print("How many questions would you like to answer? (Choose between 1 and 50):" +
                         " ");
        totalQs = kb.nextInt();

        int answerInput;

        for(int i = 0; i < totalQs; i++)
        {
            System.out.print(questions.get(i) + " = ");
            answerInput = kb.nextInt();

            if(answerInput == answers.get(i))
            {
                System.out.println("Correct! So far you got " + ++correctAnswers + "/" + (i + 1));
            }

            else
            {
                System.out.println("Wrong! The correct answer is " + answers.get(i));
            }
        }

        System.out.println("In total you got " + correctAnswers + "/" + totalQs);
    }
}
