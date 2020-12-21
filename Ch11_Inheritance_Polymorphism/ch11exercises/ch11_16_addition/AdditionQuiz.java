package ch11exercises.ch11_16_addition;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/** Chapter 11 - Exercise 15:
 * (Addition quiz) Rewrite Listing 5.1 RepeatAdditionQuiz.java to alert the user if an answer is entered again.
 * Hint: use an array list to store answers.
 *
 * Here is a sample run:
 * What is 5 + 9? 12
 * Wrong answer. Try again. What is 5 + 9? 34
 * Wrong answer. Try again. What is 5 + 9? 12
 * You already entered 12
 * Wrong answer. Try again. What is 5 + 9? 14
 * You got it!
 *
 * @author Khaled Shah
 */

public class AdditionQuiz
{
    private double sum;
    public ArrayList<Double> enteredValues;
    public Random random;
    static Scanner kb;
    public static int index = -1;

    public AdditionQuiz()
    {
        random = new Random();
        enteredValues = new ArrayList<>();
        kb = new Scanner(System.in);
    }

    public double getRandom()
    {
        return (((double)((int)(this.random.nextDouble() * 1000.0))) / 10.0);
    }

    public void setSum(double n1, double n2)
    {
        DecimalFormat df = new DecimalFormat("#.##");
        this.sum = Double.parseDouble(df.format(n1 + n2));
    }

    public double getSum()
    {
        return this.sum;
    }

    public boolean getIsCorrect()
    {
        return (enteredValues.get(index).equals(getSum()));
    }

    public boolean isRepeated(int i, double ans)
    {
        boolean isRepeat = false;

        if(enteredValues.size() > 1)
        {
            for (int j = i - 1; j >= 0; j--)
            {
                if(enteredValues.get(j) == ans)
                {
                    isRepeat = true;
                }
            }
        }

        return isRepeat;
    }


    public static void main(String[] args)
    {
        AdditionQuiz quiz1 = new AdditionQuiz();
        double num1 = quiz1.getRandom();
        double num2 = quiz1.getRandom();
        quiz1.setSum(num1, num2);
        System.out.println(quiz1.getSum());
        //put answer in arrayList
        double enteredAnswer;

        do
        {
            index++;
            System.out.println("What is " + num1 + " + " + num2 + "? ");
            enteredAnswer = kb.nextDouble();
            quiz1.enteredValues.add(index, enteredAnswer);

            if(quiz1.getIsCorrect())
            {
                break;
            }

            else
            {
                if(quiz1.isRepeated(index, enteredAnswer))
                {
                    System.out.println("You already entered " + enteredAnswer);
                }
                System.out.print("Wrong answer. Try again. ");
            }

        } while(!quiz1.getIsCorrect());

        System.out.println("You got it!");

    }

}