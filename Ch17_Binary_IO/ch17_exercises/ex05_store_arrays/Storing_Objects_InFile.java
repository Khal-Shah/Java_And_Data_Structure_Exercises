package ch17_exercises.ex05_store_arrays;

import java.io.*;
import java.util.Arrays;
import java.util.Date;

/**
 * Chapter 17 (Binary I/O) - Exercise 5:

 * (Store objects and arrays in a file) Write a program that stores an array of the six
 * int values 1, 2, 3, 4,5, and 6, a Date object for the current time, and the double
 * value 10.5 into the file named Exercise17_05.dat.
 *
 * @author Khaled
 */

public class Storing_Objects_InFile
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        //int array
        int[] nums = {1, 2, 3, 4, 5, 6};
        //Date
        Date date = new Date();
        double value = 10.5;

        System.out.println("Time before: " + date);

        //FileOut
        FileOutputStream fileOut = new FileOutputStream("Ch17_Binary_IO/ch17_exercises/ex05_store_arrays" +
                "/Exercise17_05.dat");

        //write to file
        try(ObjectOutputStream objectOut = new ObjectOutputStream(fileOut))
        {
            objectOut.writeObject(nums);
            objectOut.writeObject(date);
            objectOut.writeObject(value);
        }

        //Read it (FileIn)
        FileInputStream fileIn = new FileInputStream("Ch17_Binary_IO/ch17_exercises/ex05_store_arrays" +
                "/Exercise17_05.dat");
        try(ObjectInputStream objectIn = new ObjectInputStream(fileIn))
        {
            int[] newNums = (int[]) objectIn.readObject();
            System.out.println(Arrays.toString(newNums));

            Date newDate = (Date) objectIn.readObject();
            System.out.println("Time should be the same as before: " + newDate);

            System.out.println(objectIn.readObject());
        }

    }
}
