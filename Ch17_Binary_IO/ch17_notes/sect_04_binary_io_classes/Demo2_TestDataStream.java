package ch17_notes.sect_04_binary_io_classes;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Demo2_TestDataStream
{

    public static void main(String[] args) throws IOException
    {
        //create file (notice we have to use FileOutputStream and not File to be able to use DataOutStream
        FileOutputStream file = new FileOutputStream("/ch17_notes/sect_04_binary_io_classes/grades.dat");

        //data output
        DataOutputStream output = new DataOutputStream(file);
        Map<String, Double> grades = new HashMap<>();
        grades.put("Moe", 82.0);
        grades.put("Annie", 91.5);
        grades.put("Joe", 66.6);
        grades.put("Mark", 78.0);
        grades.put("Lenny", 84.5);

        output.writeUTF("Moe");
        output.writeDouble(grades.get("Moe"));

        output.writeUTF("Annie");
        output.writeDouble(grades.get("Annie"));

        output.writeUTF("Joe");
        output.writeDouble(grades.get("Joe"));

        output.writeUTF("Mark");
        output.writeDouble(grades.get("Mark"));


        //Now read using DataInputStream
        DataInputStream input = new DataInputStream(new FileInputStream("/ch17_notes/sect_04_binary_io_classes/grades.dat"));

       while(true)
       {
           try
           {
               System.out.println(input.readUTF() + ": " + input.readDouble());
           }
           catch(EOFException eofException)
           {
               System.out.println("All data has been read already!");
               break;
           }
       }
    }
}
