package ch18notes;

import java.util.Random;
import java.util.Scanner;

public class Recursion_Practice
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
//        int num = factorial(4);
//        System.out.println(num);
//
//        int num = fibonacci(6);
//        System.out.println(num);

        //System.out.println("nn is a palindrome?\n" + isPalindrome("nn"));
        Random random = new Random();
        double[] unsorted = new double[10];
        int i = 0;

        while(i < unsorted.length)
        {
            unsorted[i++] = random.nextDouble();
        }

        System.out.print("Unorted is: ");
        for(double e: unsorted)
        {
            System.out.printf("%.2f\t", e);
        }

        double[] sorted = sort(unsorted);
        System.out.print("\nSorted is: ");
        for(double e: sorted)
        {
            System.out.printf("%.2f\t", e);
        }
    }

    public static int factorial(int n)
    {
        return ((n == 0)? 1: n * factorial(--n));
    }

    public static int fibonacci(int n)
    {
        if(n == 0)  //base case 1
        {
            return 0;
        }

        else if(n == 1)     //base case 2
        {
            return 1;
        }

        return  fibonacci(n - 2) + fibonacci(n - 1);
    }

//    public static boolean isPalindrome(String msg)
//    {
//        if(msg.length() <= 1)
//        {
//            return true;
//        }
//
//        else if(msg.charAt(0) != msg.charAt(msg.length() - 1))
//        {
//            return false;
//        }
//
//        return isPalindrome(msg.substring(1, msg.length() - 1));
//    }

    //^Not super efficient, we can use a recursive helper method

    public static boolean isPalindrome(String msg)
    {
        return isPalindrome(msg, 0, msg.length() - 1);
    }

    //overloaded recursive helper method
    private static boolean isPalindrome(String s, int low, int high)
    {
        if(high <= low) //base case 1
        {
            return true;
        }

        else if(s.charAt(low) != s.charAt(high))  //base case 2
        {
            return false;
        }

        return isPalindrome(s, low + 1, high - 1);
    }

    public static double[] sort(double[] list)
    {
       return sort(list, 0, list.length - 1);
    }

    public static double[] sort(double[] list, int low, int high)
    {
        //find smallest element, swap it with the first element
        //ignore first element, sort the remaining recursively
        if(low < high)
        {
            int minIndex = low;
            double minValue = list[low];

            for(int i = low + 1; i < list.length; i++)
            {
                if(list[i] < minValue)
                {
                    minValue = list[i];
                    minIndex = i;
                }
            }

            //Now that we have the minValue, swap it with the first element
            list[minIndex] = list[low];
            list[low] = minValue; //place smallest element

            //Now that smallest is in the right place, move to the right
            return sort(list, low + 1, list.length - 1);
        }

        else
        {
            return list;
        }
    }


}
