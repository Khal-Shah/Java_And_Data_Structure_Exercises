package ch18notes;

import org.junit.Test;

import java.util.Scanner;

/*
 * (Sum series) Write a recursive method to compute the following series:
 * m (i) = 1/2 + 2/3 + 3/4 +...+ i/i+1
 * Write a test program that displays m(i) for i = 1, 2, . . ., 10
 **/

public class Exercise_Practice
{
    static Scanner kb = new Scanner(System.in);


    @Test
    public void sumSeriesTest()
    {
        System.out.print("m(10) =");
        for(int i = 1; i <= 10; i++)
        {
            System.out.printf(" %.2f ", sumSequence(i));
        }
    }

    public double sumSequence(double i)
    {
        if(i == 1)
        {
            return i / (i + 1);
        }

        else
        {
            return ((i/(i + 1)) + sumSequence(i - 1));
        }
    }

}
