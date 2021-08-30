package ch17_exercises.ex01_txtfile_integers;

import java.io.*;
import java.util.Random;

/**
 * Chapter 17 (Binary I/O) - Exercise 1:
 *
 * (Create a text file) Write a program to create a file named Exercise17_01.txt if it does not exist.
 * Append new data to it if it already exists. Write 150 integers created randomly into the file using
 * text I/O. Integers are separated by a space.
 *
 * @author Khaled
 */

public class Create_Write_TxtFile
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("Ch17_Binary_IO/ch17_exercises/ex01_txtfile_integers/Exercise17_01.txt");
        Random random = new Random();

        //Text IO
        Writer writer = new PrintWriter(file);

        if(file.exists())
        {
            System.out.println("File Exists");
            for(int i = 0; i < 150; i++)
            {
                //4 digit random int
                writer.write( -9999 + random.nextInt(19999) + "\t");
                if((i + 1) % 10 == 0)
                {
                    writer.write("\n");
                }
            }
            writer.close();
        }

        else
        {
            System.out.println("Doesn't Exist");
        }
    }
}
