package ch12notes.newnotes;

import java.util.Scanner;

public class Demo01_QuotientWithException
{
    static Scanner kb = new Scanner(System.in);
    //quotient method
    public static int quotient(int n1, int n2)
    {
        //divide n1 by n2 so n2 if n2 is 0 throw exception
        if(n2 == 0)
        {
            //throw new ArithmeticException("Divisor cannot be zero.");
        }

        return n1 / n2;
    }
    public static void main(String[] args)
    {
        System.out.printf("Enter dividend: ");
        int n1 = kb.nextInt();

        System.out.printf("Enter divisor: ");
        int n2 = kb.nextInt();

        //program will still terminate abnormally if you don't use try-catch
        //System.out.println("The quotient is = " + quotient(n1, n2));

        try
        {
            System.out.println("The quotient is = " + quotient(n1, n2));
        }

        catch (ArithmeticException ex)
        {
            System.out.println("Exception: an integer cannot be divided by 0");
        }

        //would not reach here if we don't try to catch exception
        System.out.println("Program continues...");
    }
}
