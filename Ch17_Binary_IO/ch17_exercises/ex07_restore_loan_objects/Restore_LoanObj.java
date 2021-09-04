package ch17_exercises.ex07_restore_loan_objects;

import ch12exercises.ex04_argument.Loan;
import org.junit.Test;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Chapter 17 (Binary I/O) - Exercise 7:

 * (Restore objects from a file) Suppose a file named Exercise17_06.dat has
 * been created using the ObjectOutputStream from the preceding programming exercises.

 * The file contains Loan objects. The Loan class in Listing 10.2
 * does not implement Serializable. Rewrite the Loan class to implement
 * Serializable.
 *
 * Write a program that reads the Loan objects from the file and
 * displays the total loan amount. Suppose that you don’t know how many Loan
 * objects are there in the file, use EOFException to end the loop
 *
 * @author Khaled
 */

public class Restore_LoanObj
{
    @Test
    public void testRestoreLoanObj() throws IOException, ClassNotFoundException
    {
        //File already exists (need reader/input)
        FileInputStream fileIn = new FileInputStream("Ch17_Binary_IO/ch17_exercises/ex06_store_loan_obj/Exercise17_06" +
                ".dat");

        //ObjectInput resource
        try(ObjectInputStream objectIn = new ObjectInputStream(fileIn))
        {
            //read objects and display total loan amount
            while(true)
            {
                try
                {
                    System.out.println(((Loan)objectIn.readObject()).getLoanAmount());
                }
                catch(EOFException exception)
                {
                    System.out.println("Done reading all objects.");
                    break;
                }
            }
        }

    }
}
