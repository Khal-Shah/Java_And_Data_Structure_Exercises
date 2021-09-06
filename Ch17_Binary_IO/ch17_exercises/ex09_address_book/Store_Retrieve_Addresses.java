package ch17_exercises.ex09_address_book;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * Chapter 17 (Binary I/O) - Exercise 9:
 * <p>
 * (Address book) Write a program that stores, retrieves, adds, and updates addresses as
 * shown in Figure 17.20. Use a fixed-length string for storing each attribute in the address.
 * Use random-access file for reading and writing an address. Assume the sizes of the
 * name, street, city, state, and zip are 32, 32, 20, 2, and 5 bytes, respectively.
 *
 * @implNote modified to utilize the terminal instead of GUI
 *
 * @author Khaled
 */

public class Store_Retrieve_Addresses
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) throws IOException
    {
        boolean repeat;

        RandomAccessFile file = new RandomAccessFile
                ("Ch17_Binary_IO/ch17_exercises/ex09_address_book/addresses.dat", "rw");
        do
        {
            System.out.print("Enter Name: ");
            String name = kb.nextLine();
            System.out.print("Enter Street: ");
            String street = kb.nextLine();
            System.out.print("Enter City: ");
            String city = kb.nextLine();

            System.out.print("Enter State: ");
            String state = kb.nextLine();
            System.out.print("Enter zip: ");
            String zip = kb.next();

            insertToFile(name, street, city, state, zip, file);

            System.out.print("Do you want to enter more data (type yes or no): ");
            repeat = kb.next().equalsIgnoreCase("yes");

            kb.nextLine();
        } while(repeat);

        file.seek(0);
        displayAddresses(file);
    }

    private static void displayAddresses(RandomAccessFile file) throws IOException
    {
//        file.seek(0);
        int i = 1;
        while(true)
        {
            try
            {
                String val = file.readUTF();
                if(val.equals("\n"))
                {
                    System.out.println("\nAddress " + i++ + ":");
                }
                else
                {
                    System.out.print(val + "\t");
                }
            }
            catch(EOFException e)
            {
                System.out.println("\nEnd of address book.");
                break;
            }
        }
    }

    private static RandomAccessFile insertToFile(String name, String street, String city, String state,
                                                 String zip, RandomAccessFile file) throws IOException
    {
        file.writeUTF("\n");
        file.writeUTF(name);
        file.writeUTF(street);
        file.writeUTF(city);
        file.writeUTF(state);
        file.writeUTF(zip);
        return file;
    }

}
