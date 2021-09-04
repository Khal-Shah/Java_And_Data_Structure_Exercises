package ch17_exercises.ex06_store_loan_obj;

import ch12exercises.ex04_argument.Loan;

import java.io.*;

/**
 * Chapter 17 (Binary I/O) - Exercise 6:
 *
 * (Store Loan objects) The Loan class in Listing 10.2 does not implement
 * Serializable. Rewrite the Loan class to implement Serializable. Write
 * a program that creates five Loan objects and stores them in a file named
 * Exercise17_06.dat.
 *
 * @author Khaled
 */

public class StoreLoan_Objects
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        //File
        FileOutputStream fileOut = new FileOutputStream("Ch17_Binary_IO/ch17_exercises/ex06_store_loan_obj" +
                "/Exercise17_06.dat");

        //Create 5 loan objects: double annualInterestRate, int numberOfYears, double loanAmount
        Loan loan1 = new Loan(3.0, 3, 28_000);
        Loan loan2 = new Loan();
        Loan loan3 = new Loan(4.5, 6, 28_000);
        Loan loan4 = new Loan(1.7, 4, 28_000);
        Loan loan5 = new Loan(2.5, 5, 28_000);

        //ObjectOutput resource
        try(ObjectOutputStream objectOut = new ObjectOutputStream(fileOut))
        {
            //write
            objectOut.writeObject(loan1);
            objectOut.writeObject(loan2);
            objectOut.writeObject(loan3);
            objectOut.writeObject(loan4);
            objectOut.writeObject(loan5);
        }

        //Read:
        FileInputStream fileIn = new FileInputStream("Ch17_Binary_IO/ch17_exercises/ex06_store_loan_obj" +
                "/Exercise17_06.dat");

        try(ObjectInputStream objectIn = new ObjectInputStream(fileIn))
        {
            System.out.println(objectIn.readObject().toString());
            System.out.println(objectIn.readObject().toString());
            System.out.println(objectIn.readObject().toString());
            System.out.println(objectIn.readObject().toString());
            System.out.println(objectIn.readObject().toString());
        }
    }
}
