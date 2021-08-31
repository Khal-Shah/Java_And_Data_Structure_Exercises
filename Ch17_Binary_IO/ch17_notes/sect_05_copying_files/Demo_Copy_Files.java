package ch17_notes.sect_05_copying_files;

import java.io.*;

public class Demo_Copy_Files
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream file = new FileInputStream("Ch17_Binary_IO/ch17_notes/sect_05_copying_files/babynamesranking2002.txt");
        FileOutputStream fileOut = new FileOutputStream("Ch17_Binary_IO/ch17_notes/sect_05_copying_files/copy_babynamesranking2002.txt");

        try(BufferedInputStream bufferedIn = new BufferedInputStream(file);
        BufferedOutputStream bufferedOut = new BufferedOutputStream(fileOut)
        )
        {
            // Continuously read a byte from input and write it to output
            int r;
            int numberOfBytesCopied = 0;
            while((r = bufferedIn.read()) != -1)
            {
                bufferedOut.write((byte) r);
                numberOfBytesCopied++;
            }

            System.out.println("number of bytes copied = " + numberOfBytesCopied);
        }
    }

}
