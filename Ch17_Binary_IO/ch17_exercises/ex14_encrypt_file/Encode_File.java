package ch17_exercises.ex14_encrypt_file;

import java.io.*;

/**
 * Chapter 17 (Binary I/O) - Exercise 14:
 *
 * (Encrypt files) Encode the file by adding 10 to every byte in the file.
 * Write a gram that prompts the user to enter an input file name and an output file name
 * and saves the encrypted version of the input file to the output file.
 *
 * @author Khaled
 */

public class Encode_File
{
    public static void main(String[] args) throws IOException
    {
        //encrypt the last-names file
        try(FileInputStream fileIn = new FileInputStream("Ch17_Binary_IO/ch17_exercises/ex14_encrypt_file/last-names.txt");
            FileOutputStream fileOut = new FileOutputStream("Ch17_Binary_IO/ch17_exercises/ex14_encrypt_file/last-names-encrypted.txt");
            BufferedInputStream bufferedIn = new BufferedInputStream(fileIn);
            BufferedOutputStream bufferedOut = new BufferedOutputStream(fileOut))
        {
            System.out.println("Original file size: " + fileIn.available());

            int fileOutSize = 0;
            int value;

            while((value = bufferedIn.read()) != -1)
            {
                bufferedOut.write((byte) (value + 10));
                fileOutSize++;
            }

            System.out.println("Encrypted file size: " + fileOutSize);
        }
    }
}
