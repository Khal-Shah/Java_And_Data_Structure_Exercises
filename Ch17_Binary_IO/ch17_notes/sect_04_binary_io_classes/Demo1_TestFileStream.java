package ch17_notes.sect_04_binary_io_classes;

import java.io.*;

/**
 * Sect 04: using binary I/O to write 10 byte values from 1 to 10 and then reading it back (file name temp.dat)
 */

public class Demo1_TestFileStream
{
    public static void main(String[] args) throws IOException
    {
        //create file
        File file = new File("/ch17_notes/sect_04_binary_io_classes/temp.txt");

        //create output stream (to write) to the file
        FileOutputStream writer = new FileOutputStream(file);

        //now write
        for(int i = 1; i < 11; i++)
        {
            writer.write(i);        //same as .write((byte) i)
        }
        writer.close();

        //create input stream (read the file we just created and wrote to)
        FileInputStream reader = new FileInputStream("/ch17_notes/sect_04_binary_io_classes/temp.txt");
        int value;

        //input value = -1 signifies end of file
        while((value = reader.read()) != -1)    //
        {
            System.out.println(value);
        }
        reader.close();
    }
}
