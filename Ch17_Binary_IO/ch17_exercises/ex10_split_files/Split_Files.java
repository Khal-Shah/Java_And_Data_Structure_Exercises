package ch17_exercises.ex10_split_files;

import java.io.*;
import java.util.Scanner;

/**
 * Chapter 17 (Binary I/O) - Exercise 10:
 *
 * (Split files) Suppose you want to back up a huge file (e.g., a 10-GB AVI file) to a CD-R. You can achieve it
 * by splitting the file into smaller pieces and backing up these pieces separately.
 *
 * Write a utility program that splits a large file into smaller ones using the following command:
 * java Exercise17_10 SourceFile numberOfPieces
 * The command creates the files SourceFile.1, SourceFile.2, . . . , SourceFile.n, where n is numberOfPieces
 * and the output files are about the same size.
 *
 * @author Khaled
 */

public class Split_Files
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) throws IOException
    {

        FileInputStream fileIn = new FileInputStream("Ch17_Binary_IO/ch17_exercises/ex10_split_files/babynamesranking2002.txt");
        try(BufferedInputStream input = new BufferedInputStream(fileIn))
        {
            System.out.print("Enter in how many parts you'd like to split the file: ");
            int numberOfPieces = kb.nextInt();

            System.out.println("Size: " + fileIn.available());
            long fileSize  = fileIn.available();
            int  splitSize = (int) Math.ceil(1.0 * fileSize / numberOfPieces);


            for(int i = 1; i <= numberOfPieces; i++)
            {
                try(FileOutputStream fileOut =
                            new FileOutputStream("Ch17_Binary_IO/ch17_exercises/ex10_split_files/babynamesranking2002_" + i + ".txt");
                    BufferedOutputStream output = new BufferedOutputStream(fileOut))
                {
                    int count = 0;

                    while(count <= splitSize)
                    {
                        output.write(input.read());
                        count++;
                    }
                }
            }
        }

    }
}
