package ch17_notes.sect_06_object_io;

import org.junit.Test;

import java.io.*;
import java.util.Date;

public class Demo1_TestObjOutStream
{
    @Test
    public void testObjectOutputStream() throws IOException, ClassNotFoundException
    {
        //writing student name, grade and the date to a .dat file
        //ObjectOutputStream works with both primitive and objects

        //File
        FileOutputStream file = new FileOutputStream("Ch17_Binary_IO/ch17_notes/sect_06_object_io/demo1_grades.dat");

        //resources (ObjectOutputStream because the date will be an object)
        try(BufferedOutputStream bufferedOut = new BufferedOutputStream(file);
            ObjectOutputStream objectOut = new ObjectOutputStream(bufferedOut))
        {
            objectOut.writeUTF("Khal");
            objectOut.writeDouble(92.5);
            objectOut.writeObject(new Date());
        }

        //Now read:
        FileInputStream fileIn = new FileInputStream("Ch17_Binary_IO/ch17_notes/sect_06_object_io/demo1_grades.dat");

        try(BufferedInputStream bufferedIn = new BufferedInputStream(fileIn);
            ObjectInputStream objectIn = new ObjectInputStream(bufferedIn))
        {
            String name  = objectIn.readUTF();
            double grade = objectIn.readDouble();
            Date   date  = (Date) objectIn.readObject();
            System.out.println("Name: " + name + "\nGrade: " + grade + "\nDate: " + date);
        }

    }

}
