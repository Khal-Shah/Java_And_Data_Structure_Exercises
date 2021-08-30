package ch17_exercises.ex03_sum_float_bin;

import org.junit.Test;

import java.io.*;
import java.util.Random;

/**
 * Chapter 17 (Binary I/O) - Exercise 3:
 *
 * (Sum all the floating points in a binary data file) Suppose a binary data file named Exercise17_03.dat
 * has been created and its data are created using writeDouble(double) in DataOutputStream.
 *
 * The file contains an unspecified number of floating points. Write a program to find the sum of the floating points.
 *
 * Modified to create the file first as well.
 *
 * @author Khaled
 */

public class Sum_FloatingPoints
{
    @Test
    public void testSumFloats() throws IOException
    {
        double sum = 0;

        //create Exercise17_03.dat file and insert numbers
        try(FileOutputStream file = new FileOutputStream("Ch17_Binary_IO/ch17_exercises/ex03_sum_float_bin/Exercise17_03.dat");
            DataOutputStream output = new DataOutputStream(file))
        {
            Random random = new Random();
            for(int i = 0; i < 100; i++)
            {
//                double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
                double randomValue = (-999 + (999 + 999) * random.nextDouble());
                output.writeDouble(randomValue);
                sum += randomValue;
            }
        }

        //Now read the file and add the sum
        double fileSum = 0;

        try(FileInputStream file = new FileInputStream("Ch17_Binary_IO/ch17_exercises/ex03_sum_float_bin/Exercise17_03.dat");
            DataInputStream input = new DataInputStream(file))
        {
            while(true)
            {
                try
                {
                    fileSum += input.readDouble();
                }
                catch(EOFException eofe)
                {
                    System.out.println("All files read");
//                    eofe.printStackTrace();
                    break;
                }
            }
        }

        System.out.println("The sum found in the file is: " + fileSum + "\nThe actual sum is " + sum +
                           "\nThey match? --> " + (sum == fileSum));
    }
}
