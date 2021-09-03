package ch17_exercises.ex04_text_to_utf;

import org.junit.Test;

import java.io.*;

/**
 * Chapter 17 (Binary I/O) - Exercise 4:

 * (Convert a text file into UTF) Write a program that reads lines of characters from a text file
 * and writes each line as a UTF string into a binary file.
 *
 * Display the sizes of the text file and the binary file. Use the following command to run the program:
 * java Exercise17_04 Welcome.java Welcome.utf
 *
 * @author Khaled
 */

public class ConvertTxtFile_UTF
{
    @Test
    public void testTxtToBinary() throws IOException
    {
        //text file:
        FileInputStream txtFile = new FileInputStream("CH17_Binary_IO/ch17_notes/sect_05_copying_files/babynamesranking2002.txt");
        File file = new File("CH17_Binary_IO/ch17_notes/sect_05_copying_files/babynamesranking2002.txt");

        //binary file
        FileOutputStream binFile = new FileOutputStream("Ch17_Binary_IO/ch17_exercises/ex04_text_to_utf/babynamesranking2002.dat");

        //bufferedIn for txt, bufferedOut for bin
        try(DataInputStream input = new DataInputStream(txtFile);
            DataOutputStream output = new DataOutputStream(binFile))
        {
            String line;
            while((line = input.readLine()) != null)
            {
                System.out.println(line);
                output.writeUTF(line);
            }
            System.out.println("Text file: " + file.length());
            System.out.println("Bin file: " + output.size());
        }


    }
}
