package ch17_exercises.ex12_combined_files;

import java.io.*;

/**
 * Chapter 17 (Binary I/O) - Exercise 12:
 *
 *  (Combine files) Write a utility program that combines the files together into a
 * new file using the following command:
 *               java Exercise17_12 SourceFile1 . . . SourceFilen TargetFile
 * The command combines SourceFile1, . . . , and SourceFilen into TargetFile.
 *
 * @implNote combines the 2002 and 2010 baby names files into one
 *
 * @author Khaled
 */

public class Combine_Files
{
    public static void main(String[] args) throws IOException
    {
        try(FileInputStream file1 = new FileInputStream("Ch17_Binary_IO/ch17_exercises/ex12_combined_files/babynamesranking2002.txt");
        FileInputStream file2 = new FileInputStream("Ch17_Binary_IO/ch17_exercises/ex12_combined_files/babynamesranking2010.txt"))
        {
            FileOutputStream file = new FileOutputStream("Ch17_Binary_IO/ch17_exercises/ex12_combined_files/babynamesCombined.txt");
            combineFiles(file1, file2, file);
        }

    }

    private static void combineFiles(FileInputStream file1, FileInputStream file2, FileOutputStream file) throws IOException
    {
        //first read file1 and write to file, then when file1 ends read file2 and write to file
        try(DataInputStream inputFile1 = new DataInputStream(file1);
        DataInputStream inputFile2 = new DataInputStream(file2);
        DataOutputStream output = new DataOutputStream(file))
        {
            int value;

            while((value = inputFile1.read()) != -1)
            {
                output.write(value);
            }

            output.writeUTF("\nEnd of File 1\nBelow is File 2 data:\n");

            while((value = inputFile2.read()) != -1)
            {
                output.write(value);
            }
        }
    }
}
