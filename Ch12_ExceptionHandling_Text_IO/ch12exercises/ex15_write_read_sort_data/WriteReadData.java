package ch12exercises.ex15_write_read_sort_data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/** Chapter 12 - Exercise 15:
 * (Write/read data) Write a program to create a file named Exercise12_15.txt if it
 * does not exist. Write 100 integers created randomly into the file using text I/O.
 * Integers are separated by spaces in the file. Read the data back from the file and
 * display the data in increasing order.
 *
 * @author khaled Shah
 */

public class WriteReadData
{
    final static String fileName = "Exercise12_15.txt";
    static final int TOTALNUMS = 100;
    static Random random = new Random();

    public static void main(String[] args) throws IOException
    {
        File file = new File("Ch12_ExceptionHandling_Text_IO/ch12exercises/ex15_write_read_sort_data/", fileName);
        ArrayList<Integer> list = new ArrayList<>();

        try
        {
            if (!file.exists())
            {
                file.createNewFile();
                System.out.println("File created.");

                PrintWriter write = new PrintWriter(file);
                //write to file
                for(int i = 0; i < TOTALNUMS; i++)
                {
                    write.print(random.nextInt() + " ");

                    if ((i + 1) % 10 == 0)
                    {
                        write.println();
                    }
                }
                write.close();
            }

            //will be triggered the 2nd time and onwards
            else
            {
                System.out.println("File already exists. End of program");
                System.exit(0);
            }

            //read the file and add it to array:
            try(Scanner read = new Scanner(file))                                  // Create the resource
            {
                while(read.hasNextInt())                                           //while there's still data
                {
                    list.add(read.nextInt());                                    //add to arraylist
                }
            }

        }
        catch (IOException ex)
        {
            System.out.println("IOException detected. Program will terminate.");
            System.exit(0);
        }

        //System.out.println(list.toString());
        //display in increasing order:
        Collections.sort(list);
        sortData(list);
    }

    public static void sortData(ArrayList list) throws FileNotFoundException
    {
        File sortedFile = new File("Ch12_ExceptionHandling_Text_IO/ch12exercises/ex15_write_read_sort_data/Sorted_Data.txt");
        PrintWriter writer = new PrintWriter(sortedFile);
        writer.println("The sorted values are: ");

        for(int i = 0; i < TOTALNUMS;)
        {
            writer.print(list.get(i) + " ");

            if ((i + 1) % 10 == 0)
            {
                writer.println();
            }

            i++;
        }
        writer.close();
    }
}
