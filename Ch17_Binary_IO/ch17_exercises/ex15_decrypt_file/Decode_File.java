package ch17_exercises.ex15_decrypt_file;

import java.io.*;

/**
 * Chapter 17 (Binary I/O) - Exercise 15:
 *
 * (Decrypt files) Suppose a file is encrypted using the scheme in Programming Exercise 17.14.
 * Write a program to decode an encrypted file. Your program should prompt the user to enter an input
 * file name for the encrypted file and an output file name for the unencrypted version of the input file.
 *
 * @author Khaled
 */

public class Decode_File
{
    public static void main(String[] args) throws IOException
    {
        //decode the encrypted file from exercise 14:
        File file = new File("Ch17_Binary_IO/ch17_exercises/ex14_encrypt_file/last-names-encrypted.txt");
        try(FileInputStream encryptedFile = new FileInputStream(file);
            FileOutputStream decryptedFile = new FileOutputStream
                    ("Ch17_Binary_IO/ch17_exercises/ex15_decrypt_file/last-names-decrypted.txt");
            BufferedInputStream input = new BufferedInputStream(encryptedFile);
            BufferedOutputStream output = new BufferedOutputStream(decryptedFile))
        {
            int value;

            while((value = input.read()) != -1)
            {
                output.write(value - 10);
            }
            System.out.println("Look at file \"" + file.getName() + "\" to check the decrypted file.");
        }

    }
}
