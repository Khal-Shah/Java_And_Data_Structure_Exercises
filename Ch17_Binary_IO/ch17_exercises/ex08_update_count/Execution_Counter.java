package ch17_exercises.ex08_update_count;

import java.io.IOException;
import java.io.RandomAccessFile;


/**
 * Chapter 17 (Binary I/O) - Exercise 8:
 * <p>
 * (Update count) Suppose that you wish to track how many times a program has
 * been executed. You can store an int to count the file. Increase the count by 1
 * each time this program is executed. Let the program be Exercise17_08 and
 * store the count in Exercise17_08.dat.
 *
 * @author Khaled
 */

public class Execution_Counter
{

    public static void main(String[] args) throws IOException
    {
        try(RandomAccessFile raf = new RandomAccessFile
                ("Ch17_Binary_IO/ch17_exercises/ex08_update_count/Exercise17_08.dat", "rw"))
        {
            //one int => 4 bytes
            //first time
            int count;
            if(raf.length() < 1)
            {
                count = 1;
            }

            else
            {
                //pointer at the end, bring it back to start
                raf.seek(0);
                //get the int at the first position and increment
                count = (raf.readInt() + 1);
                raf.setLength(0);       //clear out the content of fle
            }

            raf.writeInt(count);

            //pointer at the end, bring it back to the start to get the count
            raf.seek(0);
            System.out.println("This program has been executed " + raf.readInt() + " times.");
        }

    }
}
