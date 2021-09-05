package ch17_notes.sect_7_random_access_file;

import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccessFile
{
    @Test
    public void testRAF() throws IOException
    {
        //Create random access file
        try(RandomAccessFile raf = new RandomAccessFile
                ("Ch17_Binary_IO/ch17_notes/sect_7_random_access_file/rafFile.dat", "rw"))
        {
            raf.setLength(0);       //clear old contents in case

            System.out.println("File length to start is: " + raf.length() + "bytes");


            //write 0 to 199 (inclusive) to file
            for(int i = 0; i < 200; i++)
            {
                raf.writeInt(i);
            }

//            show current length
            System.out.println("Current file length is: " + raf.length() + "bytes");
//            will show 800 because we have 200 ints (4 bytes each) = 800bytes

            //show current number (will throw EOFE because we're at the end of the file):
//            System.out.println("Current number is: "+ raf.readInt());

//            retrieve first number (file pointer to the start of file)
            raf.seek(0);
            System.out.println("The first number is: " + raf.readInt());

            //retrieve 2nd number
            System.out.println("The second number is: " + raf.readInt());

            //retrieve 10th number
            raf.seek(9 * 4);
            System.out.println("The tenth number is: " + raf.readInt());

            //read the next number
            System.out.println("The next number is: " + raf.readInt());

//            modify the tenth number from 9 to -9
            raf.seek(9 * 4);
            raf.writeInt(-9);

            //retrieve the 10th number
            raf.seek(9 * 4);
            System.out.println("The tenth number now is: " + raf.readInt());

            //show current size
            System.out.println("Current size now is: " + raf.length());

            //append a new number
            raf.seek(raf.length());     //move file pointer to the end
            raf.writeInt(500);

            //show size now
            System.out.println("Current size after appending a new number is: " + raf.length());

            //show last number
            raf.seek(raf.length() - 4);     //place pointer before the last 4 bytes
            System.out.println("The last number we appended is: " + raf.readInt());
        }

    }
}
