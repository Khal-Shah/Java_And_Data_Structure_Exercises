package ch17_exercises.ex02_binfile_integers;

import org.junit.Test;

import java.io.*;
import java.util.Random;

/**
 *  * Chapter 17 (Binary I/O) - Exercise 2:
 *
 *  (Create a binary data file) Write a program to create a file named Exercise17_02.dat if it does not exist.
 *  Append new data to it if it already exists. Write 150 integers created randomly into the file using binary I/O.
 *
 * @author Khaled
 */

public class Create_Write_BinFile
{
    @Test
    public void testBinaryFile() throws IOException
    {
        //try(resource) {do stuff}
        try(FileOutputStream file = new FileOutputStream("Ch17_Binary_IO/ch17_exercises/ex02_binfile_integers/Exercise17_02.dat");
            BufferedOutputStream bufferedOut = new BufferedOutputStream(file);
            DataOutputStream output = new DataOutputStream(bufferedOut))
        {
            Random random = new Random();

            for(int i = 0; i < 150; i++)
            {
                output.writeInt((-999 + random.nextInt(1999)));
                output.writeUTF(" ");
            }
        }

        //Read and print on terminal
        try(BufferedInputStream bufferedIn = new BufferedInputStream
                (new FileInputStream("Ch17_Binary_IO/ch17_exercises/ex02_binfile_integers/Exercise17_02.dat"));
        DataInputStream input = new DataInputStream(bufferedIn))
        {
            int i = 0;
            while(true)
            {
                try
                {
                    System.out.printf("%7d \t %s", input.readInt(), input.readUTF());
                    i++;

                    if(i % 10 == 0)
                    {
                        System.out.println();
                    }
                }
                catch(EOFException eofException)
                {
                    System.out.println("\nAll data has been read.");
                    break;
                }
            }
        }

    }
}
