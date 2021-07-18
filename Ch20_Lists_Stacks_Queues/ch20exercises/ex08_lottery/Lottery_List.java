package ch20exercises.ex08_lottery;

import java.util.*;

/**
 *  Chapter 20 (Lists, Stacks, & Queues) - Exercise 8:
 *  (Game: lottery) Revise Programming Exercise 3.15 to add an additional $2,000
 * award if two digits from the user input are in the lottery number. (Hint: Sort
 * the three digits in the lottery number and three digits in the user input into two
 * lists, and use the Collection’s containsAll method to check whether the
 * two digits in the user input are in the lottery number.)
 *
 * Ex 3.15:
 * 		 * (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a three- digit number. The program
 * 		 * prompts the user to enter a three-digit number and determines whether the user wins according to the following
 * 		 * rules: 		1. If the user input matches the lottery number in the exact order, the award is $10,000.
 * 							2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
 * 							3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
 *
 * @author Khaled
 */
public class Lottery_List
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        Random random = new Random();

        //winning lottery number formation
        List<Integer> winningNumber = new LinkedList<>();
        for(int i = 0; i < 3; i++)
        {
            winningNumber.add(1 + random.nextInt(9));
        }

        System.out.println(winningNumber);

        //Get user lottery number
        System.out.println("Enter your three digit guess for the lottery number.");
        List<Integer> userNumber = new LinkedList<>();
        for(int i = 0; i < 3; i++)
        {
            System.out.print("Digit " + (i + 1) + ": ");
            userNumber.add(kb.nextInt());
        }

        System.out.println("The winning number is: " + winningNumber + "\nYour lottery number is: " + userNumber);


        int awardTotal = getAwardTotal(winningNumber, userNumber);

        System.out.println("Your award is: $" + awardTotal);

    }

    private static int getAwardTotal(List<? extends Integer> lottery, List<? extends Integer> guess)
    {
        if(lottery.equals(guess))
        {
            System.out.println("Exact match!!!");
            return 10_000;
        }

        else if(lottery.containsAll(guess))
        {
            System.out.println("Your number contains all the matching digits!");
            return 3000;
        }

        //if 2 digits from guess is in lottery then award is 2000
        List<?> subList1 = guess.subList(0, 2);
        List<?> subList2 = guess.subList(1, 3);

//        System.out.println("Sublist1: " + subList1 + "\nSublist2: " + subList2);

        if(lottery.containsAll(subList1) || lottery.containsAll(subList2))
        {
            System.out.println("Two matching digit.");
            return 2000;
        }

        else if(lottery.contains(guess.get(0)) || lottery.contains(guess.get(1)) || lottery.contains(guess.get(2)))
        {
            System.out.println("1 matching digit");
            return 1000;
        }

        System.out.println("Sorry, no match.");
        return 0;
    }
}
