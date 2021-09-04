package ch17_notes.sect_06_object_io;

import org.junit.Test;

import java.io.*;
import java.util.Arrays;

public class Demo2_TestObjectInputStream
{
    @Test
    public void testObjectStreamArray() throws IOException, ClassNotFoundException
    {
        //Create two arrays
        int[] numbers = {4, 8, 15, 16, 23, 42};
        String[] names = {"Jacob", "Locke", "Danielle"};

        //Fileoutput
        FileOutputStream fileOut = new FileOutputStream
                ("Ch17_Binary_IO/ch17_notes/sect_06_object_io/demo2_array.dat");
        //ObjectOutputStream
        try(ObjectOutputStream objectOut = new ObjectOutputStream(fileOut))
        {
            objectOut.writeObject(numbers);
            objectOut.writeObject(names);
        }

        //Read (FileInputStream)
        FileInputStream fileIn = new FileInputStream
                ("Ch17_Binary_IO/ch17_notes/sect_06_object_io/demo2_array.dat");
        //OjectIn resource
        try(ObjectInputStream objectIn = new ObjectInputStream(fileIn))
        {
//            Way 1:
            System.out.println(Arrays.toString((int[]) objectIn.readObject()));
            System.out.println(Arrays.toString((String[]) objectIn.readObject()));

//          Way 2:
//            List<?> list = Arrays.stream((int[]) objectIn.readObject()).boxed().collect(Collectors.toList());
        }
    }

}
